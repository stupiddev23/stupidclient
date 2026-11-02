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
import me.mioclient.m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_2561;

final class m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2
extends m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q {
    public static final String[] c;
    public static final String[] d;
    public static final long e;
    public static final Object[] h;
    public static final String[] i;

    public m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2(String string2) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            block14: {
                m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.h = new Object[8];
                m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.i = new String[8];
                m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.d();
                var7 = new String[2];
                var5_1 = 0;
                var4_2 = "\u00b6Up\u00f4\tS\b\u00e2\u00ae'R\u00a2\u00aa\u009c";
                var6_3 = "\u00b6Up\u00f4\tS\b\u00e2\u00ae'R\u00a2\u00aa\u009c".length();
                var3_4 = 4;
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
                v4 = 54;
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
                                v11 = 115;
                                break;
                            }
                            case 1: {
                                v11 = 38;
                                break;
                            }
                            case 2: {
                                v11 = 59;
                                break;
                            }
                            case 3: {
                                v11 = 62;
                                break;
                            }
                            case 4: {
                                v11 = 98;
                                break;
                            }
                            case 5: {
                                v11 = 113;
                                break;
                            }
                            default: {
                                v11 = 13;
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
            m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.c = var7;
            m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.d = new String[2];
            break block15;
lbl81:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 1321774839291717738L;
        ** while (true)
        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.e = 8152282950634931277L ^ var0_7;
    }

    public static String b(int n, int n2) {
        int n3 = (n ^ 0x3B3F) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = c[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 112;
                case 1 -> 137;
                case 2 -> 81;
                case 3 -> 69;
                case 4 -> 115;
                case 5 -> 154;
                case 6 -> 77;
                case 7 -> 211;
                case 8 -> 39;
                case 9 -> 236;
                case 10 -> 234;
                case 11 -> 63;
                case 12 -> 121;
                case 13 -> 212;
                case 14 -> 27;
                case 15 -> 198;
                case 16 -> 43;
                case 17 -> 131;
                case 18 -> 233;
                case 19 -> 237;
                case 20 -> 70;
                case 21 -> 249;
                case 22 -> 164;
                case 23 -> 31;
                case 24 -> 104;
                case 25 -> 136;
                case 26 -> 51;
                case 27 -> 48;
                case 28 -> 224;
                case 29 -> 163;
                case 30 -> 187;
                case 31 -> 50;
                case 32 -> 149;
                case 33 -> 108;
                case 34 -> 160;
                case 35 -> 173;
                case 36 -> 99;
                case 37 -> 250;
                case 38 -> 17;
                case 39 -> 220;
                case 40 -> 52;
                case 41 -> 162;
                case 42 -> 62;
                case 43 -> 60;
                case 44 -> 38;
                case 45 -> 143;
                case 46 -> 158;
                case 47 -> 201;
                case 48 -> 216;
                case 49 -> 79;
                case 50 -> 222;
                case 51 -> 215;
                case 52 -> 238;
                case 53 -> 255;
                case 54 -> 122;
                case 55 -> 174;
                case 56 -> 140;
                case 57 -> 24;
                case 58 -> 75;
                case 59 -> 15;
                case 60 -> 152;
                case 61 -> 213;
                case 62 -> 243;
                case 63 -> 37;
                case 64 -> 74;
                case 65 -> 53;
                case 66 -> 240;
                case 67 -> 71;
                case 68 -> 124;
                case 69 -> 175;
                case 70 -> 96;
                case 71 -> 170;
                case 72 -> 239;
                case 73 -> 76;
                case 74 -> 188;
                case 75 -> 150;
                case 76 -> 67;
                case 77 -> 217;
                case 78 -> 155;
                case 79 -> 100;
                case 80 -> 98;
                case 81 -> 61;
                case 82 -> 95;
                case 83 -> 14;
                case 84 -> 214;
                case 85 -> 176;
                case 86 -> 219;
                case 87 -> 66;
                case 88 -> 185;
                case 89 -> 151;
                case 90 -> 55;
                case 91 -> 83;
                case 92 -> 103;
                case 93 -> 221;
                case 94 -> 102;
                case 95 -> 34;
                case 96 -> 119;
                case 97 -> 6;
                case 98 -> 30;
                case 99 -> 110;
                case 100 -> 1;
                case 101 -> 166;
                case 102 -> 169;
                case 103 -> 153;
                case 104 -> 178;
                case 105 -> 73;
                case 106 -> 204;
                case 107 -> 197;
                case 108 -> 111;
                case 109 -> 59;
                case 110 -> 20;
                case 111 -> 245;
                case 112 -> 156;
                case 113 -> 210;
                case 114 -> 0;
                case 115 -> 146;
                case 116 -> 189;
                case 117 -> 244;
                case 118 -> 183;
                case 119 -> 84;
                case 120 -> 207;
                case 121 -> 161;
                case 122 -> 147;
                case 123 -> 125;
                case 124 -> 97;
                case 125 -> 7;
                case 126 -> 241;
                case 127 -> 190;
                case 128 -> 29;
                case 129 -> 142;
                case 130 -> 168;
                case 131 -> 226;
                case 132 -> 57;
                case 133 -> 87;
                case 134 -> 123;
                case 135 -> 42;
                case 136 -> 141;
                case 137 -> 78;
                case 138 -> 127;
                case 139 -> 18;
                case 140 -> 182;
                case 141 -> 41;
                case 142 -> 9;
                case 143 -> 118;
                case 144 -> 157;
                case 145 -> 200;
                case 146 -> 138;
                case 147 -> 254;
                case 148 -> 88;
                case 149 -> 235;
                case 150 -> 230;
                case 151 -> 148;
                case 152 -> 36;
                case 153 -> 172;
                case 154 -> 218;
                case 155 -> 49;
                case 156 -> 130;
                case 157 -> 21;
                case 158 -> 47;
                case 159 -> 167;
                case 160 -> 8;
                case 161 -> 202;
                case 162 -> 223;
                case 163 -> 35;
                case 164 -> 101;
                case 165 -> 231;
                case 166 -> 44;
                case 167 -> 22;
                case 168 -> 186;
                case 169 -> 194;
                case 170 -> 129;
                case 171 -> 54;
                case 172 -> 45;
                case 173 -> 117;
                case 174 -> 133;
                case 175 -> 33;
                case 176 -> 209;
                case 177 -> 80;
                case 178 -> 91;
                case 179 -> 145;
                case 180 -> 107;
                case 181 -> 196;
                case 182 -> 159;
                case 183 -> 193;
                case 184 -> 106;
                case 185 -> 72;
                case 186 -> 195;
                case 187 -> 184;
                case 188 -> 229;
                case 189 -> 89;
                case 190 -> 132;
                case 191 -> 247;
                case 192 -> 232;
                case 193 -> 208;
                case 194 -> 192;
                case 195 -> 181;
                case 196 -> 3;
                case 197 -> 225;
                case 198 -> 171;
                case 199 -> 94;
                case 200 -> 93;
                case 201 -> 246;
                case 202 -> 28;
                case 203 -> 82;
                case 204 -> 126;
                case 205 -> 4;
                case 206 -> 32;
                case 207 -> 199;
                case 208 -> 2;
                case 209 -> 13;
                case 210 -> 23;
                case 211 -> 134;
                case 212 -> 251;
                case 213 -> 228;
                case 214 -> 16;
                case 215 -> 120;
                case 216 -> 90;
                case 217 -> 109;
                case 218 -> 128;
                case 219 -> 252;
                case 220 -> 227;
                case 221 -> 203;
                case 222 -> 65;
                case 223 -> 116;
                case 224 -> 139;
                case 225 -> 25;
                case 226 -> 177;
                case 227 -> 10;
                case 228 -> 64;
                case 229 -> 206;
                case 230 -> 242;
                case 231 -> 253;
                case 232 -> 58;
                case 233 -> 135;
                case 234 -> 205;
                case 235 -> 68;
                case 236 -> 86;
                case 237 -> 11;
                case 238 -> 19;
                case 239 -> 40;
                case 240 -> 179;
                case 241 -> 191;
                case 242 -> 113;
                case 243 -> 5;
                case 244 -> 12;
                case 245 -> 248;
                case 246 -> 165;
                case 247 -> 46;
                case 248 -> 114;
                case 249 -> 144;
                case 250 -> 26;
                case 251 -> 92;
                case 252 -> 180;
                case 253 -> 105;
                case 254 -> 56;
                default -> 85;
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
            m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    public static Class n(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.m(l);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field h(Class clazz, String string, Class clazz2) {
        Field field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.h(classArray2[i], string, clazz2, n, classArray);
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
            if (c == '\u00c3' || c == '\u00e7' || c == 'v' || c == 'g') {
                field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.o(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.p(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c7' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        h[0] = "wd\u0018>\u0011\u0016wd\u000fb\u001d\u0019m/\u000f|\u001d\fj^^%JN";
        objectArray[1] = "CJS_S\u0005HEB\u0010.\u001d[BKY";
        objectArray[2] = "$,\"P)k$,5\f%d>g5\u0012%q9\u0016cLq2";
        objectArray[3] = "nK\u000fd8~`BHl?e-C\u0005-\u001c~olWF6$0HG^\b%Dmbp8CH\u001dy<9rzbKY cEvkK\u0001u{hH\u007f6tTWPHeTZbwx:fQ\u001dOme~3lH:its\u001bq9:rLAyD)sS}{l\tCUxTK\u0017gu\u001bmA\u0014";
        objectArray[4] = Integer.TYPE;
        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.i[4] = "java/lang/Integer";
        objectArray[5] = "i(\u0013T\u001b^b'\u0002\u001bzPi,\u0006A";
        objectArray[6] = "u5'sL\u0017j8Z|\u001d\u0002{.6NLE'vb\u0019\fAq-;k\u0016\u0019wIceMN\u007f1eu\u000f\u0015\u001b";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "\u00101N\u0006c\u0005Z*IGY\u000f\u0006v^#0!c<\u0002G# \u0011\u0016\nE%1i\u0004`0$\fXcW1i\u0015q7J\u001eh7R\bn$`/F\u0019C@0\u001bp9\u007f>\":\u0015$bG:1o+P\u0013:\u0018G\u0007\u000e\u0006h\u0014\u0011\u0003\r%()\u0015\u0019\u0003\u0003:5Q\u0019q\u00187\u0013\u0013\u0015\u0002!\u0016$XgU}c\u0011We\u0002\u00142\u0006Ka2G\"\u0017\u0015j[\u00165\u000b\u0011Z";
    }

    public static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.d(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 11;
            case 1 -> 31;
            case 2 -> 37;
            case 3 -> 2;
            case 4 -> 21;
            case 5 -> 44;
            case 6 -> 35;
            case 7 -> 20;
            case 8 -> 46;
            case 9 -> 23;
            case 10 -> 13;
            case 11 -> 36;
            case 12 -> 40;
            case 13 -> 32;
            case 14 -> 22;
            case 15 -> 45;
            case 16 -> 54;
            case 17 -> 38;
            case 18 -> 52;
            case 19 -> 58;
            case 20 -> 5;
            case 21 -> 48;
            case 22 -> 28;
            case 23 -> 17;
            case 24 -> 43;
            case 25 -> 7;
            case 26 -> 12;
            case 27 -> 4;
            case 28 -> 53;
            case 29 -> 33;
            case 30 -> 41;
            case 31 -> 0;
            case 32 -> 59;
            case 33 -> 19;
            case 34 -> 15;
            case 35 -> 30;
            case 36 -> 25;
            case 37 -> 60;
            case 38 -> 27;
            case 39 -> 55;
            case 40 -> 57;
            case 41 -> 26;
            case 42 -> 29;
            case 43 -> 9;
            case 44 -> 8;
            case 45 -> 6;
            case 46 -> 63;
            case 47 -> 56;
            case 48 -> 47;
            case 49 -> 39;
            case 50 -> 1;
            case 51 -> 24;
            case 52 -> 18;
            case 53 -> 3;
            case 54 -> 49;
            case 55 -> 16;
            case 56 -> 34;
            case 57 -> 62;
            case 58 -> 61;
            case 59 -> 42;
            case 60 -> 50;
            case 61 -> 10;
            case 62 -> 51;
            default -> 14;
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
        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.i[n3] = new String(cArray);
        return n3;
    }

    public static Field o(long l) {
        int n = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.m(l);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.n(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.n(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.g(clazz3, string2, clazz2)) != null) {
                    m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.n(388639814594653L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method p(long l) {
        int n = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.m(l);
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
                clazz3 = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.n(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.n(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.n(388639814594653L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.n(388639814594653L);
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
    public class_2561 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$.AwsNiv9iA8itUPdTlLWesJhrdQCmL2EYWRrBQIdkQaiL5mWESEIZ7BF4gpdKmD0bAT5uYQ0cX7AFN4LYYAEo6sCndjuCL73C5 awsNiv9iA8itUPdTlLWesJhrdQCmL2EYWRrBQIdkQaiL5mWESEIZ7BF4gpdKmD0bAT5uYQ0cX7AFN4LYYAEo6sCndjuCL73C5) {
        return m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.d("\u00c2", m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.b(15166, 8450) + (int)m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.d("\u00c7", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$ozfWlcb91K2x4iIzZtELFW6chXmMjCbCilFnoouwSH5A04SKI5DfX6C6NL1j6ZbQ0FR3fhgwkdmIjA4moysuyOg1JbKvAhjVW, (int)((int)e), (long)525111983698162L) + m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.b(15167, -31528), (long)432198467978117L);
    }

    public static String m$$xzUp3BdRCRe4AVz6ADWeCBIvFdiTvq7ozoQVfyAwbunpDOlXW8YNEcS1kZClCZY2T0HknU3tb8u7vAbpzxqnUTFfGPDRd32PP(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-34, -104, 120, 93, -87, 96, -79, 12, 117, 106, -39, 65, 121, 100};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 14]);
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
            return MethodHandles.lookup().findStatic(m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$2.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

