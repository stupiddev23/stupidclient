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
import me.mioclient.mixin.m$$2cYMky39mwndptegkjLw70A3j9PH3hRKx5DC9AeB5wbxGpRRMnubaRojwfJK4VmCwQgW5MVKmZwQItLeUL8WA4rUxGj5bRf9A;
import net.minecraft.class_151;
import net.minecraft.class_2828;

final class m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1
extends m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public static final long b;
    public static final Object[] c;
    public static final String[] f;

    public m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = new Object[11];
        f = new String[11];
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b();
        long l = 1244243867225059648L;
        b = 0x340576A8BF8956E1L ^ l;
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
            case 0 -> 57;
            case 1 -> 38;
            case 2 -> 0;
            case 3 -> 8;
            case 4 -> 63;
            case 5 -> 58;
            case 6 -> 30;
            case 7 -> 61;
            case 8 -> 10;
            case 9 -> 29;
            case 10 -> 17;
            case 11 -> 45;
            case 12 -> 7;
            case 13 -> 56;
            case 14 -> 24;
            case 15 -> 22;
            case 16 -> 62;
            case 17 -> 20;
            case 18 -> 54;
            case 19 -> 25;
            case 20 -> 55;
            case 21 -> 27;
            case 22 -> 9;
            case 23 -> 43;
            case 24 -> 21;
            case 25 -> 52;
            case 26 -> 11;
            case 27 -> 14;
            case 28 -> 53;
            case 29 -> 15;
            case 30 -> 39;
            case 31 -> 31;
            case 32 -> 3;
            case 33 -> 48;
            case 34 -> 59;
            case 35 -> 37;
            case 36 -> 44;
            case 37 -> 42;
            case 38 -> 23;
            case 39 -> 18;
            case 40 -> 2;
            case 41 -> 60;
            case 42 -> 50;
            case 43 -> 19;
            case 44 -> 12;
            case 45 -> 33;
            case 46 -> 46;
            case 47 -> 13;
            case 48 -> 28;
            case 49 -> 16;
            case 50 -> 49;
            case 51 -> 36;
            case 52 -> 40;
            case 53 -> 1;
            case 54 -> 32;
            case 55 -> 34;
            case 56 -> 6;
            case 57 -> 26;
            case 58 -> 35;
            case 59 -> 5;
            case 60 -> 47;
            case 61 -> 41;
            case 62 -> 4;
            default -> 51;
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
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Y' || c == '\u00fa' || c == 'X' || c == '\u00d6') {
                field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'c' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "!\t5\u0019Bs!\t\"EN|;B\"[Ni<3v\u0003\u0019";
        objectArray[1] = Boolean.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f[1] = "java/lang/Boolean";
        objectArray[2] = "'bcl\n<)k$d\r'dji%\t\u0007,~\u001d2!\u001e\u000bW.m1:\bP7t39\fQ\u0001PTg }\u000bo-+$r+y7\u0004 3*L)\"\u0010?yI1\u0005\u001cI\u0014W+\u0007#N7O\u00115{o\u0002`\u0010&)n:v.d\rQzD/2!v\u007fk,\u0016?c\u000fg:\u0018&F\u0002o%";
        objectArray[3] = "F[\n*\u0011dF[\u001dv\u001dk\\\u0010\u001dh\u001d~[aL1E;";
        objectArray[4] = "\f=\u001bA\t\u0003\u00024\\I\u000e\u0018O5\u0011\b\t_\u0000iRg\u0012&0\u0014xb\nY-\u0015g@\u000f\t\u001b\u001brY\u001aT9`xB*TW\u0013\\X\u0014Z\u0011\u0015[D2:1*z@\u0019#\u0010\u0011pK\u0001?3o[~P\u0016\u0012\r\u0002t6-9\u0015Wa\u0005T\u0013o\u0001^!\u00008\u001aR]S\u0005Y:qV+\u0018'\u000bp`\u000b";
        objectArray[5] = Integer.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f[5] = "java/lang/Integer";
        objectArray[6] = Float.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f[6] = "java/lang/Float";
        objectArray[7] = "Qo\u000bd%hZ`\u001a+DfQk\u001eq";
        objectArray[8] = "^\u0014\u0012/TR\tB\u0005\u0017CS\u001c\u0019\u000e{q\u0000YCY\u0017\u001f\u0002\u0019\u0016\u0005(OR\u000b\u0016i";
        objectArray[9] = "S\u0004\u0016Q\fEW\rW\u0007p\u001aE\u0011a\u00064<\u0000Y\u0017L/\u001d0pM\u0001)2\tl\u0011\u0005\u001bO(opQ@5(gXr\u0019=\u0003gW@\f\r*{oL!F;QYL\u0012\u0005\u000eC\u0019U\u00149XlenJ\u001d%ex\u007f\u0002C)Vte\rF$T\u0016l\u000e8+RlB\u0011\u001d\u0003sI\u007f@#\ns\u0018>J\u0013S_L\u0000H@T\f(";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "9\u0013#J\u001f~hShCvc.\u000ed~\u0004EGREE8F3_Bu\u0014fAgsvF\u007f9nvu/yEO(N\u0019Ia\u001c'Y;E@]\"X-}~Ij\u001f\u0013ELpFv\r{RIt\u001d'HPEtjOKc\u0018^~KVDKBf\u0010Vd|\\e\u0016;c}j\u001d&};Yt'MepYuEIi{X\u0018\u001bH{:I\u007fNN6:\"";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
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
                clazz3 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(535094991770270L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(535094991770270L);
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
            int n = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string, clazz2);
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
        int n = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz3, string2, clazz2)) != null) {
                    m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(535094991770270L);
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
            CallSite callSite = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("c", (Object)m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW, (long)651764692637614L);
            if (callSite instanceof class_2828) {
                class_2828 class_28282 = (class_2828)callSite;
                try {
                    try {
                        if (!(m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("q", (int)((int)b), (long)749754327259200L) > 3.0f) || m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("c", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)602084578319424L) != false) break block5;
                    }
                    catch (class_151 class_1512) {
                        throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.a(class_1512);
                    }
                    ((m$$2cYMky39mwndptegkjLw70A3j9PH3hRKx5DC9AeB5wbxGpRRMnubaRojwfJK4VmCwQgW5MVKmZwQItLeUL8WA4rUxGj5bRf9A)class_28282).setOnGround(true);
                }
                catch (class_151 class_1513) {
                    throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.a(class_1513);
                }
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

