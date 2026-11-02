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
import net.minecraft.class_10017;
import net.minecraft.class_1297;

public interface m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT {
    public static final Object[] a = new Object[6];
    public static final String[] b = new String[6];

    public void mio$setEntity(class_1297 var1);

    public class_1297 mio$getEntity();

    static {
        m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a();
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a(clazz3, string2, clazz2)) != null) {
                    m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.b(232119890193922L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a(l);
        Object object = a[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = b[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.b(232119890193922L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.b(232119890193922L);
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

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'W' || c == '\u00cc' || c == '\u00db' || c == 'C') {
                field = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'W' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'n' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static int a(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (b[n3] != null) {
            return n3;
        }
        Object object = a[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 27;
            case 1 -> 51;
            case 2 -> 5;
            case 3 -> 18;
            case 4 -> 12;
            case 5 -> 58;
            case 6 -> 53;
            case 7 -> 24;
            case 8 -> 1;
            case 9 -> 19;
            case 10 -> 3;
            case 11 -> 2;
            case 12 -> 59;
            case 13 -> 49;
            case 14 -> 32;
            case 15 -> 26;
            case 16 -> 16;
            case 17 -> 39;
            case 18 -> 4;
            case 19 -> 45;
            case 20 -> 20;
            case 21 -> 34;
            case 22 -> 21;
            case 23 -> 6;
            case 24 -> 30;
            case 25 -> 37;
            case 26 -> 14;
            case 27 -> 9;
            case 28 -> 41;
            case 29 -> 47;
            case 30 -> 38;
            case 31 -> 60;
            case 32 -> 57;
            case 33 -> 63;
            case 34 -> 52;
            case 35 -> 31;
            case 36 -> 56;
            case 37 -> 40;
            case 38 -> 11;
            case 39 -> 44;
            case 40 -> 48;
            case 41 -> 25;
            case 42 -> 7;
            case 43 -> 23;
            case 44 -> 42;
            case 45 -> 62;
            case 46 -> 0;
            case 47 -> 54;
            case 48 -> 22;
            case 49 -> 17;
            case 50 -> 43;
            case 51 -> 29;
            case 52 -> 46;
            case 53 -> 35;
            case 54 -> 61;
            case 55 -> 50;
            case 56 -> 10;
            case 57 -> 28;
            case 58 -> 33;
            case 59 -> 13;
            case 60 -> 8;
            case 61 -> 55;
            case 62 -> 15;
            default -> 36;
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
        m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.b[n3] = new String(cArray);
        return n3;
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "\u007f~2;+>qwu3,%<v8r\u0004`K+U\u001a\u000b>bW/\u0015.d[Kl/'\u0003jm)/4dWTqe\u000ei'xL\u0002\u0012\u001ewXt<:\u0010'aN\u000029hRkb&9aiw\u0018%2_lF9\f\u0016\u007fVU\u0007'hxN[\u000f&\u001fS#J=1\u0000Ho-/\u000b(}()\u0007\u0016";
        objectArray[1] = "u=(\t^3u=?UR<ov?KR)h\u0007m\u0015\nm";
        objectArray[2] = Void.TYPE;
        m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.b[2] = "java/lang/Void";
        objectArray[3] = "_z8Y\u00008Tu)\u0016a6_~-L";
        objectArray[4] = "\u001b[y\\gy\u0017\u001a9mod\u0015G+\u0000vH\u0014\u0017%\u0011{\u0005\u0003\u0014x\u0017{}\u0011\u0019\u007fm";
        Object[] objectArray2 = objectArray;
        objectArray[5] = "C\u0007\u0011J\u000b\"OFQ{\u0003?M\u001bW\u0016\u001a\u0013LKM\u0007\u0017^[H\u0010\u0001\u0017&IE\u0017{_;\u0014Q@\n\u0014a\u0014\u0007,";
    }

    public static class_1297 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_10017 class_100172) {
        return m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a("\u00ba", (Object)((m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT)class_100172), (long)320912603316622L);
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_10017 class_100172, class_1297 class_12972) {
        m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.a("\u00ba", (Object)((m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT)class_100172), (Object)class_12972, (long)380144453812715L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

