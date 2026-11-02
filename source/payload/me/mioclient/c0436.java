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
import java.util.HashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA {
    public final Map m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO = new HashMap();
    public final String m$$D0AxyRrSdvXE9Lz6WUnYi3qHf3WXaHfczaZNhxwVL0MJJH3uXzXIOfBBqfSiDPAeFQlY1516ezwu7KY7ZhQWkhPMCbcADM6t9;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    public m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA(String string) {
        this.m$$D0AxyRrSdvXE9Lz6WUnYi3qHf3WXaHfczaZNhxwVL0MJJH3uXzXIOfBBqfSiDPAeFQlY1516ezwu7KY7ZhQWkhPMCbcADM6t9 = string;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[5];
        b = new String[5];
        m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a();
        long l = 3853859122366708043L;
        long l2 = 0x586C921A0311619EL ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 6992103281526185236L;
        long l4 = 0x527A88F8E1802DE2L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a("\u00df", (long)l4, (long)331850732428298L);
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a(clazz3, string2, clazz2)) != null) {
                    m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b(239582900649905L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a(l);
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
                clazz3 = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b(239582900649905L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b(239582900649905L);
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
            if (c == '\u00f6' || c == '\u00d6' || c == '\u00f4' || c == '\u00eb') {
                field = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00df' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            case 0 -> 9;
            case 1 -> 59;
            case 2 -> 60;
            case 3 -> 33;
            case 4 -> 22;
            case 5 -> 42;
            case 6 -> 55;
            case 7 -> 49;
            case 8 -> 44;
            case 9 -> 16;
            case 10 -> 40;
            case 11 -> 54;
            case 12 -> 13;
            case 13 -> 43;
            case 14 -> 5;
            case 15 -> 24;
            case 16 -> 14;
            case 17 -> 28;
            case 18 -> 52;
            case 19 -> 39;
            case 20 -> 11;
            case 21 -> 35;
            case 22 -> 48;
            case 23 -> 19;
            case 24 -> 32;
            case 25 -> 21;
            case 26 -> 34;
            case 27 -> 63;
            case 28 -> 6;
            case 29 -> 45;
            case 30 -> 46;
            case 31 -> 56;
            case 32 -> 31;
            case 33 -> 8;
            case 34 -> 53;
            case 35 -> 30;
            case 36 -> 27;
            case 37 -> 47;
            case 38 -> 37;
            case 39 -> 50;
            case 40 -> 3;
            case 41 -> 12;
            case 42 -> 1;
            case 43 -> 0;
            case 44 -> 10;
            case 45 -> 18;
            case 46 -> 20;
            case 47 -> 4;
            case 48 -> 38;
            case 49 -> 25;
            case 50 -> 51;
            case 51 -> 2;
            case 52 -> 61;
            case 53 -> 41;
            case 54 -> 17;
            case 55 -> 62;
            case 56 -> 23;
            case 57 -> 36;
            case 58 -> 26;
            case 59 -> 7;
            case 60 -> 15;
            case 61 -> 58;
            case 62 -> 57;
            default -> 29;
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
        m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b[n3] = new String(cArray);
        return n3;
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "t\u000eKJ\u0006\u001bz\u0007\fB\u0001\u00007\u0006A\u0003\u000e%L\u0019\u000bo\b%-;PJ:\u001aq\u0003<@\u0018\u0006\\\u0019 }&\u0002QR!k\u0006#)9\u0017r\u0006Go S]\t\"*!5\u0015-\u0011-8U}'2v<Vb\u00048L\"\u0001@.5K\u001e\u0015\u00118\u001cp%\u0014T=;xY\u0007S\u0002 |S\u001dV[\u0005q_\u0014o\u0002";
        objectArray[1] = Long.TYPE;
        m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.b[2] = "java/lang/Integer";
        objectArray[3] = "A3*O@LJ<;\u0000!BA7?Z";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "<7@\u0000i'kj\u0007kTm}b\u000bSx\u001em\u0013G!;\u001bk \u0006\r7?g\u00184-c&B\u0012@\u0011M%p7>\fT\u001c47C\b56Qi@VN'c.:/fcg?\u00182X<l\r8Zm\u001dg\u0015F\u0019slg\u0019\u00019I\u001a`\u0018\u0019:A\u0000^k\u001d\u000fM\u000eq\u001e\b\u00112>7\u0000zR:=uk\u001d\u000ba,sRC\u001b43a(C[fa\f";
    }

    public String m$$QVtAia2d6wqgYIbi52YLVyDxVn4Xqn0lHxwCAxCQZfL1mggBCDbauqIys7u8I3MwRINJog1O4dF8mRHSpsDgiUdCbDv7CwZVA(int n) {
        return this.m$$D0AxyRrSdvXE9Lz6WUnYi3qHf3WXaHfczaZNhxwVL0MJJH3uXzXIOfBBqfSiDPAeFQlY1516ezwu7KY7ZhQWkhPMCbcADM6t9;
    }

    public Map m$$02Ff7gkTBQeYOMZCluyuqJRNb70D4PS2ubNwYRF7zIowsfuBVPeFmqL2vLk8cOPD3bD9qz7TmgIcVcyegfsojyUrYciwtmhC0(int n) {
        return this.m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

