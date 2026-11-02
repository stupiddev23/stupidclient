/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import com.google.gson.JsonElement;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm;

final class m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5
extends m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm {
    public static final Object[] c = new Object[11];
    public static final String[] d = new String[11];

    public m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5(String string2) {
    }

    static {
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.b();
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
            case 0 -> 43;
            case 1 -> 19;
            case 2 -> 44;
            case 3 -> 22;
            case 4 -> 14;
            case 5 -> 18;
            case 6 -> 28;
            case 7 -> 1;
            case 8 -> 36;
            case 9 -> 49;
            case 10 -> 9;
            case 11 -> 17;
            case 12 -> 24;
            case 13 -> 45;
            case 14 -> 51;
            case 15 -> 47;
            case 16 -> 29;
            case 17 -> 5;
            case 18 -> 42;
            case 19 -> 62;
            case 20 -> 15;
            case 21 -> 53;
            case 22 -> 52;
            case 23 -> 41;
            case 24 -> 38;
            case 25 -> 3;
            case 26 -> 23;
            case 27 -> 21;
            case 28 -> 46;
            case 29 -> 4;
            case 30 -> 63;
            case 31 -> 30;
            case 32 -> 12;
            case 33 -> 33;
            case 34 -> 54;
            case 35 -> 10;
            case 36 -> 11;
            case 37 -> 56;
            case 38 -> 34;
            case 39 -> 7;
            case 40 -> 6;
            case 41 -> 39;
            case 42 -> 8;
            case 43 -> 55;
            case 44 -> 25;
            case 45 -> 32;
            case 46 -> 31;
            case 47 -> 60;
            case 48 -> 58;
            case 49 -> 2;
            case 50 -> 27;
            case 51 -> 13;
            case 52 -> 20;
            case 53 -> 26;
            case 54 -> 50;
            case 55 -> 57;
            case 56 -> 40;
            case 57 -> 48;
            case 58 -> 59;
            case 59 -> 0;
            case 60 -> 37;
            case 61 -> 16;
            case 62 -> 35;
            default -> 61;
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
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.d[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'l' || c == 'p' || c == 'S' || c == 'K') {
                field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'l' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'S' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'U' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "i|\u0014\\IGguSTN\\*t\u001e\u0015\u0019aL|RzGZj^\tb\u0017dGN\u000eDSmErOwz\u001e2t\f\\\u0012\u001ba.^kCM@PBxy\u0019mx~`yQT(OeSGR!U\tA|=~t\\g\u001aA[b\u0001\u0014[t)mT\u0016gLQTgy\u0011s][\u0003GKcnlAj";
        objectArray[1] = "U5\u001d>mxK=\u0007q\u0000bS8\u000e<7dP:";
        objectArray[2] = "\u0006E\u0010%G1\u0018M\nj%-\u001fP";
        objectArray[3] = Void.TYPE;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.d[3] = "java/lang/Void";
        objectArray[4] = "H1,oulF8kgrw\u000b9&&%pubDVNSU1DpmOredhutt5Uzrm_'J5z@H'FJnRW>;0zFTdZctE_\u0015U[OU\u0010\u0002:Q/:\u001d#iFxb\\7lL^O]\rOa}`s96O_0SmWnRH\u0011<6T^";
        objectArray[5] = " z@\u0011Hs,rAZ\u0001{0zC\u0011eo,{hSJq&{Y";
        objectArray[6] = "F-/xsBM\">7\u0012LF):m";
        objectArray[7] = "X\f\u001dT{bY\f[M\u001cp\u0006X\u000eH\u001c!\u000b^\u0019\r'z\u0010\u000bW2";
        objectArray[8] = "/=K\u000e\u0016Pu+Bm\u0005_o\u0015V\u0002\u000bIo5JmS\bu)B\u0014\u0007_n5;";
        objectArray[9] = "E\u0017\u007f\by\"\u0006T\u007fHD2\u0004K'2?;\u0018,~H8`F\u0013!\u001d>!~\u0016+\u001b:cEM0Nt\\";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "Di9\u001f4\"\u0007*9_\t \u0018\u0010\u007f\u0000o\\Cjx[1c\u001c?~\u001a\t";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.e(l);
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
                clazz3 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.f(454773619307061L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.f(454773619307061L);
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
            int n = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.c(clazz3, string2, clazz2)) != null) {
                    m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.f(454773619307061L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public JsonElement toJson() {
        return m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.b("\u00e3", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$yVT4VoLOHdapVlAjSBHXNenkaq3SMmjhcBMpX0Ye84O2y5UIW3vAxXi3HPguIO3kxDsd1qiw6hXvxrwVIiBT0fOQW4HyJdlXr, (long)703817953756896L);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void fromJson(JsonElement jsonElement) {
        List list = (List)((Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.b("\u00e3", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$yVT4VoLOHdapVlAjSBHXNenkaq3SMmjhcBMpX0Ye84O2y5UIW3vAxXi3HPguIO3kxDsd1qiw6hXvxrwVIiBT0fOQW4HyJdlXr, (long)574216657454950L));
        synchronized (list) {
            m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.b("\u00e3", (Object)((List)((Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.b("\u00e3", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$yVT4VoLOHdapVlAjSBHXNenkaq3SMmjhcBMpX0Ye84O2y5UIW3vAxXi3HPguIO3kxDsd1qiw6hXvxrwVIiBT0fOQW4HyJdlXr, (long)574216657454950L))), (long)537865286936526L);
            m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.b("\u00e3", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$yVT4VoLOHdapVlAjSBHXNenkaq3SMmjhcBMpX0Ye84O2y5UIW3vAxXi3HPguIO3kxDsd1qiw6hXvxrwVIiBT0fOQW4HyJdlXr, (Object)jsonElement, (long)682090666619113L);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

