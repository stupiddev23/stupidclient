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
import me.mioclient.m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak;
import me.mioclient.m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$npo9ZIOxvhCAIq7Gt2An5ScxwuD2xBWuUMLn0fD1Z1CIwIXLoTanEyY5tbqpFWOVjaPzcMwsrDsn0WYD0ceUnm2aHHF3B3nUO;
import net.minecraft.class_1268;
import net.minecraft.class_151;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;

final class m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4
extends m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public static final long[] b;
    public static final Integer[] c;
    public static final Object[] f;
    public static final String[] g;

    public m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new Object[49];
        g = new String[49];
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b();
        long l = 8882619675490678667L;
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00ae\u001c\u0081\u000fk\t\u00cb \u00bd\u00ab\u00caJ\u00e9b\u0006\r\u0084\u00cf]\u00cc\u00e3cL{";
        int n2 = "\u00ae\u001c\u0081\u000fk\t\u00cb \u00bd\u00ab\u00caJ\u00e9b\u0006\r\u0084\u00cf]\u00cc\u00e3cL{".length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[3];
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
            case 0 -> 12;
            case 1 -> 9;
            case 2 -> 20;
            case 3 -> 62;
            case 4 -> 38;
            case 5 -> 5;
            case 6 -> 28;
            case 7 -> 32;
            case 8 -> 54;
            case 9 -> 15;
            case 10 -> 46;
            case 11 -> 22;
            case 12 -> 18;
            case 13 -> 19;
            case 14 -> 27;
            case 15 -> 63;
            case 16 -> 1;
            case 17 -> 6;
            case 18 -> 25;
            case 19 -> 26;
            case 20 -> 58;
            case 21 -> 36;
            case 22 -> 59;
            case 23 -> 16;
            case 24 -> 24;
            case 25 -> 61;
            case 26 -> 40;
            case 27 -> 41;
            case 28 -> 7;
            case 29 -> 60;
            case 30 -> 50;
            case 31 -> 45;
            case 32 -> 11;
            case 33 -> 37;
            case 34 -> 52;
            case 35 -> 14;
            case 36 -> 33;
            case 37 -> 10;
            case 38 -> 30;
            case 39 -> 23;
            case 40 -> 39;
            case 41 -> 2;
            case 42 -> 8;
            case 43 -> 48;
            case 44 -> 47;
            case 45 -> 0;
            case 46 -> 35;
            case 47 -> 13;
            case 48 -> 17;
            case 49 -> 56;
            case 50 -> 31;
            case 51 -> 29;
            case 52 -> 44;
            case 53 -> 43;
            case 54 -> 4;
            case 55 -> 57;
            case 56 -> 53;
            case 57 -> 49;
            case 58 -> 55;
            case 59 -> 3;
            case 60 -> 21;
            case 61 -> 42;
            case 62 -> 51;
            default -> 34;
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
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.g[n3] = new String(cArray);
        return n3;
    }

    public static void b() {
        Object[] objectArray = f;
        f[0] = "\u0007D\u001bg\u0016o\u0019L\u0001(qn\bW\frWh";
        objectArray[1] = Boolean.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.g[1] = "java/lang/Boolean";
        objectArray[2] = "(bs\u0000m_6jiO\u0010O6";
        objectArray[3] = "H\u0007KXtKH\u0007\\\u0004xDRL\\\u001axQU=\bB/";
        objectArray[4] = "\u0007:`/E=\u0007:wsI2\u001dqwmI'\u001a\u0000&2\u0010";
        objectArray[5] = Float.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.g[5] = "java/lang/Float";
        objectArray[6] = Void.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.g[6] = "java/lang/Void";
        objectArray[7] = ":\u0016;3'\u0019:\u0016,o+\u0016 ],q+\u0003',~*sI";
        objectArray[8] = "\u000eC\u0006O?d\u000eC\u0011\u00133k\u0014\b\u0011\r3~\u0013yCVk?";
        objectArray[9] = "A\u0016Hr\u0014NO\u001f\u000fz\u0013U\u0002\u001eB;5xz'\u001fs\u000egG\u0002<m0VN&U'Ncd\u001a5)\thh6%Z8cFD\u001c-JOOK2'%\u0014\\\u00191,\noU<\u000fr\u001ex\u007f \u0003[\u001frx\u001b2*\u001fkn9\u0000F\u001bL\u001b\u0011\u000bH\u001fD_\t)*4OCG\u0014w*n\u001a>\u0000~\u0016";
        objectArray[10] = "8&7OXa&.-\u0000>u!/\u0012K\u0002";
        objectArray[11] = "1\n~2nw:\u0005o}\u000fy1\u000ek'";
        objectArray[12] = "lJdcS_lJs?_Pv\u0001s!_Eqp\"y\r";
        objectArray[13] = "lp:\u001cz\u0010by}\u0014}\u000b/x0U{5d\u007f]8jL1~-\u0015e6pw`\u0004AGpmg!K2L-%\u000bA\u00164EUGC=O$B8!\u000bY\"-D+\u0010P\u007fp&X\u0019JOf\t{<MQu +\u0015N,D\u0013G\fEML3&8r_s\u0005_\u00133r_\u0013Q<osc=U";
        objectArray[14] = Integer.TYPE;
        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.g[14] = "java/lang/Integer";
        objectArray[15] = "5]\u0013P\u000eS5]\u0004\f\u0002\\/\u0016\u0004\u0012\u0002I(gUH[\n";
        objectArray[16] = "\u001b1\nb?`\u001b1\u001d>3o\u0001z\u001d 3z\u0006\u000bL~f1";
        objectArray[17] = "M#\u0000GA`F,\u0011\b)`H#\u0002";
        objectArray[18] = ">:wyW\u001b030qP\u0000}2}0S\u00139h5[y\u001e11\t\u007fY1\u001e>;U[\u0018\u001b+\b\\V\u0018\u001d\f\u0012y\n\u0006\u0011h<dn\u001b45\u001frS\u001c0\u001b\ne\u000b0<7oBmMk\u001b7G\u0006\u001e$\u000b,#XEjn\u001d{w@&i+pV\u0007 '(lj\u0012&\u001d\u0017ef\r\u001a<0R\u000b";
        objectArray[19] = "ux\u0019\u0002o\u001bux\u000e^c\u0014o3\u000e@c\u0001hB[\u001f:";
        objectArray[20] = "\u0016Z[bn\u0013\u0016ZL>b\u001c\f\u0011L b\t\u000b`\u001d\u007f0B";
        objectArray[21] = "\"(X\u0019\u0003\u001a\"(OE\u000f\u00158cO[\u000f\u0000?\u0012\u001e\u0004YG";
        objectArray[22] = "6p\u0017\rrr6p\u0000Q~},;\u0000O~h+JU\u0010)";
        objectArray[23] = "=T\b:i3=T\u001ffe<'\u001f\u001fxe) nM\"1m";
        objectArray[24] = "|7RM\u0002\\|7E\u0011\u000eSf|E\u000f\u000eFa\r\u0017QY\r";
        objectArray[25] = "}\u0002L=!'}\u0002[a-(gI[\u007f-=`8\t!zw";
        objectArray[26] = "|X2F`\r|X%\u001al\u0002f\u0013%\u0004l\u0017abt[8T";
        objectArray[27] = "\u001d] H\u000b\u001e\u0013Tg@\f\u0005^U*\u0001\u000bB\u0011\tin\u0010;!tCk\bD<u\\I\r\u0014\n{IP\u0018I(\u0000CK(IFsgQ\u0016G\u0000u`M0' JAI\u001b>\u0001qKB\u0003\"\"\u000f`wR\u000b\u0003m9}40(ulh\u0007I\u0002\u000f:W#\u001d)ziTQ\u0018HZJ_)\u00056kKi\t";
        objectArray[28] = "5n8\u0015q9j5;i--u\u0010m\u00191D|={\u0003/<l4{i";
        objectArray[29] = "aAixd\u00011Et%[\f$M|-'\n\" =|c\u0011d]b'`m";
        objectArray[30] = "\u000fg\b\u0003}>P&\u0015\u0001\u00118X&\n\u000f}\n\bjPY\u0011gIe\b\u0015s#\u0004b\u0005h";
        objectArray[31] = "A\u0015V>E_\u001eTK<)Y\u0016TT2Ek@\u0016\bh\u0016<G\u0015^eH@\u0005QV0)\u0000\u001fS\u000f-\u0016X\u001b\u0010IU";
        objectArray[32] = "Q\u0018\u0000\u0007nQ\u000b\u0018\u0018\u0003\u0004S\u0001_\u0011_haS\u0012I\t\u0004\u000b\u000b\u0018K_cN\u0002@\u00018";
        objectArray[33] = "{H\u001a<c\u000e=Z\ny\u0012Qi\nViPf=\u0017\nkTx\u0019\u001e+eCX&\u001e\"`wk,\u0019\t;@e%C\u000eMOK7T0w}j4g\u001aBPU\u000b\u0018\u000babO?k\u0015k\u007f_&~1wBI:\u007f4hok#_${n~:B/ENq\u0007\u001c0yWY*\u0019\u001ay]n \u00191\u0007(HzD\u0015el\u0005}Ih8/\u000e7H\u0016f#U9&";
        objectArray[34] = "=-\u007f\u000b}\u0005bv|w'\u0015viGH3A}w)I!\u00056\u0015";
        objectArray[35] = "C:r\u0012w\u0006\u001c{o\u0010\u001b\u0000\u0014{p\u001ew2@6-B+eIhk\u0016{\u0018\u0018cz\u001e\u001b";
        objectArray[36] = "]\u0018+\u001a$0U\u001di\u0013Ok@Q\r-\u0012~\"\u001167,\u007f7\u0012\u0018VrU1\u0018c\"2CPF\u001c\b(_\u0000\u00014&#P',\u0001[5\\3 \u0001.&3)\u001ch\u000e$U+\u0001,S&PP\r3&?u-\u0019\"9!c\t,\u0012\f?`\u0000\u0016o\u0017 n.\u0002\u0012,\"1)0\rU\t`02\fkriWG4\f7`\u000f\rSZ1q\u0001\u0000)\u0012sq\n}b\u00150c\u0011\u0007*W0hl";
        objectArray[37] = "WD<!+r\u0007@!|\u0014w\u0002IS\"f'\u0015G=#tc^%!vot\f]1\u007fo\u001e";
        objectArray[38] = "\u0011WgMwt\u0014Wj\u0001Is\u0015Eg\u0014%AB\u0007=Ku\u0016\u0012\u0002;\u001a6l\u001c\u0007g\u0013I";
        objectArray[39] = "\u00192zb8u\u0015?$lGp\u0017%ry\u0019w\u0017?v\u0005{#\u0019rzy9g\u0011'\u001b";
        objectArray[40] = "3xY>e}f{_5X.5az-<<5\u001d\u001b6a::s\u001a$%qX";
        objectArray[41] = ")i\u0016Sir)j\u001fY\u0003n(n\u000eRo\\u)T\r\u0003f*b\u0015\u0004o`*\u007f\u00125je%,PWoe(`n";
        objectArray[42] = "@op\b?YFom\u000f\u000eP@|`\u0014bb\u00111>H>5C0g\u000bh\u000b]gz\u0010\u000eXBp{Bb^Bm|s";
        objectArray[43] = "\u000e61Z\u0004M^#`W`B\r3iR\fpZ~0\u0004`H\f!c\fXB^$05\u000fV^/cYQ[\u00193\tU\u000f[\f(nP\f\u001f\u0007O";
        objectArray[44] = "\fX*{6\u000e\nX7|\u0007\u0007\fK:gk5X\u000fb?6b\u0000Sbq9\u001e\u001cQ6\u007f\u0007S\u001fH7}}\u001b]H<\u0000j\r\u0011Lkll\r\fKZ";
        objectArray[45] = "+3'Kkztr:I\u0007||r%GkN/6z\u0011\u0007$*\u007fzJ`~*g~ ";
        objectArray[46] = "uJ}\t\u0001U}O?\u0000j\u000eh\u0003=\u0013 &\u001clA!T\u0002.\u0014hC5\u0006\u0019A\\\u0002\u0017\"!k\\\u001eQ\u0017\u0002~f7\u0011\u0002!nZ#,\f$d5F\u0015\u0011\u0007RU\u0012\u001b\u000f5At(VQ\nLX&\u0010\u0013\u0002a:'\u001b\u00118\u0012W\u0007(\u0010\r\u00108\u0015RW\u001fAh\t\u000f1%\u0012u\u0012\u0017[+EDx[\u0015;Bx\u0002\u0013W;I\u0005I\u0014\u0014)R\u007f\u0001V\u0014\"/9\u001c\u0011P<\u0010a\u0018R\u0016D";
        objectArray[47] = "S\u000fa9P\u001f\fN|;<\u0019\u0004Nc5P+W\u000b;n<\u0013\u0018\fc8PM\u0015K\u007fR\u0000\u0018\u0012\t{mX\u001cQO\u0003";
        Object[] objectArray2 = objectArray;
        objectArray[48] = "\\-P\u0015G?V2_B*:\u0011qItX\u001cx-hOd\u001f\f o\u007fH?~\u0018^|\u001a&\u0006\u0011[\u007fs z0\u0005DE\u0010^c\nSg\u001c\u007f\"\u000fRq$A6G\u0015O\u001cs\u000fk|Q\"m6Y\u0017{\u0011o:Y`\u0013\u0012\\gst\u0017\u000f{4olL\u000f[\u0003qoJb\\\u0002G\u0017z$\u0004&Y-\u001b!B0HWScB;5\u0011\u00175\r<ISS=X]";
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cc' || c == 'F' || c == '\u00dd' || c == '\u00f1') {
                field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'H' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'I' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.e(l);
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
                clazz3 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.f(809799031864016L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.f(809799031864016L);
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
            int n = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.e(l);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7731;
        if (c[n2] == null) {
            m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static Field g(long l) {
        int n = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.e(l);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.c(clazz3, string2, clazz2)) != null) {
                    m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.f(809799031864016L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak) {
        if (m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("I", (int)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.a(8471, 3991310738450241063L), (long)3447661778251926L) > 3.0f) {
            CallSite callSite = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak, (Object)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)2118859584790394L), (long)2348859958405879L);
            m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)callSite, (Object)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("I", (Object)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)2499414504088610L), (long)2984187917652571L), (long)2622362926443344L);
            int n = 0;
            while ((float)n <= m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)((Float)((Object)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak.m$$vBtu5PqLFBLtHXPFHe30xHsizBMI7ipyvMlV5aKHbAaRNpxdhV82HV0Tgzgr934vuYCa932bsBYq2lqPL0dYj5B5CLAemXU56, (long)2875336856957404L))), (long)2750532111385550L)) {
                CallSite callSite2 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)callSite, (long)2079468627244541L);
                while (m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)callSite2, (long)2019696624659938L) != false) {
                    class_1268 class_12682;
                    boolean bl;
                    block17: {
                        boolean bl2;
                        block16: {
                            block15: {
                                class_2338 class_23382 = (class_2338)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)callSite2, (long)2459447180077949L);
                                CallSite callSite3 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687, (Object)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)class_23382, (Object)class_2350.field_11033, (int)n, (long)3109338298651134L), (long)2901865663943325L);
                                try {
                                    try {
                                        if (m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)callSite3, (long)2691552717727660L) == class_2246.field_10124) continue;
                                        if (m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)3234983314808382L), (long)2296422728179052L) != class_1802.field_8705) break block15;
                                    }
                                    catch (class_151 class_1512) {
                                        throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.a(class_1512);
                                    }
                                    bl2 = true;
                                    break block16;
                                }
                                catch (class_151 class_1513) {
                                    throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.a(class_1513);
                                }
                            }
                            bl2 = false;
                        }
                        bl = bl2;
                        CallSite callSite4 = m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("I", (Object)class_1802.field_8705, (int)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.a(12270, 4444756154223122653L), (long)2537123567364498L);
                        try {
                            try {
                                try {
                                    if (callSite4 == -1 && !bl) continue;
                                }
                                catch (class_151 class_1514) {
                                    throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.a(class_1514);
                                }
                                m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (float)m$$npo9ZIOxvhCAIq7Gt2An5ScxwuD2xBWuUMLn0fD1Z1CIwIXLoTanEyY5tbqpFWOVjaPzcMwsrDsn0WYD0ceUnm2aHHF3B3nUO.m$$HFQ0smLtvSwyGa2hEBvL56Zxp3uWwg9lJFUFylnrLaTmeDVV8C8aBUZHkL3c28grvcpZ2XWoyZDjwyAY9lxTLrHl81jQivuhn, (long)2239622184822238L);
                                if (bl) break block17;
                            }
                            catch (class_151 class_1515) {
                                throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.a(class_1515);
                            }
                            m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("I", (int)callSite4, (int)m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.a(20856, 5370946895941838409L), (long)3279235749556837L);
                        }
                        catch (class_151 class_1516) {
                            throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.a(class_1516);
                        }
                    }
                    try {
                        class_12682 = bl ? class_1268.field_5810 : class_1268.field_5808;
                    }
                    catch (class_151 class_1517) {
                        throw m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.a(class_1517);
                    }
                    class_1268 class_12683 = class_12682;
                    m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1761, (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (Object)class_12683, (long)3034920059864014L);
                    m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.b("H", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (Object)class_12683, (long)3339041668134573L);
                }
                ++n;
            }
        }
    }

    public static String m$$aO7JCB7VvXhcvfWBnjo9yaDr2QR6JcXQBzPp2nEjtHU51ryivN5dyoorEebb9hOiUv3RzywtMA2UUeY49mnwuz3DcJ0HhBrgv(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{8, 106, -38, -127, 121, 46, 13, -112, -21, -62, 26, 68};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 12]);
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
            return MethodHandles.lookup().findStatic(m$$HYVTylsFkqZrMwbU383BHiS6tIDECEEBj7z27nc8T8X5pjW3wNyOimcYSSeDbSThT5bJBJfYfm7bmWbeszO5Ino4rhWO6Mfak$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

