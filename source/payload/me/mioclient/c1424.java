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
import java.util.concurrent.ConcurrentHashMap;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$ujXzdiEpq2EvzHWxiE4lraWreOE0xafbupuutWo7RJLutbftOxvBHaj3DZpnIIlppeyyX1q6v5wzAUQDH1pQ5mKKo1qmouiRt;
import me.mioclient.m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62;
import net.minecraft.class_151;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    public final ConcurrentHashMap m$$PEc0FT1e1FxI3Yk3N5gt0LxFa6utVqt79fRkDrIS01SKRxkvC5rnUXBZ1Qr6lsvCgqrDJ2MTdWYf3TTkj27TP722EWZwmuU81 = new ConcurrentHashMap();
    public float m$$hnelLjRLYFs7MtErv7d53L0idRqPohzdHK0QXYxkwI4rhoKl6rn9RX8AlyqZzl5F4CsqFhZR9zjkje1wzHGHDJb7d961qsjNz = (float)m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a("E", (int)((((m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(11683, 4454180534676877165L) >>> m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(7353, 2768921183159049842L) | m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(12447, 7328139911181955679L) << m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(1843, 6488368863130306034L)) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 << 3) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(2266, 4351072317882321431L)) >>> m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(1143, 1808065707357193915L) | ((m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(12447, 7328139911181955679L) >>> m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(9119, 1498457812007936341L) | m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(12447, 7328139911181955679L) << m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(11765, 2341512020449193777L)) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 << 3) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(2266, 4351072317882321431L)) << m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(3012, 4551672573844277515L)) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(18962, 6759432828217297105L)), (long)1182737977988404L);
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final long[] c;
    public static final Integer[] d;
    public static final Object[] i;
    public static final String[] j;

    public m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0() {
        m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a("\u00e7", (Object)m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg, (Object)this, (long)1487218647492155L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.i = new Object[24];
                    m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.j = new String[24];
                    m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a();
                    var4 = 8063627387222190826L;
                    var10_1 = new long[16];
                    var7_2 = 0;
                    var8_3 = "\u001a\u00b8\u00c6\u00a5\u00f0\u00e7q\u00ba\u00d3\u00eb \u00e3\u00a0\u0088[\u00b9\u00d26w0\u008dB\u00b4\u009f\u00f4;\u000f\u0082\u001b\u00d9\u000b\u00b8\u000b\u009dJ\u001f\u009b\u0014\u00df\u0002\u0096\u00ec\u00c5\u00c1\u00a9\u00ea,\\t\u0096\u00bb\u0083\u00d1\u009d#\u00f2\b\u0087\u00ed\r\u00fb7^\u00b9\u00ba3b\u00cbj\u00eb/\u0001n\u00cd\u00c85c\u00b4C\u008b\u0080\u00b4\u00a3U\u00e1|\u00e23qiu\u0012%\u00acvN\u00e7\u00c0\u00e9\u009eS<i\u00a6\u00c3\u0013\u0015F\u0018S\u0005\u00c2";
                    var9_4 = "\u001a\u00b8\u00c6\u00a5\u00f0\u00e7q\u00ba\u00d3\u00eb \u00e3\u00a0\u0088[\u00b9\u00d26w0\u008dB\u00b4\u009f\u00f4;\u000f\u0082\u001b\u00d9\u000b\u00b8\u000b\u009dJ\u001f\u009b\u0014\u00df\u0002\u0096\u00ec\u00c5\u00c1\u00a9\u00ea,\\t\u0096\u00bb\u0083\u00d1\u009d#\u00f2\b\u0087\u00ed\r\u00fb7^\u00b9\u00ba3b\u00cbj\u00eb/\u0001n\u00cd\u00c85c\u00b4C\u008b\u0080\u00b4\u00a3U\u00e1|\u00e23qiu\u0012%\u00acvN\u00e7\u00c0\u00e9\u009eS<i\u00a6\u00c3\u0013\u0015F\u0018S\u0005\u00c2".length();
                    var6_5 = 0;
                    while (true) {
                        var11_6 = var8_3.substring(var6_5, var6_5 += 8).getBytes("ISO-8859-1");
                        v0 = var10_1;
                        v1 = var7_2++;
                        v2 = ((long)var11_6[0] & 255L) << 56 | ((long)var11_6[1] & 255L) << 48 | ((long)var11_6[2] & 255L) << 40 | ((long)var11_6[3] & 255L) << 32 | ((long)var11_6[4] & 255L) << 24 | ((long)var11_6[5] & 255L) << 16 | ((long)var11_6[6] & 255L) << 8 | (long)var11_6[7] & 255L;
                        v3 = -1;
                        break block8;
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var6_5 < var9_4) ** continue;
                        var8_3 = "\u00cd\"\u00ce\u00ff>\b\u00ee\u00dcO'\u0015\u00a6#\u001cnI";
                        var9_4 = "\u00cd\"\u00ce\u00ff>\b\u00ee\u00dcO'\u0015\u00a6#\u001cnI".length();
                        var6_5 = 0;
                        while (true) {
                            var11_6 = var8_3.substring(var6_5, var6_5 += 8).getBytes("ISO-8859-1");
                            v0 = var10_1;
                            v1 = var7_2++;
                            v2 = ((long)var11_6[0] & 255L) << 56 | ((long)var11_6[1] & 255L) << 48 | ((long)var11_6[2] & 255L) << 40 | ((long)var11_6[3] & 255L) << 32 | ((long)var11_6[4] & 255L) << 24 | ((long)var11_6[5] & 255L) << 16 | ((long)var11_6[6] & 255L) << 8 | (long)var11_6[7] & 255L;
                            v3 = 0;
                            break block8;
                            break;
                        }
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var6_5 < var9_4) ** continue;
                        break block9;
                        break;
                    }
                }
                v4 = v2 ^ var4;
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl41:
                    // 1 sources

                    ** continue;
                }
            }
            m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.c = var10_1;
            m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.d = new Integer[16];
            m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(11909, 3758268981581179970L);
            break block10;
