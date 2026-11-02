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
import me.mioclient.m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_10124;
import net.minecraft.class_10132;
import net.minecraft.class_10134;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_151;
import net.minecraft.class_1799;
import net.minecraft.class_4174;
import net.minecraft.class_9334;

final class m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3
extends m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public static final Object[] c = new Object[21];
    public static final String[] d = new String[21];

    public m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3(String string2) {
    }

    static {
        m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b();
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
            case 0 -> 14;
            case 1 -> 40;
            case 2 -> 47;
            case 3 -> 12;
            case 4 -> 45;
            case 5 -> 53;
            case 6 -> 46;
            case 7 -> 39;
            case 8 -> 43;
            case 9 -> 44;
            case 10 -> 52;
            case 11 -> 61;
            case 12 -> 36;
            case 13 -> 20;
            case 14 -> 54;
            case 15 -> 18;
            case 16 -> 50;
            case 17 -> 59;
            case 18 -> 7;
            case 19 -> 19;
            case 20 -> 23;
            case 21 -> 16;
            case 22 -> 6;
            case 23 -> 8;
            case 24 -> 33;
            case 25 -> 24;
            case 26 -> 27;
            case 27 -> 38;
            case 28 -> 35;
            case 29 -> 22;
            case 30 -> 25;
            case 31 -> 60;
            case 32 -> 34;
            case 33 -> 3;
            case 34 -> 21;
            case 35 -> 30;
            case 36 -> 9;
            case 37 -> 41;
            case 38 -> 32;
            case 39 -> 56;
            case 40 -> 5;
            case 41 -> 29;
            case 42 -> 42;
            case 43 -> 31;
            case 44 -> 13;
            case 45 -> 48;
            case 46 -> 58;
            case 47 -> 15;
            case 48 -> 2;
            case 49 -> 28;
            case 50 -> 37;
            case 51 -> 55;
            case 52 -> 49;
            case 53 -> 63;
            case 54 -> 62;
            case 55 -> 57;
            case 56 -> 0;
            case 57 -> 11;
            case 58 -> 26;
            case 59 -> 17;
            case 60 -> 4;
            case 61 -> 10;
            case 62 -> 51;
            default -> 1;
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
        m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.d[n3] = new String(cArray);
        return n3;
    }

    public static void b() {
        Object[] objectArray = c;
        c[0] = "Cos@!;]gi\u000fF:L|dU`<";
        objectArray[1] = Boolean.TYPE;
        m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.d[1] = "java/lang/Boolean";
        objectArray[2] = "y\u0019bkT?y\u0019u7X0cRu)X%d#'r\u0000o";
        objectArray[3] = "\u0006F_\u0012\u0018U\u0006FHN\u0014Z\u001c\rHP\u0014O\u001b|\u0012\u000fF\r";
        objectArray[4] = "3\u0011&\u001e6=8\u001e7QW33\u00153\u000b";
        objectArray[5] = "UZ\u0011\u0000'\u001e[SV\b \u0005\u0016R\u001bI\u001f\u0016k\u000bF\u0019\fE\u0001\u000er\u000b\u001d8yum\u0018vETfS\f\t\u0003_e}/ +\bW\t=\u001e5t}\b\f\u001b?\u0000NT,/5wQUY\u0004&~{j\u0000&E\\\u0006[\u0006'\u0015m\bn$\u0004\u0012hoIX>\"ZfP:\t\bJ~k++\u001fS\u000fx\u0003\u001dUU\u001b\u001b\u0017;\b_zg^\u001c\b\u007fK\f;\"\u0000o\f\u0007\u0003&\u001cO\u0007k.9\u0010I\u000e}\b'>As~^$G`~]\u001b\u00168WZ|^\u0000C`\u0007H8v\u001d\\Yf\u001e~\u001b\u000eUH\n|%RM^^\u0002)]\bH8\u0014=}z^\u0017?\u0002\u000eQ|]\u0016Io\u0006yUjB";
        objectArray[6] = "QC\u0005>z=QC\u0012bv2K\b\u0012|v'Ly@ &g\r";
        objectArray[7] = Integer.TYPE;
        m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.d[7] = "java/lang/Integer";
        objectArray[8] = "/1\bn89/1\u001f2465z\u001f,4#2\u000bMpdbu";
        objectArray[9] = "[d|\u0015\b7ElfZj+Bq";
        objectArray[10] = "u?iO\f\u001fu?~\u0013\u0000\u0010ot~\r\u0000\u0005h\u0005,SXE";
        objectArray[11] = "\u0017Vw\u0000{k\u0017V`\\wd\r\u001d`Bwq\nl5\u0016.2";
        objectArray[12] = "\u000b\u0015=\u0005c'\n\u0015}~=)\u0017h,\u000e!@\u001cP,\u001cm;\u0013V|~";
        objectArray[13] = "\u0003=7p{V@ 6{\u0000]X>>B;\u000e\u000egF+c\rZ)-i`MV[";
        objectArray[14] = "{R\u0005\f=_\"XP\u0002V@)O\u0000[:ry\u000e_\rV\u001a8\u000f\u0010_+AuB\u001a<";
        objectArray[15] = "Fno\u0012dxBop_\u0007(\u001cplx<{K$\u0014\u0011dx\u001eg\u007fSg8\u0012\u0015";
        objectArray[16] = "!\u0016B\u0015d c\u0015\u0002\u0019\u0016*c\u0018\u0003\u0019j,eu\u001eKj0!\u0012\u001fK*K";
        objectArray[17] = "o)i\u0015\u0000Rkl(\u0011f\u000f8lp\u0012\n=h .DZjo.,N\u0019P5{nHfP%wa\u000f]\u00037`!u";
        objectArray[18] = "\u0013%/\u0007s\u0011J/z\t\u0018\u000eA8*Pt<\u0011yu\u0007\u0018WSu-Yx\u000bO%!7";
        objectArray[19] = "y|\u0011\u0012t\u0015,{\u0004\u001c\u000e\u0001n3\u0007\u001e\u007f\u000b\u000fON9\u007f+>$+\u0007w;y/\u0013\u0003k\u001brC>\u001cg\u001d{U\u0018\u0002I\u0015\u0006VN\u000104\u000bu\u000b3O\u0003/TN%44r`(Sj\b,N\u000e[lZ `\u001aYR\u00068vN'^\t}`(1J)\u000fv\u0007\u001auZ$TM3>;sQEc2\u00023z\u000e\u0003q\u001f2qu_qU%q\u0015\u0003m\u0005)\u001f";
        Object[] objectArray2 = objectArray;
        objectArray[20] = "'Yr#\u0011J&Y2XI@0\u001e\u000eb_J1\u001851M]qb";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c5' || c == '\u00e3' || c == 'F' || c == '\u00e4') {
                field = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'u' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    public static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Method h(long l) {
        int n = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.e(l);
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
                clazz3 = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(298172928938589L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(298172928938589L);
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
            int n = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.d(classArray[i], string, clazz2);
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
        int n = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.c(clazz3, string2, clazz2)) != null) {
                    m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.f(298172928938589L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public double m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_1799 class_17992, class_4174 class_41742) {
        CallSite callSite = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("u", (Object)class_17992, (Object)class_9334.field_53964, (long)1244386082292989L);
        if (callSite instanceof class_10124) {
            class_10124 class_101242 = (class_10124)callSite;
            callSite = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("u", (Object)m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("u", (Object)class_101242, (long)1065169743714928L), (long)1163362818385134L);
            while (m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("u", (Object)callSite, (long)889254450988284L) != false) {
                class_10134 class_101342 = (class_10134)m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("u", (Object)callSite, (long)1455935803585122L);
                if (!(class_101342 instanceof class_10132)) continue;
                class_10132 class_101322 = (class_10132)class_101342;
                CallSite callSite2 = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("\u00e7", (Object)class_101322, (long)1350255686229667L);
                try {
                    if (callSite2 <= 0) continue;
                    return (double)callSite2;
                }
                catch (class_151 class_1512) {
                    throw m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.a(class_1512);
                }
            }
        }
        return 0.0;
    }

    public static int m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_10132 class_101322) {
        CallSite callSite = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("u", (Object)m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("u", (Object)class_101322, (long)979144312459479L), (long)1163362818385134L);
        while (m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("u", (Object)callSite, (long)889254450988284L) != false) {
            class_1293 class_12932 = (class_1293)m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("u", (Object)callSite, (long)1455935803585122L);
            try {
                if (m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("u", (Object)class_12932, (long)1041016567133626L) != class_1294.field_5924) continue;
                return (int)m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.b("u", (Object)class_12932, (long)1285798744952044L);
            }
            catch (class_151 class_1512) {
                throw m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.a(class_1512);
            }
        }
        return 0;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

