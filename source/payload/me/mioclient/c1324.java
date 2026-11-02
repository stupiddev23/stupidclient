/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

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
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$VsGnPlMiaRwU6egffgLPoztoFs9ltcxbqpmKM9tVWVAnOLc9RDaxZHNvjn5CEU4F9uYfzG3TwY6d1bvC06AbuPljluzwD2TnR;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm;
import me.mioclient.m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf;
import net.minecraft.class_151;

final class m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2
extends m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm {
    public static final String[] c;
    public static final String[] d;
    public static final long[] f;
    public static final Integer[] g;
    public static final Object[] j;
    public static final String[] k;

    public m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2(String string2) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.j = new Object[39];
                    m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.k = new String[39];
                    m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b();
                    var13 = new String[3];
                    var11_1 = 0;
                    var10_2 = "\u0006VYk\u00b5\u0003\u0013\u00c7\u00f8\u0005\u00b6\u00b8\u0086\u00c9\u00d8";
                    var12_3 = "\u0006VYk\u00b5\u0003\u0013\u00c7\u00f8\u0005\u00b6\u00b8\u0086\u00c9\u00d8".length();
                    var9_4 = 5;
                    var8_5 = -1;
lbl10:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block15;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 56;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl70
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 62;
                                    break;
                                }
                                case 1: {
                                    v11 = 27;
                                    break;
                                }
                                case 2: {
                                    v11 = 29;
                                    break;
                                }
                                case 3: {
                                    v11 = 115;
                                    break;
                                }
                                case 4: {
                                    v11 = 42;
                                    break;
                                }
                                case 5: {
                                    v11 = 45;
                                    break;
                                }
                                default: {
                                    v11 = 10;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
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
                    } while (v6 > var14_6);
                    ** while (true)
                }
                m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.c = var13;
                m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.d = new String[3];
                var0_7 = 7536276185472840321L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "z\u00f7b \u00f495\u0089\u009b\u00aa]/\u00f4B:U+\u00d5<\u008dz.\u00b1\u0083";
                var5_11 = "z\u00f7b \u00f495\u0089\u009b\u00aa]/\u00f4B:U+\u00d5<\u008dz.\u00b1\u0083".length();
                var2_12 = 0;
                while (true) {
                    break block16;
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    var6_8[v12] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block17;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v12 = var3_9++;
            ** while (true)
        }
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.f = var6_8;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.g = new Integer[3];
    }

    public static int e(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (k[n3] != null) {
            return n3;
        }
        Object object = j[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 48;
            case 1 -> 32;
            case 2 -> 11;
            case 3 -> 13;
            case 4 -> 53;
            case 5 -> 23;
            case 6 -> 31;
            case 7 -> 15;
            case 8 -> 50;
            case 9 -> 14;
            case 10 -> 6;
            case 11 -> 24;
            case 12 -> 59;
            case 13 -> 29;
            case 14 -> 20;
            case 15 -> 40;
            case 16 -> 43;
            case 17 -> 3;
            case 18 -> 55;
            case 19 -> 34;
            case 20 -> 37;
            case 21 -> 27;
            case 22 -> 54;
            case 23 -> 63;
            case 24 -> 28;
            case 25 -> 42;
            case 26 -> 38;
            case 27 -> 41;
            case 28 -> 22;
            case 29 -> 47;
            case 30 -> 62;
            case 31 -> 19;
            case 32 -> 30;
            case 33 -> 26;
            case 34 -> 2;
            case 35 -> 10;
            case 36 -> 44;
            case 37 -> 51;
            case 38 -> 60;
            case 39 -> 5;
            case 40 -> 25;
            case 41 -> 0;
            case 42 -> 39;
            case 43 -> 45;
            case 44 -> 1;
            case 45 -> 56;
            case 46 -> 57;
            case 47 -> 8;
            case 48 -> 4;
            case 49 -> 12;
            case 50 -> 61;
            case 51 -> 33;
            case 52 -> 35;
            case 53 -> 18;
            case 54 -> 52;
            case 55 -> 16;
            case 56 -> 58;
            case 57 -> 17;
            case 58 -> 46;
            case 59 -> 49;
            case 60 -> 7;
            case 61 -> 21;
            case 62 -> 36;
            default -> 9;
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
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.k[n3] = new String(cArray);
        return n3;
    }

    public static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFCF29) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = c[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 113;
                case 1 -> 126;
                case 2 -> 206;
                case 3 -> 151;
                case 4 -> 105;
                case 5 -> 189;
                case 6 -> 101;
                case 7 -> 125;
                case 8 -> 66;
                case 9 -> 123;
                case 10 -> 110;
                case 11 -> 38;
                case 12 -> 196;
                case 13 -> 186;
                case 14 -> 246;
                case 15 -> 187;
                case 16 -> 158;
                case 17 -> 134;
                case 18 -> 2;
                case 19 -> 207;
                case 20 -> 72;
                case 21 -> 135;
                case 22 -> 29;
                case 23 -> 28;
                case 24 -> 156;
                case 25 -> 104;
                case 26 -> 143;
                case 27 -> 54;
                case 28 -> 162;
                case 29 -> 4;
                case 30 -> 159;
                case 31 -> 251;
                case 32 -> 198;
                case 33 -> 229;
                case 34 -> 48;
                case 35 -> 180;
                case 36 -> 69;
                case 37 -> 130;
                case 38 -> 224;
                case 39 -> 44;
                case 40 -> 150;
                case 41 -> 86;
                case 42 -> 227;
                case 43 -> 153;
                case 44 -> 1;
                case 45 -> 35;
                case 46 -> 209;
                case 47 -> 182;
                case 48 -> 50;
                case 49 -> 197;
                case 50 -> 22;
                case 51 -> 161;
                case 52 -> 65;
                case 53 -> 154;
                case 54 -> 234;
                case 55 -> 77;
                case 56 -> 13;
                case 57 -> 71;
                case 58 -> 42;
                case 59 -> 16;
                case 60 -> 202;
                case 61 -> 210;
                case 62 -> 7;
                case 63 -> 62;
                case 64 -> 36;
                case 65 -> 230;
                case 66 -> 217;
                case 67 -> 127;
                case 68 -> 30;
                case 69 -> 252;
                case 70 -> 106;
                case 71 -> 226;
                case 72 -> 52;
                case 73 -> 194;
                case 74 -> 245;
                case 75 -> 80;
                case 76 -> 3;
                case 77 -> 164;
                case 78 -> 117;
                case 79 -> 205;
                case 80 -> 99;
                case 81 -> 9;
                case 82 -> 155;
                case 83 -> 228;
                case 84 -> 45;
                case 85 -> 241;
                case 86 -> 0;
                case 87 -> 139;
                case 88 -> 83;
                case 89 -> 41;
                case 90 -> 116;
                case 91 -> 174;
                case 92 -> 163;
                case 93 -> 188;
                case 94 -> 203;
                case 95 -> 39;
                case 96 -> 131;
                case 97 -> 192;
                case 98 -> 124;
                case 99 -> 255;
                case 100 -> 129;
                case 101 -> 200;
                case 102 -> 81;
                case 103 -> 98;
                case 104 -> 92;
                case 105 -> 34;
                case 106 -> 46;
                case 107 -> 74;
                case 108 -> 75;
                case 109 -> 195;
                case 110 -> 89;
                case 111 -> 14;
                case 112 -> 70;
                case 113 -> 231;
                case 114 -> 18;
                case 115 -> 177;
                case 116 -> 250;
                case 117 -> 183;
                case 118 -> 235;
                case 119 -> 172;
                case 120 -> 225;
                case 121 -> 57;
                case 122 -> 221;
                case 123 -> 78;
                case 124 -> 253;
                case 125 -> 236;
                case 126 -> 84;
                case 127 -> 211;
                case 128 -> 199;
                case 129 -> 233;
                case 130 -> 165;
                case 131 -> 223;
                case 132 -> 119;
                case 133 -> 73;
                case 134 -> 213;
                case 135 -> 120;
                case 136 -> 239;
                case 137 -> 157;
                case 138 -> 237;
                case 139 -> 102;
                case 140 -> 88;
                case 141 -> 93;
                case 142 -> 240;
                case 143 -> 95;
                case 144 -> 12;
                case 145 -> 27;
                case 146 -> 26;
                case 147 -> 58;
                case 148 -> 33;
                case 149 -> 108;
                case 150 -> 68;
                case 151 -> 179;
                case 152 -> 191;
                case 153 -> 243;
                case 154 -> 51;
                case 155 -> 144;
                case 156 -> 148;
                case 157 -> 145;
                case 158 -> 170;
                case 159 -> 79;
                case 160 -> 96;
                case 161 -> 85;
                case 162 -> 31;
                case 163 -> 20;
                case 164 -> 166;
                case 165 -> 204;
                case 166 -> 185;
                case 167 -> 76;
                case 168 -> 64;
                case 169 -> 201;
                case 170 -> 178;
                case 171 -> 11;
                case 172 -> 6;
                case 173 -> 214;
                case 174 -> 171;
                case 175 -> 168;
                case 176 -> 10;
                case 177 -> 146;
                case 178 -> 248;
                case 179 -> 17;
                case 180 -> 181;
                case 181 -> 109;
                case 182 -> 140;
                case 183 -> 147;
                case 184 -> 128;
                case 185 -> 53;
                case 186 -> 114;
                case 187 -> 142;
                case 188 -> 47;
                case 189 -> 238;
                case 190 -> 218;
                case 191 -> 5;
                case 192 -> 55;
                case 193 -> 160;
                case 194 -> 190;
                case 195 -> 254;
                case 196 -> 149;
                case 197 -> 21;
                case 198 -> 219;
                case 199 -> 97;
                case 200 -> 167;
                case 201 -> 32;
                case 202 -> 133;
                case 203 -> 249;
                case 204 -> 193;
                case 205 -> 8;
                case 206 -> 121;
                case 207 -> 115;
                case 208 -> 40;
                case 209 -> 132;
                case 210 -> 67;
                case 211 -> 141;
                case 212 -> 23;
                case 213 -> 138;
                case 214 -> 56;
                case 215 -> 112;
                case 216 -> 25;
                case 217 -> 94;
                case 218 -> 122;
                case 219 -> 19;
                case 220 -> 169;
                case 221 -> 43;
                case 222 -> 15;
                case 223 -> 215;
                case 224 -> 173;
                case 225 -> 247;
                case 226 -> 37;
                case 227 -> 87;
                case 228 -> 175;
                case 229 -> 63;
                case 230 -> 244;
                case 231 -> 24;
                case 232 -> 103;
                case 233 -> 82;
                case 234 -> 176;
                case 235 -> 111;
                case 236 -> 216;
                case 237 -> 242;
                case 238 -> 184;
                case 239 -> 222;
                case 240 -> 91;
                case 241 -> 60;
                case 242 -> 90;
                case 243 -> 212;
                case 244 -> 118;
                case 245 -> 136;
                case 246 -> 208;
                case 247 -> 232;
                case 248 -> 59;
                case 249 -> 107;
                case 250 -> 100;
                case 251 -> 152;
                case 252 -> 49;
                case 253 -> 61;
                case 254 -> 137;
                default -> 220;
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
            m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'D' || c == '\u00f2' || c == 'b' || c == '\u00ea') {
                field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'D' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'C' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'a' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void b() {
        Object[] objectArray = j;
        j[0] = "^V0h(cR^1#akNV3h\u0005\u007fRW\u0018**aXW)";
        objectArray[1] = "&8E\t\b%*0DBA-68F\t%9*9gE\u0005/&#";
        objectArray[2] = "V,\"#/mX%e+(v\u0015$(j1VO&8\u0018~H\b\u0004z\b4Emqz\u001f6fx\b4('iP8e\r\u007fQp\u000bJ%\u0010z_+I\u0018?Ol(o74Aa+V}/fR$9\f)lu1K\u001c#i\u0002\nF+\u0011Xjza\u0002\u0010cm.E\u0005\u0017`j{>\u000btuM\u0000y7 ";
        objectArray[3] = Integer.TYPE;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.k[3] = "java/lang/Integer";
        objectArray[4] = Void.TYPE;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.k[4] = "java/lang/Void";
        objectArray[5] = "}@D\u0002F\rvOUM;\u0015eH\\\u0004";
        objectArray[6] = "q\\\u00074\u0004szS\u0016{djv_\u0014'";
        objectArray[7] = "2|7EG\u001e,t-\n \u001f=o P\u0006\u0019";
        objectArray[8] = Boolean.TYPE;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.k[8] = "java/lang/Boolean";
        objectArray[9] = "\"\u001fRqa<,\u0016\u0015yf'a\u0017X8R<:\u0013)Zc+~\u0002\u0004zx\u0011\f\f)K@g\u0000\u001e$~;\"5KJso7\u001b78xe`{\u0010.xD\u001c'\b\u001eH[+\u0015 \byi\u0017\u001f\u000fMTpey )ir6\u000b\u000b7^O)-.,dAa\u0001;\u001fne)y31ZY$\u001e\u000e\u001d[E";
        objectArray[10] = "j-o4-3d$(<*()%e}\u0011\u0011}\u001d#-7e2\u0002*\u0017\u0017$e \u0016\n0\n?\r%k-\u001ea~9\u0001 4d\u0005\u000b  (D}\u0007#\"\u0005}+\u0014\u0017'\u0015N\u0000\u0003\u0012+\u0011w\u0011#>.=~\u0002x*q0m=\u0016\u0003\u0001\u001eM\u0001\u0006j\u0007\u0018E,\u000fa\u0017?4\u0002w\u001e&85q. <";
        objectArray[11] = "\u0014BR/\u0016B\u001aK\u0015'\u0011YWJXfFd1B\u0014\t\u0018_\u0017`O\u0011Ha:pH7\fh8L\t\u0004%\u001bOJJ/M\u001e\u001c\u0010\u0018\u0018\u001cH=n\u0004\u000b&\u001c\u0010F8\u0013&T)\u0016\t\u0016\fB/\u001f\u0013z\u001ey@@2/8\u001f<e$rK^\t\u0017+'Ib1o\u0012\u0014&\u0014\u000ec\u001dp\u0018N\u001eP*25";
        objectArray[12] = "rDF\rcElL\\B\u000e_tIU\u000f9YwK";
        objectArray[13] = "\nJ;tl)\u0004C||k2IB1=P\u000b\u001dzwmv\u007fRe~WV>\u0005GBJq\u0010_jq+l\u0004\u0001\u0019mAa.\u0004b_`a2$\u001aScc\u001f\u001dL@Wf\u000f.gWRj\u000b\u0017vw~o'\u001ee,j0*\rZBC@\u0004-fR*F\u0002%K[!V%Te#^g\"U\u0016z`}b\n\u000b1cp?\u0000jM*W? [&Oi70\u001c-wm+\u0010\u0017AZr'\u0016\u001eW|l\t\u001ecT*op?nwo]\u000f\bJV*Kt?\u0017bL=*\u0003ILj5,QEb~7\u0012\r]t*I\u001e\u0002\u0018bL_\n\"jtct5QAV)]~0\u0016S!";
        objectArray[14] = "\u0002=,^\"\f\t2=\u0011E\u000e\u001c9=Z~";
        objectArray[15] = "_\u0004O\u0011\u0010hT\u000b^^qf_\u0000Z\u0004";
        objectArray[16] = "w\u00001E\u001d*|\u000f \nq)r\r\"E]";
        objectArray[17] = "gmw[phid0Sws$e}\u0012o7F}\u001fEnAAY\n\\AsGK\u001eBkF\\YapL6g[jAV`iI\u0014XKQ\\:=U.ryO\u001e\u000fhWRY.cz`gBiyhuor!_!`NX=rHsEn\u0017uVlxE\u001cRIOHc\u001fdM?Zk2Xt";
        objectArray[18] = "Ilq\u00181=WdkWS!Py";
        objectArray[19] = "?\u0002,\u0010\u0005K(\u001esj\u000b\u0018!!1\r\u001a\u00197\u0005:jY\u000f*\u0003{\u0011[\u0011 IKV\r\u0005<E7RR\u001a}ypU\u0006\u0016)\u00069P\u0002\u0019M";
        objectArray[20] = "\"pD#kr|cX+Z+w{p-*7\u001e=D 9\"rnX0:K";
        objectArray[21] = "R\u00105\u0016j\u001b\u0014\u000f8\u0012U\u001b\u0001\u0011\u001f\u0002$\u001e\r\u000b0ojD\rV?\u000e/\t\u0003T\\";
        objectArray[22] = "\"~&-J#5byWDp<\u0005z,Jf`~x2@,Po<9Ke2g/9-'oa#3Rnje,W";
        objectArray[23] = "wN\u001dC='\u007f]\u001d%+(az\bg?\"{t\u0019G).a3\u0001^#?z\f\u0016B|E";
        objectArray[24] = "X\u001d'sE\u0012\u000b\u000e.a}\u0013\n\u0013\u001dr\u0012\u001d\u001c\u0013=n}L\u001f\u0013#}\u0014\u001b\u001c\u0014*\u001f";
        objectArray[25] = "\u0013jG\u0004q\u000e\u0011tMNA\tOUG\u0001,\u000fcx[\u0013ANSvZN:LM|\u0010~";
        objectArray[26] = "<LE.\u0016Dy\u0001K,u@/P\u001a{7w{MFy3i_Dgw$I`Dnr\u0010zjCE)'tc\u0019B_(Zq\u000e|e\u001a{r=VP7DMBGs\u0005^y1Yy\u0018N`$}e%X|%xz\bze\u0005hi\to|\u0018cW)`AF|k0HlCVk:\u007ffC}\u0015DHb\u001c\\*L\u001ae@$";
        objectArray[27] = "_\u0007C;|\u001c\u0017\u0015\u0012+\u0007\u0004\u0007\u001dW?@\u0014nCNoz\u000bS\u0017R9fz_\u0007C;|\u001c\u0017\u0015\u0012+\u0007";
        objectArray[28] = "U\u00121sm\u001e\u0010_?q\u000e\u001aF\u000e\n\u000eu\u00055Y,w\u007f6)g\u0001\u000bq\u0007:s2*t.!lo\u0002R4P\u001do\u0017`<WI\u001f\u00156\u0007[[\u001a:E\u0007Vp\u001dwc\rR\u0018\nvd\u0006SF)00\u0001$a\u001e,g\u0012\t\u0012h\u0018E?;N\u0012vB5-m\u0015\u0016t\u001e\rP*)1\u0001\u001b{\u001fH4\u001bW_!u`\u0007\u0001CPrjB\u0017Sm&v\u0014\u000b\"";
        objectArray[29] = "20\u0011+Q\u0019t/\u001c/n\u0019a135\b\u0018m\">;\u000b\u001b\fv\u00035\u0014Fwt\u001d?^v";
        objectArray[30] = "\u001f~\u0013'\u0019\u001bAm\u000f/(DN~\u001dDACEq\u0010xAML7a";
        objectArray[31] = "kA9(\"Km\u0000c}]Ph\u0019}.\u001a@\u0001@r#>Gm\u0013n3=.kA9(\"Km\u0000c}]";
        objectArray[32] = "MIrfy\u0014\u000e\u0003%?\u0017KX\u001f~\u0005^\u007fNI$4TT6wr\u0011-\u0011(r/\u0001[\u007f\u0012|V</~Eb. eS\u0006~smI\u00124~/3]~\u001drF$RO8J$\u0014)L0yV2hmK\rOgKN6rreVn4L|gie+qXlzc\u0015Ux\u0005/B;aY]eU\u0013IxbrIL3%9*S\u0005\u000eq%|Ot\b 9uJ\u000bA%=z.";
        objectArray[33] = "\u0005cGu\u000bX@.Iwh\\\u0016\u007f\u001e'VBS/|%6\\T2t1\u0001_^k|!\u001aR\u007f\u0018Lv\u0005CZ\u0001|\u00038\u0002F\u0010])\u0002\u0007j\u001e\u001f\u0002T`y\u0016MpX}G\u000b_>0UZ8X\u0017\u0019\\|o\u001d\u007f\tSZ\u001dy3$Zq\u0010\u001a#\u001aWB\u0011\\\u0010)Zu\u0017O\u00017D]\u000f_NR]\u0007.Ws\u0006AQ2&s\u001aYY:J \u0006IZS";
        objectArray[34] = "n\u001e]R Yy\u0002\u0002(.\np=@O?\u000bf\u0019K(|\u001d{\u001f\nS~\u0003qU:B{_w\u001a_D:\u0005\"e\u0001\u0017#\u0004x\u001aH\u0012'\u000b\u001c";
        objectArray[35] = "(+\u001e.\u00018<+Ojmgom~*RX9{D|\u000fX($~[S[#\u0019QB\u0016f\u0013\u0007d\\\u0010l<=fs\"@\fq\u007f@\u0006b\u0002\u000fq{2r'zCW\rEy\u0010qh\u0016K8\u0007jL,k\u0019\nJt\u0012S\u001c<BT<m\u001c-\u001do \u007f|\u007fe~\u0010B$\u0003om&fy\u0001@\u0012\u001fy$;D-\be{A\u0018-\t`'>Q(\roC";
        objectArray[36] = "\u0003I\u000e?\"n\u0014UQE,=\u001dj\u0013\"=<\u000bN\u0018E~*\u0016HY>|4\u001c\u0002i~>6\u000b\u0002\u0012| <A2Rz!3\u0015M\u001b\u007f%<q";
        objectArray[37] = "uSg\u001c'l}\u0001`@_5-[k|d(#D6\u0007f6)\u000e\u0006";
        Object[] objectArray2 = objectArray;
        objectArray[38] = "\u0005[h^\n\u001e\bGj\u00104A\u0012H|EHG\u0014%:\\FC_\u001cdOZKn";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static class_151 b(class_151 class_1512) {
        return class_1512;
    }

    public static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Method h(long l) {
        int n = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.e(l);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.f(1068253640883649L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.f(1068253640883649L);
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

    public static Class f(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.e(l);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2D49;
        if (g[n2] == null) {
            m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.g[n2] = (int)(f[n2] ^ l);
        }
        return g[n2];
    }

    public static Field g(long l) {
        int n = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.e(l);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.c(clazz3, string2, clazz2)) != null) {
                    m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.f(1068253640883649L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public JsonElement toJson() {
        JsonObject jsonObject = new JsonObject();
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)this, (Object)jsonObject, (long)2479839652004651L);
        CallSite callSite = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)((List)((Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$pjpeQua4PAB6Zbpcv5B1EK6PACkuUkszPZ6igJ4EheKtCpGOS5rhssN6LeWpAJuyJeZRtolTY1xU3jouBuH7hlh4UdEG0zCIQ, (long)1693765415586452L))), (long)2713579210894017L);
        while (m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)callSite, (long)1445048962941557L) != false) {
            m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM = (m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM)((Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)callSite, (long)2171655256353890L));
            try {
                if (m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM instanceof m$$VsGnPlMiaRwU6egffgLPoztoFs9ltcxbqpmKM9tVWVAnOLc9RDaxZHNvjn5CEU4F9uYfzG3TwY6d1bvC06AbuPljluzwD2TnR) {
                    continue;
                }
            }
            catch (class_151 class_1512) {
                throw m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b(class_1512);
            }
            JsonObject jsonObject2 = new JsonObject();
            m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)jsonObject2, (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b(-12504, 2053), (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("a", (int)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM, (long)1485708828782719L), (int)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.a(3699, 2088859938143281978L), (long)2022913189744399L), (long)1961358673039879L), (long)1361986654649870L);
            m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)jsonObject2, (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b(-12503, 29412), (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM, (long)1485708828782719L), (long)1831001085889995L), (long)2612572111685394L), (long)1824044639650747L), (long)2555836775346800L);
            m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)jsonObject2, (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b(-12501, -281), (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("a", (boolean)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM, (long)1485708828782719L), (int)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.a(20567, 87896449929116959L), (long)2382678938437600L), (long)2234790702263853L), (long)2459501601631222L);
            m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)jsonObject, (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM, (long)2063774760386713L), (Object)jsonObject2, (long)1590722091799188L);
        }
        return jsonObject;
    }

    @Override
    public void fromJson(JsonElement jsonElement) {
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.m$$urlp8zak6sgmAMc2ctdG4dOGVUBLKZb1qa9MIVhqvjZ7Q3xeQUIgIWVAximw2eGIdLS0emhil4NhaPxSYaeaypqZndM8Ic2go, (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.b("C", (Object)jsonElement, (long)1656411427291911L), (int)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.a(18839, 1372507433746359516L), (long)2257184477765574L);
        super.fromJson(jsonElement);
    }

    public static String m$$ZN6DBNkHHHU8VYYpDgpglhwbyASZUKC6PtGkhB4HfmWtN5lAyajpRonZBOn4cHCzmVYuVnxjAuNwxKP7M160eJgRWIkGHdeW0(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{67, 114, -26, -105, 64, 73, 13, -124};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 8]);
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
            return MethodHandles.lookup().findStatic(m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

