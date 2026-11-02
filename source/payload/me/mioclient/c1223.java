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
import me.mioclient.m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM;
import me.mioclient.m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW;

final class m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4
extends m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW {
    public static final Object[] c = new Object[6];
    public static final String[] d = new String[6];

    public m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4(String string2) {
    }

    static {
        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.b();
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
            case 0 -> 27;
            case 1 -> 1;
            case 2 -> 0;
            case 3 -> 38;
            case 4 -> 62;
            case 5 -> 43;
            case 6 -> 28;
            case 7 -> 59;
            case 8 -> 26;
            case 9 -> 2;
            case 10 -> 22;
            case 11 -> 34;
            case 12 -> 35;
            case 13 -> 47;
            case 14 -> 24;
            case 15 -> 63;
            case 16 -> 20;
            case 17 -> 37;
            case 18 -> 21;
            case 19 -> 33;
            case 20 -> 32;
            case 21 -> 7;
            case 22 -> 4;
            case 23 -> 13;
            case 24 -> 45;
            case 25 -> 30;
            case 26 -> 56;
            case 27 -> 60;
            case 28 -> 23;
            case 29 -> 40;
            case 30 -> 54;
            case 31 -> 10;
            case 32 -> 17;
            case 33 -> 48;
            case 34 -> 53;
            case 35 -> 46;
            case 36 -> 12;
            case 37 -> 16;
            case 38 -> 8;
            case 39 -> 61;
            case 40 -> 55;
            case 41 -> 18;
            case 42 -> 3;
            case 43 -> 15;
            case 44 -> 57;
            case 45 -> 31;
            case 46 -> 41;
            case 47 -> 25;
            case 48 -> 6;
            case 49 -> 39;
            case 50 -> 9;
            case 51 -> 29;
            case 52 -> 49;
            case 53 -> 44;
            case 54 -> 50;
            case 55 -> 51;
            case 56 -> 58;
            case 57 -> 42;
            case 58 -> 11;
            case 59 -> 14;
            case 60 -> 5;
            case 61 -> 19;
            case 62 -> 52;
            default -> 36;
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
        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.d[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cf' || c == '\u00b5' || c == 'R' || c == '\u00f5') {
                field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cf' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'V' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "\u0012\\\t0M!\u0019S\u0018\u007f%!\u0017\\\u000b";
        objectArray[1] = Float.TYPE;
        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.d[1] = "java/lang/Float";
        objectArray[2] = "LTM\u0011}VB]\n\u0019zM\u000f\\GXy^K\u0006\u000f3SSC_3\u0017s|lP\u0001=qUiE24|Uob(\u0011 Kc\u0006\u0006\fDVF[%\u001ayQBu0\r!}NYU*G\u0000\u0019u\r/,SVe\u0016Kr\b\u0018\u0000'\u0013]\rT\u0007\u0011\u0018|JRI\u0012\u0004@_Ts-\rL@hR\n:!";
        objectArray[3] = "\u001d;z&K|\u00164ki*r\u001d?o3";
        objectArray[4] = "*W\b#w1rTLSy>-^N\r~>7Z2.lk'\u000fQ0wkJ";
        Object[] objectArray2 = objectArray;
        objectArray[5] = "5wK\u001d#zrbE\u0018\u001bwaweI\u007fea\u000b\u0001\u001ca'4e\u0005^kj\f";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.e(l);
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
                clazz3 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.f(216535448389175L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.f(216535448389175L);
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
            int n = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.c(clazz3, string2, clazz2)) != null) {
                    m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.f(216535448389175L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public float m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM, float f) {
        return (float)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.b("V", (Object)((Float)((Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.b("V", (Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM.m$$e9snTsKtlnuxfoYzlJBhhlSxomxhdk6mKaUWtKv3jOWO62rBS8pFiZ9gQyXEQ8pCdW9kkq8POhQSZzF9WwGNf1T3FU9llZHH5, (long)415424759440582L))), (long)319844513570028L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

