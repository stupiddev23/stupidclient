/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$T15vd92SGo4ioRoaknO5bXBgWzPiXSnJlOFM04YEWPn30wyjgOVG4gmnZO4ZEF8MXmaeyWCS6Mv4Mrp9fXCbvhHQRondDFj3n;
import me.mioclient.m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb;
import me.mioclient.m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN;
import me.mioclient.m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO;
import net.minecraft.class_1297;
import net.minecraft.class_151;
import net.minecraft.class_1657;
import net.minecraft.class_4587;

public interface m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95
extends m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    public static final m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO m$$jnENOFLRa4D7qJAAcZj4fJhiMfI8kSG0nH0ap8pxwkd8Tcoqt6s3L6Obmrml6O6Wy2qwQzEx8Mo2s8BCRholUENVadaZt9Q76;
    public static final Color m$$jXG0JPn1FUab68Z3juSfQr3vqIHrnSno2on0qU1qLXJPLa3Q7Dbvl9aZ5eD6FwgVRLJ53nsAUiOEFVQQwJMLwdSEKfTxeIK5t;
    public static final long[] c;
    public static final Integer[] d;
    public static final Object[] e;
    public static final String[] f;

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new Object[24];
        f = new String[24];
        m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a();
        long l = 2032791094616068620L;
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00bc\nF\u0094\u0096\u00f6\r\u00e1(\u00b5\u008c\u00c2\u00f6\u00f8\u00e44\u008elg\u00a5\u00aa\u00dc\r\u0001";
        int n2 = "\u00bc\nF\u0094\u0096\u00f6\r\u00e1(\u00b5\u008c\u00c2\u00f6\u00f8\u00e44\u008elg\u00a5\u00aa\u00dc\r\u0001".length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[3];
        m$$jnENOFLRa4D7qJAAcZj4fJhiMfI8kSG0nH0ap8pxwkd8Tcoqt6s3L6Obmrml6O6Wy2qwQzEx8Mo2s8BCRholUENVadaZt9Q76 = (m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$pOP9ZR6d4KfRZEbsffwEu35bFRIMEqHfTWZmmqHpl5JEvcv1Ctd6LcrhpBCKOBRQANgCU1t0tM6Z2qNsRAqu52Yea6kHm2GnO.class);
        m$$jXG0JPn1FUab68Z3juSfQr3vqIHrnSno2on0qU1qLXJPLa3Q7Dbvl9aZ5eD6FwgVRLJ53nsAUiOEFVQQwJMLwdSEKfTxeIK5t = new Color(0, 0, 0, 0);
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.b(classArray[i], string, clazz2);
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
            int n = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(l);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field c(long l) {
        int n = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(l);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(clazz3, string2, clazz2)) != null) {
                    m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.b(869919033349046L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(l);
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
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.b(869919033349046L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.b(869919033349046L);
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

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "\b66\u001aa\r\u0006?q\u0012f\u0016K><S\\8\u0002\u0002A8n\u000b\t6A\r~\b\u0016\u001fINN\u0006\u000bcB<P25',D`\t\u000b\t\\Dq*.\u001bk\u000f@\u0007]\u001f. L&3>,\u0013I\u0010\u00076sFi\fS\u0007(\rG\u0013!\u0016p>Y\u0000Sd\\\u0018A3\r\u001a+\u001fD\u000e\f\u0015vGo\rT6v1j";
        objectArray[1] = Integer.TYPE;
        m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.f[1] = "java/lang/Integer";
        objectArray[2] = Boolean.TYPE;
        m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.f[2] = "java/lang/Boolean";
        objectArray[3] = "{L+'QbuEl/Vy8D!ny}CeQ'LO^o}\u0019W]TA4\u0018p8Ylw9\r<bOf'LfcL2=JWscS8\f<_\u001aw0wABy2\tSdSS7zJY|zU%IF]\u0010L\u0001aZ}\u001b< MY~y@)QE_LJzHul{ns\r";
        objectArray[4] = "RC@$`V'n]18tfcE7-";
        objectArray[5] = "Lbpri\u001eQw(P(\u0013Iq";
        objectArray[6] = Void.TYPE;
        m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.f[6] = "java/lang/Void";
        objectArray[7] = "a|pug|a|g)ks{7g7kf|F5i3\"";
        objectArray[8] = Float.TYPE;
        m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.f[8] = "java/lang/Float";
        objectArray[9] = "^H\u0007W8%PA@_?>\u001d@\r\u001e;xU\u0015_O`+DD}}\u001a-e\u001dmp\u0010\r\u0003bPn+8duCv8/\u0002TM\u007f\u0007\u0012rh[Ph\beE\u0019s\u001d\fE`\u001fv\u001f0\n\u001a{{$+Dh{|g yBy}8<jHJQ5{rHXM\b>cWJ|b\u0003\u0004fG\n\u001a";
        objectArray[10] = "K ]>htK Jbd{QkJ|dnV\u001a\u0018&0*";
        objectArray[11] = "' ';'N))`3 Ud(-r#F re\u0019\tK(+Y=)d\u0007$k\u0017+M\u00021X\u001e&M\u0004\u0016B;zS\brl&\u001eN-/O0#I)\u0001Z'{e%-?\u0000\u001d\u0018r\u0001g\u0005vK=\u0011|a(\u0010stM9\u0007\u0015?s{2&R9=x.\u001aG?\u0007G'\u0016X\u0003&`\u0010{";
        objectArray[12] = "\t\u001b\u0003:\u000bX\u0002\u0014\u0012ujV\t\u001f\u0016/";
        objectArray[13] = "A\rc%x\t4 ~0 +u-f65";
        objectArray[14] = "\t*\u001aT33\u0002%\u000b\u001b_0\f'\tTs";
        objectArray[15] = "Ie5ZxSId*'#E[U#J\u0018\u0005\u0010ts`\u0007\u0005\u001aZ\u0014j&\bOA\u0011B>\u0012(H,Z\"\u0012%H8`\u0019\u0019,r E\u0005)(p\bU\"\u000f+d6u-#\u001bm,|+\u0017<sv{94H;\u000bV,;\u0011`\u000b\u0016\u00034-w\u000bK-\u0014Igqe7\u0003\u0016R#Bw&H3I[\"\u0004Npv[!\rw3;\u0017=W\tl7_&i";
        objectArray[16] = ")\u0014\u00130.=v\u000e\u0012pT3?]\u000f5%9^!F\u0012%\u0019oJ#,-\t(A\u001b(1)#-67=/*;\u0010)\u0013'W8F*j\u0006Z\u001b\u0003\u0018\u00151~:F\u000en\u0006#\u000e x0:} \u0006p6hq\u000e\u0012r\b4i\u0018F\f\u0004;,\u000e \u001a\u0010\u001b^\u0018\u000f1/hu:E\u0018d\t\"?MHj9o\fCrj8pqL%),+\t\u001b1+,\u0013J\u001f!o;-\u000f\u001ar&V/\u001dB6h;o\u0003\u001f3T";
        objectArray[17] = "\u0002%\u000bcD\u0007\u0002$\u0014\u001e\u001f\u0011\u0010/</\u0016\\N%/$\u0003[f8\u000b.=E^$6S:\\\u0003\u0017-%\u0005Svr\u001e_\u000bTp.(`\u001a\\\f$\u000foC_\u0007)>#:ff\u00136T7zv'\u001dq\"{S\u000e-`\u0005C\u0002$)A:D}/0d%rV\u000fNg3os3\u0010s=WY\bw#FZ\u0003z\u001cy\u0019ZCJ\u000bz\u0017\u0004Fu\u000by\u001e=\u00018M'\u000b[E-\u001bez";
        objectArray[18] = "r\u000e\u001a\u0004~&?\u000e\\\u0010Dr/\u001b=\u0013 `/gS\u0019/o+\r\u001fJ 'B";
        objectArray[19] = "o\u0003\u0002y\u0019;?\u000eX%yd}@a&\u001dY0,\u00006$Q:\u0015Y-CY\u00116\u0006q\b_k,G\u001348\u0010P\b4Fl#\u0002D\u0003\"A!\u0001\u0000%#G\u001c \u007f6\u0004}<U\u0005/&:h%\t12z\f\u0017\u0004\u0014\u0017y\u000f>h\u0004$P;\u0007D:\u00171a,V!\u001b[\u001c\u001c@\u0014\u001a8)'WHFo(\u0014A6\to?\u00059q\u000b1*RG.\u0007y1l";
        objectArray[20] = "Clq=\b\u001a\u0013a+ahEQ/rg\"m%@\u000eUVI\u00178'77M m\u0013v\u0015i\u0018G\u0013jS\\;R)C\u0013I\u0018B\u0015W.G\u001dHz2\u0017Z>~\u001af\u0019D\fm;\\T\u001a3`\u0017R\u0012X;MuS\u0019Z\u0001>\u0018s*[4<waP\u001c&m'}\rz\u001c>:f\u0015\u0010\u0012i\u000b\fWN\u0004{2r\u0018N\u0013jJp\fMDyup\u000fD}:8<\u0013\u001e\u0003e4t\b ";
        objectArray[21] = "&B\u0011f\bkcGB/e:p\\19\u001d5t \u00049\blg\u001f\u0004:\u0001U";
        objectArray[22] = "J$8R;p\u0015>9\u0012A~\\m$W0t=\u0011mp0T\fz\bN8DKq0J$d@\u001d\u001dU(bI\u000b;K\u0006j4\bmH\u007fK9+(z\u0000|\u001d\nml{K@>\u000b\u001a%w\u001e\u0010-\u0012#%\u0012>9\u0010\u001dy\n(mn\u0011vO>\u000bx\u0005V=($S:%\u0016\nnzqDA\u000ff*\u007ft\f<h\u0010\u007fu\u0013AgG<aH90S>ap";
        Object[] objectArray2 = objectArray;
        objectArray[23] = "AT\u0003yps\u001dB_|\u0015c\u0017O\u0002p|o.A\u0002`x\tIZVf+w\u0016V\u001e}\u0015";
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == 'c' || c == 'f' || c == '\u00fd') {
                field = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ec' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x260B;
        if (d[n2] == null) {
            m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }

    public static int a(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 26;
            case 1 -> 4;
            case 2 -> 3;
            case 3 -> 58;
            case 4 -> 46;
            case 5 -> 2;
            case 6 -> 8;
            case 7 -> 56;
            case 8 -> 15;
            case 9 -> 25;
            case 10 -> 50;
            case 11 -> 28;
            case 12 -> 12;
            case 13 -> 45;
            case 14 -> 23;
            case 15 -> 37;
            case 16 -> 53;
            case 17 -> 44;
            case 18 -> 13;
            case 19 -> 16;
            case 20 -> 60;
            case 21 -> 10;
            case 22 -> 34;
            case 23 -> 22;
            case 24 -> 39;
            case 25 -> 19;
            case 26 -> 14;
            case 27 -> 35;
            case 28 -> 27;
            case 29 -> 11;
            case 30 -> 29;
            case 31 -> 63;
            case 32 -> 32;
            case 33 -> 52;
            case 34 -> 7;
            case 35 -> 0;
            case 36 -> 41;
            case 37 -> 30;
            case 38 -> 48;
            case 39 -> 31;
            case 40 -> 17;
            case 41 -> 24;
            case 42 -> 47;
            case 43 -> 57;
            case 44 -> 61;
            case 45 -> 55;
            case 46 -> 59;
            case 47 -> 33;
            case 48 -> 62;
            case 49 -> 21;
            case 50 -> 36;
            case 51 -> 5;
            case 52 -> 54;
            case 53 -> 49;
            case 54 -> 43;
            case 55 -> 40;
            case 56 -> 38;
            case 57 -> 18;
            case 58 -> 20;
            case 59 -> 42;
            case 60 -> 51;
            case 61 -> 1;
            case 62 -> 9;
            default -> 6;
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
        m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.f[n3] = new String(cArray);
        return n3;
    }

    default public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb, Color[] colorArray, Color color) {
        m$$T15vd92SGo4ioRoaknO5bXBgWzPiXSnJlOFM04YEWPn30wyjgOVG4gmnZO4ZEF8MXmaeyWCS6Mv4Mrp9fXCbvhHQRondDFj3n.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(color, (int)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)colorArray[0], (long)1506041596332031L)), m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(color, (int)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)colorArray[1], (long)1506041596332031L)));
    }

    default public Color[] m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb) {
        return new Color[]{(Color)((Object)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.m$$TddcUKDI7TOOBw3M7NZldvCBNE2MgpZ8cW8E2DanFNae272LDxj7t0jJsUMUKJxLCFAZwshwgyxAkZlAMocPfPg8mDC6Hax40, (long)1278248543480220L)), (Color)((Object)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.m$$isKs2wuhpN74XCSVsPIVHfzotRuvkSBp0chuPv83x9dr4ZZoALfCtnQOIEKsRmMaW7BXu2Jcoem0ToLwFhOlFJ1coFJwWeLHT, (long)1278248543480220L))};
    }

    default public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb, class_1297 class_12972, class_4587 class_45872) {
        block13: {
            Color[] colorArray = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)this, (Object)m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb, (long)1593465107676226L);
            if (m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)((Boolean)((Object)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.m$$cD1zBm9fbnkd3BLyN0ZuZjCKIOSwDZBdlH5QzdVqnGl9PZmH4SkFlotS2SpMXt4iSZd7SlUKCHFsIx1FaSBnyyaYU23GPrqUk, (long)1278248543480220L))), (long)1654715113726375L) != false) {
                CallSite callSite = m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb, (Object)class_12972, (int)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(18775, 8832156477618614110L), (long)1229621264319563L);
                colorArray = new Color[]{m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((Color)((Object)colorArray[0]), (int)(callSite * (float)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)colorArray[0], (long)1506041596332031L))), m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((Color)((Object)colorArray[1]), (int)(callSite * (float)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)colorArray[1], (long)1506041596332031L)))};
            }
            try {
                m$$T15vd92SGo4ioRoaknO5bXBgWzPiXSnJlOFM04YEWPn30wyjgOVG4gmnZO4ZEF8MXmaeyWCS6Mv4Mrp9fXCbvhHQRondDFj3n.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Color)((Object)colorArray[0]), (Color)((Object)colorArray[1]));
                if (m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)((Boolean)((Object)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.m$$xkvLizplNaXdEOYibBefVzIpnBKU1aabYGceJGZB4E87IUU3bchGhCvMPk3KRdRsRnHCkVIxO5UKrKTFKDL1NrYs7UBqqdCRB, (long)1278248543480220L))), (long)1654715113726375L) == false || !(class_12972 instanceof class_1657)) break block13;
            }
            catch (class_151 class_1512) {
                throw m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(class_1512);
            }
            class_1657 class_16572 = (class_1657)class_12972;
            try {
                if (m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$vv2moGHmva8usg6yExBFD762bvfyagfxd1YZtsA0loLJrVWfJCYOyBR80w5bwATO42sZv3q10jyibSu3v5OXcS9yxvOHcHgRc, (Object)class_16572, (int)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(31963, 7048139839779068624L), (long)1407900405185858L) != false) {
                    m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)this, (Object)m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb, (Object)colorArray, (Object)((Color)((Object)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.m$$jnENOFLRa4D7qJAAcZj4fJhiMfI8kSG0nH0ap8pxwkd8Tcoqt6s3L6Obmrml6O6Wy2qwQzEx8Mo2s8BCRholUENVadaZt9Q76.m$$ROpn2r9dnd1wJ0LPlJFOmekzMIlYpTeWD3ArbEgDxryxF72gSa77K24pOIzY9WPQemXsY6Ncindp0XDAqZ1JUmEw6hCMsLQrY, (long)1278248543480220L))), (long)1142028414913304L);
                }
            }
            catch (class_151 class_1513) {
                throw m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(class_1513);
            }
            try {
                if (m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$vv2moGHmva8usg6yExBFD762bvfyagfxd1YZtsA0loLJrVWfJCYOyBR80w5bwATO42sZv3q10jyibSu3v5OXcS9yxvOHcHgRc, (Object)class_16572, (long)1350099527076525L) != false) {
                    m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)this, (Object)m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb, (Object)colorArray, (Object)((Color)((Object)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.m$$jnENOFLRa4D7qJAAcZj4fJhiMfI8kSG0nH0ap8pxwkd8Tcoqt6s3L6Obmrml6O6Wy2qwQzEx8Mo2s8BCRholUENVadaZt9Q76.m$$AyADg0UdtiNPJeLDI2QBBIjozC7GPbjwEwmsbkzk3CpKpMMfzbu8G4zEZDJRAiKzm5SdmPsW1NVspkXtXpXJgJ8NlUNt7UrdT, (long)1278248543480220L))), (long)1142028414913304L);
                }
            }
            catch (class_151 class_1514) {
                throw m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(class_1514);
            }
        }
        if (class_12972 instanceof class_1657) {
            class_1657 class_16573 = (class_1657)class_12972;
            try {
                if (m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a("\u00ec", (Object)m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb, (int)m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(25029, 8542050134353332175L), (long)1095703240667251L) != false) {
                    class_16573.field_42108.field_42109 = 0.0f;
                    class_16573.field_42108.field_42110 = 0.0f;
                    class_16573.field_42108.field_42111 = 0.0f;
                }
            }
            catch (class_151 class_1515) {
                throw m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.a(class_1515);
            }
        }
        m$$T15vd92SGo4ioRoaknO5bXBgWzPiXSnJlOFM04YEWPn30wyjgOVG4gmnZO4ZEF8MXmaeyWCS6Mv4Mrp9fXCbvhHQRondDFj3n.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_45872, class_12972);
    }

    default public boolean m$$QNmhDM27eGY3w8yYdwou28pZAnxCe9LFLNaHTHzwlcF31i6PiUkv81WirfqrEuGVY4yJyJ7NbYNaqzecc1yCQ6HqRujo02ujU() {
        return false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$ApULTmtBHFxSoPBh1RH5OErs51tfcmtkue7wrZeJVr41I3rzOLTP7CkiEz20rTjSPoqKK9IKYWk29juThPEciHIeO0pxzRk95.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

