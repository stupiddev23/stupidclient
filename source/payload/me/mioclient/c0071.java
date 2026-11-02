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
import me.mioclient.m$$PasZr49awH4pfQqUtwPhNRDkG1vaiI0lXVAviy2utkJeNirrfVxbEu1mzxXnXY6IVgFFk2gZAVDxXXDau4XqwVjEv0QBbsMNt;
import net.minecraft.class_2837;
import net.minecraft.class_2841;
import net.minecraft.class_6490;

public interface m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql {
    public static final Object[] a = new Object[8];
    public static final String[] b = new String[8];

    static {
        m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a();
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a(clazz3, string2, clazz2)) != null) {
                    m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.b(348121510476924L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a(l);
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
                clazz3 = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.b(348121510476924L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.b(348121510476924L);
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

    public static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == '\u00e5' || c == 'b' || c == 'x') {
                field = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static int a(long l) {
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
            case 0 -> 58;
            case 1 -> 49;
            case 2 -> 2;
            case 3 -> 26;
            case 4 -> 53;
            case 5 -> 33;
            case 6 -> 16;
            case 7 -> 55;
            case 8 -> 14;
            case 9 -> 60;
            case 10 -> 35;
            case 11 -> 12;
            case 12 -> 6;
            case 13 -> 52;
            case 14 -> 8;
            case 15 -> 31;
            case 16 -> 11;
            case 17 -> 5;
            case 18 -> 0;
            case 19 -> 32;
            case 20 -> 1;
            case 21 -> 28;
            case 22 -> 37;
            case 23 -> 10;
            case 24 -> 22;
            case 25 -> 3;
            case 26 -> 15;
            case 27 -> 61;
            case 28 -> 23;
            case 29 -> 57;
            case 30 -> 48;
            case 31 -> 47;
            case 32 -> 7;
            case 33 -> 62;
            case 34 -> 42;
            case 35 -> 59;
            case 36 -> 30;
            case 37 -> 63;
            case 38 -> 44;
            case 39 -> 24;
            case 40 -> 18;
            case 41 -> 4;
            case 42 -> 25;
            case 43 -> 17;
            case 44 -> 19;
            case 45 -> 13;
            case 46 -> 21;
            case 47 -> 45;
            case 48 -> 27;
            case 49 -> 34;
            case 50 -> 38;
            case 51 -> 51;
            case 52 -> 46;
            case 53 -> 41;
            case 54 -> 36;
            case 55 -> 39;
            case 56 -> 54;
            case 57 -> 29;
            case 58 -> 40;
            case 59 -> 43;
            case 60 -> 9;
            case 61 -> 50;
            case 62 -> 20;
            default -> 56;
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
        m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.b[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "z,%+l\u0002t%b#k\u00199$/bU\fd\u0013yr<\f`\u0001?6c<f\u001c\u007f1U\u0005Y\u001bO-B\\a(b\u000f5\u0001O\u001fJ0l\u0014%<\u007f-O\bY y4c;o+N34\u0000m1S(]4!\u0000]!C+|{l\u001cD;S1S\u001eA\fb}S7r;}\f}vT/u:F\bq";
        objectArray[1] = "\u0013L-U\u0012m\u001dEj]\u0015vPD'\u001cIg\u001bN;ILS9mn\tMR8Xej0R\u001cCFH\tt\u0015AwV\u0019k\tJDn\u0017m\b\u0010;N\rp)l`h0d;OPv5C\u001dfjb\u0015c\u000eLuK\u0019`\u000bz[q\r6?yFK\u0019e\u001csb\u0000\u0003WO{`\f\u001ff=OlI\u0017";
        objectArray[2] = "@/\u0013\u0015\u0016n@/\u0004I\u001aaZd\u0004W\u001at]\u0015Q\u000fB7";
        objectArray[3] = "\u000e0Y\u0002\u00016\u000e0N^\r9\u0014{N@\r,\u0013\n\u001f\u0014_h";
        objectArray[4] = "\u001eWN#w1\u0015X_l\u0016?\u001eS[6";
        objectArray[5] = "?\u0001y]?W!Ia:>L)TkS?@2\u0004~:a\u001c~\u001b*]e@>I\u0013";
        objectArray[6] = "St_>C@M<GYB[E!N%@@KbXY\u001eUXb\u000e)IV\u001bm5";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "\tG\u0018\b*\t\u000f\u001c\rq~\u0017\fQ\u001b\u0018g\u001fk\f\u000e\u001b|\u0012\u0011\u0012F\u0003\u001b";
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static class_6490 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2841 class_28412) {
        return m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a("\u00e0", (Object)m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a("\u00e0", (Object)((m$$PasZr49awH4pfQqUtwPhNRDkG1vaiI0lXVAviy2utkJeNirrfVxbEu1mzxXnXY6IVgFFk2gZAVDxXXDau4XqwVjEv0QBbsMNt)class_28412), (long)528636229444788L), (long)477091579109701L);
    }

    public static class_2837 m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_2841 class_28412) {
        return m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a("\u00e0", (Object)m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.a("\u00e0", (Object)((m$$PasZr49awH4pfQqUtwPhNRDkG1vaiI0lXVAviy2utkJeNirrfVxbEu1mzxXnXY6IVgFFk2gZAVDxXXDau4XqwVjEv0QBbsMNt)class_28412), (long)528636229444788L), (long)390190903473339L);
    }

    public class_6490 mio$storage();

    public class_2837 mio$palette();

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$2eeg8q7QGDm16PFqfRKPbjEprvkhtnbiwcGVlov98vvrWEcPKfEfSNNAcOiZnapevsbbuSXIv4APEsbgbZa8xU1Rc4ddCfoql.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

