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
import me.mioclient.m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM;
import me.mioclient.m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW;
import net.minecraft.class_151;
import net.minecraft.class_2244;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2742;

final class m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2
extends m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW {
    public static final Object[] c = new Object[8];
    public static final String[] d = new String[8];

    public m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2(String string2) {
    }

    static {
        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.b();
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
            case 0 -> 41;
            case 1 -> 53;
            case 2 -> 24;
            case 3 -> 29;
            case 4 -> 57;
            case 5 -> 37;
            case 6 -> 13;
            case 7 -> 7;
            case 8 -> 5;
            case 9 -> 31;
            case 10 -> 2;
            case 11 -> 62;
            case 12 -> 0;
            case 13 -> 45;
            case 14 -> 49;
            case 15 -> 28;
            case 16 -> 32;
            case 17 -> 18;
            case 18 -> 51;
            case 19 -> 27;
            case 20 -> 47;
            case 21 -> 33;
            case 22 -> 60;
            case 23 -> 10;
            case 24 -> 54;
            case 25 -> 43;
            case 26 -> 8;
            case 27 -> 52;
            case 28 -> 30;
            case 29 -> 19;
            case 30 -> 15;
            case 31 -> 6;
            case 32 -> 40;
            case 33 -> 23;
            case 34 -> 36;
            case 35 -> 11;
            case 36 -> 39;
            case 37 -> 34;
            case 38 -> 17;
            case 39 -> 1;
            case 40 -> 42;
            case 41 -> 3;
            case 42 -> 12;
            case 43 -> 59;
            case 44 -> 22;
            case 45 -> 46;
            case 46 -> 61;
            case 47 -> 48;
            case 48 -> 56;
            case 49 -> 44;
            case 50 -> 21;
            case 51 -> 20;
            case 52 -> 9;
            case 53 -> 38;
            case 54 -> 25;
            case 55 -> 16;
            case 56 -> 58;
            case 57 -> 35;
            case 58 -> 55;
            case 59 -> 50;
            case 60 -> 63;
            case 61 -> 26;
            case 62 -> 14;
            default -> 4;
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
        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.d[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'd' || c == 'a' || c == 'v' || c == '\u00de') {
                field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "\fJ94\u000b?\fJ.h\u00070\u0016\u0001.v\u0007%\u0011p{)^";
        objectArray[1] = "lb6bEvlb!>Iyv)! IlqXp\u007f\u001b'";
        objectArray[2] = "4v,jG!4v;6K..=;(K;)Ljr\u0012x";
        objectArray[3] = "5Y/#\u000635Y8\u007f\n</\u00128a\n)(ci:]c";
        objectArray[4] = "4;1mYV?4 \"4U3*&~\u0016X2?";
        objectArray[5] = "9\r6\u0010652\u0002'_W;9\t#\u0005";
        objectArray[6] = "$fm%d/)t6Ua!7z:9S|p eUz7we'58#&\u001ad9tt1%d-n/K";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "\u001f$Mq\u001bF\u001f0W*a\u001cK4].\r.\u001fq\u0003t]y\u001c0M9\u0002\u0013C%T6aCV9Y$\u0004\u0010]p[I";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.e(l);
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
                clazz3 = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.f(395761865400708L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.f(395761865400708L);
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
            int n = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.d(classArray[i], string, clazz2);
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
        int n = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.c(clazz3, string2, clazz2)) != null) {
                    m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.f(395761865400708L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public boolean m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2338 class_23382, class_2248 class_22482, m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!(class_22482 instanceof class_2244) || m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.b("F", (Object)m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.b("F", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687, (Object)class_23382, (long)464205888620487L), (Object)class_2244.field_9967, (long)525519459482753L) != class_2742.field_12560) break block4;
                    }
                    catch (class_151 class_1512) {
                        throw m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.a(class_1512);
                    }
                    bl = true;
                    break block5;
                }
                catch (class_151 class_1513) {
                    throw m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.a(class_1513);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

