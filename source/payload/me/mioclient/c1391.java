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
import me.mioclient.mixin.m$$KfU4wmORgpQ6cabALSklcHjBla1N7EhnqqIeqSUhN4Y1MAAmwwYsRy2eDVBtrxhR5ufh9paJsh8w9b59sEnczp8OFyboADzL2;
import net.minecraft.class_243;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8 {
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    public m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8() {
        throw new AssertionError();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[14];
        b = new String[14];
        m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a();
        long l = 2147718407146635858L;
        long l2 = 0x582B8C10E07E22DBL ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 7006072043264274592L;
        long l4 = 0x24418F1F4268E940L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a("\u00ea", (long)l4, (long)751308286423054L);
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a(clazz3, string2, clazz2)) != null) {
                    m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b(677253161376929L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a(l);
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
                clazz3 = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b(677253161376929L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b(677253161376929L);
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
            if (c == '\u00a2' || c == '\u00ee' || c == '\u00d0' || c == '\u00cb') {
                field = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ea' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            case 1 -> 28;
            case 2 -> 21;
            case 3 -> 5;
            case 4 -> 44;
            case 5 -> 61;
            case 6 -> 8;
            case 7 -> 51;
            case 8 -> 29;
            case 9 -> 35;
            case 10 -> 13;
            case 11 -> 10;
            case 12 -> 2;
            case 13 -> 19;
            case 14 -> 58;
            case 15 -> 59;
            case 16 -> 54;
            case 17 -> 46;
            case 18 -> 0;
            case 19 -> 38;
            case 20 -> 31;
            case 21 -> 32;
            case 22 -> 62;
            case 23 -> 16;
            case 24 -> 52;
            case 25 -> 9;
            case 26 -> 40;
            case 27 -> 43;
            case 28 -> 45;
            case 29 -> 14;
            case 30 -> 55;
            case 31 -> 1;
            case 32 -> 20;
            case 33 -> 53;
            case 34 -> 12;
            case 35 -> 48;
            case 36 -> 27;
            case 37 -> 25;
            case 38 -> 41;
            case 39 -> 42;
            case 40 -> 11;
            case 41 -> 7;
            case 42 -> 63;
            case 43 -> 33;
            case 44 -> 26;
            case 45 -> 57;
            case 46 -> 60;
            case 47 -> 23;
            case 48 -> 50;
            case 49 -> 30;
            case 50 -> 6;
            case 51 -> 36;
            case 52 -> 18;
            case 53 -> 3;
            case 54 -> 47;
            case 55 -> 15;
            case 56 -> 56;
            case 57 -> 49;
            case 58 -> 24;
            case 59 -> 34;
            case 60 -> 22;
            case 61 -> 4;
            case 62 -> 37;
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
        m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "]7F\u001eP6S>\u0001\u0016W-\u001e?LW@h~7,\u0004{\u0017f4^\"t?C\u0010=\u001b\f6Cj0EK\rh8^\u0006v2\u0002\u0011==Z\u001e|7\u001b%O\u001cX \n)M3\u0001+]\u0005A\u0000G\u001d^9l?v6.=Q5z!!){0z+\u000e\u001dZ#r\u001d?\u0014\nnd\u0011?F_5x7\u0007\u0010\u0001";
        objectArray[1] = Double.TYPE;
        m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b[1] = "java/lang/Double";
        objectArray[2] = Float.TYPE;
        m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b[2] = "java/lang/Float";
        objectArray[3] = "\u007fkD\r#@qb\u0003\u0005$[<c\u0003\u0018#A<cND\u0001IG:\u001d\r\u0005}u~;V)NpO&3!CqF\u0000\"&N#@]%\"Ac\u007f#\u0005;|Gf$T\u0013\u001e_O+\r=XK}8\u0019xJVX(\u00148Wz\\_\u0015,G+~\u000b*9G*yS\u0002\u007f\u0016aK\u0004\u00030_*A,\u0019(@SJ\u0010,x";
        objectArray[4] = Void.TYPE;
        m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b[4] = "java/lang/Void";
        objectArray[5] = "#\n\u001cu%t-\u0003[}\"o`\u0002\u0016<-J\u001b\u001d\\P+Jz?\u0007u\u0019u&\u0007k\u007f;i\u000b\u001dwB\u0005m\u0006VvT%L~=@M%(8$\u0004b*M}%b*\u000e~z<\u0002B\u0004]!8\u0001]'W\u001b&V\u007f\rZ\u001c\u001aB.\u001bs'!Ck\u001eT/]Pl!O+WJixj&[CP!";
        objectArray[6] = Long.TYPE;
        m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b[6] = "java/lang/Long";
        objectArray[7] = Integer.TYPE;
        m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.b[7] = "java/lang/Integer";
        objectArray[8] = "`\u0006*\u0001\u0001\nk\t;Nb\u0007~\u000f";
        objectArray[9] = "\u001f*1\u0005\u001et\u0014% J\u007fz\u001f.$\u0010";
        objectArray[10] = "\u0019B\f)L=D_I4)\u0019\u0013CE'\u00115`S4kcveU\u0007*OzAY?\u0018o.X|5lS\u0000[N\u0010\u0012N\u0019b\n\u0010oJxHoNl\u0014\u0003Y]\t\u0016m+\u001dY\u00184p\u0015BR*\u0014\u0018 cY2j[>\u0012Y>-{\u0004d^?5x\f~`L1M\u0000pO9$S\u007f@\t'V\u0015-EB\u0019?Cx\u001bUukE\u007f@\u000eM*\u0017\u007fO2";
        objectArray[11] = "~gcW;.hy.3`m>{\"Bj\fB2\u0005BJ=)W;JZz\"o?VzqNB Z|xXd>tt\u0005[2=\rU\bxw\u000frb,Y2\u0019\tUqmToWi/CrgQ;#mfeog;{2\u001bch~mT\rwH\f{{&H;'Y1\u000f\u0003Zp\\9_\n>q}r \t9\u007f\u007f\tf\b5.ive\u000f;,\u00120d\u0003j:m3c\rhA+2o\\~>(5a^\u0005xrw/\\l|\u007fr43";
        objectArray[12] = "\u0005tX3r`\u0013j\u0015W)#Eh\u0019&#B9!>&\u0003sRD\u0000.\u00134Y|\u000423?5Q\u001b>56#w\u0005\u0010=K !\u0006i\u001cF\u0003d4\u0016+b\"!\"m\u001c?\u0016GT3 a8a\\5rm\u0016u^\u000b.u\u0000! \u0007!0\u0016G6\u0013\u0001B\u0000h\u001d,ri\"\"4g\u0013>'*dm|1Ub\u001a9 \u007f\u0017\u001a]l|`\u0012e^krbi#_g#t\u0016 Xi!\u000fP!T87pS&Z:L4\u0002&\u001c'*a\u0003e\bW";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "D\u0019ih\u001c+\u0014\u0002xnp)\b\u0005mwppBMep\u000fsECg\u000bIrI\u0012qtJuG\u0010\n2Ky\u0016\u0006u1Lw\u0014}";
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$KfU4wmORgpQ6cabALSklcHjBla1N7EhnqqIeqSUhN4Y1MAAmwwYsRy2eDVBtrxhR5ufh9paJsh8w9b59sEnczp8OFyboADzL2 m$$KfU4wmORgpQ6cabALSklcHjBla1N7EhnqqIeqSUhN4Y1MAAmwwYsRy2eDVBtrxhR5ufh9paJsh8w9b59sEnczp8OFyboADzL2, double d, double d2, double d3) {
        m$$KfU4wmORgpQ6cabALSklcHjBla1N7EhnqqIeqSUhN4Y1MAAmwwYsRy2eDVBtrxhR5ufh9paJsh8w9b59sEnczp8OFyboADzL2.setX(d);
        m$$KfU4wmORgpQ6cabALSklcHjBla1N7EhnqqIeqSUhN4Y1MAAmwwYsRy2eDVBtrxhR5ufh9paJsh8w9b59sEnczp8OFyboADzL2.setY(d2);
        m$$KfU4wmORgpQ6cabALSklcHjBla1N7EhnqqIeqSUhN4Y1MAAmwwYsRy2eDVBtrxhR5ufh9paJsh8w9b59sEnczp8OFyboADzL2.setZ(d3);
    }

    public static float m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(double d, double d2, double d3, double d4) {
        double d5 = d - d3;
        double d6 = d2 - d4;
        return (float)m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a("\u00ea", (double)d5, (double)d6, (long)976332804866895L);
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_243 class_2432, double d, double d2, double d3) {
        m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a("\u00ea", (Object)((m$$KfU4wmORgpQ6cabALSklcHjBla1N7EhnqqIeqSUhN4Y1MAAmwwYsRy2eDVBtrxhR5ufh9paJsh8w9b59sEnczp8OFyboADzL2)class_2432), (double)d, (double)d2, (double)d3, (long)911378452234178L);
    }

    public static float m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(class_243 class_2432, class_243 class_2433, int n) {
        return (float)m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.a("\u00ea", (double)class_2432.field_1352, (double)class_2432.field_1350, (double)class_2433.field_1352, (double)class_2433.field_1350, (long)802965625151096L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

