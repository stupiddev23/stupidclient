/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import io.netty.channel.ChannelHandlerContext;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import me.mioclient.m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS$m$;

public interface m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS {
    public static final Object[] g = new Object[10];
    public static final String[] h = new String[10];

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(ChannelHandlerContext var1);

    public m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(byte[] var1);

    public byte[] m$$hMTBTUjMqExxvG5onCLFCGdCJAEZnuiCgBOlbCY7Hj7Pq4xgpywXm76h4tTUpcnqt5P775xvu3X5CCEZ7o5riE6AWY4V8FmUJ();

    public short m$$Q75n5RmileGubHNqHGkJbYJ4Ow77tcQUkQSnSDzxJKuW6aW10e6T4w5Fd51GppdbFva1PrakU08a1M2eeKksAAVw5xT7meZ1z();

    default public DataInputStream m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(byte[] byArray) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.a("\u00cd", (Object)dataInputStream, (long)573894744030797L);
        return dataInputStream;
    }

    default public m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$cHoCIJVyvve7jcDPES24ZHNm1Cu9gAMfHI6fHqyrnzgAxyh0Z1tDFI5M5AS4oa0JXzZUyDiwkf86Lzq7mfz6Ky0GC9eaNVsFO() {
        m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82 = new m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(new ByteArrayOutputStream());
        m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.a("\u00cd", (Object)zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82, (int)m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.a("\u00cd", (Object)this, (long)663109047032494L), (long)535976404511876L);
        return zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82;
    }

    static {
        m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.a();
    }

    public static int a(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (h[n3] != null) {
            return n3;
        }
        Object object = g[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 8;
            case 1 -> 10;
            case 2 -> 0;
            case 3 -> 54;
            case 4 -> 18;
            case 5 -> 28;
            case 6 -> 11;
            case 7 -> 19;
            case 8 -> 43;
            case 9 -> 63;
            case 10 -> 1;
            case 11 -> 2;
            case 12 -> 41;
            case 13 -> 49;
            case 14 -> 24;
            case 15 -> 6;
            case 16 -> 4;
            case 17 -> 35;
            case 18 -> 12;
            case 19 -> 13;
            case 20 -> 30;
            case 21 -> 27;
            case 22 -> 51;
            case 23 -> 34;
            case 24 -> 39;
            case 25 -> 44;
            case 26 -> 25;
            case 27 -> 58;
            case 28 -> 62;
            case 29 -> 53;
            case 30 -> 3;
            case 31 -> 9;
            case 32 -> 23;
            case 33 -> 20;
            case 34 -> 26;
            case 35 -> 61;
            case 36 -> 45;
            case 37 -> 31;
            case 38 -> 47;
            case 39 -> 33;
            case 40 -> 60;
            case 41 -> 22;
            case 42 -> 7;
            case 43 -> 17;
            case 44 -> 38;
            case 45 -> 56;
            case 46 -> 36;
            case 47 -> 29;
            case 48 -> 21;
            case 49 -> 52;
            case 50 -> 50;
            case 51 -> 46;
            case 52 -> 40;
            case 53 -> 5;
            case 54 -> 16;
            case 55 -> 14;
            case 56 -> 55;
            case 57 -> 37;
            case 58 -> 32;
            case 59 -> 48;
            case 60 -> 15;
            case 61 -> 57;
            case 62 -> 42;
            default -> 59;
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
        m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.h[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = g;
        g[0] = "gIei]Ji@\"aZQ$Ao rP?\u0014?<cqnx&rU|LH,Mg\u0016BM\tExT;A\u0012@aG9i;W\u0005dh\u0014y}rlDk\u0000|^r2\u001d~CU\u0015Ix;]}bO[<WvksN\u001ehCVZY\u001c5\u0001rc\u001d?Sr\u0010xZ#oAWev\u001ffg\u0001g\bo~A\\mi\u00137f\\MXxRXT]\u001fsj\\H}\u0014\u001fGCD{\u001d\ta]js`\n7^\u0013Rm)rlleI\b7z\u0017R\u0014<Q\fInJ\u0012w\u0004O<F<c\u0006q`^*7x}o\u001b<QniOi*~EV<B\b4l\u001d]\u0015\r<";
        objectArray[1] = Integer.TYPE;
        m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.h[1] = "java/lang/Integer";
        objectArray[2] = Void.TYPE;
        m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.h[2] = "java/lang/Void";
        objectArray[3] = "@GI\"32NN\u000e*4)\u0003OCk\u001c(\u0018\u001a\u0013w\r\tIv\n9;\u0004kF\u0000\u0006\tneC%\u000e\u0016,\u001cO>\u000b\u000f?\u001eg\u0017\u001ck\u001cO\u001aU6\u001c\u0014ce,70\n\u0015\u0013R\b;mnv\u0017\u0016\u0013\u001ahU\u0010\u001c\u0018\u0013T@2#-.}W0~o\nD\u0013\u0013\u0018\u001ch_T\u000f$//Bx3-\t";
        objectArray[4] = Short.TYPE;
        m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.h[4] = "java/lang/Short";
        objectArray[5] = "\u0011^+Ep{\u0014\u0011\u0019E*s2Q-Q*A\u000fM8E3";
        objectArray[6] = "&>\u0017W,$-1\u0006\u0018M*&:\u0002B";
        objectArray[7] = "\u007f=N@N..c\u0007.C- \"Qu\\0;\"<T\u0000&}>\u0003H\u0007fAgERL)&:UMXW";
        objectArray[8] = "\ntv\u001eI S|%\u000bt?[%&?\u0014\"L0J^\u0006:\\</^\u001d.\u000bL";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "\u0002+Aa:\u001d\u0004,^{\n\u0016\u0014jw\"7\u0015\u0005\u001cK|n\u001ew;D]L\nx\tM_`\"zzib5LD-w@i*c uQx\u0003z\u0005SB4\u001ag\u007f\u0016p4/\u00049\u0013SfN\u0001\tVef\u0019v8G$R\tQ%s%:\u001a\u0001\u0003\u0014pg0[=gTT\f\u00056r\"o\u001ej\u007f\\\u001d0\u0001G,^x0\u001aS{.";
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.a(l);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.a(l);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.a(clazz3, string2, clazz2)) != null) {
                    m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.b(491824486862821L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Method d(long l) {
        int n = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.a(l);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.b(491824486862821L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.b(491824486862821L);
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

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'x' || c == '\u00f9' || c == '\u00d8' || c == '$') {
                field = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'x' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f9' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

