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
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH {
    public static final double m$$gb6bwZF4wCl9x3wMViBdlDB0CjnOJJwfyX0rJblHgyBEWcltK4VkEHyvBz7fOAloUcBf2p8hoHRfRhqeX418hpsHCHfIA5qdU;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[8];
        b = new String[8];
        m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a();
        long l = 2070322910726891335L;
        long l2 = 0x9691DBE51FC35144L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 3771505107816539551L;
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u000b\u0080$y\u009eHnC<\u008e\u00b2\u008e\u00d2M\u0099%";
        int n2 = "\u000b\u0080$y\u009eHnC<\u008e\u00b2\u008e\u00d2M\u0099%".length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l3;
        } while (n3 < n2);
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a("\u00c3", (long)lArray[1], (long)532039339244794L);
        m$$gb6bwZF4wCl9x3wMViBdlDB0CjnOJJwfyX0rJblHgyBEWcltK4VkEHyvBz7fOAloUcBf2p8hoHRfRhqeX418hpsHCHfIA5qdU = (double)m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a("\u00c3", (long)lArray[0], (long)438085332150486L);
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
            case 0 -> 7;
            case 1 -> 63;
            case 2 -> 26;
            case 3 -> 41;
            case 4 -> 58;
            case 5 -> 37;
            case 6 -> 30;
            case 7 -> 52;
            case 8 -> 46;
            case 9 -> 45;
            case 10 -> 19;
            case 11 -> 5;
            case 12 -> 54;
            case 13 -> 62;
            case 14 -> 28;
            case 15 -> 11;
            case 16 -> 13;
            case 17 -> 35;
            case 18 -> 40;
            case 19 -> 49;
            case 20 -> 29;
            case 21 -> 56;
            case 22 -> 42;
            case 23 -> 2;
            case 24 -> 50;
            case 25 -> 4;
            case 26 -> 55;
            case 27 -> 21;
            case 28 -> 1;
            case 29 -> 16;
            case 30 -> 59;
            case 31 -> 3;
            case 32 -> 44;
            case 33 -> 0;
            case 34 -> 8;
            case 35 -> 60;
            case 36 -> 20;
            case 37 -> 9;
            case 38 -> 6;
            case 39 -> 51;
            case 40 -> 31;
            case 41 -> 27;
            case 42 -> 33;
            case 43 -> 10;
            case 44 -> 47;
            case 45 -> 17;
            case 46 -> 34;
            case 47 -> 12;
            case 48 -> 24;
            case 49 -> 23;
            case 50 -> 32;
            case 51 -> 43;
            case 52 -> 22;
            case 53 -> 38;
            case 54 -> 57;
            case 55 -> 36;
            case 56 -> 25;
            case 57 -> 53;
            case 58 -> 61;
            case 59 -> 18;
            case 60 -> 14;
            case 61 -> 15;
            case 62 -> 48;
            default -> 39;
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
        m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "6\u0010Zpm\u0014=\u001fK?\u0007\u0017)\u0013@t";
        objectArray[1] = Long.TYPE;
        m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b[1] = "java/lang/Long";
        objectArray[2] = Double.TYPE;
        m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b[2] = "java/lang/Double";
        objectArray[3] = "=\b\"9\u001f\u001d3\u0001e1\u0018\u0006~\u0000(p\u0017#\u0005\u001fb\u001c\u0011#d=99#\u001c8\u0005U3\u0001\u0000\u0015\u001fI\u000e?\u0004\u0018TH\u0018\u001f%`?~\u0001\u001fA&&:.\u0010$c'\\f4\u0017d><\u000e>4?:?\u0011\u001d>\u0005$h373\u0002\u0018|b!\u001a9#}'$=1_n \u001b&5Ut%B\u00038Y}\u001c\u001b";
        objectArray[4] = Integer.TYPE;
        m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b[4] = "java/lang/Integer";
        objectArray[5] = ">K\u0006n{\u001f5D\u0017!\u001a\u0011>O\u0013{";
        objectArray[6] = " H|@ ~gZ.&yu\u007fX\nGaiEP\fA`x}Z@\u001fqlu\u000f!Lp,z7y^#s&I&Tb#\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "Qx\u000bA\fQ\u0013z\nIh7Zn]IP\u001b)~,\u0005\"X,x\u001fD\u000eT\bt'v.\u0000\u0011Q-\u0002\u0012.\u0012c\b|\u000f7+'\b\u0001\u000bV\u0001BV\u0002U-\u0010p\u0011x,\u0005Tt\u0000Z1;\u000b\u007f2zY\u000e*t*\u0004\u001a\u0010[t&C:*-s'[9\"7MT_\f.9b!J\u0012Q\t$?8Q\u0005\u0015sUY\u0002\u0004U|m\u0002\u0017\u0004\u0014q\u000f\u0005\u0013\u0000\u001b\u001f";
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a[n] = clazz = Class.forName(b[n]);
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
        Field field = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a(clazz3, string2, clazz2)) != null) {
                    m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b(407552636758900L);
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
        Method method = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Method d(long l) {
        int n = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a(l);
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
                clazz3 = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b(407552636758900L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.b(407552636758900L);
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
            if (c == 'B' || c == 'm' || c == 'J' || c == '\u00f3') {
                field = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'B' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static String m$$BBgOLOfNEpOMwLWDJ1HPNum9ABCUpGOcW1Q3anrgfGStAWhTyh8OFGLNmEb1LKsfh1AUuo9GL20CgcKsKFIyPRQBXFBmtjyvP(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-60, 50, -47, 57, -95, -38, 122, 51, -104, -78, 57, 6, 32, -112, 40};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 15]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$IHmSFqobU4VhKHwY2z05jAixQ1wdcCNsVR2yulHMZdesdvarAHO73Yg1OEaMJssmrGvVqmXGLLxOuV0uPbuOmrI4YXE7T49FH.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

