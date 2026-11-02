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
import me.mioclient.m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;

final class m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2
extends m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N {
    public static final long a;
    public static final Object[] d;
    public static final String[] e;

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new Object[5];
        e = new String[5];
        m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.b();
        long l = 4153459566069678924L;
        a = 0x7FA281C5EE133BD2L ^ l;
    }

    public static int e(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (e[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 62;
            case 1 -> 40;
            case 2 -> 32;
            case 3 -> 38;
            case 4 -> 49;
            case 5 -> 36;
            case 6 -> 48;
            case 7 -> 12;
            case 8 -> 56;
            case 9 -> 37;
            case 10 -> 46;
            case 11 -> 20;
            case 12 -> 50;
            case 13 -> 51;
            case 14 -> 0;
            case 15 -> 14;
            case 16 -> 43;
            case 17 -> 1;
            case 18 -> 22;
            case 19 -> 54;
            case 20 -> 41;
            case 21 -> 58;
            case 22 -> 26;
            case 23 -> 18;
            case 24 -> 63;
            case 25 -> 10;
            case 26 -> 33;
            case 27 -> 9;
            case 28 -> 24;
            case 29 -> 34;
            case 30 -> 15;
            case 31 -> 52;
            case 32 -> 42;
            case 33 -> 3;
            case 34 -> 11;
            case 35 -> 17;
            case 36 -> 2;
            case 37 -> 55;
            case 38 -> 45;
            case 39 -> 4;
            case 40 -> 5;
            case 41 -> 27;
            case 42 -> 35;
            case 43 -> 19;
            case 44 -> 53;
            case 45 -> 6;
            case 46 -> 61;
            case 47 -> 8;
            case 48 -> 23;
            case 49 -> 21;
            case 50 -> 29;
            case 51 -> 28;
            case 52 -> 7;
            case 53 -> 16;
            case 54 -> 31;
            case 55 -> 13;
            case 56 -> 44;
            case 57 -> 59;
            case 58 -> 39;
            case 59 -> 60;
            case 60 -> 25;
            case 61 -> 47;
            case 62 -> 30;
            default -> 57;
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
        m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.e[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ba' || c == 'o' || c == '\u00de' || c == '\u00d3') {
                field = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ba' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'C' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'e' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = d;
        d[0] = "<9QAK#20\u0016IL8\u007f1[\bO+;k\u0013ce&32/GE\t\u001c=\u001dmG \u0019(.dJ \u001f\u000f4A\u0016>\u0013k\u001a\\r#669JO$2\u0018,]\u0017\b>4Izqui\u0018\u0011\u007f\u001a&&\b\n\u001bD}hm;Ckx$j\rHJ?\"$\u000eTv*$\u001e1]z5\u0018?\u0016j\u0017";
        objectArray[1] = Integer.TYPE;
        m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.e[1] = "java/lang/Integer";
        objectArray[2] = "|@gJQSwOv\u00050]|Dr_";
        objectArray[3] = "frPVATd'\u0001)\\Fq\u000f\u0015\u0018c+\"\f\"\u0018e6\u0007\u0006UlA\u00067\u0015>qD$\u0011*1v\u00053`;W\u0013X*%\u0016*I\u0003*\u0016 _\u0014\u0005\u0001\"40y\u00053\u0000.\n\u0014V5<,\u0000wx\u0016\u0017\u0015\u0010PK+>,4B_01r)r\t\u000be\u0019)jC1#(\fE\u00035\u001f\u0011nU\u0005Zm4\u000fJ@\b]r\t\u0013S\u0010;%\b\u0019Bj";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "j\u00063\u0002~\u000bhSb}iX-ad\u0019{XQ\u0006jGlO7QkM}5";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.e(l);
        Object object = d[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.f(169448939329132L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.f(169448939329132L);
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
            int n = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.e(l);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.e(l);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.c(clazz3, string2, clazz2)) != null) {
                    m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.f(169448939329132L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public boolean m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5) {
        return m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.b("C", (Object)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5, (long)346120420935485L).equals(m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.b("C", (Object)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5, (int)((int)a), (long)260103023851166L));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

