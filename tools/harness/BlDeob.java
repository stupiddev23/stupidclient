import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/** Branchlock string/condy deobfuscator for the mio client jar. */
public class BlDeob {
    static final String STR_DESC = "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/String;";
    static Map<Integer, byte[]> table = new HashMap<>();

    public static void main(String[] args) throws Exception {
        Path inDir = Paths.get(args[0]);
        String mode = args[1];               // survey | write
        Path outDir = args.length > 2 ? Paths.get(args[2]) : null;
        Path stringsBin = Paths.get(args.length > 3 ? args[3] : "work/loader/mio/strings.bin");
        loadTable(stringsBin);

        // stats
        Map<String, Integer> condyDescs = new TreeMap<>();
        Map<String, Integer> bsmDescs = new TreeMap<>();
        Map<String, Integer> indySites = new TreeMap<>();
        int classes = 0, withCondy = 0, noKey = 0, decodeFail = 0, totalSites = 0;

        List<Path> files = new ArrayList<>();
        try (var s = Files.walk(inDir)) {
            s.filter(p -> p.toString().endsWith(".class")).forEach(files::add);
        }
        Collections.sort(files);

        for (Path p : files) {
            classes++;
            byte[] bytes = Files.readAllBytes(p);
            ClassNode cn = new ClassNode();
            new ClassReader(bytes).accept(cn, 0);

            int[] key = null;
            Set<String> strBsms = new HashSet<>();
            for (MethodNode m : cn.methods) {
                if (m.desc.equals(STR_DESC)) { strBsms.add(m.name); key = extractKey(m); }
            }
            boolean found = false;
            for (MethodNode m : cn.methods) {
                for (AbstractInsnNode ins : m.instructions) {
                    if (ins.getOpcode() == Opcodes.INVOKEDYNAMIC) {
                        InvokeDynamicInsnNode idn = (InvokeDynamicInsnNode) ins;
                        bsmDescs.merge(idn.bsm.getOwner().equals(cn.name) ? shortDesc(idn.bsm.getDesc()) : "OWNER:" + idn.bsm.getOwner(),
                                1, Integer::sum);
                        indySites.merge(idn.name + idn.desc, 1, Integer::sum);
                    } else if (ins instanceof LdcInsnNode) {
                        Object c = ((LdcInsnNode) ins).cst;
                        if (c instanceof ConstantDynamic) {
                            ConstantDynamic cd = (ConstantDynamic) c;
                            found = true;
                            totalSites++;
                            condyDescs.merge(cd.getDescriptor(), 1, Integer::sum);
                            Handle h = cd.getBootstrapMethod();
                            bsmDescs.merge((h.getOwner().equals(cn.name) ? "" : "FOREIGN:" + h.getOwner() + ".") + shortDesc(h.getDesc()), 1, Integer::sum);
                            if (strBsms.contains(h.getName())) {
                                if (key == null) noKey++;
                                else {
                                    if (mode.equals("write")) {
                                        int k = (Integer) cd.getBootstrapMethodArgument(cd.getBootstrapMethodArgumentCount() - 1);
                                        String s = decrypt(k, key);
                                        if (s == null) decodeFail++;
                                        ((LdcInsnNode) ins).cst = s == null ? "" : s;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (found) withCondy++;
            if (mode.equals("write") && outDir != null) {
                Path rel = inDir.relativize(p);
                Path out = outDir.resolve(rel.toString());
                Files.createDirectories(out.getParent());
                ClassWriter cw = new ClassWriter(0);
                cn.accept(cw);
                Files.write(out, cw.toByteArray());
            }
        }

        System.out.println("classes=" + classes + " withCondy=" + withCondy + " totalCondySites=" + totalSites
                + " noKey=" + noKey + " decodeFail=" + decodeFail);
        System.out.println("--- condy descriptors: " + condyDescs);
        System.out.println("--- bsm descriptors: " + bsmDescs);
        System.out.println("--- indy site count: " + indySites.values().stream().mapToInt(Integer::intValue).sum()
                + " distinct names: " + new TreeSet<>(indySites.keySet()).stream().limit(20).toList());
        System.out.println("--- table entries: " + table.size());
    }

    static String shortDesc(String d) {
        return d.replace("java/lang/invoke/", "").replace("java/lang/String", "Str").replace("java/lang/Class", "Cls")
                .replace("MethodHandles$", "");
    }

    static int[] extractKey(MethodNode m) {
        List<Integer> vals = new ArrayList<>();
        AbstractInsnNode[] arr = m.instructions.toArray();
        for (int i = 0; i < arr.length; i++) {
            Integer v = intValue(arr[i]);
            if (v != null && i + 1 < arr.length && arr[i + 1].getOpcode() == Opcodes.BASTORE) vals.add(v);
        }
        if (vals.isEmpty()) return new int[0];
        int[] out = new int[vals.size()];
        for (int i = 0; i < out.length; i++) out[i] = vals.get(i);
        return out;
    }

    static Integer intValue(AbstractInsnNode n) {
        if (n instanceof IntInsnNode) {
            int op = n.getOpcode();
            if (op == Opcodes.BIPUSH || op == Opcodes.SIPUSH) return ((IntInsnNode) n).operand;
        }
        if (n instanceof InsnNode) {
            int op = n.getOpcode();
            if (op >= Opcodes.ICONST_M1 && op <= Opcodes.ICONST_5) return op - Opcodes.ICONST_0;
        }
        if (n instanceof LdcInsnNode && ((LdcInsnNode) n).cst instanceof Integer)
            return (Integer) ((LdcInsnNode) n).cst;
        return null;
    }

    static String decrypt(int key, int[] keyArr) {
        byte[] raw = table.get(key);
        if (raw == null || keyArr.length == 0) return null;
        byte[] d = new byte[raw.length];
        for (int i = 0; i < raw.length; i++) d[i] = (byte) (raw[i] ^ keyArr[i % keyArr.length]);
        return new String(d, StandardCharsets.UTF_8);
    }

    static void loadTable(Path p) throws IOException {
        DataInputStream dis = new DataInputStream(new BufferedInputStream(Files.newInputStream(p)));
        while (true) {
            int key;
            try { key = dis.readInt(); } catch (EOFException e) { break; }
            int len = dis.readInt();
            byte[] data = new byte[len];
            dis.readFully(data);
            table.put(key, data);
        }
    }
}
