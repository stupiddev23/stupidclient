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
import net.minecraft.class_1293;
import net.minecraft.class_151;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2244;
import net.minecraft.class_2480;
import net.minecraft.class_3489;
import net.minecraft.class_6880;
import net.minecraft.class_9334;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA {
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    public m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA() {
        throw new AssertionError();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[26];
        b = new String[26];
        m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a();
        long l = 3061012305085213218L;
        long l2 = 0xBBFE9A57C6451EC1L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 1846423997751486402L;
        long l4 = 0x3DB0B880835418D3L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("x", (long)l4, (long)1304543529437667L);
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field c(long l) {
        int n = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(clazz3, string2, clazz2)) != null) {
                    m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b(1041698354990936L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(l);
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
                clazz3 = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b(1041698354990936L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b(1041698354990936L);
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
            throw new RuntimeException("me/mioclient/m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 's' || c == '\u00e7' || c == 'z' || c == '\u00c8') {
                field = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 's' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'x' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
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
            case 0 -> 59;
            case 1 -> 36;
            case 2 -> 39;
            case 3 -> 9;
            case 4 -> 58;
            case 5 -> 2;
            case 6 -> 35;
            case 7 -> 25;
            case 8 -> 54;
            case 9 -> 27;
            case 10 -> 63;
            case 11 -> 49;
            case 12 -> 60;
            case 13 -> 18;
            case 14 -> 14;
            case 15 -> 7;
            case 16 -> 40;
            case 17 -> 61;
            case 18 -> 38;
            case 19 -> 20;
            case 20 -> 19;
            case 21 -> 16;
            case 22 -> 10;
            case 23 -> 56;
            case 24 -> 50;
            case 25 -> 15;
            case 26 -> 34;
            case 27 -> 8;
            case 28 -> 62;
            case 29 -> 45;
            case 30 -> 6;
            case 31 -> 32;
            case 32 -> 22;
            case 33 -> 4;
            case 34 -> 53;
            case 35 -> 0;
            case 36 -> 47;
            case 37 -> 29;
            case 38 -> 42;
            case 39 -> 5;
            case 40 -> 24;
            case 41 -> 57;
            case 42 -> 52;
            case 43 -> 48;
            case 44 -> 23;
            case 45 -> 43;
            case 46 -> 44;
            case 47 -> 31;
            case 48 -> 11;
            case 49 -> 3;
            case 50 -> 13;
            case 51 -> 30;
            case 52 -> 21;
            case 53 -> 37;
            case 54 -> 51;
            case 55 -> 1;
            case 56 -> 17;
            case 57 -> 26;
            case 58 -> 12;
            case 59 -> 41;
            case 60 -> 46;
            case 61 -> 33;
            case 62 -> 55;
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
        m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "\u0012\u001co\u007f\u000fz\u0012\u001cx#\u0003u\bWx=\u0003`\u000f&*f[*";
        objectArray[1] = "\"O30\u001f+\"O$l\u0013$8\u0004$r\u00131?uq&Dp";
        objectArray[2] = Boolean.TYPE;
        m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b[2] = "java/lang/Boolean";
        objectArray[3] = "\u0019H\u001eWj)\u0019H\t\u000bf&\u0003\u0003\t\u0015f3\u0004r[N3w";
        objectArray[4] = ";7d`\u0014\u000f;7s<\u0018\u0000!|s\"\u0018\u0015&\r\"|M^";
        objectArray[5] = "g?ID\u001fXi6\u000eL\u0018C$7C\r\u0017f_(\ta\u0011f>\nRD#Yb2>N\u0001EO(\"s?ABc#e\u001f`:\b\u0015|\u001f\u0004|\u0011QS\u0010a9\u00107\u001b4R>\tWs>qe\rTl\u001d{_\u0013\u0003N7vX/\u0017\u001f!_c\u0014\u0016Z$xkh\u0005]\u001bcob\u001fXBFbn\u0016a\u001b";
        objectArray[6] = Long.TYPE;
        m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b[6] = "java/lang/Long";
        objectArray[7] = Integer.TYPE;
        m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b[7] = "java/lang/Integer";
        objectArray[8] = "@wOdez@wX8iuZ<X&i`]M\u0002y;\"";
        objectArray[9] = "\u001au\tl91\u0004}\u0013#^0\u0015f\u001eyx6";
        objectArray[10] = "UB\u001fd\n\bUB\b8\u0006\u0007O\t\b&\u0006\u0012HxZrSS";
        objectArray[11] = "u\u0007\u0005eq\u007fk\u000f\u001f*\u0013cl\u0012";
        objectArray[12] = "Ss_g\b\bSsH;\u0004\u0007I8H%\u0004\u0012NI\u001a{\\R";
        objectArray[13] = "\u00174%ma\u000b\u0017421m\u0004\r\u007f2/m\u0011\n\u000eg{4R";
        objectArray[14] = "<|:n)-7s+!H#<x/{";
        objectArray[15] = "Rd'\b\u0014q\\m`\u0000\u0013j\u0011l-A\u000ekMQb3KFNDS!\nr}vQ\u000f\f]^fK,\ni|3G6\u0018|UkG(6FKK?/KOslS*LWS7\u007f\u0011\u001b)HtfQ\nHF4m\f\u000by\tK|\u0017\u0014Smwh\u000e\u0012ZO7A\u0016KuXF\\\u000f\u0013oJ7f\u0015J";
        objectArray[16] = ";\u000f\u001fU)Wc\u001cG\u0012EKl\u001d=F5W\u0005_\u001aE{D\u007f\u0016\u001dG4+";
        objectArray[17] = "\\)4\f\u0010_\u0002x!\u0001)[\u000e;+\u0002EiS\u007fwT)\u0001\u0019<7[IS\u0007= e";
        objectArray[18] = "\u00033th\u0013*@bq#s\u001d\u000ez-kK1}j\\'9rxlof\u0015~\\`WT5*EE] \t\u0004Fwx^\u0014\u001d\u007f3x#\u0010|UV& N\u0007DdaZ7/\u0000`px*\u0011_kBXB$~`Z&\u0001:\u000f`Va!\u0000ygWy\"\bcY$}\u0017\u0004mvQh\t{]0O\u001aO/O4o|LrO3\u001d'\u0011}M1#'By\u0006\u000b";
        objectArray[19] = "SmEbZ;\u0012)@<&$\u000eoDjJ\u0016^.\u001b<&p\u000f\"D5\u001a~\u0018y\u0014\r";
        objectArray[20] = "i/m/Ral>)PP7s!7<bg0qjn5d3%3hL*}8<P\f;a\u007f?*E<c0P";
        objectArray[21] = "&jFQ]9#{\u0002._o<d\u001cBm9y9D\u0015:{,8E_T=.y{\u0017[l~k\u0001^\\n1\u0004";
        objectArray[22] = "kV\u000b'M@2L\u0014i&[<N\u00190Jin\r@n&\u0005a@\u0007.^X3N\u001bW";
        objectArray[23] = "c\u0003f\u001ck\b1\u001dg\u000bU\t \u0014g\t)\u000f&y#\t1\u00160\u0005{\u001aiQ\\";
        objectArray[24] = "\u001cTA[\u0019eKPXK$;Y\u0005\u007fL@\u0006\u0014i\u001e\\y\u000e\u001ePGG\u001e\u00065s\u0018\u001bU\u0000OiYyig4\u0015\u0016^\u001b3\u0007GZi\u007f\u001e\u0005D\u001eO~\u00188ea\\Y\"\u0018\u0010\u001bE{eL`\u0017[o%(R\u001a~J&+{vny\u000f\u001fBZPJnEiHKF\u00048Y^~Gg\rbI\"B0HV@\u0019G!\f)\u0018L[7LHF\u001dN:u";
        Object[] objectArray2 = objectArray;
        objectArray[25] = "}IX?z|%Z\u0000x\u0016f.P@A\u007f1r\u0019Yqno._<";
    }

    public static boolean m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_1799 class_17992, class_6880 class_68802) {
        CallSite callSite = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("x", (Object)class_17992, (long)1743610114061330L), (long)1261746924606396L), (long)1680442621676055L);
        while (m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)callSite, (long)1192589462776362L) != false) {
            class_1293 class_12932 = (class_1293)m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)callSite, (long)1771918476436014L);
            try {
                if (m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_12932, (long)1394609329121258L) != class_68802) continue;
                return true;
            }
            catch (class_151 class_1512) {
                throw m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(class_1512);
            }
        }
        return false;
    }

    public static boolean m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP(class_1792 class_17922) {
        boolean bl;
        block4: {
            block3: {
                if (class_17922 instanceof class_1747) {
                    class_1747 class_17472 = (class_1747)class_17922;
                    try {
                        if (!(m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_17472, (long)1566007688933093L) instanceof class_2480)) break block3;
                        bl = true;
                        break block4;
                    }
                    catch (class_151 class_1512) {
                        throw m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(class_1512);
                    }
                }
            }
            bl = false;
        }
        return bl;
    }

    public static boolean m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T(class_1792 class_17922, int n) {
        boolean bl;
        block4: {
            block3: {
                if (class_17922 instanceof class_1747) {
                    class_1747 class_17472 = (class_1747)class_17922;
                    try {
                        if (!(m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_17472, (long)1566007688933093L) instanceof class_2244)) break block3;
                        bl = true;
                        break block4;
                    }
                    catch (class_151 class_1512) {
                        throw m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(class_1512);
                    }
                }
            }
            bl = false;
        }
        return bl;
    }

    public static boolean m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz(class_1799 class_17992, int n) {
        return (boolean)m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_17992, (Object)class_3489.field_42612, (long)1481605934984498L);
    }

    public static boolean m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI(class_1799 class_17992, int n) {
        return (boolean)m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_17992, (Object)class_3489.field_42611, (long)1481605934984498L);
    }

    public static boolean m$$q60MFbe6wdivWp4kRCKnlZZPlYEn3tV4kfyfYvLxmOjTDK7AxLlTtFsQ579mT62x8LKzvOCLsSewKyc0PBtW1vCddwE5OeN7R(class_1799 class_17992, int n) {
        return (boolean)m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_17992, (Object)class_3489.field_42614, (long)1481605934984498L);
    }

    public static boolean m$$0a6satRcVmfiZwanl0RgzcMCb0erhZREX3tKsob6XE1D4QKMc68LuPqxPdhcvQymN439ibhFWuDkCK4ezfpJrVIkGLaGWuoTq(class_1799 class_17992, int n) {
        return (boolean)m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_17992, (Object)class_9334.field_50075, (long)1444689320589704L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

