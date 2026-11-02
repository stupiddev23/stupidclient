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
import me.mioclient.m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI;
import me.mioclient.m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z;

final class m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2
extends m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z {
    public static final Object[] c = new Object[3];
    public static final String[] d = new String[3];

    public m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2(String string2) {
    }

    static {
        m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.b();
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
            case 0 -> 60;
            case 1 -> 25;
            case 2 -> 37;
            case 3 -> 50;
            case 4 -> 15;
            case 5 -> 51;
            case 6 -> 61;
            case 7 -> 1;
            case 8 -> 53;
            case 9 -> 31;
            case 10 -> 38;
            case 11 -> 28;
            case 12 -> 23;
            case 13 -> 47;
            case 14 -> 26;
            case 15 -> 40;
            case 16 -> 16;
            case 17 -> 52;
            case 18 -> 22;
            case 19 -> 8;
            case 20 -> 14;
            case 21 -> 36;
            case 22 -> 42;
            case 23 -> 63;
            case 24 -> 24;
            case 25 -> 58;
            case 26 -> 30;
            case 27 -> 43;
            case 28 -> 21;
            case 29 -> 19;
            case 30 -> 20;
            case 31 -> 4;
            case 32 -> 59;
            case 33 -> 44;
            case 34 -> 35;
            case 35 -> 54;
            case 36 -> 41;
            case 37 -> 2;
            case 38 -> 3;
            case 39 -> 49;
            case 40 -> 39;
            case 41 -> 9;
            case 42 -> 46;
            case 43 -> 29;
            case 44 -> 13;
            case 45 -> 11;
            case 46 -> 10;
            case 47 -> 45;
            case 48 -> 33;
            case 49 -> 12;
            case 50 -> 6;
            case 51 -> 56;
            case 52 -> 62;
            case 53 -> 5;
            case 54 -> 17;
            case 55 -> 57;
            case 56 -> 55;
            case 57 -> 7;
            case 58 -> 48;
            case 59 -> 0;
            case 60 -> 32;
            case 61 -> 18;
            case 62 -> 34;
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
        m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.d[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c8' || c == 'B' || c == 'c' || c == 'Z') {
                field = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'V' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "]`1\u0016\u0012_Siv\u001e\u0015D\u001eh;_\u0016WZ2s4<ZRkO\u0010\u001cu}d}:\u001e\\xqN3\u0013\\~VT\u0016OBr2z\u000b+_WoY\u001d\u0016XSAL\nNt_m)-(\t\bAq(CZGQjL\u001d\u0001\t4[\u00142\u0004E3m\u001f\u0013CC}n\u0003/VEGQ\n#Iyfv=N";
        objectArray[1] = "i\u0015wSAcb\u001af\u001c mi\u0011bF";
        Object[] objectArray2 = objectArray;
        objectArray[2] = "d1I`d\n=<\u0005\u000fw\u001b\"\u0000\u0010ke\u001b^$GdzLo9\u0014e\u0018";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.e(l);
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
                clazz3 = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.f(76667426542019L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.f(76667426542019L);
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
            int n = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.c(clazz3, string2, clazz2)) != null) {
                    m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.f(76667426542019L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public Color[] m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI, float f) {
        return new Color[]{(Color)((Object)m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.b("F", (Object)m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI.m$$lLgjSCS3ZMzoPaG6hDaSnoXnKlzuarpYmf2BakqBwQrwYiIv9QSIgWHgYhlM6BslW6Hj1E9fGNHjAlTs57Y9XHHN15FQWaQak, (long)193098269922971L)), (Color)((Object)m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.b("F", (Object)m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI.m$$WR7aFfS3iXtYzRqUbD50vw3KlaxLm5RCZgDYUrf5yEUOgWZJUpUKvkiKUjS67nGGh1Y3q5XKf23Qo1qykK1GCswvraYz3SjJX, (long)193098269922971L))};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

