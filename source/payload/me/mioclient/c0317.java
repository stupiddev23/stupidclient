/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import net.minecraft.class_1792;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo
implements JsonDeserializer,
JsonSerializer {
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[18];
        b = new String[18];
        m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a();
        long l = 6966657324692973116L;
        long l2 = 0x15D315C30631AE9CL ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 6051434213205553495L;
        long l4 = 0x6DBC6F9B44E23763L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a("\u00dc", (long)l4, (long)820761819482262L);
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a(clazz3, string2, clazz2)) != null) {
                    m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b(724931585406857L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a(l);
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
                clazz3 = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b(724931585406857L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b(724931585406857L);
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

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a(lookup, mutableCallSite, string, methodType, l);
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

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f5' || c == 'q' || c == '\u00c8' || c == '\u00ed') {
                field = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            case 0 -> 22;
            case 1 -> 46;
            case 2 -> 56;
            case 3 -> 5;
            case 4 -> 36;
            case 5 -> 17;
            case 6 -> 16;
            case 7 -> 58;
            case 8 -> 50;
            case 9 -> 48;
            case 10 -> 38;
            case 11 -> 49;
            case 12 -> 26;
            case 13 -> 44;
            case 14 -> 53;
            case 15 -> 32;
            case 16 -> 14;
            case 17 -> 8;
            case 18 -> 13;
            case 19 -> 37;
            case 20 -> 30;
            case 21 -> 59;
            case 22 -> 2;
            case 23 -> 23;
            case 24 -> 1;
            case 25 -> 28;
            case 26 -> 33;
            case 27 -> 39;
            case 28 -> 21;
            case 29 -> 47;
            case 30 -> 34;
            case 31 -> 51;
            case 32 -> 25;
            case 33 -> 10;
            case 34 -> 63;
            case 35 -> 62;
            case 36 -> 0;
            case 37 -> 7;
            case 38 -> 60;
            case 39 -> 54;
            case 40 -> 31;
            case 41 -> 45;
            case 42 -> 12;
            case 43 -> 52;
            case 44 -> 15;
            case 45 -> 43;
            case 46 -> 35;
            case 47 -> 3;
            case 48 -> 24;
            case 49 -> 11;
            case 50 -> 40;
            case 51 -> 29;
            case 52 -> 42;
            case 53 -> 19;
            case 54 -> 57;
            case 55 -> 55;
            case 56 -> 6;
            case 57 -> 41;
            case 58 -> 4;
            case 59 -> 27;
            case 60 -> 9;
            case 61 -> 18;
            case 62 -> 20;
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
        m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "V\u0011-\u000e\u0016UV\u0011:R\u001aZLZ:L\u001aOK+h\u0017B\u000e";
        objectArray[1] = Integer.TYPE;
        m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b[1] = "java/lang/Integer";
        objectArray[2] = "\u0015E!\u0017(E\u0019M \\aM\u0005E\"\u0017\u0005Y\u0019D\tU*G\u0013D8";
        objectArray[3] = "kVzg_ve_=oXm(^p.WHSA:BQH2cagcwn[\rmAkCA\u0011P\u007foN\n\u0010F_N6a&__*pxbpPO5y\u00048t|2`dP~_idgO]USz0mwXTF$<aqo}%ydVg\u00016~[Mc\u000b,{\u0002hn\u0007%B[";
        objectArray[4] = Long.TYPE;
        m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b[4] = "java/lang/Long";
        objectArray[5] = "Pi\u0010oo_^`WghD\u0013a\u001a&Cs\u00054hMagIu\u000bEEFxUs6sfv?];SgU:GgNte=pp\u007fg\u000f4Ke5FdhGEmG\u000bg\u000foQC\rhGw^|OF\\LB\u0003Ph\fOM\u0001ED\t4VA\u000fnpt`CDGrdttt~\u000bgi";
        objectArray[6] = "L~o\u0003\u00110Gq~LM9@s|\u0001Krrfi\u0007";
        objectArray[7] = "|:fbaap2g)(il:ebL}p;X)tg~9b6gzv:e\u000fi`k0s8";
        objectArray[8] = "4&4T\u000bp?)%\u001blr*\"%PW";
        objectArray[9] = "J\u0006YT\u000e!F\u000eX\u001fG)Z\u0006ZT#=F\u0007p\u001f\u001a+[\u0000U\u0016\u00004H\u001d]\u0015\u0007\rF\u0007@\u001f\u0011:";
        objectArray[10] = "\u0000E;hAe\u000bJ*' k\u0000A.}";
        objectArray[11] = "yEy5id:\u001dc#\u0005Dr]9==h\u0001MHqO+\u0004K{0c' GC\u0002Cs9bIv\u007f]:Pl\bbD\u0003\u0014luf%)q2v8^8Cu\fAv|Gd.\\H#LV\u000e4}\u0002GNpwcsGB7WY\u0005@C/TQ\u001f~0+a]\u0011QE>\u007f\"!\u0017[L?e=\u001227cv3\u0013\tuna8Qnv5xr,";
        objectArray[12] = "V!apg@\u0017 r!\u0015\u001bAuagd\u0011 \t(@d1\u0011bM~l!Viuzp\u0001]\u0005Xe|\u0007T\u0013~{R\u000f)\u0010(x+.$3mJT\u0019\u0000\u0012(\\/.]&N*q\u0012\u0003\bh\"w@\u000f&| I\u001c\u00170(^E\u0013R&NHQ3 0acn@\u000b\u0012+J%!\\\u0017#\u001a,\u0005\u0006!/}n\u0002\u0012f\u0013&~\u0012Vej}$\u0011\u0006Y-q|D\u0002e+fj\u0014m=sy/\u0013\u0015+(q\u0015";
        objectArray[13] = "SXPFTW\u0003FGXdO\u0007DQJ#_n\u0019G\\\u001fL\t\u001a\u001cEU1SXPFTW\u0003FGXd";
        objectArray[14] = "H(&7<\u0004^s.\r4\u0011P(\"a\u0006C\u001cwx\rh\u0017W38jkLNyEi1\u001f\u0016%=\u007fj\u0017,";
        objectArray[15] = "\u0006Y}+T\u001fGXnz&D\u0011\r}<WNpq4\u001bWnA\u001aQ%_~\u0006\u0011i!C^\r}D>OX\u0004kb aPyh4#\u0018qtKq\u0011gFPj4\u0007\u001cq\r^RqBMSptyD\u001f_^`{zCGH4\u0005vL\u0002^R\u0013blpH}8]\u001f[j7\u0011\u0016~\fo?ABA^\u001bb9T\u001aV!3*J\u001a\u0001XhpIJ=\u001co{\u0016[_H~&W!\u0004Zd9\u001aFF]p~&";
        objectArray[16] = "\u0013\u0011tjD\u001eQ\u0016`-x\u0016G\u0016Vi9\u001fVj&y\u0003\u0002W\r%\"\u001aH*";
        Object[] objectArray2 = objectArray;
        objectArray[17] = ",@!l\u000bB:\u001b)V\u0003W4@%:1\u0005x\u0010zV\u0002Z+\u001a/.\u0014\u0001# {=\u001dA5Gxf\u0004\u000bH";
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a("\u00f8", (Object)this, (Object)jsonElement, (Object)type, (Object)jsonDeserializationContext, (long)848678930225548L);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a("\u00f8", (Object)this, (Object)((class_1792)object), (Object)type, (Object)jsonSerializationContext, (long)1098365510921170L);
    }

    public JsonElement m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_1792 class_17922, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive((Number)((Object)m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a("\u00dc", (int)m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a("\u00dc", (Object)class_17922, (long)1198963392462400L), (long)972713362951656L)));
    }

    public class_1792 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a("\u00dc", (int)m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a("\u00f8", (Object)jsonElement, (long)1172356549577495L), (long)1030812739072640L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

