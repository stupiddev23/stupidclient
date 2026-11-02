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
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import me.mioclient.m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q;
import net.minecraft.class_151;

final class m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3
extends m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6 {
    public static final Object[] a = new Object[20];
    public static final String[] d = new String[20];

    public m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3(String string2) {
    }

    static {
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b();
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
            case 0 -> 20;
            case 1 -> 3;
            case 2 -> 29;
            case 3 -> 47;
            case 4 -> 43;
            case 5 -> 24;
            case 6 -> 4;
            case 7 -> 63;
            case 8 -> 42;
            case 9 -> 59;
            case 10 -> 58;
            case 11 -> 14;
            case 12 -> 34;
            case 13 -> 51;
            case 14 -> 9;
            case 15 -> 8;
            case 16 -> 53;
            case 17 -> 50;
            case 18 -> 49;
            case 19 -> 41;
            case 20 -> 54;
            case 21 -> 44;
            case 22 -> 10;
            case 23 -> 2;
            case 24 -> 17;
            case 25 -> 57;
            case 26 -> 25;
            case 27 -> 31;
            case 28 -> 23;
            case 29 -> 61;
            case 30 -> 52;
            case 31 -> 7;
            case 32 -> 12;
            case 33 -> 48;
            case 34 -> 22;
            case 35 -> 33;
            case 36 -> 55;
            case 37 -> 21;
            case 38 -> 32;
            case 39 -> 36;
            case 40 -> 46;
            case 41 -> 0;
            case 42 -> 15;
            case 43 -> 39;
            case 44 -> 18;
            case 45 -> 62;
            case 46 -> 5;
            case 47 -> 1;
            case 48 -> 19;
            case 49 -> 38;
            case 50 -> 40;
            case 51 -> 35;
            case 52 -> 45;
            case 53 -> 56;
            case 54 -> 27;
            case 55 -> 16;
            case 56 -> 26;
            case 57 -> 37;
            case 58 -> 30;
            case 59 -> 11;
            case 60 -> 60;
            case 61 -> 28;
            case 62 -> 13;
            default -> 6;
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
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.d[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '$' || c == '\u00ea' || c == 'F' || c == '\u00cb') {
                field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '$' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        a[0] = "\u0001}Z@\u0016\u000b\nrK\u000fq\t\u001fyKDJ";
        objectArray[1] = Integer.TYPE;
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.d[1] = "java/lang/Integer";
        objectArray[2] = "Z\u001cR*\niD\u0014HehuC\t";
        objectArray[3] = "b\u0001\u000e>\\Mi\u000e\u001fq=Cb\u0005\u001b+";
        objectArray[4] = "n\n^G\u000f\u0011`\u0003\u0019O\b\n-\u0002T\u000e1\u0007Y)DN+=08$\u001d\u0011\u0004y[\u0019`\n\u0018B*9R\u001e7zZ<r\u0014;F\u0006\u0017o\f*{Z*B\u0017F4\u001f3\u001e,\u0014h\n9\u0018\u0003.h8A\u0018\r)i^\u0014H?+o\u001fCm.6VX\u0016S!\u0007A Ey\t/7'$]*\u000et]\u0012KP";
        objectArray[5] = Float.TYPE;
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.d[5] = "java/lang/Float";
        objectArray[6] = "D\u0002&\u001d\u001b\u000bO\r7Rf\u001e]\u00175\u0011";
        objectArray[7] = Long.TYPE;
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.d[7] = "java/lang/Long";
        objectArray[8] = "\u0010Y7j^\u001f\u001ePpbY\u0004SQ=#Z\u0017\u0017\u000buHp\u001a\u001fRIlP50]{FR\u001c5HHO_\u001c3oRj\u0003\u0002?\u000b|wg\u001f\u001aV_aZ\u0018\u001exJv\u00024\u0012T/QdIExwT\u000f\u001a\nhl0QAD\r]h~D\b\nkc_\u0003\u000eDh\u007fc\u0016\b~Wvo\t4_pA\u0002";
        objectArray[9] = "nnF%\u0002\u001feaWjn\u001ckcU%B";
        objectArray[10] = Boolean.TYPE;
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.d[10] = "java/lang/Boolean";
        objectArray[11] = ".g\u0003q@9%h\u0012>#40n";
        objectArray[12] = Double.TYPE;
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.d[12] = "java/lang/Double";
        objectArray[13] = "AQ3\\\u0003(OE4$X-Tw;@D&(VhD\u0006(\u0016M Y9";
        objectArray[14] = "7\u001f`uJt<Cs0%*`Z\u001er\u001f%2E iW8\r\u001ct`Bt`HboYE";
        objectArray[15] = "^O\u0005=h/\u0004\u0011\u0017)\u0012'I\r6\u000e*\u001dTx\nwq$/L\u00050{$\u0014\\<-s\b?L\\>n.\u001cf\u001c\u0012\\,\fG4|+\u007f\u0015~\\\u001dv\u0003\u0000P\t\u0007^\u000e&~1\u0013V'[n\u00017)\u0006.P]tk<=~1\u0014u\t\u000fD\f3{?Y\u001b!r^#ZH\u001e0x=\u0017h&L)$_\u0011Q&~,]\u0010l";
        objectArray[16] = "$>\u0017\u0018,Nt8C\u001dTYw~$\n0Kw\u0002@\t9Q+o\u0014\u001f6J\u001a";
        objectArray[17] = "\u001cH\u0007r\u0017u\u001c\u0006\u0001svrEP[\u007f\u001f~|^[o\u001b\u0018\u001dX\u0004kKr\u0018TFlv";
        objectArray[18] = "zw`lh?vn:b\n8;q\u007fdl/\u001aj`dO2\"odr\nn)e?qj+)wi\t";
        Object[] objectArray2 = objectArray;
        objectArray[19] = "UV+^&r]U+BA`\u0001\u000e0DA>\u000b\u0015)B\"l\u0019\u0016/>q`\u0019\u0017+]#r\u001a\u0011W";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.e(l);
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
                clazz3 = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.f(235302031840601L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.f(235302031840601L);
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
            int n = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.e(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.a[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.d(classArray[i], string, clazz2);
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
        int n = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.e(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.c(clazz3, string2, clazz2)) != null) {
                    m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.f(235302031840601L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public Color m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q, float f) {
        CallSite callSite = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)((Integer)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$ld5JaWDgZrAqTjHd1i1Z597vSSBv1XMP9LluflMABC8eRufEyGyPHoYVfKpatVFOdCOFi2IFhMB1ptUN9OhxLN6SkF2MFZRIJ, (long)1180475024703328L))), (long)922031526228469L);
        CallSite callSite2 = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)((Integer)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$6gpx1Wavx1AeLF0aHVRJFlpo82e48UwF3mLOUlFy1NsAno5Dm5XpkrFmCxRR9Adqn1WtD7vfBVZcdPjVIBkhINYPaEyd6w7bB, (long)1180475024703328L))), (long)922031526228469L);
        float f2 = 1.0f / (float)callSite2;
        int n = (int)((float)(m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00cc", (long)1283655226397180L) / (long)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)((Integer)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$oYQHLEy9JoxFXMEZxz9tE0RnqsS52pDaxb1EBsxI56nCeZnpQRa1HIAWxRYv7JYpAGpOKRP9710ohmZUvszjYzfRwRLDpMxeC, (long)1180475024703328L))), (long)922031526228469L) % (long)(callSite * callSite2)) + f / m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00cc", (long)1055547519784669L));
        int n2 = (int)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00cc", (double)((float)n * f2), (long)1372117999398038L);
        if (n2 < 0) {
            n2 = 0;
        }
        try {
            if (m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)((Boolean)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$bUpxdoHPm72pgGFlI6uAu2StfjWVB6M0dXJPfd5Eo88TUqByl7SvTzQ6u3RIHACrNscLgnJOu00dl0thg46r5rydOKxW3DqxP, (long)1180475024703328L))), (long)1212342768554937L) != false) {
                return m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Color)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)((m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$p8XG8fmE3orEWlIwznkmXHh3UdO5m4KrpG4Fe6G8Pb07XjQDyGn7e6Kky7RQ7alI5t2kdadZFVpDCrCDxtW21xyTasVEOQF85, (int)(n2 % callSite), (long)1051351939389262L))), (long)1180475024703328L)), (Color)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)((m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$p8XG8fmE3orEWlIwznkmXHh3UdO5m4KrpG4Fe6G8Pb07XjQDyGn7e6Kky7RQ7alI5t2kdadZFVpDCrCDxtW21xyTasVEOQF85, (int)((n2 + 1) % callSite), (long)1051351939389262L))), (long)1180475024703328L)), 1.0f - ((float)n * f2 - (float)n2));
            }
        }
        catch (class_151 class_1512) {
            throw m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.a(class_1512);
        }
        return (Color)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)((m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.b("\u00e2", (Object)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$p8XG8fmE3orEWlIwznkmXHh3UdO5m4KrpG4Fe6G8Pb07XjQDyGn7e6Kky7RQ7alI5t2kdadZFVpDCrCDxtW21xyTasVEOQF85, (int)(n2 % callSite), (long)1051351939389262L))), (long)1180475024703328L));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

