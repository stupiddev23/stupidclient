import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Resolves Branchlock invokedynamic member-access sites into direct member
 * accesses, using the per-class member tables recovered by DumpTables.
 *
 * A site is only rewritten when the resolved owner/name/descriptor exactly match
 * the call site (parameter types except the trailing key, and the return type),
 * so every rewrite is self-validating and unresolved sites are left untouched.
 */
public class BlIndy {
    static final String BSM_DESC = "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;";
    static final int GETFIELD = 180, PUTFIELD = 181, GETSTATIC = 178, PUTSTATIC = 179;
    static final int INVOKEVIRTUAL = 182, INVOKESPECIAL = 183, INVOKESTATIC = 184;
    static Map<String, String[]> tables = new HashMap<>();
    static Set<String> interfaces = new HashSet<>();

    public static void main(String[] args) throws Exception {
        String mode = args[0];                    // measure | write
        Path inDir = Paths.get(args[1]);
        Path outDir = args.length > 2 ? Paths.get(args[2]) : null;
        Path tableFile = Paths.get(args.length > 3 ? args[3] : "harness/tables/all.tsv");
        loadTables(tableFile);
        indexInterfaces(inDir);

        int sites = 0, constKey = 0, resolved = 0, matched = 0, fields = 0, methods = 0;
        Map<String, Integer> skipped = new TreeMap<>();
        List<Path> files = new ArrayList<>();
        try (var s = Files.walk(inDir)) {
            s.filter(p -> p.toString().endsWith(".class")).forEach(files::add);
        }
        Collections.sort(files);

        for (Path p : files) {
            String rel = inDir.relativize(p).toString().replace(File.separatorChar, '/');
            String simple = rel.substring(rel.lastIndexOf('/') + 1, rel.length() - 6);
            String[] table = tables.get(simple);
            ClassNode cn = new ClassNode();
            new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
            boolean custom = false;
            for (MethodNode m : cn.methods) if (m.desc.equals(BSM_DESC)) custom = true;
            if (!custom) continue;
            boolean changed = false;
            for (MethodNode m : cn.methods) {
                for (AbstractInsnNode ins : m.instructions.toArray()) {
                    if (!(ins instanceof InvokeDynamicInsnNode)) continue;
                    InvokeDynamicInsnNode idn = (InvokeDynamicInsnNode) ins;
                    if (!idn.bsm.getOwner().equals(cn.name) || !idn.bsm.getDesc().equals(BSM_DESC)) continue;
                    sites++;
                    AbstractInsnNode prev = ins.getPrevious();
                    if (table == null) { skipped.merge("no-table", 1, Integer::sum); continue; }
                    if (!(prev instanceof LdcInsnNode) || !(((LdcInsnNode) prev).cst instanceof Long)) {
                        skipped.merge("computed-key", 1, Integer::sum);
                        continue;
                    }
                    constKey++;
                    long key = (Long) ((LdcInsnNode) prev).cst;
                    int slot = (int) (key >>> 46);
                    if (slot < 0 || slot >= table.length || table[slot] == null || table[slot].indexOf('\u0008') < 0) {
                        skipped.merge("slot-missing", 1, Integer::sum);
                        continue;
                    }
                    String[] parts = table[slot].split("\u0008", -1);
                    if (parts.length < 3) { skipped.merge("short-entry", 1, Integer::sum); continue; }
                    char c = idn.name.charAt(0);
                    Type[] args0 = Type.getArgumentTypes(idn.desc);
                    if (args0.length < 1) { skipped.merge("no-key-arg", 1, Integer::sum); continue; }
                    Type[] targs = Arrays.copyOf(args0, args0.length - 1);
                    Type ret = Type.getReturnType(idn.desc);
                    String owner = resolveClass(table, parts[0]);
                    if (owner == null) { skipped.merge("owner-unresolved", 1, Integer::sum); continue; }
                    resolved++;

                    InsnList repl = new InsnList();
                    boolean ok = false;
                    if (c == 200 || c == 79 || c == 225 || c == 119) {         // field access
                        if (parts.length != 3) { skipped.merge("field-arity", 1, Integer::sum); continue; }
                        String ftype = resolveClass(table, parts[2]);
                        if (ftype == null || !Type.getType("L" + ftype + ";").equals(ret)) {
                            skipped.merge("field-type-mismatch", 1, Integer::sum);
                            continue;
                        }
                        int op = c == 200 ? GETFIELD : c == 79 ? PUTFIELD : c == 225 ? GETSTATIC : PUTSTATIC;
                        repl.add(new FieldInsnNode(op, owner, parts[1], ret.getDescriptor()));
                        fields++;
                        ok = true;
                    } else {                                                    // method call
                        if (c != 'o' && c != '$') { skipped.merge("special-or-unknown", 1, Integer::sum); continue; }
                        int nparams = parts.length - 3;
                        if (nparams != targs.length) { skipped.merge("param-arity", 1, Integer::sum); continue; }
                        Type[] resolvedArgs = new Type[nparams];
                        boolean bad = false;
                        for (int i = 0; i < nparams; i++) {
                            String tn = resolveClass(table, parts[2 + i]);
                            if (tn == null) { bad = true; break; }
                            resolvedArgs[i] = Type.getType("L" + tn + ";");
                            if (!resolvedArgs[i].equals(targs[i])) { bad = true; break; }
                        }
                        String rn = resolveClass(table, parts[2 + nparams]);
                        if (bad || rn == null || !Type.getType("L" + rn + ";").equals(ret)) {
                            skipped.merge("method-signature-mismatch", 1, Integer::sum);
                            continue;
                        }
                        if (parts[1].equals(owner.substring(owner.lastIndexOf('.') + 1))) {
                            skipped.merge("constructor", 1, Integer::sum);
                            continue;
                        }
                        int op = c == 'o' ? INVOKESTATIC : INVOKEVIRTUAL;
                        repl.add(new MethodInsnNode(op, owner, parts[1],
                                Type.getMethodDescriptor(ret, resolvedArgs), interfaces.contains(owner)));
                        methods++;
                        ok = true;
                    }
                    if (!ok) continue;
                    matched++;
                    if (mode.equals("write")) {
                        m.instructions.insertBefore(ins, repl);
                        m.instructions.remove(ins);
                        m.instructions.remove(prev);
                        changed = true;
                    }
                }
            }
            if (mode.equals("write") && outDir != null && changed) {
                Path out = outDir.resolve(rel);
                Files.createDirectories(out.getParent());
                ClassWriter cw = new ClassWriter(0);
                cn.accept(cw);
                Files.write(out, cw.toByteArray());
            }
        }
        System.out.println("sites=" + sites + " constKey=" + constKey + " resolved=" + resolved
                + " REWRITTEN=" + matched + " (fields=" + fields + " methods=" + methods + ")");
        System.out.println("skipped: " + skipped);
    }

