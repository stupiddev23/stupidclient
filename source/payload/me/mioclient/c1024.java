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
import me.mioclient.m$$j96VuWbDZoY7xfIWSKO9FbWMtmVQKa7jPOdi88edIG2znzqLWjtbAU0TelrP7tR4TcCPl6OD5GT8q7SMICb9YEpStTr0AalMT;
import net.minecraft.class_2338;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8
implements m$$j96VuWbDZoY7xfIWSKO9FbWMtmVQKa7jPOdi88edIG2znzqLWjtbAU0TelrP7tR4TcCPl6OD5GT8q7SMICb9YEpStTr0AalMT {
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[5];
        b = new String[5];
        m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a();
        long l = 6875809910715560956L;
        long l2 = 0xDADC55DC2749CD92L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 7513121278144496093L;
        long l4 = 0x18FE3749B09DA5CL ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a("V", (long)l4, (long)350746139645056L);
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a(clazz3, string2, clazz2)) != null) {
                    m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b(260732448453710L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a(l);
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
                clazz3 = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b(260732448453710L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b(260732448453710L);
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

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8" + " : " + string + " : " + methodType.toString(), exception);
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

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e5' || c == '\u00fa' || c == '\u00f4' || c == '\u00c1') {
                field = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'V' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
            case 0 -> 17;
            case 1 -> 24;
            case 2 -> 43;
            case 3 -> 34;
            case 4 -> 63;
            case 5 -> 31;
            case 6 -> 7;
            case 7 -> 11;
            case 8 -> 48;
            case 9 -> 54;
            case 10 -> 4;
            case 11 -> 38;
            case 12 -> 41;
            case 13 -> 2;
            case 14 -> 10;
            case 15 -> 60;
            case 16 -> 1;
            case 17 -> 50;
            case 18 -> 44;
            case 19 -> 5;
            case 20 -> 56;
            case 21 -> 0;
            case 22 -> 45;
            case 23 -> 8;
            case 24 -> 49;
            case 25 -> 16;
            case 26 -> 53;
            case 27 -> 62;
            case 28 -> 23;
            case 29 -> 55;
            case 30 -> 22;
            case 31 -> 57;
            case 32 -> 33;
            case 33 -> 47;
            case 34 -> 61;
            case 35 -> 30;
            case 36 -> 29;
            case 37 -> 15;
            case 38 -> 32;
            case 39 -> 26;
            case 40 -> 13;
            case 41 -> 39;
            case 42 -> 18;
            case 43 -> 35;
            case 44 -> 28;
            case 45 -> 12;
            case 46 -> 51;
            case 47 -> 40;
            case 48 -> 19;
            case 49 -> 58;
            case 50 -> 20;
            case 51 -> 6;
            case 52 -> 27;
            case 53 -> 59;
            case 54 -> 3;
            case 55 -> 46;
            case 56 -> 25;
            case 57 -> 42;
            case 58 -> 36;
            case 59 -> 52;
            case 60 -> 14;
            case 61 -> 37;
            case 62 -> 9;
            default -> 21;
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
        m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "qbdrr+\u007fk#zu02jn;z\u0015Iu$W|\u0015(W\u007frN*to\u0013xl6Yu\u000fER2T>\u000eSr\u0013,U8JrwjL|e}\u0012/M\u001a-Y!(TzES\u0002sPyZp\bIN.xZ\u0005Nr:)L,uI;lI\u000b}5(kv\u0010y?2n/5t3;Wv";
        objectArray[1] = Long.TYPE;
        m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.b[2] = "java/lang/Integer";
        objectArray[3] = "\u001a\u0015%O\u001av\u0011\u001a4\u0000{x\u001a\u00110Z";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "I*;3\u001bs\u0017}j\t;}]s%1\u0017\u000eM\u0002iCT\u000bK1(oX/G\t\u001aO\f6b\u0003ns\"5P&\u0010n;\f\u0014&mjZ&qxn4!7C?\u0014M\tsG.6P7,L\u001c\u00168\u0002\rG\u0004h{\u001c|G\b/[&\n@\t7X.\u0010~z3m\"\u001eQ\u000f&s].\u0017\u0011Tx\u0017&C)nnYq,z1f_3Ks%v\u0001L";
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(String string, class_2338 class_23382) {
    }

    @Override
    public boolean m$$U36dgriWDr0B1UBvofXodgUyPeBydXA8ZUkpLAKHV7ElDfNmXh3QX8hgciIU8FoLj5eGerDNkwyIvRWwSaqcRTEYx4poBkvwK() {
        return false;
    }

    @Override
    public void m$$t3zMqM5GOLIK0Oqi0ZzKN5M4ASmiAn4GEXzlojtUDk3l37DzxUEGyj7yqAaPjAhJI7ET7dFxUG6YLcI8gpOdmuGtGwajAtKDu(String string) {
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$iPNKZTHFRiuoHuQfRb9Nyx1jQgOnwjbtmN7RAvL70zi31TRPTL7rsVGH5aLja1Zyh7X9hYWEiE1ux3Qdb9KrXZBpsp8xMRVq8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

