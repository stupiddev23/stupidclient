/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.List;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm;
import me.mioclient.m$$VsGnPlMiaRwU6egffgLPoztoFs9ltcxbqpmKM9tVWVAnOLc9RDaxZHNvjn5CEU4F9uYfzG3TwY6d1bvC06AbuPljluzwD2TnR;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import me.mioclient.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm;
import net.minecraft.class_151;

final class m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3
extends m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm {
    public static final String c;
    public static final long[] d;
    public static final Integer[] f;
    public static final Object[] g;
    public static final String[] j;

    public m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3(String string2) {
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n;
            char[] cArray2;
            int n2;
            int n3;
            block12: {
                g = new Object[32];
                j = new String[32];
                m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b();
                char[] cArray3 = "LF6]u=IL".toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 15;
                cArray2 = cArray3;
                n = n4;
                if (n4 <= 1) break block12;
                cArray = cArray2;
                n = n;
                if (n <= n3) break block13;
            }
            do {
                int n5 = n2;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n6 = n2;
                int n7 = n3;
                while (true) {
                    cArray4[n7] = (char)(cArray4[n7] ^ (n6 ^ (switch (n3 % 7) {
                        case 0 -> 48;
                        case 1 -> 44;
                        case 2 -> 77;
                        case 3 -> 38;
                        case 4 -> 19;
                        case 5 -> 92;
                        default -> 33;
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
        long l = 467813259857030097L;
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00a7\u00f4hc\u00a9\u00a1\u00c87*\u001b*\u0096=\u00efD\u001d";
        int n8 = "\u00a7\u00f4hc\u00a9\u00a1\u00c87*\u001b*\u0096=\u00efD\u001d".length();
        int n9 = 0;
        do {
            byte[] byArray = string.substring(n9, n9 += 8).getBytes("ISO-8859-1");
            int n10 = n++;
            lArray[n10] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n9 < n8);
        d = lArray;
        f = new Integer[2];
    }

    public static int e(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = g[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 18;
            case 1 -> 31;
            case 2 -> 15;
            case 3 -> 29;
            case 4 -> 42;
            case 5 -> 17;
            case 6 -> 50;
            case 7 -> 13;
            case 8 -> 36;
            case 9 -> 32;
            case 10 -> 14;
            case 11 -> 61;
            case 12 -> 6;
            case 13 -> 1;
            case 14 -> 57;
            case 15 -> 55;
            case 16 -> 33;
            case 17 -> 8;
            case 18 -> 62;
            case 19 -> 60;
            case 20 -> 48;
            case 21 -> 5;
            case 22 -> 4;
            case 23 -> 20;
            case 24 -> 54;
            case 25 -> 46;
            case 26 -> 0;
            case 27 -> 19;
            case 28 -> 40;
            case 29 -> 37;
            case 30 -> 9;
            case 31 -> 43;
            case 32 -> 34;
            case 33 -> 2;
            case 34 -> 51;
            case 35 -> 27;
            case 36 -> 7;
            case 37 -> 47;
            case 38 -> 12;
            case 39 -> 49;
            case 40 -> 22;
            case 41 -> 63;
            case 42 -> 23;
            case 43 -> 24;
            case 44 -> 11;
            case 45 -> 21;
            case 46 -> 58;
            case 47 -> 28;
            case 48 -> 30;
            case 49 -> 52;
            case 50 -> 26;
            case 51 -> 3;
            case 52 -> 39;
            case 53 -> 10;
            case 54 -> 35;
            case 55 -> 53;
            case 56 -> 16;
            case 57 -> 25;
            case 58 -> 41;
            case 59 -> 56;
            case 60 -> 45;
            case 61 -> 38;
            case 62 -> 59;
            default -> 44;
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
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.j[n3] = new String(cArray);
        return n3;
    }

    public static void b() {
        Object[] objectArray = g;
        g[0] = "_.S\u0005u<S&RN<4O.P\u0005X S/{Gw>Y/J";
        objectArray[1] = "\u0016\u000b=J\u0006O\u001a\u0003<\u0001OG\u0006\u000b>J+S\u001a\n\u001f\u0006\u000bE\u0016\u0010";
        objectArray[2] = "W\f\u0014\u001b5\u0017Y\u0005S\u00132\f\u0014\u0004\u001eR+,N\u0006\u000e d2\t$L0.?lQL',\u001cy(\u0002\u0010=\u0013Q\u0018S5e+q+|\u001d\n\u0000^\u000b\u007f %5m\bY\u000f.;`\u000b`E5\u001cS\u0004\u000f43\u0016t\u0011}$9\u0013\u0003*p\u0013\u000b\"kZW:\n\u0019l\u000es=\r\u001ak[\b3n\u000fL O\u000f:";
        objectArray[3] = "\u0000;\u001c]u\u0001\u001e3\u0006\u0012=\u0001\u00049\u001eU4\u001aD\n\u0018Y?\u001d\t;\u001eY";
        objectArray[4] = Void.TYPE;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.j[4] = "java/lang/Void";
        objectArray[5] = "\fc'8e\u007f\u0012k=w\u0002~\u0003p0-$x";
        objectArray[6] = Boolean.TYPE;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.j[6] = "java/lang/Boolean";
        objectArray[7] = "\u0015u\u0019\u0013\u0003;\u001b|^\u001b\u0004 V}\u0013ZZf0fD/\u0005\u0000\u000e|Y\u0007\u000e\u0006.Y`M\\\u00107v\u00017\u0002:7v^\u001a>d@H@\u000f\r\u0010(@t$X\u0003\fw\\\u001b\t!O\"\u000f)\r ,}\u000eF\u000b%Av}-9\u0000-Gy*$\u0005\u0010}[9_:Ncp\u0019[\f\u0013fnK!`<ye1\u001b";
        objectArray[8] = "4?\u001dJx\u0006?0\f\u0005\u0005\u001e,7\u0005L";
        objectArray[9] = "g\u0015~$\u0005.i\u001c9,\u00025$\u001dtmU\bB\u00158\u0002\u000b3d7c\u001a[\rI'd<\u001f\u0004K\u001b%\u000f6w<\u001df$^roG4\u0013\u000f$N9(\u00005pc\u0011\u0014\u001858ZA%\u001d\u001f.\\H?q\r\u00153\u0017\u001e$+sO2\byX2z@\u0007,Z\u000eB8>\u001f5x}41{\u000b\"m\u0007\u00069&";
        objectArray[10] = "(f/fBR6n5)/H.k<d\u0018N-i";
        objectArray[11] = "S3\u00118L\u000e]:V0K\u0015\u0010;\u001bqH\u0006TaS\u001ab\u000b\\8o>B$s7]\u0014@\rv\"n\u001dM\rp\u0005t8\u0011\u0013|aZ%u\u000eY<y3H\t]\u0012l$\u0010%Q>\t\u0003vX\u0006\u0012Q\u0006\u001d\u000bI\u0002JbCP\u0007g{:lUK`M1M\u0012M.N-q\u0007K\u0014q$}\u0018w5V\u0013\u0010";
        objectArray[12] = Integer.TYPE;
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.j[12] = "java/lang/Integer";
        objectArray[13] = "\u001a|_apq\u0014u\u0018iwjYtU(Cq\u0002p$JrfFa\tji\\4o$[Q*8})n*o\r(Gc~z#T5ht-Cs#hUQ\u001fk\u0013XJf-C\u0005ixZ'l@Da(AC$yc{3h:N^d\u0015M!tP,9X\u0012~tdAP<JHi&m\u0010KT";
        objectArray[14] = "\u0019\b;yq\u001e\u0007\u0000!6\u0013\u0002\u0000\u001d";
        objectArray[15] = "\u0012:\u001ed\u00065\u00195\u000f+g;\u0012>\u000bq";
        objectArray[16] = "4'{\u0012HJ:.<\u001aOQw/q[CFn: \u0019\u0011Pl5\u0013\u0010Em,3\u0011\u0012m_\r\r\u0012\t\u0015`\n{\u00049pia%\u0001.nm\u001d8#\u000bIP\u000et\u001bKJ_\u0016+\u0016NpD\u000b0\r+wF`'f0bM?\u00138\u001bkW(\u0017gHK_1\u0010\u0013<PD*r\u001d8U`#2d'\u0012";
        objectArray[17] = "#}BM'N-t\u0005E U`uH\u00048\u0011\u0002m*S9g\u0005I?J\u0016U\u0003[+T<`\u0018ITf\u001b\u0010#K_W\u0001F-Y!N\u001cw\u0018*\bCyT=_+\u0019?q\u0016I\u001bu-F#R\\o?S+b\u0014IvF\nH\bd\u001fU\u0001~\"c\u0001J<U)D\u001ei\fs*r\u001a\u0019\u001e{\u0007N#";
        objectArray[18] = ":\u0000\u001eZ\u001c\u0019eG\u0016\bp\u001ah\u00014\f\u0000\u0006\u0001F\t\nJ\u0004g\u0002\b\\Lz";
        objectArray[19] = "\u001a{q\u0016?|Z\"(\u0018Pi@\u00064\u001c6\u0015Au B*m@y({";
        objectArray[20] = "(\u000eGA'onI^1>c<1\u001c\u000eipa[S\u000f'sPW\u0013^nu(V\u001fVW4nWFRfc?C^1";
        objectArray[21] = "*8]x4\u007f+4UA!j0@I\u00035`*NX##l0\tJ~+w<i\f92\u0007";
        objectArray[22] = "\"\u000f\u0015GX%\"\u001d\u0016A\")q\u00115PM'g\u0011\u0015L\"y']\u001d\u0001D~rP\u0012=";
        objectArray[23] = "\u001b9'E\u0013\u0001H.k\u0000n\u0006\bo\u0006@SZa\"\u0016v2\bC\u0018\u0018R\u00139~\u0006\u001eU\b\u001cv\u001a6RU&i\"5\\R\u0001~y\u0016`\u0016_\u0014.ds\u001f,}\t\u001cZ4\u0012Z\u001c\u0016rV\u000e]\"\u0003G\u001f\u001f\u0019\f'u\u0015\u001cy1j\u0006\n N|:[\t_\u001c\tk}4\u0007O15e\u001e\u001em\u0000j8^\u0012V>5QT\u0003\u001c(Z\u0004\u0015\b\u001e=<@\u0014^\u0018C";
        objectArray[24] = "\u001c\u001b/[\u0004^\u001c\u00194X9\r@\n\u001e\u0003_\fL\u0019\u0013\r\\\u000f-HjZFSG\u0007k\u0014Eb";
        objectArray[25] = "A:vrSu\u0012-:7.x\u0013<@hHy\u001f/MfKz~~41Q&\u001415\u007fR\u0017";
        objectArray[26] = "g;>\u001c~\u0000g9%\u001fCS;*\u001eN,]-*>RC\f'$9L*\u00066n/#*\u0000&i\"E!G1'D";
        objectArray[27] = ". HOYoqg@\u001d5jx*Xt\\c$c\u0019\f\fk$k$";
        objectArray[28] = "y7>hOfx(>p=q?x-dL{^\u0004dCL[oo\u0001}DK(d9yXk#\b\u0014fTm*\u001e2xzeW\u001dd{\u0003DZ>!I|s~\u001fd_\u0007D#+\u0002)Yx}\u0005$!_*q+0#avi=d]my,+\u0002KyY^=-`F*u\u001fgI\rK\"\u001ao\u0019E+v$/y\u0003loTcbV.m2'c\u0000(\u0013";
        objectArray[29] = "mjf{tn,bgt\u000bbx<\u007fhzh\u0019@6OzH(+SqrXo kunxdLFjb~mZ`tLv\u0010Y6w5W\u001dzsEJ`9[6S1WdoP%ok:Av-i96ob/We.y6Q[jkoPGOJ\u0019y\u007flp92[5E;Xe^=\u0015s81`}u5\u007f(\u00107tmg5y}+l{T+3sode|bgw\u0007";
        objectArray[30] = "(\u001d\u00064`Z{H\u001c$\u0006Zo]#u9e9K\u0019#de(\u0014#\u00048f#)\f\u001d}[\u001379\u0003{Q<\r;,I}\fA\"\u001fm_\u0002?,$YO'J\u001e\bfxy ,7}v877\u0013GV\u0019:\u0017+yn\u001c\f\u001f\u000bWP\u001c\u001d@0KB|O8!{\u007f$322M[y1\u001dM~\u0000&\u0001\u000e-8G?qEs`[ @\u0012\"tCC";
        Object[] objectArray2 = objectArray;
        objectArray[31] = "\u0000>i5>g\u000by~{X`\u0015occ$f\u0013\u0002\"p4:\u0005a}7<hi";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ea' || c == '\u00c2' || c == '\u00c0' || c == '\u00fc') {
                field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ea' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fe' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static class_151 b(class_151 class_1512) {
        return class_1512;
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
        int n = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.e(l);
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
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.f(1061445123862029L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.f(1061445123862029L);
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
            int n = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.e(l);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.g[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x8E0;
        if (f[n2] == null) {
            m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.f[n2] = (int)(d[n2] ^ l);
        }
        return f[n2];
    }

    public static Field g(long l) {
        int n = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.e(l);
        Object object = g[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.c(clazz3, string2, clazz2)) != null) {
                    m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.f(1061445123862029L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public JsonElement toJson() {
        JsonObject jsonObject = new JsonObject();
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)this, (Object)jsonObject, (long)2137255262887654L);
        CallSite callSite = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)((List)((Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$pjpeQua4PAB6Zbpcv5B1EK6PACkuUkszPZ6igJ4EheKtCpGOS5rhssN6LeWpAJuyJeZRtolTY1xU3jouBuH7hlh4UdEG0zCIQ, (long)1575630738053978L))), (long)2234703558737590L);
        while (m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)callSite, (long)1311719823509385L) != false) {
            m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM = (m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM)((Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)callSite, (long)1968469059450032L));
            try {
                if (m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM instanceof m$$VsGnPlMiaRwU6egffgLPoztoFs9ltcxbqpmKM9tVWVAnOLc9RDaxZHNvjn5CEU4F9uYfzG3TwY6d1bvC06AbuPljluzwD2TnR) {
                    continue;
                }
            }
            catch (class_151 class_1512) {
                throw m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b(class_1512);
            }
            JsonObject jsonObject2 = new JsonObject();
            JsonObject jsonObject3 = new JsonObject();
            CallSite callSite2 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM, (int)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.a(11572, 4001527644767692245L), (long)1877619518779723L), (long)2234703558737590L);
            while (m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)callSite2, (long)1311719823509385L) != false) {
                m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 = (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5)((Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)callSite2, (long)1968469059450032L));
                if (!(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm)) continue;
                try {
                    if (m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5, (int)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.a(2032, 2542899104167431952L), (long)1687507680299287L) != false) {
                        continue;
                    }
                }
                catch (class_151 class_1513) {
                    throw m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b(class_1513);
                }
                m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)jsonObject3, (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5, (long)1825176711075752L), (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5, (long)1348338077366583L), (long)1419729477711638L);
            }
            try {
                m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)jsonObject2, (Object)c, (Object)jsonObject3, (long)1419729477711638L);
                if (m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00e0", (Object)jsonObject2, (long)2011968016509628L) != false) continue;
                m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)jsonObject, (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b("\u00fe", (Object)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM, (long)1704319246296839L), (Object)jsonObject2, (long)1419729477711638L);
            }
            catch (class_151 class_1514) {
                throw m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.b(class_1514);
            }
        }
        return jsonObject;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void fromJson(JsonElement var1_1) {
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

    public static String m$$LPmoTOE33sRulJVkQtxxMoB4ibHoyTOd5SG9sUvJVy2TaCa75sEBRZOgRi3z3idGuhVSA5nxMTtBK3EczfQtzXLMjEtimNokt(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{65, 88, -40, -51, 47, -83, -122, 95, -78, -101};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 10]);
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
            return MethodHandles.lookup().findStatic(m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm$3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

