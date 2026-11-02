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
import me.mioclient.m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM;
import me.mioclient.m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW;
import net.minecraft.class_151;
import net.minecraft.class_2248;
import net.minecraft.class_2338;

final class m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4
extends m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW {
    public static final Object[] c = new Object[7];
    public static final String[] d = new String[7];

    public m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4(String string2) {
    }

    static {
        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.b();
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
            case 0 -> 0;
            case 1 -> 42;
            case 2 -> 46;
            case 3 -> 57;
            case 4 -> 21;
            case 5 -> 23;
            case 6 -> 36;
            case 7 -> 32;
            case 8 -> 29;
            case 9 -> 38;
            case 10 -> 10;
            case 11 -> 43;
            case 12 -> 11;
            case 13 -> 63;
            case 14 -> 13;
            case 15 -> 51;
            case 16 -> 62;
            case 17 -> 53;
            case 18 -> 54;
            case 19 -> 60;
            case 20 -> 15;
            case 21 -> 44;
            case 22 -> 37;
            case 23 -> 14;
            case 24 -> 9;
            case 25 -> 17;
            case 26 -> 8;
            case 27 -> 1;
            case 28 -> 39;
            case 29 -> 34;
            case 30 -> 48;
            case 31 -> 47;
            case 32 -> 16;
            case 33 -> 3;
            case 34 -> 56;
            case 35 -> 40;
            case 36 -> 30;
            case 37 -> 59;
            case 38 -> 27;
            case 39 -> 6;
            case 40 -> 22;
            case 41 -> 12;
            case 42 -> 24;
            case 43 -> 49;
            case 44 -> 33;
            case 45 -> 19;
            case 46 -> 7;
            case 47 -> 58;
            case 48 -> 2;
            case 49 -> 55;
            case 50 -> 18;
            case 51 -> 35;
            case 52 -> 61;
            case 53 -> 4;
            case 54 -> 28;
            case 55 -> 50;
            case 56 -> 45;
            case 57 -> 26;
            case 58 -> 52;
            case 59 -> 41;
            case 60 -> 25;
            case 61 -> 31;
            case 62 -> 20;
            default -> 5;
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
        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.d[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00aa' || c == '\u00cb' || c == '\u00c0' || c == 'o') {
                field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00aa' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'G' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ee' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "Wu\u001fL]nY|XDZu\u0014}\u0015\u0005[{\\G]BV8\u000b[\u0003Y\u0000hsjkUqM|G\u0007B\\YW][bVBS|wO[nOgbi\u0001@\n$bj}4~vi\u0017w7t\\\u0000K\u0002[XA\u0001gf2\\xVV_eWY[`\u0000lUiBTMN]!{C\u007fw{x[wc";
        objectArray[1] = "uD\u0018&\r'uD\u000fz\u0001(o\u000f\u000fd\u0001=h~^;Sv";
        objectArray[2] = "l|a\u0001l\u0014l|v]`\u001bv7vC`\u000eqF'\u001d5E";
        objectArray[3] = "\u0012Q,B>F\u001cXkJ9]QY&\u000b:\u001c;]z\u001b\u000fE(AP\u0017gQNvQM\u0006h'\u0005H\u001ao|;Sni\u001d\u001e6evW9dGQIJ\u001ds\u001aEa\u007fgC:U{\u001a<D)\\3Xg\u001f6LQ\u0019#f%PpVo}\u0012\u0006KD\u0010\\>\u0003D~$d>wU`\u001d\u0018ICx]\u001a";
        objectArray[4] = Boolean.TYPE;
        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.d[4] = "java/lang/Boolean";
        objectArray[5] = "\u0015\u0015{\u001d\u0018D\u001e\u001ajRyJ\u0015\u0011n\b";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "q\u001291`N|\u0014+\\5\u001a<\f9-?{@E\u001e-\u001fJ+  %\u000f\r \u0018$9/\u0006L5;5)\u000fZ\u0013%\u001b!rYE&b\u0000\u007fz\u0000\u0014\u001d7[[E\u0002f\u0000\u0006o#t8<XA\u0005|>nTo\u0011~\u00002LyE\u0000\f=\to#\u0016\u0018\u001d{y\f='nP[F\u0014l\u000f\u0007^NDekWr\u0019)1/\u0007j~}:4Ui\u0015u90U\u0010D$ba\u000f}\u0010)2o6+B=6 \nz\u00008:P";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.e(l);
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
                clazz3 = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.f(405933306474191L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.f(405933306474191L);
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
            int n = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.d(classArray[i], string, clazz2);
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
        int n = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.c(clazz3, string2, clazz2)) != null) {
                    m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.f(405933306474191L);
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
        try {
            bl = m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.b("G", (Object)m$$Vba3dk6xi2ke4rVJ1LukZCbjIWykWJCRQSUOUKwWzQ56HnrvHvEaw8AKQBUubOVwGNH8nlFwU1a9jYNz4ZyFvh2r6PdD7Ma4C, (Object)class_23382, (Object)class_22482, (Object)m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM, (long)447067724171769L) == false;
        }
        catch (class_151 class_1512) {
            throw m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.a(class_1512);
        }
        return bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW$4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

