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
import me.mioclient.m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI;
import me.mioclient.m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok;
import net.minecraft.class_238;
import net.minecraft.class_243;

final class m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2
extends m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok {
    public static final Object[] c = new Object[12];
    public static final String[] d = new String[12];

    public m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2(String string2) {
    }

    static {
        m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.b();
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
            case 0 -> 39;
            case 1 -> 59;
            case 2 -> 60;
            case 3 -> 36;
            case 4 -> 0;
            case 5 -> 15;
            case 6 -> 4;
            case 7 -> 45;
            case 8 -> 58;
            case 9 -> 52;
            case 10 -> 22;
            case 11 -> 19;
            case 12 -> 20;
            case 13 -> 34;
            case 14 -> 2;
            case 15 -> 51;
            case 16 -> 12;
            case 17 -> 57;
            case 18 -> 49;
            case 19 -> 21;
            case 20 -> 31;
            case 21 -> 23;
            case 22 -> 10;
            case 23 -> 25;
            case 24 -> 43;
            case 25 -> 17;
            case 26 -> 7;
            case 27 -> 6;
            case 28 -> 32;
            case 29 -> 56;
            case 30 -> 13;
            case 31 -> 50;
            case 32 -> 26;
            case 33 -> 3;
            case 34 -> 28;
            case 35 -> 11;
            case 36 -> 30;
            case 37 -> 5;
            case 38 -> 9;
            case 39 -> 54;
            case 40 -> 63;
            case 41 -> 46;
            case 42 -> 29;
            case 43 -> 24;
            case 44 -> 44;
            case 45 -> 61;
            case 46 -> 14;
            case 47 -> 8;
            case 48 -> 38;
            case 49 -> 42;
            case 50 -> 40;
            case 51 -> 27;
            case 52 -> 18;
            case 53 -> 35;
            case 54 -> 47;
            case 55 -> 37;
            case 56 -> 48;
            case 57 -> 55;
            case 58 -> 62;
            case 59 -> 1;
            case 60 -> 41;
            case 61 -> 16;
            case 62 -> 33;
            default -> 53;
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
        m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.d[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'b' || c == '\u00fb' || c == 'k' || c == 'l') {
                field = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'b' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'r' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = ",\u0017\u001e7[z,\u0017\tkWu6\\\tuW`1-X-\u0005";
        objectArray[1] = Double.TYPE;
        m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.d[1] = "java/lang/Double";
        objectArray[2] = "@O1eMk@O&9AdZ\u0004&'Aq]uwx\u0018";
        objectArray[3] = "\u0018/\u001d?l:\u0013 \fp\u000f7\u0006&";
        objectArray[4] = "\u000fR0|$4\u0004]!3E:\u000fV%i";
        objectArray[5] = "*N9\u000fk3{\u000e85egk^`YW3/\u0005>5|avFn\u000e9m,>{^ar~\u0005>R;\nkUfMi1.Y<5=z)\u0004l\fl:(>";
        objectArray[6] = "\u0007V\t!\n\u001c\u0007^H7t\u0003SG\u0013?\u00181\u0007\u0004BcEfBP\u0012 \u001d]\u0007\\HX";
        objectArray[7] = "7q\u0014\u0006{,|g\u0015F\u0014\"gckF\u007f*uqP\u0003sp\rd\u0000[l\"6!\f\u0001\u0014";
        objectArray[8] = "\u001878fr\u000e\u0018?yp\f\u0011L&\"x`#\u0018bz\"\fIQdxt5\u0018\u0011eB";
        objectArray[9] = "\u0017|\r8\u0015\u0007\u0017tL.k\u0018Cm\u0017&\u0007*\u0017.F}R}Rz\u00169\u0002F\u0017vLA";
        objectArray[10] = "\u0006SX\u0017mv\u0006[\u0019\u0001\u0013iRBB\t\u007f[\u0006\u0001\u0013R+\fCUC\u0016z7\u0006Y\u0019n";
        Object[] objectArray2 = objectArray;
        objectArray[11] = ",j<`.(}*=Z |mze6\u0012() 9Z9zpbka|v*\u001a~1$ix!;=~\u0011mqc\",*(}9Zxa/ ic)!.\u001a";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.e(l);
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
                clazz3 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.f(329701479207022L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.f(329701479207022L);
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
            int n = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.c(clazz3, string2, clazz2)) != null) {
                    m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.f(329701479207022L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public class_238 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI, class_238 class_2383, float f) {
        float f2 = 1.0f - f;
        CallSite callSite = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.b("\u00f5", (double)m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.b("r", (Object)class_2383, (long)424981959445256L), (long)555472693550820L);
        CallSite callSite2 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.b("\u00f5", (double)m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.b("r", (Object)class_2383, (long)742957890760003L), (long)555472693550820L);
        CallSite callSite3 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.b("\u00f5", (double)m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.b("r", (Object)class_2383, (long)678853954778492L), (long)555472693550820L);
        CallSite callSite4 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.b("r", (Object)class_2383, (long)578821699851296L);
        return new class_238((class_243)m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.b("r", (Object)callSite4, (double)((double)f2 * callSite / 2.0), (double)((double)f2 * callSite2 / 2.0), (double)((double)f2 * callSite3 / 2.0), (long)798122326194236L), (class_243)m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.b("r", (Object)callSite4, (double)((double)f2 * callSite / 2.0), (double)((double)f2 * callSite2 / 2.0), (double)((double)f2 * callSite3 / 2.0), (long)414946245642895L));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

