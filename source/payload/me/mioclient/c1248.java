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
import me.mioclient.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW;
import me.mioclient.m$$qcNVZwOl6hTO8ZDLdynSC3aYPC0Tytjx2An8dbajr1bsIp0Yug4yIM7yXRhwAqpnNEdAueNjcZnfHJGbDksR3nmc6144djOz7;
import net.minecraft.class_2338;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H
implements m$$qcNVZwOl6hTO8ZDLdynSC3aYPC0Tytjx2An8dbajr1bsIp0Yug4yIM7yXRhwAqpnNEdAueNjcZnfHJGbDksR3nmc6144djOz7 {
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[5];
        b = new String[5];
        m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a();
        long l = 5635242633948539883L;
        long l2 = 0x106B92BE9BA68685L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 8439273003380529802L;
        long l4 = 0x126DC8D9AF21318CL ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a("y", (long)l4, (long)339803808337378L);
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a(clazz3, string2, clazz2)) != null) {
                    m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b(232938391891266L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a(l);
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
                clazz3 = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b(232938391891266L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b(232938391891266L);
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

    public static void a() {
        Object[] objectArray = a;
        a[0] = "*C`\u0006G/$J'\u000e@4iKjOO\u0011\u0012T #I\u0011sv{\u0006{./N\u0017\fY2\u0002T\u000b1g6\u000f\u001f\n'G\u0017wt<>Gs1mx\u0011H\u0016tl\u001eYl%su~1f\u0006(q}.E\f\u0012o*\fo\u0001\u0015S>]y(.h?\u0018|\u000f&\u0014,\u001fC\u0014\"\u001e6\u001a\u001a1/\u0012?#C";
        objectArray[1] = Long.TYPE;
        m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b[2] = "java/lang/Integer";
        objectArray[3] = "W\u0014$J2h\\\u001b5\u0005SfW\u00101_";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "m\u00022!q8|E8\u001aSur\r-\"\u007f\u0006b|aP<\u0003dO |0'hw\u0012\\d>M}f`J=\u007fX\u0018}S\u0004;Xey2.^\u0006f'I?lA\u001c^a{hP>C_$cb\u001e+j\u0005hz`htthv'HN\u0002ow?KF\u0018Q\u0004;~J\u0016~q.`5&8o\\#74<\u0003c l!`=eu0%{^;j1&\u0003";
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
            throw new RuntimeException("me/mioclient/m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 12;
            case 1 -> 23;
            case 2 -> 27;
            case 3 -> 6;
            case 4 -> 40;
            case 5 -> 46;
            case 6 -> 63;
            case 7 -> 4;
            case 8 -> 61;
            case 9 -> 25;
            case 10 -> 42;
            case 11 -> 5;
            case 12 -> 55;
            case 13 -> 22;
            case 14 -> 51;
            case 15 -> 31;
            case 16 -> 60;
            case 17 -> 16;
            case 18 -> 34;
            case 19 -> 21;
            case 20 -> 49;
            case 21 -> 2;
            case 22 -> 43;
            case 23 -> 28;
            case 24 -> 11;
            case 25 -> 3;
            case 26 -> 32;
            case 27 -> 14;
            case 28 -> 36;
            case 29 -> 44;
            case 30 -> 0;
            case 31 -> 20;
            case 32 -> 24;
            case 33 -> 9;
            case 34 -> 8;
            case 35 -> 15;
            case 36 -> 1;
            case 37 -> 7;
            case 38 -> 48;
            case 39 -> 54;
            case 40 -> 41;
            case 41 -> 39;
            case 42 -> 26;
            case 43 -> 37;
            case 44 -> 47;
            case 45 -> 56;
            case 46 -> 58;
            case 47 -> 53;
            case 48 -> 52;
            case 49 -> 33;
            case 50 -> 18;
            case 51 -> 35;
            case 52 -> 62;
            case 53 -> 17;
            case 54 -> 13;
            case 55 -> 59;
            case 56 -> 45;
            case 57 -> 29;
            case 58 -> 19;
            case 59 -> 50;
            case 60 -> 30;
            case 61 -> 10;
            case 62 -> 57;
            default -> 38;
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
        m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.b[n3] = new String(cArray);
        return n3;
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'A' || c == '\u00d1' || c == 'a' || c == 'N') {
                field = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'A' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW) {
    }

    @Override
    public void m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T(double d) {
    }

    @Override
    public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW) {
    }

    @Override
    public void m$$fpGL7c3hh9Wq0GjZGbUWsMGOqxjqgcrE05H4OUl0FpiGYoHnjcDrxjKurfxMvIVKaJ4GAuaRgVOLd2AOlBDxzNHQjDNpEjvwE(class_2338 class_23382) {
    }

    @Override
    public void m$$RXAAF1UWbqfR7ewT0aDm3TPaCz0dCiHb0DxBGpXfydpD7XJVmNPOC39TVZFtYD0y1Kk7kSAqamzarVyYw0fIIOHZ6y12QZgqf(class_2338 class_23382) {
    }

    @Override
    public void m$$8yf8hmWcwnV115J7w4KrjVhYE8HEuE4PB5pBB8AhjESSuPrGzBSt6CuiF6rDxr5CjNTMNCqTQSyatgOBJq2g3NS6lC9onnNXL() {
    }

    @Override
    public void m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ(class_2338 class_23382) {
    }

    @Override
    public boolean m$$T5QjgVkXokAMhZVP1TJgOUAZr1F4IkUWPcj8rW8yv2Wz0RuU9vvXdfIZ82QkLiLNQuwut5TACp7Q9GkiqTGwMA3X7exWGnKD1() {
        return false;
    }

    @Override
    public boolean m$$RVXdTPEBtwYgCgSacl3VK6lBAUyygB1olF72V6KfrF3G8aFX6KxoRVFhQIsgPbfpQfwCwmxBF9XUM4yTtoMPBC0d6RvccDjm1() {
        return false;
    }

    @Override
    public boolean m$$hbpSAO8YrfjFQ3hDvGB1czBsMba2J3FvLoj8OY4AaBeawpWo3snlTKPnByukxuzxXBg724dNMUbwrf22JNTV82RHUm3pFOjtl() {
        return false;
    }

    @Override
    public boolean m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx(class_2338 class_23382) {
        return false;
    }

    @Override
    public class_2338 m$$nBN1zcf4EDOJV5Rky9MJuGc7nFuXRd7lUaVnoM7MKbfN9Eoa53fRZLKaRreSCnfM7EkXfSAmha7zObBVITEm9CTQnF5r99VQc() {
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

