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
import net.minecraft.class_151;

public interface m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN {
    public static final Object[] E = new Object[8];
    public static final String[] F = new String[8];

    static {
        m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a();
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a(l);
            object = E[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.E[n] = clazz = Class.forName(F[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a(l);
        Object object = E[n];
        if (object instanceof String) {
            String string = F[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a(clazz3, string2, clazz2)) != null) {
                    m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.E[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.E[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.b(227418305770605L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static class_151 f(class_151 class_1512) {
        return class_1512;
    }

    public static Method d(long l) {
        int n = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a(l);
        Object object = E[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = F[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.E[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.b(227418305770605L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.E[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.b(227418305770605L);
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

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f5' || c == '\u00c1' || c == '\u00ef' || c == '\u00fb') {
                field = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00db' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static int a(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (F[n3] != null) {
            return n3;
        }
        Object object = E[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 52;
            case 1 -> 53;
            case 2 -> 4;
            case 3 -> 34;
            case 4 -> 26;
            case 5 -> 50;
            case 6 -> 62;
            case 7 -> 17;
            case 8 -> 44;
            case 9 -> 40;
            case 10 -> 48;
            case 11 -> 7;
            case 12 -> 37;
            case 13 -> 58;
            case 14 -> 41;
            case 15 -> 12;
            case 16 -> 29;
            case 17 -> 16;
            case 18 -> 24;
            case 19 -> 3;
            case 20 -> 13;
            case 21 -> 35;
            case 22 -> 2;
            case 23 -> 27;
            case 24 -> 21;
            case 25 -> 5;
            case 26 -> 57;
            case 27 -> 61;
            case 28 -> 0;
            case 29 -> 11;
            case 30 -> 9;
            case 31 -> 28;
            case 32 -> 45;
            case 33 -> 47;
            case 34 -> 56;
            case 35 -> 54;
            case 36 -> 33;
            case 37 -> 30;
            case 38 -> 14;
            case 39 -> 15;
            case 40 -> 55;
            case 41 -> 46;
            case 42 -> 42;
            case 43 -> 51;
            case 44 -> 6;
            case 45 -> 59;
            case 46 -> 63;
            case 47 -> 19;
            case 48 -> 25;
            case 49 -> 31;
            case 50 -> 38;
            case 51 -> 18;
            case 52 -> 8;
            case 53 -> 20;
            case 54 -> 39;
            case 55 -> 36;
            case 56 -> 32;
            case 57 -> 49;
            case 58 -> 22;
            case 59 -> 10;
            case 60 -> 1;
            case 61 -> 60;
            case 62 -> 23;
            default -> 43;
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
        m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.F[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = E;
        E[0] = "3\\N)wT=U\t!pOpTD`p|1v\u0007|yU\u0018w\u0003\u0013*\u000f0v4\u0016yJ.c\u0017\f.\u000bm}:\u0006j}\u0013}\u0012\u0005|\r1\u000b\u00023zJ\u001ar\u000e+XU\u000ep\u0015\nXo6W3%rP\u0011p\u0001qS\u000e\tT\u0013\u0006F\u00039C\"\u0012&H\u000eL\u0017\u0014ys4|Q\rsCnmW\u0003P";
        objectArray[1] = Boolean.TYPE;
        m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.F[1] = "java/lang/Boolean";
        objectArray[2] = Void.TYPE;
        m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.F[2] = "java/lang/Void";
        objectArray[3] = "\",~!x7)#on\u00199\"(k4";
        objectArray[4] = "<#\u00157Td,oQS\bw*vE7\t\u0016hfAh\u001d}7$S.d";
        objectArray[5] = "\u0012D+9\u0005\u0005\u0002\bo]T\f#\u001f~2Q\u001a\u0013x(`_\t\u0015\u0004)$\u000e\u0010\u007f";
        objectArray[6] = "(\u00023LR\u00118Nw(\u000f\u0005,TmEbZ<P2Q\t\u0005~Bt(";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "QOaI04A\u0003%-ej\u0010\u0014\u001b`r\rl2$m:\u0005v\u0014\u000bvG?Y\u0003*Q<\u0007N\u001e\u0003hL\nU#\u0007NE9s3bKc#l>6s^y\u0006:=Q{\u001aq\u0019\u0019\u007f_'\u00071\u0003Ic\u0000e\u000f4mF\u0014\u0002(#S;;Q\u001a\u0016\u001cA\"\rI8A~\u0004[=g\u0010<6\\,[\u0014y(\u0007\n0K;:As";
    }

    public void enable();

    public void disable();

    default public void m$$oHEzCXIwH2KBoXSOqmxyt4IzePMDDaXTkMwGH1nkmXEeVV72AntsTEbJZWi3JPlkNQtgHNZ6Spv3ueaE9Il92kdvJoF454xhW() {
        block3: {
            block2: {
                try {
                    if (m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a("\u00db", (Object)this, (long)413448925586184L) == false) break block2;
                    m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a("\u00db", (Object)this, (long)303031824237368L);
                    break block3;
                }
                catch (class_151 class_1512) {
                    throw m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.f(class_1512);
                }
            }
            m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a("\u00db", (Object)this, (long)466048074877977L);
        }
    }

    default public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(boolean bl) {
        try {
            if (m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a("\u00db", (Object)this, (long)413448925586184L) != bl) {
                m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a("\u00db", (Object)this, (long)561826548161017L);
            }
        }
        catch (class_151 class_1512) {
            throw m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.f(class_1512);
        }
    }

    public boolean isToggled();

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

