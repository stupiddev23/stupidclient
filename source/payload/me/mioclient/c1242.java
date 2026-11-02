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
import me.mioclient.m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP;
import me.mioclient.m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import me.mioclient.m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62;
import net.minecraft.class_124;
import net.minecraft.class_151;
import net.minecraft.class_1747;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF
extends m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM {
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$2RImsjhM9kA0vQYoxXp3mO89eZfDPxN9TzCgGOhe8PTHRFP6hI6yfH6TZCqfwLHw9ayZWSEbUABCVtFFnm0G3khFSgWuxK7tw;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$paDwjnqyyBPPjiYBYBNHoGTELUaWjMMIiALFIMzgk7p8XEXvg34cJCCwjK8NAzZi6x2q6igvmB2sApS3bvE3cxxIBkpIlUtbp;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String[] e;
    public static final String[] f;
    public static final Object[] g;
    public static final String[] h;

    public m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF() {
        super(m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.c(-20239, -11606), new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)String.valueOf(class_124.field_1061)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.c(-20240, -15214)), m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ.m$$mC9dizgP2qnRzt8OpjfIEHi7UR3wfB0aIyaDlWvhi8fpy1j3kA5HSRQIBEOBebgPNgLRvwv6fVWHqImOrWGbM1qAZGqoeObmJ, new String[0]);
        m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00e2", (Object)this, (long)1950700407081647L);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.g = new Object[37];
            m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.h = new String[37];
            m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f();
            var13 = new String[2];
            var11_1 = 0;
            var10_2 = "\u00a2\u00d7Gf\u00b8<\u00c9\u00ef\u0080\u00df\u00b8cBCf\u0012L^\u00fa\u00fa\u00f3\u00c1\u00e3'-\u008dX\u0017\u00c4\t\u009c\u00dd\u00f7 \u00a7A\u0004\u00c8cQ\u0011\u00d18N)709>\u00b6NsR\u00c6\u001e\u0085\u00d6\u00bcWoP\u00fc]F\u009cq\"E\u00ae\u00bad\u00c0O\n\u00ae\u00b7\u00c0acvT\u0002\u0014\u00ba\u0019\u0010\u00f9\u00f0@\\\u0005\n\u00b0\u008c\u00c6\u0007\u0080?\u0096h\u0084\u0003\u00a7\u000e\u00a3\u00d1(`\u00e6\u0080K\u00bb\u00f2\u00e2\u008f\u00fb\u0001\u00b3";
            var12_3 = "\u00a2\u00d7Gf\u00b8<\u00c9\u00ef\u0080\u00df\u00b8cBCf\u0012L^\u00fa\u00fa\u00f3\u00c1\u00e3'-\u008dX\u0017\u00c4\t\u009c\u00dd\u00f7 \u00a7A\u0004\u00c8cQ\u0011\u00d18N)709>\u00b6NsR\u00c6\u001e\u0085\u00d6\u00bcWoP\u00fc]F\u009cq\"E\u00ae\u00bad\u00c0O\n\u00ae\u00b7\u00c0acvT\u0002\u0014\u00ba\u0019\u0010\u00f9\u00f0@\\\u0005\n\u00b0\u008c\u00c6\u0007\u0080?\u0096h\u0084\u0003\u00a7\u000e\u00a3\u00d1(`\u00e6\u0080K\u00bb\u00f2\u00e2\u008f\u00fb\u0001\u00b3".length();
            var9_4 = 103;
            var8_5 = -1;
lbl10:
            // 2 sources

            while (true) {
                v0 = ++var8_5;
                v1 = var10_2.substring(v0, v0 + var9_4).toCharArray();
                v2 = v1.length;
                var14_6 = 0;
                v3 = 50;
                v4 = v1;
                v5 = v2;
                if (v2 > 1) ** GOTO lbl66
                break block12;
                break;
            }