lbl47:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_7 = 3862914670370103185L;
        ** while (true)
        var0_8 = 2045950402548201986L ^ var2_7;
        m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a("E", (long)var0_8, (long)1316217931581411L);
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(l);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field c(long l) {
        int n = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(l);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(clazz3, string2, clazz2)) != null) {
                    m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.b(79863399457423L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(l);
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
                clazz3 = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.b(79863399457423L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.b(79863399457423L);
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

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void a() {
        Object[] objectArray = i;
        i[0] = "?BK\u0001\u0018j1K\f\t\u001fq|JAH@r+l\"4>U3K34Gh\u0014o1 7=&\u007f5\u0001\u0006`dC\b*FJ\bt\u0000*\u001eA\u0006K\u0014\u0019;6\u000bA\u0017)4T$\u0013, \u0017SeU3.%U=r35\u0014d6r*%\u001724\u00130\u0015\u001e3\nb\b\u0018!=\u0002w=T=29\u0010&\u00159";
        objectArray[1] = "\r\u001c\tj6\u000e\u0006\u0013\u0018%W\u0000\r\u0018\u001c\u007f";
        objectArray[2] = Void.TYPE;
        m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.j[2] = "java/lang/Void";
        objectArray[3] = "h\u007fQ]ZMcp@\u00122Mm\u007fS";
        objectArray[4] = Integer.TYPE;
        m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.j[4] = "java/lang/Integer";
        objectArray[5] = Float.TYPE;
        m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.j[5] = "java/lang/Float";
        objectArray[6] = "!c\fNKk/jKFLpbk\u0006\u0007Xi83fe{S>0\u0016fCs'QG\u001aI5-dSTHN$^OlKJ\u001e@HYjWxi[JTE\u0007wqap<\u0015Dpu\u00113ts[EAl\u00152\u0015Z\u0011^?T\u001bug1?Qnm\u0016v\u0005jczo2\rAPLc3\u0018W\u0013w\u0012";
        objectArray[7] = "4\u0016kAK`?\u0019z\u000e'c1\u001bxA\u000b";
        objectArray[8] = Boolean.TYPE;
        m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.j[8] = "java/lang/Boolean";
        objectArray[9] = "+F\u0010.Jb%OW&MyhN\u001agyb3Jk\u0005Huw[F%SO\u0005Uk\u0014k9\tGf!\u0010|<\u0012\b,Di\u0012nz'N>rIl'oB.Q\\\u0017pu\u001cyJ&BI\u0016V\u000f\u000b[;pyk6Yh\u0002Ru\u0001dw$wn;j?\bb]1Nwpjs\u0005rz\u0017W_\u0004n";
        objectArray[10] = "]\u001e1\n)nS\u0017v\u0002.u\u001e\u0016;C5kh\u0001{\u000e\u0005qAIZ\u0011:Ig\u0003v\"tmB\u001aH\u0015%NuKg\u0006&cE\u000bj\u00124V_LM-\ftD\u0019y\u0013\u000fyF9W\u0006*2t!o\t\tH\\\u000bo\u00029xhJnQ64G\u0001^2\u0011ExJo6ul{0pV1l_\u000ev54";
        objectArray[11] = "\u0017-dI\u001c\u0007\u0019$#A\u001b\u001cT%n\u0000\u00149/:$l\u00129N\u0018\u007fI \u0006\u0012 \u0013C\u0002\u001a?:\u000f~<\u001e2q\u000eh\u001c?J\u001a8q\u001c[\f\u0003|^\u0013>I\u0002\u001a\u00167\rN\u001bz~=.\u0015\u001fya\u001e$/\u0001.C4)(=:\u0012\"\u0000\u0013\u0006;W''\u001bz(P\u0018<\u001fp2UA\u0019\u0012|;l\u0018";
        objectArray[12] = Long.TYPE;
        m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.j[12] = "java/lang/Long";
        objectArray[13] = "\u001e-\u0017>}Q\u0000%\rq0K\u001a/\u0014-!A\u001a8O\u001c<J\u00179\u0013-6J\u0000\u0004\u0000,;i\u0015<";
        objectArray[14] = "k\u0019\u0006<}\u0011u\u0011\u001cs5\u0011o\u001b\u00044<\n/:\u0019\u001b&\nb\f\u00192=";
        objectArray[15] = "\u000eZ*6OX\t\u001d8+\"M\u001e\f\u001e\u0002YRm[8{Saqe\u0015\u0007]Pbq&&Xyyn{\u000e~c\b\u001f{\u001bLk\u000fK\u000b\u0019\u001aP\u0003Y\u000e6iP\u000er\t{OZ\n\u001a\u001ezHQ\u000bD=<\u001cV|c\n KEQ\u0010|\u0014ihcL\u0006znbuo\u0001\u001aXIUR>%\u001dVCy\u000bD\u001cFV@&%]OS\u001eD}_Y\tD/-RSB ";
        objectArray[16] = "S`ve}'V7{|\u001dv\u000fqQ}al5jUxz~\u0015\r \"`&\u00021q~bsi6{b&'\u0004gvs-\u0017";
        objectArray[17] = "\u001241>T\u000bS=4`6\u000bW\u000621Y\u000eA6U`\f\u0007\u00115<7\\\u0014\u0016Z";
        objectArray[18] = "H*;^\u001f(\u0006;+\fd\u0016F#w\u001f\\:53\u0006S.y055\u0012\u0002u\u00149\r \"!\r\u001c\u0007T\u001e\u000f\u000e.\"*\u0003\u00167j\"W\u0007w\u001d\u000f|TY\f\f=;. $H9*\f=\u001a\u00172\u0018,U/69\u0000R\u00161G9\f\u00156\u000b1>\r\r5\u0003+\u0000~\t\u0000\u000f%/\u000b\u001c\u001ep\u0015i\u0015nT#I1=S\u0019yIcGUZ5F9{\u0004\u00067\u0013R";
        objectArray[19] = ";d'O<\u0010<#5RQ\u0005+2\u0013a\u001a^=N\u0017](\u001f>]*`3_er6S!YLQ4\f5]9n\u0006\u0005*[|{;t;\rbF\u0015Z*Pis\u0017|\u0010\r:D\u0002X\u001b\"M$%p8\u0012u'\tL\bQ=F\b\\o,Dlqr(\u0001C/8_5\u001f]n1v\u0015QXf\u0003=j\u0000y%yP;\rh.I\u0004,\u0011<z\"T!\u001bw\u001e";
        objectArray[20] = "\u0001B\\2\u0007r_\\\u0007mmuWH\u001ap\u0011s0V\b1\u0014{\bR\u00032mw\nA\u001bl\u001frMD\u0001\r\u0016t\fT\u00075\u0012\u007f\u000f-";
        objectArray[21] = "TF\u001d&jt\u0017L\u0005\u001ar*B\u0005\u0006]H}2d\u0018\u007f}D\u0011\u0000]@jTRc_Zl`)\\]Gmm\r{'@fY$F& {Z\nZ\"hRY\u000bl%}^y<G\u0003d)E%M\u001cqWf\u0010^%yzw\tX=c[}U\u0000\u001afLj,\f\u0003V&w4\f\u0006]Ub\u0016\u0004da}:\u0017Y\\ev9n\u0005\u0019k,b\u0005U\u0014ag\u0006";
        objectArray[22] = "\u0001n|\u000b@V\\l$\fxLU3?\u001c?\\<ix\u001cE]U>(\u000fB2\u0001n|\u000b@V\\l$\fx";
        Object[] objectArray2 = objectArray;
        objectArray[23] = "*}'V\\)g%|T979mz\tk\r{|+\tr)M~5\u007fa7%x\u0002Rs3K\b\u0015|\u0002\rl\u001e$C\u0006=x~+Vt.l'\u001dQ\u0002;N|}C\u0003\u000fW1\tVrou\u001fwid\fK\u0003\u001bc\u0000\"i\u001d{z~\u000e$\u000fyRGc\u007fqzQ`#x\u001cwZg\u0015T8#3\u0007<q!%RF5t\u007fG";
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c2' || c == 'V' || c == '$' || c == 'B') {
                field = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findSetter(clazz, string2, clazz2) : (c == '$' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e7' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'E' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x42C9;
        if (d[n2] == null) {
            m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }

    public static int a(long l) {
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
            case 0 -> 23;
            case 1 -> 17;
            case 2 -> 11;
            case 3 -> 25;
            case 4 -> 34;
            case 5 -> 26;
            case 6 -> 32;
            case 7 -> 9;
            case 8 -> 46;
            case 9 -> 44;
            case 10 -> 20;
            case 11 -> 59;
            case 12 -> 21;
            case 13 -> 7;
            case 14 -> 6;
            case 15 -> 27;
            case 16 -> 50;
            case 17 -> 54;
            case 18 -> 45;
            case 19 -> 47;
            case 20 -> 1;
            case 21 -> 2;
            case 22 -> 10;
            case 23 -> 57;
            case 24 -> 15;
            case 25 -> 61;
            case 26 -> 37;
            case 27 -> 28;
            case 28 -> 38;
            case 29 -> 58;
            case 30 -> 16;
            case 31 -> 55;
            case 32 -> 53;
            case 33 -> 39;
            case 34 -> 24;
            case 35 -> 18;
            case 36 -> 19;
            case 37 -> 0;
            case 38 -> 60;
            case 39 -> 42;
            case 40 -> 56;
            case 41 -> 63;
            case 42 -> 14;
            case 43 -> 35;
            case 44 -> 33;
            case 45 -> 48;
            case 46 -> 36;
            case 47 -> 41;
            case 48 -> 3;
            case 49 -> 5;
            case 50 -> 31;
            case 51 -> 51;
            case 52 -> 62;
            case 53 -> 22;
            case 54 -> 12;
            case 55 -> 52;
            case 56 -> 30;
            case 57 -> 43;
            case 58 -> 8;
            case 59 -> 29;
            case 60 -> 49;
            case 61 -> 4;
            case 62 -> 40;
            default -> 13;
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
        m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.j[n3] = new String(cArray);
        return n3;
    }

    public static String m$$56NTxKdu7IV1OsA9qFW3rwyC2hn2szCrevesKwLLfLvqJzgP8mZP6m7s6A8PNhVtBEOfzPDCAsbrsuk4LlsJ3p8dGVAXTYuf3(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-59, -122, -36, 34, 41, -35, 101, -94, 97, -101, 18};
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
     * Exception decompiling
     */
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM var1_1, float var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
         *     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
         *     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
         *     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
         *     at java.base/java.util.Objects.checkIndex(Objects.java:385)
         *     at java.base/java.util.ArrayList.get(ArrayList.java:427)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.couldBeAmbiguous(LambdaRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:175)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:105)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.rewriters.ExpressionRewriterHelper.applyForwards(ExpressionRewriterHelper.java:12)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.StaticFunctionInvokation.applyExpressionRewriterToArgs(StaticFunctionInvokation.java:103)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.StaticFunctionInvokation.applyExpressionRewriter(StaticFunctionInvokation.java:90)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:103)
         *     at org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredExpressionStatement.rewriteExpressions(StructuredExpressionStatement.java:70)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewrite(LambdaRewriter.java:88)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.rewriteLambdas(Op04StructuredStatement.java:1137)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:912)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$ujXzdiEpq2EvzHWxiE4lraWreOE0xafbupuutWo7RJLutbftOxvBHaj3DZpnIIlppeyyX1q6v5wzAUQDH1pQ5mKKo1qmouiRt m$$ujXzdiEpq2EvzHWxiE4lraWreOE0xafbupuutWo7RJLutbftOxvBHaj3DZpnIIlppeyyX1q6v5wzAUQDH1pQ5mKKo1qmouiRt) {
        try {
            if (m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a("\u00e7", (Object)m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a("\u00e7", (Object)m$$ujXzdiEpq2EvzHWxiE4lraWreOE0xafbupuutWo7RJLutbftOxvBHaj3DZpnIIlppeyyX1q6v5wzAUQDH1pQ5mKKo1qmouiRt, (long)1668880100894583L), (long)1215154626093027L) == false) {
                m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a("\u00e7", (Object)this, (Object)m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a("\u00e7", (Object)m$$ujXzdiEpq2EvzHWxiE4lraWreOE0xafbupuutWo7RJLutbftOxvBHaj3DZpnIIlppeyyX1q6v5wzAUQDH1pQ5mKKo1qmouiRt, (long)1668880100894583L), (long)1098606446504651L);
            }
        }
        catch (class_151 class_1512) {
            throw m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.a(class_1512);
        }
    }

    public float m$$fYuve1ZpdYRLms3Zv2pREKwxS9Te7XMU75z6fLP5mR9yqDQXEHHOw4yUjceAucPtmGARXKRqaXI9JJ9VyODer7dRPtLYKLWCo() {
        return this.m$$hnelLjRLYFs7MtErv7d53L0idRqPohzdHK0QXYxkwI4rhoKl6rn9RX8AlyqZzl5F4CsqFhZR9zjkje1wzHGHDJb7d961qsjNz;
    }

    /*
     * Exception decompiling
     */
    public void m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG(m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
         *     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
         *     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
         *     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
         *     at java.base/java.util.Objects.checkIndex(Objects.java:385)
         *     at java.base/java.util.ArrayList.get(ArrayList.java:427)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.couldBeAmbiguous(LambdaRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:175)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:105)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.rewriters.ExpressionRewriterHelper.applyForwards(ExpressionRewriterHelper.java:12)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.StaticFunctionInvokation.applyExpressionRewriterToArgs(StaticFunctionInvokation.java:103)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.StaticFunctionInvokation.applyExpressionRewriter(StaticFunctionInvokation.java:90)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:103)
         *     at org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredExpressionStatement.rewriteExpressions(StructuredExpressionStatement.java:70)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewrite(LambdaRewriter.java:88)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.rewriteLambdas(Op04StructuredStatement.java:1137)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:912)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB(float f) {
        this.m$$hnelLjRLYFs7MtErv7d53L0idRqPohzdHK0QXYxkwI4rhoKl6rn9RX8AlyqZzl5F4CsqFhZR9zjkje1wzHGHDJb7d961qsjNz = f;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$zmt5DFYWr64EawkWe9k1abqwjJhXmOiNRFjzHS4oyivAKqSBR8YBRV378uyfchY47y3ZsR9VE5sWLN4rIlAYM6AGroA7TQ1T0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

