/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import me.mioclient.m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb;
import me.mioclient.m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb;

final class m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3
extends m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb {
    public static final Object[] i = new Object[3];
    public static final String[] j = new String[3];

    public m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3(String string2) {
    }

    static {
        m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.e();
    }

    public static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fd' || c == '\u00f1' || c == 'a' || c == '\u00a2') {
                field = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.s(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fd' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.t(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00eb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'M' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void e() {
        Object[] objectArray = i;
        i[0] = "\u0012B\u001ev\u0010?\u001cKY~\u0017$QJ\u0014?\u00147\u0015\u0010\\T>:\u001dI`p\u001e\u00152FRZ\u001c<7SaS\u0011<1t{vM\"=\u0010Uk)?\u0018Mv}\u00148\u001cccjL\u0014\u0010O\u0006M*iGc^HA:\bsE,\u001faF\u0016tt0d\n\u0011B\u007f\u0011#\f_Ac-6\ne~j!)6DY]L";
        objectArray[1] = "\u0015\u0011<ZlY\u001e\u001e-\u0015\rW\u0015\u0015)O";
        Object[] objectArray2 = objectArray;
        objectArray[2] = ")]\u0011+\u001670[Q\u0017D<5|\u0007sV<I^\u0011xG!6\u0019Qg+";
    }

    public static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.e(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Method i(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static Field i(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Field s(long l) {
        int n = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.q(l);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.r(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.r(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.i(clazz3, string2, clazz2)) != null) {
                    m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.j(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.r(84355512069453L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method t(long l) {
        int n = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.q(l);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.r(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.r(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.i(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.r(84355512069453L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.j(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.r(84355512069453L);
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

    public static Field j(Class clazz, String string, Class clazz2) {
        Field field = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.j(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method j(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.i(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.j(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static int q(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 54;
            case 1 -> 32;
            case 2 -> 53;
            case 3 -> 21;
            case 4 -> 19;
            case 5 -> 41;
            case 6 -> 27;
            case 7 -> 50;
            case 8 -> 45;
            case 9 -> 2;
            case 10 -> 17;
            case 11 -> 63;
            case 12 -> 40;
            case 13 -> 14;
            case 14 -> 22;
            case 15 -> 33;
            case 16 -> 23;
            case 17 -> 25;
            case 18 -> 6;
            case 19 -> 24;
            case 20 -> 51;
            case 21 -> 35;
            case 22 -> 12;
            case 23 -> 9;
            case 24 -> 42;
            case 25 -> 55;
            case 26 -> 37;
            case 27 -> 28;
            case 28 -> 39;
            case 29 -> 56;
            case 30 -> 46;
            case 31 -> 59;
            case 32 -> 0;
            case 33 -> 8;
            case 34 -> 18;
            case 35 -> 62;
            case 36 -> 5;
            case 37 -> 49;
            case 38 -> 7;
            case 39 -> 43;
            case 40 -> 36;
            case 41 -> 4;
            case 42 -> 29;
            case 43 -> 31;
            case 44 -> 60;
            case 45 -> 30;
            case 46 -> 57;
            case 47 -> 52;
            case 48 -> 26;
            case 49 -> 20;
            case 50 -> 48;
            case 51 -> 38;
            case 52 -> 61;
            case 53 -> 16;
            case 54 -> 44;
            case 55 -> 13;
            case 56 -> 58;
            case 57 -> 3;
            case 58 -> 34;
            case 59 -> 1;
            case 60 -> 47;
            case 61 -> 15;
            case 62 -> 11;
            default -> 10;
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
        m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.j[n3] = new String(cArray);
        return n3;
    }

    public static Class r(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.q(l);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public Color[] m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb) {
        return new Color[]{(Color)((Object)m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.e("\u00eb", (Object)m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.m$$Gr2vdi5rwNemRWuoomZP5ghd0h8VV8W1LFoGrK0Y2u8l8tLdACBaa95r06aEIDDXzuqGUOBd6oXoY9iXn1QC5WrOQ1EbNXNvE, (long)175257519564548L)), m$$jXG0JPn1FUab68Z3juSfQr3vqIHrnSno2on0qU1qLXJPLa3Q7Dbvl9aZ5eD6FwgVRLJ53nsAUiOEFVQQwJMLwdSEKfTxeIK5t};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$3.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

