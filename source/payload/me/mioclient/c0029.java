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
import me.mioclient.m$;
import me.mioclient.m$$0Vdcp8iLoj2fBQamH9Lk2iYsw1DemKaOQZ3Cgr5RFRYvAKVfkEprMNxQuoXPD2zYRRoA4mbEkBTWtt4Mpdx6av6o9z68Doyg7$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ;
import me.mioclient.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import net.minecraft.class_1297;
import net.minecraft.class_151;
import net.minecraft.class_1657;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB
extends m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM {
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$hZhW4FJ9zCF50ufHdhLP1ck5y7DgXZ8cs596g0GAE82oTrJrSgR3LbkoUEXbPK2G4psqNSJiUB2jecO4zhFTx3cOsxPyqfdmd;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$GgEFPZl14v42q4NtIVZfXxCNqM6TSESGLhfqgxlAtLoqGzYIIi4K7AMsO2v6QokHF2Ecm3DhZyP0TEnADb2MTSQekrV4p0fQP;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String[] e;
    public static final String[] f;
    public static final long[] g;
    public static final Integer[] h;
    public static final long[] i;
    public static final Long[] j;
    public static final Object[] m;
    public static final String[] n;

    public m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB() {
        super(m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.c(18364, 3545), m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.c(18365, 16660), m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ.m$$I4tGAkMgP4uziHR1AQaFxemvamllvew3nCIgtVCCNjmCdDiGKbF5EaUcEYPWOKswpA7wtKsIwA006FnIr7irVrRsmDr8PuAsI, new String[0]);
        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("\u00d3", (Object)this, (long)2283572935886575L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.m = new Object[44];
                                m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.n = new String[44];
                                m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f();
                                var21 = new String[4];
                                var19_1 = 0;
                                var18_2 = "b8\bZ\r\u001d<z\u00c42\u00fc\u00b9\u0085*\u00da\u009e\u00b0A\u00e0\u0002[\u001d\u00cc\u00df\u0097i\u0082\u00f8!;\u00af\u00c83\u00a1\u0013\u00f8\u008f\u00c7\u0080\u001f\u00af\u0090\u008eH\u0007\u0012\u00f2\u00b91\u00cd\u00d6\u00afm%\u0018O\r\u0017\u0007F\u00fb\u00e4N\u009eS\u00fb";
                                var20_3 = "b8\bZ\r\u001d<z\u00c42\u00fc\u00b9\u0085*\u00da\u009e\u00b0A\u00e0\u0002[\u001d\u00cc\u00df\u0097i\u0082\u00f8!;\u00af\u00c83\u00a1\u0013\u00f8\u008f\u00c7\u0080\u001f\u00af\u0090\u008eH\u0007\u0012\u00f2\u00b91\u00cd\u00d6\u00afm%\u0018O\r\u0017\u0007F\u00fb\u00e4N\u009eS\u00fb".length();
                                var17_4 = 58;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 36;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block28;
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "\u00b1+\u00a8UD\u0014\u00f1\u00f1w\u008b\u00df\u0007\u0002\u0007\u0010\u00fc\u00fd`\u00b1\u0082\u00df\bW\u0092\u00e1\u00ec\u00c4\u00a1-\u00dec2\u000b}\u00d1\u00c2\u00d8%\u00dd\u00f3%N\u00f5w\u00c7\u009d\u00b1\u0006\u0007\u00b6\u00191s:\u0091\u00b8<\u0099nka\u00fe'a\u001c\u00106\u00e8\u0000\u00f4g\u00a5\\\u00d9i";
                                    var20_3 = "\u00b1+\u00a8UD\u0014\u00f1\u00f1w\u008b\u00df\u0007\u0002\u0007\u0010\u00fc\u00fd`\u00b1\u0082\u00df\bW\u0092\u00e1\u00ec\u00c4\u00a1-\u00dec2\u000b}\u00d1\u00c2\u00d8%\u00dd\u00f3%N\u00f5w\u00c7\u009d\u00b1\u0006\u0007\u00b6\u00191s:\u0091\u00b8<\u0099nka\u00fe'a\u001c\u00106\u00e8\u0000\u00f4g\u00a5\\\u00d9i".length();
                                    var17_4 = 37;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 67;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block28;
                                        break;
                                    }
                                    break;
                                }
lbl31:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block29;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl88
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 95;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 1;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 122;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 123;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 85;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 126;
                                            break;
                                        }
                                        default: {
                                            v15 = 92;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
                                    v8 = v11;
                                    if (v11 != 0) break;
                                    v11 = v8;
                                    v9 = v9;
                                    v14 = v8;
                                    v12 = v9;
                                    v13 = v8;
                                }
