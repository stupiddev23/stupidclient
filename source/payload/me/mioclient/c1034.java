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
import java.util.Collection;
import me.mioclient.m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1;
import net.minecraft.class_151;

final class m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2
extends m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1 {
    public static final Object[] c = new Object[5];
    public static final String[] d = new String[5];

    public m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2(String string2) {
    }

    static {
        m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.b();
    }

    public static int e(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 16;
            case 1 -> 59;
            case 2 -> 46;
            case 3 -> 13;
            case 4 -> 32;
            case 5 -> 38;
            case 6 -> 35;
            case 7 -> 49;
            case 8 -> 1;
            case 9 -> 10;
            case 10 -> 15;
            case 11 -> 29;
            case 12 -> 42;
            case 13 -> 36;
            case 14 -> 18;
            case 15 -> 60;
            case 16 -> 39;
            case 17 -> 11;
            case 18 -> 34;
            case 19 -> 12;
            case 20 -> 37;
            case 21 -> 54;
            case 22 -> 21;
            case 23 -> 48;
            case 24 -> 30;
            case 25 -> 25;
            case 26 -> 53;
            case 27 -> 2;
            case 28 -> 52;
            case 29 -> 24;
            case 30 -> 51;
            case 31 -> 26;
            case 32 -> 3;
            case 33 -> 40;
            case 34 -> 63;
            case 35 -> 20;
            case 36 -> 33;
            case 37 -> 31;
            case 38 -> 22;
            case 39 -> 9;
            case 40 -> 23;
            case 41 -> 6;
            case 42 -> 57;
            case 43 -> 27;
            case 44 -> 0;
            case 45 -> 7;
            case 46 -> 62;
            case 47 -> 28;
            case 48 -> 50;
            case 49 -> 45;
            case 50 -> 58;
            case 51 -> 19;
            case 52 -> 47;
            case 53 -> 43;
            case 54 -> 61;
            case 55 -> 14;
            case 56 -> 56;
            case 57 -> 5;
            case 58 -> 17;
            case 59 -> 55;
            case 60 -> 44;
            case 61 -> 41;
            case 62 -> 8;
            default -> 4;
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
        m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.d[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Z' || c == '\u00dc' || c == 'O' || c == '\u00c9') {
                field = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'c' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = c;
        c[0] = "~0\bnk\u0007p9Ofl\u001c=8\u0002'k\u001d}1c:X-\\m_iw'Jd|jt x$EBq]A\u0014A3u>\u007f9MUc\\R\u001abm{.b3bHo\\zaG1u'x\u0013rnd+ednuJ!#\u001cwD`\u0019X\u001dr;f<\"#\u007fJz\u000bD3a`0%FmLh3";
        objectArray[1] = "eW\b]E9nX\u0019\u0012$7eS\u001dH";
        objectArray[2] = "\u001f\u0007?*\u0013<\u0001\u000f%e~&\u0019\n,(I \u001a\b";
        objectArray[3] = Boolean.TYPE;
        m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.d[3] = "java/lang/Boolean";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "GB\b\u001c\n[\u001cEHv\nMPO\u000f\u0007\u0000,,\u0006(\u0007 \u001dGc\u0016\u000f0ZL[\u0012\u0013\u0010Q v\r\u001f\u0016X6P\u00131\u001e%5\u0006\u0010H?(\u0016C\"7\b\f7\u00064L?Q\u0003`B\u0012\u0003\u000f-FJ\u0014Q\u0003\u0003RH*\r\u001b\u0015\u00066&\u0002^\u0003` 2\",\u0015O\u000b\rQ\u00077\u0005\"F0P2\rr\b\u0013\u0002\u0006\u0004\u000f\u000e\u0006[|\u0004\u0016\u0006\u0004\u0001\u0006_\u001f\u001d\baFE\rGVXG\r\u0015Lo";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.e(l);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.f(89772139235450L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.f(89772139235450L);
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
            int n = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static Field g(long l) {
        int n = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.c(clazz3, string2, clazz2)) != null) {
                    m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.f(89772139235450L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public boolean m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Object object, Collection collection) {
        boolean bl;
        try {
            bl = m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.b("Y", (Object)m$$zPcIAFBcd6UcuqQvRCrqNzWJkbTDnGIFde1HeInyvQMygaChyIfFfSVrf7ynroMxuheKMmOFt6fJC7fVIZA3DCWtlDAcGJuqY, (Object)object, (Object)collection, (long)308677213439244L) == false;
        }
        catch (class_151 class_1512) {
            throw m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.a(class_1512);
        }
        return bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

