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
import me.mioclient.m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4;
import me.mioclient.m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC;
import net.minecraft.class_151;

final class m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3
extends m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk {
    public static final long a;
    public static final Object[] b;
    public static final String[] e;

    public m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = new Object[14];
        e = new String[14];
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.b();
        long l = 7564911740360490275L;
        a = 0xEE8192CD2FA8231FL ^ l;
    }

    public static int e(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (e[n3] != null) {
            return n3;
        }
        Object object = b[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 0;
            case 1 -> 26;
            case 2 -> 33;
            case 3 -> 37;
            case 4 -> 15;
            case 5 -> 39;
            case 6 -> 52;
            case 7 -> 13;
            case 8 -> 8;
            case 9 -> 21;
            case 10 -> 49;
            case 11 -> 61;
            case 12 -> 38;
            case 13 -> 42;
            case 14 -> 43;
            case 15 -> 16;
            case 16 -> 1;
            case 17 -> 47;
            case 18 -> 50;
            case 19 -> 18;
            case 20 -> 7;
            case 21 -> 4;
            case 22 -> 51;
            case 23 -> 9;
            case 24 -> 60;
            case 25 -> 25;
            case 26 -> 19;
            case 27 -> 32;
            case 28 -> 10;
            case 29 -> 45;
            case 30 -> 53;
            case 31 -> 29;
            case 32 -> 2;
            case 33 -> 54;
            case 34 -> 24;
            case 35 -> 17;
            case 36 -> 40;
            case 37 -> 46;
            case 38 -> 5;
            case 39 -> 3;
            case 40 -> 30;
            case 41 -> 27;
            case 42 -> 59;
            case 43 -> 41;
            case 44 -> 55;
            case 45 -> 63;
            case 46 -> 20;
            case 47 -> 58;
            case 48 -> 62;
            case 49 -> 6;
            case 50 -> 35;
            case 51 -> 31;
            case 52 -> 48;
            case 53 -> 44;
            case 54 -> 23;
            case 55 -> 12;
            case 56 -> 56;
            case 57 -> 11;
            case 58 -> 34;
            case 59 -> 36;
            case 60 -> 22;
            case 61 -> 14;
            case 62 -> 28;
            default -> 57;
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
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.e[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d8' || c == 'E' || c == 'S' || c == 'K') {
                field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'S' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00b5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 't' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = b;
        b[0] = "F|$\u0016i\u000fF|3Je\u0000\\73Te\u0015[Fb\f7";
        objectArray[1] = Double.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.e[1] = "java/lang/Double";
        objectArray[2] = "Np{K\u0011vNpl\u0017\u001dyT;l\t\u001dlSJ>UM'\u0015";
        objectArray[3] = Boolean.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.e[3] = "java/lang/Boolean";
        objectArray[4] = "\u0014k\u007f\"0S\u001ab8*7HWcukl\t?V572ILY:\u0016\b\b+j5\u000e!j\u001e<\u0000=\u0010X(z+$2q\u0012k3|n_8Y\u0018\u007f\u0012Q\bD\u001a<\rO\u001cBd'\u000eZH\\>\u001c\u0010\r\u001aT\u0000\u001c\rj*E\u0000\u001a\rt>od!2L\u0013=a\u0007,H\u0016g\u0012)#s\t\\8\u000em";
        objectArray[5] = Integer.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.e[5] = "java/lang/Integer";
        objectArray[6] = "5\u001aY\u001cGa5\u001aN@Kn/QN^K{( \u001a\u0006\u001c";
        objectArray[7] = Void.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.e[7] = "java/lang/Void";
        objectArray[8] = "\u0018x\u001ens&\u0013w\u000f!\u0012(\u0018|\u000b{";
        objectArray[9] = "qE\u001b[\u000bX!VD>TO7ILRf\u001bs\u0012\u0012>\b\u0019*V\u0012\u0006]I!G+\u0007\nC4\u0010\u0013RZH%)\u0012\u0005P]r\u0011GU[LK\u0013G\u000eT\u00181CTQ1";
        objectArray[10] = " ?9K\t\u0005{+e\u00024V~5 %\u000f\u0004'kXH\n\fk.2\u0011\r\u0002uP";
        objectArray[11] = "B5\u0011j>[\u001a=\u00101WCUteM\fGH SL3z:\u001dLb*oB(zilMG<Z\u007f>\u00184\"es\u0015D\u0016\u0011X?%\u0017\u0015$a@\u0019W\u001c*oW0LA\u001ex2\u0016i>(J>n^=\txn\u0007F\u00061\u0010l/W\"\u0018BK\u0007BH>xloM\u00012g7oV\"\u0002\u0017\u000ek\u001d\u00006Xl,V\u0019*(7lG\u0006a\u0010b<L\u0017X";
        objectArray[12] = "Myt34-\u0013({+M(\u001cl*7!\u001aH ua}MK|z5w7\u001bo%P";
        Object[] objectArray2 = objectArray;
        objectArray[13] = ",|'[hnr-(C\u0011k}iy_}Y)%&\t \u000e*y)]+tzjv8,6\u007f*)Tmq{i\u0019";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.e(l);
        Object object = b[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.f(616568086938096L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.f(616568086938096L);
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
            int n = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.e(l);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.b[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.d(classArray[i], string, clazz2);
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
        int n = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.e(l);
        Object object = b[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.c(clazz3, string2, clazz2)) != null) {
                    m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.f(616568086938096L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4 m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4, m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC) {
        try {
            if (m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.b("\u00b5", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_3913.field_54155, (long)763617031912948L) != false) {
                m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.b("\u00b5", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.b("\u00b5", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.b("\u00b5", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)889868341377910L), (double)0.0, (double)(m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.b("\u00b5", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4, (int)((int)a), (long)809162267473338L) * 0.1), (double)0.0, (long)646157340128732L), (long)974359096681267L);
            }
        }
        catch (class_151 class_1512) {
            throw m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.a(class_1512);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