lbl88:
                                // 2 sources

                                v16 = v9;
                                v10 = v10;
                            } while (v10 > var22_6);
                            v4 = new String(v16);
                            switch (v3) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl98:
                                // 1 sources

                                ** continue;
                            }
                        }
                        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.e = var21;
                        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f = new String[4];
                        var8_7 = 4416305415283033721L;
                        var14_8 = new long[15];
                        var11_9 = 0;
                        var12_10 = "&S\u00dd\u00c3\u00ce\u00b9\u00b6\\\f\u00d2\u0004:(\u00c7\u00bd\u008b\u00d8u\u0013\u000eg\u00db\u001c\u0001\u00ea\u00ec\u0012Q\u0080\u00aaJ\u0089\\)\u0089m\f\u008a<3o\u0099\u0082\u00fe\u0084\u00fe\u00a0\"N7\u0082\u00b8o\u0005k\u00db\u00f5\u00f3\u0089\u009c\u008eh\u0095\u00fd\u00e7\u00b61\u0080~\u00e7\u00a0`\u00d5\u00ab\u00f3\u0003\u00e4/\u00f3;\u00aet\u00e2\u00a9\u00f6(U\u0080d\u00df\u00dfJ\u0082\u0089IG\n\u009a?\u007fb\u00d1g\u00ea";
                        var13_11 = "&S\u00dd\u00c3\u00ce\u00b9\u00b6\\\f\u00d2\u0004:(\u00c7\u00bd\u008b\u00d8u\u0013\u000eg\u00db\u001c\u0001\u00ea\u00ec\u0012Q\u0080\u00aaJ\u0089\\)\u0089m\f\u008a<3o\u0099\u0082\u00fe\u0084\u00fe\u00a0\"N7\u0082\u00b8o\u0005k\u00db\u00f5\u00f3\u0089\u009c\u008eh\u0095\u00fd\u00e7\u00b61\u0080~\u00e7\u00a0`\u00d5\u00ab\u00f3\u0003\u00e4/\u00f3;\u00aet\u00e2\u00a9\u00f6(U\u0080d\u00df\u00dfJ\u0082\u0089IG\n\u009a?\u007fb\u00d1g\u00ea".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block30;
                            break;
                        }
lbl115:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u00b2\u00b5Q\u00f0\u00d3;\u00b8\u009e<\u00dc\u00ba2\u00c7\u0018\u00fd#";
                            var13_11 = "\u00b2\u00b5Q\u00f0\u00d3;\u00b8\u009e<\u00dc\u00ba2\u00c7\u0018\u00fd#".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block30;
                                break;
                            }
                            break;
                        }
lbl128:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block31;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
                    switch (v20) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl139:
                        // 1 sources

                        ** continue;
                    }
                }
                m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.g = var14_8;
                m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.h = new Integer[15];
                m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(13423, 5073779457773048901L);
                var0_14 = 4174509765955955112L;
                var6_15 = new long[2];
                var3_16 = 0;
                var4_17 = ")?L\u00bf\u00bf\u009e\u009e\u00dd\u009f\u00e3\u00e16\u00ablN@";
                var5_18 = ")?L\u00bf\u00bf\u009e\u009e\u00dd\u009f\u00e3\u00e16\u00ablN@".length();
                var2_19 = 0;
                while (true) {
                    break block32;
                    break;
                }
