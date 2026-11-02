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
import me.mioclient.m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$AwsNiv9iA8itUPdTlLWesJhrdQCmL2EYWRrBQIdkQaiL5mWESEIZ7BF4gpdKmD0bAT5uYQ0cX7AFN4LYYAEo6sCndjuCL73C5;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_2561;

final class m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3
extends m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q {
    public static final String[] c;
    public static final String[] d;
    public static final long e;
    public static final Object[] h;
    public static final String[] i;

    public m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3(String string2) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            block14: {
                m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.h = new Object[17];
                m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.i = new String[17];
                m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.d();
                var7 = new String[2];
                var5_1 = 0;
                var4_2 = "&\u00b7x\u008eK\u0006\u0003]\u00d4\u00a2\u00cf\u0017";
                var6_3 = "&\u00b7x\u008eK\u0006\u0003]\u00d4\u00a2\u00cf\u0017".length();
                var3_4 = 5;
                var2_5 = -1;
lbl10:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var7[var5_1++] = new String(v0).intern();
                    if ((var2_5 += var3_4) < var6_3) {
                        var3_4 = var4_2.charAt(var2_5);
                        ** continue;
                    }
                    break block14;
                    break;
                }
                v1 = ++var2_5;
                v2 = var4_2.substring(v1, v1 + var3_4).toCharArray();
                v3 = v2.length;
                var8_6 = 0;
                v4 = 81;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl70
                do {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v11 = 23;
                                break;
                            }
                            case 1: {
                                v11 = 69;
                                break;
                            }
                            case 2: {
                                v11 = 88;
                                break;
                            }
                            case 3: {
                                v11 = 20;
                                break;
                            }
                            case 4: {
                                v11 = 13;
                                break;
                            }
                            case 5: {
                                v11 = 7;
                                break;
                            }
                            default: {
                                v11 = 88;
                            }
                        }
                        v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                        ++var8_6;
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
                } while (v6 > var8_6);
                ** while (true)
            }
            m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.c = var7;
            m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.d = new String[2];
            break block15;
