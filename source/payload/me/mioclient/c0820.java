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
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1;
import me.mioclient.m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2;
import me.mioclient.m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB;
import net.minecraft.class_151;

abstract class m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8
extends Enum {
    public static final /* enum */ m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$3W22QRgFdH2CpV43nX9NLV7hhy9spiLSdiHTZRbNHBPnoEZPzSjyat2tSD4rtgUS1RFuQMIs2si249Vt8TTeAyVcTg3ETgRSK;
    public static final /* enum */ m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$f9Xx3SQcrLGa3GbrEWSdXroUSA78AvFvoPqIgA3J7m1nhVgP3eAJrl7vMZhr18MeY40UhgbPtS26TpiHA2PEPcWekonoXMFfX;
    public static final /* enum */ m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$BVcXdDDxeR6sprxjh5UaTVwBrjei4nLEPQrrOlCdQX71LHIjfvNjsvchtIhBYBSdEX1bDsXrI11OuGP4QXFfZDJeYRWcQX7wx;
    public static final /* synthetic */ m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8[] m$$NkKyPUjOzRzTyYhibcT7Hy4q9NmL2GoRW0AbNGytJURSiShpOzxqfXQZFPCniTom8tTndzUPwpajeeOefPgHsxxcVhTueqnkM;
    public static final Object[] a;
    public static final String[] b;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a = new Object[13];
            m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b = new String[13];
            m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a();
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "J> \u000e\u0005T2!\u0012\u001d\u0006E>(\u000e\fY";
            var5_3 = "J> \u000e\u0005T2!\u0012\u001d\u0006E>(\u000e\fY".length();
            var2_4 = 4;
            var1_5 = -1;
lbl10:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl12:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 68;
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
                            v11 = 66;
                            break;
                        }
                        case 1: {
                            v11 = 63;
                            break;
                        }
                        case 2: {
                            v11 = 34;
                            break;
                        }
                        case 3: {
                            v11 = 30;
                            break;
                        }
                        case 4: {
                            v11 = 13;
                            break;
                        }
                        case 5: {
                            v11 = 79;
                            break;
                        }
                        default: {
                            v11 = 113;
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
        m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$3W22QRgFdH2CpV43nX9NLV7hhy9spiLSdiHTZRbNHBPnoEZPzSjyat2tSD4rtgUS1RFuQMIs2si249Vt8TTeAyVcTg3ETgRSK = new m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1();
        m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$f9Xx3SQcrLGa3GbrEWSdXroUSA78AvFvoPqIgA3J7m1nhVgP3eAJrl7vMZhr18MeY40UhgbPtS26TpiHA2PEPcWekonoXMFfX = new m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2();
        m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$BVcXdDDxeR6sprxjh5UaTVwBrjei4nLEPQrrOlCdQX71LHIjfvNjsvchtIhBYBSdEX1bDsXrI11OuGP4QXFfZDJeYRWcQX7wx = new m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$3();
        m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$NkKyPUjOzRzTyYhibcT7Hy4q9NmL2GoRW0AbNGytJURSiShpOzxqfXQZFPCniTom8tTndzUPwpajeeOefPgHsxxcVhTueqnkM = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a("\u00dc", (long)840780752142079L);
    }

    public static m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8[] values() {
        return (m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8[])m$$NkKyPUjOzRzTyYhibcT7Hy4q9NmL2GoRW0AbNGytJURSiShpOzxqfXQZFPCniTom8tTndzUPwpajeeOefPgHsxxcVhTueqnkM.clone();
    }

    public static m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 valueOf(String string) {
        return (m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8)((Object)m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a("\u00dc", m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.class, (Object)string, (long)665731600307156L));
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a(clazz3, string2, clazz2)) != null) {
                    m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b(625243751163098L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a(l);
        Object object = a[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = b[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b(625243751163098L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b(625243751163098L);
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

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00aa' || c == '\u00e4' || c == 'w' || c == 'g') {
                field = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00aa' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int a(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (b[n3] != null) {
            return n3;
        }
        Object object = a[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 53;
            case 1 -> 3;
            case 2 -> 24;
            case 3 -> 32;
            case 4 -> 7;
            case 5 -> 23;
            case 6 -> 19;
            case 7 -> 59;
            case 8 -> 61;
            case 9 -> 38;
            case 10 -> 49;
            case 11 -> 6;
            case 12 -> 31;
            case 13 -> 27;
            case 14 -> 43;
            case 15 -> 55;
            case 16 -> 29;
            case 17 -> 42;
            case 18 -> 50;
            case 19 -> 35;
            case 20 -> 16;
            case 21 -> 41;
            case 22 -> 47;
            case 23 -> 30;
            case 24 -> 0;
            case 25 -> 36;
            case 26 -> 13;
            case 27 -> 1;
            case 28 -> 20;
            case 29 -> 26;
            case 30 -> 46;
            case 31 -> 58;
            case 32 -> 22;
            case 33 -> 5;
            case 34 -> 17;
            case 35 -> 4;
            case 36 -> 45;
            case 37 -> 14;
            case 38 -> 18;
            case 39 -> 60;
            case 40 -> 28;
            case 41 -> 12;
            case 42 -> 57;
            case 43 -> 34;
            case 44 -> 52;
            case 45 -> 10;
            case 46 -> 11;
            case 47 -> 8;
            case 48 -> 15;
            case 49 -> 2;
            case 50 -> 44;
            case 51 -> 21;
            case 52 -> 39;
            case 53 -> 63;
            case 54 -> 37;
            case 55 -> 51;
            case 56 -> 54;
            case 57 -> 9;
            case 58 -> 48;
            case 59 -> 62;
            case 60 -> 40;
            case 61 -> 25;
            case 62 -> 33;
            default -> 56;
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
        m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "RRbz/\u0000\\[%r(\u001b\u0011Zh3\u001f\u0001M\u0006:Q\f\u000eHo\u0015Z-:I\u0007\u001cG\b5Pn\rsw_J{\u0004x\u0010_t~zO3!Hq\u0001q)Zl\u000f<&\u0011!Tp\u007f/+\rup\u0016q%XNN\b/u\\X\u0004\u0003G.\u0019gg(X\u001f\u0007Nn\t/\u007f$Sb{_\u00157\u000eG\u001eN\u007fKR\u0013hm3\u0016Xr\u0014$\u0014\u0016xC\u007fA*\u001eh\u0004ty.\u0002H\u000f\u0018T1\u000eN\u0006\u000er/ F{\r$,Ygv.a\u001e&PR\u000f$\b]g\u000f;B~\u0003[Q\u0015dv\u0005\t];pt;UE-$\n7Z\u0000;B\u001c#zr-m7\u001c\tY\u000f'\u001eWh\u000e\n/";
        objectArray[1] = Float.TYPE;
        m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b[1] = "java/lang/Float";
        objectArray[2] = ">\u001fW^e@>\u001f@\u0002iO$T@\u001ciZ#%\u0010B?";
        objectArray[3] = "gr\u001aTD&l}\u000b\u001b9>\u007fz\u0002R";
        objectArray[4] = Integer.TYPE;
        m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.b[4] = "java/lang/Integer";
        objectArray[5] = "h;&yO\"c476$ w7";
        objectArray[6] = "^B\u0017pW&UM\u0006?:&UP\u0012";
        objectArray[7] = "2-\u001dA\u001bs\u0000\u000e\u0013H\\{\u0007\u0015^I\u0011:0\u000f\u0002\u0015CX#\u0000\u0007|lS\u00024\u0006\u0014eN';\u001f}tzXQ\u0005h}q?Q;m\u0003F\u001c/\u0007bxx\u0006T#\u001cE/>/\u001bc\u0006&\u0004\u0003:cox\nV\u0001]q&ZR\u0017\u0017zN\u0001\u0017(tQQ0\t\u0001}p&P*\u001cq\u0002V:9ATgGPE\u001d\u0000\u0011d\u001c\u0018\u0017am-;\u00187P\u0006H\u0005\u0010'\u0017\rp\u0001\f\u0007\u001ca]\u001e\u0000\u0001\u0015w{\u0000.\tht-\u0003W(eWh1(\u001fAv-'S(\u001cBKQ\r\u0014BlmY\u000bFNBy[5\u001aVT-%9\u0015\u0013BK3-5aTd\u0018\u0012FJv.1Y'\u001ds&R";
        objectArray[8] = "\u00032dr0C\b=u=QM\u00036qg";
        objectArray[9] = "%>*ydF|{-`\u0001@pakrFP\u00199pa=_#d\u007f\"f>#ou#}Fv:.g\u0001\u0002\"9pzy[g>i\u001f";
        objectArray[10] = "sW2~.\u007f(\u0013'\u0012{mot\u000f\u007fT \u0012s\u0018\\/{8VjQf\u0010%NiP\\\u0013\u001cT9`Q#\trj^rp\u0018d\nr\"\u0018\u001c{*`n\b\u0002A\u0006/G9xo\u000b@y>9U5Q{y'H\u0010\\/\u0013\nN5\u007fnp\u001b\u0011\u0015cS\u001f.M;M$ /Ofk\\\f*\u001aV+%\"(J;xc(\u007f*o)}*#G<ow}C";
        objectArray[11] = "e5\u0014n}q>q\u0001\u0002(cy6\u0010g\u0012?\u0007\u001a x\bq\f*IF!$j'K|\u0015.o\u0017LRvp\u0010t\u0012e=.d\"-l\u0015\f*\u0010\u001b_\u00130\u0019\n=\u007f\tw%-\u0010K\u0012\f,\"6h3\u0004\u0018\u0007\th#0\u0005!(g\u0014rm\u0007\u0014\u007f,6\u0004\u00071Y'\no\u0012\bz\u0010\u0014\u000e5p>=/k%Nc),mH";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "\u0000]UAg\f^\u001d\u0002\u0017\u0018\tT[RMt;\u0000\u0018\b\u0015\u0018VSD\u000eV`\u0003\u0006\u001fJ*\"\u0011\u0001\u001b\f\u0017zU\\D2";
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public float m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(String string, boolean bl) {
        float f;
        m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
        try {
            m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 = this;
            f = bl ? (float)m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a("\u00e8", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1772, (Object)string, (long)899971393017731L) : m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB.m$$0EamhOBKO53b7FTInsEKAyYgGGs1ndX2QqsiesT60uJawO4khwrKtVpAJczxbf1xb9KFfXAnXjgyrkilgORYZDqRlXryxl2MO.m$$ZaD3M0jv7OKLL5o46rdCtPy8hIHUWkQwHiymBJrAs8Rx7AkYyizdJsbYM7bheQ2XDJQqqsI7QTERMWze3ESAiWCzZZRMyzfVV(string);
        }
        catch (class_151 class_1512) {
            throw m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a(class_1512);
        }
        return (float)m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.a("\u00e8", (Object)((Object)m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8), (float)f, (long)742427766659429L);
    }

    public abstract float m$$VQeBiYQFF92st4KpYnl7JJZWvgzGjBP4Dd9SFTh4QWYtzxAIcX5Qp3MUZowrwkKm0ljNF9ZAlkex9P3KyEVeoeW2idm8qJEa8(float var1);

    public static /* synthetic */ m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8[] m$$vhmWxZZXrM6Qj1Ldc7g3vPi2W4X37M4joxi9bUfPKwPcUVwDJEuL0xmhAWKqbNbvCEGqbfwXaPmQ50GluiqYGISbM2RppUSSu() {
        return new m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8[]{m$$3W22QRgFdH2CpV43nX9NLV7hhy9spiLSdiHTZRbNHBPnoEZPzSjyat2tSD4rtgUS1RFuQMIs2si249Vt8TTeAyVcTg3ETgRSK, m$$f9Xx3SQcrLGa3GbrEWSdXroUSA78AvFvoPqIgA3J7m1nhVgP3eAJrl7vMZhr18MeY40UhgbPtS26TpiHA2PEPcWekonoXMFfX, m$$BVcXdDDxeR6sprxjh5UaTVwBrjei4nLEPQrrOlCdQX71LHIjfvNjsvchtIhBYBSdEX1bDsXrI11OuGP4QXFfZDJeYRWcQX7wx};
    }

    public static String m$$pYrUrEFI3amgo0h2mGRvK7caU24KVT71YctGCLyljpGjLXAWnC9t1xCB6JUsG8ATUbdoE7eeZ0TQaKV8HwfTIvkahgHXDHqar(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{16, 39, 54, -73, 8, -24, 14, -33, -120, 81, 81};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 11]);
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
            return MethodHandles.lookup().findStatic(m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

