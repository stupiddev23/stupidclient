/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiPredicate;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_6880;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn
implements ArgumentType,
m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    public final BiPredicate m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM;
    public final class_2378 m$$1jOWsTPtmbJw41RuZ4W3HsnOh1UrckOKRyWBrJ2dTlnNzMWmXIoAwZsov6KCypcHhvjIkeyolQqDs34vtSdJ8oD9yR8jOJlp0;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String c;
    public static final Object[] d;
    public static final String[] e;

    public m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn(class_2378 class_23782, BiPredicate biPredicate) {
        this.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM = biPredicate;
        this.m$$1jOWsTPtmbJw41RuZ4W3HsnOh1UrckOKRyWBrJ2dTlnNzMWmXIoAwZsov6KCypcHhvjIkeyolQqDs34vtSdJ8oD9yR8jOJlp0 = class_23782;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n;
            char[] cArray2;
            int n2;
            int n3;
            block11: {
                d = new Object[42];
                e = new String[42];
                m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a();
                char[] cArray3 = "t<mmcO2\u0011>gt&G)D>l \u0007".toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 14;
                cArray2 = cArray3;
                n = n4;
                if (n4 <= 1) break block11;
                cArray = cArray2;
                n = n;
                if (n <= n3) break block12;
            }
            do {
                int n5 = n2;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n6 = n2;
                int n7 = n3;
                while (true) {
                    cArray4[n7] = (char)(cArray4[n7] ^ (n6 ^ (switch (n3 % 7) {
                        case 0 -> 63;
                        case 1 -> 94;
                        case 2 -> 6;
                        case 3 -> 14;
                        case 4 -> 8;
                        case 5 -> 47;
                        default -> 72;
                    })));
                    ++n3;
                    n2 = n5;
                    if (n5 != 0) break;
                    n5 = n2;
                    cArray2 = cArray2;
                    n7 = n2;
                    cArray4 = cArray2;
                    n6 = n2;
                }
                cArray = cArray2;
                n = n;
            } while (n > n3);
        }
        c = new String(cArray).intern();
        long l = 5829806668944464081L;
        long l2 = 0x965C45F1E45B2FC0L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 6175406784172172001L;
        long l4 = 0x1B2C642D9C1B4E26L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00aa", (long)l4, (long)2404277400418945L);
    }

    public boolean test(CommandContext commandContext, class_2960 class_29602) {
        return (boolean)m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00ea", (Object)this.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM, (Object)commandContext, (Object)m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00ea", (Object)this.m$$1jOWsTPtmbJw41RuZ4W3HsnOh1UrckOKRyWBrJ2dTlnNzMWmXIoAwZsov6KCypcHhvjIkeyolQqDs34vtSdJ8oD9yR8jOJlp0, (Object)class_29602, (long)2723257530854684L), (long)2265178054905706L);
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a(l);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a(l);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a(clazz3, string2, clazz2)) != null) {
                    m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.b(135896876719064L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a(l);
        Object object = d[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.b(135896876719064L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.b(135896876719064L);
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
            throw new RuntimeException("me/mioclient/m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fa' || c == 'e' || c == '\u00cf' || c == '\u00e3') {
                field = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fa' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ea' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00aa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    public static void a() {
        Object[] objectArray = d;
        d[0] = "\u001b+l\ni8\u0012%oC*5\n-fE`>\u001d6/A|4\u001d4uMk9\u000bjE]j6\u0015-bgk:\u0015%o@A/\u001b!qPm8\u0016\u0010xTa";
        objectArray[1] = ",\u0003\rr$G'\f\u001c=EI,\u0007\u0018g";
        objectArray[2] = "G\u001a{\r\u0017KN\u0014xDTFV\u001cqB\u001eMA\u00078F\u0002GA\u0005bJ\u0015JW[UL\u0017IE\u001brp\u0003JP\u0014nf\u0002GA\u0005bJ\u0015J";
        objectArray[3] = "Mc$:6PCjc21K\u000ek.s1\\FLp\u0015=\nfqA\u0006\u0007y\u0019t\u007f\u001e/RI3S\u0006;heqS%\u0018xi@yb=\u000eum8%<\u0007\u0017psejGJk~1ff\u0011e@\u0011:fTep\u00132wQe`0>{Kgx\u0019\nef1b=0pX6Agmzxn3\u00071";
        objectArray[4] = "W)\u00045-j^'\u0007|ngF/\u000ez$lQ4Gx/k@#\u0011onF[+\u0004z.aw)\u0007o%}@";
        objectArray[5] = "VYQ Y[VYF|UTL\u0012FbUAKc\u00177\u0002\u0002";
        objectArray[6] = Boolean.TYPE;
        m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.e[6] = "java/lang/Boolean";
        objectArray[7] = "Y@}ppKWI:xwP\u001aHw9xuaW=U~u\u0000ufpLJ\\M\nznVqW\u0016GPR|\u001c\u0017Qps\u0004w!Hp\u0017Bneg\u007fr\u0007o\u0003/[A\u0000vcGQb[r`Xrhal7zXefP#+NL]k\"nKkU\u00171itpQ\u001d+l-U\\\u0011\"Ut";
        objectArray[8] = Long.TYPE;
        m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.e[8] = "java/lang/Long";
        objectArray[9] = Integer.TYPE;
        m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.e[9] = "java/lang/Integer";
        objectArray[10] = "\u0010jl\u0007\u001c\f\u0010j{[\u0010\u0003\n!{E\u0010\u0016\rP.\u0011IUZltH\u0002\u0016!9 \u0011B";
        objectArray[11] = "@\u0016RO3!I\u0018Q\u0006p,Q\u0010X\u0000:'F\u000b\u00112*<J\u0017X3;/G\u001cM";
        objectArray[12] = "dy\u0004\u0017\u001e+ov\u0015Xc3|q\u001c\u0011";
        objectArray[13] = "^OJ+\u0011\r@GPdp\b@GS$^\u0014";
        objectArray[14] = "(BP\u0010]G6JJ_\u0015G,@R\u0018\u001c\\lpS\u0001\u0003^+FT";
        objectArray[15] = "=k\u00028\u000e\f=k\u0015d\u0002\u0003' \u0015z\u0002\u0016 QD%T]";
        objectArray[16] = "?`\u0000Y]\u000b?`\u0017\u0005Q\u0004%+\u0017\u001bQ\u0011\"ZFB\u0006S";
        objectArray[17] = "Z\u007fyqs?Dwc>;?^}{y2$\u001e\\f@//Twlq)/";
        objectArray[18] = "$\u000eOyGz:\u0006U6:j:";
        objectArray[19] = "!H05[t?@*z\u0006u9L'9[R?[#5\u0018";
        objectArray[20] = "0<\u0018\u0015d\u001d.4\u0002Z,\u001d4>\u001a\u001d%\u0006t\r\u001c\u0011.\u00019<\u001a\u0011";
        objectArray[21] = "|Som\u0002Cb[u\"JCxQmeCX8tlbOB\u007f]w";
        objectArray[22] = "~\u0004w?n+~\u0004`cb$dO`}b1c>1 4p";
        objectArray[23] = "\u000b\u0016.K)a\u0002\u0018-\u0002jl\u001a\u0010$\u0004 g\r\u000bm\u00161i\u000f\u001c0\u0011-a\u0006W\u0010\u0010#i\r\n7\f+`\u001b;6\f(j\r\u000b";
        objectArray[24] = "|\u0016\u000f3%>b\u001e\u0015|h$x\u0014\f y.x\u0003W\u0011d&f\u001b\u001c&j)z\u0012?'\u007f>d\u0012";
        objectArray[25] = "B;H'gw\u0019:O*^5\u001b>\b'\u0019%rc\u001et`v\f<EvnKB;H'gw\u0019:O*^";
        objectArray[26] = "#G\u0010ZV\u0002!\u0017\u0019\u0006-S{KX=\u0016\u0004-.\u0019\u0001\u0013\u0006!PFZ\u0011\b\u001c";
        objectArray[27] = "KY\u007f}3\u0016B]$aJP\\G\"t/+L\r!}&\u0015E\u00020\u007fJ";
        objectArray[28] = "\u0000jyyYW\u0016hhr?O\u0004wgqS}P3=-\u0002*\u0002o7vF\u0017\u000bklj?";
        objectArray[29] = "WH{a\u001d(^GjcqxZ\u001cil\u000b\u0016W\u0007u{\u001eo\nAs>qz\u000b\u0016umOs\u0004\u0007w\u0001";
        objectArray[30] = "MMe\u0000|:C\u001d2M\u00133JQ=\u001a\u007f\u0001\u001c\u0015dC(V\u0017L`\u0010*jLMg\u001d\u0013<G\u0015 \u0012\u007f2\u0017Bm}";
        objectArray[31] = "7\\P\u00045\u0006?\u001dD\u0013\r\u0017j\bM\"q\u0017f\u0007Ny=\f:\f\u0018Ef\r=\u0001!";
        objectArray[32] = "\t'=A5}\u000et(O\u000b;\u000fa; 2,\\$z^mw^*G\u0019`y\\'9F;{R\u001a{\\w|X!*\u001cv\"b";
        objectArray[33] = "\u0017\u0015\u0011F5I\u001e\u001a\u0000DY\u0012\u0012]\u007fHa\u001e\u0019L\u0018\u0019 OK%\u0013\u00167\u0017\u0017\u001b\u001a\u0019&\u0015{";
        objectArray[34] = "s?o<\r\u0014?$-so%~0-}W\t\r \\1%J\b&op\tF,*WB)\u00125\u000f]6\u0015<6=xH\b%\u000fyx5\fD%\u001c&6R?4.aL+\u0017p*pn6)/!BN^\u001c\u000e*Z0\u001d\u0002\u007f*Vw=8\t-Wo>0\u0013\u0013$k\u000b<\u001d<Q~\u0015C-zO\fR\t)xdeR\u0007%,\u001d2\n\u0007\u007fzdvU\u00004A";
        objectArray[35] = "j\u001bU\u0015_H6\u001e\r[/L!0XPBw;\u0007[T/Bf\u0002\\L\u0016\u0016$\u0005\u0002+\u0016@eC\u0001UI\u001bgM<";
        objectArray[36] = "|UQBj\u0006jW@I\f\u001exHOJ`,,\f\u0015\u00177{)\u000fT\u001d0\u0004hW\u0017S\fJs]\u0011]o\u0016v\u0005_-";
        objectArray[37] = "\nS\u0002(oa\u0007LPF5q\u000eJB+^2\b\u001d\u0000{ mS\u001f\u000eFgv\\BL*/6\u0003\u0013>";
        objectArray[38] = "ib+\u0010'~\u007f`:\u001bAfm\u007f5\u0018-T>8hD|\u0003<8.O}|}`m\u0001A:k=kB?e0?e\u007f";
        objectArray[39] = "\u0005C^\u00186\u0007\u0004\u001fQ\u0004P\u001fR\bBzkXQ\u0019Y@?\u0007F\u0017>Fk\u0018\u000fOA\u00073[As\u0002\u0006,X\u0005HSF-\u0006?";
        objectArray[40] = ",H?Py\u0011m\u0010|\u001eE\u000b}\u000f$\u0007)9.Kz]yn \u0012y\r|R{\u0013~\u0000ER+\bt\\:\u0013sK:`";
        Object[] objectArray2 = objectArray;
        objectArray[41] = "\u0019\u001adf-6\u0018\u0003ayLh\u001a\u0005j~ ZFC4%LaG\u0017jurhH\u0006h\u0019#dNCrc&d\u001c\u0010\nv2gI\u0003pf=k\by";
    }

    public static int a(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (e[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 51;
            case 1 -> 43;
            case 2 -> 31;
            case 3 -> 27;
            case 4 -> 34;
            case 5 -> 49;
            case 6 -> 3;
            case 7 -> 8;
            case 8 -> 38;
            case 9 -> 5;
            case 10 -> 7;
            case 11 -> 4;
            case 12 -> 16;
            case 13 -> 59;
            case 14 -> 36;
            case 15 -> 63;
            case 16 -> 1;
            case 17 -> 39;
            case 18 -> 13;
            case 19 -> 15;
            case 20 -> 58;
            case 21 -> 55;
            case 22 -> 40;
            case 23 -> 29;
            case 24 -> 54;
            case 25 -> 56;
            case 26 -> 50;
            case 27 -> 33;
            case 28 -> 18;
            case 29 -> 6;
            case 30 -> 45;
            case 31 -> 20;
            case 32 -> 9;
            case 33 -> 41;
            case 34 -> 14;
            case 35 -> 46;
            case 36 -> 62;
            case 37 -> 26;
            case 38 -> 32;
            case 39 -> 47;
            case 40 -> 28;
            case 41 -> 11;
            case 42 -> 24;
            case 43 -> 17;
            case 44 -> 52;
            case 45 -> 25;
            case 46 -> 10;
            case 47 -> 23;
            case 48 -> 60;
            case 49 -> 2;
            case 50 -> 19;
            case 51 -> 48;
            case 52 -> 21;
            case 53 -> 44;
            case 54 -> 35;
            case 55 -> 12;
            case 56 -> 22;
            case 57 -> 0;
            case 58 -> 42;
            case 59 -> 30;
            case 60 -> 37;
            case 61 -> 53;
            case 62 -> 57;
            default -> 61;
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
        m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.e[n3] = new String(cArray);
        return n3;
    }

    public Object parse(StringReader stringReader) {
        CallSite callSite = m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00ea", (Object)stringReader, (long)2205454342510737L);
        return m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00ea", (Object)((class_6880.class_6883)m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00ea", (Object)m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00ea", (Object)this.m$$1jOWsTPtmbJw41RuZ4W3HsnOh1UrckOKRyWBrJ2dTlnNzMWmXIoAwZsov6KCypcHhvjIkeyolQqDs34vtSdJ8oD9yR8jOJlp0, (Object)m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00aa", (Object)callSite, (long)2852073540663692L), (long)2570787734344985L), () -> m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.lambda$parse$1((String)((Object)callSite)), (long)2511189998528717L)), (long)1866438849568972L);
    }

    public static /* synthetic */ CommandSyntaxException lambda$parse$1(String string) {
        return m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00ea", (Object)new DynamicCommandExceptionType(object -> m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00aa", new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00aa", (Object)object, (long)1764783080242922L)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(c), (long)2127474207548556L)), (Object)string, (long)2648645614699573L);
    }

    public static m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn registry(class_2378 class_23782, int n) {
        return new m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn(class_23782, (commandContext, object) -> true);
    }

    public static m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn registry(class_2378 class_23782, BiPredicate biPredicate, int n) {
        return new m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn(class_23782, biPredicate);
    }

    public static String m$$0NkGPkK3GPuHPQiMtfHW0hxIhpN8gSNkcQChRI2ZCdoqmDqu3MaHslx333qqhNxbqpwHDP27IFmORLGGbW9ff8ZdB2EHZOgGi(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{102, 100, 98, -19, -51, -47, 41, 107, -82, 87, 68, -99};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 12]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    public CompletableFuture listSuggestions(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        return m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00aa", (Object)m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00ea", (Object)m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00ea", (Object)m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00ea", (Object)m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00ea", (Object)this.m$$1jOWsTPtmbJw41RuZ4W3HsnOh1UrckOKRyWBrJ2dTlnNzMWmXIoAwZsov6KCypcHhvjIkeyolQqDs34vtSdJ8oD9yR8jOJlp0, (long)2005760845360840L), (long)1924858823866191L), class_29602 -> (boolean)m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.a("\u00ea", (Object)this, (Object)commandContext, (Object)class_29602, (long)2750771248311661L), (long)2091963004915007L), class_2960::method_43903, (long)2330980229508876L), (Object)suggestionsBuilder, (long)2930792108981047L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

