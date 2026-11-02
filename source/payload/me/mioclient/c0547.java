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
import java.util.List;
import me.mioclient.m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM;

final class m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3
extends m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6 {
    public static final long[] a;
    public static final Integer[] b;
    public static final Object[] e;
    public static final String[] f;

    public m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new Object[12];
        f = new String[12];
        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.b();
        long l = 3725909159384215560L;
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00f7D\u00f7\u00b4.\u0092\u0087m\u0083\u00baC\u00b1\u00fc\u0088WA";
        int n2 = "\u00f7D\u00f7\u00b4.\u0092\u0087m\u0083\u00baC\u00b1\u00fc\u0088WA".length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n3 < n2);
        a = lArray;
        b = new Integer[2];
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
            case 0 -> 2;
            case 1 -> 34;
            case 2 -> 19;
            case 3 -> 41;
            case 4 -> 31;
            case 5 -> 29;
            case 6 -> 59;
            case 7 -> 36;
            case 8 -> 9;
            case 9 -> 18;
            case 10 -> 60;
            case 11 -> 51;
            case 12 -> 6;
            case 13 -> 8;
            case 14 -> 52;
            case 15 -> 15;
            case 16 -> 61;
            case 17 -> 47;
            case 18 -> 62;
            case 19 -> 0;
            case 20 -> 50;
            case 21 -> 32;
            case 22 -> 25;
            case 23 -> 5;
            case 24 -> 35;
            case 25 -> 39;
            case 26 -> 20;
            case 27 -> 16;
            case 28 -> 13;
            case 29 -> 12;
            case 30 -> 21;
            case 31 -> 30;
            case 32 -> 43;
            case 33 -> 26;
            case 34 -> 23;
            case 35 -> 40;
            case 36 -> 3;
            case 37 -> 27;
            case 38 -> 44;
            case 39 -> 53;
            case 40 -> 4;
            case 41 -> 56;
            case 42 -> 7;
            case 43 -> 11;
            case 44 -> 54;
            case 45 -> 14;
            case 46 -> 38;
            case 47 -> 55;
            case 48 -> 1;
            case 49 -> 63;
            case 50 -> 24;
            case 51 -> 22;
            case 52 -> 33;
            case 53 -> 46;
            case 54 -> 49;
            case 55 -> 28;
            case 56 -> 10;
            case 57 -> 58;
            case 58 -> 48;
            case 59 -> 17;
            case 60 -> 45;
            case 61 -> 57;
            case 62 -> 37;
            default -> 42;
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
        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.f[n3] = new String(cArray);
        return n3;
    }

    public static void b() {
        Object[] objectArray = e;
        e[0] = "AmA\u001f]\u0018Od\u0006\u0017Z\u0003\u0002eKVYBha\u0017Fl\u001b{}=J\u0004\u000f\u001dJ<\u0010e6t9%G\f\"ho\u00034~@eY\u001b\nZ:\u0014m$\u0017~-Iy\f\"\u0004\u001dii\u0016G_\u001az`^\u0005\u0004Aep<D@8vl\u001d\u000b\f#A:&\u0019s\u0002m?)#G:mK8=~F\u001a\u007f\u0015\u0000y";
        objectArray[1] = Integer.TYPE;
        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.f[1] = "java/lang/Integer";
        objectArray[2] = "q:j7\u0015\\\u007f3-?\u0012G22`~Lf)'\nk\u000eef/#,OI]\u00190\u0000\n\u0003v'(\u001eH@y\u0011)4\nVM\u0019\u000b\u0010+qf\u0006p\u0013\u000f\u0001O'\u0000\u0015*zt\u00127\u001dN}W>\u00026\ftP9\u001d94PD\u0011so\t\u0002Jj\b<&vJ5/3\u0015aX52.3|wo>\u001f0";
        objectArray[3] = "tb0g<<zkwo;'7j:.84s0rE\u00129{iNa2\u0016Tf|K0?QsOB=?WTUga![0{z\u0005<~mXl8;zCM{`\u0017vo(\\\u0006j!CpYm9nSk=3b 6Ze\u001cgl1ln= j\u007for\u00015lEP{\r*PdwL`";
        objectArray[4] = "Vq [4f]~1\u0014UhVu5N";
        objectArray[5] = Boolean.TYPE;
        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.f[5] = "java/lang/Boolean";
        objectArray[6] = ")\u001e\b9h\u00127\u0016\u0012v\n\u000e0\u000b";
        objectArray[7] = "g'RH>bl(C\u0007Rab*AH~";
        objectArray[8] = "Wx=\u0004\u0018f]6.\u001c\"0\u0000:\u0001\u0017F\"\u0000FdDFeW*%\u001fN?m";
        objectArray[9] = "!5/Oiz'=y&`+o\u001e{\u0016nh\u001a\u0018<\u0019lb\u0019\u0013\u007f[d|z :`x>&g\"BdF&$8V]g*0\nL<C\u0006'$|hG\u0002f:OOL\u000f\u0006\u000fIaL\u0013\u001f1~ov?\u001b\tt{\\2\u0014qE9u:\u0016?\u001e~Wyn'H;9\u0018\r\nHeM\u00132@Y;nx02MhcCf-\\>v!9-Ht\u0007";
        objectArray[10] = "UT(d\u0006W\nT<.wP@\u0015k$0~\u0007e,\u000eF_/C\u0012#\u001cI\u0002\u0005.\u001d\u0014o#|\u001c\u0019\u000eH%W\u001c\u00168p\u0013@9\u00166{\u0000\u0001('\u000eI\u001egh'+n\u000b\u007f\u001b\u0010Gl5wi?\u001dY>g\u00153\fY2c\b\u0000\u001cY\u0006\\6\u00138lSh-\u001b\u0014\f\nI\u001dd\u0006z\u0010[2_K\f\u0010X#'\u0013TSDR I\\WV 4\u001aQl\u0005+ \u0005W\u0011X,;\u00175";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "_st$\u001c^\u0002{r~,[\u0004e.-EW=k.=A1_;6!]I\u0007cu=,";
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fd' || c == '\u00fb' || c == '\u00c3' || c == '\u00da') {
                field = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fd' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'J' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.e(l);
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
                clazz3 = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.f(311972234881733L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.f(311972234881733L);
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
            int n = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.e(l);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3BBD;
        if (b[n2] == null) {
            m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }

    public static Field g(long l) {
        int n = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.e(l);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.c(clazz3, string2, clazz2)) != null) {
                    m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.f(311972234881733L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public List m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM) {
        return m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.b("J", (Object)m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.b("J", (Object)m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM, (int)m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.a(19002, 2269291472051958150L), (long)666878660626708L), (boolean)m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.b("J", (Object)((Boolean)((Object)m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.b("J", (Object)m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6.speedmine.m$$WloDWBEh9hvzNuVOgLSkQsIrE9JdhnuhJah9mnEaIV78tdDdZuNqL8UohI3SiQbWvicnpQZYxzzI0H3KcFdNd4LT1LliyMQta, (long)567618837030521L))), (long)813266176874307L), (int)m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.a(14413, 3829909902406616048L), (long)716729348754260L);
    }

    public static String m$$dfFAFrMsA8eHSQras944Ot7gKFcz33qtAB8fuNHZR9t9SxU5kyMH2yeCUjW46J3uTJqCNVIZPepDRCu2eodjvlTkOxL8SfAmH(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-109, -22, 125, 46, -21, 97, -120, -127, -86, 27, -109, 28, -100, 93, 56, 28, 42, 52, 101, -57, -103};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 21]);
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
            return MethodHandles.lookup().findStatic(m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

