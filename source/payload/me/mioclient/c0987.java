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

final class m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3
extends m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok {
    public static final Object[] c = new Object[12];
    public static final String[] d = new String[12];

    public m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3(String string2) {
    }

    static {
        m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.b();
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
            case 0 -> 3;
            case 1 -> 17;
            case 2 -> 48;
            case 3 -> 55;
            case 4 -> 23;
            case 5 -> 14;
            case 6 -> 54;
            case 7 -> 53;
            case 8 -> 25;
            case 9 -> 37;
            case 10 -> 46;
            case 11 -> 63;
            case 12 -> 4;
            case 13 -> 19;
            case 14 -> 10;
            case 15 -> 8;
            case 16 -> 2;
            case 17 -> 52;
            case 18 -> 0;
            case 19 -> 9;
            case 20 -> 5;
            case 21 -> 44;
            case 22 -> 21;
            case 23 -> 35;
            case 24 -> 32;
            case 25 -> 56;
            case 26 -> 45;
            case 27 -> 24;
            case 28 -> 22;
            case 29 -> 16;
            case 30 -> 31;
            case 31 -> 62;
            case 32 -> 11;
            case 33 -> 20;
            case 34 -> 47;
            case 35 -> 13;
            case 36 -> 59;
            case 37 -> 38;
            case 38 -> 60;
            case 39 -> 51;
            case 40 -> 57;
            case 41 -> 40;
            case 42 -> 34;
            case 43 -> 30;
            case 44 -> 43;
            case 45 -> 15;
            case 46 -> 49;
            case 47 -> 33;
            case 48 -> 18;
            case 49 -> 28;
            case 50 -> 6;
            case 51 -> 61;
            case 52 -> 12;
            case 53 -> 50;
            case 54 -> 36;
            case 55 -> 39;
            case 56 -> 29;
            case 57 -> 1;
            case 58 -> 26;
            case 59 -> 42;
            case 60 -> 7;
            case 61 -> 58;
            case 62 -> 41;
            default -> 27;
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
        m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.d[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c2' || c == 'y' || c == 'k' || c == '\u00a5') {
                field = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'K' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "\u0016bT#Y \u0016bC\u007fU/\f)CaU:\u000bX\u00129\u0007";
        objectArray[1] = Double.TYPE;
        m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.d[1] = "java/lang/Double";
        objectArray[2] = "\u0012\u001aMt\u001cr\u0012\u001aZ(\u0010}\bQZ6\u0010h\u000f \u000biI";
        objectArray[3] = "m\u001aHj\u0018Bf\u0015Y%{Os\u0013";
        objectArray[4] = "\u001co7^\u0010P\u0017`&\u0011q^\u001ck\"K";
        objectArray[5] = "bGN\u0001>Tg\u000b\u0006g'\u0001~[Q\u000b\u0015U:\u0000\u000fg{]gGX\u0019+\u0013k\u00016^s\t~UH\u000e=\u00058;\u000fV'\u0010lE_\u0018+V\u0002[J\u001f$\u0010:^\u0006WB";
        objectArray[6] = "MQ\u0006urO\u001eUEjHE\u0019N\u001dh$wM\rL4y M\u0003\u0018s&^\u001dM\u00145H";
        objectArray[7] = "Sv0\u001cG\u000b\u00119+J%\u0018\u0003=[L\u0014\u0014\u0015(%\u001cZ\u0018SFbD@\r\u000782\nLKi";
        objectArray[8] = "\u001fwlyr*Ls/fH Khwd$\u0012\u001f,/>H%Zlq\u007fp \u0016$\u0017";
        objectArray[9] = "uhmIZN&l.V`D!wvT\fvu4'\u000fY!u:sO\u000e_%t\u007f\t`";
        objectArray[10] = "k\u0014\u0003!<n8\u0010@>\u0006d?\u000b\u0018<jVkHIg>\u0001kF\u001d'h\u007f;\b\u0011a\u0006";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "\u0015BKv9]\u0010\u000e\u0003\u0010 \b\t^T|\u0012\\M\u0004\b\u0010|T\u0010B]n,\u001a\u001c\u00043)t\u0000\tPMy:\fO>\n! \u0019\u001b@Zo,_u^Oh#\u0019M[\u0003 E";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.e(l);
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
                clazz3 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.f(299523957435091L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.f(299523957435091L);
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
            int n = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.c(clazz3, string2, clazz2)) != null) {
                    m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.f(299523957435091L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public class_238 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI, class_238 class_2383, float f) {
        CallSite callSite = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.b("K", (double)m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.b("m", (Object)class_2383, (long)441725945429475L), (long)504939090598399L);
        CallSite callSite2 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.b("K", (double)m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.b("m", (Object)class_2383, (long)765651004235706L), (long)504939090598399L);
        CallSite callSite3 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.b("K", (double)m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.b("m", (Object)class_2383, (long)699375757972327L), (long)504939090598399L);
        CallSite callSite4 = m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.b("m", (Object)class_2383, (long)610111541114747L);
        return new class_238((class_243)m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.b("m", (Object)callSite4, (double)((double)f * callSite / 2.0), (double)((double)f * callSite2 / 2.0), (double)((double)f * callSite3 / 2.0), (long)823800710085527L), (class_243)m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.b("m", (Object)callSite4, (double)((double)f * callSite / 2.0), (double)((double)f * callSite2 / 2.0), (double)((double)f * callSite3 / 2.0), (long)365706952452589L));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok$3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

