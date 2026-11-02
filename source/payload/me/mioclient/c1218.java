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
import me.mioclient.m$$npo9ZIOxvhCAIq7Gt2An5ScxwuD2xBWuUMLn0fD1Z1CIwIXLoTanEyY5tbqpFWOVjaPzcMwsrDsn0WYD0ceUnm2aHHF3B3nUO;
import me.mioclient.m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM;
import me.mioclient.m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;

final class m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2
extends m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk {
    public static final Object[] c = new Object[4];
    public static final String[] d = new String[4];

    public m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2(String string2) {
    }

    static {
        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b();
    }

    public static int e(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 9;
            case 1 -> 36;
            case 2 -> 38;
            case 3 -> 22;
            case 4 -> 11;
            case 5 -> 35;
            case 6 -> 2;
            case 7 -> 4;
            case 8 -> 34;
            case 9 -> 19;
            case 10 -> 62;
            case 11 -> 51;
            case 12 -> 55;
            case 13 -> 8;
            case 14 -> 56;
            case 15 -> 7;
            case 16 -> 20;
            case 17 -> 3;
            case 18 -> 44;
            case 19 -> 12;
            case 20 -> 21;
            case 21 -> 39;
            case 22 -> 16;
            case 23 -> 48;
            case 24 -> 23;
            case 25 -> 33;
            case 26 -> 25;
            case 27 -> 59;
            case 28 -> 53;
            case 29 -> 52;
            case 30 -> 63;
            case 31 -> 61;
            case 32 -> 46;
            case 33 -> 58;
            case 34 -> 41;
            case 35 -> 32;
            case 36 -> 40;
            case 37 -> 49;
            case 38 -> 45;
            case 39 -> 0;
            case 40 -> 24;
            case 41 -> 10;
            case 42 -> 31;
            case 43 -> 1;
            case 44 -> 13;
            case 45 -> 15;
            case 46 -> 37;
            case 47 -> 60;
            case 48 -> 6;
            case 49 -> 14;
            case 50 -> 54;
            case 51 -> 42;
            case 52 -> 27;
            case 53 -> 43;
            case 54 -> 26;
            case 55 -> 29;
            case 56 -> 57;
            case 57 -> 50;
            case 58 -> 18;
            case 59 -> 17;
            case 60 -> 30;
            case 61 -> 5;
            case 62 -> 47;
            default -> 28;
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
        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.d[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fc' || c == 'x' || c == '\u00ff' || c == '\u00c5') {
                field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "\u000b6Zb[=\u00009K-80\u0015?";
        objectArray[1] = Double.TYPE;
        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.d[1] = "java/lang/Double";
        objectArray[2] = "vPI\u001b#]}_XTBSvT\\\u000e";
        Object[] objectArray2 = objectArray;
        objectArray[3] = "Mc\u0002H|z\rc\u001fr6s\u0012f\u0019\u0017L#\u001eh@\u001f qO3Cr";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.e(l);
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
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(172499174065841L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(172499174065841L);
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
            int n = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.c(clazz3, string2, clazz2)) != null) {
                    m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.f(172499174065841L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public float m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM, float f) {
        return (float)(m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.b("\u00c6", (long)274169584056769L) * 180.0 - (double)m$$npo9ZIOxvhCAIq7Gt2An5ScxwuD2xBWuUMLn0fD1Z1CIwIXLoTanEyY5tbqpFWOVjaPzcMwsrDsn0WYD0ceUnm2aHHF3B3nUO.m$$HFQ0smLtvSwyGa2hEBvL56Zxp3uWwg9lJFUFylnrLaTmeDVV8C8aBUZHkL3c28grvcpZ2XWoyZDjwyAY9lxTLrHl81jQivuhn);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

