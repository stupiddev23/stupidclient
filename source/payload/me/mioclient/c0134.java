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
import me.mioclient.m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC;
import net.minecraft.class_151;

final class m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1
extends m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public long m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4;
    public static final long a;
    public static final Object[] d;
    public static final String[] e;

    public m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new Object[12];
        e = new String[12];
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b();
        long l = 6138524259081526814L;
        a = 0x55306B4A53AC1FEAL ^ l;
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
            case 0 -> 10;
            case 1 -> 23;
            case 2 -> 47;
            case 3 -> 38;
            case 4 -> 22;
            case 5 -> 41;
            case 6 -> 54;
            case 7 -> 51;
            case 8 -> 16;
            case 9 -> 13;
            case 10 -> 44;
            case 11 -> 43;
            case 12 -> 46;
            case 13 -> 12;
            case 14 -> 29;
            case 15 -> 17;
            case 16 -> 42;
            case 17 -> 2;
            case 18 -> 28;
            case 19 -> 0;
            case 20 -> 61;
            case 21 -> 36;
            case 22 -> 62;
            case 23 -> 55;
            case 24 -> 14;
            case 25 -> 1;
            case 26 -> 60;
            case 27 -> 25;
            case 28 -> 34;
            case 29 -> 50;
            case 30 -> 6;
            case 31 -> 35;
            case 32 -> 31;
            case 33 -> 24;
            case 34 -> 4;
            case 35 -> 8;
            case 36 -> 7;
            case 37 -> 33;
            case 38 -> 15;
            case 39 -> 39;
            case 40 -> 20;
            case 41 -> 37;
            case 42 -> 49;
            case 43 -> 59;
            case 44 -> 18;
            case 45 -> 11;
            case 46 -> 32;
            case 47 -> 48;
            case 48 -> 56;
            case 49 -> 45;
            case 50 -> 3;
            case 51 -> 57;
            case 52 -> 21;
            case 53 -> 9;
            case 54 -> 27;
            case 55 -> 58;
            case 56 -> 40;
            case 57 -> 30;
            case 58 -> 63;
            case 59 -> 5;
            case 60 -> 53;
            case 61 -> 52;
            case 62 -> 19;
            default -> 26;
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
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'I' || c == '\u00aa' || c == '\u00e1' || c == '\u00de') {
                field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'I' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00da' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'f' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        d[0] = "\t\u0007k>ob\u0007\u000e,6hyJ\u000faw^u\u0010R3\tGX\b!\f\u00145n\n5+50k=R)#wn\u0012S\u0004\t?U#$\u0006\u0015T8WZ\u00018Mi>*,j?O1T\u001favF4\u0017\"dtF\n%\u001026x\u00030,6a?\u0006W\u0007\nUa\r\u001b\u0002aou7&\u0001\t`a\u0001)w0E";
        objectArray[1] = Double.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e[1] = "java/lang/Double";
        objectArray[2] = Void.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e[2] = "java/lang/Void";
        objectArray[3] = "Y8G{\u00119R7V4l,@-Tw";
        objectArray[4] = Long.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e[4] = "java/lang/Long";
        objectArray[5] = "kt.\u0018Q3kt9D]<q?9Z])vNm\u0002\n";
        objectArray[6] = Boolean.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e[6] = "java/lang/Boolean";
        objectArray[7] = ")\r:\u0013\u0007:\"\u0002+\\f4)\t/\u0006";
        objectArray[8] = "cbVN\u001eu*9\u0014uG\"~w\b\u0011NH\u0000Z$.RN#=/\u0011]?\u0019|\u000fNSH\u000059'\u0012\u007f5GX9Xi ~X0Nw*`&MZTbd\u001cNpQ>C#ID?bI\u0001,DE\r\\_\u0013cO\u0000W\u0017DDd\u001cy\\\u000edL\bN+\fn7m@ \u001a\u001fi\u001dhf\u0007\u0019j?x\u001b\u000b_mR";
        objectArray[9] = "W\u0016\t\\\u0003r\u0011O\u0017R<p\u0006V\rUPBQ\u0016]\b\f\u0015WC\u000f_U.\u0015I\u0007P<";
        objectArray[10] = "Y[\u001c\u0001mt\u0010\u0000^:*b\u0014m,Hjk\u0005AQD,lh\u0005KB`?\u0015A\u001d\\.\u000f";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "\u001aSHyo\u0013AYJ`_\u0014]\u0019Nl9\u0003|\u0002Ql\u001a\u001eD\u0007Uz_EP\u0005\u0004}!\u001f\u0019\f^\u0001";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
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
                clazz3 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(496817129828494L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(496817129828494L);
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
            int n = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string, clazz2);
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
        int n = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz3, string2, clazz2)) != null) {
                    m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(496817129828494L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC) {
        block7: {
            try {
                if (m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00da", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)665022327715284L) != false) {
                    return;
                }
            }
            catch (class_151 class_1512) {
                throw m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.a(class_1512);
            }
            try {
                try {
                    if (m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("f", (long)777364360415151L) - this.m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4 < a || m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00da", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)665022327715284L) != false) break block7;
                }
                catch (class_151 class_1513) {
                    throw m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.a(class_1513);
                }
                this.m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4 = (long)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("f", (long)777364360415151L);
                m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00da", (Object)m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC, (double)(m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00da", (Object)m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC, (long)607151932992306L) - 0.04), (long)734738871894062L);
            }
            catch (class_151 class_1514) {
                throw m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.a(class_1514);
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

