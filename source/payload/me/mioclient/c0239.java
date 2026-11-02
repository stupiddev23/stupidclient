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

final class m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2
extends m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public static final Object[] c = new Object[13];
    public static final String[] d = new String[13];

    public m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2(String string2) {
    }

    static {
        m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b();
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
            case 0 -> 45;
            case 1 -> 21;
            case 2 -> 48;
            case 3 -> 25;
            case 4 -> 19;
            case 5 -> 29;
            case 6 -> 20;
            case 7 -> 3;
            case 8 -> 41;
            case 9 -> 62;
            case 10 -> 1;
            case 11 -> 8;
            case 12 -> 36;
            case 13 -> 50;
            case 14 -> 58;
            case 15 -> 37;
            case 16 -> 51;
            case 17 -> 55;
            case 18 -> 49;
            case 19 -> 0;
            case 20 -> 23;
            case 21 -> 2;
            case 22 -> 38;
            case 23 -> 57;
            case 24 -> 28;
            case 25 -> 18;
            case 26 -> 32;
            case 27 -> 46;
            case 28 -> 26;
            case 29 -> 59;
            case 30 -> 4;
            case 31 -> 6;
            case 32 -> 9;
            case 33 -> 39;
            case 34 -> 44;
            case 35 -> 33;
            case 36 -> 42;
            case 37 -> 43;
            case 38 -> 12;
            case 39 -> 17;
            case 40 -> 35;
            case 41 -> 30;
            case 42 -> 63;
            case 43 -> 61;
            case 44 -> 34;
            case 45 -> 22;
            case 46 -> 54;
            case 47 -> 16;
            case 48 -> 13;
            case 49 -> 24;
            case 50 -> 52;
            case 51 -> 60;
            case 52 -> 27;
            case 53 -> 56;
            case 54 -> 15;
            case 55 -> 53;
            case 56 -> 7;
            case 57 -> 11;
            case 58 -> 5;
            case 59 -> 10;
            case 60 -> 47;
            case 61 -> 40;
            case 62 -> 14;
            default -> 31;
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
        m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'A' || c == '\u00c1' || c == '\u00f4' || c == 'k') {
                field = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'A' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '$' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "O(aW].A!&_Z5\f k\u001eg8l?vy\f%u<\u0005]\u0002\u0017F/\u0007v\u0003*{+\u0019Wb6E!\u001c{L\u000bv.<\u0003X\u0002V\u0002\u0002\u000f\u0002+n\u007fw\ns\fv4\u0006_\u0001\bKt~Yd\bZ\u001d~nB\u0012q\t\u0007]Q#Z\b\fN_1S,\b\u000b\u0006\r\u0010\u0004\u0015\u000fX(i\u001d\u0006`R";
        objectArray[1] = "1xQR\u0004o1xF\u000e\b`+3F\u0010\bu,B\u0017HZ";
        objectArray[2] = Float.TYPE;
        m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d[2] = "java/lang/Float";
        objectArray[3] = Boolean.TYPE;
        m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d[3] = "java/lang/Boolean";
        objectArray[4] = "\u0011Yhm})\u000fQr\"\u001f5\bL";
        objectArray[5] = "dK\u0010%GcdK\u0007yKl~\u0000\u0007gKyyqS?\u001c";
        objectArray[6] = "|\u001bmuk9w\u0014|:\u00039y\u001bo";
        objectArray[7] = "o[qtzWaR6|}L,S{=~_h\t3VTR`P\u000frt}O_=XvTJJ\u000eQ{TLm\u0014t'J@\t:iCWeT\u0019\u007f~Paz\fh&|mViO@\u0001:z1J+Ruj*.u\t;\u000f\u001bvZ\fw\b-}{KqF.aG^w|\u0011hKAK]6_&";
        objectArray[8] = "#`\b?tw(o\u0019p\u0015y#d\u001d*";
        objectArray[9] = "p=1$TN4gi 8\u0011!}8<T#u0e`\btu0d<I\u001a#bi 8";
        objectArray[10] = "r\n*dQ6u\u000b*9*:*\u0003-xt=*\u0019)\u0004\u0013)q\u001f&mK4-\tD";
        objectArray[11] = "oVUa(Oo\u0015T|T\u0019>Wpm0\u000b>+\u0013|:IiFSd:FS";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "CV?\u0019\u007f\u001b\u001c^}peV\u000fCx\u0001o7s\n_\u0001O\u0006\u0018oa\t_A\u0013We\u0015\u007fJ\u007fzz\u0019yCi\\d7q>j\ngNP3IOU1g\u0017h\nCJPJ\\l5\u0014l\u0014rJ=\u0012>\u0018\\^?,b\u0000J\nA mE\\lW4M7JC|\u000b>\u001ch\tU@_Km\u0001\u0005I1FD@k\u001fcKX1<\r?\u0001AXd\u0010c\u0017#\u000bk\u0010nD\u001d\u000b~\t=z\u0018\u000fd\u001d;\u001aO\\b\t\u0000";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
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
                clazz3 = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(579518376835508L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(579518376835508L);
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
            int n = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz3, string2, clazz2)) != null) {
                    m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(579518376835508L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public List m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc) {
        return m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("\u00e6", (Object)m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("$", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)685629247614762L), (float)m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("$", (Object)((Float)((Object)m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("$", (Object)m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc.m$$YHZ8oZWcenMb06mtvg3ArUBraDYqpHAlB3LWQNFGCVrnjEjs8iXLIajDqTsQDd565mE3a14APKZA1Xarw9H5AxoDXknTkdB4k, (long)812619181388165L))), (long)772646556342636L), (boolean)true, (long)868912237728399L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$9xG3Mis1MU7OZtUbUikHl3I3NzpoSHEhTssiKIAn3y3KJf3M49CoiyEMArp5YnPIhGC4SlLN0KUruML9aSBqv4k3XP0oSXRMc$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

