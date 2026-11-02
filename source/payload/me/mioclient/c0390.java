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
import me.mioclient.m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW;
import me.mioclient.mixin.m$$2cYMky39mwndptegkjLw70A3j9PH3hRKx5DC9AeB5wbxGpRRMnubaRojwfJK4VmCwQgW5MVKmZwQItLeUL8WA4rUxGj5bRf9A;
import net.minecraft.class_151;

final class m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6
extends m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public boolean skip;
    public static final long[] b;
    public static final Integer[] c;
    public static final Object[] f;
    public static final String[] g;

    public m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new Object[14];
        g = new String[14];
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.b();
        long l = 5537233322282534673L;
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00f7o\u0084\u0002LE\u008b\u0012\u00a0\u0002\u00de\u0084\u0016:T\u00f2";
        int n2 = "\u00f7o\u0084\u0002LE\u008b\u0012\u00a0\u0002\u00de\u0084\u0016:T\u00f2".length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    public static int e(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = f[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 38;
            case 1 -> 62;
            case 2 -> 32;
            case 3 -> 61;
            case 4 -> 52;
            case 5 -> 27;
            case 6 -> 51;
            case 7 -> 63;
            case 8 -> 58;
            case 9 -> 33;
            case 10 -> 49;
            case 11 -> 22;
            case 12 -> 12;
            case 13 -> 6;
            case 14 -> 24;
            case 15 -> 56;
            case 16 -> 16;
            case 17 -> 41;
            case 18 -> 4;
            case 19 -> 1;
            case 20 -> 30;
            case 21 -> 11;
            case 22 -> 14;
            case 23 -> 40;
            case 24 -> 15;
            case 25 -> 3;
            case 26 -> 35;
            case 27 -> 17;
            case 28 -> 7;
            case 29 -> 60;
            case 30 -> 55;
            case 31 -> 45;
            case 32 -> 59;
            case 33 -> 21;
            case 34 -> 34;
            case 35 -> 29;
            case 36 -> 42;
            case 37 -> 18;
            case 38 -> 43;
            case 39 -> 13;
            case 40 -> 28;
            case 41 -> 10;
            case 42 -> 2;
            case 43 -> 0;
            case 44 -> 47;
            case 45 -> 5;
            case 46 -> 53;
            case 47 -> 20;
            case 48 -> 57;
            case 49 -> 37;
            case 50 -> 19;
            case 51 -> 39;
            case 52 -> 50;
            case 53 -> 25;
            case 54 -> 36;
            case 55 -> 44;
            case 56 -> 48;
            case 57 -> 31;
            case 58 -> 46;
            case 59 -> 23;
            case 60 -> 54;
            case 61 -> 8;
            case 62 -> 26;
            default -> 9;
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
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.g[n3] = new String(cArray);
        return n3;
    }

    public static void b() {
        Object[] objectArray = f;
        f[0] = "\u0007\nkFmF\t\u0003,Nj]D\u0002a\u000fn}\f\u0016\u0015\u0018Fd+?&GV@(8?^TC,9\tz3\u001d\u0000\u0015\u0003EJQ\u0004\u001a#SP~\u0000[\"fNX0WqcV\u007f<!\u001c}L}\u0003&?evO[\u0007\nJw\\\t\u00062\\I\u001e-9rnHH\u0001\u001ewAKl\u001f\u000b\u0007M]b\u0006.\nEB";
        objectArray[1] = "xQ\u001a\"\u001b:xQ\r~\u00175b\u001a\r`\u0017 ek\\9Oe";
        objectArray[2] = "L*k\u0014,rB#,\u001c+i\u000f\"a],.@~\"27Wp\u0003\b7/(m\u0002\u0017\u0015*x[\f\u0002\f?%yw\b\u0017\u000f%\u0017\u0004,\r1+Q\u0002+\u0011\u0017Kq=\n\u0015<RP\u0006\u0000\u001e$Nsx++ugR\u001ar!\u0013\\y\u0002'4 %Sxq\u000b\u0004qx\r\"\bvt\u0019-\u0001\u0003\u000eig\u001c\u00005.";
        objectArray[3] = Integer.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.g[3] = "java/lang/Integer";
        objectArray[4] = Float.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.g[4] = "java/lang/Float";
        objectArray[5] = "#;v\u0004g\u0016#;aXk\u00199paFk\f>\u00015\u001e<";
        objectArray[6] = Boolean.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.g[6] = "java/lang/Boolean";
        objectArray[7] = "\u0011@a@%\u000e\u001fI&H\"\u0015RHk\t~4\u0005_\u0005k\u0005'K\u0012.B(W(t!w\u000eP\u000eB;g%\"\u001eFy\u0015\u0007\u0010NV\u0004d-\u0018%t|\u001d\u001e+Dk\u0019\u00159(2v\u0004|\u0019U)A\u0007\\<\u0004-q6\u0015}6\u000bv5N\u0000&\u0018N\u001an\t\u001b\tr\re\u0005+\nv)\u007f\u000e1/\u0016\u0005\u001f\n";
        objectArray[8] = Void.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.g[8] = "java/lang/Void";
        objectArray[9] = "Y\u0010NU\u0019>R\u001f_\u001ax0Y\u0014[@";
        objectArray[10] = "V\u0018H,xn\f\u0019U \u0016;\u0007YL{z\tP\u0019\u001c&&^VIO~yn\u0005IFq\u0016";
        objectArray[11] = "h6*I$\t*#0[[\u0003yu\u0000B&\u0007\b\u00171Ub\u0016%7*o\u0010\u0018\b\u0006\u0012\u0019\u001c\n\u00053i\\)_k>=I\u0007#\u001957\u001eg\u0004\u000f5\u0016b;\u001c?\u0005\tU\t4)4;i\u0003\u001bl\u0019\"\u001be4\b$ H\u0017\u001f\u0016\u0013\u001dW1:\r)\u0013\u001f\u001d/>#7We'\u0010\u0017\u000bZ\u0002\u001a<\u0016\u0017%g\n6;=\u00154\n?4R\u001f`\u00194;-O8\u000b,Yo_e\u0007:28K>\u0017U";
        objectArray[12] = "xhi\t7Cl430o\u00050GmtI@x1'ohpQkjiGIM7n[:hNV:\u0000@hF~\u0019YHCFq+LxjZI'a3{p\u007f'RpNb?>TL\u0018MC\u0005\nheD^\u0014B6iwR\u000eM3du0\u0007NMksJ)QhCRo\u0014\u0000VJR>U@7\u0018ch.\n7@\u001c";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "\u0016,8\u0002\u0005\n\u0010r|\u0006>T\u00008>6Lrid\u001f\rpq\u001di\u0018=\\QoQ)>\u000eH\u0017X,=gNkyr\u0006Q~O*}\u0011srnkx\u0010eJP\u007f0W[rbF\u001c>EL|\u007f.Uo\u007f~s.\"\u0007|M.\u00046\u0003aj}\u0018.XaJJ\u0006-^\fMK0UnJ\u0015o.o\u0004\nSu \u0010TRAmBT\u000eM\\p;T_\t\u001d\u0014";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c9' || c == '\u00f8' || c == '\u00e3' || c == 'g') {
                field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'n' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'x' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static Method h(long l) {
        int n = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.e(l);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.f(688120465907545L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.f(688120465907545L);
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

    public static Class f(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.e(l);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x20E;
        if (c[n2] == null) {
            m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static Field g(long l) {
        int n = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.e(l);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.c(clazz3, string2, clazz2)) != null) {
                    m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.f(688120465907545L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW) {
        block5: {
            CallSite callSite = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.b("n", (Object)m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW, (long)855018193686849L);
            if (callSite instanceof m$$2cYMky39mwndptegkjLw70A3j9PH3hRKx5DC9AeB5wbxGpRRMnubaRojwfJK4VmCwQgW5MVKmZwQItLeUL8WA4rUxGj5bRf9A) {
                m$$2cYMky39mwndptegkjLw70A3j9PH3hRKx5DC9AeB5wbxGpRRMnubaRojwfJK4VmCwQgW5MVKmZwQItLeUL8WA4rUxGj5bRf9A m$$2cYMky39mwndptegkjLw70A3j9PH3hRKx5DC9AeB5wbxGpRRMnubaRojwfJK4VmCwQgW5MVKmZwQItLeUL8WA4rUxGj5bRf9A = (m$$2cYMky39mwndptegkjLw70A3j9PH3hRKx5DC9AeB5wbxGpRRMnubaRojwfJK4VmCwQgW5MVKmZwQItLeUL8WA4rUxGj5bRf9A)((Object)callSite);
                try {
                    try {
                        if (!(m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.b("x", (int)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.a(13901, 4021395375385490498L), (long)924972912139581L) > 3.0f) && !this.skip) break block5;
                    }
                    catch (class_151 class_1512) {
                        throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.a(class_1512);
                    }
                    m$$2cYMky39mwndptegkjLw70A3j9PH3hRKx5DC9AeB5wbxGpRRMnubaRojwfJK4VmCwQgW5MVKmZwQItLeUL8WA4rUxGj5bRf9A.setOnGround(false);
                    this.skip = true;
                }
                catch (class_151 class_1513) {
                    throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.a(class_1513);
                }
            }
        }
    }

    public static String m$$SN749Y3TS3WcJaUiWRBhtKu646X28giKvJnXQVprL5UGY3odlESbUbjTmsHMlSby9dNwbFY8oLjjwtRVrnbO0HkYFXxg3rEEW(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-47, 36, -39, 10, 61, 59, -78, 83, -46, -76, -95, 87, 20};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 13]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    @Override
    public void m$$cFy0S2bS7U2m7bzc3O5IB0USk2GXplPOWMwkPbtlcMqUPwZdqWrImGD45wOTIHxHoiuNbH5qx8JEe1cGK4OtWr7Feso78ZhRo() {
        block4: {
            try {
                try {
                    if (this.skip && m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.b("n", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)766076861442443L) != false) break block4;
                }
                catch (class_151 class_1512) {
                    throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.a(class_1512);
                }
                return;
            }
            catch (class_151 class_1513) {
                throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.a(class_1513);
            }
        }
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.b("n", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$gS9PAlaXAxL5QeubWHIAXb2SMQHx4ZqJccJ6xSaLtSYmzF3BbRnZ7lTAqYuOwjpd1rr0iHdIrcGWYv7LPrkcBv6pS9NWy5sQB, (boolean)true, (int)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.a(21926, 6535637542401890216L), (long)817929531898125L);
        this.skip = false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

