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
import java.util.LinkedList;
import net.minecraft.class_151;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO
extends LinkedList {
    public final int m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    public m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO(int n) {
        this.m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[10];
        b = new String[10];
        m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a();
        long l = 6670827216852499680L;
        long l2 = 0xB9A82AFC9A8768DEL ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 3955183899367814281L;
        long l4 = 0x7049B17CBD723B1EL ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a("\u00fa", (long)l4, (long)438242097806092L);
    }

    @Override
    public boolean add(Object object) {
        try {
            if (m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a("g", (Object)this, (long)591773769573299L) >= this.m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud) {
                m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a("g", (Object)this, (long)509696114929903L);
            }
        }
        catch (class_151 class_1512) {
            throw m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a(class_1512);
        }
        try {
            if (m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a("g", (Object)this, (Object)object, (long)638757247869351L) != false) {
                return false;
            }
        }
        catch (class_151 class_1513) {
            throw m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a(class_1513);
        }
        return super.add(object);
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a(clazz3, string2, clazz2)) != null) {
                    m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b(283354922198770L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a(l);
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
                clazz3 = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b(283354922198770L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b(283354922198770L);
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

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'f' || c == '\u00b5' || c == '\u00eb' || c == 'Z') {
                field = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'f' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00eb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'g' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "\u0000;7v-x\u000e2p~*cC3=?%F8,wS#FY\u000e,v\u0011y\u00056@|3e(,\\A\ra%g]W-@]\fkN-$\u001b\u0015/a\"A^\u0014I)\u0006rY\r)A\fQ\u0002\t*^/[8\u0017}|\u0005V?+i-\u0013\u007f\u0004\u0010hh\u0016X\fl{o)C\bfajpf\u0005jhS)";
        objectArray[1] = Long.TYPE;
        m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b[2] = "java/lang/Integer";
        objectArray[3] = "\u0015jG\u000eCV\u001bc\u0000\u0006DMVbMG\u001ds2z%$}_9l\u0011\u000fKP\u0000{# c\u000b\u0016F\u0005\n[\u0001>I\u0003.\u0018`\u0011\u007f\u0018R]q\u000f@0W^\t/`QUPm\u0017_ \u0002c\n\u0011d#'f@9K &A`NuQ\u0017DN\u0013}\u000b3Mx>`Z\u001aB~3N:\u0016]K,{]/e";
        objectArray[4] = "mM\n^0/fB\u001b\u0011Q!mI\u001fK";
        objectArray[5] = Boolean.TYPE;
        m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b[5] = "java/lang/Boolean";
        objectArray[6] = "w^\fX\u0006\u0004&\f\u0005<>G=\r\u000f\u0004\u00124-|CvQ1+O\u0002Z]\u0015'w0z\t\f\u0002}DF'\u000f0X:[>6tXG__\u001c\u0011\u0006D\u0001$\r#A>x\fI'P\u001ce2\u0016,b<\r\u00077'zBN\u0019F'v\u0005n#0 w\u001dm+*\u001e\u0004\u0019X'$1q\fFX\u0014wo~\u0005QLp\r\u0014Z\u000e\u0014<=GS\u0002H&\u0007\u001e^\u001aFL";
        objectArray[7] = "gG\u0013\u000fv!$\u0002\u0019SL 0\u001d\u000e\u0017!\u0014<\u0002\u0012\u0015L`&\u0016\u0017\u0006'=aD\u0018i";
        objectArray[8] = "\u0016x\u001aF\u0017bU=\u0010\u001a-bM5\r \u0014vNy\n\u001aM{Vw`";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "^E\u0016U#\u0006\u001d\u0000\u001c\t\u0019\u0016\u0003\u001c\u0010Zx\u001b\u001fzVHw\u0003\u000b\u0011\u000b\u000f%\fdA\n\\\"F\u0015@\u001eAg}";
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
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
            case 0 -> 47;
            case 1 -> 46;
            case 2 -> 57;
            case 3 -> 35;
            case 4 -> 25;
            case 5 -> 41;
            case 6 -> 34;
            case 7 -> 38;
            case 8 -> 58;
            case 9 -> 37;
            case 10 -> 26;
            case 11 -> 23;
            case 12 -> 52;
            case 13 -> 44;
            case 14 -> 32;
            case 15 -> 7;
            case 16 -> 10;
            case 17 -> 50;
            case 18 -> 48;
            case 19 -> 53;
            case 20 -> 8;
            case 21 -> 4;
            case 22 -> 62;
            case 23 -> 3;
            case 24 -> 16;
            case 25 -> 28;
            case 26 -> 2;
            case 27 -> 49;
            case 28 -> 1;
            case 29 -> 19;
            case 30 -> 11;
            case 31 -> 45;
            case 32 -> 56;
            case 33 -> 31;
            case 34 -> 15;
            case 35 -> 14;
            case 36 -> 40;
            case 37 -> 54;
            case 38 -> 0;
            case 39 -> 24;
            case 40 -> 12;
            case 41 -> 20;
            case 42 -> 55;
            case 43 -> 6;
            case 44 -> 22;
            case 45 -> 17;
            case 46 -> 30;
            case 47 -> 63;
            case 48 -> 36;
            case 49 -> 59;
            case 50 -> 43;
            case 51 -> 29;
            case 52 -> 51;
            case 53 -> 42;
            case 54 -> 60;
            case 55 -> 5;
            case 56 -> 21;
            case 57 -> 13;
            case 58 -> 27;
            case 59 -> 33;
            case 60 -> 18;
            case 61 -> 39;
            case 62 -> 9;
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
        m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.b[n3] = new String(cArray);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

