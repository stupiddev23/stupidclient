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
import me.mioclient.m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5;
import net.minecraft.class_243;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1
extends m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5 {
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final Object[] g;
    public static final String[] h;

    public m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1(byte[] byArray) {
        super(byArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new Object[5];
        h = new String[5];
        m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.c();
        long l = 3096798522888252960L;
        long l2 = 0xBB6B09FCA64672B3L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 5512442859704752307L;
        long l4 = 0x144B510E9BDA0E22L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.c("k", (long)l4, (long)324687932748476L);
    }

    public static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static int i(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (h[n3] != null) {
            return n3;
        }
        Object object = g[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 36;
            case 1 -> 20;
            case 2 -> 38;
            case 3 -> 4;
            case 4 -> 53;
            case 5 -> 33;
            case 6 -> 60;
            case 7 -> 16;
            case 8 -> 44;
            case 9 -> 30;
            case 10 -> 19;
            case 11 -> 34;
            case 12 -> 57;
            case 13 -> 52;
            case 14 -> 0;
            case 15 -> 24;
            case 16 -> 42;
            case 17 -> 15;
            case 18 -> 31;
            case 19 -> 41;
            case 20 -> 27;
            case 21 -> 37;
            case 22 -> 13;
            case 23 -> 3;
            case 24 -> 6;
            case 25 -> 45;
            case 26 -> 26;
            case 27 -> 61;
            case 28 -> 51;
            case 29 -> 5;
            case 30 -> 11;
            case 31 -> 63;
            case 32 -> 62;
            case 33 -> 29;
            case 34 -> 22;
            case 35 -> 17;
            case 36 -> 18;
            case 37 -> 12;
            case 38 -> 25;
            case 39 -> 21;
            case 40 -> 58;
            case 41 -> 35;
            case 42 -> 50;
            case 43 -> 43;
            case 44 -> 14;
            case 45 -> 32;
            case 46 -> 39;
            case 47 -> 2;
            case 48 -> 48;
            case 49 -> 40;
            case 50 -> 23;
            case 51 -> 28;
            case 52 -> 54;
            case 53 -> 1;
            case 54 -> 46;
            case 55 -> 7;
            case 56 -> 55;
            case 57 -> 10;
            case 58 -> 9;
            case 59 -> 56;
            case 60 -> 49;
            case 61 -> 59;
            case 62 -> 8;
            default -> 47;
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
        m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.h[n3] = new String(cArray);
        return n3;
    }

    public static void c() {
        Object[] objectArray = g;
        g[0] = "_MH8SIQD\u000f0TR\u001cEBq[wgZ\b\u001d]w\u0006xS8oHZ@?2MTwZ#\u000fsPz\u0011\"\u0019Sq\u0002z\u0014\u0000S\u0015DcP/\\p\u0001b6gxC\u0006{V\u000fr`]\u007fU\u0010Qjga\u00022{g`]\u0016cmN[f\u0017&hiS\u001a\u0004!WrW\u0010\u001e$\u000eWZ\u001c\u0017\u001dW";
        objectArray[1] = Long.TYPE;
        m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.h[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.h[2] = "java/lang/Integer";
        objectArray[3] = "Ww@~\u0011}\\xQ1psWsUk";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "~U~B%g,_0}\u0011'2\u000e0E=T\"\u007f|7~Q$L=\u001bru(t\u000f;&l\r~{\u0007\bo?[\u0005\u001a\u0011V{[x\u001ep|\u001e\u0005{@\u000bm,B\u00019#)(S#$\u001dv#a\u0003L(W(y}\u000f6&(u:/\fP/t\",\u0004J\u0011\u0007&\u0019\bD>r3\u0007wtxlA\u0002u|;\\:\u000fr/C\u0004{\u0010/s'R-\u0007u\u0016";
    }

    public static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'O' || c == '\u00ed' || c == '\u00e1' || c == '\u00de') {
                field = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.k(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.l(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'N' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'k' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.c(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field f(Class clazz, String string, Class clazz2) {
        Field field = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method l(long l) {
        int n = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.i(l);
        Object object = g[n];
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
                clazz3 = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.j(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.j(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.j(280806517094208L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.j(280806517094208L);
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

    public static Field k(long l) {
        int n = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.i(l);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.j(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.j(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.e(clazz3, string2, clazz2)) != null) {
                    m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.j(280806517094208L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Class j(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.i(l);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_243 class_2432, float f) {
    }

    @Override
    public void m$$mC9dizgP2qnRzt8OpjfIEHi7UR3wfB0aIyaDlWvhi8fpy1j3kA5HSRQIBEOBebgPNgLRvwv6fVWHqImOrWGbM1qAZGqoeObmJ(float f) {
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5$1.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

