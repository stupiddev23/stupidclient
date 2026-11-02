/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import com.google.gson.JsonArray;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import me.mioclient.m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_151;

final class m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1
extends m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU {
    public static final String[] a;
    public static final String[] b;
    public static final Object[] e;
    public static final String[] f;

    public m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1(String string2) {
    }

    @Override
    public List m$$tYPCqVTEwMHSL5qKxLiYhldokGzlMNeiNGBEB1zIT52A6PRFVcAOnt31hzq5jJFpcXnfmstTgVcRfzXy3WjSOcGi4CsN2w8sJ() {
        File file;
        block11: {
            CallSite callSite = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00f5", m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.a(12055, -15106), (long)1623060626487423L);
            if (m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", (Object)callSite, (Object)File.separator, (long)1785132145330412L) == false) {
                callSite = (String)((Object)callSite) + File.separator;
            }
            callSite = (String)((Object)callSite) + (String)((Object)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.a(12052, -15962), (Object)new Object[]{File.separator}, (long)1295251707014313L));
            file = new File((String)((Object)callSite));
            try {
                try {
                    if (m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", (Object)file, (long)2015197704856676L) != false && m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", (Object)file, (long)2119199727021126L) != false) break block11;
                }
                catch (class_151 class_1512) {
                    throw m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.a(class_1512);
                }
                throw new FileNotFoundException();
            }
            catch (class_151 class_1513) {
                throw m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.a(class_1513);
            }
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        CallSite callSite = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", (Object)fileInputStream, (long)1968557973544928L);
        try {
            m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", (Object)fileInputStream, (long)1224704985549281L);
            if (((CallSite)callSite).length == 0) {
                return m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00f5", (long)1555634355068235L);
            }
        }
        catch (class_151 class_1514) {
            throw m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.a(class_1514);
        }
        ArrayList arrayList = new ArrayList();
        JsonArray jsonArray = (JsonArray)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$VqDc0eTAgzOPC4IU6WwZsiqEa0qk7QNmclpi6XPMtzLLBOqLUU9iWXMcrWVjw6jLdGlqrsVBwx7XuPXLTWk6HGDHuk8aGSTUx, (Object)new String((byte[])callSite, StandardCharsets.UTF_8), JsonArray.class, (long)2277293662783274L);
        for (int i = 0; i < m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", (Object)jsonArray, (long)2062575736785607L); ++i) {
            CallSite callSite2 = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", (Object)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", (Object)jsonArray, (int)i, (long)1754702166179222L), (long)1379620181788938L);
            if (m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", (Object)callSite2, (Object)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.a(12054, 18479), (long)2205940278798788L) == false) continue;
            CallSite callSite3 = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", (Object)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", (Object)callSite2, (Object)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.a(12053, 15842), (long)1890589094477904L), (long)1521368328646011L);
            try {
                if (m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", arrayList, (Object)callSite3, (long)1475811502404797L) != false) continue;
                m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b("\u00e5", arrayList, (Object)callSite3, (long)2372860305989427L);
                continue;
            }
            catch (class_151 class_1515) {
                throw m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.a(class_1515);
            }
        }
        return arrayList;
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.e = new Object[34];
                m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.f = new String[34];
                m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b();
                var5 = new String[4];
                var3_1 = 0;
                var2_2 = "d\u00e7\u00f8A[\u008c0i\u0099\u00cc\u00e3\fLn\u001bs\u009a\u00e5\u00d7\u00d5\f@\u00dcE\u00d1N\u008d\u0005w1\u00e3\u001d\u00f2";
                var4_3 = "d\u00e7\u00f8A[\u008c0i\u0099\u00cc\u00e3\fLn\u001bs\u009a\u00e5\u00d7\u00d5\f@\u00dcE\u00d1N\u008d\u0005w1\u00e3\u001d\u00f2".length();
                var1_4 = 20;
                var0_5 = -1;
