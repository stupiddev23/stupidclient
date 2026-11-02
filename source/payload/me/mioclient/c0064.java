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
import java.util.function.Consumer;
import net.minecraft.class_151;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
abstract class m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW {
    public boolean m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi;
    public Object m$$2IKqjxM5CCie1feTOyNzeD5vWgFFfvJQ7T4SMJyImuhiOyHyEyeD36Lvf9fAz6LUqaIZCIjmQqDutGRG8Qj9ZrxNuC8B5LQFl;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[8];
        b = new String[8];
        m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a();
        long l = 6651602567525645417L;
        long l2 = 0x67A1C094DF80AA40L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 8368363838015742303L;
        long l4 = 0x459F55AAD67CDA8FL ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a("\u00aa", (long)l4, (long)490093331359439L);
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a(clazz3, string2, clazz2)) != null) {
                    m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b(327269754500439L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a(l);
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
                clazz3 = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b(327269754500439L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b(327269754500439L);
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
            throw new RuntimeException("me/mioclient/m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW" + " : " + string + " : " + methodType.toString(), exception);
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
        MethodHandle methodHandle = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c4' || c == 'A' || c == 'h' || c == '\u00ba') {
                field = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'A' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'h' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'n' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00aa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "\u0004C-fo!\nJjnh:GK'/g\u001f<TmCa\u001f]v6fS \u0001NZlq<,TFQO8!\u001fGGo\u0019Ytq^o}\u001fm5q`\u0018ZlS9D+]u3QN\b\u0006q0Nm\u0002<oglG\u000f;Ss=Q&\u0000hrxT\u0001\b\u0014a\u007fk\u001a\f\u001e{z2?\u0001\u0012rCk";
        objectArray[1] = Long.TYPE;
        m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b[2] = "java/lang/Integer";
        objectArray[3] = "l%h\u0011\u001d~r-r^U~h'j\u0019\\e(\u0007q\u001e@~k!l";
        objectArray[4] = "s*&_aPx%7\u0010\u0000^s.3J";
        objectArray[5] = Void.TYPE;
        m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b[5] = "java/lang/Void";
        objectArray[6] = "=T}=DQ;\u001a*\u0000s\u001ev\u001b68_mfjzJ\u001ch`Y;f\u0010Lla\tFDUIk}zjV{N\u0003gso?N~c\u0012EZ\u0010}=iThW\u0007DA\u0010lF%Y\u007fOgt\u00051Jnll{rT\u001fl`<Rnika$QfsU\u0012 dj}zg5z\u0015M<yG}PTf\u0012|?T\u001f\u0007\u0011}bBLn\u0011;`T/";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "(g\u00076cDmz\u00116\nUyj\u00151v<)1@xlP`:\u0018r\n\u0007l0BtkYb}\u0011I";
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
            case 0 -> 57;
            case 1 -> 4;
            case 2 -> 22;
            case 3 -> 6;
            case 4 -> 34;
            case 5 -> 52;
            case 6 -> 48;
            case 7 -> 19;
            case 8 -> 10;
            case 9 -> 45;
            case 10 -> 27;
            case 11 -> 55;
            case 12 -> 42;
            case 13 -> 8;
            case 14 -> 33;
            case 15 -> 0;
            case 16 -> 30;
            case 17 -> 63;
            case 18 -> 31;
            case 19 -> 13;
            case 20 -> 17;
            case 21 -> 14;
            case 22 -> 1;
            case 23 -> 35;
            case 24 -> 21;
            case 25 -> 25;
            case 26 -> 11;
            case 27 -> 16;
            case 28 -> 32;
            case 29 -> 23;
            case 30 -> 41;
            case 31 -> 49;
            case 32 -> 5;
            case 33 -> 51;
            case 34 -> 36;
            case 35 -> 59;
            case 36 -> 37;
            case 37 -> 7;
            case 38 -> 56;
            case 39 -> 60;
            case 40 -> 46;
            case 41 -> 39;
            case 42 -> 28;
            case 43 -> 24;
            case 44 -> 54;
            case 45 -> 12;
            case 46 -> 62;
            case 47 -> 40;
            case 48 -> 50;
            case 49 -> 53;
            case 50 -> 38;
            case 51 -> 43;
            case 52 -> 58;
            case 53 -> 20;
            case 54 -> 9;
            case 55 -> 3;
            case 56 -> 2;
            case 57 -> 18;
            case 58 -> 26;
            case 59 -> 29;
            case 60 -> 15;
            case 61 -> 61;
            case 62 -> 44;
            default -> 47;
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
        m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b[n3] = new String(cArray);
        return n3;
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Consumer consumer) {
        try {
            if (this.m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi) {
                m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a("n", (Object)consumer, (Object)this.m$$2IKqjxM5CCie1feTOyNzeD5vWgFFfvJQ7T4SMJyImuhiOyHyEyeD36Lvf9fAz6LUqaIZCIjmQqDutGRG8Qj9ZrxNuC8B5LQFl, (long)533682709645894L);
            }
        }
        catch (class_151 class_1512) {
            throw m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a(class_1512);
        }
        this.m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi = false;
    }

    public void m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM(Object object) {
        this.m$$2IKqjxM5CCie1feTOyNzeD5vWgFFfvJQ7T4SMJyImuhiOyHyEyeD36Lvf9fAz6LUqaIZCIjmQqDutGRG8Qj9ZrxNuC8B5LQFl = object;
        this.m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi = true;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