lbl152:
                // 1 sources

                while (true) {
                    var6_15[v22] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block33;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v22 = var3_16++;
            ** while (true)
        }
        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.i = var6_15;
        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.j = new Long[2];
        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("\u00d3", (long)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.c(32669, 6502507623240033931L), (long)2559579175891518L);
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2029;
        if (h[n2] == null) {
            m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.h[n2] = (int)(g[n2] ^ l);
        }
        return h[n2];
    }

    public static Method x(long l) {
        int n = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.u(l);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.v(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.v(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.v(404928414493713L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.v(404928414493713L);
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
        int n3 = (n ^ 0x47BD) & 0xFFFF;
        if (f[n3] == null) {
            int n4;
            char[] cArray = e[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 124;
                case 1 -> 207;
                case 2 -> 144;
                case 3 -> 24;
                case 4 -> 160;
                case 5 -> 218;
                case 6 -> 32;
                case 7 -> 26;
                case 8 -> 2;
                case 9 -> 214;
                case 10 -> 176;
                case 11 -> 120;
                case 12 -> 236;
                case 13 -> 172;
                case 14 -> 63;
                case 15 -> 111;
                case 16 -> 194;
                case 17 -> 103;
                case 18 -> 73;
                case 19 -> 195;
                case 20 -> 61;
                case 21 -> 168;
                case 22 -> 10;
                case 23 -> 249;
                case 24 -> 20;
                case 25 -> 201;
                case 26 -> 21;
                case 27 -> 99;
                case 28 -> 74;
                case 29 -> 240;
                case 30 -> 67;
                case 31 -> 117;
                case 32 -> 208;
                case 33 -> 226;
                case 34 -> 4;
                case 35 -> 219;
                case 36 -> 22;
                case 37 -> 224;
                case 38 -> 222;
                case 39 -> 252;
                case 40 -> 128;
                case 41 -> 44;
                case 42 -> 153;
                case 43 -> 109;
                case 44 -> 245;
                case 45 -> 33;
                case 46 -> 51;
                case 47 -> 40;
                case 48 -> 115;
                case 49 -> 145;
                case 50 -> 191;
                case 51 -> 127;
                case 52 -> 129;
                case 53 -> 83;
                case 54 -> 123;
                case 55 -> 190;
                case 56 -> 0;
                case 57 -> 5;
                case 58 -> 54;
                case 59 -> 220;
                case 60 -> 114;
                case 61 -> 93;
                case 62 -> 97;
                case 63 -> 46;
                case 64 -> 161;
                case 65 -> 141;
                case 66 -> 23;
                case 67 -> 69;
                case 68 -> 6;
                case 69 -> 68;
                case 70 -> 181;
                case 71 -> 105;
                case 72 -> 241;
                case 73 -> 89;
                case 74 -> 90;
                case 75 -> 140;
                case 76 -> 15;
                case 77 -> 182;
                case 78 -> 223;
                case 79 -> 28;
                case 80 -> 250;
                case 81 -> 147;
                case 82 -> 209;
                case 83 -> 150;
                case 84 -> 30;
                case 85 -> 71;
                case 86 -> 254;
                case 87 -> 118;
                case 88 -> 27;
                case 89 -> 215;
                case 90 -> 212;
                case 91 -> 62;
                case 92 -> 139;
                case 93 -> 183;
                case 94 -> 130;
                case 95 -> 36;
                case 96 -> 47;
                case 97 -> 228;
                case 98 -> 52;
                case 99 -> 58;
                case 100 -> 205;
                case 101 -> 248;
                case 102 -> 165;
                case 103 -> 152;
                case 104 -> 94;
                case 105 -> 42;
                case 106 -> 227;
                case 107 -> 38;
                case 108 -> 196;
                case 109 -> 233;
                case 110 -> 53;
                case 111 -> 230;
                case 112 -> 170;
                case 113 -> 174;
                case 114 -> 142;
                case 115 -> 162;
                case 116 -> 86;
                case 117 -> 163;
                case 118 -> 149;
                case 119 -> 59;
                case 120 -> 60;
                case 121 -> 186;
                case 122 -> 39;
                case 123 -> 79;
                case 124 -> 197;
                case 125 -> 3;
                case 126 -> 180;
                case 127 -> 244;
                case 128 -> 133;
                case 129 -> 125;
                case 130 -> 234;
                case 131 -> 70;
                case 132 -> 169;
                case 133 -> 75;
                case 134 -> 175;
                case 135 -> 247;
                case 136 -> 9;
                case 137 -> 138;
                case 138 -> 202;
                case 139 -> 148;
                case 140 -> 50;
                case 141 -> 155;
                case 142 -> 126;
                case 143 -> 151;
                case 144 -> 213;
                case 145 -> 164;
                case 146 -> 13;
                case 147 -> 253;
                case 148 -> 43;
                case 149 -> 84;
                case 150 -> 8;
                case 151 -> 132;
                case 152 -> 179;
                case 153 -> 88;
                case 154 -> 221;
                case 155 -> 72;
                case 156 -> 192;
                case 157 -> 134;
                case 158 -> 231;
                case 159 -> 107;
                case 160 -> 235;
                case 161 -> 188;
                case 162 -> 251;
                case 163 -> 98;
                case 164 -> 135;
                case 165 -> 14;
                case 166 -> 204;
                case 167 -> 11;
                case 168 -> 108;
                case 169 -> 198;
                case 170 -> 156;
                case 171 -> 255;
                case 172 -> 203;
                case 173 -> 18;
                case 174 -> 154;
                case 175 -> 66;
                case 176 -> 143;
                case 177 -> 113;
                case 178 -> 210;
                case 179 -> 64;
                case 180 -> 243;
                case 181 -> 41;
                case 182 -> 91;
                case 183 -> 34;
                case 184 -> 185;
                case 185 -> 229;
                case 186 -> 55;
                case 187 -> 48;
                case 188 -> 200;
                case 189 -> 187;
                case 190 -> 95;
                case 191 -> 110;
                case 192 -> 35;
                case 193 -> 104;
                case 194 -> 7;
                case 195 -> 242;
                case 196 -> 37;
                case 197 -> 16;
                case 198 -> 82;
                case 199 -> 78;
                case 200 -> 171;
                case 201 -> 112;
                case 202 -> 29;
                case 203 -> 45;
                case 204 -> 92;
                case 205 -> 56;
                case 206 -> 81;
                case 207 -> 216;
                case 208 -> 80;
                case 209 -> 167;
                case 210 -> 189;
                case 211 -> 96;
                case 212 -> 19;
                case 213 -> 131;
                case 214 -> 238;
                case 215 -> 49;
                case 216 -> 199;
                case 217 -> 65;
                case 218 -> 102;
                case 219 -> 122;
                case 220 -> 178;
                case 221 -> 25;
                case 222 -> 177;
                case 223 -> 100;
                case 224 -> 232;
                case 225 -> 12;
                case 226 -> 106;
                case 227 -> 206;
                case 228 -> 136;
                case 229 -> 76;
                case 230 -> 31;
                case 231 -> 101;
                case 232 -> 193;
                case 233 -> 137;
                case 234 -> 157;
                case 235 -> 158;
                case 236 -> 159;
                case 237 -> 119;
                case 238 -> 225;
                case 239 -> 184;
                case 240 -> 146;
                case 241 -> 1;
                case 242 -> 166;
                case 243 -> 57;
                case 244 -> 77;
                case 245 -> 211;
                case 246 -> 116;
                case 247 -> 246;
                case 248 -> 217;
                case 249 -> 173;
                case 250 -> 17;
                case 251 -> 239;
                case 252 -> 85;
                case 253 -> 87;
                case 254 -> 121;
                default -> 237;
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
            m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f[n3] = new String(cArray).intern();
        }
        return f[n3];
    }

    public static long c(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x1916) & Short.MAX_VALUE;
        if (j[n2] == null) {
            m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.j[n2] = i[n2] ^ l;
        }
        return j[n2];
    }

    public static void f() {
        Object[] objectArray = m;
        m[0] = "\u0004b/AM\u0003\u001aj5\u000e*\u0002\u000bq8T\f\u0004";
        objectArray[1] = Boolean.TYPE;
        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.n[1] = "java/lang/Boolean";
        objectArray[2] = "(3n7S\u0018(3yk_\u00172xyu_\u00025\t+/\u000bF";
        objectArray[3] = "k\b\"-&Gk\b5q*HqC5o*]v2g1r\u0019!\u000e:b8]ZXc1r";
        objectArray[4] = Void.TYPE;
        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.n[4] = "java/lang/Void";
        objectArray[5] = "\u0006> }\u0012\u0019\r112s\u0017\u0006:5h";
        objectArray[6] = "\u0000fp\u0013uh\u0000fgOyg\u001a-gQyr\u001d\\2\u000e ";
        objectArray[7] = "\bxBvgK\u0016pX9\u0005W\u0011m";
        objectArray[8] = "5-\u0016s;\t;$Q{<\u0012v%\u001c:b\t(\u0001\\F:\u0015=\u0000|L=1;\u001d_V4%\r|ZK&1\u0010)K-\u0018>\b?ip\u001c\u0002\u0016*pd\u000427\u001ap/\u0018$\u001e\u0000\u0000{$\u00170\u0007k*$)\n&aPb(\u001e:sN\u0014\u0017=~bg`%h\u000e~*6%\u000e0Hi\u0006U9\u001dyD\u0010";
        objectArray[9] = Integer.TYPE;
        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.n[9] = "java/lang/Integer";
        objectArray[10] = "=!\u0015\u0017\u0015c6.\u0004Xh{%)\r\u0011";
        objectArray[11] = "% m\u001cFl% z@Jc?kz^Jv8\u001a/\u0001\u001f";
        objectArray[12] = "-\u001a)8vB3\u00123w\u001bX+\u0017::,^(\u0015";
        objectArray[13] = "3GzF\u000bo3Gm\u001a\u0007`)\fm\u0004\u0007u.}<]P7";
        objectArray[14] = "\u0012Z\u0011\u0003\u0017_\u001bT\u0012JTQ\u0004A\u0014A\u0013R_r\u001d@\u001f`\u0003Z\u001aD\u0016U";
        objectArray[15] = ")t8\u0012\t&7|\"]r\u0006\nQ";
        objectArray[16] = ".2^\u00117v ;\u0019\u00190mm:TX3~)`\u001c3\u0019s!9 \u00179\\\u000e6\u0012=;u\u000b#!46u\r\u0004;\u0011jk\u0001`\u0015\f\u000ev$=6\u001a3q \u0013#\rk],?F*\r {\u0013\u001e/fs4\u0003\u0005K8(zf4\u0013\u0017-6a\u0002\u00186j0/\u0001\u0004\n\u007f6\u0015>\r\u0006`\n4\u0019:k";
        objectArray[17] = "\u007fAa#]z\u007fAv\u007fQue\nvaQ`b{#9\u0000";
        objectArray[18] = "V'9P9E]((\u001fUFS**Py";
        objectArray[19] = "K%";
        objectArray[20] = "*~3\u001f\u0019\u0012$wt\u0017\u001e\tiv9V\u0011,\u0012is:\u0017,sK(\u001f%\u0013/sD\u0015\u0007\u000f\u0002iX(9\u000b\u000f\"Y>\u0019*wIo'\u0019N1P+\b\u0016+tQM@2\u0018sH-(8;(L.7\u001b1\u0012Ry\u00151<\u0015nmD'\u0015.Ul\u0001\"2&)\u007f\u0006\u001d)\"#e\u0003D\f//l:\u001d";
        objectArray[21] = Long.TYPE;
        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.n[21] = "java/lang/Long";
        objectArray[22] = "N\u001c\u001e@bo\u001c\u001f\u00168~;^7\u001eHbRW\u0013\u0012EznGN\t8";
        objectArray[23] = "\u0001\u001b}FSdQ\u0013y\u0004!bSLi\u0004A\u0006\u0000Qi\u0006\u0011`\u0006U?\u001a!";
        objectArray[24] = "V9L\u0015\u0011a\n7Z\u0007qv\u0004\"]\r\u001dDSn\rRq#\u00178[QN*\u0012 Ej";
        objectArray[25] = "fV[oNR6^_-<L>#G.QJ\u0012\u000e[<<\u000fh\u001c\u001e#^_`\u0018\\Q";
        objectArray[26] = "g]\nG\rgl\u001d\u0017]q|0\u001b\u0012B\u001dN`[M\u001aq(8YBD@ge\u0015I%";
        objectArray[27] = "w\u0004\u0013e*n|D\u000e\u007fVu B\u000b`:Gv\u0007T;k\u0010w\u0001\u00176n|sO[=V*2L\u000f|?r*G\u001b\u0007";
        objectArray[28] = "\u0002SQ)c;\t\u0013L3\u001f U\u0015I,s\u0012\u0001W\u0018r#EJ\u000bH6{yZVSK";
        objectArray[29] = "i\u007f@q\bM=8\u000bj4K5|s~4M!lPcTA7~L\u0012";
        objectArray[30] = "?@,#o\u0007mC$[uW$QA`aXeO'bkGe-";
        objectArray[31] = "c}J0/~g}@0Sa2h@;?Sf$\u001cam\u0004ciF6b\u007f\"-QcS";
        objectArray[32] = "u7r)3\u0011{(5i\t;hccPs'b\u0002c#x\ni\u0002x]e\u0001T5Q/5/q\"{}G4v\u0013[|U/\u007f\u0002vjN[E>u#wQe5gtm5d(qiG\rW\u001elr6U#\u0004R[q\u0001H bC8&\\\u0004V`HWe%sPv6e\u001aTY7\u0019Dam\u00122\u0019zikt0\u0013ei\t(v\u0019|#`pn\u0012hX";
        objectArray[33] = "\u0010\\_\u001bk\u0003\u0012\u001f\u0018^S\n\u0001\bZ\\5\u001dC|Jx\u001c\u001e\u0013EnAj\u0012ufc}m2B_ey3\u0001\u0016\u0014`}/VI|cJjVGAA{?\u0010tH\u007fL6?\u0016H\u001b\u0018\u0018/oE^I\u0014\u000fsoKZlTw\u0014~k7\u001f|G~~06aGZW\u001fRd_^x*QH~H'iUUF[Yb\u0015H\\'\u0019(\u0000S\u0014A\u001f,VO$UE2\u0012I\u0018E\u0018)o";
        objectArray[34] = "5B^]e\u001a>\u0002CG\u0019\u0001b\u0004FXu30C\u001d\u0003\u0019Up\nE\u0003p\u00017A^?";
        objectArray[35] = ".\u007f; \u001au:}bv&$)`\\&B6)\u001c9=Dz&z;7[zD";
        objectArray[36] = "\u0003WV,\u007fU\rH\u0011lEq_I\u001df}],Yl*\u000f\u001e)__k#\u0012\rSgY\u0003F\u0014vm-?h\u0017DHS\"q.\u0000H.&\u0010\u0004e\u0016-xk\u0015WQW\u0001CQS@u\u001c}\u000eXrUtH/Sj+7V^Sfl\u0017l(Tgt\u0014d2j\u0014p!h<Eae?\u0017\f\u0003\u007f\u0017(K\u0004BRy!^\u0017R-)>@\u0010\bK/:\u0016\f8";
        objectArray[37] = "rrzV2$=/6]Sz.k\u001f\u001a)t%xDYbn}e&\tjj?\u0017";
        objectArray[38] = "iS\"cA\u00195]4q!\u000e;H3{M<l\u0004l%!\u0002/X1mA\u000e9J-\u001cJW*P(%Z\u0005o\u000bS";
        objectArray[39] = "$fM\u0019\u0019@44\bBb\u001c\"&Q\u001a\u000e.uk\u000fCbH0(RA\u000b\u001cwcI}";
        objectArray[40] = "DD\r\u0007hRMA\u0015\u0019S\u0006\u0013\\\u0017\b2\u000b\u000f:P\u00131\\\u0016\\R\u0019.\\tH\t\u0000.\tHXT\u001bS";
        objectArray[41] = "@Y6v\u0001\b\u0001\u001d!#0\u0012\u0000I*uL\u0014\u0006$;q]\u000b\u0000\u0019irUs";
        objectArray[42] = "F/au\u000ftJ.n+2zJ6wz[vs8wj_\u0010_3rjV,Oni\u0017";
        Object[] objectArray2 = objectArray;
        objectArray[43] = "d\t\u0003#%\r4\u0001\u0007aW\u0013<s\u0018t-&!B\u0011lW\u0003 \u0005F%3\u000bc^\u0011\u001d";
    }

    public static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Z' || c == '\u00cb' || c == '\u00ff' || c == '\u00a5') {
                field = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.w(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.x(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'C' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field l(Class clazz, String string, Class clazz2) {
        Field field = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
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

    public static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Class v(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.u(l);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.m[n] = clazz = Class.forName(m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field w(long l) {
        int n = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.u(l);
        Object object = m[n];
        if (object instanceof String) {
            String string = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.n[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.v(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.v(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.k(clazz3, string2, clazz2)) != null) {
                    m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.v(404928414493713L);
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
        if (m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 43;
            case 1 -> 38;
            case 2 -> 27;
            case 3 -> 32;
            case 4 -> 7;
            case 5 -> 23;
            case 6 -> 21;
            case 7 -> 12;
            case 8 -> 36;
            case 9 -> 22;
            case 10 -> 44;
            case 11 -> 18;
            case 12 -> 25;
            case 13 -> 62;
            case 14 -> 63;
            case 15 -> 56;
            case 16 -> 17;
            case 17 -> 54;
            case 18 -> 60;
            case 19 -> 61;
            case 20 -> 14;
            case 21 -> 26;
            case 22 -> 52;
            case 23 -> 3;
            case 24 -> 8;
            case 25 -> 34;
            case 26 -> 55;
            case 27 -> 59;
            case 28 -> 28;
            case 29 -> 37;
            case 30 -> 41;
            case 31 -> 29;
            case 32 -> 4;
            case 33 -> 58;
            case 34 -> 16;
            case 35 -> 51;
            case 36 -> 13;
            case 37 -> 6;
            case 38 -> 47;
            case 39 -> 30;
            case 40 -> 46;
            case 41 -> 19;
            case 42 -> 11;
            case 43 -> 1;
            case 44 -> 50;
            case 45 -> 53;
            case 46 -> 35;
            case 47 -> 48;
            case 48 -> 33;
            case 49 -> 9;
            case 50 -> 45;
            case 51 -> 20;
            case 52 -> 2;
            case 53 -> 49;
            case 54 -> 24;
            case 55 -> 40;
            case 56 -> 5;
            case 57 -> 42;
            case 58 -> 39;
            case 59 -> 10;
            case 60 -> 57;
            case 61 -> 31;
            case 62 -> 15;
            default -> 0;
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
        m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.n[n3] = new String(cArray);
        return n3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @m$.zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2 m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2) {
        class_1657 class_16572 = null;
        CallSite callSite = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687, (long)2189137687310869L);
        synchronized (callSite) {
            CallSite callSite2 = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687, (long)2189137687310869L), (long)2924577651367939L);
            while (m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)callSite2, (long)1604164743898124L) != false) {
                class_1657 class_16573 = (class_1657)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)callSite2, (long)2164343531726564L);
                if (m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)this, (Object)class_16573, (int)((m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(32203, 3758964817866808815L) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) >>> (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(5501, 998889836422870365L)) | (m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(29444, 1309741837734794029L) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) << m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(18007, 7727078702758684283L) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(23493, 3477280960743209965L))), (long)2341528788759797L) == false) continue;
                class_16572 = class_16573;
            }
        }
        try {
            if (class_16572 != null) {
                m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", class_16572, (Object)class_1297.class_5529.field_26998, (long)1947672396006079L);
            }
        }
        catch (class_151 class_1512) {
            throw m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.a(class_1512);
        }
    }

    public boolean m$$usnzfPeWGy6iAn1uPJLR6UgsJVhf38ORt1lPLe11bmnTdwQdPcmX3d47CHJiqfOhVCdu73R8QDlxYkQQkQDkuxD5AsqWq6mRg(class_1657 class_16572, int n) {
        block25: {
            Object object;
            CallSite callSite;
            block23: {
                block22: {
                    try {
                        try {
                            if (m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724 != class_16572 && !(class_16572 instanceof m$$0Vdcp8iLoj2fBQamH9Lk2iYsw1DemKaOQZ3Cgr5RFRYvAKVfkEprMNxQuoXPD2zYRRoA4mbEkBTWtt4Mpdx6av6o9z68Doyg7$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8)) break block22;
                        }
                        catch (class_151 class_1512) {
                            throw m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.a(class_1512);
                        }
                        return false;
                    }
                    catch (class_151 class_1513) {
                        throw m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.a(class_1513);
                    }
                }
                callSite = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)class_16572, (long)1843065588815428L), (long)2629119615580855L);
                try {
                    try {
                        try {
                            if (m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)callSite, (long)1634232443149986L) >= (int)(m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.c(13978, 6481463038079676301L) ^ (long)(\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 << m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(31323, 6932287832590342768L)) ^ (long)(n >>> m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(23151, 3044091633610947138L))) && m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)callSite, (long)1634232443149986L) <= ((((m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(2934, 6306895021109291860L) ^ m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(390, 586577440584049059L)) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) ^ n + m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(23493, 3477280960743209965L)) >>> m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(13271, 6384337702702814196L) | ((m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(16151, 6256338601441206064L) ^ m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(17928, 7349430930730378793L)) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) ^ n + m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(23493, 3477280960743209965L)) << m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(29625, 789271725672813463L)) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.b(3484, 8775243966868172211L))) break block23;
                        }
                        catch (class_151 class_1514) {
                            throw m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.a(class_1514);
                        }
                        if (m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)((Boolean)((Object)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)this.m$$GgEFPZl14v42q4NtIVZfXxCNqM6TSESGLhfqgxlAtLoqGzYIIi4K7AMsO2v6QokHF2Ecm3DhZyP0TEnADb2MTSQekrV4p0fQP, (long)2506559667858541L))), (long)2966132691297576L) == false) break block23;
                    }
                    catch (class_151 class_1515) {
                        throw m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.a(class_1515);
                    }
                    return true;
                }
                catch (class_151 class_1516) {
                    throw m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.a(class_1516);
                }
            }
            if (m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)((Boolean)((Object)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)this.m$$hZhW4FJ9zCF50ufHdhLP1ck5y7DgXZ8cs596g0GAE82oTrJrSgR3LbkoUEXbPK2G4psqNSJiUB2jecO4zhFTx3cOsxPyqfdmd, (long)2506559667858541L))), (long)2966132691297576L) != false) {
                object = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.c(18366, -5288);
                for (CallSite callSite2 : m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)callSite, (long)1780108635005254L), (long)3086968853184262L)) {
                    try {
                        if (m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.c(18367, 28078), (char)callSite2)) continue;
                        return true;
                    }
                    catch (class_151 class_1517) {
                        throw m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.a(class_1517);
                    }
                }
            }
            object = m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_3944, (Object)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)class_16572, (long)2424598856816522L), (long)2067235637278816L), (long)2740493027978387L);
            try {
                block24: {
                    try {
                        try {
                            try {
                                if (m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_3944, (long)1701937063873078L), (Object)object, (long)2854970244200699L) == false || object == null) break block24;
                            }
                            catch (class_151 class_1518) {
                                throw m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.a(class_1518);
                            }
                            if (m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)object, (long)2795567512025723L) != null) break block25;
                        }
                        catch (class_151 class_1519) {
                            throw m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.a(class_1519);
                        }
                        if (m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.f("C", (Object)class_16572, (long)2025642528282726L) == false) break block25;
                    }
                    catch (class_151 class_15110) {
                        throw m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.a(class_15110);
                    }
                }
                return true;
            }
            catch (class_151 class_15111) {
                throw m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.a(class_15111);
            }
        }
        return false;
    }

    public static String m$$7axjUJKysfTDyO19YAmqd7Gvvs9ZuMKrNfcFCcTgHu9W5EvJSnWvisiLPF5Tejeyc5YOK12TCtItEKT3mEBBTEygoVx85BamC(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{88, -57, -44, 85, 50, 36, 15, 29, -71, -72, 8, -108, 36};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 13]);
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
            return MethodHandles.lookup().findStatic(m$$0opIdXhseHDRoWcUgHfCU4bUtWHas3JXPwQnNdNbHzVToRH1JBFH8evqhOS4vORnYN0NFrKPFqe6Zy2C0FF4dCVxpwT3aUAZB.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

