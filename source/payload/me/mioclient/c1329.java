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
import java.nio.file.Path;
import java.util.Locale;
import me.mioclient.m$$02HvsQoTvlnydRVIW36DOf6IhnOfidT08XwqgDPPCZ2Wtgkecu728WgtTm98aq9fJSSTUWNTNQhmlG5n6sGg1XkvY5K4DiROq;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$ai2OPmCv1Ik4Bf9MmMIhWdABomxdU9F78feCd0tTx0o2LclrgFD4fPbSdLMlzTFtzsZYcmSUSC7Yf9GKFuBGWqaoZ9eM43gC5;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$1;
import me.mioclient.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2;
import me.mioclient.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3;
import me.mioclient.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$4;
import me.mioclient.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5;
import me.mioclient.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$6;
import me.mioclient.m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud;
import net.minecraft.class_151;

public abstract class m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm
extends Enum
implements m$$02HvsQoTvlnydRVIW36DOf6IhnOfidT08XwqgDPPCZ2Wtgkecu728WgtTm98aq9fJSSTUWNTNQhmlG5n6sGg1XkvY5K4DiROq,
m$$ai2OPmCv1Ik4Bf9MmMIhWdABomxdU9F78feCd0tTx0o2LclrgFD4fPbSdLMlzTFtzsZYcmSUSC7Yf9GKFuBGWqaoZ9eM43gC5 {
    public static final /* enum */ m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm m$$v33dzTTzUOqpVDvK0GWgM9Jgtd96JFMDcdvE6O3juNUgjeUfkxgFaRHjaaFXwZ4ijj2JxNRD9T5sbDEXlmk3Oz6LEO98jAk0I;
    public static final /* enum */ m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm m$$X90QF0rYLrvCHaK1EYu6ovQYgfOlIczs8UK4jWqZhGofX4B7CeiqQwTENAn7q3JDP9RXnVfKp3Ofspf2nT7MBLJt5z7fThLn0;
    public static final /* enum */ m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm m$$Fj7fvHRd5STw1zwJf6OoWCDaWnY46fYQVNc2JeW1EnhHGfbr3r8pwbcyaFucm59Hr8MBX3rMu3PRxuMrvxLuiypxulmHy5kVW;
    public static final /* enum */ m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm m$$SUxn7swxynizGb0tBeBiopKn5Gbk3onBswlqAMaGeHUWima4FyBg7nIlWIlJkHzUXUzArCePaFDJAH2GC4V6ad8aVMZsDTHsu;
    public static final /* enum */ m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm m$$uCzsH6lzdOhIpIycB7oIhmtOFzQ05IY6MbG5Vu8TQzWKIsSPV7SGGsRVwhJhavIvwKvLf17zUCPUw7oT29xQnpATOcGArc7nM;
    public static final /* enum */ m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm m$$VtwCqdzXgNXG3fWH20WhjeAdb35KlKglOOHwxkOjYS5xvROXHZ6SewtZiIYDUBEpVW7vKFmH4onADTW3OP9poJozhMNvlmAxl;
    public final String m$$xJwOkoukUhKKGOmcTSzDdSu8LW9jg2OAz7L7ce4yu7LFu6ZEX5CjNNUHnLZYCSKvYSvE80smohX6AGuGSf9GwpJM4XiRZzhVf;
    public final Path m$$8CRT6HAHSZADDcKRDF1CloKb7HbzDutE1P7jgqLt5uehfMImANiJWxksjX6doOxnyMDuHCEbpqGN3xb16bPaxdvSM4V7yY9FO;
    public static final /* synthetic */ m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm[] m$$Zvx4LYaHLinf1RmYfN72IATGu4x1Up8SZG4UwT4XjlrCszVCn4wyWsNJNRIQWfZM5uRbdCZhmBLqzjfgpnZoCc5FnXHMBz1Sz;
    public static final String[] a;
    public static final String[] b;
    public static final long e;
    public static final Object[] h;
    public static final String[] i;

    @Override
    public String getName() {
        return this.m$$xJwOkoukUhKKGOmcTSzDdSu8LW9jg2OAz7L7ce4yu7LFu6ZEX5CjNNUHnLZYCSKvYSvE80smohX6AGuGSf9GwpJM4XiRZzhVf;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.m$$xJwOkoukUhKKGOmcTSzDdSu8LW9jg2OAz7L7ce4yu7LFu6ZEX5CjNNUHnLZYCSKvYSvE80smohX6AGuGSf9GwpJM4XiRZzhVf = var3_2;
        this.m$$8CRT6HAHSZADDcKRDF1CloKb7HbzDutE1P7jgqLt5uehfMImANiJWxksjX6doOxnyMDuHCEbpqGN3xb16bPaxdvSM4V7yY9FO = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a("\u00a4", (Object)m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud.m$$EcDURsPSgIu1oYF2agI7bQWlsuxqYwM5OnJJUo4dNH4WNJXsB1gb59849F6790Ugvg0KMzL7yxKh5Do6B67wHJfyHo3TnweJW, (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a("\u00a4", (Object)var3_2, (long)1367820830728074L), (long)1181147767157682L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.h = new Object[24];
                    m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.i = new String[24];
                    m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a();
                    var7 = new String[15];
                    var5_1 = 0;
                    var4_2 = "\u008d\u009ex\u00b4\u00d0\u0085\u00e8\u0005\u00b5\u00b3\u00bb\u00c2\u00f8\u0005-\u0003\u0088\u00d0\u009a\u0007\u0005?I\u0084\u00f2\u0087\u00a8\u0006\u00e6\u001f\u00f2\u009a\u0092\u000b\u0006\u00d6K\u00d4\u0014R\u00de\u0006\u00de\u00fa\u00f4K\u00efy\u0003\u0004\u0087\u00cc\n\u00ec\u00fc{f\u00d0\u0088\u00b2HC\u001f\u0003XVg\u0007g\u007fjJnW\u0097\u0007\u00bb\u00f2\u00d1\u00ff\u001d\u00e5\u00fd\b\u0014\u00c0\u00b0\u00a0\u00d0\u001f\u0083~";
                    var6_3 = "\u008d\u009ex\u00b4\u00d0\u0085\u00e8\u0005\u00b5\u00b3\u00bb\u00c2\u00f8\u0005-\u0003\u0088\u00d0\u009a\u0007\u0005?I\u0084\u00f2\u0087\u00a8\u0006\u00e6\u001f\u00f2\u009a\u0092\u000b\u0006\u00d6K\u00d4\u0014R\u00de\u0006\u00de\u00fa\u00f4K\u00efy\u0003\u0004\u0087\u00cc\n\u00ec\u00fc{f\u00d0\u0088\u00b2HC\u001f\u0003XVg\u0007g\u007fjJnW\u0097\u0007\u00bb\u00f2\u00d1\u00ff\u001d\u00e5\u00fd\b\u0014\u00c0\u00b0\u00a0\u00d0\u001f\u0083~".length();
                    var3_4 = 7;
                    var2_5 = -1;
lbl10:
                    // 2 sources

                    while (true) {
                        v0 = 124;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "\"gM\u00a0q\u0005u\u00c3\u00870,";
                        var6_3 = "\"gM\u00a0q\u0005u\u00c3\u00870,".length();
                        var3_4 = 5;
                        var2_5 = -1;
lbl25:
                        // 2 sources

                        while (true) {
                            v0 = 123;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl31:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl88
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 118;
                                break;
                            }
                            case 1: {
                                v15 = 75;
                                break;
                            }
                            case 2: {
                                v15 = 116;
                                break;
                            }
                            case 3: {
                                v15 = 10;
                                break;
                            }
                            case 4: {
                                v15 = 38;
                                break;
                            }
                            case 5: {
                                v15 = 31;
                                break;
                            }
                            default: {
                                v15 = 87;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var8_6;
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
                } while (v10 > var8_6);
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
            m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a = var7;
            m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.b = new String[15];
            break block22;
lbl103:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 8762966220248789308L;
        ** while (true)
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.e = -3057559754379546310L ^ var0_7;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.m$$v33dzTTzUOqpVDvK0GWgM9Jgtd96JFMDcdvE6O3juNUgjeUfkxgFaRHjaaFXwZ4ijj2JxNRD9T5sbDEXlmk3Oz6LEO98jAk0I = new m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$1(m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(-9157, 1803));
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.m$$X90QF0rYLrvCHaK1EYu6ovQYgfOlIczs8UK4jWqZhGofX4B7CeiqQwTENAn7q3JDP9RXnVfKp3Ofspf2nT7MBLJt5z7fThLn0 = new m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$2(m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(-9159, 26479));
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.m$$Fj7fvHRd5STw1zwJf6OoWCDaWnY46fYQVNc2JeW1EnhHGfbr3r8pwbcyaFucm59Hr8MBX3rMu3PRxuMrvxLuiypxulmHy5kVW = new m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3(m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(-9154, 27125));
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.m$$SUxn7swxynizGb0tBeBiopKn5Gbk3onBswlqAMaGeHUWima4FyBg7nIlWIlJkHzUXUzArCePaFDJAH2GC4V6ad8aVMZsDTHsu = new m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$4(m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(-9168, -31296));
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.m$$uCzsH6lzdOhIpIycB7oIhmtOFzQ05IY6MbG5Vu8TQzWKIsSPV7SGGsRVwhJhavIvwKvLf17zUCPUw7oT29xQnpATOcGArc7nM = new m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$5(m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(-9163, 15840));
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.m$$VtwCqdzXgNXG3fWH20WhjeAdb35KlKglOOHwxkOjYS5xvROXHZ6SewtZiIYDUBEpVW7vKFmH4onADTW3OP9poJozhMNvlmAxl = new m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$6(m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(-9156, 13222));
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.m$$Zvx4LYaHLinf1RmYfN72IATGu4x1Up8SZG4UwT4XjlrCszVCn4wyWsNJNRIQWfZM5uRbdCZhmBLqzjfgpnZoCc5FnXHMBz1Sz = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a("\u00ee", (long)1006726468090263L);
    }

    public static m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm[] values() {
        return (m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm[])m$$Zvx4LYaHLinf1RmYfN72IATGu4x1Up8SZG4UwT4XjlrCszVCn4wyWsNJNRIQWfZM5uRbdCZhmBLqzjfgpnZoCc5FnXHMBz1Sz.clone();
    }

    public static m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm valueOf(String string) {
        return (m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm)((Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a("\u00ee", m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.class, (Object)string, (long)1241157836564638L));
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(l);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(l);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(clazz3, string2, clazz2)) != null) {
                    m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.b(978910420618194L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(l);
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
                clazz3 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.b(978910420618194L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.b(978910420618194L);
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

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ea' || c == 'T' || c == '\u00c3' || c == '\u00f8') {
                field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ea' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ee' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFDC3B) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 80;
                case 1 -> 205;
                case 2 -> 28;
                case 3 -> 88;
                case 4 -> 186;
                case 5 -> 43;
                case 6 -> 183;
                case 7 -> 144;
                case 8 -> 157;
                case 9 -> 76;
                case 10 -> 212;
                case 11 -> 20;
                case 12 -> 91;
                case 13 -> 174;
                case 14 -> 87;
                case 15 -> 140;
                case 16 -> 166;
                case 17 -> 198;
                case 18 -> 246;
                case 19 -> 114;
                case 20 -> 62;
                case 21 -> 12;
                case 22 -> 148;
                case 23 -> 81;
                case 24 -> 77;
                case 25 -> 135;
                case 26 -> 170;
                case 27 -> 222;
                case 28 -> 232;
                case 29 -> 182;
                case 30 -> 218;
                case 31 -> 181;
                case 32 -> 214;
                case 33 -> 137;
                case 34 -> 204;
                case 35 -> 150;
                case 36 -> 109;
                case 37 -> 42;
                case 38 -> 60;
                case 39 -> 10;
                case 40 -> 34;
                case 41 -> 111;
                case 42 -> 146;
                case 43 -> 131;
                case 44 -> 149;
                case 45 -> 240;
                case 46 -> 102;
                case 47 -> 153;
                case 48 -> 31;
                case 49 -> 237;
                case 50 -> 66;
                case 51 -> 247;
                case 52 -> 139;
                case 53 -> 99;
                case 54 -> 95;
                case 55 -> 57;
                case 56 -> 223;
                case 57 -> 18;
                case 58 -> 147;
                case 59 -> 46;
                case 60 -> 106;
                case 61 -> 128;
                case 62 -> 85;
                case 63 -> 15;
                case 64 -> 33;
                case 65 -> 68;
                case 66 -> 59;
                case 67 -> 14;
                case 68 -> 48;
                case 69 -> 159;
                case 70 -> 221;
                case 71 -> 78;
                case 72 -> 73;
                case 73 -> 55;
                case 74 -> 210;
                case 75 -> 172;
                case 76 -> 168;
                case 77 -> 249;
                case 78 -> 13;
                case 79 -> 115;
                case 80 -> 113;
                case 81 -> 21;
                case 82 -> 105;
                case 83 -> 206;
                case 84 -> 141;
                case 85 -> 23;
                case 86 -> 224;
                case 87 -> 234;
                case 88 -> 126;
                case 89 -> 120;
                case 90 -> 58;
                case 91 -> 30;
                case 92 -> 123;
                case 93 -> 242;
                case 94 -> 236;
                case 95 -> 161;
                case 96 -> 158;
                case 97 -> 50;
                case 98 -> 93;
                case 99 -> 175;
                case 100 -> 116;
                case 101 -> 216;
                case 102 -> 5;
                case 103 -> 29;
                case 104 -> 36;
                case 105 -> 110;
                case 106 -> 44;
                case 107 -> 94;
                case 108 -> 151;
                case 109 -> 45;
                case 110 -> 145;
                case 111 -> 107;
                case 112 -> 53;
                case 113 -> 108;
                case 114 -> 16;
                case 115 -> 162;
                case 116 -> 188;
                case 117 -> 235;
                case 118 -> 143;
                case 119 -> 96;
                case 120 -> 171;
                case 121 -> 201;
                case 122 -> 184;
                case 123 -> 97;
                case 124 -> 112;
                case 125 -> 189;
                case 126 -> 89;
                case 127 -> 239;
                case 128 -> 74;
                case 129 -> 98;
                case 130 -> 129;
                case 131 -> 56;
                case 132 -> 191;
                case 133 -> 228;
                case 134 -> 134;
                case 135 -> 65;
                case 136 -> 124;
                case 137 -> 8;
                case 138 -> 194;
                case 139 -> 178;
                case 140 -> 132;
                case 141 -> 35;
                case 142 -> 61;
                case 143 -> 197;
                case 144 -> 130;
                case 145 -> 52;
                case 146 -> 64;
                case 147 -> 1;
                case 148 -> 69;
                case 149 -> 209;
                case 150 -> 200;
                case 151 -> 195;
                case 152 -> 225;
                case 153 -> 165;
                case 154 -> 203;
                case 155 -> 227;
                case 156 -> 219;
                case 157 -> 241;
                case 158 -> 169;
                case 159 -> 9;
                case 160 -> 136;
                case 161 -> 72;
                case 162 -> 121;
                case 163 -> 54;
                case 164 -> 254;
                case 165 -> 2;
                case 166 -> 248;
                case 167 -> 25;
                case 168 -> 3;
                case 169 -> 79;
                case 170 -> 41;
                case 171 -> 187;
                case 172 -> 27;
                case 173 -> 11;
                case 174 -> 253;
                case 175 -> 24;
                case 176 -> 63;
                case 177 -> 217;
                case 178 -> 125;
                case 179 -> 103;
                case 180 -> 226;
                case 181 -> 84;
                case 182 -> 213;
                case 183 -> 231;
                case 184 -> 38;
                case 185 -> 208;
                case 186 -> 155;
                case 187 -> 17;
                case 188 -> 119;
                case 189 -> 133;
                case 190 -> 0;
                case 191 -> 167;
                case 192 -> 32;
                case 193 -> 67;
                case 194 -> 238;
                case 195 -> 122;
                case 196 -> 176;
                case 197 -> 37;
                case 198 -> 90;
                case 199 -> 229;
                case 200 -> 7;
                case 201 -> 250;
                case 202 -> 233;
                case 203 -> 173;
                case 204 -> 220;
                case 205 -> 92;
                case 206 -> 71;
                case 207 -> 190;
                case 208 -> 101;
                case 209 -> 82;
                case 210 -> 207;
                case 211 -> 152;
                case 212 -> 22;
                case 213 -> 100;
                case 214 -> 51;
                case 215 -> 39;
                case 216 -> 70;
                case 217 -> 192;
                case 218 -> 160;
                case 219 -> 138;
                case 220 -> 86;
                case 221 -> 6;
                case 222 -> 163;
                case 223 -> 185;
                case 224 -> 180;
                case 225 -> 243;
                case 226 -> 164;
                case 227 -> 211;
                case 228 -> 26;
                case 229 -> 40;
                case 230 -> 127;
                case 231 -> 252;
                case 232 -> 202;
                case 233 -> 75;
                case 234 -> 255;
                case 235 -> 196;
                case 236 -> 251;
                case 237 -> 83;
                case 238 -> 156;
                case 239 -> 230;
                case 240 -> 177;
                case 241 -> 179;
                case 242 -> 199;
                case 243 -> 142;
                case 244 -> 47;
                case 245 -> 154;
                case 246 -> 4;
                case 247 -> 19;
                case 248 -> 193;
                case 249 -> 244;
                case 250 -> 117;
                case 251 -> 118;
                case 252 -> 104;
                case 253 -> 245;
                case 254 -> 49;
                default -> 215;
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
            m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    public static int a(long l) {
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
            case 0 -> 35;
            case 1 -> 54;
            case 2 -> 10;
            case 3 -> 29;
            case 4 -> 43;
            case 5 -> 21;
            case 6 -> 23;
            case 7 -> 57;
            case 8 -> 53;
            case 9 -> 0;
            case 10 -> 38;
            case 11 -> 56;
            case 12 -> 49;
            case 13 -> 25;
            case 14 -> 11;
            case 15 -> 33;
            case 16 -> 27;
            case 17 -> 20;
            case 18 -> 1;
            case 19 -> 37;
            case 20 -> 55;
            case 21 -> 30;
            case 22 -> 17;
            case 23 -> 51;
            case 24 -> 52;
            case 25 -> 26;
            case 26 -> 34;
            case 27 -> 58;
            case 28 -> 62;
            case 29 -> 41;
            case 30 -> 60;
            case 31 -> 18;
            case 32 -> 5;
            case 33 -> 15;
            case 34 -> 3;
            case 35 -> 9;
            case 36 -> 47;
            case 37 -> 31;
            case 38 -> 59;
            case 39 -> 44;
            case 40 -> 19;
            case 41 -> 16;
            case 42 -> 7;
            case 43 -> 32;
            case 44 -> 46;
            case 45 -> 39;
            case 46 -> 6;
            case 47 -> 50;
            case 48 -> 8;
            case 49 -> 12;
            case 50 -> 14;
            case 51 -> 28;
            case 52 -> 63;
            case 53 -> 13;
            case 54 -> 24;
            case 55 -> 45;
            case 56 -> 40;
            case 57 -> 36;
            case 58 -> 4;
            case 59 -> 22;
            case 60 -> 48;
            case 61 -> 61;
            case 62 -> 42;
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
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.i[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = h;
        h[0] = "\u0001y\u000fYBw\u000fpHQElBq\u0005\u0010]( igG\\^'Mr^sl!_f@YY:M\u0019r~)\u0001O\u0012Cd\u007f\u000f]lZyN:.EW\u001cm\u001f[f\rZH4MVaH\u007f\u0001V\u0011{Zj\tfY]\u0013\u007f(LEpzl#zowds\u001eQdP{P.wgf\u007f <\u007fJZF";
        objectArray[1] = "\u0012x5?\u0014\\ [;6ST'@v7\u001e\u0015?\u0004\u0014/|B>r\u0013\u000bi[\u0011@\u0015\u0019}E;u\u000e\u000b\u0002w\u001c\u00055\t\tF\u0006S;\u001bw_\u001bb\u000eh^R~A+\u001d}\b8d\u0000\u000bMd*S5\u0010\n~8F= BXqS\u001c\n^u\u0018@\u0017<tr\u0006_*\u0017\u007fU\u0019|\u001a1|c\u001d\f\b9Q_$\u000f";
        objectArray[2] = "a\u0003GEJtj\fV\n7ly\u000b_C";
        objectArray[3] = Boolean.TYPE;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.i[3] = "java/lang/Boolean";
        objectArray[4] = "X\u001a\u0019`MyF\u0012\u0003//cQ\u001a\u0003d";
        objectArray[5] = "!::l\u0003R-2;'JZ1:9l.N-;\u0018 \u000eX!!";
        objectArray[6] = Void.TYPE;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.i[6] = "java/lang/Void";
        objectArray[7] = "u4;(_h{=| Xs6<1aCt@\u0016 r\u0007W/iO\frR@g /CQq\u0018brA3z>^\bQBs\t!\u0015\u0000aW\u0001W(@\u007f-<M\u0016|\u007fW'm$Ni^<C/\\>\\\u0002`qwfU0Y\u0007\u0002Fh\u000bR\u000e`}R\u0017p0r?QiW\u000f_]s\u000bt6G";
        objectArray[8] = "P\u007f!Gi\u0017\\w \f \u001f@\u007f\"GD\u000b\\~\t\u0005k\u0015V~8";
        objectArray[9] = ">;*HzP=5rO=R1t\fH V";
        objectArray[10] = "\u0012\u001dp\u000eQU\u0019\u0012aA:W\r\u0011";
        objectArray[11] = "myIf-\u001dfvX)@\u001dfkL";
        objectArray[12] = "\u001b]\u001d~X))~\u0013w\u001f!.e^vR`6!<n077W;J%.\u0018e=X102P&JN\u0002\u0015 \u001dHE3\u000fv\u0013Z;*\u0012G&)\u0012'wd\u0003\\1}1A(J\u0001\u0011#v\u001dQF\u000b1c\u0015a\u000e-xv4K\u0012\u0000\u0011e?}8\u0007\u000fz\u0002V3 \u0010Y2p0\u0016\u0014) x\u001d*-*";
        objectArray[13] = "d(u0uzo'd\u007f\u0014td,`%";
        objectArray[14] = "\"i\u001e\u000e\"Psh\u0010i)L`-\b\"0\u00101J$'1+\u0011S\u0013\u0000w=\u0006dDP60w['#/\u001c1d;\u0000\u0014\u001a\u0017M5 +\r\u001ch*\u0016.\t)K<4\u000e$\u001eE/\u0010.\u00007O<\u000e)\"r_0\"\u0013\r\u001e%\u00106<2vNN\u00163,\u0016/-W\u0005:sW\t\b4+\fZuY*\u00180q\nSu\u0000}\u0015";
        objectArray[15] = "?\u0003\tl\u001c\u001c}\u0019\\=c\u0011a7\u0007|\u000e\u0017M\u001a\u001bncWtN\t3\u0004\u0010zM\u000e\u0003Z\u001do\u001c\u001fr\u0018\u0007:M`";
        objectArray[16] = " &\u0019BQv\"(\u0010_>ss6\u0018E@d\u001et\u000fHQvo6\u0015\u001d\u0000\t &\u0019BQv\"(\u0010_>";
        objectArray[17] = "Op\u0011I[JK|\u0004E'\n\u0019{\bV`\u001ap \n\u0007\u0019\u001a\ncDBGtIo\u001cTX\u0005\u000buI\u0005'K\u001f{\u0007G\u0019O\u0013n\u000b;";
        objectArray[18] = "\u001b{ VM!Jz.1]x\u0011z&J#!\u0013\u007f7U\\+Lgz1";
        objectArray[19] = "bDI'e$ ^\u001cv\u001a)<pG7w/\u0010][%\u001al+]O7k.1\b\u001eH";
        objectArray[20] = "5\u007f7\u0010\f+\u007f\u007f=F}\u007fbt\u0001\u0004\u001ancb%\u000f}/~q6\u0001\fmd$g~Dfgw&\u000f\u0006|2&YB\u0001+ha&D\u001c}4\u0018";
        objectArray[21] = ".yM*\u0002hnd\u001a}|?i\u007fB\u0002\u00076u\u0018\u0019xLnw%A%\u0011o\u0013$[}\u001a(l\"F+FQ";
        objectArray[22] = "\f_\u0010MV#NEE\u001c)?LR\u0010FR\u0013ZI\u001eXD\u0019\\T\u0014\"\u0010\"\\@\u0006SR8\t\u0011y\u0018E)K@\u001cRC#\b/";
        Object[] objectArray2 = objectArray;
        objectArray[23] = "E\u0000<K\u000bX\u0014\u00012,\n\u0005W:>I\bh\u0012\f>C\u001a\u0019P\u0016k\u0012e";
    }

    @Override
    public void fromJson(JsonElement jsonElement) {
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a("\u00a4", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$pjpeQua4PAB6Zbpcv5B1EK6PACkuUkszPZ6igJ4EheKtCpGOS5rhssN6LeWpAJuyJeZRtolTY1xU3jouBuH7hlh4UdEG0zCIQ, (Object)jsonElement, (long)1533599369238807L);
    }

    public static m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm m$$IY50PTNA4tWJl1HXAkpsWybaNO83dt7OhCDWsz4WSbcCQ6lpZyOf1yjxaMIjbNW3F4wL5yGVdJtpvysZ7t2RT90VuLljL08CF(String string) {
        for (CallSite callSite : m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a("\u00ee", (long)1316025164785081L)) {
            try {
                if (m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a("\u00a4", (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a("\u00a4", (Object)callSite, (long)1685755003516898L), (Object)string, (long)1611999455482848L) == false) continue;
                return callSite;
            }
            catch (class_151 class_1512) {
                throw m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(class_1512);
            }
        }
        return null;
    }

    public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(JsonObject jsonObject) {
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a("\u00a4", (Object)jsonObject, (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(-9155, -18483), (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(-9165, 8458), (long)1416727902568360L);
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a("\u00a4", (Object)jsonObject, (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a(-9161, 28759), (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a("\u00a4", (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.a("\u00a4", (Object)this, (long)1685755003516898L), (Object)Locale.ROOT, (long)1122085393102567L), (long)1416727902568360L);
    }

    public static String m$$peiNMs4YJOVEU1vRohimiJr9PYLJnpa7srmEbVrRqIQdXq2dXZNxRzRfWHmaoUQ0APu9seqauo7RT9WNeIDPW7UkfDe7rwLPJ(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{29, -42, 7, 107, 16, 53, -41, 72};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 8]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    public Path m$$PJQdW37m52fpjzycMUJyg804GAFRYIRRKOHlHyOl1Y7deLpst8QlnKyuG96krCnZwFxCC09wYupTK5RgNmgt7mOe2QTTu4fPv() {
        return this.m$$8CRT6HAHSZADDcKRDF1CloKb7HbzDutE1P7jgqLt5uehfMImANiJWxksjX6doOxnyMDuHCEbpqGN3xb16bPaxdvSM4V7yY9FO;
    }

    public static /* synthetic */ m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm[] m$$0uCtxuWYFuCUNna3UBy91rX3FZBktuyFaPrSPHAoeXuWwjamVAUJLZXRqjhsRAomJ6BMCWeZ8mWxZ2S3wwDR2P6AR7JtipCHG() {
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm[] m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8PcknmArray = new m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm[(int)e];
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8PcknmArray[0] = m$$v33dzTTzUOqpVDvK0GWgM9Jgtd96JFMDcdvE6O3juNUgjeUfkxgFaRHjaaFXwZ4ijj2JxNRD9T5sbDEXlmk3Oz6LEO98jAk0I;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8PcknmArray[1] = m$$X90QF0rYLrvCHaK1EYu6ovQYgfOlIczs8UK4jWqZhGofX4B7CeiqQwTENAn7q3JDP9RXnVfKp3Ofspf2nT7MBLJt5z7fThLn0;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8PcknmArray[2] = m$$Fj7fvHRd5STw1zwJf6OoWCDaWnY46fYQVNc2JeW1EnhHGfbr3r8pwbcyaFucm59Hr8MBX3rMu3PRxuMrvxLuiypxulmHy5kVW;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8PcknmArray[3] = m$$SUxn7swxynizGb0tBeBiopKn5Gbk3onBswlqAMaGeHUWima4FyBg7nIlWIlJkHzUXUzArCePaFDJAH2GC4V6ad8aVMZsDTHsu;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8PcknmArray[4] = m$$uCzsH6lzdOhIpIycB7oIhmtOFzQ05IY6MbG5Vu8TQzWKIsSPV7SGGsRVwhJhavIvwKvLf17zUCPUw7oT29xQnpATOcGArc7nM;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8PcknmArray[5] = m$$VtwCqdzXgNXG3fWH20WhjeAdb35KlKglOOHwxkOjYS5xvROXHZ6SewtZiIYDUBEpVW7vKFmH4onADTW3OP9poJozhMNvlmAxl;
        return m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8PcknmArray;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

