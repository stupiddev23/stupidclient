/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import me.mioclient.m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6;
import me.mioclient.m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN;
import me.mioclient.m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q;

final class m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2
extends m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6 {
    public static final Object[] a = new Object[9];
    public static final String[] d = new String[9];

    public m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2(String string2) {
    }

    static {
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.b();
    }

    public static int e(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = a[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 5;
            case 1 -> 57;
            case 2 -> 60;
            case 3 -> 40;
            case 4 -> 22;
            case 5 -> 27;
            case 6 -> 1;
            case 7 -> 11;
            case 8 -> 42;
            case 9 -> 55;
            case 10 -> 18;
            case 11 -> 52;
            case 12 -> 38;
            case 13 -> 53;
            case 14 -> 24;
            case 15 -> 37;
            case 16 -> 9;
            case 17 -> 45;
            case 18 -> 33;
            case 19 -> 62;
            case 20 -> 25;
            case 21 -> 48;
            case 22 -> 10;
            case 23 -> 14;
            case 24 -> 6;
            case 25 -> 8;
            case 26 -> 20;
            case 27 -> 29;
            case 28 -> 35;
            case 29 -> 16;
            case 30 -> 2;
            case 31 -> 3;
            case 32 -> 46;
            case 33 -> 31;
            case 34 -> 47;
            case 35 -> 36;
            case 36 -> 21;
            case 37 -> 7;
            case 38 -> 34;
            case 39 -> 39;
            case 40 -> 56;
            case 41 -> 4;
            case 42 -> 0;
            case 43 -> 15;
            case 44 -> 19;
            case 45 -> 12;
            case 46 -> 49;
            case 47 -> 17;
            case 48 -> 58;
            case 49 -> 26;
            case 50 -> 51;
            case 51 -> 63;
            case 52 -> 44;
            case 53 -> 54;
            case 54 -> 28;
            case 55 -> 50;
            case 56 -> 32;
            case 57 -> 41;
            case 58 -> 61;
            case 59 -> 13;
            case 60 -> 30;
            case 61 -> 59;
            case 62 -> 43;
            default -> 23;
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
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.d[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Z' || c == '\u00c5' || c == 't' || c == 'f') {
                field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 't' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'K' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = a;
        a[0] = "S\u007f\u0013&->Xp\u0002iJ<M{\u0002\"q";
        objectArray[1] = Integer.TYPE;
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.d[1] = "java/lang/Integer";
        objectArray[2] = "\u0019^h\u0002\u0003m\u0017W/\n\u0004vZVbK={.}r\u000b'AGl\u0012X\u001dx\u000e\u000f/%\u0006d5~\u000f\u0017\u0012K\r\u000e\n7\u0018G1R!*\u0000V\f\u000e\u001c\u0007\u001b:CK\u0005[ h\u001f^\u000f]\u000fR\u001flw]\u0001U\u001e\n\"\r3W\u0018Ku(\"J!\f \u0016-{6ts<\u0005S@s\u0012\u0018&r\u0003\t$\u000e\\";
        objectArray[3] = Float.TYPE;
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.d[3] = "java/lang/Float";
        objectArray[4] = "\u001dT\u0006wrk\u0013]A\u007fup^\\\f>vc\u001a\u0006DU\\n\u0012_xq|A=PJ[~h8EyRsh>bcw/v2\u0006MjKk\u0017[n|vl\u0013u{k.@\u001fY\u001eLH=HuFI#n\u0007e]-}5I\u0000luR0\u0005\u0007Z~sw\u0003IYbOb\u0005sfkC}9RA\\.";
        objectArray[5] = "\u001c\u0003e6\ni\u0017\ftykg\u001c\u0007p#";
        objectArray[6] = "7WEvo+<S\u001d\u001fp1%dM{l:Y\u0003\u0018c+m0HN$cW";
        objectArray[7] = "fYW\t\u001a26\u001cKNp2s\nj1H\bn\u007fVH\u00131\u0015KY\u000f\u00191.[`\u0012\u0011\u001d\u0005K\u0000\u0001\f;&a@->96@hCIj/y\u0000\"\u0014\u0016:WU8<\u001b\u001cym,42ai]\bK\u0013\u0014W\u0001K\t)\u0007ym+\u0017\u001c5CP\f\u0019*c\u001c}M<6`OB\u000f\u001a(-ozsJ-'BL\u000b\u000258B0";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "iz`D\u0000w24xY0j?8WBTx?D5\u0016T>*#cB\t9R";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.e(l);
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
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.f(421999106495368L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.f(421999106495368L);
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
            int n = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.e(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.a[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.e(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.c(clazz3, string2, clazz2)) != null) {
                    m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.f(421999106495368L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public Color m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q, float f) {
        return m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Color)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.b("K", (Object)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$r3oVCsNsPQXXq17UCjth1xlb7awWG6PjBGdjMxBgjb9Ej5QngYaLOs3LAppUPk3TXYh0ckSfbZ32pi5AszrdC42W9k0oC7UHl, (long)576244038168629L)), (Color)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.b("K", (Object)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$DT7VPEUBEMP3JrBxxFpuCYNItM40Jx8dYoOnZ0VK915Pa1gWpOPdlile8JwoKSxoqp3QtuUehyZMsRhCo8VG0KnM9rXmaVHef, (long)576244038168629L)), 2000.0, (double)(f * (float)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.b("K", (Object)((Integer)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.b("K", (Object)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$6gpx1Wavx1AeLF0aHVRJFlpo82e48UwF3mLOUlFy1NsAno5Dm5XpkrFmCxRR9Adqn1WtD7vfBVZcdPjVIBkhINYPaEyd6w7bB, (long)576244038168629L))), (long)457146025091078L) * m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.b("\u00fd", (long)523702765311249L)));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

