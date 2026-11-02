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

final class m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2
extends m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S {
    public static final Object[] c = new Object[7];
    public static final String[] d = new String[7];

    public m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2(String string2) {
    }

    static {
        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.b();
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
            case 0 -> 19;
            case 1 -> 16;
            case 2 -> 36;
            case 3 -> 43;
            case 4 -> 54;
            case 5 -> 4;
            case 6 -> 41;
            case 7 -> 56;
            case 8 -> 12;
            case 9 -> 49;
            case 10 -> 37;
            case 11 -> 44;
            case 12 -> 2;
            case 13 -> 35;
            case 14 -> 22;
            case 15 -> 17;
            case 16 -> 42;
            case 17 -> 51;
            case 18 -> 62;
            case 19 -> 40;
            case 20 -> 11;
            case 21 -> 57;
            case 22 -> 58;
            case 23 -> 23;
            case 24 -> 1;
            case 25 -> 47;
            case 26 -> 14;
            case 27 -> 15;
            case 28 -> 45;
            case 29 -> 27;
            case 30 -> 24;
            case 31 -> 48;
            case 32 -> 20;
            case 33 -> 61;
            case 34 -> 9;
            case 35 -> 38;
            case 36 -> 28;
            case 37 -> 34;
            case 38 -> 33;
            case 39 -> 6;
            case 40 -> 32;
            case 41 -> 3;
            case 42 -> 46;
            case 43 -> 25;
            case 44 -> 18;
            case 45 -> 29;
            case 46 -> 39;
            case 47 -> 8;
            case 48 -> 63;
            case 49 -> 21;
            case 50 -> 5;
            case 51 -> 55;
            case 52 -> 30;
            case 53 -> 52;
            case 54 -> 13;
            case 55 -> 26;
            case 56 -> 53;
            case 57 -> 0;
            case 58 -> 59;
            case 59 -> 50;
            case 60 -> 60;
            case 61 -> 7;
            case 62 -> 10;
            default -> 31;
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
        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.d[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'R' || c == 'E' || c == '\u00ca' || c == '\u00dd') {
                field = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'R' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'N' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'W' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "^\u0014'\u0019M{U\u001b6V1bZ\u001b0\u001a\u000fr";
        objectArray[1] = Void.TYPE;
        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.d[1] = "java/lang/Void";
        objectArray[2] = "\u0005!P\u001arn\u000b(\u0017\u0012uuF)ZSu{:w\t/^s'3.BrI,\u000f\u0004'O2\u0002)\u00120i01%\r\u001bcc_\n<\u0004)M\u0018rG\u0016Q6<+5\u001dO8\n-\u0010\u0002lM=-I\u0010Un\u0003\u001d\u0017;T6&=3\u0000-y\t\u0013\u0013\u0016\"t\"*\u0017-MY:tFFwE+3)AH%Z";
        objectArray[3] = "{S";
        objectArray[4] = "+x\r\u0019L! w\u001cV-/+|\u0018\f";
        objectArray[5] = "\u000ekEPPvX'\u0016/Mg\u0004ZE\u0010Vk\u001c8@L\u0006*b";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "cZ\u000fF\n2g\u001b\u000e\u0005e%v\u0007R\u0011 13[OB(< hf\u0013\f8<TD6\u000b\u0011'P\u0005 \u000b|8yS\f#}'Vt'^\u0004$\u0012q5,\u0004ft{\u0006#\u0018*v\u0003C\u0006\t\u0006Wd&\u001c\u0019`\u001bQ6\u0005\u0010*eF\u0001Z=\u001cdC&+;\u0013pa%),7\u0012q\u0016X\u000f\u0014\u0014\u0002|_/1E\u000f@Z\u007f7J?";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.e(l);
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
                clazz3 = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.f(303177281539075L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.f(303177281539075L);
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
            int n = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.c(clazz3, string2, clazz2)) != null) {
                    m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.f(303177281539075L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(Runnable runnable) {
        CallSite callSite = m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.b("N", (Object)this, (long)456033583413710L);
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((float)callSite[0], (float)callSite[1], (float)callSite[2], (float)callSite[3]);
        m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.b("N", (Object)runnable, (long)375039593036875L);
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public float[] m$$eeMyaxx6EtrKQgapnwsBfYus2Tf4jZdxN5uuCS3Lv1FAAL4WLrNPxU47kATtSRqQ28fBhXxFqu7uNGtRFsASVQDde1Fb5GF75() {
        return new float[]{0.3f, 0.0f, 1.0f, 1.0f};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

