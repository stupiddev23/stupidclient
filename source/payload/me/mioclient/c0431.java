/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiPredicate;
import me.mioclient.m$;
import me.mioclient.m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ;
import me.mioclient.m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import me.mioclient.m$$qDWCNwcPOHSNNyFhzEE62NH0CTlvD5qHHzxZLBAYIt1fo2VwQ0e367BmA79PmCmz3KtxD0EqmIahdRqT75CXEkeOFoSCGa5B0;
import net.minecraft.class_2703;
import net.minecraft.class_7828;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8
extends m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM {
    public static final Lock m$$5a10Pyz0UH2GGLRX6Wnp458NcpxcI5lJcauY9Fg9B4jfN3lSbyEUPgORcUzz3O02Or3MZuca18hKA0tXc2kZbIRBwdkuCDqyI;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$EbvZPobuZ009SanpSI4SbvS9J9BPPgzyinZl6sZXyJGjt7q6GWgi18LaCoDmaN6To4UzpJvkzjRfEj7IpUn3TJUHBA3SZgSO4;
    public final Map m$$KmyS5nM1NrDSxKBJaTc6SC5c3PHmFppqdG85KQpOpTE6qrp4nGjQWY6OM1l24w5zihtHAnxf5nNn75qW4DgN4Mh5uUich8qDf;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String[] e;
    public static final String[] f;
    public static final long[] g;
    public static final Long[] h;
    public static final Object[] i;
    public static final String[] j;

    public m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8() {
        super(m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.c(-7563, 9720), m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.c(-7564, -22012), m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ.m$$ZaD3M0jv7OKLL5o46rdCtPy8hIHUWkQwHiymBJrAs8Rx7AkYyizdJsbYM7bheQ2XDJQqqsI7QTERMWze3ESAiWCzZZRMyzfVV, new String[0]);
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("\u00c7", (Object)this, (long)3370275645592495L);
        this.m$$KmyS5nM1NrDSxKBJaTc6SC5c3PHmFppqdG85KQpOpTE6qrp4nGjQWY6OM1l24w5zihtHAnxf5nNn75qW4DgN4Mh5uUich8qDf = new ConcurrentHashMap();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.i = new Object[80];
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.j = new String[80];
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f();
            var17 = new String[3];
            var15_1 = 0;
            var14_2 = "\u00d0q\u00c03)\u0098\u00a7\u00f6\u00d2A\u00a4A\u00fc\u00f6{\u000b\u0083\u001c+\f\u00bb\n\u00d9\be\bp\u00da\u00deg\u00c5\u0016\n\u00d0\u00c3R\u0087\u00a2\u00c2P\u00d3\u00ce\u0003\u0011\u0087\u00cc\u0004\u00db\u00958\u00eb\u0095\u00e5\u00a2_4,\\R\u009e\u00f8";
            var16_3 = "\u00d0q\u00c03)\u0098\u00a7\u00f6\u00d2A\u00a4A\u00fc\u00f6{\u000b\u0083\u001c+\f\u00bb\n\u00d9\be\bp\u00da\u00deg\u00c5\u0016\n\u00d0\u00c3R\u0087\u00a2\u00c2P\u00d3\u00ce\u0003\u0011\u0087\u00cc\u0004\u00db\u00958\u00eb\u0095\u00e5\u00a2_4,\\R\u009e\u00f8".length();
            var13_4 = 32;
            var12_5 = -1;
lbl10:
            // 2 sources

            while (true) {
                v0 = ++var12_5;
                v1 = var14_2.substring(v0, v0 + var13_4).toCharArray();
                v2 = v1.length;
                var18_6 = 0;
                v3 = 84;
                v4 = v1;
                v5 = v2;
                if (v2 > 1) ** GOTO lbl93
                break block12;
                break;
            }
            var13_4 = var14_2.charAt(var12_5);
            ** while (true)
lbl26:
            // 1 sources

            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.e = var17;
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f = new String[3];
            var10_7 = 8977136312049512050L;
            var8_8 = -8489007016796900707L ^ var10_7;
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)var8_8;
            var0_9 = 2459806492984382239L;
            var6_10 = new long[2];
            var3_11 = 0;
            var4_12 = "b,\u00e5#\u0000\u001d\u00be(Dc3\u00fd\u00a3J\u00a5%";
            var5_13 = "b,\u00e5#\u0000\u001d\u00be(Dc3\u00fd\u00a3J\u00a5%".length();
            var2_14 = 0;
            do {
                var7_15 = var4_12.substring(var2_14, var2_14 += 8).getBytes("ISO-8859-1");
                v6 = var3_11++;
                var6_10[v6] = (((long)var7_15[0] & 255L) << 56 | ((long)var7_15[1] & 255L) << 48 | ((long)var7_15[2] & 255L) << 40 | ((long)var7_15[3] & 255L) << 32 | ((long)var7_15[4] & 255L) << 24 | ((long)var7_15[5] & 255L) << 16 | ((long)var7_15[6] & 255L) << 8 | (long)var7_15[7] & 255L) ^ var0_9;
            } while (var2_14 < var5_13);
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.g = var6_10;
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.h = new Long[2];
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("\u00c7", (long)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.b(26628, 7538493134245705697L), (long)5030898422289547L);
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.m$$5a10Pyz0UH2GGLRX6Wnp458NcpxcI5lJcauY9Fg9B4jfN3lSbyEUPgORcUzz3O02Or3MZuca18hKA0tXc2kZbIRBwdkuCDqyI = new ReentrantLock();
            return;
        }
        do {
            v7 = v3;
            v4 = v4;
            v8 = v4;
            v9 = v3;
            v10 = var18_6;
            while (true) {
                switch (var18_6 % 7) {
                    case 0: {
                        v11 = 116;
                        break;
                    }
                    case 1: {
                        v11 = 39;
                        break;
                    }
                    case 2: {
                        v11 = 5;
                        break;
                    }
                    case 3: {
                        v11 = 15;
                        break;
                    }
                    case 4: {
                        v11 = 58;
                        break;
                    }
                    case 5: {
                        v11 = 40;
                        break;
                    }
                    default: {
                        v11 = 111;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                ++var18_6;
                v3 = v7;
                if (v7 != 0) break;
                v7 = v3;
                v4 = v4;
                v10 = v3;
                v8 = v4;
                v9 = v3;
            }
lbl93:
            // 2 sources

            v12 = v4;
            v5 = v5;
        } while (v5 > var18_6);
        var17[var15_1++] = new String(v12).intern();
        if ((var12_5 += var13_4) >= var16_3) ** GOTO lbl26
    }

    public static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x5FE4) & Short.MAX_VALUE;
        if (h[n2] == null) {
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.h[n2] = g[n2] ^ l;
        }
        return h[n2];
    }

    public static Method x(long l) {
        int n = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.u(l);
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
                clazz3 = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.v(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.v(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.v(269934879630116L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.v(269934879630116L);
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
        int n3 = (n ^ 0xFFFFE274) & 0xFFFF;
        if (f[n3] == null) {
            int n4;
            char[] cArray = e[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 122;
                case 1 -> 20;
                case 2 -> 179;
                case 3 -> 199;
                case 4 -> 240;
                case 5 -> 198;
                case 6 -> 91;
                case 7 -> 99;
                case 8 -> 97;
                case 9 -> 1;
                case 10 -> 30;
                case 11 -> 106;
                case 12 -> 231;
                case 13 -> 190;
                case 14 -> 16;
                case 15 -> 159;
                case 16 -> 114;
                case 17 -> 201;
                case 18 -> 149;
                case 19 -> 167;
                case 20 -> 14;
                case 21 -> 50;
                case 22 -> 86;
                case 23 -> 54;
                case 24 -> 236;
                case 25 -> 151;
                case 26 -> 69;
                case 27 -> 31;
                case 28 -> 29;
                case 29 -> 170;
                case 30 -> 144;
                case 31 -> 138;
                case 32 -> 82;
                case 33 -> 19;
                case 34 -> 85;
                case 35 -> 113;
                case 36 -> 195;
                case 37 -> 209;
                case 38 -> 109;
                case 39 -> 18;
                case 40 -> 110;
                case 41 -> 239;
                case 42 -> 105;
                case 43 -> 44;
                case 44 -> 43;
                case 45 -> 140;
                case 46 -> 251;
                case 47 -> 229;
                case 48 -> 150;
                case 49 -> 63;
                case 50 -> 17;
                case 51 -> 135;
                case 52 -> 120;
                case 53 -> 249;
                case 54 -> 211;
                case 55 -> 224;
                case 56 -> 100;
                case 57 -> 176;
                case 58 -> 235;
                case 59 -> 72;
                case 60 -> 93;
                case 61 -> 8;
                case 62 -> 177;
                case 63 -> 37;
                case 64 -> 74;
                case 65 -> 234;
                case 66 -> 216;
                case 67 -> 96;
                case 68 -> 67;
                case 69 -> 80;
                case 70 -> 160;
                case 71 -> 77;
                case 72 -> 208;
                case 73 -> 70;
                case 74 -> 127;
                case 75 -> 178;
                case 76 -> 215;
                case 77 -> 134;
                case 78 -> 222;
                case 79 -> 25;
                case 80 -> 28;
                case 81 -> 202;
                case 82 -> 157;
                case 83 -> 217;
                case 84 -> 185;
                case 85 -> 233;
                case 86 -> 65;
                case 87 -> 171;
                case 88 -> 21;
                case 89 -> 245;
                case 90 -> 4;
                case 91 -> 92;
                case 92 -> 57;
                case 93 -> 204;
                case 94 -> 183;
                case 95 -> 47;
                case 96 -> 112;
                case 97 -> 3;
                case 98 -> 40;
                case 99 -> 103;
                case 100 -> 141;
                case 101 -> 154;
                case 102 -> 238;
                case 103 -> 56;
                case 104 -> 200;
                case 105 -> 61;
                case 106 -> 12;
                case 107 -> 89;
                case 108 -> 59;
                case 109 -> 88;
                case 110 -> 255;
                case 111 -> 219;
                case 112 -> 142;
                case 113 -> 133;
                case 114 -> 10;
                case 115 -> 108;
                case 116 -> 213;
                case 117 -> 26;
                case 118 -> 64;
                case 119 -> 182;
                case 120 -> 36;
                case 121 -> 152;
                case 122 -> 181;
                case 123 -> 250;
                case 124 -> 9;
                case 125 -> 228;
                case 126 -> 193;
                case 127 -> 13;
                case 128 -> 32;
                case 129 -> 55;
                case 130 -> 203;
                case 131 -> 121;
                case 132 -> 130;
                case 133 -> 220;
                case 134 -> 148;
                case 135 -> 68;
                case 136 -> 42;
                case 137 -> 66;
                case 138 -> 137;
                case 139 -> 15;
                case 140 -> 49;
                case 141 -> 158;
                case 142 -> 212;
                case 143 -> 53;
                case 144 -> 143;
                case 145 -> 51;
                case 146 -> 146;
                case 147 -> 184;
                case 148 -> 230;
                case 149 -> 118;
                case 150 -> 6;
                case 151 -> 194;
                case 152 -> 196;
                case 153 -> 45;
                case 154 -> 221;
                case 155 -> 242;
                case 156 -> 73;
                case 157 -> 115;
                case 158 -> 175;
                case 159 -> 107;
                case 160 -> 87;
                case 161 -> 248;
                case 162 -> 243;
                case 163 -> 254;
                case 164 -> 111;
                case 165 -> 76;
                case 166 -> 156;
                case 167 -> 79;
                case 168 -> 218;
                case 169 -> 192;
                case 170 -> 172;
                case 171 -> 124;
                case 172 -> 7;
                case 173 -> 164;
                case 174 -> 34;
                case 175 -> 90;
                case 176 -> 223;
                case 177 -> 252;
                case 178 -> 2;
                case 179 -> 125;
                case 180 -> 131;
                case 181 -> 24;
                case 182 -> 101;
                case 183 -> 226;
                case 184 -> 232;
                case 185 -> 94;
                case 186 -> 102;
                case 187 -> 227;
                case 188 -> 128;
                case 189 -> 189;
                case 190 -> 95;
                case 191 -> 206;
                case 192 -> 225;
                case 193 -> 123;
                case 194 -> 169;
                case 195 -> 165;
                case 196 -> 84;
                case 197 -> 60;
                case 198 -> 23;
                case 199 -> 22;
                case 200 -> 139;
                case 201 -> 83;
                case 202 -> 132;
                case 203 -> 210;
                case 204 -> 33;
                case 205 -> 78;
                case 206 -> 153;
                case 207 -> 46;
                case 208 -> 117;
                case 209 -> 116;
                case 210 -> 119;
                case 211 -> 41;
                case 212 -> 186;
                case 213 -> 75;
                case 214 -> 187;
                case 215 -> 104;
                case 216 -> 180;
                case 217 -> 62;
                case 218 -> 173;
                case 219 -> 246;
                case 220 -> 11;
                case 221 -> 205;
                case 222 -> 166;
                case 223 -> 0;
                case 224 -> 191;
                case 225 -> 5;
                case 226 -> 38;
                case 227 -> 247;
                case 228 -> 126;
                case 229 -> 27;
                case 230 -> 39;
                case 231 -> 207;
                case 232 -> 145;
                case 233 -> 48;
                case 234 -> 136;
                case 235 -> 188;
                case 236 -> 197;
                case 237 -> 241;
                case 238 -> 244;
                case 239 -> 253;
                case 240 -> 71;
                case 241 -> 237;
                case 242 -> 98;
                case 243 -> 162;
                case 244 -> 163;
                case 245 -> 52;
                case 246 -> 35;
                case 247 -> 214;
                case 248 -> 58;
                case 249 -> 161;
                case 250 -> 81;
                case 251 -> 174;
                case 252 -> 155;
                case 253 -> 129;
                case 254 -> 147;
                default -> 168;
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
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f[n3] = new String(cArray).intern();
        }
        return f[n3];
    }

    public static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'X' || c == 'O' || c == 'f' || c == 'D') {
                field = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.w(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'X' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.x(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        i[0] = "%rm\u0003\u0010^;zwLw_*az\u0016QY";
        objectArray[1] = Boolean.TYPE;
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.j[1] = "java/lang/Boolean";
        objectArray[2] = "k\\\u007f\\\u000b\u0014uTe\u0013h\u0000q";
        objectArray[3] = "\u001d9][#\u0007\u00166L\u0014B\t\u001d=HN";
        objectArray[4] = "S1(n+bM92!cbW3*fjy\u0017\u00127LjyJ%3jw";
        objectArray[5] = Void.TYPE;
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.j[5] = "java/lang/Void";
        objectArray[6] = "q t8;oo(nwYsh5";
        objectArray[7] = "]Zi\\NcSS.TIx\u001eRc\u0015njv^$hWNTN\bb\u0013hZR#UVy^i$~LbEL\u001fVfB}O*P\u001f9\u0002mvFStCV2CvO`\u0006\u0010{bJ{[)wq\u007fjm\u007f\u007f]o]l!fwihT\u0005{\u0013Beh*G\u0014=B\u0007*dp5So\u0014}\u001f";
        objectArray[8] = "0VeUS\u0010.^\u007f\u001a\u001b\u00104Tg]\u0012\u000btuzd\u000f\u0000>^pU\t\u0000";
        objectArray[9] = "=d6gN_=d!;BP'/!%BE ^tz\u001b";
        objectArray[10] = "TF\u001e<cyJN\u0004s+yPD\u001c4\"b\u0010d\u00073>ySB\u001a";
        objectArray[11] = "s\u001b,1)<x\u0014=~K?w\u001d";
        objectArray[12] = Long.TYPE;
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.j[12] = "java/lang/Long";
        objectArray[13] = "\u001f\",\u0006\u0014|\u0014-=Iii\u00067?\n";
        objectArray[14] = "!'i+\u001a8/..#\u001d#b/cb\u0010%}!\u00121\u001f\u000f\u001e5+/\u0019g\n\u0006\u0017\u0004\u0004\u00139/\t\u001c\u0007\u0006)w#\u001c&\u000e\u00015\u00142\t\r \u001b\t\u0004\u0006n(\u0010\r\u0003\"%8\u001b\u0012tA:9q,(\u001e\u0010$*\u0014\u0007\u001c5\r\u0011+\u0014E4'4-)\t\u0000>8\u007f*\u00072-\u001b.0*\u00014\u001b\u00124\n";
        objectArray[15] = "\u0018\u00077+PG\u0006\u000f-d\u001d]\u001c\u000548\fW\u001c\u0012o&\u0011Q\u0019\u0015o\u0006\u0011Q\u0019";
        objectArray[16] = "n\u001c2)\u0019\\e\u0013#feEj\u0013%*[U";
        objectArray[17] = "\u0002>H@\u0010 \u0002>_\u001c\u001c/\u0018u_\u0002\u001c:\u001f\u0004\u000f_M";
        objectArray[18] = "d/\u000b\u0012\u001fYd/\u001cN\u0013V~d\u001cP\u0013Cy\u0015I\u000fF";
        objectArray[19] = "\u00060But\u0002\u00060U)x\r\u001c{U7x\u0018\u001b\n\u0004l)XL6Z:j\u00187g\u0001k,";
        objectArray[20] = "U\u001ast\u0011P\\\u0014p=R^C\u0001v6\u0015]\u00182\u007f7\u0019oD\u001ax3\u0010Z";
        objectArray[21] = "p'Fg\u000bH~.\u0001o\fS3/L.\bs{;89 j\\\u0012\u000bf0N_\u0015\u0012\u007f2M[\u0014$[U\u0013w8.d,_s7\u000er6pwv\u000fG(VGz\\B0qK\f1\\*st\u000b\u0012D\u0010A,*'k\u0011R~+\u001f}/\u0010Z\u0014_O.Fv3Z`-bh&*l;lq\u0003'd$";
        objectArray[22] = "g\u0013\u0019\u0006\u001f\u007fg\u0013\u000eZ\u0013p}X\u000eD\u0013ez)_\u001dK ";
        objectArray[23] = "\r^\u0017~\u007f%\u0006Q\u00061\u0002=\u0015V\u000fx";
        objectArray[24] = "\u0003{:Pi'\u0003{-\fe(\u00190-\u0012e=\u001eAyF6v";
        objectArray[25] = ".PxL \u0000%_i\u0003Z\u00046^yLl\u0000!";
        objectArray[26] = "&DIuvs&D^)z|<\u000f^7zi;~\u000fl+)";
        objectArray[27] = "\u001c*'\u001cWa\u0002\"=S,A?\u000f";
        objectArray[28] = "?&N\nuR?&YVy]%mYHyH\"\u001c\f\u0010(";
        objectArray[29] = "\u0012}sJZ\u000b\u001ct4B]\u0010Quy\u0003R5*j3oT5KHhJf\n\u0017p\u0004@D\u0016:j\u0018}z\u00127!\u0019kZ3OJ/rZW\tSk]U2LR\r\u0015q\u0001KKm}{\"\u0010OnbX(*Q9@r%-m-\u0011d\f\u0016V,Ta+\u001e*?S^0\u001a %V\u0007\u0015\u0017,,o^";
        objectArray[30] = "\"\bT7fM\"\bCkjB8CCujW?2\u0017-9";
        objectArray[31] = "XS\u000e#/OVZI+(T\u001b[\u0004j7dbun9%pz~s\u0000\bYs^Z\u000b\u0003\u0016\u0007xh~\u0005tY@d{7h}LX\u0014\nbtoi:wFZ\u0004v9\u0017\u0010P\u0005\u0016y\u0004Mt\u0001\u0019\u001e+cXL\u0013\u00052Xq\u0006e?+iT^D\u001c7t\u0002\u0003c\u0016\u0003KPyf!\u0015crW\u0015\fv";
        objectArray[32] = "\u000e$Bm\u0019n\u0005+S\"tj\u00057giFw\u0001+Wi";
        objectArray[33] = Integer.TYPE;
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.j[33] = "java/lang/Integer";
        objectArray[34] = "RJk.T)\\C,&S2\u0011Bag\u000b>|au%G\u000f\rip6S%eW\u0017\u000bEu~D\u000f*^<onsr^q\u0006j}\u0000su|\u0018}(_\bOC/&r\rs\u001631Osl{1,q4\\Gv'W-yk,\u0000\u000e#w]\u0000\u0016y-r\u0017+;i(\f|\u000f\u0005\u000e\u0016gB'\u0019H";
        objectArray[35] = "\"\u000f&*\u0010\u000eW/-%\u0001A6!&.\u0005\u001bB";
        objectArray[36] = "}E\u000f\u0013V\u0013sLH\u001bQ\b>M\u0005Zv\u0005\u007frG\u001fZ;#YN\bI\u001fXoY5\b>!Px\u0013P\u000ehGm\r\u000b\u0006iP\u00146W>jKI\u001f\t\u0016#C\u0011\u001cz\u001ebn[&FO'Iw\t^MgQ\u00117GDrAk\u0010^MHCC'u7 G\u0011\u001f\n\u0006WUb1\rKVOX\u001dH";
        objectArray[37] = "\u001bTN>G\u000b\u0015]\t6@\u0010X\\Dwt\u000b\u0003X5\u0015E\u001cGI\u00185^&5G5\u0004fP9U81\u001d\u0015\f\u0000V<I\u0000\"|$7CWB[27b+\u001eC\u0002\u0007}\u001c,k\u00146O &DQ\u001bVR@k5&T\u00012@+\u0011i\u001e\u0014e0+gV8p\u0003!C\u001e@x-\u0015\u007f\u0013'E\u0001\u0014c";
        objectArray[38] = "(!sR\u000bh(!d\u000e\u0007g2jd\u0010\u0007r5\u001b0HP8";
        objectArray[39] = "W1OB\u000b\u0012Y8\bJ\f\t\u00149E\u000b\u000f\u001aPc\r`%\u0017X:1D\u00058w5\u0003n\u0007\u0011r 0g\n\u0011t\u0007*BV\u000fxc\u0004_2\u0012]>'I\u000f\u0015Y\u00102^W9U<Wy1D\u0002\u0010\u000f|Z\u0017M\u0000\u0014\u0018\u0004L\u0003e%@+IOb\u0013K\n\u000eI,\u0010W6\u001bO\u0016/^:\u0004s7\biW";
        objectArray[40] = "XO-/.\u0016XO:s\"\u0019B\u0004:m\"\fEuk4uN";
        objectArray[41] = "3\fUq{\t=\u0005\u0012y|\u0012p\u0004_8[\u001f1;\u001d}w!m\u0010\u0014jd\u0005\u0016&\u0003W%$o\u0019\"q}\u0014&\u000e7o&\u001c'\u0019NTz$$\u0002\u0013}$\fm\nK~W\u0004,'\u0001DkUi\u0000-ksW)\u0018KUj^<\b1rsW\u0006\n\u0019EX-n\u000eK}'\u001c\u0019\u001c8S Q\u0018\u0006\u0002\u007feB3M_fg\u001f9,#/@\u001f\u0019\u001dHJ~\u0017\tZCrz\u000b)Q/_e\u0007/X9y{)'%:/xP\u0006(\u0019jJ/1\f8/\\T\u0006Q\fI*\n:\u000f\"o\"\fh\u0003\f{ 24\u001b\u001a/^>;^\fIH*\u001b,\u001afc\u0015h\u00078,J^\tP=$";
        objectArray[42] = "p\b\u001e>\t\"{\u0007\u000fqe!u\u0005\r>I";
        objectArray[43] = "I.f6%\u0007I.qj)\bSeqt)\u001dT\u0014'*}^";
        objectArray[44] = "\u0012\u0013(+\u0003\u001c@Ow1=\tF\u0016-(Ps\u0011\u0015-3Q\u001fW\u0012!5=IM\u0014/:Q\u000fJ\u0018)V";
        objectArray[45] = "\"n;rv\t#ge\"I\u0003%i4,%1q(jqI\r9g&/-_qm,K";
        objectArray[46] = "!Q(BKJ{\u0015u\u0001q\\v\r&-\u0018\\l\u0006IC\u0010W(\u000et\u0017\u000bZmk";
        objectArray[47] = "\u0012}WTI4\u001c=\u001e]qY\u0001z\u0005&\u000bE\u000b\u001b\u0005U\u0000h\u0000\u001b\u001e+\u001dc=,7YMM\u0018;\u001d\u000b?V\u001f\n=\n-M\u0016\u001b\u0010\u001c69,'\u0013U\u000f3\f,\u0001\u0002\u0015W\r1\u0017\u001f?o>\u0007\n\u0004N7J\u001d4-\tc!9\u00045@D5\u001d0\u001605\f<\u0015&\u000eT\f\u00032/O{-x\u000bdKo\u0016$\u0003\b\rh\u001a\"oXIr\b(\u000b\tHm\u001aA";
        objectArray[48] = "C\\\u001adDfKZ\u0013w{nOC\u0015h\u0017\\\u001e\u0001N4C\u000b\u001eF\fvB0YF\n\u007f{";
        objectArray[49] = ")r_FvEnrYOO\u001fif\\V3\u0019o\u000b\u001f]0\fz5OZ=~";
        objectArray[50] = "xCwI\tAdDl\u0004v\u001boD~\u001f\u001a)>\u0003\"GN~lJg\u001a\rBkTg\u0017v\u0003mDx\u001d\u001d\u0018i\\fx";
        objectArray[51] = "jU$f.|0\u0011y%\u0014p3\u000b8:S`Z_$8-kg\u000b?5h\u000ejU$f.|0\u0011y%\u0014";
        objectArray[52] = "oL\u0016\u0019s\rr\rZ\u0001\u000fW&YfX4\u000eJ0G1mk5Hn\u0011ev;,\u0014\u0005s`n\u001e\u0018R1Y22g\"3qU;lZ6_oIf\u0000U\fg\u000e\u0012\u0004bBEJM'A|`Hv\u0004mW:6H>eXU\u0014k\u001c6[r\u000bq\u0001TyH$k-^RR(K'_X4DZca@s\u0017S_f^s\u001a(";
        objectArray[53] = "$?\u00130B\r9~_(>Wm*s\u0013gi\u001e7b nV%dt\u0015tu\u0001va\u0007}k%|\u0010p\u007fX!zS4|\r+w\u0011vBJ!y\u0015\u001aG_*Ba\u0004g\n\u0006Gm\bCJ<{G5b\u000f{XSwpt1eo2R\\z<\u00177R\nxgP\bz_\u00116\u001d;n\t\u000fA]JY\n\">D#Q\b$`-";
        objectArray[54] = "QW\u001f,8@\u0001P\u0012^7\u0017\u0013s\r.+~Q\b\u000e&(\u0001\u000fU[`W";
        objectArray[55] = "Ai+\u001bB\u001eFw+\u00169LHa7\u0010E^BwR\u001e^XUe6\u0002W\u001e\u0015\u001b<\u000b@@T';\u0015@M/";
        objectArray[56] = "OQ'z~7\u001d\rx`@6\u0011K\bn+8v\n/i?#\u0006Hx=#XJ\t>~)<\u001b\b!l@";
        objectArray[57] = "<I\u0007d1\u001e%\r\u00057H\u0014yX\br9\u001e\u0018$AU9>)O$k1.nD\u001co-\u000ee(1p!\bl>\u0017n\u000f\u0000\u0011=Amv!\u001c\u001e\u0004_\t\u00168?AIr!e\u000b'?,\u001d;%\u00017*O7\u000b\u00155\u0014\u0013/\u001dAK\u0018\u001cj\u000b']\f<\u0018\u001d\bv3O3?B_x.d:J\u000f!\r)\u0019\u001easO%Mze)\u0003>\u0011\nc2\u0012itF73\b<\u0010\u00176,\u001aU";
        objectArray[58] = "&\u001d?D\fB.\u0013z[<G-\u0011?j\u0005\u0015rKGP\u0001E&\r>[\u0001Vvt";
        objectArray[59] = "9D|rSP=@)4/\u000e(Se6^\u0004I/,\u0011^$xDI/V4?Oq+J\u00144#\\4F\u0012=5z*h\u001a@6,)\u0011;M\u0015i\u001bn\fi4,\r\u0015;4\u0000J{K\u0007j.lsMUf\u0000xqs\t~\u0016,\u000f\u007f\u0006;\u0000J\u0019k&I\u0016e2TUb4/\u001b\u001f451'K\u0011PaA{sD\u0011o\u0006\u0017w\u0017\u0010}\u0016s&\u0016\u000fo\u007f";
        objectArray[60] = "\u0001&q\u0019<SYyo\u0016CCM<eD%Tl'zD\u0006IT\"~RC\u0018Q)&L~LJ$c)";
        objectArray[61] = "6 s\u0012\u0011i`=j\u0000qfw~DX5@262\u0012.a\u0002\u001fh_(N;\u00034[\u001a3\u001a\u0000U\u000fAI\u001a\b},\u0018A1\br\u001e\rq\u0018\u0014J\u0012 :\t>|\u0012\u0013y<,<\u000b\u0015Ej\u0003@0Ka\u0017\n]!\u0003?\u001b9Q;\f:\u0016;32\u000fD\u0019=I\u001c\u0010a1\u001cl!A_8\u001c=`\u001fg+-q\u0010\u001f9*,\r";
        objectArray[62] = "VmZ-Pu\naO,1tXcE!]F\b!\u0019v1(\bq]9NvU$\u001bF\r)NfL\"\\(Qt%";
        objectArray[63] = "+6\u001f'\u0004R{1\u0012U\r\u0001b(`o\r\u000bw8\f)\n\u0007qT";
        objectArray[64] = "{V\u001c\n\u0011apV\u000fZhw{\u00173\u000f\ru\u0016\u0005\u0007\u001f\nc*\u0002\u0019\u001f\u0007\u0018";
        objectArray[65] = "P`6BQ[Pd:A8^\u0004w%UITe\u000blrItT`\tLAd\u0013k1H]D\u0018\u0007\u001cWQB\u0011\u0011:I\u007fJl\u0012lJ\u0006ka1)xy\\E\u0010ln\u0002k\u0018$\n\u0018\\WF\n,\u0010Z\u0005J$8\u0012dYR2llhV\u0017$\nz|ve2%QC\u0005N\u0010ox\bd\u0019\u0015g(@B\u0014$*HYDZ2WQURD+%WQWE[";
        objectArray[66] = "Ja\u001e'\u0001\u001e\u0015lApa\u0003\u0019~\u001bz\r1M2G _fH{\u0002dX]\u000f{\u0004ma";
        objectArray[67] = "@\u007f\u001a0\u000bCH~NhnZHj\u0007\u0005W\b\u00172\u007fn\u0017HV6D)\u0017N_\u000f";
        objectArray[68] = "pW~\"!6%\u0016peMr#\u0017g\u001cwh)\twp1o%\u000f\u001b&+i+\u0000w`,e-l\"!#v1\u0013||v0N";
        objectArray[69] = "+&XuG*9?^sx=,\u0002_b\u0019'$YMj\u0001#0eJt\u0001.K";
        objectArray[70] = "o\u0015jfA}h\u000bjk:*f\u0001om['zgvi\u000b8{\by{V>\u0001^.jB>~\u0000s?\u0004A";
        objectArray[71] = "\b\u0012K[*I\u0006R\u0002R\u0012*Z_C\u001a*\u0006)O2VXE,I\u0001\u0017tI\bE9%T\u001d\u0011`3Qh3\u0012R\u0016/u*+\u0016\u0016RqK\u0001sHQ/0\u0010A\u000f+V\u0018TE\u001e\tK&\u000bN,)#\u0013*E4W`\r[E8\u0010@7-B9\bC?7|J\fv39S?\u0019hL\t\u0015!k\"\u0015\u0004\u0017\u0016Vv\u000e\tRs\rp\u0006\r\u0014HZ`\f\u0007.";
        objectArray[72] = "t 4,vAq\"0l\nEc<\u0001znWc@eumOb,#raI\u000e";
        objectArray[73] = "@$\u001dG\u001e\b\u0012l\u0017Mz\tF)\u000fR\u0016;\u0011eP\fz\u000e\u0015+^X\u0017\u0013Zj\u000b5\u0018\u001dG2\u0010H\u000bTV2o";
        objectArray[74] = "\u0001\"\"0%{\u0012k30Zc\u000e/.06QYbpiZk^:\".#`^)rW";
        objectArray[75] = "S\u00180H\u0007AS\u001c<KnD\u0007\u000f#_\u001fNfsjx\u001fnW\u0018\u000fF\u0017~\u0010\u00137B\u000b^\u001b\u007f\u001a]\u0007X\u0012i<C)Pojj@PqbI/r/FFhjdTq\u001b\\\f\u0012\nMEr*\u001a\f\u001fI\\>\u00182CQJjf>L\u0014\\\fp*lfJ#[\u0015\u001fMhir^~\u001ama\"\u0014ZB\u0012.\u001d\b]Y_Q[\u0003HGS#]\u0007MF#*@PE\u0011XlL\bJ+\u001fiY\u0017HONhF\u0005!";
        objectArray[76] = "<:M\u001ex nf\u0012\u0004F7x&/Y (`6C\u001f'$fZ\u0015\u0005!*i6S\u0002-,\u0005`I\u0004##i&N\b%O";
        objectArray[77] = "0Yo)Q-.O;#*-+S2/C!\u0012]2?GGu\t8:U8+Tm|*";
        objectArray[78] = "Kn?a\n}\fn9h3(\u0010m\u000bqX&w(vqZz\u0015x-'XFK/=aZ\"\u001a.\"s3";
        Object[] objectArray2 = objectArray;
        objectArray[79] = "q?\u0006\\s\u00056?\u0000UJW!*\u007f\u001f,Y(*\u0013Y+U.FF\u0018$F29\u0018Eq\u0000M";
    }

    public static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field l(Class clazz, String string, Class clazz2) {
        Field field = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
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
            int n = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.u(l);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field w(long l) {
        int n = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.u(l);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.v(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.v(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.k(clazz3, string2, clazz2)) != null) {
                    m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.v(269934879630116L);
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
            case 0 -> 48;
            case 1 -> 26;
            case 2 -> 41;
            case 3 -> 54;
            case 4 -> 12;
            case 5 -> 50;
            case 6 -> 33;
            case 7 -> 24;
            case 8 -> 42;
            case 9 -> 25;
            case 10 -> 20;
            case 11 -> 6;
            case 12 -> 21;
            case 13 -> 3;
            case 14 -> 51;
            case 15 -> 7;
            case 16 -> 53;
            case 17 -> 59;
            case 18 -> 18;
            case 19 -> 23;
            case 20 -> 56;
            case 21 -> 44;
            case 22 -> 36;
            case 23 -> 16;
            case 24 -> 14;
            case 25 -> 40;
            case 26 -> 10;
            case 27 -> 11;
            case 28 -> 37;
            case 29 -> 8;
            case 30 -> 4;
            case 31 -> 52;
            case 32 -> 13;
            case 33 -> 1;
            case 34 -> 43;
            case 35 -> 38;
            case 36 -> 35;
            case 37 -> 17;
            case 38 -> 60;
            case 39 -> 2;
            case 40 -> 49;
            case 41 -> 55;
            case 42 -> 9;
            case 43 -> 61;
            case 44 -> 27;
            case 45 -> 39;
            case 46 -> 58;
            case 47 -> 62;
            case 48 -> 0;
            case 49 -> 63;
            case 50 -> 5;
            case 51 -> 32;
            case 52 -> 22;
            case 53 -> 28;
            case 54 -> 45;
            case 55 -> 15;
            case 56 -> 30;
            case 57 -> 34;
            case 58 -> 19;
            case 59 -> 29;
            case 60 -> 47;
            case 61 -> 57;
            case 62 -> 46;
            default -> 31;
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
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.j[n3] = new String(cArray);
        return n3;
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(BiPredicate biPredicate) {
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("\u00c7", (Object)m$$5a10Pyz0UH2GGLRX6Wnp458NcpxcI5lJcauY9Fg9B4jfN3lSbyEUPgORcUzz3O02Or3MZuca18hKA0tXc2kZbIRBwdkuCDqyI, () -> {
            ArrayList arrayList = new ArrayList();
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)this.m$$KmyS5nM1NrDSxKBJaTc6SC5c3PHmFppqdG85KQpOpTE6qrp4nGjQWY6OM1l24w5zihtHAnxf5nNn75qW4DgN4Mh5uUich8qDf, (string, l) -> {
                try {
                    if (m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)biPredicate, (Object)string, (Object)l, (long)4850811105573945L) != false) {
                        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)arrayList, (Object)string, (long)5563669880176885L);
                    }
                }
                catch (MatchException matchException) {
                    throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(matchException);
                }
            }, (long)3972213869506664L);
            CallSite callSite = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", arrayList, (long)3450901205040683L);
            while (m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)callSite, (long)3866946772995764L) != false) {
                String string2 = (String)((Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)callSite, (long)4470372164354178L));
                m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)this.m$$KmyS5nM1NrDSxKBJaTc6SC5c3PHmFppqdG85KQpOpTE6qrp4nGjQWY6OM1l24w5zihtHAnxf5nNn75qW4DgN4Mh5uUich8qDf, (Object)string2, (long)3163639242120706L);
            }
        }, (long)4071664686195713L);
    }

    @m$.zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$qDWCNwcPOHSNNyFhzEE62NH0CTlvD5qHHzxZLBAYIt1fo2VwQ0e367BmA79PmCmz3KtxD0EqmIahdRqT75CXEkeOFoSCGa5B0 m$$qDWCNwcPOHSNNyFhzEE62NH0CTlvD5qHHzxZLBAYIt1fo2VwQ0e367BmA79PmCmz3KtxD0EqmIahdRqT75CXEkeOFoSCGa5B0) {
        block4: {
            try {
                try {
                    if (m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)m$$qDWCNwcPOHSNNyFhzEE62NH0CTlvD5qHHzxZLBAYIt1fo2VwQ0e367BmA79PmCmz3KtxD0EqmIahdRqT75CXEkeOFoSCGa5B0, (long)3767724735210056L) != m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu.m$$cLoz4UwY1GSOQzXYErRtEVYBhrEoLPlj4BbRpZV1TLY7qk3wQNZabEq1LQPwG2CSYkgd7XrSLVNpuykeq21bMvSkKk4Fe5RrY && m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)m$$qDWCNwcPOHSNNyFhzEE62NH0CTlvD5qHHzxZLBAYIt1fo2VwQ0e367BmA79PmCmz3KtxD0EqmIahdRqT75CXEkeOFoSCGa5B0, (long)3682964425104620L) != null) break block4;
                }
                catch (MatchException matchException) {
                    throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(matchException);
                }
                return;
            }
            catch (MatchException matchException) {
                throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(matchException);
            }
        }
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)this, (string, l) -> (boolean)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)m$$qDWCNwcPOHSNNyFhzEE62NH0CTlvD5qHHzxZLBAYIt1fo2VwQ0e367BmA79PmCmz3KtxD0EqmIahdRqT75CXEkeOFoSCGa5B0, (long)3682964425104620L), (Object)string, (long)4948695770948058L), (long)4180112515541520L);
    }

    @m$.zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2 m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2) {
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)this, (string, l) -> {
            try {
                if (m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)l, (long)3274694833411425L) < m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("\u00c7", (long)4247757169950418L)) {
                    return false;
                }
            }
            catch (MatchException matchException) {
                throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(matchException);
            }
            CallSite callSite = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.c(-7562, 7121), (Object)new Object[]{string}, (long)3930774510941539L);
            try {
                if (m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)((Boolean)((Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)this.m$$EbvZPobuZ009SanpSI4SbvS9J9BPPgzyinZl6sZXyJGjt7q6GWgi18LaCoDmaN6To4UzpJvkzjRfEj7IpUn3TJUHBA3SZgSO4, (long)5090496727964244L))), (long)5456415264479325L) != false) {
                    m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("\u00c7", (Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("\u00c7", (Object)callSite, (long)3569284696202675L), (Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("\u00c7", (Object)this, (long)4581496968377838L), (Object)((Object)m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$c1YNZKIre9gha2PNXbjm2rL0bzZp8E5g5prysSUtCYmEx3s7kIMTKClUco1iXIJiAjIYkbL0q1wjtfH7ltIhAh8GLO8gPQEeU), (long)5306816507791830L);
                }
            }
            catch (MatchException matchException) {
                throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(matchException);
            }
            return true;
        }, (long)4180112515541520L);
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687, (long)4679456235320816L), class_7422 -> m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)class_7422, (boolean)false, (long)4401845608904010L), (long)5507540417572721L);
    }

    public /* synthetic */ void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(GameProfile gameProfile) {
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)this.m$$KmyS5nM1NrDSxKBJaTc6SC5c3PHmFppqdG85KQpOpTE6qrp4nGjQWY6OM1l24w5zihtHAnxf5nNn75qW4DgN4Mh5uUich8qDf, (Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)gameProfile, (long)4514838563112121L), (long)3163639242120706L);
    }

    public static String m$$ykpUNc2bwm1GtvjJVXKvckiKl4Pa0AiarGilAehmEWIy6ZaqzRidezktpv3vYIJcYcIeLT4jLSEKMmZA7h9ISnPJCwdvzH12E(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{7, 33, 127, -21, 91, 9, 103, -21, -126, -31, -127, -95, -102, -35, -60, -41, 63, -117, -46, -18};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 20]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    @m$.zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk) {
        Object object;
        CallSite callSite;
        class_2703 class_27032;
        CallSite callSite2 = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk, (long)4336302692765875L);
        if (callSite2 instanceof class_2703) {
            class_27032 = (class_2703)callSite2;
            callSite2 = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)class_27032, (long)3436436082834182L), (long)3450901205040683L);
            while (m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)callSite2, (long)3866946772995764L) != false) {
                callSite = (class_2703.class_2705)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)callSite2, (long)4470372164354178L);
                object = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)callSite, (long)4102458243951559L);
                try {
                    if (object == null) {
                        continue;
                    }
                }
                catch (Throwable throwable) {
                    throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(throwable);
                }
                m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("\u00c7", (Object)m$$5a10Pyz0UH2GGLRX6Wnp458NcpxcI5lJcauY9Fg9B4jfN3lSbyEUPgORcUzz3O02Or3MZuca18hKA0tXc2kZbIRBwdkuCDqyI, () -> this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((GameProfile)object), (long)4071664686195713L);
            }
        }
        if ((callSite = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk, (long)4336302692765875L)) instanceof class_7828) {
            class_27032 = (class_7828)callSite;
            try {
                object = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)class_27032, (long)4756807599719515L);
                callSite2 = object;
            }
            catch (Throwable throwable) {
                throw new MatchException((String)((Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)throwable, (long)4893436480569175L)), throwable);
            }
            callSite = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)callSite2, (long)3450901205040683L);
            while (m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)callSite, (long)3866946772995764L) != false) {
                object = (UUID)((Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)callSite, (long)4470372164354178L));
                CallSite callSite3 = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge, (long)3200140900100350L), (Object)object, (long)5195597744274796L);
                try {
                    if (callSite3 == null) {
                        continue;
                    }
                }
                catch (Throwable throwable) {
                    throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(throwable);
                }
                CallSite callSite4 = m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)callSite3, (long)5257046419507147L), (long)4514838563112121L);
                m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("\u00c7", (Object)m$$5a10Pyz0UH2GGLRX6Wnp458NcpxcI5lJcauY9Fg9B4jfN3lSbyEUPgORcUzz3O02Or3MZuca18hKA0tXc2kZbIRBwdkuCDqyI, () -> this.m$$wGubmqMqmrtXZWX0NqXKXPN0ncXxmsgTbriPsGXdpw1HT0JRzONAMJGZSxpBqYL56aBaZgfaZ79khy5ZrCiAMYxcbyvRyHc18((String)((Object)callSite4)), (long)4071664686195713L);
            }
        }
    }

    public /* synthetic */ void m$$wGubmqMqmrtXZWX0NqXKXPN0ncXxmsgTbriPsGXdpw1HT0JRzONAMJGZSxpBqYL56aBaZgfaZ79khy5ZrCiAMYxcbyvRyHc18(String string) {
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("A", (Object)this.m$$KmyS5nM1NrDSxKBJaTc6SC5c3PHmFppqdG85KQpOpTE6qrp4nGjQWY6OM1l24w5zihtHAnxf5nNn75qW4DgN4Mh5uUich8qDf, (Object)string, (Object)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("\u00c7", (long)(m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f("\u00c7", (long)4247757169950418L) + m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.b(24923, 4615655092305346239L)), (long)3614576784366626L), (long)5388941503050720L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

