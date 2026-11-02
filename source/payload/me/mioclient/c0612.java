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
import net.minecraft.class_1799;
import net.minecraft.class_4174;

final class m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2
extends m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public static final Object[] c = new Object[4];
    public static final String[] d = new String[4];

    public m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2(String string2) {
    }

    static {
        m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b();
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
            case 0 -> 38;
            case 1 -> 34;
            case 2 -> 9;
            case 3 -> 49;
            case 4 -> 44;
            case 5 -> 18;
            case 6 -> 52;
            case 7 -> 58;
            case 8 -> 42;
            case 9 -> 28;
            case 10 -> 19;
            case 11 -> 36;
            case 12 -> 10;
            case 13 -> 15;
            case 14 -> 37;
            case 15 -> 35;
            case 16 -> 21;
            case 17 -> 12;
            case 18 -> 61;
            case 19 -> 39;
            case 20 -> 27;
            case 21 -> 40;
            case 22 -> 16;
            case 23 -> 0;
            case 24 -> 48;
            case 25 -> 11;
            case 26 -> 56;
            case 27 -> 45;
            case 28 -> 53;
            case 29 -> 23;
            case 30 -> 47;
            case 31 -> 57;
            case 32 -> 63;
            case 33 -> 32;
            case 34 -> 4;
            case 35 -> 43;
            case 36 -> 30;
            case 37 -> 5;
            case 38 -> 14;
            case 39 -> 13;
            case 40 -> 8;
            case 41 -> 17;
            case 42 -> 55;
            case 43 -> 26;
            case 44 -> 24;
            case 45 -> 29;
            case 46 -> 25;
            case 47 -> 3;
            case 48 -> 51;
            case 49 -> 62;
            case 50 -> 6;
            case 51 -> 50;
            case 52 -> 59;
            case 53 -> 20;
            case 54 -> 54;
            case 55 -> 2;
            case 56 -> 33;
            case 57 -> 46;
            case 58 -> 1;
            case 59 -> 60;
            case 60 -> 31;
            case 61 -> 41;
            case 62 -> 22;
            default -> 7;
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
        m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == '\u00cc' || c == '\u00c3' || c == 'Q') {
                field = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'f' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "s\\]['Cs\\J\u0007+Li\u0017J\u0019+Ynf\u001dD}\u001e";
        objectArray[1] = Float.TYPE;
        m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d[1] = "java/lang/Float";
        objectArray[2] = "pMdf\u000f\u0007{Bu)n\tpIqs";
        Object[] objectArray2 = objectArray;
        objectArray[3] = "q~ }\u0004Fy=7A\b\u0018v8\u000b{_N)@e|\u001d\u001e/2!<\u0005A\u0013";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
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
                clazz3 = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(207717279109742L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(207717279109742L);
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
            int n = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz3, string2, clazz2)) != null) {
                    m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(207717279109742L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public double m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_1799 class_17992, class_4174 class_41742) {
        return (double)m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("\u00c2", (Object)class_41742, (long)221057324939517L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

