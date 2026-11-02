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
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ;
import me.mioclient.m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW;
import me.mioclient.mixin.m$$nPOv40VwqbKwal7iXnfBZnLO7uxT1UUy4s8On2O1x1lDN1E2KgSimXS0RjZ94eRWtg4XuRmJOPvSzq2d5d35yKY3QBAUlMQOM;
import net.fabricmc.fabric.impl.networking.RegistrationPayload;
import net.minecraft.class_2817;
import net.minecraft.class_8709;
import net.minecraft.class_8710;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M
extends m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM {
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String[] e;
    public static final String[] f;
    public static final long[] g;
    public static final Integer[] h;
    public static final Object[] i;
    public static final String[] j;

    public m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M() {
        super(m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.c(18716, 1078), m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.c(18717, -389), m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ.m$$ZaD3M0jv7OKLL5o46rdCtPy8hIHUWkQwHiymBJrAs8Rx7AkYyizdJsbYM7bheQ2XDJQqqsI7QTERMWze3ESAiWCzZZRMyzfVV, new String[0]);
        m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.f("\u00ba", (Object)this, (boolean)false, (int)((~(((m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.b(1122, 6732918495755781313L) & m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.b(9073, 3472357753900065751L)) << m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.b(20716, 8559664013924274251L) | m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.b(27244, 1531433011687729868L) >>> m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.b(25574, 1829777328816595783L) & m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.b(11365, 872836648289627328L)) - (~\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.b(11365, 872836648289627328L))) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.b(25574, 1829777328816595783L) & m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.b(11365, 872836648289627328L)) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.b(11365, 872836648289627328L))), (long)1166358117852780L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.i = new Object[22];
                        m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.j = new String[22];
                        m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.f();
                        var17 = new String[3];
                        var15_1 = 0;
                        var14_2 = "\u00e39g\u00b3\u00ebO\u00e2!d\u000fiYG\u00c6\b\u00c3\u0006\u00cf\u009d\u00aa=\u0097\u00d3\u00c3o\u00ac!\u00c2\u00e7\u00ad\u00bdL\u0013}\\\u000e\\\u009a\u000b\u008a\f \u0015&\u00da\u00c7\u00f6`b0\u0007\u0002\u0093\u0002\u00ea\u00fd\u00a5\u00ce";
                        var16_3 = "\u00e39g\u00b3\u00ebO\u00e2!d\u000fiYG\u00c6\b\u00c3\u0006\u00cf\u009d\u00aa=\u0097\u00d3\u00c3o\u00ac!\u00c2\u00e7\u00ad\u00bdL\u0013}\\\u000e\\\u009a\u000b\u008a\f \u0015&\u00da\u00c7\u00f6`b0\u0007\u0002\u0093\u0002\u00ea\u00fd\u00a5\u00ce".length();
                        var13_4 = 38;
                        var12_5 = -1;
lbl10:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var17[var15_1++] = new String(v0).intern();
                            if ((var12_5 += var13_4) < var16_3) {
                                var13_4 = var14_2.charAt(var12_5);
                                ** continue;
                            }
                            break block21;
                            break;
                        }
                        v1 = ++var12_5;
                        v2 = var14_2.substring(v1, v1 + var13_4).toCharArray();
                        v3 = v2.length;
                        var18_6 = 0;
                        v4 = 87;
                        v5 = v2;
                        v6 = v3;
                        if (v3 > 1) ** GOTO lbl70
                        do {
                            v7 = v4;
                            v5 = v5;
                            v8 = v5;
                            v9 = v4;
                            v10 = var18_6;
                            while (true) {
                                switch (var18_6 % 7) {
                                    case 0: {
                                        v11 = 56;
                                        break;
                                    }
                                    case 1: {
                                        v11 = 75;
                                        break;
                                    }
                                    case 2: {
                                        v11 = 46;
                                        break;
                                    }
                                    case 3: {
                                        v11 = 104;
                                        break;
                                    }
                                    case 4: {
                                        v11 = 10;
                                        break;
                                    }
                                    case 5: {
                                        v11 = 96;
                                        break;
                                    }
                                    default: {
                                        v11 = 13;
                                    }
                                }
                                v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                                ++var18_6;
                                v4 = v7;
                                if (v7 != 0) break;
                                v7 = v4;
                                v5 = v5;
                                v10 = v4;
                                v8 = v5;
                                v9 = v4;
                            }
lbl70:
                            // 2 sources

                            v0 = v5;
                            v6 = v6;
                        } while (v6 > var18_6);
                        ** while (true)
                    }
                    m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.e = var17;
                    m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.f = new String[3];
                    var4_7 = 6140432434627681665L;
                    var10_8 = new long[7];
                    var7_9 = 0;
                    var8_10 = "Q\u00e2 \u00e8L?\u00c3+M\u008a\u008d\u00ad\u00ff\u00d4\u00ff\u0083\u0012\u00fa\u00a4\u00f3'h>\u00d6\u00d0\u00df\u008cB\u0097\u00e5\u00ad&w\u00fd0\u0083\u00c3\u00e3\u008d\u00da";
                    var9_11 = "Q\u00e2 \u00e8L?\u00c3+M\u008a\u008d\u00ad\u00ff\u00d4\u00ff\u0083\u0012\u00fa\u00a4\u00f3'h>\u00d6\u00d0\u00df\u008cB\u0097\u00e5\u00ad&w\u00fd0\u0083\u00c3\u00e3\u008d\u00da".length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes("ISO-8859-1");
                        v12 = var10_8;
                        v13 = var7_9++;
                        v14 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                        v15 = -1;
                        break block22;
                        break;
                    }
