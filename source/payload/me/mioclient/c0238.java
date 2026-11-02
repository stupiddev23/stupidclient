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
import java.util.List;
import me.mioclient.m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc;
import me.mioclient.m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;

final class m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1
extends m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public static final Object[] c = new Object[10];
    public static final String[] d = new String[10];

    public m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1(String string2) {
    }

    static {
        m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b();
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
            case 0 -> 51;
            case 1 -> 41;
            case 2 -> 23;
            case 3 -> 22;
            case 4 -> 63;
            case 5 -> 36;
            case 6 -> 21;
            case 7 -> 44;
            case 8 -> 29;
            case 9 -> 10;
            case 10 -> 39;
            case 11 -> 11;
            case 12 -> 43;
            case 13 -> 33;
            case 14 -> 12;
            case 15 -> 46;
            case 16 -> 56;
            case 17 -> 13;
            case 18 -> 35;
            case 19 -> 55;
            case 20 -> 62;
            case 21 -> 48;
            case 22 -> 9;
            case 23 -> 14;
            case 24 -> 27;
            case 25 -> 16;
            case 26 -> 2;
            case 27 -> 59;
            case 28 -> 61;
            case 29 -> 50;
            case 30 -> 30;
            case 31 -> 45;
            case 32 -> 1;
            case 33 -> 54;
            case 34 -> 24;
            case 35 -> 7;
            case 36 -> 31;
            case 37 -> 3;
            case 38 -> 18;
            case 39 -> 37;
            case 40 -> 15;
            case 41 -> 53;
            case 42 -> 57;
            case 43 -> 47;
            case 44 -> 28;
            case 45 -> 20;
            case 46 -> 5;
            case 47 -> 8;
            case 48 -> 40;
            case 49 -> 42;
            case 50 -> 0;
            case 51 -> 38;
            case 52 -> 52;
            case 53 -> 17;
            case 54 -> 32;
            case 55 -> 25;
            case 56 -> 19;
            case 57 -> 58;
            case 58 -> 6;
            case 59 -> 49;
            case 60 -> 34;
            case 61 -> 4;
            case 62 -> 60;
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
        m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ed' || c == '\u00ef' || c == '\u00fb' || c == 'H') {
                field = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'E' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "`\u0013d!qZ~\u001b~n\u001c@f\u001ew#+Fe\u001ca";
        objectArray[1] = "\u001dn\u0017\r~o\u0016a\u0006B\u001fa\u001dj\u0002\u0018";
        objectArray[2] = ">nJlcN fP#\u0001R'{";
        objectArray[3] = "3EG\u001afv3EPFjy)\u000ePXjl.\u007f\u0001\u00072";
        objectArray[4] = ">\u0003\u0000\u0012\u0005p>\u0003\u0017N\t\u007f$H\u0017P\tj#9F\b[";
        objectArray[5] = "<:aF^K<:v\u001aRD&qv\u0004RQ!\u0000'[\u0000\u001a";
        objectArray[6] = "|tIu\\\u0000|t^)P\u000ff?^7P\u001aaN\u000fh\u0006]";
        objectArray[7] = "ms\bmw\u0016(lhlu\u001b{i\u0005ks\u001bPl\u0013k\u0014\u0006xv\u0005(r\u0017qph.p\u001f,kUtt\u0012}\r";
        objectArray[8] = "`5^1\u0001a #Hfby7&Yh\u000eKce\u0006?^\u001c`*Ab\r};0Kmb";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "R}\u0000\u0003\u0017,T=EFr \u0004z\u001cZ\u001e\u0012U7B\u0006BEUfLO\u0015$P}\u000eLr~\u0012zBX\u001bxR?\u0007=";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
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
                clazz3 = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(80071620819366L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(80071620819366L);
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
            int n = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz3, string2, clazz2)) != null) {
                    m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(80071620819366L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public List m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc) {
        return m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("E", (Object)m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("E", (Object)m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00e4", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1765, (long)601978216973233L), (long)687146285177738L), (long)547498545405719L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

