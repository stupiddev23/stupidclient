package p;

import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.lang.reflect.*;
import java.nio.file.*;
import java.util.*;

public class Dump {
    static List<String[]> sites = new ArrayList<>();
    static List<int[]> siteKeys = new ArrayList<>();

    public static void main(String[] a) throws Exception {
        byte[] bytes = Files.readAllBytes(Paths.get(a[0]));
        ClassReader cr = new ClassReader(bytes);
        // collect condy sites
        final List<String[]> found = new ArrayList<>();
        cr.accept(new ClassVisitor(Opcodes.ASM9) {
            public MethodVisitor visitMethod(int acc, String name, String desc, String sig, String[] ex) {
                return new MethodVisitor(Opcodes.ASM9) {
                    public void visitLdcInsn(Object cst) {
                        if (cst instanceof ConstantDynamic) {
                            ConstantDynamic cd = (ConstantDynamic) cst;
                            StringBuilder sb = new StringBuilder();
                            for (int i = 0; i < cd.getBootstrapMethodArgumentCount(); i++)
                                sb.append(cd.getBootstrapMethodArgument(i)).append(",");
                            found.add(new String[]{cd.getName(), cd.getDescriptor(), sb.toString(),
                                    cd.getBootstrapMethod().getOwner() + "." + cd.getBootstrapMethod().getName() + cd.getBootstrapMethod().getDesc()});
                        }
                    }
                };
            }
        }, 0);
        // strip: keep only the string-BSM method
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);
        String bsmOwner = null, bsmName = null, bsmDesc = null;
        List<MethodNode> keep = new ArrayList<>();
        for (MethodNode m : cn.methods) {
            if (m.desc.equals("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/String;")) {
                keep.add(m); bsmName = m.name; bsmDesc = m.desc;
            }
        }
        if (keep.isEmpty()) { System.out.println("NO-BSM"); return; }
        ClassNode out = new ClassNode();
        out.version = Opcodes.V17;
        out.access = Opcodes.ACC_PUBLIC;
        out.name = cn.name + "$Dump";
        out.superName = "java/lang/Object";
        out.methods = keep;
        ClassWriter cw = new ClassWriter(0);
        out.accept(cw);
        String simple = Paths.get(a[0]).getFileName().toString().replace(".class", "");
        Path tmp = Paths.get(a[1], "me/mioclient");
        Files.createDirectories(tmp);
        Files.write(tmp.resolve(simple + "$Dump.class"), cw.toByteArray());
        ClassLoader cl = new java.net.URLClassLoader(new java.net.URL[]{Paths.get(a[1]).toUri().toURL()},
                Dump.class.getClassLoader());
        Class<?> k = Class.forName((cn.name + "$Dump").replace('/', '.'), false, cl);
        Method mm = k.getMethod(bsmName, java.lang.invoke.MethodHandles.Lookup.class, String.class, Class.class, int.class);
        for (String[] s : found) {
            int key = Integer.parseInt(s[2].replace(",", ""));
            Object r;
            try { r = mm.invoke(null, null, s[0], String.class, key); }
            catch (Throwable t) { r = "EX:" + t.getCause(); }
            System.out.println(key + "\t" + s[1] + "\t" + String.valueOf(r).replace("\n", "\\n"));
        }
    }
}
