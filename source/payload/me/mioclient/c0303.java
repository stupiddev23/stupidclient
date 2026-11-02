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

final class m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2
extends m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU {
    public static final String[] a;
    public static final String[] b;
    public static final Object[] e;
    public static final String[] f;

    public m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2(String string2) {
    }

    @Override
    public List m$$tYPCqVTEwMHSL5qKxLiYhldokGzlMNeiNGBEB1zIT52A6PRFVcAOnt31hzq5jJFpcXnfmstTgVcRfzXy3WjSOcGi4CsN2w8sJ() {
        File file;
        block14: {
            file = new File(m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(-25613, 324) + File.separator + m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(-25609, -13404) + File.separator + m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(-25615, 8252));
            try {
                try {
                    if (m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)file, (long)1650056195094063L) != false && m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)file, (long)1825329584960530L) != false) break block14;
                }
                catch (class_151 class_1512) {
                    throw m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(class_1512);
                }
                throw new FileNotFoundException();
            }
            catch (class_151 class_1513) {
                throw m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(class_1513);
            }
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        CallSite callSite = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)fileInputStream, (long)1584787045128769L);
        try {
            m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)fileInputStream, (long)1085364214721009L);
            if (((CallSite)callSite).length == 0) {
                return m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("\u00ff", (long)1404395187182978L);
            }
        }
        catch (class_151 class_1514) {
            throw m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(class_1514);
        }
        ArrayList arrayList = new ArrayList();
        JsonArray jsonArray = (JsonArray)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$VqDc0eTAgzOPC4IU6WwZsiqEa0qk7QNmclpi6XPMtzLLBOqLUU9iWXMcrWVjw6jLdGlqrsVBwx7XuPXLTWk6HGDHuk8aGSTUx, (Object)new String((byte[])callSite, StandardCharsets.UTF_8), JsonArray.class, (long)1914034107147796L);
        for (int i = 0; i < m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)jsonArray, (long)1730721355274755L); ++i) {
            CallSite callSite2 = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)jsonArray, (int)i, (long)1427136052231308L), (long)1187150685114558L);
            try {
                if (m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)callSite2, (Object)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(-25616, 9259), (long)1858593704582266L) == false || m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)callSite2, (Object)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(-25614, 27120), (long)1858593704582266L) == false) continue;
            }
            catch (class_151 class_1515) {
                throw m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(class_1515);
            }
            CallSite callSite3 = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)callSite2, (Object)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(-25611, -12782), (long)1492881360138422L), (long)1294475673418370L);
            CallSite callSite4 = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", (Object)callSite2, (Object)m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(-25612, -9131), (long)1492881360138422L), (long)1294475673418370L);
            try {
                try {
                    if (m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(-25610, 10061), (Object)callSite4, (long)2015206919290353L) == false || m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", arrayList, (Object)callSite3, (long)1245050851191920L) != false) continue;
                }
                catch (class_151 class_1516) {
                    throw m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(class_1516);
                }
                m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b("H", arrayList, (Object)callSite3, (long)2073355627658588L);
                continue;
            }
            catch (class_151 class_1517) {
                throw m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a(class_1517);
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
                m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.e = new Object[30];
                m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.f = new String[30];
                m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b();
                var5 = new String[8];
                var3_1 = 0;
                var2_2 = "\u009d\u00c5\u00fd\u00c0Nt\u0006\f[i\u00aa8]\b'\u00b0u\u00e52@\u0093\u0019\u0005\u00bd.\u00e4\u00d7\u008f\n/\u0080\u0085?\u00f3Q\u00c4N\u008d\u00c0\u0005L\u00af\u00da\u00e7H";
                var4_3 = "\u009d\u00c5\u00fd\u00c0Nt\u0006\f[i\u00aa8]\b'\u00b0u\u00e52@\u0093\u0019\u0005\u00bd.\u00e4\u00d7\u008f\n/\u0080\u0085?\u00f3Q\u00c4N\u008d\u00c0\u0005L\u00af\u00da\u00e7H".length();
                var1_4 = 6;
                var0_5 = -1;
lbl10:
                // 2 sources

                while (true) {
                    v0 = 69;
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
                    var2_2 = "[M\u0099\u0010\u0010\n\u0001\u00dfO\u00d4\u008f\u00b4\u0095s\bC't\u009a\u009f\"\u00ab\u00d8";
                    var4_3 = "[M\u0099\u0010\u0010\n\u0001\u00dfO\u00d4\u008f\u00b4\u0095s\bC't\u009a\u009f\"\u00ab\u00d8".length();
                    var1_4 = 14;
                    var0_5 = -1;
lbl25:
                    // 2 sources

                    while (true) {
                        v0 = 73;
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
                            v15 = 52;
                            break;
                        }
                        case 1: {
                            v15 = 89;
                            break;
                        }
                        case 2: {
                            v15 = 68;
                            break;
                        }
                        case 3: {
                            v15 = 90;
                            break;
                        }
                        case 4: {
                            v15 = 94;
                            break;
                        }
                        case 5: {
                            v15 = 7;
                            break;
                        }
                        default: {
                            v15 = 61;
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
        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.a = var5;
        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b = new String[8];
    }

    public static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFF9BF7) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 153;
                case 1 -> 16;
                case 2 -> 233;
                case 3 -> 125;
                case 4 -> 203;
                case 5 -> 190;
                case 6 -> 33;
                case 7 -> 38;
                case 8 -> 126;
                case 9 -> 137;
                case 10 -> 229;
                case 11 -> 221;
                case 12 -> 113;
                case 13 -> 19;
                case 14 -> 117;
                case 15 -> 0;
                case 16 -> 157;
                case 17 -> 253;
                case 18 -> 31;
                case 19 -> 236;
                case 20 -> 28;
                case 21 -> 43;
                case 22 -> 47;
                case 23 -> 81;
                case 24 -> 200;
                case 25 -> 207;
                case 26 -> 83;
                case 27 -> 22;
                case 28 -> 77;
                case 29 -> 78;
                case 30 -> 39;
                case 31 -> 107;
                case 32 -> 98;
                case 33 -> 209;
                case 34 -> 50;
                case 35 -> 238;
                case 36 -> 136;
                case 37 -> 191;
                case 38 -> 232;
                case 39 -> 141;
                case 40 -> 227;
                case 41 -> 32;
                case 42 -> 135;
                case 43 -> 89;
                case 44 -> 121;
                case 45 -> 243;
                case 46 -> 220;
                case 47 -> 178;
                case 48 -> 124;
                case 49 -> 186;
                case 50 -> 198;
                case 51 -> 48;
                case 52 -> 181;
                case 53 -> 84;
                case 54 -> 79;
                case 55 -> 23;
                case 56 -> 249;
                case 57 -> 237;
                case 58 -> 111;
                case 59 -> 185;
                case 60 -> 52;
                case 61 -> 162;
                case 62 -> 224;
                case 63 -> 53;
                case 64 -> 85;
                case 65 -> 187;
                case 66 -> 109;
                case 67 -> 62;
                case 68 -> 242;
                case 69 -> 149;
                case 70 -> 114;
                case 71 -> 182;
                case 72 -> 152;
                case 73 -> 241;
                case 74 -> 213;
                case 75 -> 75;
                case 76 -> 230;
                case 77 -> 155;
                case 78 -> 118;
                case 79 -> 188;
                case 80 -> 215;
                case 81 -> 86;
                case 82 -> 37;
                case 83 -> 247;
                case 84 -> 108;
                case 85 -> 154;
                case 86 -> 239;
                case 87 -> 151;
                case 88 -> 148;
                case 89 -> 240;
                case 90 -> 40;
                case 91 -> 143;
                case 92 -> 225;
                case 93 -> 12;
                case 94 -> 24;
                case 95 -> 128;
                case 96 -> 14;
                case 97 -> 218;
                case 98 -> 138;
                case 99 -> 70;
                case 100 -> 72;
                case 101 -> 216;
                case 102 -> 11;
                case 103 -> 183;
                case 104 -> 34;
                case 105 -> 133;
                case 106 -> 4;
                case 107 -> 90;
                case 108 -> 217;
                case 109 -> 170;
                case 110 -> 44;
                case 111 -> 131;
                case 112 -> 192;
                case 113 -> 35;
                case 114 -> 228;
                case 115 -> 102;
                case 116 -> 30;
                case 117 -> 159;
                case 118 -> 87;
                case 119 -> 171;
                case 120 -> 147;
                case 121 -> 66;
                case 122 -> 167;
                case 123 -> 74;
                case 124 -> 176;
                case 125 -> 18;
                case 126 -> 94;
                case 127 -> 250;
                case 128 -> 49;
                case 129 -> 54;
                case 130 -> 119;
                case 131 -> 63;
                case 132 -> 173;
                case 133 -> 91;
                case 134 -> 92;
                case 135 -> 165;
                case 136 -> 132;
                case 137 -> 219;
                case 138 -> 234;
                case 139 -> 25;
                case 140 -> 42;
                case 141 -> 122;
                case 142 -> 251;
                case 143 -> 164;
                case 144 -> 160;
                case 145 -> 156;
                case 146 -> 95;
                case 147 -> 184;
                case 148 -> 127;
                case 149 -> 76;
                case 150 -> 65;
                case 151 -> 130;
                case 152 -> 112;
                case 153 -> 223;
                case 154 -> 197;
                case 155 -> 101;
                case 156 -> 46;
                case 157 -> 196;
                case 158 -> 252;
                case 159 -> 214;
                case 160 -> 110;
                case 161 -> 142;
                case 162 -> 115;
                case 163 -> 41;
                case 164 -> 194;
                case 165 -> 208;
                case 166 -> 158;
                case 167 -> 202;
                case 168 -> 56;
                case 169 -> 104;
                case 170 -> 168;
                case 171 -> 7;
                case 172 -> 17;
                case 173 -> 174;
                case 174 -> 5;
                case 175 -> 45;
                case 176 -> 80;
                case 177 -> 169;
                case 178 -> 201;
                case 179 -> 10;
                case 180 -> 139;
                case 181 -> 61;
                case 182 -> 103;
                case 183 -> 9;
                case 184 -> 254;
                case 185 -> 210;
                case 186 -> 205;
                case 187 -> 58;
                case 188 -> 64;
                case 189 -> 20;
                case 190 -> 69;
                case 191 -> 93;
                case 192 -> 166;
                case 193 -> 206;
                case 194 -> 175;
                case 195 -> 195;
                case 196 -> 3;
                case 197 -> 226;
                case 198 -> 60;
                case 199 -> 116;
                case 200 -> 255;
                case 201 -> 177;
                case 202 -> 189;
                case 203 -> 57;
                case 204 -> 150;
                case 205 -> 244;
                case 206 -> 6;
                case 207 -> 82;
                case 208 -> 212;
                case 209 -> 145;
                case 210 -> 199;
                case 211 -> 36;
                case 212 -> 179;
                case 213 -> 231;
                case 214 -> 59;
                case 215 -> 68;
                case 216 -> 97;
                case 217 -> 123;
                case 218 -> 96;
                case 219 -> 99;
                case 220 -> 105;
                case 221 -> 211;
                case 222 -> 248;
                case 223 -> 1;
                case 224 -> 100;
                case 225 -> 172;
                case 226 -> 163;
                case 227 -> 26;
                case 228 -> 71;
                case 229 -> 222;
                case 230 -> 245;
                case 231 -> 13;
                case 232 -> 140;
                case 233 -> 161;
                case 234 -> 180;
                case 235 -> 15;
                case 236 -> 21;
                case 237 -> 29;
                case 238 -> 204;
                case 239 -> 51;
                case 240 -> 134;
                case 241 -> 120;
                case 242 -> 67;
                case 243 -> 235;
                case 244 -> 129;
                case 245 -> 55;
                case 246 -> 8;
                case 247 -> 193;
                case 248 -> 2;
                case 249 -> 73;
                case 250 -> 27;
                case 251 -> 144;
                case 252 -> 146;
                case 253 -> 246;
                case 254 -> 88;
                default -> 106;
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
            m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b[n3] = new String(cArray).intern();
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
            case 0 -> 57;
            case 1 -> 58;
            case 2 -> 7;
            case 3 -> 10;
            case 4 -> 0;
            case 5 -> 5;
            case 6 -> 48;
            case 7 -> 40;
            case 8 -> 30;
            case 9 -> 16;
            case 10 -> 27;
            case 11 -> 11;
            case 12 -> 36;
            case 13 -> 23;
            case 14 -> 55;
            case 15 -> 29;
            case 16 -> 60;
            case 17 -> 18;
            case 18 -> 4;
            case 19 -> 3;
            case 20 -> 20;
            case 21 -> 14;
            case 22 -> 26;
            case 23 -> 17;
            case 24 -> 21;
            case 25 -> 33;
            case 26 -> 54;
            case 27 -> 37;
            case 28 -> 8;
            case 29 -> 47;
            case 30 -> 50;
            case 31 -> 52;
            case 32 -> 56;
            case 33 -> 22;
            case 34 -> 39;
            case 35 -> 35;
            case 36 -> 42;
            case 37 -> 59;
            case 38 -> 53;
            case 39 -> 61;
            case 40 -> 12;
            case 41 -> 28;
            case 42 -> 44;
            case 43 -> 2;
            case 44 -> 32;
            case 45 -> 51;
            case 46 -> 46;
            case 47 -> 6;
            case 48 -> 25;
            case 49 -> 9;
            case 50 -> 24;
            case 51 -> 19;
            case 52 -> 45;
            case 53 -> 34;
            case 54 -> 13;
            case 55 -> 43;
            case 56 -> 41;
            case 57 -> 62;
            case 58 -> 63;
            case 59 -> 15;
            case 60 -> 38;
            case 61 -> 31;
            case 62 -> 1;
            default -> 49;
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
        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.f[n3] = new String(cArray);
        return n3;
    }

    public static void b() {
        Object[] objectArray = e;
        e[0] = "(Z\u000219l-\u001529{`\u000bU\u0004%cV6I\u00111z";
        objectArray[1] = Void.TYPE;
        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.f[1] = "java/lang/Void";
        objectArray[2] = "Vs[TY_Z{Z\u001f\u0010WFsXTtCZrs\u0016[]PrB";
        objectArray[3] = "mW'\r\"^a_&FkV}W$\r\u000fBaV\u0005A/TmL";
        objectArray[4] = "'(}sko9 g<\ts>=";
        objectArray[5] = "oA;!3vdN*nRxoE.4";
        objectArray[6] = Boolean.TYPE;
        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.f[6] = "java/lang/Boolean";
        objectArray[7] = "-\u0003dqR\u0015&\fu>/\r5\u000b|w";
        objectArray[8] = "{0\u001c@\u000e\u0007e8\u0006\u000fc\u001d}=\u000fBT\u001b~?\u0019";
        objectArray[9] = "K\u001cRPT\u001cG\u0014S\u001b\u001d\u0014[\u001cQPy\u0000G\u001d~\fA\u0012Q";
        objectArray[10] = Integer.TYPE;
        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.f[10] = "java/lang/Integer";
        objectArray[11] = "sJ";
        objectArray[12] = "3i\"L\u0002#6&\u0012D@/";
        objectArray[13] = "\u0005{\u000bI\u0017g\ts\n\u0002^o\u0015{\bI7{\tz";
        objectArray[14] = "\u0018J\u0011<4L\u0013E\u0000sYL\u0013X\u0014";
        objectArray[15] = "`\";#0\u00178`:\\%\b8`3\\0\u0015ba4,0\u00151\u001b";
        objectArray[16] = "nC\u0006\t:\u001egU\u0010\t\u0002@:M!\u001c@T0W/\r`B<Mh]eR:M\u000bX|O*1";
        objectArray[17] = "U\u000e|R].\u0004Q\"Y;(\tT<UZ%\u00152{]Xs\u000fR\"\\Wsn\u000e%YDzVI%\u0005\u0004C";
        objectArray[18] = "D\u001eFaptM\bPaH*\u0010\u0010at\u00139\u0007\rN`HxE\u0001\u00115)*\u0017\u0000\u0018\u000f";
        objectArray[19] = "NEX`~>\u001b\u0006I'\u00024\u0015\u0002E,F8\u000b\u00069f>e\u001e\u001cT7a;\u0015z";
        objectArray[20] = "\th;sNuM\u007fdvqkZd\u0003w\u0003{Igov\u0017aF\u0018:;\u001fj\u000f)3-\tj7";
        objectArray[21] = "\u0007*CF*X\u00023^VVTP1>\u0016nV\u0004w_D<W\rM\u0007Y8U\u0005|\u000eO.U=";
        objectArray[22] = "(\u00127\u0019^FpP6fZP~G\u001b\u0002DwfW?\u001d \r+\u0014b\u000fK]uN3f";
        objectArray[23] = "S)\u0012|-=\u0007 O%Ia\u0013&\f92\f_\"\u0012:p4\u0018\"NzI";
        objectArray[24] = "\u0004G\u001cz\u0013\n@PC\u007f,\u0000[EI@\u0012\tEI[,\u0013\u001d_F$";
        objectArray[25] = "h0udXg<9(=<7#\u0010q9QVd;u\"\u0005n#;)b<";
        objectArray[26] = "%\u000b\"\u0012w. \u0012?\u0002\u000b-v\u0017_B3 &V>\u0010a!/lc\u001an2&T$\u001a2r\u001f";
        objectArray[27] = "?z$rM37~$(1gt&(PJnhAp*\\04 \"x]9\u000e(p,X16-u\u007fR\t5 .\"Pil!!\"1";
        objectArray[28] = "J3,\u001eR?\u0018a-\u0017h3\u000ev(C\u0013\u001f\u0018m&]\u0005\u0015\u001ep,'Uf\u001a2{F\u00074\u001b;A\u001b\r;\b2y\\\rgH\u000b";
        Object[] objectArray2 = objectArray;
        objectArray[29] = "\u0016\u000e\b@\u0007.GQVKa*A^4\u0015\u0000 \u001dSTL\u0001/\u001d2\bK\u0004<\u0014\nOKX|-";
    }

    public static Class f(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.e(l);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.e[n] = clazz = Class.forName(f[n]);
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
        Field field = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.e(l);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.c(clazz3, string2, clazz2)) != null) {
                    m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.f(357045663733676L);
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
        Method method = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Method h(long l) {
        int n = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.e(l);
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
                clazz3 = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.f(357045663733676L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.f(357045663733676L);
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
            if (c == '\u00c8' || c == '\u00f1' || c == 'Z' || c == 'y') {
                field = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'H' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU$2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static String m$$2kDaFOsFxeW06Jh79hJBIqCUYviaCKnxYaL0g5P2UOjGN1RCRN6o2HABdOCr8Jx0zmaFiu0yNeE4CXDHOPqNRT0iCubRZx5rr(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-112, 83, -17, 114, -29, -58, -81, 121, -34, 89, -114, 38};
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
            return MethodHandles.lookup().findStatic(m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