    /** base36 member key -> class name, via the class's own table (matches b(long)). */
    static String resolveClass(String[] table, String base36) {
        try {
            long k = Long.parseLong(base36, 36);
            int slot = (int) (k >>> 46);
            if (slot < 0 || slot >= table.length) return null;
            String v = table[slot];
            if (v == null || v.indexOf('\u0008') >= 0) return null;
            return v.replace('/', '.');
        } catch (NumberFormatException e) {
            return null;
        }
    }

    static void indexInterfaces(Path inDir) throws IOException {
        try (var s = Files.walk(inDir)) {
            for (Path p : (Iterable<Path>) s.filter(x -> x.toString().endsWith(".class"))::iterator) {
                byte[] b = Files.readAllBytes(p);
                ClassReader cr = new ClassReader(b);
                String nm = cr.getClassName().replace('/', '.');
                if ((cr.getAccess() & Opcodes.ACC_INTERFACE) != 0) interfaces.add(nm);
            }
        }
    }

    static void loadTables(Path p) throws IOException {
        for (String line : Files.readAllLines(p)) {
            String[] cols = line.split("\t", -1);
            if (cols.length < 3 || cols[1].equals("ERR") || cols[1].equals("NOTABLE")) continue;
            String simple = cols[0].substring(cols[0].lastIndexOf('.') + 1);
            String[] best = null;
            for (int i = 2; i < cols.length; i++) {
                String[] bits = cols[i].split(":", 3);
                if (bits.length < 3) continue;
                String[] entries = bits[2].split("\u0002", -1);
                if (best == null || entries.length > best.length) best = entries;
            }
            if (best != null) tables.put(simple, best);
        }
    }
}
