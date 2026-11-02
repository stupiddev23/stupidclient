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
import net.minecraft.class_239;
import net.minecraft.class_243;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1
extends class_239 {
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    public m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1(class_243 class_2432) {
        super(class_2432);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[5];
        b = new String[5];
        m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a();
        long l = 507908419740297827L;
        long l2 = 0x537E193849062053L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 7265154889172667639L;
        long l4 = 0x6029B29732EFE8A7L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a("V", (long)l4, (long)304715137087482L);
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b(classArray[i], string, clazz2);
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
            int n = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a(clazz3, string2, clazz2)) != null) {
                    m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b(243949792837619L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a(l);
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
                clazz3 = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b(243949792837619L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b(243949792837619L);
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

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f9' || c == '\u00a2' || c == '\u00e0' || c == '\u00f4') {
                field = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00da' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'V' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 3;
            case 1 -> 21;
            case 2 -> 17;
            case 3 -> 5;
            case 4 -> 23;
            case 5 -> 33;
            case 6 -> 15;
            case 7 -> 27;
            case 8 -> 8;
            case 9 -> 29;
            case 10 -> 37;
            case 11 -> 38;
            case 12 -> 47;
            case 13 -> 2;
            case 14 -> 54;
            case 15 -> 61;
            case 16 -> 10;
            case 17 -> 25;
            case 18 -> 0;
            case 19 -> 24;
            case 20 -> 36;
            case 21 -> 39;
            case 22 -> 41;
            case 23 -> 35;
            case 24 -> 44;
            case 25 -> 43;
            case 26 -> 45;
            case 27 -> 18;
            case 28 -> 59;
            case 29 -> 16;
            case 30 -> 51;
            case 31 -> 55;
            case 32 -> 13;
            case 33 -> 50;
            case 34 -> 34;
            case 35 -> 52;
            case 36 -> 40;
            case 37 -> 20;
            case 38 -> 49;
            case 39 -> 28;
            case 40 -> 63;
            case 41 -> 19;
            case 42 -> 62;
            case 43 -> 22;
            case 44 -> 30;
            case 45 -> 12;
            case 46 -> 6;
            case 47 -> 14;
            case 48 -> 11;
            case 49 -> 26;
            case 50 -> 58;
            case 51 -> 57;
            case 52 -> 48;
            case 53 -> 46;
            case 54 -> 1;
            case 55 -> 7;
            case 56 -> 9;
            case 57 -> 32;
            case 58 -> 53;
            case 59 -> 42;
            case 60 -> 31;
            case 61 -> 4;
            case 62 -> 60;
            default -> 56;
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
        m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b[n3] = new String(cArray);
        return n3;
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
        a[0] = "zjen.9tc\"f)\"9bo'&\u0007B}%K \u0007#_~n\u00128\u007fg\u0012d0$R}\u000eY\u000e _6\u000fO.\u0001']9V.eaD}y!\u0000$E\u001b1\u00053#\\{Y\u000f\u0010xXxF,\u001aBF/d\u0006\u0017Ez;5\u0010>~A:p\u0015\u0019v=)w*\u0002r73rs'\u007f;:K*";
        objectArray[1] = Long.TYPE;
        m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.b[2] = "java/lang/Integer";
        objectArray[3] = "^\t(\u0012V\u0000U\u00069]7\u000e^\r=\u0007";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "hdf\u0004<k36`j\u0018`z7rR4\u0013jF> w\u0016lu\u007f\f{2`MM,/+EG9\u0010\u0001(wbG\r\u0018\u00113b:\ty;V<9W\u0002*d{C.*n`ja3\u00141kXA[!\u0010`@?\u0018?a`Lx8\u0005\u0017gM`;\r\rY>d\u000e\u0001\u0003vKq\u0010~30U\u0003Sxks|}V<5u\u0007:\b/<gazU~.\u000b";
    }

    public class_239.class_240 method_17783() {
        return class_239.class_240.field_1333;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$2vJn3X8s6DtVZ8aorVBXuwNDNcKjTJI9kSYsvZr0BuL7xOkRpPCU5y7NOeVZbKW9QjFPeKeKlf0CBzJK75hJfF0HiY0YOQDLC$1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

