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
import me.mioclient.m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW;
import net.minecraft.class_151;
import net.minecraft.class_243;
import net.minecraft.class_2828;

final class m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2
extends m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public static final long b;
    public static final Object[] c;
    public static final String[] f;

    public m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = new Object[23];
        f = new String[23];
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b();
        long l = 2171157373546594752L;
        b = 0x29D5A5E909D62661L ^ l;
    }

    public static int e(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 43;
            case 1 -> 12;
            case 2 -> 28;
            case 3 -> 54;
            case 4 -> 45;
            case 5 -> 50;
            case 6 -> 40;
            case 7 -> 35;
            case 8 -> 44;
            case 9 -> 58;
            case 10 -> 18;
            case 11 -> 57;
            case 12 -> 0;
            case 13 -> 59;
            case 14 -> 34;
            case 15 -> 21;
            case 16 -> 56;
            case 17 -> 15;
            case 18 -> 42;
            case 19 -> 36;
            case 20 -> 22;
            case 21 -> 14;
            case 22 -> 38;
            case 23 -> 19;
            case 24 -> 33;
            case 25 -> 51;
            case 26 -> 1;
            case 27 -> 52;
            case 28 -> 9;
            case 29 -> 48;
            case 30 -> 46;
            case 31 -> 31;
            case 32 -> 62;
            case 33 -> 5;
            case 34 -> 2;
            case 35 -> 25;
            case 36 -> 20;
            case 37 -> 16;
            case 38 -> 47;
            case 39 -> 10;
            case 40 -> 11;
            case 41 -> 24;
            case 42 -> 61;
            case 43 -> 37;
            case 44 -> 29;
            case 45 -> 39;
            case 46 -> 26;
            case 47 -> 55;
            case 48 -> 27;
            case 49 -> 8;
            case 50 -> 63;
            case 51 -> 17;
            case 52 -> 6;
            case 53 -> 3;
            case 54 -> 13;
            case 55 -> 30;
            case 56 -> 32;
            case 57 -> 4;
            case 58 -> 23;
            case 59 -> 60;
            case 60 -> 41;
            case 61 -> 53;
            case 62 -> 7;
            default -> 49;
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
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c2' || c == '\u00cf' || c == 'h' || c == 'v') {
                field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'h' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'x' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void b() {
        Object[] objectArray = c;
        c[0] = "@uV8y^@uAduQZ>AzuD]O\u0015\"\"";
        objectArray[1] = "}G]2\u0010j}GJn\u001ceg\fJp\u001cp`}\u001b/E";
        objectArray[2] = "\u0000D%\f\u0003\f\u000eMb\u0004\u0004\u0017CL/E\u00007\u000bX[R(.,qh\r8\n/vq\u0014:\t+wG0]W\u0007[M\u000f$\u001b\u0003Tm\u0019>4\u0007\u0015l, \u00127\u0019?)85;oR7\"7\u0004hq/\u0018\u0005\\ID\u0000\u0019\u0016\u000eH|\u0016'T*w<$&\u0002\u0006P9\u000b%&\u0018EI\u00073(\u0001`D\u000f,";
        objectArray[3] = "\u0011Lk+\u0012D\u0011L|w\u001eK\u000b\u0007|i\u001e^\fv-0F\u001b";
        objectArray[4] = Double.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f[4] = "java/lang/Double";
        objectArray[5] = Void.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f[5] = "java/lang/Void";
        objectArray[6] = "\u0007\u001fH\tJO\u0007\u001f_UF@\u001dT_KFU\u001a%\n\u0014\u001f";
        objectArray[7] = Boolean.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f[7] = "java/lang/Boolean";
        objectArray[8] = "\u0013r.B?\u0016\u0013r9\u001e3\u0019\t99\u00003\f\u000eHhXa";
        objectArray[9] = "q,hP$\u0016\u007f%/X#\r2$b\u0019$J}x!v?3M\u0005\u000bs'LP\u0004\u0014Q\"\u001cf\n\u0001H7ADq\u000bS\u0007A*\u0002/I9Ol\u0004(U\u001f/L;\tQ46m\u0000\u0003Z,*N~(o}\u0003o\u001cqe\u001b8D\u0004$p(An~rO\f\u0015E\u000b!L~\u0010$+\u0002G\u0006\rZ\u001a\u0003q&";
        objectArray[10] = Integer.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f[10] = "java/lang/Integer";
        objectArray[11] = Float.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f[11] = "java/lang/Float";
        objectArray[12] = "]\u0010;]%\u0015V\u001f*\u0012D\u001b]\u0014.H";
        objectArray[13] = "k\u0010K9i\u001fo\u001f\u0017@j\u0014(\u001bH,XCo@\u0016\u007f\u000fC$\u0018\u0010:v\u00100\u0006O@";
        objectArray[14] = "* T0\u0004\u001e./\bI\u0007\u0015i+W%5E%q\u0001I[Dnp[/R\u001e\u007f{0";
        objectArray[15] = "UE\u0015\u0013\u001fdQJIj\u001co\u0016N\u0016\u0006.8Q\u0015KUy8\u001aMN\u0010\u0000k\u000eS\u0011jCr\t\u0011\u000b\u0013\u0010f\u0017NqP\taUT\b\u0003\u001d\u007f\n.MQ\u0018f\u0016\u0016\u0000VF<j";
        objectArray[16] = "/3\u0002\u0011g|u3\u0001J\u0004t~/\u0010JhF*cH\u0017:\u0011*o\u000b\u0016ow#5\u001a\u001d\u0004,#7HN4ax<\u001b-";
        objectArray[17] = "cRXfgeg]\u0004\u001fdn Y[sV9g\u0002\u0005/\u00019,Z\u0003exj8D\\\u001f";
        objectArray[18] = "Q\u0005&w*)U\nz\u000e)\"\u0012\u000e%b\u001bv^Qs>Lr\u0012\u0005377vQ\t$\u000e";
        objectArray[19] = "!\u0015^HB6(OOC)5uUE\u0014E\u0007!\u0011\u001cI)jhJ\u001a\tP9|TEs\u0013 {\u0016_\n@4eI%IY3'S\\\u001aM-x)\u001cORksO\u0015\u0015C`\u0018";
        objectArray[20] = "{\u007f\u007f0Y\u0006\u007fp#IZ\r8t|%hZ\u007f/!p?Z4w$3F\t i{I";
        objectArray[21] = "|Vv6Iz?^~4w\u007fi\u000bRm3Y,C$'(x\u001cj~j.W%v\"n\u001c*\u0004uC:GP\u0004}k\u0019\u001eX/}d+\u000bh\u0006a\\'&#\u0017Kj'\u0015`\"Y*>\u0013\\tvV\u0005Mx\t\u007fK\u0014\u0005&\u0005LG\u000e\n#\bN%\u0007\t]\u0007H_)\u0016x/iz\u0014GF&i+UM+y]p+\u0007y|I\u001b";
        Object[] objectArray2 = objectArray;
        objectArray[22] = "7>c\u000fN\rq~8]7\u0019%#~5E?L\u007f_\u000ey<8rX>U\u001cJJi=\u0007\u00052Cl>n\u0003Nb2\u0005X3j1=\u0012z?Kp8\u0013l\u0007udpTR?G]\\=L\u0001YdnVf2[hn!\u000e1h5D5\n,OfX-Q,oQF.WAhPpVg\u00070tnl\bEpr?]T\u00074v\u0002\\\bFuni\u000bG\u0001g\u000f";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
        int n = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
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
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(851158821374853L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(851158821374853L);
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
            int n = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static Field g(long l) {
        int n = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz3, string2, clazz2)) != null) {
                    m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(851158821374853L);
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
            CallSite callSite = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("\u00d9", (Object)m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW, (long)1477943232912330L);
            if (callSite instanceof class_2828) {
                class_2828 class_28282 = (class_2828)callSite;
                try {
                    try {
                        if (!(m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("x", (int)((int)b), (long)1570692950468484L) > 3.0f) || m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("\u00d9", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687, (Object)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("\u00d9", (Object)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("\u00d9", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)1035836786837397L), (double)0.0, (double)(((class_243)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("\u00d9", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)1305734929475538L)).field_1351 * 1.1), (double)0.0, (long)1338499865615987L), (long)1154591162063425L) != false) break block5;
                    }
                    catch (class_151 class_1512) {
                        throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.a(class_1512);
                    }
                    m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("\u00d9", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (double)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("\u00d9", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)962000818685042L), (double)(m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("\u00d9", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)1235495303386412L) + 2.0), (double)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("\u00d9", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)1455948172277793L), (long)1120723667680273L);
                }
                catch (class_151 class_1513) {
                    throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.a(class_1513);
                }
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

