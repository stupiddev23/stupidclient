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
import me.mioclient.m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4;
import me.mioclient.m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_151;
import net.minecraft.class_2350;
import net.minecraft.class_243;

final class m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2
extends m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk {
    public int m$$aqHFEDENdTzUmmUq8SiATvkaKO5ZsGD3XAEDjS1EJibkKAJ2fajnvOD0l3c8r9CNO24C2kJ9F0041W8RE9VlpMDdeMgvyurTN;
    public static final long[] a;
    public static final Integer[] b;
    public static final Object[] e;
    public static final String[] f;

    public m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new Object[30];
        f = new String[30];
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b();
        long l = 1572780200787158764L;
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u009a`\u00d6\u00a0\u0016\u00c79\u001c\u00cbq\u00df)\u00b3?P(o\u00c1\u00c6\u00bcB\u00a9\u00c2\u00c2";
        int n2 = "\u009a`\u00d6\u00a0\u0016\u00c79\u001c\u00cbq\u00df)\u00b3?P(o\u00c1\u00c6\u00bcB\u00a9\u00c2\u00c2".length();
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
            case 0 -> 16;
            case 1 -> 12;
            case 2 -> 57;
            case 3 -> 20;
            case 4 -> 63;
            case 5 -> 7;
            case 6 -> 27;
            case 7 -> 13;
            case 8 -> 46;
            case 9 -> 31;
            case 10 -> 47;
            case 11 -> 40;
            case 12 -> 36;
            case 13 -> 35;
            case 14 -> 17;
            case 15 -> 52;
            case 16 -> 10;
            case 17 -> 24;
            case 18 -> 45;
            case 19 -> 15;
            case 20 -> 26;
            case 21 -> 43;
            case 22 -> 51;
            case 23 -> 50;
            case 24 -> 3;
            case 25 -> 32;
            case 26 -> 61;
            case 27 -> 4;
            case 28 -> 2;
            case 29 -> 60;
            case 30 -> 58;
            case 31 -> 18;
            case 32 -> 55;
            case 33 -> 38;
            case 34 -> 59;
            case 35 -> 49;
            case 36 -> 48;
            case 37 -> 22;
            case 38 -> 21;
            case 39 -> 39;
            case 40 -> 41;
            case 41 -> 54;
            case 42 -> 23;
            case 43 -> 14;
            case 44 -> 29;
            case 45 -> 37;
            case 46 -> 6;
            case 47 -> 25;
            case 48 -> 34;
            case 49 -> 19;
            case 50 -> 28;
            case 51 -> 33;
            case 52 -> 44;
            case 53 -> 30;
            case 54 -> 56;
            case 55 -> 62;
            case 56 -> 5;
            case 57 -> 1;
            case 58 -> 53;
            case 59 -> 9;
            case 60 -> 11;
            case 61 -> 0;
            case 62 -> 42;
            default -> 8;
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
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f[n3] = new String(cArray);
        return n3;
    }

    public static void b() {
        Object[] objectArray = e;
        e[0] = "\u0015x\u000bT)U\u0015x\u001c\b%Z\u000f3\u001c\u0016%O\bBMNw";
        objectArray[1] = Double.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f[1] = "java/lang/Double";
        objectArray[2] = "(3yw\"c(3n+.l2xn5.y5\t<i~2s";
        objectArray[3] = Boolean.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f[3] = "java/lang/Boolean";
        objectArray[4] = "\u001a7/\u0013#\u0012\u0014>h\u001b$\tY?%Z\u007fH1\ne\u0006!\bB\u0005j'\u001bI%6e?2+\u0010`P\f\u0003\u0019&&{\u0015!0\u001c7cM}\u001e6\u0005HN\u0001\u0010\u0006\u0018J\r\u001e\u000e\u0012\u001e4\u0016\u001d\u001bF\u0000n-\u0003L\u0014\bP-\u001e+$\u0019P+\u001e5034\u0010!\r\u001da16?\t\u0018;B\u001802\u0007\u0000h?~";
        objectArray[5] = Integer.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f[5] = "java/lang/Integer";
        objectArray[6] = "CO?A\"\u001aCO(\u001d.\u0015Y\u0004(\u0003.\u0000^u|[y";
        objectArray[7] = Void.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f[7] = "java/lang/Void";
        objectArray[8] = "dYje;\u0006dY}97\t~\u0012}'7\u001cyc,xc_._r*%\u001cU\u000e-~g";
        objectArray[9] = "\u0018\u0016\u0017\u0002^t\u0016\u001fP\nYo[\u001e\u001dKPB8\u0010\u000f$_}\u0014\u0015\u000f\u001cOk\u00108\t:d#;1aXtX\u0000\u0010M;\u0005A0C`VXw\u0017\u001c\u0000'^KFEs\u000b@L#\u001eS\\mP/2z6{U/\u0000L\u0003U/\u0003\u0000\u000e=su\u001eG\f\tda\":]9o-8>[<\u0007x&\u0014j-\\";
        objectArray[10] = "\b\u0012\u0019D\u0019\f\u0006\u001b^L\u001e\u0017K\u001a\u0013\r\"+\u001c\u0004\u000e}?\f\n3\u0004S6R\u0006?ppG\u0016\u0006'q]>%.\u0012VJ\u001e0] \u0007X:U*\u0007\u0002n\u0002\u00077\u0001dcF\u001b\u0013\u0004\u0000C'\u001334pl4\b7\u0005\u0003J\u0017\u0011\u0006<Px\u0014\n\u000fGPlA[\u001c5Z\u0011?\n4\u0003bC35Q {Z$";
        objectArray[11] = "-\u0007";
        objectArray[12] = "\u0005\nWNR&\u000e\u0005F\u0001:&\u0000\nU";
        objectArray[13] = Float.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f[13] = "java/lang/Float";
        objectArray[14] = ">\rPr\u0004\u00160\u0004\u0017z\u0003\r}\u0005Z;\u0000\u001e9_\u0012P*\u00131\u0006.t\n<\u001e\t\u001c^\b\u0015\u001b\u001c/W\u0005\u0015\u001d;5rY\u000b\u0011_\u001bo=\u00164\u00028y\u0000\u00110,-nX=<\u0000HI>@k,\u0010LU\u0013$<\u000b(\u000bHjY:p$M&^\f{\u0005\n \u0010\u000fg9\u001f&*0n5\u0000\u001a\u000b\u0017YX";
        objectArray[15] = "HKx2d>CDi}\u00050HOm'";
        objectArray[16] = "0\u0005A:\u0010\u000e;\nPu|\r5\bR:P";
        objectArray[17] = "N\u0002~jf+QHc\u0012}-]Yf~Oy\u0019\u00028\u0012!+[[ac|/J[\u0001+s:CYpvw+C98yb\"AHe}s\"!V:m`>JIpp\u0018";
        objectArray[18] = "p\u0018L5%H'\u0001\u00176\\\u0012.\u001d\f\u0005g@wCth&\u001ft\u001fE6a\u0010px";
        objectArray[19] = "|#[W7\u000f ?I\u000fZ\u0014juh}\u0001\u0010w!^|>-\u0005\u001cAR'8})wYa\u001ax=WO3O\u000b#hC\u0018\u0013)\u0010U\u000f(@*%lp\u0014\u0000#+bg=\u001b~\u001fu\u0002\u001b>\u0001)G\u000ec\t\u0002\bu^\n\u001190\u001d\\\"\u0000\u001d\u0019O{\n\u0015w?u\\b\u001a>3j\u0007b\u0001\u001d\u0003\u001a>a\u0015'%GD'\n'&%\u00071\u000b$9TZ5\u001a$Y";
        objectArray[20] = "v[E\u0014FB)\u0003CA Z'N\u001fKLhs\u0002O\u0014\u0018?sY\u0005N@N.]\u0014N \u0006!H\u001dLQ[%Y\u001d,\u0019T0P\u001f]DP!P\u007f\u0011\u0019\\#\u000e\u0002AO\u000362";
        objectArray[21] = "ni\u0001*\u0011zq#\u001cR\n|}2\u0019>8*1nOco,e>\u0005cQjg)\u0004RVz{0\u001e#\u000b~j0~=Tny,\u0015\"\u001es\u0001";
        objectArray[22] = "\"v\nN)%dn\t\u000e\u0016<0'\u0007\u0003g6Q[N$g\u0016`0+\u001ao\u0006';\u0013\u001es&,W>\u0001\u007f %A\u0018\u001fQ(XBN\u001c(\tUa\u000b.W>q@N8,\t,t(Nr5rZ\u000eFtg~t\u001aDJ;fbN:F4#t(,R\u0014Qb\u0007\u0007mgz@M.&\u0006-EE~)geb\n\u0005-;c:uG}#~k\u0004\u001ay2~\u000bJ\u0001|aq2\u0005\u0014(5\u001c";
        objectArray[23] = "gC*rR\u000f0Zqq+U9FjB\u0010\u0007`\u001f\u0012/QXcD#q\u0016Wg#";
        objectArray[24] = "07\u001f[\u0018\u00139a\u0018Pr\u001bd;\b],\u001cd!\f!C\u0017m;\nLM\u000fo1a";
        objectArray[25] = "\u00184\u001b\u0004J\u001eT5B\u0003.\u001aD3$VJ\bDO\u0013BRDQ)\u001fRR\u0017)";
        objectArray[26] = "$\b id\u0017{P&<\u0002\u000fu\u001dz6n=!Q%`2jwZe)|\u0001h\u0010xQ";
        objectArray[27] = "{j%E%;$2#\u0010C#*\u007f\u007f\u001a/\u0011~3 LrF(8`\u0005=-7r}}~\u007f$j#\u0000.){\u007f\u001f";
        objectArray[28] = "\u00070sm\u00192\n5huw<\n1|i\u001e03?|y\u001aVW,~9\u0010g\tkq=w";
        Object[] objectArray2 = objectArray;
        objectArray[29] = "\byWZ5v\f%Q\u0002JvZ;\u007f3sfM%NB.b\\%.\u000esn^{S^%1KG";
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f9' || c == '\u00f1' || c == 'K' || c == '\u00cc') {
                field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ec' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'p' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.e(l);
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
                clazz3 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(1102526567038855L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(1102526567038855L);
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
            int n = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.e(l);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2BFA;
        if (b[n2] == null) {
            m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static Field g(long l) {
        int n = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.e(l);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.c(clazz3, string2, clazz2)) != null) {
                    m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(1102526567038855L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4 m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4, m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT) {
        block21: {
            block20: {
                double d;
                block17: {
                    block18: {
                        block19: {
                            boolean bl;
                            double d2;
                            try {
                                d2 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)((Boolean)((Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4.m$$sl6KvwBWGshyRr7ugcaYWKcGCbeVcvAlb0lF2CMpXDUBW54RHkOqaH0SE9Hz9cmwYCZoZv84Un1LsJ0QqsjAKUUzmHk4ehj9r, (long)1760718077581319L))), (long)2037159503600018L) != false ? (double)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)((Float)((Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4.m$$LviPI7wH9TBXq1UDr5RtiV8ewVmIZIghG4KBEARo4yNB7nsu4VvwrBknhoftyrUZIa53uTX339vSqtXEiqBNOmzTKOJWR9LBF, (long)1760718077581319L))), (long)1747533903892128L) : 0.0;
                            }
                            catch (class_151 class_1512) {
                                throw m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.a(class_1512);
                            }
                            d = d2;
                            try {
                                bl = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4.m$$lYxIodS8yJ5uiG2Beu3CO6OkAxg9wndMg6TJmtB6d38af4GEShA8KRENx1VkdbhipHhnz6oQ8DNtFIyXpwr6U729aAKWFhOGL, (long)1760718077581319L) == m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$K0EWyacO8N7RwaBd4Vo1hYLtKpHUdvLbiK6ZbiHJUlcWILhuqMzwXbsXEAGH8LpyEK9AYi49ajyJ1zdLY6B5SPGP6xFLFfXVZ;
                            }
                            catch (class_151 class_1513) {
                                throw m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.a(class_1513);
                            }
                            boolean bl2 = bl;
                            try {
                                try {
                                    if (m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_3913.field_54155, (long)1291618575201543L) == false) break block17;
                                    ++this.m$$aqHFEDENdTzUmmUq8SiATvkaKO5ZsGD3XAEDjS1EJibkKAJ2fajnvOD0l3c8r9CNO24C2kJ9F0041W8RE9VlpMDdeMgvyurTN;
                                    if (!bl2) break block18;
                                }
                                catch (class_151 class_1514) {
                                    throw m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.a(class_1514);
                                }
                                if (this.m$$aqHFEDENdTzUmmUq8SiATvkaKO5ZsGD3XAEDjS1EJibkKAJ2fajnvOD0l3c8r9CNO24C2kJ9F0041W8RE9VlpMDdeMgvyurTN < m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.a(20423, 1847109746730361919L)) break block19;
                            }
                            catch (class_151 class_1515) {
                                throw m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.a(class_1515);
                            }
                            d = -0.15;
                        }
                        try {
                            if (this.m$$aqHFEDENdTzUmmUq8SiATvkaKO5ZsGD3XAEDjS1EJibkKAJ2fajnvOD0l3c8r9CNO24C2kJ9F0041W8RE9VlpMDdeMgvyurTN >= m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.a(23850, 69927027369637585L)) {
                                this.m$$aqHFEDENdTzUmmUq8SiATvkaKO5ZsGD3XAEDjS1EJibkKAJ2fajnvOD0l3c8r9CNO24C2kJ9F0041W8RE9VlpMDdeMgvyurTN = 0;
                            }
                        }
                        catch (class_151 class_1516) {
                            throw m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.a(class_1516);
                        }
                    }
                    m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT, (double)d, (long)2078167794688648L);
                    m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)1866735181404555L), (Object)class_2350.class_2351.field_11052, (double)d, (long)1537295065125333L), (long)1931208869856396L);
                    break block21;
                }
                try {
                    if (m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_3913.field_54155, (long)1674605142611777L) == false) break block20;
                    m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT, (double)(-d), (long)2078167794688648L);
                    m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)1866735181404555L), (Object)class_2350.class_2351.field_11052, (double)(-d), (long)1537295065125333L), (long)1931208869856396L);
                    break block21;
                }
                catch (class_151 class_1517) {
                    throw m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.a(class_1517);
                }
            }
            try {
                try {
                    m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT, (double)0.0, (long)2078167794688648L);
                    m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)1866735181404555L), (Object)class_2350.class_2351.field_11052, (double)0.0, (long)1537295065125333L), (long)1931208869856396L);
                    if (m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_5992 || m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)((Float)((Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4.m$$MhnPGjya0pNF1pJvhMbPG9OPY2iK7wSHtdE5HDIZYHA8tWsbXveTK3WiAr6dY1uNx2AWtCXEWQF7uL95veGuXH15ExCbDXBwB, (long)1760718077581319L))), (long)1747533903892128L) == 0.0f) break block21;
                }
                catch (class_151 class_1518) {
                    throw m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.a(class_1518);
                }
                m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)1866735181404555L), (double)0.0, (double)((double)(-m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)((Float)((Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4.m$$MhnPGjya0pNF1pJvhMbPG9OPY2iK7wSHtdE5HDIZYHA8tWsbXveTK3WiAr6dY1uNx2AWtCXEWQF7uL95veGuXH15ExCbDXBwB, (long)1760718077581319L))), (long)1747533903892128L))), (double)0.0, (long)1230208412885370L), (long)1931208869856396L);
                m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT, (double)((class_243)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)1866735181404555L)).field_1351, (long)2078167794688648L);
            }
            catch (class_151 class_1519) {
                throw m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.a(class_1519);
            }
        }
        CallSite callSite = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("p", (Object)m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT, (double)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4, (int)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.a(27190, 4326411180829491660L), (long)1402735160737315L), (long)1575915880634854L);
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (double)callSite[0], (double)((class_243)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00ec", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)1866735181404555L)).field_1351, (double)callSite[1], (long)1455266265885670L);
    }

    public static String m$$I9X9Utzr6q1N195N9F1LMEoDU6JxYMvtlnyWhxEAT0dQ8X9sdUm5ZMvw8kvQ5efCNDttDcufne8n8yYxmk2kFD2loa0TT3sHf(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-45, -78, 122, -25, -29, -92, 98, -28, -69, 83, -19};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 11]);
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
            return MethodHandles.lookup().findStatic(m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

