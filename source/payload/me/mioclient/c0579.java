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
import me.mioclient.m$$O2cV3NVCvIOmlIYg0Cw9ezc05YGGUeG5VGCA1CLjoeKVEDupXn9zApW1D5cQwdkkueHzLoLXbgnSXslhArBKOUYLl6ZzgTom5;
import net.minecraft.class_151;
import net.minecraft.class_1921;
import net.minecraft.class_287;
import net.minecraft.class_4597;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf
implements m$$O2cV3NVCvIOmlIYg0Cw9ezc05YGGUeG5VGCA1CLjoeKVEDupXn9zApW1D5cQwdkkueHzLoLXbgnSXslhArBKOUYLl6ZzgTom5 {
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[22];
        b = new String[22];
        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a();
        long l = 3697049118950867585L;
        long l2 = 0x6F717DE1FC3D7AD3L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 7729017108808552470L;
        long l4 = 0x3DF139E68279A943L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a("\u00e8", (long)l4, (long)1255776800940339L);
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(clazz3, string2, clazz2)) != null) {
                    m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b(757759216943188L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(l);
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
                clazz3 = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b(757759216943188L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b(757759216943188L);
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

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a3' || c == 'k' || c == '\u00c5' || c == 'v') {
                field = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "\u0010a,i\u0001.\u0010a;5\r!\n*;+\r4\r[j\u007f[";
        objectArray[1] = "d\u0018.\u0005t\u0003d\u00189Yx\f~S9Gx\u0019y\"c\u0013)[";
        objectArray[2] = Void.TYPE;
        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b[2] = "java/lang/Void";
        objectArray[3] = "AyL\u0007\u001d\u0006Op\u000b\u000f\u001a\u001d\u0002qFN\u00158yn\f\"\u00138\u0018LW\u0007!\u0007Dt;\r\u0003\u001bin'0=\u001fd%&&\u001d>\u001cN\u0010?\u001dZZWT\u0010\u0012?\u001fV2X6\f\u0018OR0</CKQ/\u001f%yU\u0006\r5(~i\u0012\\#\u0001ER\u0013\u0019&&M.\u0000\u001e\u0019=I$\u001a\u001b@\u0018D(\u0013\"\u0019";
        objectArray[4] = Long.TYPE;
        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b[4] = "java/lang/Long";
        objectArray[5] = Integer.TYPE;
        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b[5] = "java/lang/Integer";
        objectArray[6] = "17C\u001eVF/?YQ1G>$T\u000b\u0017A";
        objectArray[7] = Boolean.TYPE;
        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b[7] = "java/lang/Boolean";
        objectArray[8] = "ZB=fgiDJ')\u001ayD";
        objectArray[9] = "\u0005>\u0004,\u000eB\u001b6\u001ecmV\u001f";
        objectArray[10] = "N9p,Q?E6ac01N=e9";
        objectArray[11] = "J~\u0001WhUTv\u001b\u0018\u0015EQj\u0012X%EDR\u0016F";
        objectArray[12] = ":ZM\u001e\u001b#4S\n\u0016\u001c8yRGW\"\u0006\u0015\u000f\u0011J1\u001a=\\U1\u001a\u000f\u0003g3#\u0003=\u0010q+\u0002!\"\u0007|U13\b9V/\u0016\u001d\u001b\u0001y6G186R\r\u0011\u0007\r\u001f\t/C\u0018u&yS\u0007\u0017'\u0000R6J:\u000b\u0007O\u00165(x'i6C+ \u000eQ\u0005F\u0014\u0016aqT9#\u0016a\u000b 8\u0014";
        objectArray[13] = "N\u0017k'3t\u001d\bd)\nj\u001b\u0017P.zvrQ{|u{JPr3l\n";
        objectArray[14] = "*=\u0016\u001cO\u000bseX\u0001w\u0000hi\u0012\u0004\u000b\u0006n\u0004T\u0016\n\u0005-z\u0007\t\u0005\u000b\u0014";
        objectArray[15] = "81\u0016\u0006#,mu\u001d\u0003L)k.\u0017\u0019!S9$\u0014\u001f7j>uN\u001cLli/\b\u001cuk8u\u000bg";
        objectArray[16] = "F\u0006|;\b%\u0007\u0005{>l,\u0014\t\u001c(\u0010OGA94T%\u001e\u0019w)l";
        objectArray[17] = "\f\u0012|dG\u0016F\u0006:c5x\u0007\t4~\rTt\u0019E2\u007f\u0017q\u001fvsS\u001bU\u0013NAsOL6D5OaO\u0004aKRxv@a6V\u0019\\%?5\bbM\u0017xOqJ\t\u0013imltV\u0018[M\u0004Aw\u0013C3G_\u0006\u0013Otgep\u0014Nldmj*=hQad\u0005H}O\u001eTCV\u000f\u000fW\fCk5X\u0017]I\u00044KOY\u0002a~EXKx";
        objectArray[18] = "J+\u0002 RM\u001b=\u0001O\u000e\u0010X,\u001e#<C\u001csHskD\u001cv\u0010?[\u000fD4\u0005O";
        objectArray[19] = "\u0005@\u0007G=\u0015IW\u001eIE\u001e\u0019\u0001\u0013P4\u0014x}Zw44I\u0016?I<$\u000e\u001d\u0007M \u0004\u0005q*R,\u0002\fg\fL\u0002\nqdZO{+|G\u001f}\u0004\u001cXfZk\u007f+\u0005R<\u001d!\u0017[|\u001a\u0015'EWR\u000e\u0017\u0019\u0019ODZi\u0015\u0016\nR<\u007f\u00016xD\u0013T>ESfY}u$\u0004cQ-+\u001cNBX\u001dz\nM-XK}JUV\u001d_,\u001f5";
        objectArray[20] = "t\u000e(N\"_?Vj[R\u0004)QiJRV+\u000e#G)\u0013?_v'";
        Object[] objectArray2 = objectArray;
        objectArray[21] = "a\u00005km12\u001f:eT)0\u000b4\u000fk 9\u000336lqc\u0000H";
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
            case 0 -> 31;
            case 1 -> 42;
            case 2 -> 57;
            case 3 -> 14;
            case 4 -> 38;
            case 5 -> 4;
            case 6 -> 50;
            case 7 -> 63;
            case 8 -> 47;
            case 9 -> 30;
            case 10 -> 10;
            case 11 -> 49;
            case 12 -> 52;
            case 13 -> 35;
            case 14 -> 39;
            case 15 -> 48;
            case 16 -> 37;
            case 17 -> 18;
            case 18 -> 2;
            case 19 -> 60;
            case 20 -> 11;
            case 21 -> 17;
            case 22 -> 36;
            case 23 -> 7;
            case 24 -> 27;
            case 25 -> 23;
            case 26 -> 29;
            case 27 -> 9;
            case 28 -> 54;
            case 29 -> 5;
            case 30 -> 0;
            case 31 -> 56;
            case 32 -> 28;
            case 33 -> 58;
            case 34 -> 15;
            case 35 -> 59;
            case 36 -> 55;
            case 37 -> 40;
            case 38 -> 41;
            case 39 -> 62;
            case 40 -> 32;
            case 41 -> 24;
            case 42 -> 8;
            case 43 -> 16;
            case 44 -> 1;
            case 45 -> 34;
            case 46 -> 20;
            case 47 -> 13;
            case 48 -> 12;
            case 49 -> 3;
            case 50 -> 19;
            case 51 -> 46;
            case 52 -> 25;
            case 53 -> 44;
            case 54 -> 21;
            case 55 -> 51;
            case 56 -> 53;
            case 57 -> 45;
            case 58 -> 61;
            case 59 -> 33;
            case 60 -> 22;
            case 61 -> 6;
            case 62 -> 43;
            default -> 26;
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
        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b[n3] = new String(cArray);
        return n3;
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_287 class_2872) {
        try {
            if (class_2872 == null) {
                return;
            }
        }
        catch (class_151 class_1512) {
            throw m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(class_1512);
        }
        CallSite callSite = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a("\u00d9", (Object)class_2872, (long)1317100043237765L);
        try {
            if (callSite == null) {
                return;
            }
        }
        catch (class_151 class_1513) {
            throw m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(class_1513);
        }
        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a("\u00d9", (Object)callSite, (long)1428670540759053L);
    }

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_4597 class_45972) {
        if (!(class_45972 instanceof class_4597.class_4598)) {
            return;
        }
        class_4597.class_4598 class_45982 = (class_4597.class_4598)class_45972;
        try {
            if (class_45982.field_52158 != null) {
                m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a("\u00d9", (Object)this, (Object)((class_287)m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a("\u00d9", (Object)class_45982.field_52157, (Object)class_45982.field_52158, (long)1065484235615214L)), (long)1392650660802953L);
                class_45982.field_52158 = null;
            }
        }
        catch (class_151 class_1512) {
            throw m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(class_1512);
        }
        CallSite callSite = m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a("\u00d9", (Object)m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a("\u00d9", (Object)class_45982.field_20953, (long)1153499907738489L), (long)1001364971330852L);
        while (m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a("\u00d9", (Object)callSite, (long)980585121235202L) != false) {
            class_1921 class_19212 = (class_1921)m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a("\u00d9", (Object)callSite, (long)1491534760430595L);
            class_287 class_2872 = (class_287)m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a("\u00d9", (Object)class_45982.field_52157, (Object)class_19212, (long)1065484235615214L);
            m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a("\u00d9", (Object)this, (Object)class_2872, (long)1392650660802953L);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

