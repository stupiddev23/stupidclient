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
import me.mioclient.m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A;
import me.mioclient.m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC;
import me.mioclient.m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW;
import me.mioclient.m$$jtFauoe6ytwsCqMVj75BsceyoIr6knC9uLcnURw4RD2c3ScSs0IdXOtbz2FAHRyXYTq2dlMXTRIYKLiwpnofwgNwlSUkmlB70;
import me.mioclient.m$$z8hsGnJbHjJDalkFN1U8lu82AOL6H3Yp5PIwbba2tkRgzG3CiCdsoUiFEOorh58vtOApnDX7k3GNK7UISdkWoawKqXjgkks6C;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    public final m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A m$$L4QZ8rKpxYjeFwupanEO6XVe5MEtPYpboWPOkVPfoKqeSsaFpu6hfK6IVYRQUGtUFd2PVLlNgDPDSYTrSpuj9U27QZkaa8SMU;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] g;
    public static final String[] h;

    public m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh(m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A) {
        this.m$$L4QZ8rKpxYjeFwupanEO6XVe5MEtPYpboWPOkVPfoKqeSsaFpu6hfK6IVYRQUGtUFd2PVLlNgDPDSYTrSpuj9U27QZkaa8SMU = m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new Object[5];
        h = new String[5];
        m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.a();
        long l = 223146749077151332L;
        long l2 = 0x45C2485C3782957FL ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 1794082215602905625L;
        long l4 = 0x504D1AAF60F0EB99L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.a("e", (long)l4, (long)314428175528899L);
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.a(l);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.a(l);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.a(clazz3, string2, clazz2)) != null) {
                    m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.b(266869098913494L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.a(l);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.b(266869098913494L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.b(266869098913494L);
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
            throw new RuntimeException("me/mioclient/m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'k' || c == 'j' || c == '\u00c3' || c == '\u00f3') {
                field = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'k' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'e' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = g;
        g[0] = "Pf\u0006B9D^oAJ>_\u0013n\f\u000b1zhqFg7z\tS\u001dB\u0005EUkqH'Yxqmu\u0019]u:lc9|\rQZz9\u0018KH\u001eU6}\u000eIx\u001d\u0012N\tP\u0018u\u0018mRT\u001bj;ghJLH\u0011jovX\u0019\u0007CTMY\\\u0002d\\1J[=\u007fX;P^dZU7Yg=";
        objectArray[1] = Long.TYPE;
        m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.h[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.h[2] = "java/lang/Integer";
        objectArray[3] = "\"\u0007\u00161\u0001$)\b\u0007~`*\"\u0003\u0003$";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u007f\u0015\u001dV'nw\n\u001a9\u0014'c[\u0001\u00018Ts*Ms{Qu\u0019\f_wuy!>\u007f#l\\+JC\ron\u000e4^\u0014V*\u000eIZu|OPJ\u0004\u000em}\u00170}&)y\u0006\u0012`\u0018vr42\b-Wy,LK3&y \u000bk\tP~!\u0013h\u0001J@R\u0017]\rDo'\u0002Crt)9p\u0000 th[\u000b_:xjkI@ -m\u0017\u0016\\7.\u0012";
    }

    public static int a(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (h[n3] != null) {
            return n3;
        }
        Object object = g[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 2;
            case 1 -> 7;
            case 2 -> 47;
            case 3 -> 30;
            case 4 -> 26;
            case 5 -> 21;
            case 6 -> 60;
            case 7 -> 37;
            case 8 -> 58;
            case 9 -> 8;
            case 10 -> 57;
            case 11 -> 1;
            case 12 -> 56;
            case 13 -> 3;
            case 14 -> 13;
            case 15 -> 11;
            case 16 -> 10;
            case 17 -> 32;
            case 18 -> 44;
            case 19 -> 9;
            case 20 -> 54;
            case 21 -> 62;
            case 22 -> 40;
            case 23 -> 6;
            case 24 -> 24;
            case 25 -> 45;
            case 26 -> 42;
            case 27 -> 28;
            case 28 -> 46;
            case 29 -> 22;
            case 30 -> 39;
            case 31 -> 35;
            case 32 -> 61;
            case 33 -> 52;
            case 34 -> 15;
            case 35 -> 55;
            case 36 -> 20;
            case 37 -> 49;
            case 38 -> 27;
            case 39 -> 38;
            case 40 -> 53;
            case 41 -> 59;
            case 42 -> 4;
            case 43 -> 19;
            case 44 -> 48;
            case 45 -> 41;
            case 46 -> 31;
            case 47 -> 18;
            case 48 -> 43;
            case 49 -> 29;
            case 50 -> 50;
            case 51 -> 51;
            case 52 -> 5;
            case 53 -> 0;
            case 54 -> 16;
            case 55 -> 34;
            case 56 -> 36;
            case 57 -> 33;
            case 58 -> 25;
            case 59 -> 63;
            case 60 -> 14;
            case 61 -> 23;
            case 62 -> 17;
            default -> 12;
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
        m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.h[n3] = new String(cArray);
        return n3;
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW) {
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$jtFauoe6ytwsCqMVj75BsceyoIr6knC9uLcnURw4RD2c3ScSs0IdXOtbz2FAHRyXYTq2dlMXTRIYKLiwpnofwgNwlSUkmlB70 m$$jtFauoe6ytwsCqMVj75BsceyoIr6knC9uLcnURw4RD2c3ScSs0IdXOtbz2FAHRyXYTq2dlMXTRIYKLiwpnofwgNwlSUkmlB70) {
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$z8hsGnJbHjJDalkFN1U8lu82AOL6H3Yp5PIwbba2tkRgzG3CiCdsoUiFEOorh58vtOApnDX7k3GNK7UISdkWoawKqXjgkks6C m$$z8hsGnJbHjJDalkFN1U8lu82AOL6H3Yp5PIwbba2tkRgzG3CiCdsoUiFEOorh58vtOApnDX7k3GNK7UISdkWoawKqXjgkks6C) {
    }

    public abstract void m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk var1);

    public void m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ, int n) {
    }

    public void m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC) {
    }

    public void onDisable(int n) {
    }

    public void m$$cFy0S2bS7U2m7bzc3O5IB0USk2GXplPOWMwkPbtlcMqUPwZdqWrImGD45wOTIHxHoiuNbH5qx8JEe1cGK4OtWr7Feso78ZhRo() {
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$tdevtNDp100GK7WJwwAokiLG5azQ8GCwGc2tcxsfvAPfLeCWoihaOArSCyZCPk5jCiWDgSuHYti4J3VZApwOXLWjfM6tpVMNh.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

