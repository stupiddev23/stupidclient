/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.List;
import me.mioclient.m$$02HvsQoTvlnydRVIW36DOf6IhnOfidT08XwqgDPPCZ2Wtgkecu728WgtTm98aq9fJSSTUWNTNQhmlG5n6sGg1XkvY5K4DiROq;
import me.mioclient.m$$3ROV0pLHy8Qutkik2SFQvkGVM8euivjkkYIYEmoAg8XdqHDckodimCpht9rNE2LuWaMUjevPpCtFnBhQOM8gxWy52zNVOCxW1;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$T2XaYQu1fNy5dZvhBzAvXseVmF5fNuCwGor41JWMtgmiwdtahScxMM7TT5PxvTwJr69EhB4hgZaQJaTnGjEOYr6QVwNu9e6T2;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$fpGL7c3hh9Wq0GjZGbUWsMGOqxjqgcrE05H4OUl0FpiGYoHnjcDrxjKurfxMvIVKaJ4GAuaRgVOLd2AOlBDxzNHQjDNpEjvwE;
import net.minecraft.class_151;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw
extends m$$fpGL7c3hh9Wq0GjZGbUWsMGOqxjqgcrE05H4OUl0FpiGYoHnjcDrxjKurfxMvIVKaJ4GAuaRgVOLd2AOlBDxzNHQjDNpEjvwE
implements m$$02HvsQoTvlnydRVIW36DOf6IhnOfidT08XwqgDPPCZ2Wtgkecu728WgtTm98aq9fJSSTUWNTNQhmlG5n6sGg1XkvY5K4DiROq,
m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    public static m$$3ROV0pLHy8Qutkik2SFQvkGVM8euivjkkYIYEmoAg8XdqHDckodimCpht9rNE2LuWaMUjevPpCtFnBhQOM8gxWy52zNVOCxW1 m$$bs4qkT3zssumkENV8WfjU2cKxcuD3XNCFptuj0P3N0QrdOoCcYGMtmTOKhrndbFhOV8KI7mxBW8MfbsUIeSrA5242QYQO0U25;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String[] c;
    public static final String[] d;
    public static final Object[] g;
    public static final String[] h;

    public m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw() {
        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg, (Object)this, (long)1758121911087246L);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.g = new Object[37];
            m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.h = new String[37];
            m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d();
            var13 = new String[3];
            var11_1 = 0;
            var10_2 = "\u00df\u0007\u00cf~\u00ac\u00fe.\u0007[+_\u00fb\u00beNl\u0010\u00da=o9\u00b8\u0015\u00b6 \u00f6\u008aS\u00c6u\u00ed\u00a0\u00ce";
            var12_3 = "\u00df\u0007\u00cf~\u00ac\u00fe.\u0007[+_\u00fb\u00beNl\u0010\u00da=o9\u00b8\u0015\u00b6 \u00f6\u008aS\u00c6u\u00ed\u00a0\u00ce".length();
            var9_4 = 7;
            var8_5 = -1;
