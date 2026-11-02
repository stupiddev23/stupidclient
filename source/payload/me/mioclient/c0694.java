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
import java.util.HashSet;
import java.util.Set;
import net.minecraft.class_2246;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK {
    public static final Set m$$aCkgnAX98Ewh9152U5Y2h7fLxJ0iA4jxvi5FwA3KhyrVOJukyumdXCHhfiqJJVyGShSNnIhy9MyEloY7twcfq68PTkiwbXmvD;
    public static final Set m$$ZGNUe3r45GbNToHAz7vaHdMU6wlnbfPFl8bbf7KnxCg7l7F2tZv4nvAzgUNLwIiUD2EoZsDl6Zc3kMXvij7QrLJHXd8667dVo;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] a;
    public static final String[] b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[8];
        b = new String[8];
        m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a();
        long l = 466678727471421699L;
        long l2 = 0x93A033D780D76E67L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 3878941446832475694L;
        long l4 = 0x76E627DA9FDD6AB0L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a("d", (long)l4, (long)473334820992973L);
        m$$aCkgnAX98Ewh9152U5Y2h7fLxJ0iA4jxvi5FwA3KhyrVOJukyumdXCHhfiqJJVyGShSNnIhy9MyEloY7twcfq68PTkiwbXmvD = new HashSet(m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a("d", (Object)class_2246.field_28411, (Object)class_2246.field_27159, (Object)class_2246.field_27120, (Object)class_2246.field_37576, (Object)class_2246.field_28678, (Object)class_2246.field_28673, (Object)class_2246.field_28675, (Object)class_2246.field_37551, (Object)class_2246.field_37546, (long)560934847582978L));
        m$$ZGNUe3r45GbNToHAz7vaHdMU6wlnbfPFl8bbf7KnxCg7l7F2tZv4nvAzgUNLwIiUD2EoZsDl6Zc3kMXvij7QrLJHXd8667dVo = new HashSet(m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a("d", (Object)class_2246.field_22109, (Object)class_2246.field_23077, (Object)class_2246.field_22091, (Object)class_2246.field_23985, (Object)class_2246.field_22090, (Object)class_2246.field_22120, (Object)class_2246.field_22113, (Object)class_2246.field_23869, (long)395462382781793L));
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
            case 0 -> 2;
            case 1 -> 14;
            case 2 -> 20;
            case 3 -> 23;
            case 4 -> 51;
            case 5 -> 33;
            case 6 -> 27;
            case 7 -> 32;
            case 8 -> 40;
            case 9 -> 26;
            case 10 -> 37;
            case 11 -> 62;
            case 12 -> 47;
            case 13 -> 52;
            case 14 -> 5;
            case 15 -> 39;
            case 16 -> 0;
            case 17 -> 34;
            case 18 -> 25;
            case 19 -> 58;
            case 20 -> 16;
            case 21 -> 3;
            case 22 -> 11;
            case 23 -> 29;
            case 24 -> 31;
            case 25 -> 57;
            case 26 -> 15;
            case 27 -> 50;
            case 28 -> 22;
            case 29 -> 44;
            case 30 -> 49;
            case 31 -> 19;
            case 32 -> 6;
            case 33 -> 21;
            case 34 -> 4;
            case 35 -> 45;
            case 36 -> 46;
            case 37 -> 53;
            case 38 -> 35;
            case 39 -> 7;
            case 40 -> 38;
            case 41 -> 42;
            case 42 -> 12;
            case 43 -> 30;
            case 44 -> 60;
            case 45 -> 9;
            case 46 -> 55;
            case 47 -> 48;
            case 48 -> 17;
            case 49 -> 18;
            case 50 -> 1;
            case 51 -> 41;
            case 52 -> 24;
            case 53 -> 56;
            case 54 -> 43;
            case 55 -> 28;
            case 56 -> 13;
            case 57 -> 63;
            case 58 -> 8;
            case 59 -> 36;
            case 60 -> 61;
            case 61 -> 59;
            case 62 -> 54;
            default -> 10;
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
        m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "|\"q[2,b*k\u0014P0e7";
        objectArray[1] = "tk%%\u0014o\u007fd4juato00";
        objectArray[2] = "ew{F\n.k~<N\r5&\u007fq\u000f\u0002\u0010]`;c\u0004\u0010<B`F6/`z\fL\u00143M`\u0010q*7@+\u0011g\n\u00168@'~\nr~YcQ\u0005\u0017;X\u0005\u0019!$<Aeq+\u0007gEfn\b\r][1L\"\u0000Zg%\u001d4)a\\$X1\u000ei 7_\u000e\u0015m*-ZW0`&$c\u000e";
        objectArray[3] = Long.TYPE;
        m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b[3] = "java/lang/Long";
        objectArray[4] = Integer.TYPE;
        m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b[4] = "java/lang/Integer";
        objectArray[5] = "\u000b7*F;JMw2#>N4z.Y4_MvlJYQOq8\\ ]\rbUR\"ZYt,^`I4z.Y4_MvlJYQOq8\\ ]\rbUR\"ZYt,^`I4z.Y4_MvlJYQOq8\\ ]\rbU\u001ce_Qi?Z%G4";
        objectArray[6] = "\u0000;Af ^Y*HnYy\b6\b.aU{&yb\u0013\u0016~ J#?\u001aZ,r\u0011\u001fNC\txe#`@;]\u001b>yy\u007f]f:\u0018S\u001a\u0003edcB(D\u001f\u001dK\u0006,U=\u0000uY'g\u001dh@x,\u007fc+^\t,s$\u000bd\u007f+r<\ble\u0015\u00018=`k:t-#\u001f[|j_cL\u0004x]32WY|8e&]H\u007fV&bF\u0004G";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "\f\u0017\u007f'v\u001aJWgBs\u001e3Z{8y\u000fJV9+\u0014\u0001HQm=m\r\nB\u00003o\n^Ty?-\u00193Z{8y\u000fJV9+\u0014\u0001HQm=m\r\nB\u00003o\n^Ty?-\u00193Z{8y\u000fJV9+\u0014\u0001HQm=m\r\nB\u00003o\n^Ty?-\u00193\u0014<=q\u0012YR|%\u0014";
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a(clazz3, string2, clazz2)) != null) {
                    m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b(98171608097422L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Method d(long l) {
        int n = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a(l);
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
                clazz3 = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b(98171608097422L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.b(98171608097422L);
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
            if (c == '\u00a3' || c == '\u00eb' || c == '\u00d2' || c == '\u00e4') {
                field = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00eb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$TSFARYE5sbCjuAxU1EbQ5sShOAPhJd5vCKf56yLvWzFjajEPxiuDVjvjvxmCihjllYNB1ySDbDgVl9ZVPsAyfR5kv1q1alWQK.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

