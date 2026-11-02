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

final class m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2
extends m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb {
    public static final Object[] i = new Object[3];
    public static final String[] j = new String[3];

    public m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2(String string2) {
    }

    static {
        m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.e();
    }

    public static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c1' || c == 'U' || c == '\u00f3' || c == '\u00e3') {
                field = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.s(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c1' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'U' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.t(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00de' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        i[0] = "U\u0018\u001d13n[\u0011Z94u\u0016\u0010\u0017x7fRJ_\u0013\u001dkZ\u0013c7=Du\u001cQ\u001d?mp\tb\u00142mv.x1nszJV,\nn_\u0017u:7i[9`-oEW\u0015\u0005\n\t8\u00009]\u000fbkO)Fk<0\u0001Lw3\u00135MKA82rK\u0005B$\u000egM?}-\u0002xq\u001eZ\u001ao";
        objectArray[1] = "\u0011^HgVM\u001aQY(7C\u0011Z]r";
        Object[] objectArray2 = objectArray;
        objectArray[2] = "O\u00024D&-\u001fO.}t0\b.#\u0019f0t\u00018\u001ad#\u000e\u0012)\u0000\u001b";
    }

    public static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.e(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.q(l);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.r(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.r(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.i(clazz3, string2, clazz2)) != null) {
                    m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.j(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.r(98714713643742L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method t(long l) {
        int n = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.q(l);
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
                clazz3 = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.r(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.r(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.i(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.r(98714713643742L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.j(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.r(98714713643742L);
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
        Field field = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.j(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method j(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.i(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.j(classArray2[i], string, clazz2, n, classArray);
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
            case 0 -> 46;
            case 1 -> 42;
            case 2 -> 16;
            case 3 -> 41;
            case 4 -> 40;
            case 5 -> 38;
            case 6 -> 57;
            case 7 -> 63;
            case 8 -> 13;
            case 9 -> 25;
            case 10 -> 24;
            case 11 -> 35;
            case 12 -> 30;
            case 13 -> 28;
            case 14 -> 3;
            case 15 -> 20;
            case 16 -> 19;
            case 17 -> 51;
            case 18 -> 33;
            case 19 -> 15;
            case 20 -> 43;
            case 21 -> 37;
            case 22 -> 61;
            case 23 -> 14;
            case 24 -> 55;
            case 25 -> 49;
            case 26 -> 52;
            case 27 -> 32;
            case 28 -> 39;
            case 29 -> 53;
            case 30 -> 45;
            case 31 -> 8;
            case 32 -> 9;
            case 33 -> 54;
            case 34 -> 31;
            case 35 -> 34;
            case 36 -> 23;
            case 37 -> 62;
            case 38 -> 0;
            case 39 -> 18;
            case 40 -> 36;
            case 41 -> 10;
            case 42 -> 6;
            case 43 -> 17;
            case 44 -> 5;
            case 45 -> 58;
            case 46 -> 29;
            case 47 -> 60;
            case 48 -> 11;
            case 49 -> 27;
            case 50 -> 1;
            case 51 -> 4;
            case 52 -> 59;
            case 53 -> 2;
            case 54 -> 47;
            case 55 -> 56;
            case 56 -> 12;
            case 57 -> 21;
            case 58 -> 44;
            case 59 -> 22;
            case 60 -> 50;
            case 61 -> 48;
            case 62 -> 26;
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
        m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.j[n3] = new String(cArray);
        return n3;
    }

    public static Class r(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.q(l);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.i[n] = clazz = Class.forName(j[n]);
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
        return new Color[]{m$$jXG0JPn1FUab68Z3juSfQr3vqIHrnSno2on0qU1qLXJPLa3Q7Dbvl9aZ5eD6FwgVRLJ53nsAUiOEFVQQwJMLwdSEKfTxeIK5t, (Color)((Object)m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.e("\u00de", (Object)m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.m$$tBkbnaFgx22Z8TKMbu0dA4SRb9NWXDxelsBhNPlABAKA5gimeyVAjeqj3dCCtEpaPgGB3YbHoiwWpSinRYPpjm8hK7aZfoZaf, (long)189565266661990L))};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$8n7mDUq0tirPv3qNu4KyAC7bvuu27yZUWB9AS512XB6COktUbaxbXveFXn31pzIbQ7yz7LSollKOP98RLtHmqLO2HxmFnbaeb$2.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

