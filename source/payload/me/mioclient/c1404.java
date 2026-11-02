/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import com.google.gson.JsonElement;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import me.mioclient.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB {
    public JsonElement m$$Qzmz4n5X3RxeVGH5Ev4ZXSvAl3fWI915uwkbydELJCaYYYDEtskjJagXo08jsUiACldUycmR2kG1P7Tx5HfAwQ9KRNNN98U0z;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[8];
        b = new String[8];
        m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a();
        long l = 1359565102161309187L;
        long l2 = 0x5E8A373FD356EF6DL ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 5906635362474122269L;
        long l4 = 0x4BCBD19FE1FBDEC9L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a("B", (long)l4, (long)498463970638658L);
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a(clazz3, string2, clazz2)) != null) {
                    m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b(400400826221281L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a(l);
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
                clazz3 = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b(400400826221281L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b(400400826221281L);
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
            if (c == '\u00c8' || c == '\u00f0' || c == 'z' || c == '\u00d5') {
                field = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f0' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00da' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'B' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a(lookup, mutableCallSite, string, methodType, l);
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
            case 0 -> 44;
            case 1 -> 26;
            case 2 -> 22;
            case 3 -> 57;
            case 4 -> 63;
            case 5 -> 50;
            case 6 -> 58;
            case 7 -> 24;
            case 8 -> 30;
            case 9 -> 39;
            case 10 -> 4;
            case 11 -> 9;
            case 12 -> 61;
            case 13 -> 18;
            case 14 -> 51;
            case 15 -> 17;
            case 16 -> 31;
            case 17 -> 40;
            case 18 -> 13;
            case 19 -> 6;
            case 20 -> 11;
            case 21 -> 15;
            case 22 -> 5;
            case 23 -> 35;
            case 24 -> 56;
            case 25 -> 52;
            case 26 -> 29;
            case 27 -> 0;
            case 28 -> 14;
            case 29 -> 19;
            case 30 -> 20;
            case 31 -> 32;
            case 32 -> 53;
            case 33 -> 60;
            case 34 -> 33;
            case 35 -> 45;
            case 36 -> 27;
            case 37 -> 21;
            case 38 -> 25;
            case 39 -> 23;
            case 40 -> 41;
            case 41 -> 12;
            case 42 -> 28;
            case 43 -> 55;
            case 44 -> 62;
            case 45 -> 47;
            case 46 -> 34;
            case 47 -> 43;
            case 48 -> 49;
            case 49 -> 59;
            case 50 -> 16;
            case 51 -> 54;
            case 52 -> 37;
            case 53 -> 46;
            case 54 -> 36;
            case 55 -> 38;
            case 56 -> 8;
            case 57 -> 42;
            case 58 -> 2;
            case 59 -> 1;
            case 60 -> 10;
            case 61 -> 48;
            case 62 -> 3;
            default -> 7;
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
        m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b[n3] = new String(cArray);
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
            throw new RuntimeException("me/mioclient/m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "\n'f\u000fI#\u0004.!\u0007N8I/lF\u0010~/4;3O\u0018\u0011.&\u001bD\u001e1\u000b\u001fQ\u0016\b($~+H\"($!\u0006t|_\u001a?\u0013G\b7\u0012\u000b8\u0012\u001b\u0013%#\u0007C9Ppp5G83/qZA=^$\u00021s\u00182\u0015\u00066n\u001d\u000f/$%\u0015\"Q1\u000f\u0005\u0011\u0014\f4\u0011Wkx#+\u001a-Q";
        objectArray[1] = "+|v1X\u0019'twz\u0011\u0011;|u1u\u0005'}^sZ\u001b-}o";
        objectArray[2] = "p4\u0017eB\u0013~=PmE\b3<\u001d,J-H#W@L-)\u0001\fe~\u0012u9`o\\\u000eX#|Rb\nUh}DB+-\u0003K]BOk\u001a\u000frM*.\u001bi:i\u0019)\u0002\tRc:r\u0006\nM@0H\u0018]oj=O$I>|\u0014t\u001fH{y3|c[|F(xiAy\u001f\rueH@F";
        objectArray[3] = Long.TYPE;
        m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b[3] = "java/lang/Long";
        objectArray[4] = Integer.TYPE;
        m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.b[4] = "java/lang/Integer";
        objectArray[5] = "ox^n+\rdwO!J\u0003o|K{";
        objectArray[6] = "k\u001800o]iH}Sb\u0004\u0014Y+5\u001eZkX*2`\u0005*]wS";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "A/\"\u0018Uj\u001886V3QI&|\u0018\u000b}:6\rTy>?0>\u0015U2\u001b<\u0006'uf\u0002\u0019\fSIH\u0001+)-TQ8o)PP0\u0012\nwS\u000eK\u000380)wcG<!\u000bj]\u00187\u0013+\u0002h9<\u000bUAvH<\u0007\u0012aL>;\u0006\nbD$\u0005u\u000eWH**\u0000\u001bI7\u001al\u001ei\t`A4&SUf\u0001=LR\u0003tF&4\u0006W7\u001fW";
    }

    public void m$$sG1kYme00hRMtILzdLCYk1TAIRecxTRj7gTK3VlZgOXTy42ELPkTAkpFc8XUwUtARcGeseqFXe2lEcVU2V2E90oP7poPlndEn(int n) {
        this.m$$Qzmz4n5X3RxeVGH5Ev4ZXSvAl3fWI915uwkbydELJCaYYYDEtskjJagXo08jsUiACldUycmR2kG1P7Tx5HfAwQ9KRNNN98U0z = m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.a("\u00da", (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.m$$VtwCqdzXgNXG3fWH20WhjeAdb35KlKglOOHwxkOjYS5xvROXHZ6SewtZiIYDUBEpVW7vKFmH4onADTW3OP9poJozhMNvlmAxl, (long)443980902668422L);
    }

    public JsonElement m$$sFR9J58TiJt4SURJ4nPz12Se4pOkKJ7iYN4CS9EKKCzEW3kX8BPpBjbC0BmWqYKthnRisC655iBqC8chjCpxsFbfOThA5LcU9(int n) {
        JsonElement jsonElement = this.m$$Qzmz4n5X3RxeVGH5Ev4ZXSvAl3fWI915uwkbydELJCaYYYDEtskjJagXo08jsUiACldUycmR2kG1P7Tx5HfAwQ9KRNNN98U0z;
        this.m$$Qzmz4n5X3RxeVGH5Ev4ZXSvAl3fWI915uwkbydELJCaYYYDEtskjJagXo08jsUiACldUycmR2kG1P7Tx5HfAwQ9KRNNN98U0z = null;
        return jsonElement;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$yxWAYHaWAUeFYC9sPtwC4IFE7ouyjbk0jbM2CamuRjSorGdqlDCEDd1ORKfL8lBgugBLdu4aczxDW71V2xovBZOq8OTJweOGB.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