lbl93:
                    // 1 sources

                    while (true) {
                        v12[v13] = v16;
                        if (var6_12 < var9_11) ** continue;
                        var8_10 = "\u0089\u000biE\u00c7\f\u0081\u00a9\u009cM\u00d0a\u00b1{\u000e\u00be";
                        var9_11 = "\u0089\u000biE\u00c7\f\u0081\u00a9\u009cM\u00d0a\u00b1{\u000e\u00be".length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes("ISO-8859-1");
                            v12 = var10_8;
                            v13 = var7_9++;
                            v14 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                            v15 = 0;
                            break block22;
                            break;
                        }
                        break;
                    }
lbl106:
                    // 1 sources

                    while (true) {
                        v12[v13] = v16;
                        if (var6_12 < var9_11) ** continue;
                        break block23;
                        break;
                    }
                }
                v16 = v14 ^ var4_7;
                switch (v15) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl117:
                    // 1 sources

                    ** continue;
                }
            }
            m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.g = var10_8;
            m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.h = new Integer[7];
            m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.b(6229, 7553669741800151287L);
            break block24;
lbl123:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 5870453516972663735L;
        ** while (true)
        var0_15 = 4415578334554789649L ^ var2_14;
        m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.f("Y", (long)var0_15, (long)1236771130561505L);
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x40A3;
        if (h[n2] == null) {
            m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.h[n2] = (int)(g[n2] ^ l);
        }
        return h[n2];
    }

    public static Method x(long l) {
        int n = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.u(l);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.v(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.v(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.v(1005923493596907L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.v(1005923493596907L);
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
        int n3 = (n ^ 0x491D) & 0xFFFF;
        if (f[n3] == null) {
            int n4;
            char[] cArray = e[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 16;
                case 1 -> 138;
                case 2 -> 254;
                case 3 -> 17;
                case 4 -> 33;
                case 5 -> 140;
                case 6 -> 34;
                case 7 -> 84;
                case 8 -> 64;
                case 9 -> 157;
                case 10 -> 169;
                case 11 -> 5;
                case 12 -> 141;
                case 13 -> 165;
                case 14 -> 96;
                case 15 -> 19;
                case 16 -> 117;
                case 17 -> 238;
                case 18 -> 184;
                case 19 -> 212;
                case 20 -> 217;
                case 21 -> 155;
                case 22 -> 242;
                case 23 -> 175;
                case 24 -> 225;
                case 25 -> 156;
                case 26 -> 80;
                case 27 -> 118;
                case 28 -> 113;
                case 29 -> 142;
                case 30 -> 172;
                case 31 -> 68;
                case 32 -> 94;
                case 33 -> 239;
                case 34 -> 189;
                case 35 -> 4;
                case 36 -> 57;
                case 37 -> 192;
                case 38 -> 74;
                case 39 -> 219;
                case 40 -> 116;
                case 41 -> 101;
                case 42 -> 99;
                case 43 -> 164;
                case 44 -> 129;
                case 45 -> 170;
                case 46 -> 150;
                case 47 -> 27;
                case 48 -> 131;
                case 49 -> 128;
                case 50 -> 119;
                case 51 -> 197;
                case 52 -> 25;
                case 53 -> 2;
                case 54 -> 70;
                case 55 -> 237;
                case 56 -> 106;
                case 57 -> 66;
                case 58 -> 37;
                case 59 -> 121;
                case 60 -> 145;
                case 61 -> 32;
                case 62 -> 166;
                case 63 -> 21;
                case 64 -> 230;
                case 65 -> 213;
                case 66 -> 191;
                case 67 -> 130;
                case 68 -> 59;
                case 69 -> 227;
                case 70 -> 98;
                case 71 -> 81;
                case 72 -> 181;
                case 73 -> 194;
                case 74 -> 114;
                case 75 -> 12;
                case 76 -> 24;
                case 77 -> 95;
                case 78 -> 63;
                case 79 -> 49;
                case 80 -> 221;
                case 81 -> 137;
                case 82 -> 252;
                case 83 -> 75;
                case 84 -> 182;
                case 85 -> 160;
                case 86 -> 153;
                case 87 -> 50;
                case 88 -> 105;
                case 89 -> 83;
                case 90 -> 102;
                case 91 -> 209;
                case 92 -> 62;
                case 93 -> 245;
                case 94 -> 18;
                case 95 -> 47;
                case 96 -> 241;
                case 97 -> 232;
                case 98 -> 51;
                case 99 -> 123;
                case 100 -> 58;
                case 101 -> 226;
                case 102 -> 253;
                case 103 -> 111;
                case 104 -> 136;
                case 105 -> 65;
                case 106 -> 204;
                case 107 -> 89;
                case 108 -> 107;
                case 109 -> 112;
                case 110 -> 185;
                case 111 -> 201;
                case 112 -> 151;
                case 113 -> 127;
                case 114 -> 88;
                case 115 -> 249;
                case 116 -> 23;
                case 117 -> 224;
                case 118 -> 152;
                case 119 -> 71;
                case 120 -> 154;
                case 121 -> 228;
                case 122 -> 196;
                case 123 -> 179;
                case 124 -> 10;
                case 125 -> 244;
                case 126 -> 188;
                case 127 -> 15;
                case 128 -> 120;
                case 129 -> 159;
                case 130 -> 54;
                case 131 -> 223;
                case 132 -> 56;
                case 133 -> 220;
                case 134 -> 144;
                case 135 -> 85;
                case 136 -> 240;
                case 137 -> 42;
                case 138 -> 233;
                case 139 -> 250;
                case 140 -> 186;
                case 141 -> 235;
                case 142 -> 43;
                case 143 -> 193;
                case 144 -> 55;
                case 145 -> 171;
                case 146 -> 161;
                case 147 -> 11;
                case 148 -> 231;
                case 149 -> 90;
                case 150 -> 206;
                case 151 -> 173;
                case 152 -> 22;
                case 153 -> 234;
                case 154 -> 92;
                case 155 -> 222;
                case 156 -> 132;
                case 157 -> 108;
                case 158 -> 200;
                case 159 -> 44;
                case 160 -> 97;
                case 161 -> 167;
                case 162 -> 72;
                case 163 -> 48;
                case 164 -> 216;
                case 165 -> 163;
                case 166 -> 13;
                case 167 -> 69;
                case 168 -> 255;
                case 169 -> 110;
                case 170 -> 87;
                case 171 -> 126;
                case 172 -> 190;
                case 173 -> 148;
                case 174 -> 104;
                case 175 -> 205;
                case 176 -> 243;
                case 177 -> 125;
                case 178 -> 14;
                case 179 -> 202;
                case 180 -> 20;
                case 181 -> 203;
                case 182 -> 29;
                case 183 -> 3;
                case 184 -> 39;
                case 185 -> 183;
                case 186 -> 178;
                case 187 -> 41;
                case 188 -> 187;
                case 189 -> 143;
                case 190 -> 93;
                case 191 -> 180;
                case 192 -> 210;
                case 193 -> 46;
                case 194 -> 40;
                case 195 -> 208;
                case 196 -> 73;
                case 197 -> 35;
                case 198 -> 134;
                case 199 -> 211;
                case 200 -> 36;
                case 201 -> 198;
                case 202 -> 9;
                case 203 -> 61;
                case 204 -> 82;
                case 205 -> 214;
                case 206 -> 91;
                case 207 -> 168;
                case 208 -> 0;
                case 209 -> 53;
                case 210 -> 8;
                case 211 -> 139;
                case 212 -> 229;
                case 213 -> 124;
                case 214 -> 76;
                case 215 -> 86;
                case 216 -> 100;
                case 217 -> 31;
                case 218 -> 122;
                case 219 -> 218;
                case 220 -> 133;
                case 221 -> 158;
                case 222 -> 77;
                case 223 -> 6;
                case 224 -> 177;
                case 225 -> 52;
                case 226 -> 28;
                case 227 -> 146;
                case 228 -> 30;
                case 229 -> 147;
                case 230 -> 207;
                case 231 -> 195;
                case 232 -> 246;
                case 233 -> 176;
                case 234 -> 162;
                case 235 -> 78;
                case 236 -> 103;
                case 237 -> 7;
                case 238 -> 135;
                case 239 -> 1;
                case 240 -> 149;
                case 241 -> 109;
                case 242 -> 26;
                case 243 -> 236;
                case 244 -> 38;
                case 245 -> 251;
                case 246 -> 247;
                case 247 -> 67;
                case 248 -> 60;
                case 249 -> 115;
                case 250 -> 45;
                case 251 -> 248;
                case 252 -> 215;
                case 253 -> 174;
                case 254 -> 79;
                default -> 199;
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
            m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.f[n3] = new String(cArray).intern();
        }
        return f[n3];
    }

    public static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c1' || c == '\u00f4' || c == 'T' || c == '\u00a5') {
                field = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.w(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.x(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void f() {
        Object[] objectArray = i;
        i[0] = "D\u000e@\u0014[sJ\u0007\u0007\u001c\\h\u0007\u0006J]XHO\u0012>JpQh;\r\u0015`uk<\u0014\fbvo=\"(\u0005(C\u0011(\u0017|dG\u001e\b\u0001fKC_\t4xmsSZ1`J\u007f%7/zH@\"\u00147@z\u0018\u0003!\u0018AiJ\u0002\u0019\u000e\u007f+n=Y<~}B\u001a\\\u0013}Y\\\u000f,\u001fkWE*!\u0017t";
        objectArray[1] = "\"[?D#\u0013\"[(\u0018/\u001c8\u0010(\u0006/\t?ay_wL";
        objectArray[2] = "\u001ft\u0015K\u007fr\u001ft\u0002\u0017s}\u0005?\u0002\tsh\u0002NYR#+";
        objectArray[3] = "e\u0014~Ev+e\u0014i\u0019z$\u007f_i\u0007z1x.2\\*r/\u0012f\nh1TH;^/";
        objectArray[4] = "q\u0007)G\u0005x\u007f\u000enO\u0002c2\u000f#\u000e\u0001[U\u0016QCX[\u007f8PlYZE,3@ZvY\u0015D\u001a+ T)p~9a~\be\u0013$[}\u00033R\u001a}H/>\\;@J\u0004D\u001c\"dy*wK%rY&K|\\c%5]y\u001c/E VX!$$\u0010Ie-Ah\u0014On^^^\u0017nn4";
        objectArray[5] = Void.TYPE;
        m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.j[5] = "java/lang/Void";
        objectArray[6] = "[\u001eh+1\u000fP\u0011ydK\u000bC\u0010i+}\u000fT";
        objectArray[7] = "h+A=M\u000fc$Pr0\u0017p#Y;";
        objectArray[8] = "YMsj.>YMd6\"1C\u0006d(\"$Dw5|r`";
        objectArray[9] = "b\u0014?hv[l\u001dx`q@!\u001c5!E[z\u0018DCtL>\ticovL\u0007DRW\u0000@\u0015Ig,Eu@'jxP[<Uar\u0007;\u001bCaS{g\u0003sQLLU+e`~p_\u0004 Mg\u00029+DpeQK\u0000ZGXNm%A}V\u0006A0rwrN98\\CNC^\u0005pBR";
        objectArray[10] = Boolean.TYPE;
        m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.j[10] = "java/lang/Boolean";
        objectArray[11] = Integer.TYPE;
        m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.j[11] = "java/lang/Integer";
        objectArray[12] = "n/J\n\u001b\u001c`&\r\u0002\u001c\u0007-'@C\u0013\"V8\n/\u0015\"7\u001aQ\n'\u001dk\"=\u0000\u0005\u0001F8!=;\u0005Ks +\u001b$3\u0018\u00162\u001b@u\u0001R\u001d\u0014%0\u00004U0\u00167\u0019T=:5l\u001dW\"\u0019?V\u0003\u0000\u000032Q?\u0014Q%\u001bj\u0004\u0015\u0014 <bx\u0006\u0013\u001f'fr\u001c\u0016F\u0002k~\u0015/\u001f";
        objectArray[13] = Long.TYPE;
        m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.j[13] = "java/lang/Long";
        objectArray[14] = "C\u000b'5DTH\u00046z%ZC\u000f2 ";
        objectArray[15] = "\u000f?1\u001bE\u0007_*)Q'\u0006T\u001d/\u001aF\u001c\\Fn\u000eA\nP{.\u0011X@3";
        objectArray[16] = "XzmjNx^b&`)2\u000bg[q@6\u0000\u001b)yP'\u0001px`Y f+(i\u0010p\u0016xz5MI]yf`X.Xant)";
        objectArray[17] = "HTfBJA\u001e]\"\u0012uaI@-\fMM:P\\@?\u000e?Vo\u0001\u0013\u0002\u001bZW33V\u0002\u007f]G\u000fx\u0001Mx9\u0012a8\txD\u0016\u0000\u0012l&GH{\u0003^a=1SGZp\u001f,m\u0018QB?DX9ZZA\u0007FHZV\u0006'|>]W\u001e$t$c$\u001a\u0011x*LQ\u000f\u000f\u0007\u001a\nO}DY\u0006Ts@JU\u0004@\u001dMJ]A\bm\u001e\u0018\u0001\u001c1";
        objectArray[18] = "P/\u000eu=M\u000b$O\u000b>\u001d@V\u0006O\u0018X\b LT9h!z\u0001R\u0016Q=&\u0005`kp>GQ;\u0011p6orb\u0019[6`@w)r*XLZbc\u0000nLi!V\u0012.Uo\u001d\u0000=Rn19}4O\u007fygq\u0007Cevb|\u0005!lu\u001cs\u0003[Bj9[\"~\u007f;\u0007R\"/>2d\u000f\b`\\v5U\u001e\u001f";
        objectArray[19] = "Yov\b^iQhsQ%p\rm\u007f_IB]/#\u0007\u0014\u0015ZzpA\u001cm[tc@%";
        objectArray[20] = "Ib{]n\"\u0003$(\u001f\u0003#^u}/AwC\u0016_*> ?aZ\u0015L\f>&z\u00022\u0018\u0018\u0012f'S\t#\u001dB\"m\u0014>hr\u0003X>8%e^3#\u0016\u0001|;:\u0002\u000f\u000bT\n}\fI#s\u0005D<6`)Y[7L\u0000!\rj}7&@5B%\u00142r\b?#4bc\u000eH\u0017J\u0005sd8$\u00032h\u0003=<\u000b&\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[21] = "\u0017\u000b+k9ER\f?g\u0000UM\b\"P9\u0000\u0016RZ>~W\u001a\u0016&6yRCm";
    }

    public static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.f(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static Field l(Class clazz, String string, Class clazz2) {
        Field field = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Throwable a(Throwable throwable) {
        return throwable;
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
            int n = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.u(l);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field w(long l) {
        int n = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.u(l);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.v(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.v(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.k(clazz3, string2, clazz2)) != null) {
                    m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.v(1005923493596907L);
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
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 46;
            case 1 -> 5;
            case 2 -> 50;
            case 3 -> 1;
            case 4 -> 16;
            case 5 -> 22;
            case 6 -> 27;
            case 7 -> 41;
            case 8 -> 45;
            case 9 -> 43;
            case 10 -> 48;
            case 11 -> 17;
            case 12 -> 23;
            case 13 -> 25;
            case 14 -> 20;
            case 15 -> 34;
            case 16 -> 59;
            case 17 -> 44;
            case 18 -> 19;
            case 19 -> 54;
            case 20 -> 12;
            case 21 -> 62;
            case 22 -> 60;
            case 23 -> 53;
            case 24 -> 3;
            case 25 -> 42;
            case 26 -> 0;
            case 27 -> 13;
            case 28 -> 8;
            case 29 -> 21;
            case 30 -> 6;
            case 31 -> 52;
            case 32 -> 37;
            case 33 -> 32;
            case 34 -> 14;
            case 35 -> 9;
            case 36 -> 51;
            case 37 -> 24;
            case 38 -> 26;
            case 39 -> 39;
            case 40 -> 10;
            case 41 -> 40;
            case 42 -> 18;
            case 43 -> 35;
            case 44 -> 57;
            case 45 -> 2;
            case 46 -> 4;
            case 47 -> 58;
            case 48 -> 31;
            case 49 -> 29;
            case 50 -> 33;
            case 51 -> 61;
            case 52 -> 30;
            case 53 -> 56;
            case 54 -> 11;
            case 55 -> 49;
            case 56 -> 28;
            case 57 -> 15;
            case 58 -> 47;
            case 59 -> 38;
            case 60 -> 36;
            case 61 -> 63;
            case 62 -> 55;
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
        m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.j[n3] = new String(cArray);
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @m$.zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW) {
        CallSite callSite;
        Object object = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.f("\u00ba", (Object)m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW, (long)1297818516634976L);
        if (!(object instanceof class_2817)) return;
        class_2817 class_28172 = (class_2817)object;
        try {
            CallSite callSite2;
            callSite = callSite2 = m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.f("\u00ba", (Object)class_28172, (long)1507370611171954L);
        }
        catch (Throwable throwable) {
            throw new MatchException((String)((Object)m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.f("\u00ba", (Object)throwable, (long)1121022204441385L)), throwable);
        }
        if (m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.f("\u00ba", (Object)callSite, (long)1351494852638042L).equals(class_8709.field_48655)) {
            object = (m$$nPOv40VwqbKwal7iXnfBZnLO7uxT1UUy4s8On2O1x1lDN1E2KgSimXS0RjZ94eRWtg4XuRmJOPvSzq2d5d35yKY3QBAUlMQOM)((Object)m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.f("\u00ba", (Object)m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW, (long)1297818516634976L));
            object.setCustomPayload((class_8710)new class_8709(m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.c(18719, 24203)));
        }
        try {
            if (!m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.f("\u00ba", (Object)callSite, (long)1351494852638042L).equals(RegistrationPayload.REGISTER)) return;
            m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.f("\u00ba", (Object)m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW, (long)1469455760625634L);
            return;
        }
        catch (Throwable throwable) {
            throw m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.a(throwable);
        }
    }

    public static String m$$eZCk6FncDs45BL8HcmdFaXSC3AGNFTL5ZTq94LzARitNN7oQJb5G5ndDgridfLaEWEq0KBHUQlBPWFObpOlLpLY582sHaa9dn(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{59, -56, -56, -27, 101, 115, 92, 49, 57, 60, -55, -73};
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
            return MethodHandles.lookup().findStatic(m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

