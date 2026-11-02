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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4 {
    public static final float m$$ujXzdiEpq2EvzHWxiE4lraWreOE0xafbupuutWo7RJLutbftOxvBHaj3DZpnIIlppeyyX1q6v5wzAUQDH1pQ5mKKo1qmouiRt;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a = new Object[8];
                    m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b = new String[8];
                    m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a();
                    var5 = 66939765041384636L;
                    var4_1 = new long[6];
                    var8_2 = 0;
                    var9_3 = "\u00e7\u00b7e3\u0090\u00e04\u00e8\u0019\u0080xh\u0090\u00e04\u00e8$\u00a4F\u00ea\u0094\u00a3\u00cc\u00a3uP\u00fb\u0002\u0094\u00a3\u00cc\u00a3";
                    var10_4 = "\u00e7\u00b7e3\u0090\u00e04\u00e8\u0019\u0080xh\u0090\u00e04\u00e8$\u00a4F\u00ea\u0094\u00a3\u00cc\u00a3uP\u00fb\u0002\u0094\u00a3\u00cc\u00a3".length();
                    var7_5 = 0;
                    while (true) {
                        var11_6 = var9_3.substring(var7_5, var7_5 += 8).getBytes("ISO-8859-1");
                        v0 = var4_1;
                        v1 = var8_2++;
                        v2 = ((long)var11_6[0] & 255L) << 56 | ((long)var11_6[1] & 255L) << 48 | ((long)var11_6[2] & 255L) << 40 | ((long)var11_6[3] & 255L) << 32 | ((long)var11_6[4] & 255L) << 24 | ((long)var11_6[5] & 255L) << 16 | ((long)var11_6[6] & 255L) << 8 | (long)var11_6[7] & 255L;
                        v3 = -1;
                        break block8;
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var7_5 < var10_4) ** continue;
                        var9_3 = "\u0091{\f\u00c9\u0094\u00a3\u00cc\u009c\u00c0\u009c\u00e5\u0083kT4\u001d";
                        var10_4 = "\u0091{\f\u00c9\u0094\u00a3\u00cc\u009c\u00c0\u009c\u00e5\u0083kT4\u001d".length();
                        var7_5 = 0;
                        while (true) {
                            var11_6 = var9_3.substring(var7_5, var7_5 += 8).getBytes("ISO-8859-1");
                            v0 = var4_1;
                            v1 = var8_2++;
                            v2 = ((long)var11_6[0] & 255L) << 56 | ((long)var11_6[1] & 255L) << 48 | ((long)var11_6[2] & 255L) << 40 | ((long)var11_6[3] & 255L) << 32 | ((long)var11_6[4] & 255L) << 24 | ((long)var11_6[5] & 255L) << 16 | ((long)var11_6[6] & 255L) << 8 | (long)var11_6[7] & 255L;
                            v3 = 0;
                            break block8;
                            break;
                        }
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var7_5 < var10_4) ** continue;
                        break block9;
                        break;
                    }
                }
                v4 = v2 ^ var5;
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl41:
                    // 1 sources

                    ** continue;
                }
            }
            m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)var4_1[5];
            break block10;
