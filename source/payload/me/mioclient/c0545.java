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
import java.util.List;
import me.mioclient.m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM;

final class m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1
extends m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6 {
    public static final Object[] a = new Object[13];
    public static final String[] b = new String[13];

    public m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1(String string2) {
    }

    static {
        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.b();
    }

    public static int e(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (b[n3] != null) {
            return n3;
        }
        Object object = a[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 25;
            case 1 -> 21;
            case 2 -> 7;
            case 3 -> 42;
            case 4 -> 35;
            case 5 -> 48;
            case 6 -> 53;
            case 7 -> 58;
            case 8 -> 59;
            case 9 -> 45;
            case 10 -> 8;
            case 11 -> 55;
            case 12 -> 36;
            case 13 -> 4;
            case 14 -> 11;
            case 15 -> 34;
            case 16 -> 20;
            case 17 -> 44;
            case 18 -> 23;
            case 19 -> 3;
            case 20 -> 30;
            case 21 -> 22;
            case 22 -> 54;
            case 23 -> 12;
            case 24 -> 19;
            case 25 -> 10;
            case 26 -> 2;
            case 27 -> 52;
            case 28 -> 24;
            case 29 -> 60;
            case 30 -> 62;
            case 31 -> 32;
            case 32 -> 5;
            case 33 -> 40;
            case 34 -> 0;
            case 35 -> 56;
            case 36 -> 14;
            case 37 -> 6;
            case 38 -> 31;
            case 39 -> 9;
            case 40 -> 61;
            case 41 -> 1;
            case 42 -> 51;
            case 43 -> 37;
            case 44 -> 28;
            case 45 -> 29;
            case 46 -> 50;
            case 47 -> 18;
            case 48 -> 33;
            case 49 -> 26;
            case 50 -> 15;
            case 51 -> 49;
            case 52 -> 39;
            case 53 -> 63;
            case 54 -> 16;
            case 55 -> 43;
            case 56 -> 57;
            case 57 -> 41;
            case 58 -> 17;
            case 59 -> 47;
            case 60 -> 27;
            case 61 -> 13;
            case 62 -> 38;
            default -> 46;
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
        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.b[n3] = new String(cArray);
        return n3;
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Y' || c == 'M' || c == '\u00d0' || c == 'h') {
                field = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = a;
        a[0] = "i%I\u00143Gg,\u000e\u001c4\\*-C]\tQJ2^:bLS1-\u001el~`\"/5mC]&1\u0014\f_c,48\"bP#\u0014@6kp\u000f*LlBHr_I\u001deP9.\u001coamyV\u001a\na|\u0010V-,{W\u0004/\u001e?J|\u0005$\r1Xu! Hhd6\t=L6AO\u0010.#<";
        objectArray[1] = "\u0005R\u001bJ!;\u0005R\f\u0016-4\u001f\u0019\f\b-!\u0018h]P\u007f";
        objectArray[2] = Float.TYPE;
        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.b[2] = "java/lang/Float";
        objectArray[3] = Boolean.TYPE;
        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.b[3] = "java/lang/Boolean";
        objectArray[4] = "8\u007f-@\u0015\u0019&w7\u000fw\u0005!j";
        objectArray[5] = "D_\u000eW_\u0007D_\u0019\u000bS\b^\u0014\u0019\u0015S\u001dYeMM\u0004";
        objectArray[6] = ")jfPS,\"ew\u001f;,,jd";
        objectArray[7] = "|\u0006AR>\u000br\u000f\u0006Z9\u0010?\u000eK\u001b:\u0003{T\u0003p\u0010\u000es\r?T0!\\\u0002\r~2\bY\u0017>w?\b_0$Rc\u0016ST\nO\u0007\u000bv\t)Y:\fr'<Nb ~\u000bYi\u0004])'\u0001lo\u000ef7\u001a\b1U(R+P\u001ePdU\u001d[?\u0017b\u001b\u001eG\u0003\u0002d!!N\u000f\u001dX\u0000\u0006yb";
        objectArray[8] = ".Qf\u0014Mc%^w[,m.Us\u0001";
        objectArray[9] = "&Vm-LdwBkqqqpUp.\u001dC$\u0018-rA\u0014$\u0018hs\u001ft\"H) q";
        objectArray[10] = "Wf\u001a\u0003!1\u0013{\u001b\u0002N0\u000fnL\u0018\u00107\u000ftHdw!\boX\u0005.>Qq%";
        objectArray[11] = "\u0014y.XbQRi|^[LDeKV?^D\u0019(D!@PsuB$])";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "d*`\u0007puq}8|y>!b!\rs_]+\u0006\rSn6N8\u0005C)=v<\u0019c\"Q[#\u0015e+G}=;mVD+>BL[gn\f={\u007fF+\u001aFL\"rMl\u0018p|\\kd\u001e\"pr\u007ff ~hd+\u0018,q-rM\u000e8Q_db%\u0007\"tF(\fLC#C \\E-j7~<C}+d\u0010e\u0003\u007ftpq<\u001c&j\r*2C\u007f-=/%\u0002l\u00126|g\u0016,|`s \u0007\u001c";
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.e(l);
        Object object = a[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = b[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.f(588951820257727L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.f(588951820257727L);
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
            int n = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.e(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field g(long l) {
        int n = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.e(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.c(clazz3, string2, clazz2)) != null) {
                    m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.f(588951820257727L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public List m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM) {
        return m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.b("d", (Object)m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.b("W", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)662307476461522L), (float)m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.b("W", (Object)((Float)((Object)m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.b("W", (Object)m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM.m$$msy1azcI2OEbpQK3pzLYjhJpGxGP0TkAM44VyFdRShnQlcGiNz1t8xTvtCNqFfvkX7S6ciocNStVEhTZ57VW7zEs1I9TeF8GW, (long)776337481939532L))), (long)738187418626015L), (boolean)true, (long)859251958849348L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$O6PjRJnazFvA6It417U3kgkqo41IiKDML5gif18D4nDsNZRVjOzjtEBGMidl60rHENbWnq9OazfZjvm2V03B1nLXV9L6HKoE6$1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

