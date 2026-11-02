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
import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S;

final class m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3
extends m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S {
    public static final Object[] c = new Object[7];
    public static final String[] d = new String[7];

    public m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3(String string2) {
    }

    static {
        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.b();
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
            case 0 -> 54;
            case 1 -> 32;
            case 2 -> 30;
            case 3 -> 26;
            case 4 -> 40;
            case 5 -> 7;
            case 6 -> 63;
            case 7 -> 59;
            case 8 -> 16;
            case 9 -> 41;
            case 10 -> 4;
            case 11 -> 57;
            case 12 -> 0;
            case 13 -> 52;
            case 14 -> 22;
            case 15 -> 61;
            case 16 -> 27;
            case 17 -> 45;
            case 18 -> 34;
            case 19 -> 46;
            case 20 -> 6;
            case 21 -> 20;
            case 22 -> 56;
            case 23 -> 10;
            case 24 -> 38;
            case 25 -> 12;
            case 26 -> 5;
            case 27 -> 31;
            case 28 -> 42;
            case 29 -> 33;
            case 30 -> 50;
            case 31 -> 55;
            case 32 -> 37;
            case 33 -> 3;
            case 34 -> 13;
            case 35 -> 2;
            case 36 -> 11;
            case 37 -> 15;
            case 38 -> 9;
            case 39 -> 36;
            case 40 -> 18;
            case 41 -> 49;
            case 42 -> 62;
            case 43 -> 17;
            case 44 -> 14;
            case 45 -> 51;
            case 46 -> 24;
            case 47 -> 1;
            case 48 -> 60;
            case 49 -> 19;
            case 50 -> 29;
            case 51 -> 53;
            case 52 -> 21;
            case 53 -> 39;
            case 54 -> 25;
            case 55 -> 44;
            case 56 -> 35;
            case 57 -> 8;
            case 58 -> 43;
            case 59 -> 23;
            case 60 -> 48;
            case 61 -> 47;
            case 62 -> 58;
            default -> 28;
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
        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.d[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == '\u00a4' || c == '\u00e1' || c == '\u00e4') {
                field = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'P' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "y/*qh'r ;>\u0014>} =r*.";
        objectArray[1] = Void.TYPE;
        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.d[1] = "java/lang/Void";
        objectArray[2] = "s2M,\u00052};\n$\u0002)0:Ge\u0002'Ld\u0014\u0019)/Q 3t\u0005\u0015Z\u001c\u0019\u00118nt:\u000f\u0006\u001elG6\u0010-\u0014?)\u0019!2^\u0011naZ &jJ8(+8d|>\r4\u001b\u0011K>T&\"2u\u000e\n\r#jP..6Z%\u007f\u0000\u000e U(T9\n\u001b:\u0005Lg[p\u0000\u0019] 4w?y-";
        objectArray[3] = "t\u000f";
        objectArray[4] = "ey\tB(anv\u0018\rIoe}\u001cW";
        objectArray[5] = "%\u001cdO\rwg\u0001p+Ip}m'\u0014\u0003q%Q$I\\l\u001b";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "odY\u000b=>hl\u0002O\u0002\"z8\t\\G6?d\u0014\u000fO;,W=^k?0k\u001f{l\u0016+o^ml{4F\bADz+i/j9\u0003(-*xK\u0003jK KD\u001f&IX\u000ea\u000e\nh?k{\u001el$\n{b\u0017&Z\u001dL=:\u0010[\u0018kL<\u001fO:hN+;-*[?\b\u0018+Y18 g)YIn53qd";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.e(l);
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
                clazz3 = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.f(350079958917578L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.f(350079958917578L);
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
            int n = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.c(clazz3, string2, clazz2)) != null) {
                    m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.f(350079958917578L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(Runnable runnable) {
        CallSite callSite = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.b("P", (Object)this, (long)462331011833216L);
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((float)callSite[0], (float)callSite[1], (float)callSite[2], (float)callSite[3]);
        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.b("P", (Object)runnable, (long)401941405412644L);
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public float[] m$$eeMyaxx6EtrKQgapnwsBfYus2Tf4jZdxN5uuCS3Lv1FAAL4WLrNPxU47kATtSRqQ28fBhXxFqu7uNGtRFsASVQDde1Fb5GF75() {
        return new float[]{1.0f, 0.7f, 0.0f, 1.0f};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

