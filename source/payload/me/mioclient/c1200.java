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
import me.mioclient.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import me.mioclient.m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO
extends m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB {
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$QRLNbV99ydYl1UxA2aooWIfO9hTudqiJ33mPMN3HqOh5KcYeFtxgldzvzEkjvesYrhBB4JeSQDyA5jqjlVBSykwjFMEtnuyJx;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$ROpn2r9dnd1wJ0LPlJFOmekzMIlYpTeWD3ArbEgDxryxF72gSa77K24pOIzY9WPQemXsY6Ncindp0XDAqZ1JUmEw6hCMsLQrY;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$AyADg0UdtiNPJeLDI2QBBIjozC7GPbjwEwmsbkzk3CpKpMMfzbu8G4zEZDJRAiKzm5SdmPsW1NVspkXtXpXJgJ8NlUNt7UrdT;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$0A5OCvkwAc35jewO41Z09eCY5IcY0kd2ZiKMidAGWV5GVqpHo9x7Bw2ZMZlTDmukHqknAgNdvxl9OmcROnZWD4ROk5HQp9C81;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String[] g;
    public static final String[] h;
    public static final Object[] i;
    public static final String[] j;

    public m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO() {
        super(m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.d(-31907, 15044), m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.d(-31908, 6272), m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ.m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus, new String[0]);
        m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.g("\u00fe", (Object)this, (long)601605611678256L);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.i = new Object[12];
            m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.j = new String[12];
            m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.g();
            var13 = new String[2];
            var11_1 = 0;
            var10_2 = "L\u00e3\u00a9\u00ec\u00e1\u00dc\u00d3\u00d3V\u009c\u00e9\u00c6\u00fe\u0087\u00181\u0083'\u00e4\u0004h_\u0003\"1\u00c7\u00ed\u00a0A?\u00a0#\u0093\u00ea\u0006\u00ae\u001f8\u00b2\u0084\u00ce";
            var12_3 = "L\u00e3\u00a9\u00ec\u00e1\u00dc\u00d3\u00d3V\u009c\u00e9\u00c6\u00fe\u0087\u00181\u0083'\u00e4\u0004h_\u0003\"1\u00c7\u00ed\u00a0A?\u00a0#\u0093\u00ea\u0006\u00ae\u001f8\u00b2\u0084\u00ce".length();
            var9_4 = 34;
            var8_5 = -1;
lbl10:
            // 2 sources

            while (true) {
                v0 = ++var8_5;
                v1 = var10_2.substring(v0, v0 + var9_4).toCharArray();
                v2 = v1.length;
                var14_6 = 0;
                v3 = 46;
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
                        v10 = 99;
                        break;
                    }
                    case 1: {
                        v10 = 72;
                        break;
                    }
                    case 2: {
                        v10 = 45;
                        break;
                    }
                    case 3: {
                        v10 = 94;
                        break;
                    }
                    case 4: {
                        v10 = 94;
                        break;
                    }
                    case 5: {
                        v10 = 73;
                        break;
                    }
                    default: {
                        v10 = 55;
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

        m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.g = var13;
        m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.h = new String[2];
        var6_7 = 1618542507056012190L;
        var4_8 = 4584437896790822179L ^ var6_7;
        m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)var4_8;
        var2_9 = 7822906633552085144L;
        var0_10 = 3796610408054425766L ^ var2_9;
        m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.g("\u00fe", (long)var0_10, (long)659622338859454L);
    }

    public static Method B(long l) {
        int n = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.y(l);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.z(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.z(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.m(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.z(254269265762386L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.n(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.z(254269265762386L);
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

    public static Field n(Class clazz, String string, Class clazz2) {
        Field field = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.m(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.n(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method n(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.m(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.n(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static String d(int n, int n2) {
        int n3 = (n ^ 0xFFFF835C) & 0xFFFF;
        if (h[n3] == null) {
            int n4;
            char[] cArray = g[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 224;
                case 1 -> 52;
                case 2 -> 111;
                case 3 -> 168;
                case 4 -> 245;
                case 5 -> 179;
                case 6 -> 44;
                case 7 -> 13;
                case 8 -> 218;
                case 9 -> 235;
                case 10 -> 181;
                case 11 -> 237;
                case 12 -> 116;
                case 13 -> 97;
                case 14 -> 131;
                case 15 -> 196;
                case 16 -> 69;
                case 17 -> 241;
                case 18 -> 12;
                case 19 -> 71;
                case 20 -> 5;
                case 21 -> 187;
                case 22 -> 155;
                case 23 -> 50;
                case 24 -> 41;
                case 25 -> 230;
                case 26 -> 149;
                case 27 -> 244;
                case 28 -> 80;
                case 29 -> 204;
                case 30 -> 54;
                case 31 -> 106;
                case 32 -> 163;
                case 33 -> 158;
                case 34 -> 203;
                case 35 -> 164;
                case 36 -> 137;
                case 37 -> 29;
                case 38 -> 136;
                case 39 -> 55;
                case 40 -> 99;
                case 41 -> 1;
                case 42 -> 210;
                case 43 -> 153;
                case 44 -> 18;
                case 45 -> 37;
                case 46 -> 117;
                case 47 -> 139;
                case 48 -> 213;
                case 49 -> 254;
                case 50 -> 135;
                case 51 -> 25;
                case 52 -> 220;
                case 53 -> 109;
                case 54 -> 48;
                case 55 -> 215;
                case 56 -> 112;
                case 57 -> 221;
                case 58 -> 130;
                case 59 -> 214;
                case 60 -> 140;
                case 61 -> 151;
                case 62 -> 123;
                case 63 -> 209;
                case 64 -> 3;
                case 65 -> 197;
                case 66 -> 66;
                case 67 -> 249;
                case 68 -> 114;
                case 69 -> 190;
                case 70 -> 73;
                case 71 -> 211;
                case 72 -> 248;
                case 73 -> 89;
                case 74 -> 183;
                case 75 -> 82;
                case 76 -> 239;
                case 77 -> 233;
                case 78 -> 219;
                case 79 -> 118;
                case 80 -> 72;
                case 81 -> 198;
                case 82 -> 113;
                case 83 -> 134;
                case 84 -> 202;
                case 85 -> 148;
                case 86 -> 17;
                case 87 -> 16;
                case 88 -> 240;
                case 89 -> 228;
                case 90 -> 56;
                case 91 -> 15;
                case 92 -> 251;
                case 93 -> 156;
                case 94 -> 192;
                case 95 -> 186;
                case 96 -> 27;
                case 97 -> 26;
                case 98 -> 150;
                case 99 -> 91;
                case 100 -> 61;
                case 101 -> 127;
                case 102 -> 184;
                case 103 -> 166;
                case 104 -> 53;
                case 105 -> 92;
                case 106 -> 19;
                case 107 -> 142;
                case 108 -> 49;
                case 109 -> 63;
                case 110 -> 138;
                case 111 -> 144;
                case 112 -> 81;
                case 113 -> 47;
                case 114 -> 177;
                case 115 -> 253;
                case 116 -> 195;
                case 117 -> 124;
                case 118 -> 132;
                case 119 -> 242;
                case 120 -> 6;
                case 121 -> 162;
                case 122 -> 77;
                case 123 -> 173;
                case 124 -> 22;
                case 125 -> 171;
                case 126 -> 152;
                case 127 -> 126;
                case 128 -> 226;
                case 129 -> 167;
                case 130 -> 74;
                case 131 -> 120;
                case 132 -> 39;
                case 133 -> 86;
                case 134 -> 35;
                case 135 -> 238;
                case 136 -> 90;
                case 137 -> 170;
                case 138 -> 174;
                case 139 -> 161;
                case 140 -> 67;
                case 141 -> 250;
                case 142 -> 236;
                case 143 -> 95;
                case 144 -> 154;
                case 145 -> 94;
                case 146 -> 34;
                case 147 -> 178;
                case 148 -> 185;
                case 149 -> 229;
                case 150 -> 31;
                case 151 -> 104;
                case 152 -> 20;
                case 153 -> 201;
                case 154 -> 79;
                case 155 -> 87;
                case 156 -> 129;
                case 157 -> 188;
                case 158 -> 4;
                case 159 -> 98;
                case 160 -> 76;
                case 161 -> 7;
                case 162 -> 23;
                case 163 -> 189;
                case 164 -> 194;
                case 165 -> 107;
                case 166 -> 38;
                case 167 -> 143;
                case 168 -> 232;
                case 169 -> 58;
                case 170 -> 88;
                case 171 -> 191;
                case 172 -> 100;
                case 173 -> 102;
                case 174 -> 43;
                case 175 -> 159;
                case 176 -> 101;
                case 177 -> 65;
                case 178 -> 8;
                case 179 -> 115;
                case 180 -> 75;
                case 181 -> 51;
                case 182 -> 9;
                case 183 -> 62;
                case 184 -> 206;
                case 185 -> 193;
                case 186 -> 28;
                case 187 -> 145;
                case 188 -> 234;
                case 189 -> 182;
                case 190 -> 217;
                case 191 -> 247;
                case 192 -> 119;
                case 193 -> 207;
                case 194 -> 68;
                case 195 -> 200;
                case 196 -> 0;
                case 197 -> 146;
                case 198 -> 180;
                case 199 -> 243;
                case 200 -> 59;
                case 201 -> 255;
                case 202 -> 225;
                case 203 -> 96;
                case 204 -> 121;
                case 205 -> 46;
                case 206 -> 222;
                case 207 -> 147;
                case 208 -> 172;
                case 209 -> 105;
                case 210 -> 141;
                case 211 -> 57;
                case 212 -> 110;
                case 213 -> 165;
                case 214 -> 176;
                case 215 -> 223;
                case 216 -> 122;
                case 217 -> 10;
                case 218 -> 103;
                case 219 -> 40;
                case 220 -> 83;
                case 221 -> 93;
                case 222 -> 78;
                case 223 -> 84;
                case 224 -> 128;
                case 225 -> 11;
                case 226 -> 33;
                case 227 -> 36;
                case 228 -> 42;
                case 229 -> 227;
                case 230 -> 64;
                case 231 -> 125;
                case 232 -> 24;
                case 233 -> 21;
                case 234 -> 60;
                case 235 -> 231;
                case 236 -> 30;
                case 237 -> 14;
                case 238 -> 108;
                case 239 -> 208;
                case 240 -> 175;
                case 241 -> 160;
                case 242 -> 252;
                case 243 -> 45;
                case 244 -> 85;
                case 245 -> 133;
                case 246 -> 205;
                case 247 -> 212;
                case 248 -> 70;
                case 249 -> 199;
                case 250 -> 246;
                case 251 -> 32;
                case 252 -> 2;
                case 253 -> 157;
                case 254 -> 216;
                default -> 169;
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
            m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.h[n3] = new String(cArray).intern();
        }
        return h[n3];
    }

    public static Method m(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static Field m(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void g() {
        Object[] objectArray = i;
        i[0] = ",hh\u0000)\u007f\"a/\b.do`bI!A\u0014\u007f(%'Au]s\u0000\u0015~)e\u001f\n7b\u0004\u007f\u00037\tf\t4\u0002!)Gq_48)#7Fp\u0017&FrG\u0016_\u0002uu^v7\bV.Zu(+\\\u0014D\"\n\u0001Q\u0013x6[\u0017x(C7\u001e\u0012_ ?$\u0019-D$5>\u001cta)97%-";
        objectArray[1] = Long.TYPE;
        m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.j[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.j[2] = "java/lang/Integer";
        objectArray[3] = "W\u000eI\u0003+K\\\u0001XLJEW\n\\\u0016";
        objectArray[4] = Void.TYPE;
        m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.j[4] = "java/lang/Void";
        objectArray[5] = "\u007fAyQ5aqH>Y2z<Is\u00181ix\u0013;s\u001bdpJ\u0007W;K_E5}9bZP\u0006t4b\\w\u001cQh|P\u00132L\fauN\u0011Z1fq`\u0004MiJ}Laj\u000f7*`9oddep\"\u000b:?+\u0015\u0013S\u0015:g\u0012%X4}a\\&D\bhgf\u0019M\u0004w[G>zi";
        objectArray[6] = "[+B\u0000T\u0013U\"\u0005\bS\b\u0018#HIS\u0006d}\u001b5x\u000ey9<XT4r\u0005\u0016=iO\\#\u0000*OMo/\u001f\u0001E\u001e\u0001\u0000.\u001e\u000f0FxU\fwKb!'\u0007iET'\u0002\u0018J0c'[\ns\u0013]\u0017\u0005!rKx7!\u001a\u000b\u0004W\u0019\u0001\f\u0004\t| \u00057k$d~T\\Q8u9;[n";
        objectArray[7] = "\u007fS";
        objectArray[8] = "\n'mF^7\n:jx\u007f{\u000b4S\u0002cqj4 \tNzj/^\u0014EG]\u0006,DkbJ,~6pe{\f\u007f$klj!i?\u001fVV\" \u0006\u0015v]0w\u001cqw@&j6IDv;qG\u00110l\u0005X\u0000E[H5@IbOl\u0001c9\u0013vM$S\u0007rvr\u0003ZF]W\t:\u0011BN7H9k\u0003HzY^+\u0004DiVf~\u001dOk0";
        objectArray[9] = "K1!tf\u000eK,&JI\u0003\u0000x,rep\u0010\t`\u0000&u\u0016:!,*Q\u001a\u0002\u0013\f~H?\bg0PK\r-\u0019-IrI-d)(X,sgwSI\u001e4\u001d\u000e{\r\u001a%?\u0013ER\u0011\u0017\u001f{ps\u001a\u000fa8n\u0002\u001a\u0003&\u0018Tt\u001d\u0002>\u001b\\n#q:.P`\f\u0004/0/PJ\u001a]6|\u000f\u000b\"?uxOqrd&|\b\u001e##+w2";
        objectArray[10] = "P\"\rih\u000f\t8\u0017m\f\u001f\u000685dh\r\u0006DQl0\b\f>\u0010j}\u0019k";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "\\\u0003\u0011\u0000OU\u0019LJ\u0019$@L\u0010F\u0004aT\tL[WiY\u001a\u007fr\u0006M]\u0006CP#Jt\u001dG\u00115J\u0019\u0002nG\u0019b\u0018\u001dA`2\u001fa\u001e\u0005e ma\\co\u0013b}\u0010a\u0017VGl<@p3]|Z\fE#Du\u0010rR\u0014\u001bX&sW3j^)gu0hI\r\u0005e\u0003\u0019j.\u0003\u0016i\u0018T\u0019\f\u001bP\u001cE_]+";
    }

    public static Object g(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.g(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle g(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00da' || c == '\u00c8' || c == '\u00e0' || c == '\u00d1') {
                field = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.A(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.B(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fe' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Class z(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.y(l);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static int y(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 28;
            case 1 -> 32;
            case 2 -> 35;
            case 3 -> 29;
            case 4 -> 12;
            case 5 -> 22;
            case 6 -> 18;
            case 7 -> 10;
            case 8 -> 45;
            case 9 -> 50;
            case 10 -> 42;
            case 11 -> 37;
            case 12 -> 54;
            case 13 -> 40;
            case 14 -> 30;
            case 15 -> 15;
            case 16 -> 25;
            case 17 -> 36;
            case 18 -> 31;
            case 19 -> 51;
            case 20 -> 39;
            case 21 -> 4;
            case 22 -> 26;
            case 23 -> 44;
            case 24 -> 27;
            case 25 -> 34;
            case 26 -> 16;
            case 27 -> 24;
            case 28 -> 19;
            case 29 -> 41;
            case 30 -> 57;
            case 31 -> 52;
            case 32 -> 61;
            case 33 -> 13;
            case 34 -> 49;
            case 35 -> 53;
            case 36 -> 5;
            case 37 -> 23;
            case 38 -> 48;
            case 39 -> 14;
            case 40 -> 62;
            case 41 -> 33;
            case 42 -> 47;
            case 43 -> 21;
            case 44 -> 7;
            case 45 -> 9;
            case 46 -> 2;
            case 47 -> 63;
            case 48 -> 1;
            case 49 -> 59;
            case 50 -> 46;
            case 51 -> 6;
            case 52 -> 0;
            case 53 -> 8;
            case 54 -> 11;
            case 55 -> 58;
            case 56 -> 3;
            case 57 -> 43;
            case 58 -> 38;
            case 59 -> 56;
            case 60 -> 55;
            case 61 -> 60;
            case 62 -> 20;
            default -> 17;
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
        m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.j[n3] = new String(cArray);
        return n3;
    }

    public static Field A(long l) {
        int n = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.y(l);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.z(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.z(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.m(clazz3, string2, clazz2)) != null) {
                    m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.n(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.z(254269265762386L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public float[] m$$IAlbVzg8FoI9lnXAe0kiBUgAIRRrsV0c5LXaNtIUNHEwNfCy6dcZP5YPnKyuuuVEBwTV6hTauVunSHQhWKvnglrRoaYhvBkK6(int n) {
        return m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.g("\u00dc", (Object)((m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S)((Object)m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.g("\u00dc", (Object)this.m$$0A5OCvkwAc35jewO41Z09eCY5IcY0kd2ZiKMidAGWV5GVqpHo9x7Bw2ZMZlTDmukHqknAgNdvxl9OmcROnZWD4ROk5HQp9C81, (long)704789437522101L))), (long)783634670021979L);
    }

    public static String m$$hHN3UNlA6tx02rJcWPkLuc93M8yOlIV0eKS3RgAas54OI2HbA7YNrgbEdjlKOZHx8545aD8rSJ8C4wrc2SOdeUGVVS2mqwTrL(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-84, -82, -27, -128, 20, -38, -19, 120, -105, 48, 81, -60, 104, -71, -81, -116, 127};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 17]);
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
            return MethodHandles.lookup().findStatic(m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.class, "g", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

