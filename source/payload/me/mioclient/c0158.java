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
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_2561;

final class m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1
extends m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q {
    public static final String[] c;
    public static final String[] d;
    public static final Object[] e;
    public static final String[] h;

    public m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1(String string2) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.e = new Object[9];
            m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.h = new String[9];
            m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.d();
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "a\u00b0q\u009c@<\u0004H\u0086z\u00ab";
            var4_3 = "a\u00b0q\u009c@<\u0004H\u0086z\u00ab".length();
            var1_4 = 6;
            var0_5 = -1;
lbl10:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl12:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 88;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl70
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 59;
                            break;
                        }
                        case 1: {
                            v11 = 57;
                            break;
                        }
                        case 2: {
                            v11 = 68;
                            break;
                        }
                        case 3: {
                            v11 = 91;
                            break;
                        }
                        case 4: {
                            v11 = 59;
                            break;
                        }
                        case 5: {
                            v11 = 86;
                            break;
                        }
                        default: {
                            v11 = 72;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
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
            } while (v6 > var6_6);
            ** while (true)
        }
        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.c = var5;
        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.d = new String[2];
    }

    public static String b(int n, int n2) {
        int n3 = (n ^ 0x32BB) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = c[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 85;
                case 1 -> 138;
                case 2 -> 113;
                case 3 -> 39;
                case 4 -> 230;
                case 5 -> 59;
                case 6 -> 124;
                case 7 -> 241;
                case 8 -> 249;
                case 9 -> 96;
                case 10 -> 95;
                case 11 -> 100;
                case 12 -> 28;
                case 13 -> 200;
                case 14 -> 221;
                case 15 -> 244;
                case 16 -> 86;
                case 17 -> 147;
                case 18 -> 213;
                case 19 -> 199;
                case 20 -> 56;
                case 21 -> 167;
                case 22 -> 184;
                case 23 -> 73;
                case 24 -> 238;
                case 25 -> 237;
                case 26 -> 9;
                case 27 -> 44;
                case 28 -> 168;
                case 29 -> 17;
                case 30 -> 239;
                case 31 -> 94;
                case 32 -> 34;
                case 33 -> 81;
                case 34 -> 165;
                case 35 -> 198;
                case 36 -> 172;
                case 37 -> 23;
                case 38 -> 169;
                case 39 -> 13;
                case 40 -> 183;
                case 41 -> 242;
                case 42 -> 206;
                case 43 -> 225;
                case 44 -> 193;
                case 45 -> 174;
                case 46 -> 170;
                case 47 -> 48;
                case 48 -> 47;
                case 49 -> 177;
                case 50 -> 61;
                case 51 -> 2;
                case 52 -> 32;
                case 53 -> 84;
                case 54 -> 212;
                case 55 -> 14;
                case 56 -> 109;
                case 57 -> 153;
                case 58 -> 82;
                case 59 -> 163;
                case 60 -> 41;
                case 61 -> 202;
                case 62 -> 233;
                case 63 -> 154;
                case 64 -> 151;
                case 65 -> 190;
                case 66 -> 158;
                case 67 -> 58;
                case 68 -> 139;
                case 69 -> 207;
                case 70 -> 54;
                case 71 -> 16;
                case 72 -> 231;
                case 73 -> 121;
                case 74 -> 254;
                case 75 -> 179;
                case 76 -> 222;
                case 77 -> 6;
                case 78 -> 211;
                case 79 -> 114;
                case 80 -> 181;
                case 81 -> 68;
                case 82 -> 72;
                case 83 -> 10;
                case 84 -> 93;
                case 85 -> 50;
                case 86 -> 117;
                case 87 -> 137;
                case 88 -> 49;
                case 89 -> 143;
                case 90 -> 194;
                case 91 -> 252;
                case 92 -> 52;
                case 93 -> 21;
                case 94 -> 210;
                case 95 -> 5;
                case 96 -> 29;
                case 97 -> 205;
                case 98 -> 227;
                case 99 -> 98;
                case 100 -> 101;
                case 101 -> 92;
                case 102 -> 35;
                case 103 -> 104;
                case 104 -> 125;
                case 105 -> 122;
                case 106 -> 142;
                case 107 -> 134;
                case 108 -> 126;
                case 109 -> 133;
                case 110 -> 70;
                case 111 -> 116;
                case 112 -> 62;
                case 113 -> 160;
                case 114 -> 19;
                case 115 -> 219;
                case 116 -> 51;
                case 117 -> 182;
                case 118 -> 220;
                case 119 -> 214;
                case 120 -> 224;
                case 121 -> 69;
                case 122 -> 33;
                case 123 -> 112;
                case 124 -> 4;
                case 125 -> 71;
                case 126 -> 120;
                case 127 -> 15;
                case 128 -> 255;
                case 129 -> 65;
                case 130 -> 204;
                case 131 -> 229;
                case 132 -> 80;
                case 133 -> 188;
                case 134 -> 40;
                case 135 -> 99;
                case 136 -> 185;
                case 137 -> 209;
                case 138 -> 25;
                case 139 -> 63;
                case 140 -> 26;
                case 141 -> 97;
                case 142 -> 111;
                case 143 -> 150;
                case 144 -> 30;
                case 145 -> 123;
                case 146 -> 60;
                case 147 -> 8;
                case 148 -> 22;
                case 149 -> 76;
                case 150 -> 83;
                case 151 -> 89;
                case 152 -> 243;
                case 153 -> 7;
                case 154 -> 140;
                case 155 -> 173;
                case 156 -> 90;
                case 157 -> 161;
                case 158 -> 148;
                case 159 -> 127;
                case 160 -> 27;
                case 161 -> 130;
                case 162 -> 136;
                case 163 -> 87;
                case 164 -> 152;
                case 165 -> 88;
                case 166 -> 223;
                case 167 -> 189;
                case 168 -> 253;
                case 169 -> 208;
                case 170 -> 171;
                case 171 -> 247;
                case 172 -> 245;
                case 173 -> 164;
                case 174 -> 0;
                case 175 -> 248;
                case 176 -> 119;
                case 177 -> 191;
                case 178 -> 156;
                case 179 -> 128;
                case 180 -> 12;
                case 181 -> 201;
                case 182 -> 106;
                case 183 -> 57;
                case 184 -> 176;
                case 185 -> 149;
                case 186 -> 53;
                case 187 -> 180;
                case 188 -> 131;
                case 189 -> 102;
                case 190 -> 1;
                case 191 -> 105;
                case 192 -> 203;
                case 193 -> 236;
                case 194 -> 250;
                case 195 -> 132;
                case 196 -> 91;
                case 197 -> 141;
                case 198 -> 159;
                case 199 -> 216;
                case 200 -> 135;
                case 201 -> 166;
                case 202 -> 107;
                case 203 -> 3;
                case 204 -> 11;
                case 205 -> 196;
                case 206 -> 20;
                case 207 -> 215;
                case 208 -> 31;
                case 209 -> 192;
                case 210 -> 64;
                case 211 -> 162;
                case 212 -> 187;
                case 213 -> 103;
                case 214 -> 195;
                case 215 -> 37;
                case 216 -> 235;
                case 217 -> 228;
                case 218 -> 108;
                case 219 -> 45;
                case 220 -> 18;
                case 221 -> 55;
                case 222 -> 74;
                case 223 -> 251;
                case 224 -> 36;
                case 225 -> 66;
                case 226 -> 38;
                case 227 -> 240;
                case 228 -> 24;
                case 229 -> 232;
                case 230 -> 146;
                case 231 -> 226;
                case 232 -> 145;
                case 233 -> 118;
                case 234 -> 234;
                case 235 -> 75;
                case 236 -> 46;
                case 237 -> 175;
                case 238 -> 110;
                case 239 -> 217;
                case 240 -> 79;
                case 241 -> 43;
                case 242 -> 157;
                case 243 -> 178;
                case 244 -> 155;
                case 245 -> 246;
                case 246 -> 144;
                case 247 -> 42;
                case 248 -> 218;
                case 249 -> 186;
                case 250 -> 77;
                case 251 -> 129;
                case 252 -> 197;
                case 253 -> 67;
                case 254 -> 115;
                default -> 78;
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
            m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    public static Class n(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.m(l);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.e[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field h(Class clazz, String string, Class clazz2) {
        Field field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.h(classArray2[i], string, clazz2, n, classArray);
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
            if (c == '\u00ca' || c == '\u00f8' || c == 'R' || c == 'T') {
                field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.o(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ca' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.p(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'I' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'r' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = e;
        e[0] = "<\\JS\u001f#<\\]\u000f\u0013,&\u0017]\u0011\u00139!f\rLB";
        objectArray[1] = "y:sVH9y:d\nD6cqd\u0014D#d\u00004J\u0015";
        objectArray[2] = "\u0002\u0012]\"|u\t\u001dLm\u0001m\u001a\u001aE$";
        objectArray[3] = "^A]\u0005$\u0012^AJY(\u001dD\nJG(\bC{\u001b\u001e\u007fJ";
        objectArray[4] = "my\u0010\u001aAXmy\u0007FMWw2\u0007XMBpCQ\u0006\u0019\u0001";
        objectArray[5] = "rd\u0001\u0015a\u001fyk\u0010Z\u0000\u0011r`\u0014\u0000";
        objectArray[6] = ":WJ|f\u0003:\r^\u0002fP\u007fWAnT\u0004>\u000b\u0016\u0002:\u0003`K\u001f{:Ay\u000b&";
        objectArray[7] = "HoLVC%H-U\u0016z9\u001c-OM\u0016\u000bHo\u0010\u0014ze\b5C\u0010\u0006$\u00101\u0017*";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "<C$sSYlHst9Ek[z/Uw:\u001c&w\u0001 ?^~$\u0003\\~Fzp9\u001azH{)A^eL*H";
    }

    public static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.d(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int m(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (h[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 39;
            case 1 -> 7;
            case 2 -> 14;
            case 3 -> 45;
            case 4 -> 47;
            case 5 -> 22;
            case 6 -> 54;
            case 7 -> 25;
            case 8 -> 42;
            case 9 -> 5;
            case 10 -> 44;
            case 11 -> 1;
            case 12 -> 17;
            case 13 -> 59;
            case 14 -> 28;
            case 15 -> 24;
            case 16 -> 57;
            case 17 -> 41;
            case 18 -> 27;
            case 19 -> 31;
            case 20 -> 26;
            case 21 -> 9;
            case 22 -> 30;
            case 23 -> 11;
            case 24 -> 33;
            case 25 -> 63;
            case 26 -> 34;
            case 27 -> 16;
            case 28 -> 61;
            case 29 -> 3;
            case 30 -> 18;
            case 31 -> 55;
            case 32 -> 23;
            case 33 -> 38;
            case 34 -> 37;
            case 35 -> 58;
            case 36 -> 62;
            case 37 -> 36;
            case 38 -> 12;
            case 39 -> 21;
            case 40 -> 43;
            case 41 -> 48;
            case 42 -> 29;
            case 43 -> 56;
            case 44 -> 8;
            case 45 -> 60;
            case 46 -> 40;
            case 47 -> 50;
            case 48 -> 10;
            case 49 -> 19;
            case 50 -> 52;
            case 51 -> 0;
            case 52 -> 6;
            case 53 -> 13;
            case 54 -> 51;
            case 55 -> 35;
            case 56 -> 20;
            case 57 -> 32;
            case 58 -> 46;
            case 59 -> 49;
            case 60 -> 4;
            case 61 -> 15;
            case 62 -> 53;
            default -> 2;
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
        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.h[n3] = new String(cArray);
        return n3;
    }

    public static Field o(long l) {
        int n = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.m(l);
        Object object = e[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.n(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.n(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.g(clazz3, string2, clazz2)) != null) {
                    m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.n(394433804420914L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method p(long l) {
        int n = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.m(l);
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
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.n(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.n(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.n(394433804420914L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.n(394433804420914L);
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
        return m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.d("r", m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.b(12987, 9659) + (String)((Object)m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.d("I", (Object)m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.d("I", (Object)m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge, (long)490309642297063L), (long)497420686148327L)) + m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.b(12986, -16660), (long)630245469594816L);
    }

    public static String m$$NONe1USdzYISn5jO0R8awjtbhRk5P8e73QpqiTr3wjmv60Watnb0D1aZYITRG3ATrePVulIjkePMgVgG8pwNJtwVQ8yfO39e8(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{126, -96, 95, 69, 56, 29, 62, 73, 59, 77};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 10]);
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
            return MethodHandles.lookup().findStatic(m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