lbl24:
            // 1 sources

            while (true) {
                var9_4 = var10_2.charAt(var8_5);
                ** continue;
                break;
            }
        }
        do {
            v6 = v3;
            v4 = v4;
            v7 = v4;
            v8 = v3;
            v9 = var14_6;
            while (true) {
                switch (var14_6 % 7) {
                    case 0: {
                        v10 = 68;
                        break;
                    }
                    case 1: {
                        v10 = 79;
                        break;
                    }
                    case 2: {
                        v10 = 96;
                        break;
                    }
                    case 3: {
                        v10 = 41;
                        break;
                    }
                    case 4: {
                        v10 = 93;
                        break;
                    }
                    case 5: {
                        v10 = 72;
                        break;
                    }
                    default: {
                        v10 = 111;
                    }
                }
                v7[v9] = (char)(v7[v9] ^ (v8 ^ v10));
                ++var14_6;
                v3 = v6;
                if (v6 != 0) break;
                v6 = v3;
                v4 = v4;
                v9 = v3;
                v7 = v4;
                v8 = v3;
            }
lbl66:
            // 2 sources

            v11 = v4;
            v5 = v5;
        } while (v5 > var14_6);
        var13[var11_1++] = new String(v11).intern();
        ** while ((var8_5 += var9_4) < var12_3)
