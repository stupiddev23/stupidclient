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

final class m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1
extends m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW {
    public static final Object[] c = new Object[11];
    public static final String[] d = new String[11];

    public m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1(String string2) {
    }

    static {
        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.b();
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
            case 0 -> 22;
            case 1 -> 40;
            case 2 -> 63;
            case 3 -> 36;
            case 4 -> 55;
            case 5 -> 45;
            case 6 -> 11;
            case 7 -> 13;
            case 8 -> 15;
            case 9 -> 4;
            case 10 -> 29;
            case 11 -> 17;
            case 12 -> 30;
            case 13 -> 48;
            case 14 -> 52;
            case 15 -> 37;
            case 16 -> 41;
            case 17 -> 24;
            case 18 -> 58;
            case 19 -> 35;
            case 20 -> 25;
            case 21 -> 33;
            case 22 -> 53;
            case 23 -> 3;
            case 24 -> 19;
            case 25 -> 31;
            case 26 -> 0;
            case 27 -> 1;
            case 28 -> 44;
            case 29 -> 20;
            case 30 -> 61;
            case 31 -> 16;
            case 32 -> 23;
            case 33 -> 28;
            case 34 -> 42;
            case 35 -> 62;
            case 36 -> 56;
            case 37 -> 51;
            case 38 -> 21;
            case 39 -> 18;
            case 40 -> 14;
            case 41 -> 59;
            case 42 -> 26;
            case 43 -> 7;
            case 44 -> 9;
            case 45 -> 6;
            case 46 -> 5;
            case 47 -> 34;
            case 48 -> 46;
            case 49 -> 54;
            case 50 -> 12;
            case 51 -> 49;
            case 52 -> 27;
            case 53 -> 43;
            case 54 -> 47;
            case 55 -> 10;
            case 56 -> 57;
            case 57 -> 38;
            case 58 -> 39;
            case 59 -> 32;
            case 60 -> 50;
            case 61 -> 2;
            case 62 -> 60;
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
        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.d[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ef' || c == '$' || c == '\u00f1' || c == 'x') {
                field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c == '$' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'p' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "gX\u0003Mw3gX\u0014\u0011{<}\u0013\u0014\u000f{)zbDV)h";
        objectArray[1] = Double.TYPE;
        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.d[1] = "java/lang/Double";
        objectArray[2] = "^A\u0005p\u0017AUN\u0014?\u007fA[A\u0007";
        objectArray[3] = Float.TYPE;
        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.d[3] = "java/lang/Float";
        objectArray[4] = "MI=HV\u0012C@z@Q\t\u000eA7\u0001R\u001aJ\u001b\u007fjx\u0017BBCNX8mMqdZ\u0011hXBmW\u0011n\u007fXH\u000b\u000fb\u001bvUo\u0012GFUCR\u0015Ch@T\n9OD%slD\u0018h}v\u0007\u0017Wxf\u0012YL\u0019\u001dWJvIU\u001aaAW\u000eSTb]k\u001bUn]Tg\u0004iOzc\n";
        objectArray[5] = "\u0004?;_MZ\u000f0*\u0010,T\u0004;.J";
        objectArray[6] = "tOFz@r\u007f@W5#\u007fjF";
        objectArray[7] = "j\u0004[\u000f\u001aU6\u000fGr\u0005Ju\u0015M\u001e7\u001e4N\u0011B`\u001e7\u0012\u0012\u0010\\A1\u0004\u0010rY\u0019nMHN\u0006\u001fxO*";
        objectArray[8] = "\u00180.NkLE%~\u001c\t\u0018E8)YW\u001fE\"-%3\u001bG }Gq\u0011O;@";
        objectArray[9] = "6@;*OvbD$#=)`\u0005\u0003%Y;`yaq[,q\u0013$!\f7\r";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "H3K(\u0001!D=]{`*\u001d6\\%\u0005PMnWz\u0002l\u0012hAx`";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.e(l);
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
                clazz3 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.f(422173469817286L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.f(422173469817286L);
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
            int n = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.c(clazz3, string2, clazz2)) != null) {
                    m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.f(422173469817286L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public float m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM, float f) {
        reference var3_3 = m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.b("\u00cc", (long)713789949151490L) * (double)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.b("p", (Object)((Float)((Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.b("p", (Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM.m$$s8Mp0Pn67yma7UF7Y1gBXnlqRxhZl4WZzOl4auHSFYi74CetAgX4as9UOk0rYV8V9cf8vs22FtvNz2Tvc1Zva2lULXuLp30CA, (long)677501473987278L))), (long)570165466322086L) * 2.0 - (double)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.b("p", (Object)((Float)((Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.b("p", (Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM.m$$s8Mp0Pn67yma7UF7Y1gBXnlqRxhZl4WZzOl4auHSFYi74CetAgX4as9UOk0rYV8V9cf8vs22FtvNz2Tvc1Zva2lULXuLp30CA, (long)677501473987278L))), (long)570165466322086L) + (double)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.b("p", (Object)((Float)((Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.b("p", (Object)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM.m$$XFxkCaDYHlC1jd72t1LG1gjim6KuCgwbqUqMcP0mnejwCNw8JuQEHt57ZboV0gABapSM9emvpAUA9dWfV400aitk2m8c7hiIu, (long)677501473987278L))), (long)570165466322086L);
        return (float)m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.b("\u00cc", (double)var3_3, (long)556265303282283L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$q5dcpEBCxEtpjAueVAxiDK02niH2mf1mSOz8BTY0lUKsC424eWWn2Pada7BNMJAg2DW0Bdm1aUauSMtZl6mm29x1Py6racnUM$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW$1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

