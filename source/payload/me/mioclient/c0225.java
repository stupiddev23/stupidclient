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
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import me.mioclient.m$$9CfHjbrlg3lojvzMCur3pT97wrs5DycHxtyGDkWIYydsdQHR12da1jLKeR7NhqPxNFjETsEDoDPgJQaA8s40JZucSUhtkV6u1;
import net.minecraft.class_151;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ
implements m$$9CfHjbrlg3lojvzMCur3pT97wrs5DycHxtyGDkWIYydsdQHR12da1jLKeR7NhqPxNFjETsEDoDPgJQaA8s40JZucSUhtkV6u1 {
    public final Collection m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] k;
    public static final String[] l;

    public m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ(Collection collection) {
        this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB = collection;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        k = new Object[16];
        l = new String[16];
        m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a();
        long l = 2440113942945561265L;
        long l2 = 0xE1CB3BEEECB238DFL ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 3225022839967310682L;
        long l4 = 0x66D755CB0FD9B0CFL ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a("n", (long)l4, (long)962940018117927L);
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a(l);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.k[n] = clazz = Class.forName(m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a(l);
        Object object = k[n];
        if (object instanceof String) {
            String string = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.l[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a(clazz3, string2, clazz2)) != null) {
                    m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.b(242045972152622L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a(l);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.b(242045972152622L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.b(242045972152622L);
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
            if (c == '\u00ec' || c == 'C' || c == '\u00ef' || c == '\u00d1') {
                field = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ec' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'n' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("me/mioclient/m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ" + " : " + string + " : " + methodType.toString(), exception);
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
        MethodHandle methodHandle = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int a(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 46;
            case 1 -> 24;
            case 2 -> 3;
            case 3 -> 18;
            case 4 -> 53;
            case 5 -> 38;
            case 6 -> 36;
            case 7 -> 22;
            case 8 -> 0;
            case 9 -> 21;
            case 10 -> 13;
            case 11 -> 56;
            case 12 -> 34;
            case 13 -> 19;
            case 14 -> 29;
            case 15 -> 49;
            case 16 -> 2;
            case 17 -> 33;
            case 18 -> 5;
            case 19 -> 61;
            case 20 -> 44;
            case 21 -> 11;
            case 22 -> 25;
            case 23 -> 55;
            case 24 -> 39;
            case 25 -> 16;
            case 26 -> 14;
            case 27 -> 35;
            case 28 -> 45;
            case 29 -> 58;
            case 30 -> 26;
            case 31 -> 15;
            case 32 -> 41;
            case 33 -> 40;
            case 34 -> 7;
            case 35 -> 57;
            case 36 -> 42;
            case 37 -> 28;
            case 38 -> 54;
            case 39 -> 23;
            case 40 -> 47;
            case 41 -> 62;
            case 42 -> 10;
            case 43 -> 4;
            case 44 -> 8;
            case 45 -> 52;
            case 46 -> 1;
            case 47 -> 17;
            case 48 -> 27;
            case 49 -> 12;
            case 50 -> 32;
            case 51 -> 37;
            case 52 -> 50;
            case 53 -> 48;
            case 54 -> 6;
            case 55 -> 43;
            case 56 -> 60;
            case 57 -> 59;
            case 58 -> 9;
            case 59 -> 51;
            case 60 -> 31;
            case 61 -> 20;
            case 62 -> 30;
            default -> 63;
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
        m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.l[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = k;
        k[0] = "iOrO\u000b\u0011wGh\u0000l\u0010f\\eZJ\u0016";
        objectArray[1] = Boolean.TYPE;
        m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.l[1] = "java/lang/Boolean";
        objectArray[2] = "\u0017!pVHX\t)j\u0019\u0000X\u0013#r^\tCS\u0010tR\u0002D\u001e!rR";
        objectArray[3] = "3q`vyo8~q9\u0018a3uuc";
        objectArray[4] = "\u00189\u000fx\u0016(\u00061\u00157{2\u001e4\u001czL4\u001d6";
        objectArray[5] = "F-}\n\u0014kH$:\u0002\u0013p\u0005%wC\u001cU~:=/\u001aU\u001f\u0018f\n(jC \n\u0000\nvn:\u0016=4rcq\u0017+\u0014S\u001b\u001a!2\u00147]\u0003e\u001d\u001bR\u0018\u0002\u0003U?a\u001f\u001bc=5BD\u001f`\"\u0016H~\u00017\u0000<Ey=#Q*lB\u0006\"\u0014/KJz1\u0013\u0010PNp+\u0016IuC|\"/\u0010";
        objectArray[6] = Long.TYPE;
        m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.l[6] = "java/lang/Long";
        objectArray[7] = Integer.TYPE;
        m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.l[7] = "java/lang/Integer";
        objectArray[8] = "{l\r=wJed\u0017r\u0016Oed\u001428S";
        objectArray[9] = "C\u000bh1!2\u0014\u00105A0`\u0006=i1,\tD\u00174|6p\u001aJ{.P";
        objectArray[10] = "W3czjQ\u00047ra\fB\u00031`\u001e6R\u00153pc`Z\u00163\u001c'`\u000eS,ey=A\u0001J";
        objectArray[11] = "\u001ck\u0005Ft%H8@X\fxLQAPwfN,\u0017Xtf\"oABvg\u0018;\u0012\u0007h\u001f";
        objectArray[12] = "vWE~j\u000f/\tL?\u0012\u00171\u0007Y*n\u00117j\u001d3~\u0006<QJ(#v";
        objectArray[13] = "X{H={~\u001drK?\u0004ORhG*<c!x6fN $~\u0005'b,\u0000r=\u0015Bx\u0019W7a~V\u001ae\u0012\u001fcO#!\u0012bg.\tDLa9U\u0018v\u000b\u001b@}\\r\u001a9]C\u0003y(\u00195v\"r0gvhSr< VR%u=8UZ?KN<`V1d;)~)\u0001\"%[8i\u001fd\u0006>4x\u001a)wfmn\u0013 \u00169uq\u0018\u0019";
        objectArray[14] = "q\u0012b&\u001e\u001e%A'8fI*P`-f\u001auVf$\\N&\u0013x\\";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "|v\"b&N+m\u007f\u00121\u00182zN(;\u000e;j3~3\r;\u0006";
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public Optional m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Predicate predicate) {
        CallSite callSite = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a("\u00e5", (Object)this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB, (long)897105596049718L);
        while (m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a("\u00e5", (Object)callSite, (long)660191313442970L) != false) {
            CallSite callSite2 = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a("\u00e5", (Object)callSite, (long)1120689248419483L);
            try {
                if (m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a("\u00e5", (Object)predicate, (Object)callSite2, (long)721858505742176L) == false) continue;
                return m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a("n", (Object)callSite2, (long)817114405134290L);
            }
            catch (class_151 class_1512) {
                throw m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a(class_1512);
            }
        }
        return m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a("n", (long)993393851173716L);
    }

    public Object m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(Predicate predicate, int n) {
        CallSite callSite = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a("\u00e5", (Object)this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB, (long)897105596049718L);
        while (m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a("\u00e5", (Object)callSite, (long)660191313442970L) != false) {
            CallSite callSite2 = m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a("\u00e5", (Object)callSite, (long)1120689248419483L);
            try {
                if (m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a("\u00e5", (Object)predicate, (Object)callSite2, (long)721858505742176L) == false) continue;
                return callSite2;
            }
            catch (class_151 class_1512) {
                throw m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a(class_1512);
            }
        }
        return null;
    }

    @Override
    public Collection getRegistry() {
        return this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

