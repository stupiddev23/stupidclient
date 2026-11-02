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
import me.mioclient.m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4;
import net.minecraft.class_1309;
import net.minecraft.class_1799;

public interface m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ {
    public static final Object[] a = new Object[10];
    public static final String[] b = new String[10];

    static {
        m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a();
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a(clazz3, string2, clazz2)) != null) {
                    m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b(468722306701749L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a(l);
        Object object = a[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = b[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b(468722306701749L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b(468722306701749L);
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

    public static int a(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (b[n3] != null) {
            return n3;
        }
        Object object = a[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 32;
            case 1 -> 54;
            case 2 -> 8;
            case 3 -> 53;
            case 4 -> 6;
            case 5 -> 1;
            case 6 -> 62;
            case 7 -> 16;
            case 8 -> 41;
            case 9 -> 26;
            case 10 -> 24;
            case 11 -> 42;
            case 12 -> 52;
            case 13 -> 38;
            case 14 -> 23;
            case 15 -> 30;
            case 16 -> 5;
            case 17 -> 2;
            case 18 -> 39;
            case 19 -> 55;
            case 20 -> 56;
            case 21 -> 37;
            case 22 -> 61;
            case 23 -> 12;
            case 24 -> 27;
            case 25 -> 60;
            case 26 -> 15;
            case 27 -> 11;
            case 28 -> 29;
            case 29 -> 4;
            case 30 -> 9;
            case 31 -> 25;
            case 32 -> 40;
            case 33 -> 10;
            case 34 -> 28;
            case 35 -> 43;
            case 36 -> 14;
            case 37 -> 20;
            case 38 -> 44;
            case 39 -> 18;
            case 40 -> 34;
            case 41 -> 22;
            case 42 -> 48;
            case 43 -> 58;
            case 44 -> 57;
            case 45 -> 3;
            case 46 -> 63;
            case 47 -> 31;
            case 48 -> 59;
            case 49 -> 0;
            case 50 -> 50;
            case 51 -> 19;
            case 52 -> 7;
            case 53 -> 46;
            case 54 -> 33;
            case 55 -> 17;
            case 56 -> 45;
            case 57 -> 35;
            case 58 -> 51;
            case 59 -> 47;
            case 60 -> 36;
            case 61 -> 21;
            case 62 -> 13;
            default -> 49;
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
        m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b[n3] = new String(cArray);
        return n3;
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static void a() {
        Object[] objectArray = a;
        a[0] = "qT>p\u0004]qT),\bRk\u001f)2\bGln{iP\r";
        objectArray[1] = "~\u001an~v{~\u001ay\"ztdQy<zac +c++";
        objectArray[2] = Integer.TYPE;
        m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b[2] = "java/lang/Integer";
        objectArray[3] = "E\u000eW'\rFK\u0007\u0010/\n]\u0006\u0006]n\fBO,H\r\\Kf:2,\\x_\u0012=|1yI*\u000f\u001b,PnS\r0.\\e;2,\u0010LN\b\u0011\u00013z{>\u001d)>qJ\u001e\r\u0019)]_\b\u0003'4\u007fM.\u001c'Q\u001dF[\r0\na\u001b\u0018>\u0010\u001d^R\b\u001e+QJ\u0011\"\u000f\b=_\u007f\u0006=9.";
        objectArray[4] = Long.TYPE;
        m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b[4] = "java/lang/Long";
        objectArray[5] = "\tRc2\f\u0007\u0002]r}q\u0012\u0010Gp>";
        objectArray[6] = "s\u007fRJ-ixpC\u0005Lgs{G_";
        objectArray[7] = "Yw\b(mM[0L\u00185]B+\u0011t\u0007\u000f\u000fpK\u0018i\u000bA/\u000bg+LSuv!\"LT \u001fb>\\ZK";
        objectArray[8] = "\u0001\u001e \\Fz@\u0001e\u0001{{Z\u001d5R\u0016b\u007f\u0013bA6wG\u001b\u007fR'\u007f^\u0017\u0019\u0006\u0014qG\u0019&_A%^z";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "\u0019\u0005\u001fc}\u001fKB\u000ec\u0011\r_\u0006\u00056w\u001a~\u001d\u001a6T\u0007F\u0018\u001e \u0011]M\u0013\u00038.\u0004\u0018G\u001a[";
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'L' || c == '\u00dc' || c == '\u00c9' || c == 'e') {
                field = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'L' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    default public float m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_1799 class_17992, class_1309 class_13092) {
        return (float)(m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a("\u00c7", (long)688539404344075L) - m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a("\u00a3", (Object)this, (long)573806073576862L)) / ((float)m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a("\u00a3", (Object)class_17992, (Object)class_13092, (long)525829656835273L) * 50.0f + 50.0f);
    }

    public long mio$getLastEatingTime();

    public float mio$getHealthFactor();

    public boolean mio$wasCrawling();

    public void mio$setRole(m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4 var1);

    public m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4 mio$getRole();

    public boolean mio$isNextToWall();

    public int mio$getLastAttackedTicksServer();

    public void mio$resetLastAttackedServer();

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

