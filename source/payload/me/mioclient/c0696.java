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
import java.util.Set;
import me.mioclient.m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O;
import net.minecraft.class_1792;

final class m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2
extends m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O {
    public static final Object[] e = new Object[9];
    public static final String[] f = new String[9];

    public m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2(String string2, class_1792 class_17922) {
    }

    static {
        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.d();
    }

    public static Class n(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.m(l);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field h(Class clazz, String string, Class clazz2) {
        Field field = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'm' || c == 'R' || c == '\u00a2' || c == 'w') {
                field = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.o(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'm' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.p(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.d(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void d() {
        Object[] objectArray = e;
        e[0] = "&7+\u001c0\u001f8?1SM\u000f8";
        objectArray[1] = "A.#\\P\b_&9\u0013\r\tY*4PP._=0\\\u0013";
        objectArray[2] = "HY\u0010o+7VQ\n J2VQ\t`d.";
        objectArray[3] = "\u001f}&C9;\u0014r7\fX5\u001fy3V";
        objectArray[4] = "R;@|\u0015O\\2\u0007t\u0012T\u00113J5\u0011GUi\u0002^;J]0>z\u001ber?\fP\u0019Lw*?Y\u0014Lq\r%|HR}i\u000ba,OX4(w\u0011H\\\u001a=`IdP6XG/\u0019\u0007\u001a\u0000BDJH\n\u001b&\u001a\u0011\u0006o*~5\u0014Jh\u001cu\u0014SL&\u001fi(FJ\u001c `$Yv=\u0007WI";
        objectArray[5] = "kdAfbNlwXv[D(KE\u007f6#h8Bh*Oi>Ng[\u0019leMu7\u0018jiB\u0004";
        objectArray[6] = "D\u001cn\u0011r\n\u001e\u00193C\u0015\u0000\u0012\fP\u0011q\u0012\u0012p4Fv\u0003\u000e\u001c5@z\f\u007f";
        objectArray[7] = "A\u0016<O]_\u001f\u001bi,VG\u0001\u001a0I-\u0002\u0017\u00122A\u0013\\AK2,";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "\u0003j\u001fY\u0006W]<FYk\u0007[`\u0016{\r\u0018:?\u0018R\tPW8\u000bK\u0019i";
    }

    public static int m(long l) {
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
            case 0 -> 60;
            case 1 -> 2;
            case 2 -> 31;
            case 3 -> 57;
            case 4 -> 47;
            case 5 -> 18;
            case 6 -> 39;
            case 7 -> 24;
            case 8 -> 53;
            case 9 -> 59;
            case 10 -> 0;
            case 11 -> 58;
            case 12 -> 33;
            case 13 -> 55;
            case 14 -> 27;
            case 15 -> 56;
            case 16 -> 38;
            case 17 -> 14;
            case 18 -> 51;
            case 19 -> 3;
            case 20 -> 29;
            case 21 -> 13;
            case 22 -> 20;
            case 23 -> 19;
            case 24 -> 37;
            case 25 -> 43;
            case 26 -> 46;
            case 27 -> 8;
            case 28 -> 45;
            case 29 -> 5;
            case 30 -> 12;
            case 31 -> 63;
            case 32 -> 25;
            case 33 -> 54;
            case 34 -> 9;
            case 35 -> 41;
            case 36 -> 11;
            case 37 -> 32;
            case 38 -> 4;
            case 39 -> 36;
            case 40 -> 62;
            case 41 -> 15;
            case 42 -> 44;
            case 43 -> 26;
            case 44 -> 23;
            case 45 -> 52;
            case 46 -> 17;
            case 47 -> 16;
            case 48 -> 28;
            case 49 -> 7;
            case 50 -> 61;
            case 51 -> 42;
            case 52 -> 35;
            case 53 -> 40;
            case 54 -> 22;
            case 55 -> 30;
            case 56 -> 10;
            case 57 -> 48;
            case 58 -> 49;
            case 59 -> 34;
            case 60 -> 1;
            case 61 -> 21;
            case 62 -> 50;
            default -> 6;
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
        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.f[n3] = new String(cArray);
        return n3;
    }

    public static Field o(long l) {
        int n = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.m(l);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.n(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.n(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.g(clazz3, string2, clazz2)) != null) {
                    m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.n(221644232059412L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method p(long l) {
        int n = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.m(l);
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
                clazz3 = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.n(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.n(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.n(221644232059412L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.n(221644232059412L);
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

    public static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    @Override
    public class_1792 m$$0BYw3945tOifcplzDM5cgasrDnUyzZUR49yXdakYUr1Tz7rHz983u2lbZGdfvwYVfi5vvx6I4TAVnYd6whWPUkuMYPyF5aVGQ(boolean bl) {
        Set set = (Set)((Object)m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.d("\u00d5", (Object)m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O.m$$RbthGzsNP3yoPgAcDuUkncLhUMarFvGUIpivMB6MFS7C1vUKBZ0GMIrDTLvI5C5VJEV70QnBYFBglL3CGG4WNrDTOFQ8erEfc.m$$HPxNAwYtJ8GZPZG7I5EfUG8HgfWHeEgbCbU7H7f2YJmTovQ4oXZvmAjnN839OwhHAJbSbqTiMKv9uZBZw2LvioCNf24DphqRj, (long)471179991358337L));
        return (class_1792)m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.d("\u00d5", (Object)m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.d("\u00d5", (Object)m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.d("\u00d5", (Object)set, (long)506783046281181L), (long)627179338956668L), null, (long)359822812164281L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$TTAWve29Gc8nVma1dkV0C7Mh3wgwrbnwUl42ia0fyaCl9Wn144pYAV5hnnSX55ujH1KxsMkxQbVZZoL4TG9D0Bz0eA7hPXO9O$2.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

