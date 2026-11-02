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
import me.mioclient.m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb;
import me.mioclient.m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U;

final class m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2
extends m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U {
    public static final Object[] i = new Object[3];
    public static final String[] j = new String[3];

    public m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2(String string2) {
    }

    static {
        m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.e();
    }

    public static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'J' || c == 'k' || c == '\u00e5' || c == '\u00c4') {
                field = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.s(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'J' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.t(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'u' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        i[0] = "\n\u0011{\b<(\u0004\u0018<\u0000;3I\u0019qA8 \rC9*\u0012-\u0005\u001a\u0005\u000e2\u0002*\u00157$0+/\u0000\u0004-=+)'\u001e\ba5%C0\u0015\u0005(\u0000\u001e\u0013\u00038/\u00040\u0006\u0014`\u0003\b\u001cc3\u0006~_0;6m-\u0010  R3v^E\u0011\n\u001cs\u0012B'\u0001=4\u0014\f$\u001d\u0001!\u00126\u001b\u0014\r>.\u0017<#`";
        objectArray[1] = "\\&\u0013|z\"W)\u00023\u001b,\\\"\u0006i";
        Object[] objectArray2 = objectArray;
        objectArray[2] = "\t\nv\bt\u0010\u0005J ny\u0019\u0013js\nk\u0019oF\u007f\u000eo\t\u0016\u0004a\r\u0016";
    }

    public static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.e(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.q(l);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.r(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.r(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.i(clazz3, string2, clazz2)) != null) {
                    m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.j(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.r(100501487404292L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method t(long l) {
        int n = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.q(l);
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
                clazz3 = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.r(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.r(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.i(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.r(100501487404292L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.j(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.r(100501487404292L);
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
        Field field = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.j(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method j(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.i(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.j(classArray2[i], string, clazz2, n, classArray);
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
            case 0 -> 35;
            case 1 -> 23;
            case 2 -> 46;
            case 3 -> 58;
            case 4 -> 30;
            case 5 -> 1;
            case 6 -> 24;
            case 7 -> 36;
            case 8 -> 19;
            case 9 -> 0;
            case 10 -> 5;
            case 11 -> 43;
            case 12 -> 32;
            case 13 -> 51;
            case 14 -> 7;
            case 15 -> 56;
            case 16 -> 53;
            case 17 -> 11;
            case 18 -> 26;
            case 19 -> 3;
            case 20 -> 17;
            case 21 -> 2;
            case 22 -> 54;
            case 23 -> 21;
            case 24 -> 34;
            case 25 -> 12;
            case 26 -> 48;
            case 27 -> 13;
            case 28 -> 59;
            case 29 -> 60;
            case 30 -> 20;
            case 31 -> 50;
            case 32 -> 40;
            case 33 -> 6;
            case 34 -> 14;
            case 35 -> 15;
            case 36 -> 27;
            case 37 -> 38;
            case 38 -> 61;
            case 39 -> 10;
            case 40 -> 47;
            case 41 -> 41;
            case 42 -> 62;
            case 43 -> 37;
            case 44 -> 18;
            case 45 -> 39;
            case 46 -> 4;
            case 47 -> 9;
            case 48 -> 57;
            case 49 -> 42;
            case 50 -> 22;
            case 51 -> 31;
            case 52 -> 8;
            case 53 -> 25;
            case 54 -> 49;
            case 55 -> 45;
            case 56 -> 16;
            case 57 -> 33;
            case 58 -> 29;
            case 59 -> 63;
            case 60 -> 44;
            case 61 -> 28;
            case 62 -> 52;
            default -> 55;
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
        m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.j[n3] = new String(cArray);
        return n3;
    }

    public static Class r(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.q(l);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.i[n] = clazz = Class.forName(j[n]);
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
        return new Color[]{(Color)((Object)m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.e("u", (Object)m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.m$$TddcUKDI7TOOBw3M7NZldvCBNE2MgpZ8cW8E2DanFNae272LDxj7t0jJsUMUKJxLCFAZwshwgyxAkZlAMocPfPg8mDC6Hax40, (long)197692590266382L)), m$$jXG0JPn1FUab68Z3juSfQr3vqIHrnSno2on0qU1qLXJPLa3Q7Dbvl9aZ5eD6FwgVRLJ53nsAUiOEFVQQwJMLwdSEKfTxeIK5t};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U$2.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

