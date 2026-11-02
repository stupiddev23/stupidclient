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
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM;
import me.mioclient.m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW;
import net.minecraft.class_151;

final class m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3
extends m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW {
    public static final Object[] c = new Object[8];
    public static final String[] d = new String[8];

    public m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3(String string2) {
    }

    static {
        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.b();
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
            case 0 -> 61;
            case 1 -> 38;
            case 2 -> 19;
            case 3 -> 29;
            case 4 -> 10;
            case 5 -> 3;
            case 6 -> 45;
            case 7 -> 47;
            case 8 -> 14;
            case 9 -> 59;
            case 10 -> 46;
            case 11 -> 24;
            case 12 -> 7;
            case 13 -> 25;
            case 14 -> 13;
            case 15 -> 31;
            case 16 -> 51;
            case 17 -> 44;
            case 18 -> 48;
            case 19 -> 34;
            case 20 -> 32;
            case 21 -> 20;
            case 22 -> 17;
            case 23 -> 4;
            case 24 -> 36;
            case 25 -> 35;
            case 26 -> 57;
            case 27 -> 43;
            case 28 -> 16;
            case 29 -> 40;
            case 30 -> 11;
            case 31 -> 49;
            case 32 -> 12;
            case 33 -> 6;
            case 34 -> 8;
            case 35 -> 28;
            case 36 -> 37;
            case 37 -> 50;
            case 38 -> 54;
            case 39 -> 33;
            case 40 -> 63;
            case 41 -> 53;
            case 42 -> 26;
            case 43 -> 52;
            case 44 -> 23;
            case 45 -> 27;
            case 46 -> 39;
            case 47 -> 21;
            case 48 -> 56;
            case 49 -> 0;
            case 50 -> 58;
            case 51 -> 1;
            case 52 -> 5;
            case 53 -> 60;
            case 54 -> 42;
            case 55 -> 41;
            case 56 -> 18;
            case 57 -> 30;
            case 58 -> 55;
            case 59 -> 22;
            case 60 -> 9;
            case 61 -> 62;
            case 62 -> 15;
            default -> 2;
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
        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.d[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ec' || c == '\u00d9' || c == 'N' || c == 'T') {
                field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ec' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d9' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'g' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'a' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "tI+\u000f1^tI<S=Qn\u0002<M=Disl\u0014o\u0005";
        objectArray[1] = Float.TYPE;
        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.d[1] = "java/lang/Float";
        objectArray[2] = "%<w\"9,.3fmQ, <u";
        objectArray[3] = "=`Mq6y3i\ny1b~hG82q:2\u000fS\u0018|2k3w8S\u001dd\u0001]:z\u0018q2T7z\u001eV(qkd\u00122\u0006l\u000fy7o%z2~3A0mjR?mUJ\f/hA\rOg|'Q\u0016+9'i4's\u0016\"%3\u0011x7e#}\u0012d\u000bp%G-m\u0007o\u0019f\nZj";
        objectArray[4] = ".>\u000e\u0006n;%1\u001fI\u000f5.:\u001b\u0013";
        objectArray[5] = "~Z*.K9,Rs8zi#R#5$n#H'I\nj:Q0p\u000b8$5";
        objectArray[6] = ">f'ms,;8>x\n?i\u007f\u001ckn-i\u0003yk3\"d2{hc6\u0004";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "KfZBjP\u0015o\bx5E\fa\u0002\u0014\u0007\u0011M:TCPX\u001d|\u0001\u0002iYObe\b=U\u0014{\\\toKp";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.e(l);
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
                clazz3 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.f(333046563728495L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.f(333046563728495L);
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
            int n = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.d(classArray[i], string, clazz2);
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
        int n = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.c(clazz3, string2, clazz2)) != null) {
                    m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.f(333046563728495L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public float m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM, float f) {
        CallSite callSite;
        CallSite callSite2;
        try {
            callSite2 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.b("g", (Object)((Float)((Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.b("g", (Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM.m$$XFxkCaDYHlC1jd72t1LG1gjim6KuCgwbqUqMcP0mnejwCNw8JuQEHt57ZboV0gABapSM9emvpAUA9dWfV400aitk2m8c7hiIu, (long)446349636999690L))), (long)381551648211360L);
            callSite = m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_6012 % 2 == 0 ? -m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.b("g", (Object)((Float)((Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.b("g", (Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM.m$$u0srGK2GfB8VYAW2N8ZqbOaY9AN6vxfx2RcscrnmTMU0haqqOHkIDsCbFmen27j6Pz3LoZ7enZgSZaULat1qfpcDPTlqd33e9, (long)446349636999690L))), (long)381551648211360L) : m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.b("g", (Object)((Float)((Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.b("g", (Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM.m$$u0srGK2GfB8VYAW2N8ZqbOaY9AN6vxfx2RcscrnmTMU0haqqOHkIDsCbFmen27j6Pz3LoZ7enZgSZaULat1qfpcDPTlqd33e9, (long)446349636999690L))), (long)381551648211360L);
        }
        catch (class_151 class_1512) {
            throw m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.a(class_1512);
        }
        reference var3_3 = callSite2 + callSite;
        return (float)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.b("a", (float)var3_3, (long)514472361684645L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

