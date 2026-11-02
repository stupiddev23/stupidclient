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
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$1;
import me.mioclient.m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2;
import me.mioclient.m$$ai2OPmCv1Ik4Bf9MmMIhWdABomxdU9F78feCd0tTx0o2LclrgFD4fPbSdLMlzTFtzsZYcmSUSC7Yf9GKFuBGWqaoZ9eM43gC5;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$oMoOMgRAwiQ4BbVrGsyafEGL4NJepWrN28oajQW6MO0GQymBb15lm6Rdxlp3ncVyg91C1X03F6tgpnwsaxZEWyyTWEXb8xSlS;
import me.mioclient.m$$rbBYh1zLbIqdtCBaQSLaCb7i2FWgGuGykBiJAgNQxajd0XOaas5tNQPhObIUqfW7HyJYhh5b7b8LjDEciauc8oS83V5CDFijV;
import net.minecraft.class_151;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_476;
import net.minecraft.class_495;

public class m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O
extends Enum
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82,
m$$ai2OPmCv1Ik4Bf9MmMIhWdABomxdU9F78feCd0tTx0o2LclrgFD4fPbSdLMlzTFtzsZYcmSUSC7Yf9GKFuBGWqaoZ9eM43gC5 {
    public static final /* enum */ m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O m$$h6mD89I6DBCe6VyHNzEULL1gQoxBBN1PgaTpRk0dHz77sjRZRCprQfhHMNjrJpwMFGUqU0Yh4Jiz2LjbagyAneRXbvskBpyqV;
    public static final /* enum */ m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O m$$xg1hp3AMMNrDkyG7ctm95Z5ChT2MsVCnwb78BZQoEVsUxYJea28PXaz51nj9IrNk5jmbIjZlKUa4iShiHzaaTtKNn2uI4g9D0;
    public static final /* enum */ m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O m$$3RCMxcHokxRSpQ4IUXSOqGzB3LyySK5GQfJgejxXXFioiwN6Iv81osFz9AHu4sbPpCmcnkxA5R23OJVf9k99L3idC0A7tRsok;
    public static final /* enum */ m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O m$$8NsN0ikfqFldtED5kU3uOrLP3267AxnSUs6ov6ubCDNQAimz13xCsSLTAGnoodwpdGRPP2NFlQIemiEkb9FQAdpCKNWFIsv0J;
    public static final m$$rbBYh1zLbIqdtCBaQSLaCb7i2FWgGuGykBiJAgNQxajd0XOaas5tNQPhObIUqfW7HyJYhh5b7b8LjDEciauc8oS83V5CDFijV m$$ueMDwH7Eu4HOKzpvFeWN8ObBPEEmvfa7Hbk3HFMrcF8DCnbMVQ8Qelbls4OGSPMdRONCBHFl0EvoNDr3XvCQB2MPYH7KhqhnV;
    public static final m$$oMoOMgRAwiQ4BbVrGsyafEGL4NJepWrN28oajQW6MO0GQymBb15lm6Rdxlp3ncVyg91C1X03F6tgpnwsaxZEWyyTWEXb8xSlS m$$RbthGzsNP3yoPgAcDuUkncLhUMarFvGUIpivMB6MFS7C1vUKBZ0GMIrDTLvI5C5VJEV70QnBYFBglL3CGG4WNrDTOFQ8erEfc;
    public final String m$$j9dpyDyZfg51VeUEjxDF7PBLr57JZaGpAcggIlk18R6Dzt1MWD2j3DhV9xkdSVjcRzqCuEaGXFO5pMpi3FzzNfdBdBmasIEu9;
    public final class_1792 m$$0KfoNejgMFX6HEJ8wFplzuSbLmikKRVHjpnsJG0UXi6ZdkKfyK41Nwlm5kD9yVfIStImN5CAjF2Qfqpxjc9TjZEGgJSFF1UdX;
    public static final /* synthetic */ m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O[] m$$jVVnTSGqZKCFeIlTklBJThmNz94ZVxk5IOucR89EftKTq7xzi8QnJSRZzT1oWYpcQeexJAYNDYTNq7NysDJNHDherYfUybAi1;
    public static final Object[] c;
    public static final String[] d;

    @Override
    public String getName() {
        return this.m$$j9dpyDyZfg51VeUEjxDF7PBLr57JZaGpAcggIlk18R6Dzt1MWD2j3DhV9xkdSVjcRzqCuEaGXFO5pMpi3FzzNfdBdBmasIEu9;
    }

    /*
     * WARNING - void declaration
     */
    public m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.m$$j9dpyDyZfg51VeUEjxDF7PBLr57JZaGpAcggIlk18R6Dzt1MWD2j3DhV9xkdSVjcRzqCuEaGXFO5pMpi3FzzNfdBdBmasIEu9 = var3_2;
        this.m$$0KfoNejgMFX6HEJ8wFplzuSbLmikKRVHjpnsJG0UXi6ZdkKfyK41Nwlm5kD9yVfIStImN5CAjF2Qfqpxjc9TjZEGgJSFF1UdX = var4_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.c = new Object[27];
                m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.d = new String[27];
                m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a();
                var0 = new String[8];
                var4_1 = 0;
                var3_2 = "0!\u000e&\u001eF\u0005#/\n3\u001f\u000742\u0007%\u0006B\f\u000742\u0007%\u0006B\f\u00060!\u000e&\u001eF\u000645\r\"\u001dN";
                var5_3 = "0!\u000e&\u001eF\u0005#/\n3\u001f\u000742\u0007%\u0006B\f\u000742\u0007%\u0006B\f\u00060!\u000e&\u001eF\u000645\r\"\u001dN".length();
                var2_4 = 6;
                var1_5 = -1;
lbl10:
                // 2 sources

                while (true) {
                    v0 = 70;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "COjS\u007f\u0006TUmB}.";
                    var5_3 = "COjS\u007f\u0006TUmB}.".length();
                    var2_4 = 5;
                    var1_5 = -1;
lbl25:
                    // 2 sources

                    while (true) {
                        v0 = 38;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl31:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
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
                            v15 = 49;
                            break;
                        }
                        case 1: {
                            v15 = 6;
                            break;
                        }
                        case 2: {
                            v15 = 56;
                            break;
                        }
                        case 3: {
                            v15 = 16;
                            break;
                        }
                        case 4: {
                            v15 = 52;
                            break;
                        }
                        case 5: {
                            v15 = 101;
                            break;
                        }
                        default: {
                            v15 = 38;
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
        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.m$$h6mD89I6DBCe6VyHNzEULL1gQoxBBN1PgaTpRk0dHz77sjRZRCprQfhHMNjrJpwMFGUqU0Yh4Jiz2LjbagyAneRXbvskBpyqV = new m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O(var0[6], 0, var0[1], class_1802.field_8288);
        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.m$$xg1hp3AMMNrDkyG7ctm95Z5ChT2MsVCnwb78BZQoEVsUxYJea28PXaz51nj9IrNk5jmbIjZlKUa4iShiHzaaTtKNn2uI4g9D0 = new m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O(var0[2], 1, var0[3], class_1802.field_8301);
        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.m$$3RCMxcHokxRSpQ4IUXSOqGzB3LyySK5GQfJgejxXXFioiwN6Iv81osFz9AHu4sbPpCmcnkxA5R23OJVf9k99L3idC0A7tRsok = new m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$1(var0[0], class_1802.field_8463);
        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.m$$8NsN0ikfqFldtED5kU3uOrLP3267AxnSUs6ov6ubCDNQAimz13xCsSLTAGnoodwpdGRPP2NFlQIemiEkb9FQAdpCKNWFIsv0J = new m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2(var0[5], class_1802.field_8255);
        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.m$$jVVnTSGqZKCFeIlTklBJThmNz94ZVxk5IOucR89EftKTq7xzi8QnJSRZzT1oWYpcQeexJAYNDYTNq7NysDJNHDherYfUybAi1 = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a("Y", (long)1787498702848252L);
        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.m$$ueMDwH7Eu4HOKzpvFeWN8ObBPEEmvfa7Hbk3HFMrcF8DCnbMVQ8Qelbls4OGSPMdRONCBHFl0EvoNDr3XvCQB2MPYH7KhqhnV = (m$$rbBYh1zLbIqdtCBaQSLaCb7i2FWgGuGykBiJAgNQxajd0XOaas5tNQPhObIUqfW7HyJYhh5b7b8LjDEciauc8oS83V5CDFijV)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$rbBYh1zLbIqdtCBaQSLaCb7i2FWgGuGykBiJAgNQxajd0XOaas5tNQPhObIUqfW7HyJYhh5b7b8LjDEciauc8oS83V5CDFijV.class);
        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.m$$RbthGzsNP3yoPgAcDuUkncLhUMarFvGUIpivMB6MFS7C1vUKBZ0GMIrDTLvI5C5VJEV70QnBYFBglL3CGG4WNrDTOFQ8erEfc = (m$$oMoOMgRAwiQ4BbVrGsyafEGL4NJepWrN28oajQW6MO0GQymBb15lm6Rdxlp3ncVyg91C1X03F6tgpnwsaxZEWyyTWEXb8xSlS)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$oMoOMgRAwiQ4BbVrGsyafEGL4NJepWrN28oajQW6MO0GQymBb15lm6Rdxlp3ncVyg91C1X03F6tgpnwsaxZEWyyTWEXb8xSlS.class);
    }

    public static m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O[] values() {
        return (m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O[])m$$jVVnTSGqZKCFeIlTklBJThmNz94ZVxk5IOucR89EftKTq7xzi8QnJSRZzT1oWYpcQeexJAYNDYTNq7NysDJNHDherYfUybAi1.clone();
    }

    public static m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O valueOf(String string) {
        return (m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O)((Object)m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a("Y", m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.class, (Object)string, (long)1372935673998777L));
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.b(classArray[i], string, clazz2);
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
            int n = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a(clazz3, string2, clazz2)) != null) {
                    m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.b(828913767139930L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a(l);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.b(828913767139930L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.b(828913767139930L);
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
            throw new RuntimeException("me/mioclient/m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O" + " : " + string + " : " + methodType.toString(), exception);
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
        MethodHandle methodHandle = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'H' || c == 'K' || c == 'C' || c == 'L') {
                field = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'H' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static int a(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 8;
            case 1 -> 39;
            case 2 -> 47;
            case 3 -> 18;
            case 4 -> 55;
            case 5 -> 2;
            case 6 -> 24;
            case 7 -> 22;
            case 8 -> 6;
            case 9 -> 10;
            case 10 -> 9;
            case 11 -> 3;
            case 12 -> 20;
            case 13 -> 23;
            case 14 -> 14;
            case 15 -> 53;
            case 16 -> 15;
            case 17 -> 17;
            case 18 -> 40;
            case 19 -> 63;
            case 20 -> 12;
            case 21 -> 58;
            case 22 -> 34;
            case 23 -> 48;
            case 24 -> 11;
            case 25 -> 45;
            case 26 -> 26;
            case 27 -> 52;
            case 28 -> 13;
            case 29 -> 33;
            case 30 -> 44;
            case 31 -> 25;
            case 32 -> 43;
            case 33 -> 31;
            case 34 -> 35;
            case 35 -> 38;
            case 36 -> 50;
            case 37 -> 57;
            case 38 -> 30;
            case 39 -> 16;
            case 40 -> 27;
            case 41 -> 62;
            case 42 -> 36;
            case 43 -> 49;
            case 44 -> 56;
            case 45 -> 37;
            case 46 -> 41;
            case 47 -> 7;
            case 48 -> 28;
            case 49 -> 42;
            case 50 -> 61;
            case 51 -> 29;
            case 52 -> 1;
            case 53 -> 46;
            case 54 -> 4;
            case 55 -> 54;
            case 56 -> 5;
            case 57 -> 21;
            case 58 -> 51;
            case 59 -> 60;
            case 60 -> 19;
            case 61 -> 32;
            case 62 -> 0;
            default -> 59;
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
        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.d[n3] = new String(cArray);
        return n3;
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void a() {
        Object[] objectArray = c;
        c[0] = "Y)H\u001a\u0016<R&YU}>F%";
        objectArray[1] = "y\u0018\u0006Nn'r\u0017\u0017\u0001\u0003'r\n\u0003";
        objectArray[2] = "\b\fx\u000b&A\u0003\u0003iD[Y\u0010\u0004`\r";
        objectArray[3] = "XM*$wkVDm,pp\u001bE mJPt\u007fr,,=rK<'HiT\u0019`\"H4v\u001fI!-sR_v+ps`D0{we\u0005N}(]h\f\u007fjx*0EqE\u001f+l[FW\u0011+1@BLxU|Feo1Ofcr^&R0ao=\r.FO\u0018a\b)lepKpQ";
        objectArray[4] = "b\u001c=!9RP?3(~ZW$~)3\u001bm\u0004\u0011\u0013aZ\u000bi\u0017'/Qo=1usTo`\u0013sZW\n'73e]W'\u0005(#\rP1`\"n^z<i\u0013y\u000e\rd \u001dVi\f8>*Dg\fe%._\u000er(#\t|Gh2\u0006\u001eMPud\u0004\u0003.{\t\u0012*tr~\u000e8\u0000\u001cX\u0006vk";
        objectArray[5] = "- Q}\u0003Q3(K2dP\"3FhBV";
        objectArray[6] = Boolean.TYPE;
        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.d[6] = "java/lang/Boolean";
        objectArray[7] = "{\u001d8%\u0015Wu\u0014\u007f-\u0012L8\u00152l&Wc\u0011C\u000e\u0017@'\u0000n.\fzU\u000eC\u001f4\fY\u001cN*OIlI '\u001b\\B5R,\u0011\u000b\"\u0012D,0w~\nt\u001c/@L\"b-\u001d|F\r'\u0000\u0004\u000e \"C=\u0006]R\t]\n;Bt,F05\nX9u:\u0011B 1[\u000e-OG\fw\u000f1";
        objectArray[8] = "\u000b\u0011\u0016(Kv\u0005\u0018Q LmH\u0019\u001caJS\u0003\u001eq\f[*V\u001f\u0001!TP\u0017\u0016L0p!\u0017\fK\u0015zT+L\t?ppS$ysr[(En\f\u0010m>C\u0001p\u001av7\u001e\\\u0012i\u007f-.J=JZ*0Y\u0014\u001as)Mh'vj\",`\u0007\u0017^\u0015>_1nuT\u0013s'`Z\b\u0012O\td";
        objectArray[9] = "fb\r+Z\u0012fb\u001awV\u001d|)\u001aiV\b{XH2\u000eI";
        objectArray[10] = Integer.TYPE;
        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.d[10] = "java/lang/Integer";
        objectArray[11] = "CTT\u001d/+H[ERN%CPA\b";
        objectArray[12] = "(8C\u001b00(8TG<?2sTY<*5\u0002\u0006\u0002nl";
        objectArray[13] = "\r;\u0000v\u001e\u000b\r;\u0017*\u0012\u0004\u0017p\u00174\u0012\u0011\u0010\u0001EoJ[";
        objectArray[14] = "Ws\u00169j{Ws\u0001eftM8\u0001{faJIP$0#";
        objectArray[15] = "(\u0000\\\u000b\r((\u0000KW\u0001'2KKI\u000125:\u001f\u0011V";
        objectArray[16] = "H #Egb\u0015\"dCXc\u001a'^A(\u007fs`zVdq\b;$\u0012*\u0003";
        objectArray[17] = "\nf=g\u001f#\u0007*;cr8Wf1k\u001e\n\u0005$n3rlPw/0\u00120Y`o\f";
        objectArray[18] = "4}\u0019\u0000F\u00041u^\u0007)\u0019rM\u0002\u0006F\u001cd}eUK\u00025c\u001e\u000e\u0015F{\u0011";
        objectArray[19] = "(5Gkb\f)1\u001d\u001a U|'\u0011]0<!1\u0002$n\u0003ej\u0010u^\u0005v5\u001e|>\u0002}6\u001b\u001anS#+@*oWyZ";
        objectArray[20] = "%#=+\u000eAfgyplE4vrj\u001dOU\n;M\u001doda^s\u0015\u007f#jfw\t_(\u0006Kh\u0005Y!\u0010mv+Q\\\u0013;uRpQ0~G-Gu\u0011;QVp(%]'\bLv\u000b{/\u000e\u001ez%o-0Bb3;S<M'%]E(mU3rn\u0017\u001e~\u00118G\\\u007f)\u00140\u0017RIs%e-\u001eAd=\u0000+\u000eZ$({pP\u001ejZ?*RCs3l'\u001d\u0011\u0018";
        objectArray[21] = "AA|*h%MCn(\u0015)T\u0011v8i/R|7-.!\u0017\u001dj/i'(";
        objectArray[22] = "\u000fY\u0014\u0010.:SP\u0003P\u0012?SO\u0019\t~\r\u0005\nDQ.Z\u0000Z\u0012\u0011w`LR\u0005\t\u0012f\\IE\u001ci=\u0002\r\u000bn";
        objectArray[23] = "K6\tKDj\u0012~\u0000\r#~O8\u000fSOL\u001c|P\u0005#*H)\u0011\bCvA>Q4";
        objectArray[24] = "\"r\u001e>Hg~|\u000b:024aM\u0014a(#|IcL\u0010y#\u001e&T%T\bH5_>c798m&j\u001f(\u0004\ffi\u001d\u00197S\u0006E7L\u0002Bhb\r\u0007o\u0000lew\u00114b\u0018t#\u000b!a\tv,H N'&\fI\u0002y\t~\u001c\u0019`O7G\u0015(=M\u0012I\u0015\u0004\u0010\r>F\u0002,^\f5bq\u0007%Wk&?u`Y<g(O,Q+\u007fM";
        objectArray[25] = "'RDW/b{\\QSW71Ase-lX6dM\u0014?c,h\t4>L\u0000JZ9kVSuW6j{Uij+ ^\u0016DGkogSSPf\u0019G6U[:\u001d%?`V\u0013,$/P~*l@-Ms\u001c\u0000q\\I\u000emi\u007f\f\u0017T\u001dkW\bih\u0017\u0011V\u0004\u001e\n\u0017k_Qm7m)~\nU^%hl\u0013/";
        Object[] objectArray2 = objectArray;
        objectArray[26] = "+{m w\u0011vy*&H\u0016}w*IxMl\u007f/vq\u0019pbV";
    }

    public class_1792 m$$0BYw3945tOifcplzDM5cgasrDnUyzZUR49yXdakYUr1Tz7rHz983u2lbZGdfvwYVfi5vvx6I4TAVnYd6whWPUkuMYPyF5aVGQ(boolean bl) {
        return this.m$$0KfoNejgMFX6HEJ8wFplzuSbLmikKRVHjpnsJG0UXi6ZdkKfyK41Nwlm5kD9yVfIStImN5CAjF2Qfqpxjc9TjZEGgJSFF1UdX;
    }

    public static /* synthetic */ m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O[] m$$TZr6MSCrKevIO6kdYemef1C6Rhi0n0NUtzKscx45r6to9CRSrdeG0ZGiLv1JwAu6UHjLCZd9n123ji0kB1BmNWHKCa95H1J4J() {
        return new m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O[]{m$$h6mD89I6DBCe6VyHNzEULL1gQoxBBN1PgaTpRk0dHz77sjRZRCprQfhHMNjrJpwMFGUqU0Yh4Jiz2LjbagyAneRXbvskBpyqV, m$$xg1hp3AMMNrDkyG7ctm95Z5ChT2MsVCnwb78BZQoEVsUxYJea28PXaz51nj9IrNk5jmbIjZlKUa4iShiHzaaTtKNn2uI4g9D0, m$$3RCMxcHokxRSpQ4IUXSOqGzB3LyySK5GQfJgejxXXFioiwN6Iv81osFz9AHu4sbPpCmcnkxA5R23OJVf9k99L3idC0A7tRsok, m$$8NsN0ikfqFldtED5kU3uOrLP3267AxnSUs6ov6ubCDNQAimz13xCsSLTAGnoodwpdGRPP2NFlQIemiEkb9FQAdpCKNWFIsv0J};
    }

    public static String m$$kUHXgjgqx5YLH1yOPUIxxaH75SAy7Ogvt0W8gyRwc9sPrCe0VkOhT34ZFN34HTolJiAQf7v4TdWcFExyyWh97brzP3l64pA1X(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-60, 106, -57, -64, 39, -56, -31, -50, -53, 108, -123};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 11]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    public int m$$rpqpcmTXT89MrNXnU7KLxCyfh7wCHer8G98quy9ZYIQze2LY4SNEvBB7T4zuXE5ZZ1BEggQy9WHVlhIkeMZvTaFbubBh3XvED(boolean bl) {
        CallSite callSite;
        block10: {
            block9: {
                callSite = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a("Q", (Object)this, (boolean)bl, (long)1695166760972166L);
                try {
                    try {
                        if (callSite != null && m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a("Q", (Object)m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a("Q", (Object)m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)1652566576115913L), (Object)callSite, (long)1555455189015793L) == false) break block9;
                    }
                    catch (class_151 class_1512) {
                        throw m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a(class_1512);
                    }
                    return -1;
                }
                catch (class_151 class_1513) {
                    throw m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a(class_1513);
                }
            }
            try {
                if (!(m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1755 instanceof class_495) && !(m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1755 instanceof class_476)) break block10;
            }
            catch (class_151 class_1514) {
                throw m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a(class_1514);
            }
            CallSite callSite2 = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a("Q", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_7512.field_7761, (long)1506405636825058L);
            while (m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a("Q", (Object)callSite2, (long)1165679412358421L) != false) {
                class_1735 class_17352 = (class_1735)m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a("Q", (Object)callSite2, (long)1888871863923357L);
                try {
                    if (m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a("Q", (Object)m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a("Q", (Object)class_17352, (long)1264828111342062L), (Object)callSite, (long)1555455189015793L) == false) continue;
                    return class_17352.field_7874;
                }
                catch (class_151 class_1515) {
                    throw m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a(class_1515);
                }
            }
        }
        return (int)m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a("Y", (Object)callSite, (boolean)m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.a("Q", (Object)m$$ueMDwH7Eu4HOKzpvFeWN8ObBPEEmvfa7Hbk3HFMrcF8DCnbMVQ8Qelbls4OGSPMdRONCBHFl0EvoNDr3XvCQB2MPYH7KhqhnV, (long)1281188515931030L), (long)1430006161503018L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

