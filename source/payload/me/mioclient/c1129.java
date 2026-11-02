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
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_1268;
import net.minecraft.class_1321;
import net.minecraft.class_151;
import net.minecraft.class_243;

final class m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3
extends m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public static final Object[] a = new Object[20];
    public static final String[] b = new String[20];

    public m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3(String string2) {
    }

    static {
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b();
    }

    public static int e(long l) {
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
            case 0 -> 15;
            case 1 -> 55;
            case 2 -> 26;
            case 3 -> 61;
            case 4 -> 42;
            case 5 -> 24;
            case 6 -> 45;
            case 7 -> 8;
            case 8 -> 13;
            case 9 -> 39;
            case 10 -> 4;
            case 11 -> 63;
            case 12 -> 60;
            case 13 -> 40;
            case 14 -> 5;
            case 15 -> 9;
            case 16 -> 16;
            case 17 -> 10;
            case 18 -> 14;
            case 19 -> 20;
            case 20 -> 21;
            case 21 -> 59;
            case 22 -> 12;
            case 23 -> 18;
            case 24 -> 33;
            case 25 -> 28;
            case 26 -> 37;
            case 27 -> 54;
            case 28 -> 17;
            case 29 -> 3;
            case 30 -> 22;
            case 31 -> 57;
            case 32 -> 44;
            case 33 -> 38;
            case 34 -> 52;
            case 35 -> 32;
            case 36 -> 41;
            case 37 -> 34;
            case 38 -> 36;
            case 39 -> 30;
            case 40 -> 51;
            case 41 -> 0;
            case 42 -> 1;
            case 43 -> 43;
            case 44 -> 48;
            case 45 -> 35;
            case 46 -> 58;
            case 47 -> 11;
            case 48 -> 53;
            case 49 -> 29;
            case 50 -> 49;
            case 51 -> 50;
            case 52 -> 25;
            case 53 -> 7;
            case 54 -> 47;
            case 55 -> 56;
            case 56 -> 6;
            case 57 -> 31;
            case 58 -> 62;
            case 59 -> 27;
            case 60 -> 2;
            case 61 -> 23;
            case 62 -> 46;
            default -> 19;
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
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e0' || c == 'M' || c == 'B' || c == '\u00f0') {
                field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e0' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00de' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        a[0] = "\u001fMX|r0\u001fMO ~?\u0005\u0006O>~*\u0002w\u001bf)";
        objectArray[1] = "{@,r\u001bw{@;.\u0017xa\u000b;0\u0017mfzikO'";
        objectArray[2] = "f@:w\u0005\u0016f@-+\t\u0019|\u000b-5\t\f{z\u007fjZN";
        objectArray[3] = Boolean.TYPE;
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b[3] = "java/lang/Boolean";
        objectArray[4] = "(\u0019\u001aZ+1(\u0019\r\u0006'>2R\r\u0018'+5#\\G~";
        objectArray[5] = "VE@,VpVEWpZ\u007fL\u000eWnZjK\u007f\u00066\b";
        objectArray[6] = "\u001bFkQ\t\\\u001bF|\r\u0005S\u0001\r|\u0013\u0005F\u0006|.LT\f";
        objectArray[7] = "HvNQ7RF\u007f\tY0I\u000b~D\u0018\u000bv\\u\u000f\u007f\u000e\\Ab2o\u0013rM\\\nLkh\\v$]\u0004VvC7^=\nf'\u0010D8hB}*n=L`y'\t\u000eYjw7_8uhfQx;OVP\u0012H\u0004v\u001cD3w4JUd8\u007f7uw_\u0002T\nX\u0015%7N\u001cxb'\u0003O:";
        objectArray[8] = "\u0015hnE1\b\u0015hy\u0019=\u0007\u000f#y\u0007=\u0012\bR+YeV";
        objectArray[9] = "$W6K'T$W!\u0017+[>\u001c!\t+N9msW|\u0005";
        objectArray[10] = Void.TYPE;
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b[10] = "java/lang/Void";
        objectArray[11] = "N):l'mE&+#FcN-/y";
        objectArray[12] = "\u0004e9zx~\u0000wz~\u0003`Pva}oR\u0000:;+\u0003>Tkox~oO:=\u001a";
        objectArray[13] = "d \u001b.Epbg\u0010\u0010R\"'?\u0007|`qcc_\u0010\u000e\u007fg6\u0019a\nua``";
        objectArray[14] = "!\u001a{0+Z%\b84PDu\t#7<v&IsiP\u0018(I*)!\u001c\"O|Pj@j\t.mn\u0010&\rC";
        objectArray[15] = "\u0010\u001ecZnOJ@2\u0019^L\u0001\u0003~X/F`\u007f7\u007f/fQ\u0014RA'v\u0016\u001fjE;V\u001dsGZ7P\u0014eaD\u0019Xif7G`ydEru\u001fN@d7cdy\u001dPQ\u0015:EC~w\u001d<\u0017OPc\u001f\u0002KWF7a\u000eD\u0012PQw\u001ad`F~\\%\u0017Kd4unv\u001ca<%`\u0011JVvH;SQ_\f\u001b IV^s\u001f#R\u0016/3\u0018\"\u0012\u001d\u0015=_dT-";
        objectArray[16] = "<\u001eYm\u0017bm\u0005\b?uzj\u000bXd\u0019H>O\u0000>u$uHA`\u0012u:\u0015Z\u0003";
        objectArray[17] = "6Ad\u00007k2S'\u0004LubR<\u0007 G4\u0013d]s\u00103B%\u001a-i\u007f\\0\u0002L";
        objectArray[18] = "8{ZYAL<i\u0019]:Rlh\u0002^V`;(Y\u0005\u00077;u\u0010EW\n?%\\A:";
        Object[] objectArray2 = objectArray;
        objectArray[19] = " \u0006R\u0017,!$\u0014\u0011\u0013W?t\u0015\n\u0010;\r'PUMW`x\u001b\u0016\u001ajd(W\u0012w";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.e(l);
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
                clazz3 = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(838478267866031L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(838478267866031L);
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
            int n = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.e(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.d(classArray[i], string, clazz2);
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
        int n = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.e(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.c(clazz3, string2, clazz2)) != null) {
                    m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(838478267866031L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public class_243 m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(class_1321 class_13212) {
        block9: {
            try {
                block8: {
                    try {
                        try {
                            try {
                                if (m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("\u00c0", (Object)class_13212, (long)1378237828022129L) == false && m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("\u00c0", (Object)class_13212, (long)1321392915640687L) == false) break block8;
                            }
                            catch (class_151 class_1512) {
                                throw m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.a(class_1512);
                            }
                            if (m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724 != m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("\u00c0", (Object)class_13212, (long)1246767824223566L)) break block8;
                        }
                        catch (class_151 class_1513) {
                            throw m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.a(class_1513);
                        }
                        if (m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("\u00c0", (Object)class_13212, (Object)m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("\u00c0", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)962930622296684L), (long)1004723553452242L) == false) break block9;
                    }
                    catch (class_151 class_1514) {
                        throw m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.a(class_1514);
                    }
                }
                return null;
            }
            catch (class_151 class_1515) {
                throw m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.a(class_1515);
            }
        }
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("\u00de", (Object)class_13212, (Object)class_1268.field_5808, (long)1097468908616384L);
        return m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("\u00c0", (Object)m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("\u00c0", (Object)class_13212, (long)877309920184725L), (long)1170534121586843L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

