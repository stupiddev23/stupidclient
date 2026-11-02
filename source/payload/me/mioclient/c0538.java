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
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$qcNVZwOl6hTO8ZDLdynSC3aYPC0Tytjx2An8dbajr1bsIp0Yug4yIM7yXRhwAqpnNEdAueNjcZnfHJGbDksR3nmc6144djOz7;
import me.mioclient.m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV {
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String a;
    public static final Object[] b;
    public static final String[] c;

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n;
            char[] cArray2;
            int n2;
            int n3;
            block11: {
                b = new Object[8];
                c = new String[8];
                m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.a();
                char[] cArray3 = "?J\u0001K\u001cHZ8\u0005\u0012R\u0001\tv<Y\u001aV\u0007IQ\u001c{:".toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 71;
                cArray2 = cArray3;
                n = n4;
                if (n4 <= 1) break block11;
                cArray = cArray2;
                n = n;
                if (n <= n3) break block12;
            }
            do {
                int n5 = n2;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n6 = n2;
                int n7 = n3;
                while (true) {
                    cArray4[n7] = (char)(cArray4[n7] ^ (n6 ^ (switch (n3 % 7) {
                        case 0 -> 26;
                        case 1 -> 108;
                        case 2 -> 52;
                        case 3 -> 101;
                        case 4 -> 47;
                        case 5 -> 96;
                        default -> 115;
                    })));
                    ++n3;
                    n2 = n5;
                    if (n5 != 0) break;
                    n5 = n2;
                    cArray2 = cArray2;
                    n7 = n2;
                    cArray4 = cArray2;
                    n6 = n2;
                }
                cArray = cArray2;
                n = n;
            } while (n > n3);
        }
        a = new String(cArray).intern();
        long l = 5462551119383874143L;
        long l2 = 0x53990208E1BAC5CAL ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 8717814386934358132L;
        long l4 = 0x7781DB54B2E2B0D1L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.a("\u00a2", (long)l4, (long)492619762495680L);
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.a(l);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.a(l);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.a(clazz3, string2, clazz2)) != null) {
                    m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b(387778386973853L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.a(l);
        Object object = b[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = c[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b(387778386973853L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.b(387778386973853L);
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

    public static void a() {
        Object[] objectArray = b;
        b[0] = "\u0011\u0015\\\u001e\u001aX\u001f\u001c\u001b\u0016\u001dCR\u001dVW\u0012f)\u0002\u001c;\u0014fH G\u001e&Y\u0014\u0018+\u0014\u0004E9\u00027):A4I6?\u001a`L\"\u0000&\u001a\u0004\n;D\t\u0015aO:\"A1RH#B);q\u0013'A6\u0018{)9\u0016\u00142v.\u0005\u0002E$_\u0015>\u0003\u0000!x\u001dB\u0010\u0007\u001ec\u0019H\n\u0002GF\u0014D\u0003;\u001e";
        objectArray[1] = Long.TYPE;
        m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.c[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.c[2] = "java/lang/Integer";
        objectArray[3] = "1\u001dg\u0005b\u001d:\u0012vJ\u000f\u001d:\u000fb";
        objectArray[4] = "u%SM@~~*B\u0002=fm-KK";
        objectArray[5] = "1P8,A\u000f:_)c \u00011T-9";
        objectArray[6] = "1jH/'70,\u001d}D+lj`x!(\u000b+\u001d {us(@!$E1jH/'70,\u001d}D";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "% )vH88-\u007f\u0010|03`a(PC#\u0011-Z\u0013F%\"lv\u001fb)\u001a^VK{\f\u0010*jex>5Tw|Az5)s\u001dk\u001fk*-fz-,PTN>)=rIpa\"\u000fR!E@)\u0017,b[1)\u001bkBaG.\u001asAi]\u0010iwteS?\u001cbj\u001acy\u0002\u0010)\u001c{>jl~_< P)rM>~)woM|B";
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e6' || c == '\u00d1' || c == '\u00c3' || c == 'W') {
                field = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
        if (c[n3] != null) {
            return n3;
        }
        Object object = b[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 43;
            case 1 -> 19;
            case 2 -> 50;
            case 3 -> 30;
            case 4 -> 57;
            case 5 -> 47;
            case 6 -> 5;
            case 7 -> 15;
            case 8 -> 20;
            case 9 -> 42;
            case 10 -> 3;
            case 11 -> 39;
            case 12 -> 17;
            case 13 -> 9;
            case 14 -> 33;
            case 15 -> 1;
            case 16 -> 31;
            case 17 -> 51;
            case 18 -> 49;
            case 19 -> 28;
            case 20 -> 27;
            case 21 -> 25;
            case 22 -> 59;
            case 23 -> 14;
            case 24 -> 58;
            case 25 -> 56;
            case 26 -> 12;
            case 27 -> 46;
            case 28 -> 0;
            case 29 -> 62;
            case 30 -> 44;
            case 31 -> 4;
            case 32 -> 37;
            case 33 -> 41;
            case 34 -> 24;
            case 35 -> 63;
            case 36 -> 60;
            case 37 -> 11;
            case 38 -> 45;
            case 39 -> 38;
            case 40 -> 26;
            case 41 -> 16;
            case 42 -> 2;
            case 43 -> 40;
            case 44 -> 18;
            case 45 -> 54;
            case 46 -> 36;
            case 47 -> 61;
            case 48 -> 55;
            case 49 -> 53;
            case 50 -> 52;
            case 51 -> 21;
            case 52 -> 6;
            case 53 -> 48;
            case 54 -> 29;
            case 55 -> 22;
            case 56 -> 34;
            case 57 -> 35;
            case 58 -> 13;
            case 59 -> 32;
            case 60 -> 10;
            case 61 -> 7;
            case 62 -> 23;
            default -> 8;
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
        m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.c[n3] = new String(cArray);
        return n3;
    }

    public static String m$$HBo4EmP2ab42gSeaCKmVBDWFFUR0h5BcEj8zvZPvN2o5PkgitwrS9OvmWpfAiQN5iQFY2dDahJTGqHNdBa89tXmUP5jG0eNUX(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{62, -37, -124, -103, 32, -116, 119, 85, 38, 6, 81, -58, -27, 49, -62, 94, 87, 98, -65, 15, 55};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 21]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    public static m$$qcNVZwOl6hTO8ZDLdynSC3aYPC0Tytjx2An8dbajr1bsIp0Yug4yIM7yXRhwAqpnNEdAueNjcZnfHJGbDksR3nmc6144djOz7 m$$FnM901iotyJ8np5OZHJVIeWgerQzTx4cen7MoBqv14rnLzOxeKKKjyIxTwvqoQogEuOoO6EDnpVS8XdJljF3dEl073OXGxQuk(int n) {
        return m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju(n);
    }

    public static m$$qcNVZwOl6hTO8ZDLdynSC3aYPC0Tytjx2An8dbajr1bsIp0Yug4yIM7yXRhwAqpnNEdAueNjcZnfHJGbDksR3nmc6144djOz7 m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju(int n) {
        return new m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

