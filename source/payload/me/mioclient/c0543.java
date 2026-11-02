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
import me.mioclient.m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;

final class m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2
extends m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H {
    public static final long[] c;
    public static final Integer[] d;
    public static final Object[] g;
    public static final String[] h;

    public m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new Object[11];
        h = new String[11];
        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.d();
        long l = 5131582369049960030L;
        long[] lArray = new long[2];
        int n = 0;
        String string = "l\u00e6:#\u00ad\u00ac\u0011\u00b0\u00c3\u000f\u00ae$\u008b\u00e2\u008f+";
        int n2 = "l\u00e6:#\u00ad\u00ac\u0011\u00b0\u00c3\u000f\u00ae$\u008b\u00e2\u008f+".length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[2];
    }

    public static Class n(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.m(l);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field h(Class clazz, String string, Class clazz2) {
        Field field = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.h(classArray2[i], string, clazz2, n, classArray);
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
            if (c == 'K' || c == 'Q' || c == '\u00ca' || c == '\u00dc') {
                field = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.o(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.p(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'x' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'p' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void d() {
        Object[] objectArray = g;
        g[0] = "%:r\u001bt!%:eGx.?qeYx;8\u00001\u0001/";
        objectArray[1] = "6(;YLI6(,\u0005@F,c,\u001b@S+\u0012~A\u0017\u0011";
        objectArray[2] = "%s\"\u00058,.|3JD5!|5\u0006z%";
        objectArray[3] = Void.TYPE;
        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.h[3] = "java/lang/Void";
        objectArray[4] = "Kv02j5E\u007fw:m.\b~:{k\u0010CyW\u0016zi\u0016x';u\u0013Wqj*QbWkm\u000f[\u0017k+/%Q3\u0013C_iS\u0018h\"H\u00161.~$'j;5wyz\bH<mIl'k\u0019jW\u007f\u000e;0i*N=W)bKF\u001d6\u001dUYy+O6\u0014tU=A\u0019Hui\u0013E";
        objectArray[5] = Integer.TYPE;
        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.h[5] = "java/lang/Integer";
        objectArray[6] = "\u0010\u001cs:<\u001d\u001b\u0013bu]\u0013\u0010\u0018f/";
        objectArray[7] = "]l=p\u0015\u0010\u00072=\u0011\u001b\u0011\u001cj1})GY7j!~E\u000bf4h\u0002C\u000fu<\u0011";
        objectArray[8] = "Ca0%H%\u0015r`*61\u0007~\nmZuEzg>\bv\u0006\u0018";
        objectArray[9] = "+i.\u000e2\u001ay27J\u000b\u001a<~u_A2H\u0011\tm5\u0016zi \u000fT\u0012M<\u0014Nv6u\u0016\u0014R0\u0003V\u0003.{p\u0016u\u0013\u0012oM\u0018p\u0019}\nt\u0005S/\u001d^z\u001ba<<d7E^1\u0010jq\u0007V\u001crkz\u0005lo\u001fKI\u0004YmpY3CK< En%qo=^vO\u007f8\f40\u001b~,p\u000e2\u0012l<M\u000fo\u0011now\rf\u0003~RwX5@r?$\n6\u0003\u0010";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "\u001cD3(Lw\u001a@  5nHS?-Y\\\u001b\u0010bq\u000f\u000b\u001eK14\b1\u001cB#$5";
    }

    public static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.d(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x32C8;
        if (d[n2] == null) {
            m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }

    public static int m(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (h[n3] != null) {
            return n3;
        }
        Object object = g[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 62;
            case 1 -> 57;
            case 2 -> 49;
            case 3 -> 4;
            case 4 -> 38;
            case 5 -> 22;
            case 6 -> 45;
            case 7 -> 33;
            case 8 -> 6;
            case 9 -> 16;
            case 10 -> 47;
            case 11 -> 59;
            case 12 -> 40;
            case 13 -> 52;
            case 14 -> 20;
            case 15 -> 35;
            case 16 -> 21;
            case 17 -> 36;
            case 18 -> 58;
            case 19 -> 1;
            case 20 -> 5;
            case 21 -> 28;
            case 22 -> 37;
            case 23 -> 29;
            case 24 -> 13;
            case 25 -> 30;
            case 26 -> 2;
            case 27 -> 53;
            case 28 -> 7;
            case 29 -> 55;
            case 30 -> 32;
            case 31 -> 43;
            case 32 -> 19;
            case 33 -> 8;
            case 34 -> 48;
            case 35 -> 17;
            case 36 -> 54;
            case 37 -> 39;
            case 38 -> 11;
            case 39 -> 26;
            case 40 -> 31;
            case 41 -> 60;
            case 42 -> 0;
            case 43 -> 42;
            case 44 -> 44;
            case 45 -> 24;
            case 46 -> 15;
            case 47 -> 12;
            case 48 -> 61;
            case 49 -> 56;
            case 50 -> 50;
            case 51 -> 18;
            case 52 -> 27;
            case 53 -> 3;
            case 54 -> 10;
            case 55 -> 51;
            case 56 -> 23;
            case 57 -> 41;
            case 58 -> 34;
            case 59 -> 63;
            case 60 -> 46;
            case 61 -> 14;
            case 62 -> 25;
            default -> 9;
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
        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.h[n3] = new String(cArray);
        return n3;
    }

    public static Field o(long l) {
        int n = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.m(l);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.n(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.n(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.g(clazz3, string2, clazz2)) != null) {
                    m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.n(432463858032929L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method p(long l) {
        int n = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.m(l);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.n(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.n(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.n(432463858032929L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.n(432463858032929L);
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
        CallSite callSite = m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.d("x", (Object)m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.d("x", (Object)m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)493869489035697L), (long)736930995579805L);
        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.d("p", (int)n, (int)m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.a(31070, 2456300874576153495L), (long)687186606343550L);
        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.d("x", (Object)runnable, (long)602263418135113L);
        m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.d("p", (int)callSite, (int)m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.a(26564, 5599850269096105228L), (long)687186606343550L);
    }

    public static String m$$TNWllfP09QeRXcML3VBkzeJ1JgnKNjmarXw9LFyJUHqvICfrkytxYFugI7HikcRUiYrodE9fjUYVaDhdHcLMs3alHgmcnYmj8(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-34, -23, -25, -109, 66, 24, 73, -113};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 8]);
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
            return MethodHandles.lookup().findStatic(m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H$2.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

