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
import me.mioclient.m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import net.minecraft.class_1656;

final class m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1
extends m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk {
    public static final long a;
    public static final Object[] b;
    public static final String[] e;

    public m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = new Object[11];
        e = new String[11];
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.b();
        long l = 3468673889994619421L;
        a = 0x591005C4F03B6421L ^ l;
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
            case 0 -> 41;
            case 1 -> 1;
            case 2 -> 38;
            case 3 -> 48;
            case 4 -> 30;
            case 5 -> 60;
            case 6 -> 34;
            case 7 -> 29;
            case 8 -> 3;
            case 9 -> 7;
            case 10 -> 8;
            case 11 -> 46;
            case 12 -> 16;
            case 13 -> 20;
            case 14 -> 11;
            case 15 -> 40;
            case 16 -> 44;
            case 17 -> 21;
            case 18 -> 5;
            case 19 -> 49;
            case 20 -> 17;
            case 21 -> 10;
            case 22 -> 6;
            case 23 -> 62;
            case 24 -> 2;
            case 25 -> 51;
            case 26 -> 58;
            case 27 -> 33;
            case 28 -> 4;
            case 29 -> 39;
            case 30 -> 12;
            case 31 -> 23;
            case 32 -> 36;
            case 33 -> 47;
            case 34 -> 55;
            case 35 -> 37;
            case 36 -> 24;
            case 37 -> 31;
            case 38 -> 61;
            case 39 -> 56;
            case 40 -> 35;
            case 41 -> 14;
            case 42 -> 57;
            case 43 -> 13;
            case 44 -> 18;
            case 45 -> 50;
            case 46 -> 32;
            case 47 -> 52;
            case 48 -> 53;
            case 49 -> 26;
            case 50 -> 42;
            case 51 -> 0;
            case 52 -> 19;
            case 53 -> 59;
            case 54 -> 9;
            case 55 -> 63;
            case 56 -> 28;
            case 57 -> 22;
            case 58 -> 54;
            case 59 -> 43;
            case 60 -> 45;
            case 61 -> 25;
            case 62 -> 27;
            default -> 15;
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
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.e[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a5' || c == '\u00d2' || c == '\u00ed' || c == 'g') {
                field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'U' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ba' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        b[0] = "5zNh\u000f\u00135zY4\u0003\u001c/1Y*\u0003\t(@\u000bpWL";
        objectArray[1] = Float.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.e[1] = "java/lang/Float";
        objectArray[2] = Void.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.e[2] = "java/lang/Void";
        objectArray[3] = "10\u007fs\u0011~?98{\u0016er8u:M$\u001a\r5f\u0013di\u0002:G)%\u000e15_\u0000G;g\u0000l1u\r!+u\u0013\\703-Or\u001d\u0002\u0018.3|-\u001f\u001am,b9\u0019dv/wm\u0007>M1 ?\u000f\u0000M,G\u000f\u001e\u0000K,Y\u001b4dp\u0013a6faV\re3<\u0012x\u0002^,\u00078_L";
        objectArray[4] = Integer.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.e[4] = "java/lang/Integer";
        objectArray[5] = Double.TYPE;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.e[5] = "java/lang/Double";
        objectArray[6] = "6flX\u0012\u00016f{\u0004\u001e\u000e,-{\u001a\u001e\u001b+\\/BI";
        objectArray[7] = "\u001e21[7B\u0015= \u0014VL\u001e6$N";
        objectArray[8] = "\u007f~h70C.)pY)^c/l5\u001b\f%s;YuXy#p40\ru5\u000b`>\u000epwt!2MuO";
        objectArray[9] = "oI\f\f4.-N\u000b^\u000b9y[x\u007fP=d\u000fN~o\u0000\u00162QPv\u0015n\u0007g[07k\u0013GMbb\u0018\rxAI>:>E\rym9\u000b|rE-0\u0005rel6m1e\u0000J\u0013\u0012\u0007W\f2$\u0011&e\\[<*\u001e\r^s-\u000e7_y[8d\u0011e^37-\u001dz\u00053,\u000e-\n<1\"3\u0012HVha*\u00125\u0007tf$\r\f^i7*w";
        Object[] objectArray2 = objectArray;
        objectArray[10] = ".].6f\u000b)R+w\t\n\u007fC+/e8)\u0006vt8or\u000e(&u\u001f#Y0H";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.e(l);
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
                clazz3 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.f(546491883709275L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.f(546491883709275L);
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
            int n = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.e(l);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.b[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.e(l);
        Object object = b[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.c(clazz3, string2, clazz2)) != null) {
                    m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.f(546491883709275L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4 m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4, m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT) {
        ((class_1656)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.b("U", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)705842390831755L)).field_7479 = true;
        m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.b("U", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.b("U", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)705842390831755L), (float)((float)(m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.b("U", (Object)m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4, (int)((int)a), (long)673464530361095L) * (double)0.05f)), (long)595549897863384L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$55FXdxku5WkYQ4RddAxVg2QrIdQtzkkMkeb37cAWI0KmqJKsTseL5hWf1RoSI1cZQSTVSKQUTHGa5nkpj30HutoiCfzOpRiA4$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