lbl46:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_7 = 8470526500215121883L;
        ** while (true)
        var0_8 = 8468399280020867332L ^ var2_7;
        m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a("\u00d6", (long)var0_8, (long)524878557780992L);
        m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.m$$ujXzdiEpq2EvzHWxiE4lraWreOE0xafbupuutWo7RJLutbftOxvBHaj3DZpnIIlppeyyX1q6v5wzAUQDH1pQ5mKKo1qmouiRt = (float)m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a("\u00d6", (int)(((int)var4_1[1] ^ m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) >>> (m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & (int)var4_1[2]) | ((int)var4_1[0] ^ m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) << (int)var4_1[4] - (m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & (int)var4_1[3])), (long)481969406510578L);
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
            case 0 -> 34;
            case 1 -> 56;
            case 2 -> 16;
            case 3 -> 19;
            case 4 -> 35;
            case 5 -> 50;
            case 6 -> 40;
            case 7 -> 22;
            case 8 -> 38;
            case 9 -> 29;
            case 10 -> 44;
            case 11 -> 23;
            case 12 -> 48;
            case 13 -> 28;
            case 14 -> 21;
            case 15 -> 49;
            case 16 -> 42;
            case 17 -> 0;
            case 18 -> 25;
            case 19 -> 32;
            case 20 -> 54;
            case 21 -> 5;
            case 22 -> 55;
            case 23 -> 3;
            case 24 -> 12;
            case 25 -> 4;
            case 26 -> 2;
            case 27 -> 33;
            case 28 -> 46;
            case 29 -> 58;
            case 30 -> 45;
            case 31 -> 13;
            case 32 -> 24;
            case 33 -> 47;
            case 34 -> 51;
            case 35 -> 60;
            case 36 -> 7;
            case 37 -> 9;
            case 38 -> 41;
            case 39 -> 1;
            case 40 -> 43;
            case 41 -> 15;
            case 42 -> 6;
            case 43 -> 10;
            case 44 -> 14;
            case 45 -> 27;
            case 46 -> 11;
            case 47 -> 30;
            case 48 -> 61;
            case 49 -> 53;
            case 50 -> 20;
            case 51 -> 37;
            case 52 -> 59;
            case 53 -> 26;
            case 54 -> 17;
            case 55 -> 8;
            case 56 -> 52;
            case 57 -> 57;
            case 58 -> 31;
            case 59 -> 39;
            case 60 -> 36;
            case 61 -> 62;
            case 62 -> 18;
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
        m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "\"?H2\u0007Z)0Y}oZ'?J";
        objectArray[1] = Integer.TYPE;
        m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b[1] = "java/lang/Integer";
        objectArray[2] = Float.TYPE;
        m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b[2] = "java/lang/Float";
        objectArray[3] = "\u001d\u001a\u001f%|/\u0013\u0013X-{4^\u0012\u0015lt\u0011%\r_\u0000r\u0011D/\u0004%@.\u0018\u0017h/b25\rt\u0012\\68Fu\u0004|\u0017@-C\u001d|s\u00064\u00072s\u0016C5azW%D,\u0001\u0012]\u0006\u001f(\u0002\r~\f%6U/T\u0001\"\nA~B(\u00191@;G\u000f\u0011MS<x\u0014\u0015GI9!1\u0018K@\u0000x";
        objectArray[4] = Long.TYPE;
        m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b[4] = "java/lang/Long";
        objectArray[5] = "\r_M\u0001C:\u0006P\\N\"4\r[X\u0014";
        objectArray[6] = "VA+\u0011A<E\u0019=\u007f\u00199D:6\u0003\u0003\u0003_>3\u0018\u0011#8Il\u0005\u00000EKkCH_\u0001\u001c(BE`S\u001bi\u0006x";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "\u0011\u001c\u0013\\I\u001cJD\u0012[8.\u001a\rO\u0013\u0000\u0002i\u001d>_rAl\u001b\r\u001e^MH\u00175,~\u0019Q2?XB7R\u0000\u001a&_.kD\u001a[[OA!DX\u00054P\u0013\u0003\"|\u001c\u0014\u0017\u0012\u0000a\"K\u001c  \t\u0017j\u00178^J\t\u001b\u00174\u0019j3m\u00105\u0001i;w.F\u0005\\7y\u00013\u0010BHIG-b\u0003@\u0017AGR\bLH@\u007f[\u0003\nS\u0013\u0002Y\u0004L\u001b|";
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a(clazz3, string2, clazz2)) != null) {
                    m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b(377562926250331L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Method d(long l) {
        int n = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a(l);
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
                clazz3 = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b(377562926250331L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.b(377562926250331L);
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
            if (c == '\u00cc' || c == '\u00a5' || c == '\u00ba' || c == 'z') {
                field = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'k' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static String m$$zZ0IZ9Cj9w9Me2hDYSniyLobOGg1KdYGFFMUAQPc71j0M8s9SSW6klgwyIof3yBNkddqXUhZ3qAkEC9WIy274wZdeM82wz5xS(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-50, 52, 39, -19, -83, 92, -36, 27, 107, -101, 26, 64, -56, 93, 86, 20, -111, -118, -98, -91, -70};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 21]);
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
            return MethodHandles.lookup().findStatic(m$$mNuIHpUTaA5OU08Bqbd1vn4dbKIUkYIsBwOgz7hhzcUW5IRDPB1VODoYDSLGzCwcMoV3AlGQMhFYqPw3zgmZloX7xR6FaKcr4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

