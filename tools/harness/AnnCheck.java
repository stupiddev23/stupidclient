// Parse every class in a jar the way Mixin does, and report the ones ASM rejects.
//
// Mixin reads each mixin with ClassReader.accept(); a malformed annotation
// attribute that our own byte-level tools are happy with (they only store
// offsets) blows up there with an index error instead.  This runs the real
// reader so that failure surfaces here rather than in a game launch.
//
// It has to read through ClassNode, not an empty ClassVisitor: a null
// AnnotationVisitor lets ASM skip element values, so corrupt indices pass.
// ClassNode builds AnnotationNode for every value, exactly like Mixin.
//
//   javac -cp asm.jar:asm-tree.jar -d out AnnCheck.java
//   java -cp asm.jar:asm-tree.jar:out AnnCheck <jar> [more jars...]

import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

public final class AnnCheck {
    public static void main(String[] args) throws Exception {
        int total = 0;
        int bad = 0;
        for (String path : args) {
            try (ZipFile zip = new ZipFile(path)) {
                Enumeration<? extends ZipEntry> entries = zip.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry entry = entries.nextElement();
                    if (!entry.getName().endsWith(".class")) {
                        continue;
                    }
                    total++;
                    byte[] bytes = zip.getInputStream(entry).readAllBytes();
                    try {
                        new ClassReader(bytes).accept(new ClassNode(), 0);
                    } catch (Throwable problem) {
                        bad++;
                        if (bad <= 20) {
                            System.out.println("FAIL " + path + "!" + entry.getName()
                                    + " : " + problem);
                        }
                    }
                }
            }
        }
        System.out.println("classes " + total + ", rejected " + bad);
        if (bad != 0) {
            System.exit(1);
        }
    }
}
