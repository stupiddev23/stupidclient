/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_243;

final class m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1
extends m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public static final String a;
    public static final Object[] d;
    public static final String[] e;

    public m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1(String string2) {
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n;
            char[] cArray2;
            int n2;
            int n3;
            block11: {
                d = new Object[12];
                e = new String[12];
                m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b();
                char[] cArray3 = "D\r65\u0005gK0\u0017O*\u000bs\u0003-Q:0ql\r9\u0019'v".toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 113;
                cArray2 = cArray3;
                n = n4;
                if (n4 <= 1) break block11;
                cArray = cArray2;
                n = n;
                if (n <= n3) break block12;
            }
            do {
                int n5 = n2;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n6 = n2;
                int n7 = n3;
                while (true) {
                    cArray4[n7] = (char)(cArray4[n7] ^ (n6 ^ (switch (n3 % 7) {
                        case 0 -> 109;
                        case 1 -> 70;
                        case 2 -> 103;
                        case 3 -> 97;
                        case 4 -> 90;
                        case 5 -> 39;
                        default -> 92;
                    })));
                    ++n3;
                    n2 = n5;
                    if (n5 != 0) break;
                    n5 = n2;
                    cArray2 = cArray2;
                    n7 = n2;
                    cArray4 = cArray2;
                    n6 = n2;
                }
                cArray = cArray2;
                n = n;
            } while (n > n3);
        }
        a = new String(cArray).intern();
    }

    public static int e(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (e[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 7;
            case 1 -> 1;
            case 2 -> 3;
            case 3 -> 49;
            case 4 -> 13;
            case 5 -> 57;
            case 6 -> 30;
            case 7 -> 50;
            case 8 -> 10;
            case 9 -> 21;
            case 10 -> 18;
            case 11 -> 55;
            case 12 -> 54;
            case 13 -> 24;
            case 14 -> 11;
            case 15 -> 4;
            case 16 -> 36;
            case 17 -> 42;
            case 18 -> 62;
            case 19 -> 46;
            case 20 -> 2;
            case 21 -> 52;
            case 22 -> 0;
            case 23 -> 8;
            case 24 -> 14;
            case 25 -> 15;
            case 26 -> 44;
            case 27 -> 12;
            case 28 -> 35;
            case 29 -> 19;
            case 30 -> 23;
            case 31 -> 39;
            case 32 -> 31;
            case 33 -> 25;
            case 34 -> 63;
            case 35 -> 40;
            case 36 -> 16;
            case 37 -> 41;
            case 38 -> 48;
            case 39 -> 53;
            case 40 -> 38;
            case 41 -> 9;
            case 42 -> 26;
            case 43 -> 51;
            case 44 -> 29;
            case 45 -> 34;
            case 46 -> 61;
            case 47 -> 6;
            case 48 -> 43;
            case 49 -> 45;
            case 50 -> 17;
            case 51 -> 20;
            case 52 -> 33;
            case 53 -> 37;
            case 54 -> 5;
            case 55 -> 32;
            case 56 -> 58;
            case 57 -> 28;
            case 58 -> 59;
            case 59 -> 56;
            case 60 -> 47;
            case 61 -> 60;
            case 62 -> 22;
            default -> 27;
        };
        int[] nArray = new int[6];
        int n5 = 0;
        while (n5 < 6) {
            n2 = 7 * (5 - n5);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n4) < 0) {
                n += 128;
            }
            nArray[n5] = n;
            ++n5;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f8' || c == '\u00c4' || c == 'n' || c == '\u00ef') {
                field = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ed' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void b() {
        Object[] objectArray = d;
        d[0] = "-t29l\u0018-t%e`\u00177?%{`\u00020Nt#2";
        objectArray[1] = Double.TYPE;
        m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e[1] = "java/lang/Double";
        objectArray[2] = "\u00191GqE\u0015\u0012>V>8\r\u00019_w";
        objectArray[3] = "*}c17\u001d4uy~U\u0007#}y5";
        objectArray[4] = "?\txc&#J)sl7l+'xg36_";
        objectArray[5] = "f\u0015&ttqm\u001a7;\u001ery\u0016<p";
        objectArray[6] = "\u00048P\u0001*\n\u000f7ANK\u0004\u0004<E\u0014";
        objectArray[7] = "!Q\u0012\t<F%T)\r*\u0005>TE?~Ad\n\u0014h~@0NS\u0001>\u001c3\u0003)";
        objectArray[8] = "\fkD\b[g\bn\u007f\fM$\u0013n\u0013>\u0019`I0Ci\u0019a\u001dt\u0005\u0000Y=\u001e9\u007f";
        objectArray[9] = "\u001bT\u0007\f\u0007&_VYNc-ER\u0004U\u001fC\u0018R\u000bA\u0006|NOXBcz^NQX\u0006>\\\u0010\u0013<Y?\u0019\u0012_\u0003\u0004*^La\u0005\u001f%\u0012L\u0004A\u001d{P(";
        objectArray[10] = "\u0015}Q~\u0001V\u001fi\u0011}\u007fWGcRl8G.>\u0016o\u0002SG~JlO)\u0015}Q~\u0001V\u001fi\u0011}\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "J4~Fx.N1EBnmU1)p:)\u000fo{':([+?NztXfE";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    public static Method h(long l) {
        int n = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
        Object object = d[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string2.substring(0, n3), 36));
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(432561401094565L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(432561401094565L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    public static Class f(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz3, string2, clazz2)) != null) {
                    m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(432561401094565L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public String m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc(class_243 class_2432) {
        return m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00f6", (Object)Locale.US, (Object)a, (Object)new Object[]{m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00f6", (double)m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00ed", (Object)class_2432, (long)799414718634046L), (long)741497543315143L), m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00f6", (double)m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00ed", (Object)class_2432, (long)580820785666781L), (long)741497543315143L), m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00f6", (double)m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00ed", (Object)class_2432, (long)528346935362731L), (long)741497543315143L)}, (long)658561356664831L);
    }

    public static String m$$2KLzANEpbVyUGqNzRlqFojQeYjT9DUsEpgs9s9XxOgKDcDAXeTFdxCbDGbhQx447unPU4e1J3DdJ8n6V3mAr6ulI2gu8E7jHd(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{36, 10, -55, 103, 106, 92, 45, -122, -105, 108, 83, 93, 89, 54, 41};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 15]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

