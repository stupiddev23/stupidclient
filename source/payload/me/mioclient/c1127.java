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
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_1268;
import net.minecraft.class_1321;
import net.minecraft.class_151;
import net.minecraft.class_243;

final class m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1
extends m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public static final long[] a;
    public static final Integer[] b;
    public static final Object[] e;
    public static final String[] f;

    public m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new Object[20];
        f = new String[20];
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b();
        long l = 7300825152049156736L;
        long[] lArray = new long[3];
        int n = 0;
        String string = "q\u00bd\u00d4a\u00f8v\u00baNc\u00c8\u00fc(\u00ae\u0006\u00dc#\u00c3qa\u00a4\u008b\u0007\u00c8\u00c2";
        int n2 = "q\u00bd\u00d4a\u00f8v\u00baNc\u00c8\u00fc(\u00ae\u0006\u00dc#\u00c3qa\u00a4\u008b\u0007\u00c8\u00c2".length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n3 < n2);
        a = lArray;
        b = new Integer[3];
    }

    public static int e(long l) {
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
            case 0 -> 28;
            case 1 -> 47;
            case 2 -> 52;
            case 3 -> 14;
            case 4 -> 61;
            case 5 -> 44;
            case 6 -> 32;
            case 7 -> 39;
            case 8 -> 1;
            case 9 -> 55;
            case 10 -> 11;
            case 11 -> 41;
            case 12 -> 24;
            case 13 -> 23;
            case 14 -> 6;
            case 15 -> 7;
            case 16 -> 34;
            case 17 -> 3;
            case 18 -> 25;
            case 19 -> 17;
            case 20 -> 19;
            case 21 -> 27;
            case 22 -> 53;
            case 23 -> 58;
            case 24 -> 35;
            case 25 -> 49;
            case 26 -> 45;
            case 27 -> 29;
            case 28 -> 48;
            case 29 -> 36;
            case 30 -> 8;
            case 31 -> 22;
            case 32 -> 46;
            case 33 -> 33;
            case 34 -> 51;
            case 35 -> 40;
            case 36 -> 63;
            case 37 -> 2;
            case 38 -> 12;
            case 39 -> 57;
            case 40 -> 31;
            case 41 -> 54;
            case 42 -> 5;
            case 43 -> 37;
            case 44 -> 18;
            case 45 -> 13;
            case 46 -> 20;
            case 47 -> 60;
            case 48 -> 56;
            case 49 -> 59;
            case 50 -> 10;
            case 51 -> 43;
            case 52 -> 15;
            case 53 -> 30;
            case 54 -> 4;
            case 55 -> 50;
            case 56 -> 62;
            case 57 -> 9;
            case 58 -> 16;
            case 59 -> 38;
            case 60 -> 21;
            case 61 -> 42;
            case 62 -> 0;
            default -> 26;
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
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f[n3] = new String(cArray);
        return n3;
    }

    public static void b() {
        Object[] objectArray = e;
        e[0] = "j\b%e\tyj\b29\u0005vpC2'\u0005cw2cx\\";
        objectArray[1] = "u\u0007~:eDu\u0007ifiKoLixi^h=8 ;";
        objectArray[2] = "@R%U6*@R2\t:%Z\u00192\u0017:0]h`Hir";
        objectArray[3] = "\u0016z\u0001fD\u0012\u0016z\u0016:H\u001d\f1\u0016$H\b\u000b@D{\u0019B";
        objectArray[4] = "G8F5\u0006/I1\u0001=\u00014\u00040L|\u0002#f<8\b!qY\u000e\u0002\f\u001c\u0014y4Qn\b0m\u0012\u001a\u0000\"\u001as\u001086W\u0010]\u0004;\u001c\u0004\u0011\u001c1\u0004!\u001e*`o1j>u\u001ah\n\"\t&Ln=\u0014V+~j\u0005 &6\u0013\u001aX,(9y1\u001c<V\u001a~-1\u000e\u000e2`\f8*\u0000\u000eM7%j\u0004";
        objectArray[5] = Integer.TYPE;
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f[5] = "java/lang/Integer";
        objectArray[6] = "@F_ lw^NEo$wDD](-l\u0004w[$&kIF]$";
        objectArray[7] = "#'\u001dE^\u0011-.ZMY\n`/\u0017\f_4+(zaNM~)\nLA7? G]eF?:@xo3\u0003z\u0002Re\u0017{\u0012r\u001eg<\u0000sea\u0005\n\u0016u\n\u001d\u000f\u0011\u001f(W\u007f|\u0018\u0005\u0018AP_=\u0002\u0006Ry\u000f\u0014\u0001{cJc\r\n\u001akj\u00029=\bT\\{\u0012|%xJu= $Ddq";
        objectArray[8] = "_3D~\u0010.Q:\u0003v\u00175\u001c;N7,\nK0\u0005P) V'8@4\u000eZ\u0019\u0000cL\u0014K3.r#*a\u0006=q\u001avqb\u001ak\u001f\u0014U8 A\u001a0w<-&)%}2=p\u001f\t\u007f#[W\u001c3A\u0015\u0018g#\n\u000b\u00019X\u00136B!2P\u0010\t`\u001a\b{-$\u0002`=a;\u0004ub\t`\u001d";
        objectArray[9] = "%#9\u0006c\u0017%#.Zo\u0018?h.Do\r8\u0019|\u001a7I";
        objectArray[10] = "&p\b\f~[&p\u001fPrT<;\u001fNrA;JM\u0010%\n";
        objectArray[11] = Void.TYPE;
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f[11] = "java/lang/Void";
        objectArray[12] = "v\tF\u001f\u0004F}\u0006WPeHv\rS\n";
        objectArray[13] = "g\u001bz]8:?\n#\u0015Y93\u001dsH5\u000bcQ)\u001eY7<\u0002*J9\"o\u001d\u0013";
        objectArray[14] = "\u0011iw\u0010\u0019\u000e\u0016+6\u0018`\u0002\u0006yQ\u0011_=PokG\u0002=A0Q`^>J\r~y\u001b\u0003z\u0013Kg\u001d\tU)IH/%eeP{\u000b\u0007k\u001b^@?\u0017Nnll\u0000 \u0010\u0004^S\u001b.Q\u0013Ew!\u000ep\u001eeO\u001f6u(mo1\bu92T-\u001a\u0015kJE\u001d'M\u0017@V+\u0003\u0010\u0015o)Y\u001dC'mO\u0001\f\u001ao\f\u0012\u0003\u0016O.rT\u0007\u0018LU0C\u000b\t\u0015mf@\u000b\u001e*";
        objectArray[15] = ":!\u007fGm.j1{[\u001c3+gu~U\u0007=1/O_,E\u000fyj&i[\n$zP\u0007a\u0004]G$\u00066\u001a%[n+u\u0006x\u0016BjG\u0006$HV\u0006n\nM_Y7K2/o\"4C\u0001]Ic\u00158uD\u001c@6E\ny\u001e]\u0016G4w\u001cb\u001dX\tS\u0017q\u001bf-s~$:H\u0019R& <l%+\u001ev?l2\u0014\u001d\u007f'b0j[{)aK/Em3|5iAc0\u0007";
        objectArray[16] = ">3j5\u0017\u001c?7ylfC/a{r\u0017IN\u001d2U\u0017i\u007fvWk\u001fy8}oo\u0003Y3\u0011Bp\u000f_:\u0007dn!WG\u00042mXvJ'w_'An\u00062I\\v32T?\u0002Jm\u001cr7\u0004\u0018a2f5:Dy$2K6K<2T]\"kN${v\u001d\u0018e\u00061_Vy2\u00039\u000fXF~2ec\u0014@j7\t0]\\`r0fW\u001c{M94\u0007\u001ff<xh\u0000@\u0003";
        objectArray[17] = "i\u0013We,\u0014|@H\\,\u0019~\u0011S0\u001eM:I\t\\4J:\u0003S1&M{q";
        objectArray[18] = "FP\b~hu\u001eAQ6\tv\u0012V\u0001keDD\u0017Y16\u0013E\u001b\\iso\u0010D\u00046\t";
        Object[] objectArray2 = objectArray;
        objectArray[19] = "\u0012\u0003LysDB\u0013He\u0002Y\u0003E\u001fsHqw*cA<UERJ#]Qr\u0007~b\u007fuJ-~~9@i8DWyUJ(xCD[O\"\u0017&}Fl\u0014wrsX^\u0007VH>\u0006a\nzFxDi'\u0018GsFSTug@GfV\u001au:\u0000t\u0007JigfNTWr\u007f\f@\u0003f\u00189_^\f\\f\u007f[P\u000f'#aMJ\u0012YeeCIi\u0017#c\u0005J\u0018V\u007fdZ/";
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ed' || c == '\u00e9' || c == '\u00f3' || c == '\u00a5') {
                field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'o' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
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
                clazz3 = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(911628130408625L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(911628130408625L);
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
            int n = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1FAB;
        if (b[n2] == null) {
            m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static Field g(long l) {
        int n = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e(l);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.c(clazz3, string2, clazz2)) != null) {
                    m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.f(911628130408625L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public class_243 m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(class_1321 class_13212) {
        try {
            if (m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00f6", (Object)class_13212, (long)1302595147190330L) != null) {
                return null;
            }
        }
        catch (class_151 class_1512) {
            throw m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.a(class_1512);
        }
        CallSite callSite = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("o", (Object)m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("o", (Object)class_13212, (int)m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.a(12114, 7900570573778759931L), (long)1022613534016398L), (int)m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.a(18350, 1982925971585193988L), (long)1070747845287817L);
        try {
            if (callSite == -1) {
                return null;
            }
        }
        catch (class_151 class_1513) {
            throw m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.a(class_1513);
        }
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("o", (int)callSite, (int)m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.a(11655, 1781296318916997676L), (long)1364899106457400L);
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("o", (Object)class_13212, (Object)class_1268.field_5808, (long)1139975351795260L);
        return m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00f6", (Object)m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.b("\u00f6", (Object)class_13212, (long)967783260471428L), (long)1233006928720415L);
    }

    public static String m$$ExKPZHLPhMwF6BZbhTlq84buDLzemtR5oL8N7zQCYLQkDYoMQ9ZsLZFCO8vICglrEi7i2NwjjRCj7cJrIuaYieL0uCyz2o7sK(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{105, 50, 114, -92, -66, 98, 54, 104, 15, 100, -91, -24, -39, 12, -103, 120, -102, 22, 56, -52};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 20]);
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
            return MethodHandles.lookup().findStatic(m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