lbl10:
                // 2 sources

                while (true) {
                    v0 = 71;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u00c4\u00ec\u00a7\u00a5`q\u00b2\u009a\u00b5,\u00ffy\t\u00d8MY\u00a7r\u00c8\u00fa!\u00b2";
                    var4_3 = "\u00c4\u00ec\u00a7\u00a5`q\u00b2\u009a\u00b5,\u00ffy\t\u00d8MY\u00a7r\u00c8\u00fa!\u00b2".length();
                    var1_4 = 12;
                    var0_5 = -1;
lbl25:
                    // 2 sources

                    while (true) {
                        v0 = 30;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl31:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl88
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 2;
                            break;
                        }
                        case 1: {
                            v15 = 87;
                            break;
                        }
                        case 2: {
                            v15 = 97;
                            break;
                        }
                        case 3: {
                            v15 = 86;
                            break;
                        }
                        case 4: {
                            v15 = 79;
                            break;
                        }
                        case 5: {
                            v15 = 127;
                            break;
                        }
                        default: {
                            v15 = 4;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.a = var5;
        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b = new String[4];
    }

    public static String a(int n, int n2) {
        int n3 = (n ^ 0x2F14) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 107;
                case 1 -> 65;
                case 2 -> 115;
                case 3 -> 126;
                case 4 -> 231;
                case 5 -> 127;
                case 6 -> 130;
                case 7 -> 223;
                case 8 -> 27;
                case 9 -> 89;
                case 10 -> 169;
                case 11 -> 190;
                case 12 -> 248;
                case 13 -> 137;
                case 14 -> 225;
                case 15 -> 78;
                case 16 -> 163;
                case 17 -> 222;
                case 18 -> 226;
                case 19 -> 47;
                case 20 -> 143;
                case 21 -> 73;
                case 22 -> 171;
                case 23 -> 194;
                case 24 -> 16;
                case 25 -> 211;
                case 26 -> 193;
                case 27 -> 68;
                case 28 -> 43;
                case 29 -> 13;
                case 30 -> 131;
                case 31 -> 94;
                case 32 -> 200;
                case 33 -> 63;
                case 34 -> 234;
                case 35 -> 74;
                case 36 -> 165;
                case 37 -> 114;
                case 38 -> 184;
                case 39 -> 32;
                case 40 -> 174;
                case 41 -> 35;
                case 42 -> 125;
                case 43 -> 245;
                case 44 -> 99;
                case 45 -> 95;
                case 46 -> 136;
                case 47 -> 98;
                case 48 -> 230;
                case 49 -> 9;
                case 50 -> 252;
                case 51 -> 153;
                case 52 -> 3;
                case 53 -> 134;
                case 54 -> 117;
                case 55 -> 66;
                case 56 -> 187;
                case 57 -> 23;
                case 58 -> 53;
                case 59 -> 145;
                case 60 -> 208;
                case 61 -> 37;
                case 62 -> 80;
                case 63 -> 205;
                case 64 -> 48;
                case 65 -> 42;
                case 66 -> 168;
                case 67 -> 178;
                case 68 -> 19;
                case 69 -> 18;
                case 70 -> 224;
                case 71 -> 185;
                case 72 -> 88;
                case 73 -> 7;
                case 74 -> 180;
                case 75 -> 129;
                case 76 -> 236;
                case 77 -> 128;
                case 78 -> 62;
                case 79 -> 105;
                case 80 -> 210;
                case 81 -> 214;
                case 82 -> 93;
                case 83 -> 34;
                case 84 -> 139;
                case 85 -> 232;
                case 86 -> 87;
                case 87 -> 20;
                case 88 -> 60;
                case 89 -> 219;
                case 90 -> 61;
                case 91 -> 133;
                case 92 -> 189;
                case 93 -> 175;
                case 94 -> 104;
                case 95 -> 109;
                case 96 -> 121;
                case 97 -> 41;
                case 98 -> 148;
                case 99 -> 182;
                case 100 -> 81;
                case 101 -> 173;
                case 102 -> 92;
                case 103 -> 209;
                case 104 -> 2;
                case 105 -> 112;
                case 106 -> 1;
                case 107 -> 150;
                case 108 -> 120;
                case 109 -> 159;
                case 110 -> 239;
                case 111 -> 181;
                case 112 -> 56;
                case 113 -> 164;
                case 114 -> 36;
                case 115 -> 207;
                case 116 -> 33;
                case 117 -> 72;
                case 118 -> 38;
                case 119 -> 172;
                case 120 -> 195;
                case 121 -> 75;
                case 122 -> 146;
                case 123 -> 144;
                case 124 -> 40;
                case 125 -> 39;
                case 126 -> 22;
                case 127 -> 123;
                case 128 -> 240;
                case 129 -> 177;
                case 130 -> 215;
                case 131 -> 29;
                case 132 -> 186;
                case 133 -> 108;
                case 134 -> 71;
                case 135 -> 213;
                case 136 -> 83;
                case 137 -> 12;
                case 138 -> 90;
                case 139 -> 238;
                case 140 -> 227;
                case 141 -> 70;
                case 142 -> 199;
                case 143 -> 25;
                case 144 -> 243;
                case 145 -> 242;
                case 146 -> 110;
                case 147 -> 218;
                case 148 -> 147;
                case 149 -> 67;
                case 150 -> 15;
                case 151 -> 220;
                case 152 -> 255;
                case 153 -> 84;
                case 154 -> 161;
                case 155 -> 160;
                case 156 -> 183;
                case 157 -> 244;
                case 158 -> 8;
                case 159 -> 235;
                case 160 -> 247;
                case 161 -> 212;
                case 162 -> 54;
                case 163 -> 11;
                case 164 -> 140;
                case 165 -> 204;
                case 166 -> 28;
                case 167 -> 151;
                case 168 -> 157;
                case 169 -> 52;
                case 170 -> 31;
                case 171 -> 5;
                case 172 -> 158;
                case 173 -> 250;
                case 174 -> 118;
                case 175 -> 149;
                case 176 -> 101;
                case 177 -> 228;
                case 178 -> 156;
                case 179 -> 203;
                case 180 -> 246;
                case 181 -> 154;
                case 182 -> 100;
                case 183 -> 191;
                case 184 -> 179;
                case 185 -> 249;
                case 186 -> 46;
                case 187 -> 254;
                case 188 -> 217;
                case 189 -> 206;
                case 190 -> 192;
                case 191 -> 233;
                case 192 -> 79;
                case 193 -> 49;
                case 194 -> 166;
                case 195 -> 14;
                case 196 -> 77;
                case 197 -> 196;
                case 198 -> 124;
                case 199 -> 197;
                case 200 -> 176;
                case 201 -> 237;
                case 202 -> 152;
                case 203 -> 51;
                case 204 -> 10;
                case 205 -> 59;
                case 206 -> 188;
                case 207 -> 253;
                case 208 -> 103;
                case 209 -> 229;
                case 210 -> 86;
                case 211 -> 57;
                case 212 -> 0;
                case 213 -> 155;
                case 214 -> 21;
                case 215 -> 111;
                case 216 -> 113;
                case 217 -> 221;
                case 218 -> 241;
                case 219 -> 58;
                case 220 -> 50;
                case 221 -> 30;
                case 222 -> 69;
                case 223 -> 202;
                case 224 -> 102;
                case 225 -> 106;
                case 226 -> 17;
                case 227 -> 4;
                case 228 -> 6;
                case 229 -> 132;
                case 230 -> 141;
                case 231 -> 216;
                case 232 -> 45;
                case 233 -> 26;
                case 234 -> 82;
                case 235 -> 44;
                case 236 -> 201;
                case 237 -> 170;
                case 238 -> 142;
                case 239 -> 64;
                case 240 -> 91;
                case 241 -> 135;
                case 242 -> 96;
                case 243 -> 251;
                case 244 -> 119;
                case 245 -> 97;
                case 246 -> 198;
                case 247 -> 162;
                case 248 -> 76;
                case 249 -> 116;
                case 250 -> 167;
                case 251 -> 24;
                case 252 -> 138;
                case 253 -> 55;
                case 254 -> 85;
                default -> 122;
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
            m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    public static int e(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 9;
            case 1 -> 62;
            case 2 -> 22;
            case 3 -> 7;
            case 4 -> 37;
            case 5 -> 35;
            case 6 -> 39;
            case 7 -> 60;
            case 8 -> 26;
            case 9 -> 55;
            case 10 -> 53;
            case 11 -> 58;
            case 12 -> 5;
            case 13 -> 45;
            case 14 -> 50;
            case 15 -> 15;
            case 16 -> 14;
            case 17 -> 38;
            case 18 -> 47;
            case 19 -> 27;
            case 20 -> 40;
            case 21 -> 1;
            case 22 -> 48;
            case 23 -> 49;
            case 24 -> 18;
            case 25 -> 0;
            case 26 -> 21;
            case 27 -> 19;
            case 28 -> 52;
            case 29 -> 29;
            case 30 -> 31;
            case 31 -> 56;
            case 32 -> 23;
            case 33 -> 16;
            case 34 -> 25;
            case 35 -> 12;
            case 36 -> 41;
            case 37 -> 61;
            case 38 -> 59;
            case 39 -> 43;
            case 40 -> 24;
            case 41 -> 3;
            case 42 -> 8;
            case 43 -> 6;
            case 44 -> 57;
            case 45 -> 4;
            case 46 -> 28;
            case 47 -> 36;
            case 48 -> 32;
            case 49 -> 51;
            case 50 -> 42;
            case 51 -> 13;
            case 52 -> 17;
            case 53 -> 44;
            case 54 -> 54;
            case 55 -> 20;
            case 56 -> 63;
            case 57 -> 34;
            case 58 -> 11;
            case 59 -> 2;
            case 60 -> 10;
            case 61 -> 33;
            case 62 -> 30;
            default -> 46;
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
        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.f[n3] = new String(cArray);
        return n3;
    }

    public static void b() {
        Object[] objectArray = e;
        e[0] = "U\u0011^\u0012n;P^n\u001a,7v\u001eX\u00064\u0001K\u0002M\u0012-";
        objectArray[1] = Void.TYPE;
        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.f[1] = "java/lang/Void";
        objectArray[2] = "N,3-+?E#\"bV'V$++";
        objectArray[3] = "\u0001\u0002WW\u0013\u0013t\"\\X\u0002\\\u0015,WS\u0006\u0006a";
        objectArray[4] = "i\u001a}[sie\u0012|\u0010:ay\u001a~[^ue\u001bU\u0019qko\u001bd";
        objectArray[5] = "\u0000s.\u0007q#\f{/L8+\u0010s-\u0007\\?\fr\fK|)\u0000h";
        objectArray[6] = "\u0015\u0019u\u00032@\u000b\u0011oLP\\\f\f";
        objectArray[7] = "EJ^\u001b\u0005tNEOTdzENK\u000e";
        objectArray[8] = Boolean.TYPE;
        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.f[8] = "java/lang/Boolean";
        objectArray[9] = "t\b,x1Oj\u000067\\Ur\u0005?zkSq\u0007)";
        objectArray[10] = "U\u001f\u0000\"\u0016)^\u0010\u0011mk<L\n\u0013.";
        objectArray[11] = "\n{\u000fLSQ\u0006s\u000e\u0007\u001aY\u001a{\fL~M\u0006z#\u0010F_\u0010";
        objectArray[12] = Integer.TYPE;
        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.f[12] = "java/lang/Integer";
        objectArray[13] = "\u007f\u0002";
        objectArray[14] = "\u0005\u0013\u0004\u0018Z4\u0000\\4\u0010\u00188";
        objectArray[15] = "xh\u001a@9\u001dt`\u001b\u000bp\u0015hh\u0019@\u0019\u0001ti";
        objectArray[16] = "?Y4p \u00064V%?M\u00064K1";
        objectArray[17] = "jqv#\u001a^}qpA\u0000]dnyAR\u0002<i)&\u000eYhy\u0014";
        objectArray[18] = "4Qebg\u0007\u007fBn\"\u0016\bj[y4j\u001a`M\u001cg\u007f\nkJy,m\u0004k!%-oY|@n>d\u0019\r";
        objectArray[19] = "\u0004\f[{\u0002\u0011\\\u000e\u0002#x\u000fS\u000fu<:\u001bY\u0015{-\u001a\rU\u000f<|\u001bZ\u000fO^!I\u0001Ls";
        objectArray[20] = "\fdv7\"]I$p1RMW=g<3@K[&>9]Qgq3;\u001c0e -6_V`x7o&";
        objectArray[21] = "G%9\u0000(\u0002\u001f'`XR\u001c\u0010&\u0017G\t\u000f\u0007;8SRJ\r#aM3\u0001\u001e(!<";
        objectArray[22] = "|\u0002V\u001b\u0013\u000b~\u0001XJ\"^'\u0015M\u0000fR9\u00111M\u001d^ \u001dJ\b]X&m";
        objectArray[23] = "eG<^^.?\u001f/\u001f5+7\u0005\u001d[R<7\u00039P5}*\u0000zPT69\u000b:!\f4#F4@G'(\u0006E";
        objectArray[24] = "r',t:\u0014x!~zA\u0003/`@:.\u001d$mqx\"\u0013'\u001czu&P8m\"w\u007f\bB";
        objectArray[25] = "@nK/i\u0002\u000b}@o\u0018\u000e\u001frIOy\u001f\u0019\u001e\u000b`a\\\b\u007f@sj\u001cy \th|\u001a\u001f%Qr%c";
        objectArray[26] = "XF%7H&\u0005\u0014~tt+\u000eY\u001f?\u0004=\\T~t\u00176\u001c%%y\u0013x\u0019T}{J c";
        objectArray[27] = "\u007fw-*h]hw+HcW\u007f\u007f\u0006,}pgo\"3\u0019\u000b.m3$z\u000bthrH";
        objectArray[28] = "]=7FzZ\u0005twB\u001bJ\u001c.vE`'Rtu]bAW,o\u0004\u001b";
        objectArray[29] = "lvl:\u001eofp>4el=?mDUx-+qu\u0017t#(\u0000";
        objectArray[30] = "e 5X!C=iu\\@_/\u001cnC->jiwC9Xo1m\u001a@";
        objectArray[31] = ".\u0010{\u0017\u0013rsB T/p|\bA\u001f_i*\u0002 TLbjs\u007f\u001dWtl\u0015zEM-\u0015";
        objectArray[32] = "#.5KX5,23Sca076n\u0018h,Pj\\\u001a0;1!O\u0011pJ:+\u0014\u001b6'j6B\u001c\u000fw;8W\u00023 6:\u0016c";
        Object[] objectArray2 = objectArray;
        objectArray[33] = "\u0004!O\u0016SSAaI\u0010#ATr\"IHCC\u007f\u001e\u001eEA\u0002\u001e\u001cO[LAx\u0019\u0017A\u00158";
    }

    public static Class f(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.e(l);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.e(l);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.c(clazz3, string2, clazz2)) != null) {
                    m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.f(542655517759130L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Method h(long l) {
        int n = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.e(l);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.f(542655517759130L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.f(542655517759130L);
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

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'K' || c == '\u00eb' || c == 'r' || c == '\u00ed') {
                field = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00eb' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU$1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static String m$$EgA2zSvuEX290CQK4UK1Vtsgk7MiZmnm5NUDH6iAh5LsDa8kTt8wWFR636MIBc1SvEthn7wwcOVM1nIfIl3JCsSIHAF6fU4p4(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{115, 7, -99, 109, 86, 115, 22, -98, -26, -83, 110, -119, -117, 93, 100, -70};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 16]);
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
            return MethodHandles.lookup().findStatic(m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