lbl81:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 3868235844656285294L;
        ** while (true)
        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.e = -8932610813773845943L ^ var0_7;
    }

    public static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFD115) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = c[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 110;
                case 1 -> 150;
                case 2 -> 195;
                case 3 -> 186;
                case 4 -> 235;
                case 5 -> 208;
                case 6 -> 25;
                case 7 -> 146;
                case 8 -> 48;
                case 9 -> 24;
                case 10 -> 213;
                case 11 -> 232;
                case 12 -> 15;
                case 13 -> 36;
                case 14 -> 177;
                case 15 -> 165;
                case 16 -> 72;
                case 17 -> 153;
                case 18 -> 181;
                case 19 -> 108;
                case 20 -> 31;
                case 21 -> 130;
                case 22 -> 118;
                case 23 -> 228;
                case 24 -> 137;
                case 25 -> 219;
                case 26 -> 182;
                case 27 -> 255;
                case 28 -> 149;
                case 29 -> 91;
                case 30 -> 76;
                case 31 -> 45;
                case 32 -> 189;
                case 33 -> 73;
                case 34 -> 167;
                case 35 -> 88;
                case 36 -> 60;
                case 37 -> 226;
                case 38 -> 187;
                case 39 -> 241;
                case 40 -> 237;
                case 41 -> 134;
                case 42 -> 203;
                case 43 -> 240;
                case 44 -> 142;
                case 45 -> 26;
                case 46 -> 95;
                case 47 -> 59;
                case 48 -> 215;
                case 49 -> 227;
                case 50 -> 51;
                case 51 -> 173;
                case 52 -> 55;
                case 53 -> 16;
                case 54 -> 169;
                case 55 -> 229;
                case 56 -> 168;
                case 57 -> 29;
                case 58 -> 57;
                case 59 -> 86;
                case 60 -> 175;
                case 61 -> 105;
                case 62 -> 79;
                case 63 -> 3;
                case 64 -> 223;
                case 65 -> 107;
                case 66 -> 34;
                case 67 -> 30;
                case 68 -> 144;
                case 69 -> 138;
                case 70 -> 253;
                case 71 -> 67;
                case 72 -> 176;
                case 73 -> 217;
                case 74 -> 154;
                case 75 -> 1;
                case 76 -> 13;
                case 77 -> 62;
                case 78 -> 121;
                case 79 -> 200;
                case 80 -> 81;
                case 81 -> 56;
                case 82 -> 170;
                case 83 -> 99;
                case 84 -> 114;
                case 85 -> 12;
                case 86 -> 132;
                case 87 -> 21;
                case 88 -> 87;
                case 89 -> 120;
                case 90 -> 204;
                case 91 -> 49;
                case 92 -> 10;
                case 93 -> 164;
                case 94 -> 89;
                case 95 -> 116;
                case 96 -> 238;
                case 97 -> 233;
                case 98 -> 196;
                case 99 -> 192;
                case 100 -> 220;
                case 101 -> 246;
                case 102 -> 71;
                case 103 -> 96;
                case 104 -> 129;
                case 105 -> 158;
                case 106 -> 61;
                case 107 -> 214;
                case 108 -> 231;
                case 109 -> 151;
                case 110 -> 191;
                case 111 -> 42;
                case 112 -> 162;
                case 113 -> 100;
                case 114 -> 136;
                case 115 -> 22;
                case 116 -> 7;
                case 117 -> 139;
                case 118 -> 4;
                case 119 -> 244;
                case 120 -> 194;
                case 121 -> 65;
                case 122 -> 92;
                case 123 -> 46;
                case 124 -> 52;
                case 125 -> 160;
                case 126 -> 172;
                case 127 -> 18;
                case 128 -> 103;
                case 129 -> 163;
                case 130 -> 218;
                case 131 -> 180;
                case 132 -> 184;
                case 133 -> 32;
                case 134 -> 50;
                case 135 -> 58;
                case 136 -> 47;
                case 137 -> 102;
                case 138 -> 161;
                case 139 -> 148;
                case 140 -> 2;
                case 141 -> 6;
                case 142 -> 202;
                case 143 -> 128;
                case 144 -> 125;
                case 145 -> 27;
                case 146 -> 236;
                case 147 -> 250;
                case 148 -> 90;
                case 149 -> 123;
                case 150 -> 119;
                case 151 -> 41;
                case 152 -> 230;
                case 153 -> 20;
                case 154 -> 234;
                case 155 -> 9;
                case 156 -> 33;
                case 157 -> 209;
                case 158 -> 112;
                case 159 -> 77;
                case 160 -> 166;
                case 161 -> 243;
                case 162 -> 40;
                case 163 -> 84;
                case 164 -> 39;
                case 165 -> 183;
                case 166 -> 78;
                case 167 -> 156;
                case 168 -> 23;
                case 169 -> 155;
                case 170 -> 106;
                case 171 -> 115;
                case 172 -> 8;
                case 173 -> 157;
                case 174 -> 174;
                case 175 -> 225;
                case 176 -> 221;
                case 177 -> 247;
                case 178 -> 179;
                case 179 -> 19;
                case 180 -> 159;
                case 181 -> 68;
                case 182 -> 94;
                case 183 -> 17;
                case 184 -> 85;
                case 185 -> 212;
                case 186 -> 242;
                case 187 -> 206;
                case 188 -> 117;
                case 189 -> 0;
                case 190 -> 133;
                case 191 -> 140;
                case 192 -> 143;
                case 193 -> 199;
                case 194 -> 127;
                case 195 -> 188;
                case 196 -> 171;
                case 197 -> 126;
                case 198 -> 248;
                case 199 -> 35;
                case 200 -> 254;
                case 201 -> 197;
                case 202 -> 145;
                case 203 -> 5;
                case 204 -> 178;
                case 205 -> 135;
                case 206 -> 111;
                case 207 -> 147;
                case 208 -> 75;
                case 209 -> 43;
                case 210 -> 80;
                case 211 -> 104;
                case 212 -> 222;
                case 213 -> 122;
                case 214 -> 131;
                case 215 -> 207;
                case 216 -> 124;
                case 217 -> 11;
                case 218 -> 245;
                case 219 -> 210;
                case 220 -> 216;
                case 221 -> 64;
                case 222 -> 239;
                case 223 -> 53;
                case 224 -> 98;
                case 225 -> 185;
                case 226 -> 224;
                case 227 -> 101;
                case 228 -> 190;
                case 229 -> 66;
                case 230 -> 14;
                case 231 -> 83;
                case 232 -> 63;
                case 233 -> 74;
                case 234 -> 251;
                case 235 -> 249;
                case 236 -> 97;
                case 237 -> 113;
                case 238 -> 198;
                case 239 -> 38;
                case 240 -> 93;
                case 241 -> 193;
                case 242 -> 201;
                case 243 -> 54;
                case 244 -> 205;
                case 245 -> 211;
                case 246 -> 152;
                case 247 -> 37;
                case 248 -> 28;
                case 249 -> 44;
                case 250 -> 70;
                case 251 -> 252;
                case 252 -> 109;
                case 253 -> 141;
                case 254 -> 69;
                default -> 82;
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
            m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    public static Class n(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.m(l);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field h(Class clazz, String string, Class clazz2) {
        Field field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ec' || c == '\u00c2' || c == '\u00fb' || c == '\u00c0') {
                field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.o(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ec' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.p(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cf' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = h;
        h[0] = "\b\"]pD~\b\"J,Hq\u0012iJ2Hd\u0015\u0018\u001ao\u0019";
        objectArray[1] = "\u0011\u0010FI@Z\u0011\u0010Q\u0015LU\u000b[Q\u000bL@\f*\u0001U\u001d";
        objectArray[2] = "\u0003o\bdXO\b`\u0019+%W\u001bg\u0010b";
        objectArray[3] = "P0|y+&^9;q,=\u00138v0/.Wb>[\u0005#_;\u0002\u007f%\fp40U'%u!\u0003\\*%s\u0006\u0019yv;\u007fb7d\u0012&Z?\u0014r/!^\u0011\u0001ew\rR=dB\u0011p\u0005\u0011<Gz#J\u0001'#$x\u0004d\u0016{\u000b}Hc p*:N-#l\u0016/H\u0017\u001ce\u001a0t6;Rw";
        objectArray[4] = "Iu18\u0012<Bz ws2Iq$-";
        objectArray[5] = Integer.TYPE;
        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.i[5] = "java/lang/Integer";
        objectArray[6] = "\u0019v\u0014G%`\u0012y\u0005\bHd\u0012e1Czy\u0016y\u0001C";
        objectArray[7] = "BDf21eBDqn=jX\u000fqp=\u007f_~ )j=";
        objectArray[8] = "i;OG\u0014`i;X\u001b\u0018ospX\u0005\u0018zt\u0001\u000e[L9";
        objectArray[9] = "L0\u0006n\u0007!B9Af\u0000:\u000f8\f'#!M\u0017^L\t{\u00123NT7zf\u0016kz\u0007\u001cjfp6\u0006-X\u0019BS\u001f<g\rbA>*Y\u0013Au\t+v,YBZ\u000bx\u0019~r\u00059sfFgZ!\u0011\u0017A0V+Q`x3\u0005-n:pN\u0016,q\u0006rf6\u001cw\u0003]A(8W`dK+";
        objectArray[10] = "q;PL2e}c[27lob^^\u00058.>\t2k0o<HPk`k;9";
        objectArray[11] = "=g 54\u001d=7$2E\u001ai*<l)(=hc5EFe?${u\u000ei+7\u000b";
        objectArray[12] = "1dH^\u001c7`:XXx$f'|^\u001c6f[\u0018I\u001czl?HF\u0000q\u000b";
        objectArray[13] = "?j\u0014\u001a[\u0013wf\u0000\t+]oo\u0000\u000flM\u00067F\u0007\u0017\u001e>e\u001d\u0006@#?j\u0014\u001a[\u0013wf\u0000\t+";
        objectArray[14] = "c\b'>\u001d2+\u00043-mx7\u0011*/\u0006oZUq)\u0002\u007f'V7|Q\u0002fV!)\u0010\u007fe\u0010tzm;;\u000066]s7\u0014%F";
        objectArray[15] = "\u00015\u0015~\u0005\u0005\u0000vYra\u0001P;\u0004w\r3\u0001|X/Yd\u0004&\rh\u0011TL*\u0019{aYC.\u0006p\r\u000e\u0004|\r\u0010";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "\u00173d\u0002luX':\u0003\u000f-\u0005qf8f\u0003`;:\\u\u0002\u0012\u00112^s\u0013j\u0003X+r.[do*?7r0r\u0005>\u0015Q\u000fV?6\rE\u001e{[f9s>G%t\u0018\u0016#Z\\l\u0013l,h\bl:D\u00006\u001d>6\u0012\u00045>~\u000b\u0016\u001e;\u0018l\u0017R\u001eI\u0003a1\u0010\u0012::@\u0006[`mf3sLa7^a(M6\nZ4-\u0015`2\bo,B]";
    }

    public static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.d(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int m(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 26;
            case 1 -> 4;
            case 2 -> 22;
            case 3 -> 18;
            case 4 -> 2;
            case 5 -> 45;
            case 6 -> 17;
            case 7 -> 61;
            case 8 -> 48;
            case 9 -> 3;
            case 10 -> 41;
            case 11 -> 49;
            case 12 -> 52;
            case 13 -> 29;
            case 14 -> 10;
            case 15 -> 43;
            case 16 -> 42;
            case 17 -> 5;
            case 18 -> 60;
            case 19 -> 16;
            case 20 -> 24;
            case 21 -> 63;
            case 22 -> 7;
            case 23 -> 20;
            case 24 -> 0;
            case 25 -> 23;
            case 26 -> 9;
            case 27 -> 14;
            case 28 -> 15;
            case 29 -> 50;
            case 30 -> 44;
            case 31 -> 6;
            case 32 -> 62;
            case 33 -> 32;
            case 34 -> 1;
            case 35 -> 33;
            case 36 -> 59;
            case 37 -> 54;
            case 38 -> 56;
            case 39 -> 12;
            case 40 -> 8;
            case 41 -> 31;
            case 42 -> 37;
            case 43 -> 53;
            case 44 -> 36;
            case 45 -> 19;
            case 46 -> 47;
            case 47 -> 21;
            case 48 -> 55;
            case 49 -> 35;
            case 50 -> 51;
            case 51 -> 11;
            case 52 -> 25;
            case 53 -> 57;
            case 54 -> 30;
            case 55 -> 27;
            case 56 -> 46;
            case 57 -> 40;
            case 58 -> 38;
            case 59 -> 58;
            case 60 -> 13;
            case 61 -> 34;
            case 62 -> 28;
            default -> 39;
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
        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.i[n3] = new String(cArray);
        return n3;
    }

    public static Field o(long l) {
        int n = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.m(l);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.n(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.n(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.g(clazz3, string2, clazz2)) != null) {
                    m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.n(292241045973350L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method p(long l) {
        int n = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.m(l);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.n(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.n(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.n(292241045973350L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.n(292241045973350L);
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

    public static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    @Override
    public class_2561 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$AwsNiv9iA8itUPdTlLWesJhrdQCmL2EYWRrBQIdkQaiL5mWESEIZ7BF4gpdKmD0bAT5uYQ0cX7AFN4LYYAEo6sCndjuCL73C5 m$$AwsNiv9iA8itUPdTlLWesJhrdQCmL2EYWRrBQIdkQaiL5mWESEIZ7BF4gpdKmD0bAT5uYQ0cX7AFN4LYYAEo6sCndjuCL73C5) {
        Object object = (String)((Object)m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.d("F", (Object)m$$AwsNiv9iA8itUPdTlLWesJhrdQCmL2EYWRrBQIdkQaiL5mWESEIZ7BF4gpdKmD0bAT5uYQ0cX7AFN4LYYAEo6sCndjuCL73C5.m$$n4NnXht9IApEAmUWyEfX26fpV75mg3ox5c4Os1ZHW443LGrpqTu3hupqlP71WFTTGyuPhLfx1HDFpdIJo69reMT6fAq98G3Kb, (long)906469332647245L));
        object = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.d("F", (Object)object, (Object)m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.b(-12012, -20024), (Object)m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.d("F", (Object)m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.d("F", (Object)m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge, (long)758641191272237L), (long)792951855198992L), (long)1041994992092334L);
        object = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.d("F", (Object)object, (Object)m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.b(-12011, -15351), (Object)m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.d("\u00cf", (int)m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.d("F", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW, (int)((int)e), (long)1185235482104413L), (long)955654407740738L), (long)1041994992092334L);
        return m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.d("\u00cf", (Object)object, (long)1115725428065678L);
    }

    public static String m$$dLc9qWovSscV1G3aNWU9bcstBjuynpkF2cXANpo1CkRHjQsFD2jldQUxRGKkDNvyNO5QMtSuH7ioYsZCXj2Qsufn2SKSyilVh(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{46, 82, -97, -108, -33, 121, 107, 126};
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
            return MethodHandles.lookup().findStatic(m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$3.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

