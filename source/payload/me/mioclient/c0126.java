/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import com.mojang.blaze3d.opengl.GlStateManager;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Arrays;
import java.util.List;
import me.mioclient.m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4;
import org.lwjgl.opengl.GL20C;
import org.lwjgl.opengl.GL32C;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$$4rzGEdASve2OAJIwx7ibviRce6rIrKcMqoi7mwJlN19LxakWNlZcOaSHyE6VRZ5T8e8Dvdu1Luk7kCFxEFDnxLqAjVDHSIArb {
    public static final List m$$drRamKEFYoNSWn0JcXquuSBLpOaARQW8WLek4wXjdGqZ11chwckYWLP1yq7bvtgeiiKRjyAFITgP6m6MBuANqykfdttjGVbNa = new ObjectArrayList();
    public static final m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 m$$z8hsGnJbHjJDalkFN1U8lu82AOL6H3Yp5PIwbba2tkRgzG3CiCdsoUiFEOorh58vtOApnDX7k3GNK7UISdkWoawKqXjgkks6C;
    public static final m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 m$$pWnZYORIi3zxwavtKPVsQfNxVyBb8yN9NAp9Y5weVzFVcOdZBTzE50SvOinijSLzHzMJO8TX0iBTKMNoadHWS99EFxudWPSDc;
    public static final m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 m$$VQQSW9GbXlljQWBOHxDEKQlr52IbhtvvJ7by44tphw0XqecLDFQ0OIHJupuubwT52Vv5FNxkJpdf322ud01iuJLeX88yX3FOx;
    public static final m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 m$$Qq0owXcVDhEFpEebrKqpRpUtp8xuKZ3GB17oIY7fFrsg1aG3I3LOteZ9w3EQlSpIYVSSQ9cReYXeAmo0PtpyhlVZrTlU0UZIb;
    public static final m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2;
    public static boolean m$$x8h2gtxr5tQRlrgmF9m9DWDKA206pnEeSWRf8GU3AtV7oVA2DVclr9pdJMSBFysvbtA8jaXyGECBHm1Mo73N8lXL38ZHt9CxO;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -1789888863;

    static {
        m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2 = bl -> {
            if (bl) {
                GlStateManager._enableBlend();
                GL32C.glEnable((int)((0x955060E1 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) >>> (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0x1F) | (0x955060E1 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) << 32 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0x1F)));
            } else {
                GL32C.glDisable((int)((-1789886015 >>> 16 & 0xFFFF ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16 & 0xFFFF) << 16 | (0x955081C1 & 0xFFFF) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF) & 0xFFFF));
                GlStateManager._disableBlend();
            }
        };
        m$$z8hsGnJbHjJDalkFN1U8lu82AOL6H3Yp5PIwbba2tkRgzG3CiCdsoUiFEOorh58vtOApnDX7k3GNK7UISdkWoawKqXjgkks6C = bl -> {
            if (bl) {
                GlStateManager._depthMask((boolean)true);
                GlStateManager._enableDepthTest();
            } else {
                GlStateManager._depthMask((boolean)false);
                GlStateManager._disableDepthTest();
            }
        };
        m$$pWnZYORIi3zxwavtKPVsQfNxVyBb8yN9NAp9Y5weVzFVcOdZBTzE50SvOinijSLzHzMJO8TX0iBTKMNoadHWS99EFxudWPSDc = bl -> {
            if (bl) {
                GlStateManager._depthMask((boolean)false);
                GlStateManager._disableDepthTest();
                GL20C.glDepthRange((double)0.0, (double)0.1);
            } else {
                GlStateManager._depthMask((boolean)true);
                GlStateManager._enableDepthTest();
                GL20C.glDepthRange((double)0.0, (double)1.0);
            }
        };
        m$$Qq0owXcVDhEFpEebrKqpRpUtp8xuKZ3GB17oIY7fFrsg1aG3I3LOteZ9w3EQlSpIYVSSQ9cReYXeAmo0PtpyhlVZrTlU0UZIb = bl -> {
            if (bl) {
                GlStateManager._enableBlend();
                GlStateManager._disableCull();
            } else {
                GlStateManager._disableBlend();
                GlStateManager._enableCull();
            }
        };
        m$$VQQSW9GbXlljQWBOHxDEKQlr52IbhtvvJ7by44tphw0XqecLDFQ0OIHJupuubwT52Vv5FNxkJpdf322ud01iuJLeX88yX3FOx = m$$Qq0owXcVDhEFpEebrKqpRpUtp8xuKZ3GB17oIY7fFrsg1aG3I3LOteZ9w3EQlSpIYVSSQ9cReYXeAmo0PtpyhlVZrTlU0UZIb.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$pWnZYORIi3zxwavtKPVsQfNxVyBb8yN9NAp9Y5weVzFVcOdZBTzE50SvOinijSLzHzMJO8TX0iBTKMNoadHWS99EFxudWPSDc);
    }

    public static void reset() {
        m$$drRamKEFYoNSWn0JcXquuSBLpOaARQW8WLek4wXjdGqZ11chwckYWLP1yq7bvtgeiiKRjyAFITgP6m6MBuANqykfdttjGVbNa.clear();
        m$$x8h2gtxr5tQRlrgmF9m9DWDKA206pnEeSWRf8GU3AtV7oVA2DVclr9pdJMSBFysvbtA8jaXyGECBHm1Mo73N8lXL38ZHt9CxO = false;
    }

    public static void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 ... m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4Array) {
        m$$drRamKEFYoNSWn0JcXquuSBLpOaARQW8WLek4wXjdGqZ11chwckYWLP1yq7bvtgeiiKRjyAFITgP6m6MBuANqykfdttjGVbNa.addAll(Arrays.asList(m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4Array));
        m$$x8h2gtxr5tQRlrgmF9m9DWDKA206pnEeSWRf8GU3AtV7oVA2DVclr9pdJMSBFysvbtA8jaXyGECBHm1Mo73N8lXL38ZHt9CxO = true;
    }

    public static void m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf(boolean bl) {
        if (!m$$x8h2gtxr5tQRlrgmF9m9DWDKA206pnEeSWRf8GU3AtV7oVA2DVclr9pdJMSBFysvbtA8jaXyGECBHm1Mo73N8lXL38ZHt9CxO) {
            return;
        }
        for (m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 : m$$drRamKEFYoNSWn0JcXquuSBLpOaARQW8WLek4wXjdGqZ11chwckYWLP1yq7bvtgeiiKRjyAFITgP6m6MBuANqykfdttjGVbNa) {
            m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4.extend(bl);
        }
    }

    public static boolean m$$HjtzBB83GH0dRXLC6D63ONdC88CsZ2SCjJzpWo5T2reDeU9L0VXYaVH7YaUlVPpuPLDn5gcuk77rLGl5TuJmR7w66WMimcId8() {
        return m$$x8h2gtxr5tQRlrgmF9m9DWDKA206pnEeSWRf8GU3AtV7oVA2DVclr9pdJMSBFysvbtA8jaXyGECBHm1Mo73N8lXL38ZHt9CxO;
    }
}

