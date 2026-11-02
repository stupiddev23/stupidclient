package p;

import java.io.*;
import java.lang.reflect.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;

/**
 * Loads each obfuscated class, lets its <clinit> fill the member table, and
 * dumps that table. Uses Unsafe so a partially-failed <clinit> is still usable.
 */
public class DumpTables {
    static int dbg = 0;
    static final boolean DBG = Boolean.getBoolean("dbg");
    static List<String> errMsgs = new java.util.ArrayList<>();
    static sun.misc.Unsafe U;

    public static void main(String[] args) throws Exception {
        Path inDir = Paths.get(args[0]);
        Path out = Paths.get(args[1]);
        List<URL> urls = new ArrayList<>();
        for (int i = 2; i < args.length; i++) urls.add(Paths.get(args[i]).toUri().toURL());
        Field uf = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        uf.setAccessible(true);
        U = (sun.misc.Unsafe) uf.get(null);

        List<Path> files = new ArrayList<>();
        try (var s = Files.walk(inDir)) {
            s.filter(p -> p.toString().endsWith(".class")).forEach(files::add);
        }
        Collections.sort(files);
        PrintWriter pw = new PrintWriter(Files.newBufferedWriter(out));
        int ok = 0, fail = 0, initFail = 0;
        Map<String, Integer> errs = new TreeMap<>();
        for (Path p : files) {
            String rel = inDir.relativize(p).toString().replace(File.separatorChar, '/');
            String name = rel.substring(0, rel.length() - 6).replace('/', '.');
            ClassLoader child = new URLClassLoader(urls.toArray(new URL[0]), ClassLoader.getPlatformClassLoader());
            try {
                Class<?> k = Class.forName(name, false, child);
                List<Field> tableFields = new ArrayList<>();
                for (Field f : k.getDeclaredFields()) {
                    if (Modifier.isStatic(f.getModifiers())
                            && (f.getType() == String[].class || f.getType() == Object[].class)) tableFields.add(f);
                }
                String warn = "";
                List<String> ignored = null;
                try {
                    U.ensureClassInitialized(k);
                } catch (Throwable t) {
                    initFail++;
                    if (DBG && dbg < 6) { dbg++; System.out.println("### " + name); t.printStackTrace(); }
                    Throwable c = t;
                    while (c.getCause() != null) c = c.getCause();
                    warn = String.valueOf(c.getMessage());
                    errMsgs.add(String.valueOf(c.getMessage()));
                }
                boolean any = false;
                StringBuilder sb = new StringBuilder(name);
                for (Field f : tableFields) {
                    Object arr = U.getObject(U.staticFieldBase(f), U.staticFieldOffset(f));
                    if (arr == null) continue;
                    int len = java.lang.reflect.Array.getLength(arr);
                    sb.append('\t').append(f.getName()).append(':').append(len).append(':');
                    for (int i = 0; i < len; i++) {
                        if (i > 0) sb.append("\u0002");
                        Object v = java.lang.reflect.Array.get(arr, i);
                        sb.append(v == null ? "\u0000" : v.toString().replace("\t", "\\t").replace("\n", "\\n")
                                .replace("\u0001", "\\u1").replace("\u0002", "\\u2"));
                    }
                    any = true;
                }
                if (!any) {
                    pw.println(name + "\tNOTABLE	" + warn);
                    fail++;
                    errs.merge("NOTABLE " + warn, 1, Integer::sum);
                    continue;
                }
                pw.println(sb);
                ok++;
            } catch (Throwable t) {
                Throwable c = t;
                while (c.getCause() != null) c = c.getCause();
                String key = c.getClass().getSimpleName() + ": " + String.valueOf(c.getMessage());
                if (key.length() > 80) key = key.substring(0, 80);
                errs.merge(key, 1, Integer::sum);
                pw.println(name + "\tERR\t" + key);
                fail++;
            }
        }
        pw.close();
        try (PrintWriter ep = new PrintWriter(Files.newBufferedWriter(Paths.get(out.toString() + ".errs")))) {
            for (String m : errMsgs) ep.println(m);
        }
        System.out.println("ok=" + ok + " fail=" + fail + " initFailedButDumped=" + initFail);
        errs.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(12)
                .forEach(e -> System.out.println(e.getValue() + "  " + e.getKey()));
    }
}
