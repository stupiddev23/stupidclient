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
import me.mioclient.m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H;

final class m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1
extends m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H {
    public static final long c;
    public static final Object[] d;
    public static final String[] g;

    public m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new Object[7];
        g = new String[7];
        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.d();
        long l = 6639075140394580791L;
        c = 0x7A479EA9EFCC61D5L ^ l;
    }

    public static Class n(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.m(l);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.d[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field h(Class clazz, String string, Class clazz2) {
        Field field = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00eb' || c == '\u00a3' || c == '\u00c9' || c == '\u00fb') {
                field = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.o(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00eb' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.p(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ed' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.d(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void d() {
        Object[] objectArray = d;
        d[0] = "<g56}g7h$y\u0001~8h\"5?n";
        objectArray[1] = Void.TYPE;
        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.g[1] = "java/lang/Void";
        objectArray[2] = "P\u000ea\u0005\be^\u0007&\r\u000f~\u0013\u0006kL\t@X\u0001\u0006!\u00189\r\u0000v\f\u0017CL\t;\u001d32L\u0013<89GpS~\u00123c\b;\u000e^1HsZ\u0019!S~e\\v]Yel\u0001+?*lv1=\u0010\tIq/.9Y`rR\u001f\n5yy3\u0017*TMN!(\u001c-f\u000f\f\u0004\n#IS\r8$'";
        objectArray[3] = Integer.TYPE;
        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.g[3] = "java/lang/Integer";
        objectArray[4] = "'rz80~,}kwQp'vo-";
        objectArray[5] = "Z\u0006,\u0017\"L\n\u001f4t&UPdqI#OX\u001a6\u0012:\u00146";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "n\u0019Wr\u0007y:\nC}\u007f~{X\u001ek5V\u000f7bYAr=OK; v\n\u001a\u007fz\u0002R20\u007ffDg\u0011%EO\u0004r25y[9|7?\u0016>\u0000a\u0014\tvj\u000e\u007f&\u001aWPC!\u0019\u0017{^\u0005c\u0011:\u0019_\u000ea+It\u007f=`\u001eK\u001bmG'\f\u001aKq\u001aA6IVj\u0002+8\u001eg\u0000E%g\rO>\u0000j=\u000e&:A+.\u001d\u0018\u007f\u000eq-t\u001f=\u0000|9\nXf\u0019'W";
    }

    public static int m(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 8;
            case 1 -> 20;
            case 2 -> 42;
            case 3 -> 12;
            case 4 -> 27;
            case 5 -> 46;
            case 6 -> 6;
            case 7 -> 59;
            case 8 -> 2;
            case 9 -> 56;
            case 10 -> 23;
            case 11 -> 29;
            case 12 -> 54;
            case 13 -> 3;
            case 14 -> 34;
            case 15 -> 7;
            case 16 -> 17;
            case 17 -> 51;
            case 18 -> 36;
            case 19 -> 62;
            case 20 -> 38;
            case 21 -> 39;
            case 22 -> 31;
            case 23 -> 61;
            case 24 -> 55;
            case 25 -> 35;
            case 26 -> 37;
            case 27 -> 5;
            case 28 -> 26;
            case 29 -> 22;
            case 30 -> 45;
            case 31 -> 40;
            case 32 -> 28;
            case 33 -> 44;
            case 34 -> 14;
            case 35 -> 15;
            case 36 -> 30;
            case 37 -> 41;
            case 38 -> 60;
            case 39 -> 4;
            case 40 -> 18;
            case 41 -> 49;
            case 42 -> 32;
            case 43 -> 47;
            case 44 -> 33;
            case 45 -> 25;
            case 46 -> 19;
            case 47 -> 63;
            case 48 -> 58;
            case 49 -> 13;
            case 50 -> 1;
            case 51 -> 53;
            case 52 -> 48;
            case 53 -> 57;
            case 54 -> 10;
            case 55 -> 0;
            case 56 -> 52;
            case 57 -> 43;
            case 58 -> 21;
            case 59 -> 50;
            case 60 -> 11;
            case 61 -> 9;
            case 62 -> 24;
            default -> 16;
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
        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.g[n3] = new String(cArray);
        return n3;
    }

    public static Field o(long l) {
        int n = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.m(l);
        Object object = d[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.n(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.n(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.g(clazz3, string2, clazz2)) != null) {
                    m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.n(341404298973333L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method p(long l) {
        int n = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.m(l);
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
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.n(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.n(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.n(341404298973333L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.n(341404298973333L);
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

    public static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(int n, Runnable runnable) {
        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.d("\u00ed", (int)n, (int)((int)c), (long)444106757737137L);
        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.d("Q", (Object)runnable, (long)417099804197069L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$1.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