lbl10:
            // 2 sources

            while (true) {
                v0 = ++var8_5;
                v1 = var10_2.substring(v0, v0 + var9_4).toCharArray();
                v2 = v1.length;
                var14_6 = 0;
                v3 = 111;
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
                        v10 = 108;
                        break;
                    }
                    case 1: {
                        v10 = 15;
                        break;
                    }
                    case 2: {
                        v10 = 71;
                        break;
                    }
                    case 3: {
                        v10 = 116;
                        break;
                    }
                    case 4: {
                        v10 = 26;
                        break;
                    }
                    case 5: {
                        v10 = 69;
                        break;
                    }
                    default: {
                        v10 = 108;
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

        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.c = var13;
        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d = new String[3];
        var6_7 = 1944429791357534241L;
        var4_8 = 5860554652290483513L ^ var6_7;
        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)var4_8;
        var2_9 = 6111422012123760303L;
        var0_10 = 1671104060887993822L ^ var2_9;
        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00df", (long)var0_10, (long)2231735968025122L);
        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.m$$bs4qkT3zssumkENV8WfjU2cKxcuD3XNCFptuj0P3N0QrdOoCcYGMtmTOKhrndbFhOV8KI7mxBW8MfbsUIeSrA5242QYQO0U25 = (m$$3ROV0pLHy8Qutkik2SFQvkGVM8euivjkkYIYEmoAg8XdqHDckodimCpht9rNE2LuWaMUjevPpCtFnBhQOM8gxWy52zNVOCxW1)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$3ROV0pLHy8Qutkik2SFQvkGVM8euivjkkYIYEmoAg8XdqHDckodimCpht9rNE2LuWaMUjevPpCtFnBhQOM8gxWy52zNVOCxW1.class);
    }

    public static String b(int n, int n2) {
        int n3 = (n ^ 0x7AE7) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = c[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 71;
                case 1 -> 171;
                case 2 -> 139;
                case 3 -> 82;
                case 4 -> 190;
                case 5 -> 255;
                case 6 -> 89;
                case 7 -> 3;
                case 8 -> 212;
                case 9 -> 125;
                case 10 -> 160;
                case 11 -> 179;
                case 12 -> 248;
                case 13 -> 129;
                case 14 -> 92;
                case 15 -> 159;
                case 16 -> 7;
                case 17 -> 244;
                case 18 -> 64;
                case 19 -> 63;
                case 20 -> 58;
                case 21 -> 176;
                case 22 -> 233;
                case 23 -> 175;
                case 24 -> 13;
                case 25 -> 180;
                case 26 -> 59;
                case 27 -> 40;
                case 28 -> 102;
                case 29 -> 211;
                case 30 -> 6;
                case 31 -> 183;
                case 32 -> 1;
                case 33 -> 222;
                case 34 -> 35;
                case 35 -> 53;
                case 36 -> 11;
                case 37 -> 43;
                case 38 -> 32;
                case 39 -> 54;
                case 40 -> 134;
                case 41 -> 165;
                case 42 -> 106;
                case 43 -> 117;
                case 44 -> 118;
                case 45 -> 193;
                case 46 -> 250;
                case 47 -> 131;
                case 48 -> 155;
                case 49 -> 33;
                case 50 -> 206;
                case 51 -> 94;
                case 52 -> 150;
                case 53 -> 218;
                case 54 -> 192;
                case 55 -> 158;
                case 56 -> 48;
                case 57 -> 149;
                case 58 -> 110;
                case 59 -> 186;
                case 60 -> 235;
                case 61 -> 83;
                case 62 -> 46;
                case 63 -> 225;
                case 64 -> 146;
                case 65 -> 45;
                case 66 -> 86;
                case 67 -> 251;
                case 68 -> 214;
                case 69 -> 132;
                case 70 -> 27;
                case 71 -> 219;
                case 72 -> 137;
                case 73 -> 194;
                case 74 -> 15;
                case 75 -> 170;
                case 76 -> 204;
                case 77 -> 157;
                case 78 -> 0;
                case 79 -> 187;
                case 80 -> 181;
                case 81 -> 164;
                case 82 -> 154;
                case 83 -> 113;
                case 84 -> 107;
                case 85 -> 29;
                case 86 -> 203;
                case 87 -> 97;
                case 88 -> 147;
                case 89 -> 14;
                case 90 -> 140;
                case 91 -> 2;
                case 92 -> 77;
                case 93 -> 19;
                case 94 -> 76;
                case 95 -> 101;
                case 96 -> 23;
                case 97 -> 22;
                case 98 -> 201;
                case 99 -> 66;
                case 100 -> 241;
                case 101 -> 81;
                case 102 -> 78;
                case 103 -> 12;
                case 104 -> 142;
                case 105 -> 249;
                case 106 -> 85;
                case 107 -> 26;
                case 108 -> 169;
                case 109 -> 87;
                case 110 -> 152;
                case 111 -> 119;
                case 112 -> 8;
                case 113 -> 128;
                case 114 -> 122;
                case 115 -> 144;
                case 116 -> 168;
                case 117 -> 20;
                case 118 -> 231;
                case 119 -> 133;
                case 120 -> 21;
                case 121 -> 161;
                case 122 -> 216;
                case 123 -> 115;
                case 124 -> 199;
                case 125 -> 4;
                case 126 -> 104;
                case 127 -> 162;
                case 128 -> 198;
                case 129 -> 167;
                case 130 -> 124;
                case 131 -> 5;
                case 132 -> 123;
                case 133 -> 245;
                case 134 -> 109;
                case 135 -> 221;
                case 136 -> 196;
                case 137 -> 51;
                case 138 -> 184;
                case 139 -> 200;
                case 140 -> 148;
                case 141 -> 238;
                case 142 -> 191;
                case 143 -> 10;
                case 144 -> 50;
                case 145 -> 114;
                case 146 -> 135;
                case 147 -> 34;
                case 148 -> 185;
                case 149 -> 253;
                case 150 -> 234;
                case 151 -> 38;
                case 152 -> 163;
                case 153 -> 105;
                case 154 -> 130;
                case 155 -> 182;
                case 156 -> 96;
                case 157 -> 254;
                case 158 -> 173;
                case 159 -> 108;
                case 160 -> 47;
                case 161 -> 93;
                case 162 -> 98;
                case 163 -> 228;
                case 164 -> 28;
                case 165 -> 121;
                case 166 -> 103;
                case 167 -> 31;
                case 168 -> 145;
                case 169 -> 17;
                case 170 -> 126;
                case 171 -> 227;
                case 172 -> 188;
                case 173 -> 75;
                case 174 -> 73;
                case 175 -> 230;
                case 176 -> 210;
                case 177 -> 195;
                case 178 -> 151;
                case 179 -> 156;
                case 180 -> 220;
                case 181 -> 213;
                case 182 -> 44;
                case 183 -> 62;
                case 184 -> 232;
                case 185 -> 242;
                case 186 -> 189;
                case 187 -> 67;
                case 188 -> 84;
                case 189 -> 209;
                case 190 -> 205;
                case 191 -> 223;
                case 192 -> 120;
                case 193 -> 178;
                case 194 -> 91;
                case 195 -> 229;
                case 196 -> 236;
                case 197 -> 207;
                case 198 -> 95;
                case 199 -> 166;
                case 200 -> 177;
                case 201 -> 127;
                case 202 -> 60;
                case 203 -> 56;
                case 204 -> 57;
                case 205 -> 240;
                case 206 -> 68;
                case 207 -> 141;
                case 208 -> 116;
                case 209 -> 174;
                case 210 -> 88;
                case 211 -> 41;
                case 212 -> 25;
                case 213 -> 39;
                case 214 -> 246;
                case 215 -> 224;
                case 216 -> 72;
                case 217 -> 90;
                case 218 -> 30;
                case 219 -> 74;
                case 220 -> 80;
                case 221 -> 239;
                case 222 -> 237;
                case 223 -> 112;
                case 224 -> 18;
                case 225 -> 69;
                case 226 -> 24;
                case 227 -> 65;
                case 228 -> 202;
                case 229 -> 111;
                case 230 -> 79;
                case 231 -> 226;
                case 232 -> 138;
                case 233 -> 100;
                case 234 -> 136;
                case 235 -> 99;
                case 236 -> 42;
                case 237 -> 16;
                case 238 -> 197;
                case 239 -> 243;
                case 240 -> 215;
                case 241 -> 70;
                case 242 -> 208;
                case 243 -> 61;
                case 244 -> 247;
                case 245 -> 52;
                case 246 -> 143;
                case 247 -> 172;
                case 248 -> 37;
                case 249 -> 36;
                case 250 -> 9;
                case 251 -> 153;
                case 252 -> 49;
                case 253 -> 55;
                case 254 -> 252;
                default -> 217;
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
            m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    public static Class n(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.m(l);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field h(Class clazz, String string, Class clazz2) {
        Field field = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'u' || c == '\u00cf' || c == 'V' || c == '\u00b5') {
                field = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.o(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'u' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.p(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00df' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void d() {
        Object[] objectArray = g;
        g[0] = "L=\u0012ZO@R5\b\u0015(AC.\u0005O\u000eG";
        objectArray[1] = Boolean.TYPE;
        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.h[1] = "java/lang/Boolean";
        objectArray[2] = "nLCS}zbDB\u00184r~L@SPfbMa\u001fppnW";
        objectArray[3] = "F\u0010=\u000f\u0014\u0007M\u001f,@i\u001f^\u0018%\t";
        objectArray[4] = "\u0013\u000f\u0006nd#\u001f\u0007\u0007%-+\u0003\u000f\u0005nI?\u001f\u000e.,f!\u0015\u000e\u001f";
        objectArray[5] = Void.TYPE;
        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.h[5] = "java/lang/Void";
        objectArray[6] = "\u001dF_\u001e;\u000b\u0013O\u0018\u0016<\u0010^NUWk-8F\u001985\u0016\u001edB e(3tE\u0006!!1H\u00045\bRFNG\u001e`W\u0015\u0014\u0015)1\u00014j\t:\u000bU\u0019B5\"\u000b\u001d \u0012\u0004'!\u000b&\u001b\u001eK30ID?\u001e\u0015V5a)Cf\u0017\u0000\u0013&\u0016d+8k\u001f%\u000b]\u0007g\u0010A5\u0007\u0017T'\u0003\u0018";
        objectArray[7] = "+;\f_S?53\u0016\u0010>%-6\u001f]\t#.4";
        objectArray[8] = "Vb7/\"sZj6dk{Fb4/\u0002oZc";
        objectArray[9] = " k%] (+d4\u0012A& o0H";
        objectArray[10] = "<]#$L\u000b0U\"o\u0005\u0003,] $a\u00170\\\u000fxY\u0005&";
        objectArray[11] = "zZ\u0011[LatSVSKz9R\u001b\u0012Hi}\bSybduQo]BKZ^]w@b_Kn~MbYlt[\u0011|U\bZFuapUyPHft{lG\u0010JxW\t`v7/{Qe\u001dd`kJ\u0001C?.\u000e{Yl:b\tMRM}dGNNqhb}qG}w^\\Vp\u0010";
        objectArray[12] = "\u001b7\b&-)\u0005?\u0012iO5\u0002\"";
        objectArray[13] = "bh\u0004[\u0011#ig\u0015\u0014} ge\u0017[Q";
        objectArray[14] = "$K?yle*Bxqk~gC50d[\u001c\\\u007f\\b[}~$yPd!FHsrx\f\\TNL|\u0001\u0017UXl]y|cAl9?e'nc\\zdA&Go}}!NML&y\"QnF\u001cgusDK\u001b[a\"Rb ``gWE(\u001cs`h^,\u0016ie1{!\u001a`\\h";
        objectArray[15] = Long.TYPE;
        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.h[15] = "java/lang/Long";
        objectArray[16] = Integer.TYPE;
        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.h[16] = "java/lang/Integer";
        objectArray[17] = "Q\b}\u0007pY_\u0001:\u000fwB\u0012\u0000wN(AE&\u00142Vf]\u0001\u00052/[z%\u0007&_\u000eH5\u0003\u0007nS\n\t>,.yf>6,vrh\u0001\"\u001fS\u0005e\u000b!/\\gJY\u001a&\u007f`\u000b\u001f\u0005(MfS8\u00053|WX8\u001c#\u007f\u0001ZY\u0006\u0013v\u0000d(>\u001eI\u000el=\u000bRU\u0001WZ\u0010\u0013Q";
        objectArray[18] = "\u0002\fN!-m\t\u0003_n@m\t\u001eK";
        objectArray[19] = "+\u0000\u000e*[)-]\r\u0012B ;}\u0003b^I2Q\u0005\"[4!YQ\u0012";
        objectArray[20] = "%\u001c`Gj |T7U\f2q\u0011OUN&{\u000bOTv4mm<O72#\u000f=^1\"\u001cR=Eof\"QhC6]";
        objectArray[21] = "\rerW%HT-%EC\\Xx\u0014\u0004\"\u000e[+v\u00053\bK\u0014/\u00061M[$/S-V4(,D>\\YsoN 5";
        objectArray[22] = "g\u0013\u001bsydgF\u0007h\u0016;1W pT/;M.at97Wi2g25M\u0014k/e'+";
        objectArray[23] = "\u0014tfu7\u0019B;<nH\u0014E7_x'\u001aS7\u007fdHF\u0011:8%/EO5:\u0015";
        objectArray[24] = "US`0X\u0013\u000e\n\"-?\t\u0012D$)x3E4E7Z\u0006|\u0017!re\u0011lTBp\u007f\u0017X/}rb\u0016U\u000bZ\be\u001da\"g\t\u0005\u0000b\f{\rM)a\rM\nX%A:f,AR}#l3T,^\u0016\u007f\n\\\u0001O\u000fy\u0012F ES!5C7R*-,s]O2-)x.Z\u0010%K\u0001\u0006\u0000\u0011z\"DPF\n\u001dw\u0007\u0016C\u0001p,D\u001c]h";
        objectArray[25] = "i;X^I^>=H\\xY0BAX\u001ey-mW?FOiy]V\u0003\u0019/b:\u0004@W/o\n\u0004\u0015K4\u0000";
        objectArray[26] = "Xk.6;P[>(o\u0000\u0007\u000b<En8\u001c\u001f?unm\u0000\u0004Pymz\u0013\u000e=\".p\rg";
        objectArray[27] = "%\u001c8yRT#A;AMY>[X\u007fA\n7@1:\u0017L,'";
        objectArray[28] = "O22Cg\u0014\u00184\"AV\u0001\u000bn5`-\b\u0017\tk\u001a$\u0017\u001e9kO8\fqb6\u001a6V\u0013x N$oOcn[1\u0006\n5(@V";
        objectArray[29] = "~gTTHl}2R\rs3=1E^\u000f5;\\T\f\u0013j8<RQ\u0010R";
        objectArray[30] = "H\u001bb\u0004sYMO\"WHK\u001a\u0002D\u0007,Y\u001a~$\u0004v]\u0010\u0017aR0Fw";
        objectArray[31] = "Y>\u0018]x\u0011]lB\u001a\u001ct\u0001q\u0014\u0014$XraeXV\u001bwgV\u0019z\u0017Skn+ZCJNd_fmI|A!{tp8A\\\u007f\u0015Z]\u001f_!nKoX%XF\u000fkI\u0007ExP`{'-MqkcYnS\u0000ko\u001eNivln\u0006MalR\u001d\u0002xmb}h\u0017f\u0012R;veuZWb\u001a\u001flQTb$\u000f-LB`\u0015]#KV\u0000";
        objectArray[32] = "\u000ebN)w\u001c\u000e7R2\u0018MN\u0018G6~k_8Q:d,G0WaaQT8\u0003Q";
        objectArray[33] = " \u0004N3QayL\u0019!7|p\u000e(`V'vJJaG!fuZ0\\,`\bI8\b\u001c";
        objectArray[34] = "b%:U\f\u001d5&2\u0012}\u0002.61A\u0001\u0004([ \u0013\u001d[+;&N\u001ec";
        objectArray[35] = "\u0001/a\u000bd]\u000e=|CYJW+~\u00170Fn%~\u00074 B&qJ ]Q.%z";
        Object[] objectArray2 = objectArray;
        objectArray[36] = "\u000e]O#rrY^Gd\u0003eRO>`i2GDW%?t\\#L4h<G^_<<\f";
    }

    public static Exception a(Exception exception) {
        return exception;
    }

    public static int m(long l) {
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
            case 0 -> 17;
            case 1 -> 49;
            case 2 -> 8;
            case 3 -> 31;
            case 4 -> 21;
            case 5 -> 4;
            case 6 -> 15;
            case 7 -> 59;
            case 8 -> 60;
            case 9 -> 18;
            case 10 -> 50;
            case 11 -> 20;
            case 12 -> 52;
            case 13 -> 46;
            case 14 -> 53;
            case 15 -> 42;
            case 16 -> 45;
            case 17 -> 19;
            case 18 -> 16;
            case 19 -> 55;
            case 20 -> 47;
            case 21 -> 1;
            case 22 -> 23;
            case 23 -> 13;
            case 24 -> 56;
            case 25 -> 11;
            case 26 -> 43;
            case 27 -> 26;
            case 28 -> 48;
            case 29 -> 14;
            case 30 -> 22;
            case 31 -> 33;
            case 32 -> 24;
            case 33 -> 44;
            case 34 -> 29;
            case 35 -> 6;
            case 36 -> 61;
            case 37 -> 12;
            case 38 -> 9;
            case 39 -> 7;
            case 40 -> 30;
            case 41 -> 38;
            case 42 -> 34;
            case 43 -> 58;
            case 44 -> 36;
            case 45 -> 27;
            case 46 -> 62;
            case 47 -> 40;
            case 48 -> 3;
            case 49 -> 32;
            case 50 -> 35;
            case 51 -> 39;
            case 52 -> 25;
            case 53 -> 51;
            case 54 -> 54;
            case 55 -> 37;
            case 56 -> 41;
            case 57 -> 57;
            case 58 -> 10;
            case 59 -> 0;
            case 60 -> 2;
            case 61 -> 28;
            case 62 -> 63;
            default -> 5;
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
        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.h[n3] = new String(cArray);
        return n3;
    }

    public static Field o(long l) {
        int n = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.m(l);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.n(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.n(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.g(clazz3, string2, clazz2)) != null) {
                    m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.n(640920199614679L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method p(long l) {
        int n = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.m(l);
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
                clazz3 = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.n(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.n(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.n(640920199614679L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.n(640920199614679L);
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

    public static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public JsonElement toJson() {
        try {
            if (m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)((Boolean)((Object)m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.m$$bs4qkT3zssumkENV8WfjU2cKxcuD3XNCFptuj0P3N0QrdOoCcYGMtmTOKhrndbFhOV8KI7mxBW8MfbsUIeSrA5242QYQO0U25.m$$gl5dDqw2tOP29mxVDHeNRQySI86wELeoYxpPfAFXqvS9pMycnDAFKwtET2zKO9oQ0XIs6VpTcY31VdAzgPznNQCV3GjQSgTGB, (long)2178381227734100L))), (long)2530992333908781L) == false) {
                return new JsonObject();
            }
        }
        catch (class_151 class_1512) {
            throw m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.a((Exception)((Object)class_1512));
        }
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject = new JsonObject();
        CallSite callSite = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)((List)((Object)m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$O5xv1JajzceW45mnkHfEpdi7GpCbJXzHAFkvxKEtc5L94BQg9hWFRQVipCGE5Y3I1Gfm8pJmSGmJbJgGTy24nt3OSUNCHVP7H, (long)1619702531498486L))), (long)2432152422682001L);
        while (m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)callSite, (long)1363250053869300L) != false) {
            m$$T2XaYQu1fNy5dZvhBzAvXseVmF5fNuCwGor41JWMtgmiwdtahScxMM7TT5PxvTwJr69EhB4hgZaQJaTnGjEOYr6QVwNu9e6T2 m$$T2XaYQu1fNy5dZvhBzAvXseVmF5fNuCwGor41JWMtgmiwdtahScxMM7TT5PxvTwJr69EhB4hgZaQJaTnGjEOYr6QVwNu9e6T2 = (m$$T2XaYQu1fNy5dZvhBzAvXseVmF5fNuCwGor41JWMtgmiwdtahScxMM7TT5PxvTwJr69EhB4hgZaQJaTnGjEOYr6QVwNu9e6T2)((Object)m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)callSite, (long)1960518312615896L));
            m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)jsonArray, (Object)m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)m$$VqDc0eTAgzOPC4IU6WwZsiqEa0qk7QNmclpi6XPMtzLLBOqLUU9iWXMcrWVjw6jLdGlqrsVBwx7XuPXLTWk6HGDHuk8aGSTUx, (Object)m$$T2XaYQu1fNy5dZvhBzAvXseVmF5fNuCwGor41JWMtgmiwdtahScxMM7TT5PxvTwJr69EhB4hgZaQJaTnGjEOYr6QVwNu9e6T2, (long)1789669808505796L), (long)1892712117101348L);
        }
        m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)jsonObject, (Object)m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.b(31463, 25599), (Object)jsonArray, (long)1542147305320659L);
        return jsonObject;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void fromJson(JsonElement jsonElement) {
        block7: {
            if (m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)jsonElement, (long)2272237302026937L) == false) return;
            try {
                if (m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)jsonElement, (long)1577708140303333L), (Object)m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.b(31462, -11586), (long)2385086454049450L) != false) break block7;
                return;
                catch (Exception exception) {
                    throw m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.a(exception);
                }
            }
            catch (Exception exception) {
                throw m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.a(exception);
            }
        }
        CallSite callSite = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)jsonElement, (long)1577708140303333L), (Object)m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.b(31463, 25599), (long)1430217973990489L);
        CallSite callSite2 = m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)callSite, (long)2044748510204935L);
        while (m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)callSite2, (long)1363250053869300L) != false) {
            JsonElement jsonElement2 = (JsonElement)m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)callSite2, (long)1960518312615896L);
            try {
                m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)((List)this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB), (Object)((m$$T2XaYQu1fNy5dZvhBzAvXseVmF5fNuCwGor41JWMtgmiwdtahScxMM7TT5PxvTwJr69EhB4hgZaQJaTnGjEOYr6QVwNu9e6T2)((Object)m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.d("\u00d4", (Object)m$$VqDc0eTAgzOPC4IU6WwZsiqEa0qk7QNmclpi6XPMtzLLBOqLUU9iWXMcrWVjw6jLdGlqrsVBwx7XuPXLTWk6HGDHuk8aGSTUx, (Object)jsonElement2, m$$T2XaYQu1fNy5dZvhBzAvXseVmF5fNuCwGor41JWMtgmiwdtahScxMM7TT5PxvTwJr69EhB4hgZaQJaTnGjEOYr6QVwNu9e6T2.class, (long)2019155889863035L))), (long)2580853851037366L);
            }
            catch (Exception exception) {}
        }
    }

    public static String m$$JSHWeSYSgHwcFcyg6bsqrrjYkv3Kl1ZxTdMrj31SwbZUL0AVSJzscATEgX3B1pxeuWJLoqJNwjIASxtbfuidKtwkVrMyJaEE0(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-75, -90, 125, 9, -39, 21, 61, 20, 40, 14};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 10]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    @Override
    public String getConfigName() {
        return m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.b(31461, -31996);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