lbl74:
        // 1 sources

        m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.e = var13;
        m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f = new String[2];
        var6_7 = 7354419002487022861L;
        var4_8 = 6336276586695656810L ^ var6_7;
        m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)var4_8;
        var2_9 = 6388266466444976002L;
        var0_10 = 3848757954412122918L ^ var2_9;
        m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00e2", (long)var0_10, (long)2210224368235738L);
    }

    public static Method x(long l) {
        int n = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.u(l);
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
                clazz3 = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.v(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.v(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.v(100512658582750L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.v(100512658582750L);
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

    public static String c(int n, int n2) {
        int n3 = (n ^ 0xFFFFB0F0) & 0xFFFF;
        if (f[n3] == null) {
            int n4;
            char[] cArray = e[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 173;
                case 1 -> 46;
                case 2 -> 62;
                case 3 -> 20;
                case 4 -> 130;
                case 5 -> 239;
                case 6 -> 236;
                case 7 -> 96;
                case 8 -> 34;
                case 9 -> 203;
                case 10 -> 143;
                case 11 -> 175;
                case 12 -> 51;
                case 13 -> 149;
                case 14 -> 169;
                case 15 -> 190;
                case 16 -> 131;
                case 17 -> 233;
                case 18 -> 159;
                case 19 -> 201;
                case 20 -> 43;
                case 21 -> 63;
                case 22 -> 221;
                case 23 -> 247;
                case 24 -> 123;
                case 25 -> 90;
                case 26 -> 195;
                case 27 -> 197;
                case 28 -> 24;
                case 29 -> 133;
                case 30 -> 66;
                case 31 -> 155;
                case 32 -> 97;
                case 33 -> 214;
                case 34 -> 95;
                case 35 -> 5;
                case 36 -> 205;
                case 37 -> 39;
                case 38 -> 206;
                case 39 -> 160;
                case 40 -> 64;
                case 41 -> 115;
                case 42 -> 140;
                case 43 -> 21;
                case 44 -> 128;
                case 45 -> 94;
                case 46 -> 211;
                case 47 -> 226;
                case 48 -> 79;
                case 49 -> 122;
                case 50 -> 150;
                case 51 -> 132;
                case 52 -> 44;
                case 53 -> 250;
                case 54 -> 137;
                case 55 -> 9;
                case 56 -> 119;
                case 57 -> 47;
                case 58 -> 215;
                case 59 -> 234;
                case 60 -> 22;
                case 61 -> 117;
                case 62 -> 38;
                case 63 -> 8;
                case 64 -> 218;
                case 65 -> 52;
                case 66 -> 17;
                case 67 -> 70;
                case 68 -> 31;
                case 69 -> 139;
                case 70 -> 237;
                case 71 -> 138;
                case 72 -> 107;
                case 73 -> 42;
                case 74 -> 210;
                case 75 -> 99;
                case 76 -> 227;
                case 77 -> 245;
                case 78 -> 100;
                case 79 -> 126;
                case 80 -> 80;
                case 81 -> 240;
                case 82 -> 102;
                case 83 -> 69;
                case 84 -> 141;
                case 85 -> 41;
                case 86 -> 142;
                case 87 -> 19;
                case 88 -> 242;
                case 89 -> 61;
                case 90 -> 147;
                case 91 -> 220;
                case 92 -> 244;
                case 93 -> 74;
                case 94 -> 75;
                case 95 -> 28;
                case 96 -> 91;
                case 97 -> 87;
                case 98 -> 193;
                case 99 -> 106;
                case 100 -> 178;
                case 101 -> 170;
                case 102 -> 223;
                case 103 -> 6;
                case 104 -> 191;
                case 105 -> 30;
                case 106 -> 101;
                case 107 -> 108;
                case 108 -> 78;
                case 109 -> 59;
                case 110 -> 230;
                case 111 -> 3;
                case 112 -> 144;
                case 113 -> 229;
                case 114 -> 225;
                case 115 -> 204;
                case 116 -> 192;
                case 117 -> 120;
                case 118 -> 162;
                case 119 -> 181;
                case 120 -> 148;
                case 121 -> 185;
                case 122 -> 72;
                case 123 -> 13;
                case 124 -> 238;
                case 125 -> 27;
                case 126 -> 168;
                case 127 -> 228;
                case 128 -> 176;
                case 129 -> 200;
                case 130 -> 36;
                case 131 -> 33;
                case 132 -> 110;
                case 133 -> 104;
                case 134 -> 98;
                case 135 -> 194;
                case 136 -> 161;
                case 137 -> 56;
                case 138 -> 121;
                case 139 -> 251;
                case 140 -> 146;
                case 141 -> 127;
                case 142 -> 209;
                case 143 -> 167;
                case 144 -> 248;
                case 145 -> 50;
                case 146 -> 103;
                case 147 -> 136;
                case 148 -> 166;
                case 149 -> 208;
                case 150 -> 171;
                case 151 -> 184;
                case 152 -> 231;
                case 153 -> 246;
                case 154 -> 172;
                case 155 -> 109;
                case 156 -> 53;
                case 157 -> 252;
                case 158 -> 207;
                case 159 -> 92;
                case 160 -> 89;
                case 161 -> 164;
                case 162 -> 129;
                case 163 -> 255;
                case 164 -> 82;
                case 165 -> 49;
                case 166 -> 113;
                case 167 -> 68;
                case 168 -> 26;
                case 169 -> 58;
                case 170 -> 65;
                case 171 -> 153;
                case 172 -> 241;
                case 173 -> 40;
                case 174 -> 4;
                case 175 -> 177;
                case 176 -> 71;
                case 177 -> 224;
                case 178 -> 114;
                case 179 -> 253;
                case 180 -> 222;
                case 181 -> 76;
                case 182 -> 217;
                case 183 -> 183;
                case 184 -> 111;
                case 185 -> 188;
                case 186 -> 77;
                case 187 -> 118;
                case 188 -> 154;
                case 189 -> 60;
                case 190 -> 54;
                case 191 -> 105;
                case 192 -> 1;
                case 193 -> 2;
                case 194 -> 145;
                case 195 -> 18;
                case 196 -> 84;
                case 197 -> 198;
                case 198 -> 0;
                case 199 -> 235;
                case 200 -> 163;
                case 201 -> 165;
                case 202 -> 187;
                case 203 -> 10;
                case 204 -> 29;
                case 205 -> 219;
                case 206 -> 196;
                case 207 -> 254;
                case 208 -> 174;
                case 209 -> 67;
                case 210 -> 57;
                case 211 -> 7;
                case 212 -> 249;
                case 213 -> 15;
                case 214 -> 88;
                case 215 -> 25;
                case 216 -> 86;
                case 217 -> 112;
                case 218 -> 186;
                case 219 -> 125;
                case 220 -> 156;
                case 221 -> 16;
                case 222 -> 73;
                case 223 -> 179;
                case 224 -> 180;
                case 225 -> 213;
                case 226 -> 151;
                case 227 -> 232;
                case 228 -> 135;
                case 229 -> 12;
                case 230 -> 116;
                case 231 -> 81;
                case 232 -> 23;
                case 233 -> 45;
                case 234 -> 189;
                case 235 -> 199;
                case 236 -> 134;
                case 237 -> 85;
                case 238 -> 216;
                case 239 -> 212;
                case 240 -> 14;
                case 241 -> 11;
                case 242 -> 55;
                case 243 -> 124;
                case 244 -> 158;
                case 245 -> 93;
                case 246 -> 157;
                case 247 -> 202;
                case 248 -> 32;
                case 249 -> 35;
                case 250 -> 83;
                case 251 -> 37;
                case 252 -> 243;
                case 253 -> 48;
                case 254 -> 152;
                default -> 182;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n7 = 0;
            while (n7 < cArray.length) {
                int n8 = n7 % 2;
                int n9 = n7;
                char[] cArray2 = cArray;
                char c = cArray[n9];
                if (n8 == 0) {
                    cArray2[n9] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                } else {
                    cArray2[n9] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                }
                ++n7;
            }
            m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f[n3] = new String(cArray).intern();
        }
        return f[n3];
    }

    public static void f() {
        Object[] objectArray = g;
        g[0] = "\u0010@Q=\u0015/\u001eI\u00165\u00124SH[t\u001d\u0011(W\u0011\u0018\u001b\u0011IuJ=).\u0015M&7\u000b28W:\n565\u001c;\u001c\u0015\u0017Mw\r\u0005\u0015s\u000bnI*\u001a\u0016No/b>%IvO\n4\u0006\u0012rL\u0015\u0017\f(l\u001b7=\u0001/P\u000ff+(\u0014k\u000e#.\u000f\u001c\u0017\u001d$\u0011\u0014\u0018\u001d\u0007!H1\u0015\u0011\u000e\u0018\u0011";
        objectArray[1] = ">l'En)5c6\n\u000f'>h2P";
        objectArray[2] = Void.TYPE;
        m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.h[2] = "java/lang/Void";
        objectArray[3] = ")\u0000\u0018\t6\u000e)\u0000\u000fU:\u00013K\u000fK:\u00144:_\u001emR";
        objectArray[4] = "}\u00010s\fH}\u0001'/\u0000GgJ'1\u0000R`;vnT\u0011";
        objectArray[5] = "/YIq\u0018\u0003!P\u000ey\u001f\u0018lQC8$';Z\b_!\r&M5O<#*s\rlD9;Y#}+\u0007\u0011l0~\u0012[\u0001\b\u0017d\u00179%R-N\u0012\u001d\u0007V )!\b\rX0\u007f\u0017$\u000fIVX\u0014\u001e1\u007f\u0015h+'{k4W\u001b\u001b2K?_\u0018$\u0010p\u0005t%\tr\n0n3)\u0005\b\u0004o\u0015";
        objectArray[6] = "\u0010?\u007fRp8\u0010?h\u000e|7\nth\u0010|\"\r\u00059O.i";
        objectArray[7] = "\u0019\u001fc\u0018J\u0004\u0019\u001ftDF\u000b\u0003TtZF\u001e\u0004%%\u0004\u0013U";
        objectArray[8] = Boolean.TYPE;
        m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.h[8] = "java/lang/Boolean";
        objectArray[9] = "^/>\u0010\u000e\tP&y\u0018\t\u0012\u001d'4Y4\u000fB2t\nQVW$h5\u001f)wre\b\u0010?Z\u0012(-1-\u000bsJ\u0005\u0016P\u0003|i\u0012\b\u0015\u0001\u001e\"\u0015\nT\\rD\u0015&\u0005{>&.\u00107Q)EKT\u000f[x@\tT0tsR*\u000b^u\u000bG6^PPyZE\u0017\u0000]\u0007G,\u00101\u0002=j<\u0005";
        objectArray[10] = "cI\f\u0015\u001cbcI\u001bI\u0010my\u0002\u001bW\u0010x~sI\tG3";
        objectArray[11] = "QD\u0001-o\u0019QD\u0016qc\u0016K\u000f\u0016oc\u0003L~D4;I";
        objectArray[12] = "}\u0002P\b\tR}\u0002GT\u0005]gIGJ\u0005H`8\u0015\u0011]\t";
        objectArray[13] = "t R<BUz)\u00154EN7(XuFvP1*8\u001fvz\u001f+\u0017\u001ew@\u000bH;\u001d[\\2?al\rQ\u000e\u000b\u0005~L{/\u001ehcvx$H)]PM\bE'|mO#?geI|\r\f0b_\\\u00010\u0007\u001bN \u0012&\u0002[\u0002@\u0007-#f\t!72\u001ejlm34\u0015\u0019s[0\u0015\u0015s";
        objectArray[14] = "iP\u0018\u0000h|iP\u000f\\dss\u001b\u000fBdftj[\u001a3";
        objectArray[15] = "\u007f?J%\u000bvq6\r-\fm<7@l3OBj\u0003;\t+&*\u001c--zH,\n$\u0018L~\u001eW\u00041^P2(-V_\"\u0015<?.m]0\u001e;:`Kj\\.\n~z\u001eWyS,d;W\u000f\nZ{\b,'\f!\".\f90a\"5\u0013?RVcm\u0010\u0010\u0003Zk<&&\u0004]@\u0002T\u000e3";
        objectArray[16] = "\u0001@ls7(\u000fI+{03BHf:3 \u0006\u0012.Q\u0019-\u000eK\u0012u9\u0002!D _;+$Q\u0013V6+\"v\tsj5.\u0012'n\u000e(\u000bO\u0004x3/\u000fa\u0011ok\u0003\u0003MtH\r~Ta,Mf-\u001bq7)8vU\u0014\u0006q\u0017s\u0019\u00130z64\u001f]3f\n!\u0019g\fo\u0006>%F+Xk";
        objectArray[17] = "sx1u\f\u0002sx&)\u0000\ri3&7\u0000\u0018nBtlU\\";
        objectArray[18] = "\u0001Q\u000eR\u0014A\n^\u001f\u001dxB\u0004\\\u001dRT";
        objectArray[19] = Long.TYPE;
        m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.h[19] = "java/lang/Long";
        objectArray[20] = Integer.TYPE;
        m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.h[20] = "java/lang/Integer";
        objectArray[21] = "K4*i\u001e@\u0014</6xO\u001c2/i\u0014}Hqp>@*J 05DH\u0014~u4x";
        objectArray[22] = "Vg3^+%\u0004s1\u0018\u001a%A1\u007fXk/ M6\u007fk\u000f\u0011&SAc\u001fV-kE\u007f?]AFZs9TW`D]1)T6G$\u0010$wsu['\u0000V6c \u0010]bP\u0015~,\u0003Lv\u001dx~\u000fbb\u001fF\"\u0017t6aJ-RbPw^\r t\u007f\\a~\u000bV5u*\u001f\\S=%&&\\`hK&?Sm\r\u0018{.\u000eww\u0014}q\b\u001d3\u0018y!\u001cdk_ 9m#0F{1\u0014{w\u001fc@";
        objectArray[23] = "aYK\u000fm7%RR\r\u000b\"s\u001bG\u001fz(\u0012g\u000e8z\b#\fk\u0006r\u0018d\u0007S\u0002n8ok~\u001db>f}X\u0003L6\u001b~\u000e\u00005\u0017\u0016]K2J 2|\u000e$1\u0017oHhRo+1fNZiy=HZXW%%^\u000e&[*`Hh0O\n\u0012^G\u001bpy9|\r2;\u0018ny\u0005b4)oS_Zf!/I5Xq\"8Q_\u0007y'g7\f\u001aw('EM\u000e4|_";
        objectArray[24] = "vzy7}Qvcv:\u0018Z'`(-ths$p{#?qr7q$]/,rp\u0018\u0003,-5/v\u00035\"8J";
        objectArray[25] = "=\u0002jk#\u0006|_2lZ]`N0r6o2\u0003h$Z\bj[mo0\u00052S6\u0015";
        objectArray[26] = "R0imI:^*g7rcOz\u007f\u001a07R\u0019]\u001fO`.nX =L/)x7CX\t\u001dd\u0012\"I2\u0012@\u0017\u001cT/gp6)~)*gkBc\u0007\u000e~\u000eKB\u001e\u0004V?\fLX,q05|'o+l*w]\u000f#8\u001b=&)B\u00003e\u0005=p=Nc%ma;9W[\nqQK~\u001f9c#\nj\\m\u001b";
        objectArray[27] = "Erk\u0014\u0007?N:6%+u\u0011)N_7\u007fp)=T\u001atp2CI\u0011IG\u001b1\u0019?lP1ck$ka\u0011by?bp<tbKXL?=[AxG-jA%yZ;wk\u001dJl&l\u001aE>v\u0018E]\u0011UR(]\u00146Av\u001c~dGxW9NZ&xh\u001eG\u001b\tY\u0013'\fW\u001e`T'vIJl*ztY\u0014}X;`\u001a@\u0005";
        objectArray[28] = "x\u000f_\u007f729O\\\u007fE'$\u0003\\\u007f)\u0015tN\r(E}'OXr}//\u000fB\u0018urs\u0001E&4/+\u0006<";
        objectArray[29] = "S\u001cf\u0016y+P\u0013vR\u00165\u0016BI4jj\u0005_?\u000f(.}<U\tS\t\u007f5P3l2\u000b\u0001V\u0015jh{\u000fMPM>D)b\u0003q\u0017U\u0004H\\gjX\u0011rWV\u001cq\rs\tu;Q t=u\u0002p+3Ti\u000fw\u001eJ\\M\u001bh\u0004C&J\r{+6.-\u0014g'S+z\bx'5m,*_\ti\u0007s\"ZV\u000f";
        objectArray[30] = "EK\\F^A^\u0003\u001eF3\u001eB\u0006zOW\fBzVCV\u000fK\u0000H\u0017Zq";
        objectArray[31] = "]MHj*}V\u0005\u0015[\bvCL^c$\u0005S=\u0012\u0011g\u0000U\u000eS=k$Y6a\u001d?=|<\u0015!\u0011>N\u0019k<\b\u0007\n\u0019\u00168i-oG\u0015f\u0012<]\u0000o\u001f:xY\u0011M\u0002\u0004'R#mj1\u0006Y;\u0013)/wY7T\t\u0015\u0001^6L\n\u001d\u001b`EH?\u0011\u0015O0]!n%\t./7:}[\u0013\u0014'(?C|C*j&H\u0017D><:2";
        objectArray[32] = "q\u0006\u0010\u0005Vs0F\u0013\u0005$f-\n\u0013\u0005HT~OK^$<.F\u0017\b\u001cn&\u0006\rb\u001d{<\u0019\u000b\u0010\\o\u007fMs";
        objectArray[33] = "&%\u0014\u0010A\u0000w)\u0012\u001cq\u0003 i\u0011\u0015\u001d1r*HKq[,{\u0012\u0018\u000bW*$\u0014r";
        objectArray[34] = "Mm\u000eF*\u0014[t\u0012KH\u001cAv\u001bG!\u0010xx\u001bW%v\u0018,\u001cK9\u000f@kESH";
        objectArray[35] = ".\u0002\u0006\"\u0000\u0005q\n\u0003}f\ny\u0004\u0003\"\n8-G\\zYo(\u001eR8\u0003\u0001(\u0007]5f";
        Object[] objectArray2 = objectArray;
        objectArray[36] = "\u00050(?t4\u0006?8{\u001b*@n1t{u\u0003>1>&35\u0018%>t*\"s$uW\u0010 \u0001\b~#q\u0014$\f)@\u00106,q\u000bFt%>\u001f{|\u0011%x\r\u001ap+\u0016s9(Y\n7\b\u000f5`1\u0006>\bty&<3\u000e\tP\u0005,'x\u0001|pW\u0004q K\u000bWr\u0013\u0004g~'2\u0006D$!\\&+|v)\u001c<A";
    }

    public static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ea' || c == '\u00d8' || c == '\u00fe' || c == 'B') {
                field = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.w(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ea' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.x(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00eb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Field l(Class clazz, String string, Class clazz2) {
        Field field = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Method k(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static Class v(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.u(l);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field w(long l) {
        int n = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.u(l);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.v(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.v(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.k(clazz3, string2, clazz2)) != null) {
                    m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.v(100512658582750L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static int u(long l) {
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
            case 0 -> 62;
            case 1 -> 59;
            case 2 -> 8;
            case 3 -> 19;
            case 4 -> 50;
            case 5 -> 3;
            case 6 -> 53;
            case 7 -> 51;
            case 8 -> 20;
            case 9 -> 26;
            case 10 -> 58;
            case 11 -> 6;
            case 12 -> 4;
            case 13 -> 21;
            case 14 -> 10;
            case 15 -> 41;
            case 16 -> 36;
            case 17 -> 28;
            case 18 -> 47;
            case 19 -> 30;
            case 20 -> 42;
            case 21 -> 22;
            case 22 -> 25;
            case 23 -> 12;
            case 24 -> 56;
            case 25 -> 49;
            case 26 -> 52;
            case 27 -> 16;
            case 28 -> 31;
            case 29 -> 24;
            case 30 -> 63;
            case 31 -> 1;
            case 32 -> 23;
            case 33 -> 57;
            case 34 -> 38;
            case 35 -> 60;
            case 36 -> 35;
            case 37 -> 39;
            case 38 -> 27;
            case 39 -> 18;
            case 40 -> 61;
            case 41 -> 5;
            case 42 -> 48;
            case 43 -> 40;
            case 44 -> 7;
            case 45 -> 32;
            case 46 -> 55;
            case 47 -> 44;
            case 48 -> 46;
            case 49 -> 43;
            case 50 -> 37;
            case 51 -> 15;
            case 52 -> 33;
            case 53 -> 13;
            case 54 -> 11;
            case 55 -> 29;
            case 56 -> 0;
            case 57 -> 9;
            case 58 -> 17;
            case 59 -> 34;
            case 60 -> 14;
            case 61 -> 54;
            case 62 -> 2;
            default -> 45;
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
        m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.h[n3] = new String(cArray);
        return n3;
    }

    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ) {
        block5: {
            CallSite callSite = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ, (long)2585317076143309L);
            CallSite callSite2 = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (Object)callSite, (long)1978997146829829L), (long)1800685191660001L);
            try {
                if (m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)((Boolean)((Object)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)this.m$$2RImsjhM9kA0vQYoxXp3mO89eZfDPxN9TzCgGOhe8PTHRFP6hI6yfH6TZCqfwLHw9ayZWSEbUABCVtFFnm0G3khFSgWuxK7tw, (long)2139721986894612L))), (long)2443888265704486L) == false || !(callSite2 instanceof class_1747)) break block5;
            }
            catch (class_151 class_1512) {
                throw m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.a(class_1512);
            }
            class_1747 class_17472 = (class_1747)callSite2;
            CallSite callSite3 = m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ, (long)2106158962257559L), (long)2465456774368789L);
            try {
                if (m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00e2", (Object)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)callSite3, (Object)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ, (long)2106158962257559L), (long)1478768739387974L), (long)1713217230424506L), (Object)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)class_17472, (long)2383903462415405L), (boolean)false, (long)1610667624310015L) != false) {
                    m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00e2", (Object)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ, (long)2585317076143309L), (Object)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ, (long)2106158962257559L), (long)1684618466416764L);
                    m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (Object)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ, (long)2585317076143309L), (long)2286825637375934L);
                    m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ, (long)1829687564961957L);
                }
            }
            catch (class_151 class_1513) {
                throw m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.a(class_1513);
            }
        }
    }

    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP) {
        try {
            if (m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)((Boolean)((Object)m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)this.m$$paDwjnqyyBPPjiYBYBNHoGTELUaWjMMIiALFIMzgk7p8XEXvg34cJCCwjK8NAzZi6x2q6igvmB2sApS3bvE3cxxIBkpIlUtbp, (long)2139721986894612L))), (long)2443888265704486L) != false) {
                m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.f("\u00eb", (Object)m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP, (long)1829687564961957L);
            }
        }
        catch (class_151 class_1512) {
            throw m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.a(class_1512);
        }
    }

    public static String m$$Y1EWZUCgWjo9aBwmCEmAVbl6X3Znsi5VjuDc5MRCOvUdsIurIT4U3OPVKqvcahhbQ7R4y9iEZ3BuVUYtGWKylAQyZJVAo6ZL9(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{95, 53, -60, 48, -97, 6, 23, 80, 27, -46, -17, 21};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 12]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$qgZB5K1j6blsUuRtdbxdqA2hGPVtOHC7uALHjb3lwKKdMtReYrYBqJt4L75jH7aWxDnSSRucREqdiOrazHMxVk5dSiGrMBHFF.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

