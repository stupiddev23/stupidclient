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
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_243;

final class m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2
extends m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public static final String a;
    public static final Object[] d;
    public static final String[] e;

    public m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2(String string2) {
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
                m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b();
                char[] cArray3 = "<=+\u001a\f".toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 67;
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
                        case 0 -> 90;
                        case 1 -> 80;
                        case 2 -> 89;
                        case 3 -> 63;
                        case 4 -> 34;
                        case 5 -> 107;
                        default -> 4;
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
            case 0 -> 62;
            case 1 -> 28;
            case 2 -> 39;
            case 3 -> 9;
            case 4 -> 17;
            case 5 -> 45;
            case 6 -> 43;
            case 7 -> 54;
            case 8 -> 57;
            case 9 -> 46;
            case 10 -> 22;
            case 11 -> 26;
            case 12 -> 38;
            case 13 -> 23;
            case 14 -> 58;
            case 15 -> 32;
            case 16 -> 5;
            case 17 -> 55;
            case 18 -> 14;
            case 19 -> 20;
            case 20 -> 1;
            case 21 -> 61;
            case 22 -> 18;
            case 23 -> 8;
            case 24 -> 53;
            case 25 -> 59;
            case 26 -> 15;
            case 27 -> 25;
            case 28 -> 34;
            case 29 -> 13;
            case 30 -> 30;
            case 31 -> 49;
            case 32 -> 44;
            case 33 -> 27;
            case 34 -> 29;
            case 35 -> 16;
            case 36 -> 12;
            case 37 -> 50;
            case 38 -> 31;
            case 39 -> 51;
            case 40 -> 40;
            case 41 -> 7;
            case 42 -> 52;
            case 43 -> 10;
            case 44 -> 37;
            case 45 -> 3;
            case 46 -> 4;
            case 47 -> 24;
            case 48 -> 48;
            case 49 -> 47;
            case 50 -> 6;
            case 51 -> 60;
            case 52 -> 35;
            case 53 -> 19;
            case 54 -> 36;
            case 55 -> 63;
            case 56 -> 41;
            case 57 -> 21;
            case 58 -> 2;
            case 59 -> 0;
            case 60 -> 11;
            case 61 -> 56;
            case 62 -> 33;
            default -> 42;
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
        m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f5' || c == '\u00e2' || c == 'c' || c == '\u00e7') {
                field = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'w' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        d[0] = "DXBp3DOWS?N\\\\PZv";
        objectArray[1] = "\"n\u0005\u0013\nKWN\u000e\u001c\u001b\u00046@\u0005\u0017\u001f^B";
        objectArray[2] = "}zG\u000bR\u0016}zPW^\u0019g1PI^\f`@\u0001\u0011\f";
        objectArray[3] = Double.TYPE;
        m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e[3] = "java/lang/Double";
        objectArray[4] = "\u001d\u0017]WVr\u001d\u0017J\u000bZ}\u0007\\J\u0015Zh\u0000-\u001eM\r";
        objectArray[5] = "\u000eE9Y\u0018c\u0005J(\u0016r`\u0011F#]";
        objectArray[6] = "x~\u00149Aosq\u0005v axz\u0001,";
        objectArray[7] = "\u0004NE\u0015\u00156^[\u0001\u0013u0RY\u0018\r\u0019\u0002\u0006\u0014EQEU\u0006@\u001aQ\u001fk\u0006]\u0014\u0006u";
        objectArray[8] = "fH\t\u0017F~pO\u0001l\u0011\u007f{F\u000b\u0010\u007f\u007fjH\u0019U\u0019im@bUNqm\u0013S\u0010F)s#\u0005\u0007\u0014c8E\u0013\u0000\u001c\u0018";
        objectArray[9] = "RCI{DHDDA\u0000\u0007CMLKk\u0010gQL\"g\u0016EN\u0011Dq\u0011M5OIk\u0006\u0017SYNc}I^CY9\u001b_YK\"";
        objectArray[10] = "}T\r>n\u001c9\u001b\u0000m\u0000\u001e/B\u0011lG\u000eF\u001c\t`?\u0019zHR0g`}T\r>n\u001c9\u001b\u0000m\u0000";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "(@X\u0016Ci(]VA)2|YZJE\u0000(\u001d\u0000\u0017)ntG\u0001G\u0017niIV-\u00132p\u001aC\u0011Gi B:";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
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
                clazz3 = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(468620438344119L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(468620438344119L);
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
            int n = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz3, string2, clazz2)) != null) {
                    m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(468620438344119L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public String m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc(class_243 class_2432) {
        return m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("w", (Object)m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("\u00cb", a, (Object)new Object[]{m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("\u00cb", (double)m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("w", (Object)class_2432, (Object)m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("w", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)527451074092572L), (long)837642815119616L), (long)768091231569516L)}, (long)604446099018430L), (Object)",", (Object)".", (long)649310065067194L);
    }

    public static String m$$kO3RhGmtZYtNiwO3x9BTu5p19Fkif0ARurgZ7bWnXYpQxdFhAeYtiWZFab4CCpYn3yeZbT1pMdfon2OT9HiqzEE5LqiDObHaq(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{100, -88, -87, -84, -36, 78, 58, 119, 99, 10, -32, -41, -113};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 13]);
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
            return MethodHandles.lookup().findStatic(m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

