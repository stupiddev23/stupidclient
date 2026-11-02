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
import java.util.Set;
import me.mioclient.m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM;
import me.mioclient.m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW;
import net.minecraft.class_2248;
import net.minecraft.class_2338;

final class m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3
extends m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW {
    public static final Object[] c = new Object[6];
    public static final String[] d = new String[6];

    public m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3(String string2) {
    }

    static {
        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.b();
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
            case 0 -> 20;
            case 1 -> 3;
            case 2 -> 56;
            case 3 -> 9;
            case 4 -> 16;
            case 5 -> 6;
            case 6 -> 26;
            case 7 -> 59;
            case 8 -> 49;
            case 9 -> 51;
            case 10 -> 12;
            case 11 -> 27;
            case 12 -> 63;
            case 13 -> 42;
            case 14 -> 18;
            case 15 -> 19;
            case 16 -> 44;
            case 17 -> 45;
            case 18 -> 30;
            case 19 -> 11;
            case 20 -> 29;
            case 21 -> 54;
            case 22 -> 17;
            case 23 -> 36;
            case 24 -> 47;
            case 25 -> 60;
            case 26 -> 25;
            case 27 -> 31;
            case 28 -> 62;
            case 29 -> 38;
            case 30 -> 40;
            case 31 -> 7;
            case 32 -> 58;
            case 33 -> 4;
            case 34 -> 32;
            case 35 -> 1;
            case 36 -> 43;
            case 37 -> 33;
            case 38 -> 8;
            case 39 -> 5;
            case 40 -> 61;
            case 41 -> 15;
            case 42 -> 57;
            case 43 -> 52;
            case 44 -> 23;
            case 45 -> 14;
            case 46 -> 34;
            case 47 -> 28;
            case 48 -> 35;
            case 49 -> 41;
            case 50 -> 53;
            case 51 -> 46;
            case 52 -> 39;
            case 53 -> 24;
            case 54 -> 21;
            case 55 -> 50;
            case 56 -> 55;
            case 57 -> 10;
            case 58 -> 0;
            case 59 -> 2;
            case 60 -> 13;
            case 61 -> 37;
            case 62 -> 48;
            default -> 22;
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
        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.d[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e9' || c == 'J' || c == '\u00ff' || c == 'p') {
                field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e9' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'U' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "74\u001cK[2)<\u0006\u0004&\")";
        objectArray[1] = "{\u001fR5Ytp\u0010Cz8z{\u001bG ";
        objectArray[2] = Boolean.TYPE;
        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.d[2] = "java/lang/Boolean";
        objectArray[3] = "`vX(\u0012Yn\u007f\u001f \u0015B#~Ra\u0016Qg$\u001a\n<\\o}&.\u001cs@r\u0014\u0004\u001eZEg'\r\u0013ZC@=(ODO$\u00135+Yjy0#\u0016^nW%4Nrb{@\u0013(\u000f5W\u0018\u0016C\\zG\u0003r\u001d\u00074\"2*2\u0002x%\u0004!\u0013E~k\u0007=/PxQ84#ODp\u001f\u0003N";
        objectArray[4] = "K#=>Fn\u001e056z;\u001c'\u000e2\u001e)\u001c[.\"\u0003j\u0011?!7CT";
        Object[] objectArray2 = objectArray;
        objectArray[5] = "\u001d{ca,,\u001dx!Qw6\u0010a70z*vc'(\"1\u0012l2h\u001ch\u0016fc`#8J\".Q";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.e(l);
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
                clazz3 = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.f(89548864113205L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.f(89548864113205L);
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
            int n = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.c(clazz3, string2, clazz2)) != null) {
                    m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.f(89548864113205L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public boolean m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2338 class_23382, class_2248 class_22482, m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM) {
        return (boolean)m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.b("\u00d0", (Object)((Set)((Object)m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.b("\u00d0", (Object)m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM.m$$FIZG7lMU1VBbTOcHElAKj4URui8N0zLcL4lCGvVtPAkqMpJCjqRCIQb9U5MDp631ZUA3SVyNiZB67vXxibbiPkRsOsqr86Dod, (long)281949530342256L))), (Object)class_22482, (long)410271375940991L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

