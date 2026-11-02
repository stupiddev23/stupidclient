/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import me.mioclient.m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI;
import me.mioclient.m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z;
import net.minecraft.class_151;

final class m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1
extends m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z {
    public static final Object[] c = new Object[11];
    public static final String[] d = new String[11];

    public m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1(String string2) {
    }

    static {
        m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.b();
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
            case 0 -> 39;
            case 1 -> 10;
            case 2 -> 14;
            case 3 -> 45;
            case 4 -> 17;
            case 5 -> 46;
            case 6 -> 4;
            case 7 -> 33;
            case 8 -> 11;
            case 9 -> 1;
            case 10 -> 31;
            case 11 -> 52;
            case 12 -> 18;
            case 13 -> 22;
            case 14 -> 38;
            case 15 -> 21;
            case 16 -> 16;
            case 17 -> 26;
            case 18 -> 53;
            case 19 -> 6;
            case 20 -> 32;
            case 21 -> 63;
            case 22 -> 5;
            case 23 -> 48;
            case 24 -> 9;
            case 25 -> 15;
            case 26 -> 42;
            case 27 -> 20;
            case 28 -> 51;
            case 29 -> 19;
            case 30 -> 58;
            case 31 -> 57;
            case 32 -> 3;
            case 33 -> 54;
            case 34 -> 44;
            case 35 -> 40;
            case 36 -> 29;
            case 37 -> 27;
            case 38 -> 55;
            case 39 -> 41;
            case 40 -> 23;
            case 41 -> 61;
            case 42 -> 35;
            case 43 -> 7;
            case 44 -> 25;
            case 45 -> 30;
            case 46 -> 62;
            case 47 -> 59;
            case 48 -> 36;
            case 49 -> 0;
            case 50 -> 24;
            case 51 -> 2;
            case 52 -> 12;
            case 53 -> 47;
            case 54 -> 13;
            case 55 -> 60;
            case 56 -> 49;
            case 57 -> 50;
            case 58 -> 28;
            case 59 -> 34;
            case 60 -> 56;
            case 61 -> 8;
            case 62 -> 43;
            default -> 37;
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
        m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.d[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'R' || c == 'J' || c == '\u00cc' || c == '\u00c9') {
                field = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'R' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'i' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        c[0] = "'\u001b\b\u007f?D,\u0014\u00190\\I9\u0012";
        objectArray[1] = Float.TYPE;
        m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.d[1] = "java/lang/Float";
        objectArray[2] = "Z\u0007&9f}G\u0012~\u001b'p_\u0014";
        objectArray[3] = Integer.TYPE;
        m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.d[3] = "java/lang/Integer";
        objectArray[4] = "\u0002\u0006fGm\u0017\f\u000f!Oj\fA\u000el\u000et?<0&\u0019c\u0017\u0002\u0019\u0003br\u001a_\u0006$z<\u001a9\u0006\u0002{}N\f\tp`n\u0000\fZ$X0:W\"|E0\u0000,\b\u0007ri\"*WysG6\u0017RpHu\u0014\u0015[1Xv\u0016\u0007T%Xh2Z./g2>\n/\u0001\u007fa\u0012!\u0011\nf4L:\"z\u0018^";
        objectArray[5] = "8\u000e\u0014\bhA6\u0007S\u0000oZ{\u0006\u001eAHv\u0013\u0012W77\u0018e(\u0002$wZ\u0016\u0004q'hZ&8M\fV\u001b\u0004R`Ve\u0016\u001b\u0002i7Q\\\u0012!|SM_'SN Lw>\u001bQR``d\t\\\u0010qc;\b{\u0004Gkd/q\u0017Nw9\u001brTUvfYW=xk\u0007'J\u000buZ??X\u0002H";
        objectArray[6] = "E]\u0015R!u0p\bGyWq}\u0010Al";
        objectArray[7] = ">y\"b\u0007x5v3-fv>}7w";
        objectArray[8] = "\\G<=Y\b\nQ>[F\u0013\u001d.bdD\u0000\u0006C)=]Dm\u0017d<Y\u0011\u0000\\=%\u001dzT\u0011<!H\u0017\u001fH%e#";
        objectArray[9] = "\u007f\u0001CLIX~@\u000bU%Y+\u0003rS]V/\u007f\u0001N\\\nz\u001eK\rI]F";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "P5III\u0000\bb\n\u000fq\bG#EO\u0000\u0002&_\fh\u0000\"\u00174iV\b2P?QR\u0014\u0012[S|M\u0018\u0014REZS6\u001c/F\fPO=\"eIb0\n\u0006D\ftK=[pj\u0002\u0015\u0001\u0005^L\n\u0013S\tpX\b-\u000f\u0011f\fv!\u0000Tpj`5 &fEK\nS\rD\u000fbA2ZA\u00072MWZoQ\b\u000b\u0015\u001927\u000bN\n\u0011dZ@\u0017\u0013U\u000f\u000bOM\u001c\nbUH\u000b\u000fk";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.e(l);
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
                clazz3 = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.f(505101265854636L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.f(505101265854636L);
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
            int n = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.e(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.d(classArray[i], string, clazz2);
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
        int n = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.e(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.c(clazz3, string2, clazz2)) != null) {
                    m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.f(505101265854636L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public Color[] m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI, float f) {
        CallSite callSite = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.b("i", (Object)m$$4nmTkPPpubGhvc5iaXuOimETFtMyYVoyiJzzJWPWD79TB4XFqahx3ayybEcQxps6sCxOVZjzZ8pmhJFcklCw1mFUltDoBkM99, (Object)m$$IXFymR660C8AvtCoKBitsSwiW5Q9Z3d8NiSRPrGJF6Lqr8tEMYkpk7aN1bfupMncAaFE1DKrOYlpH1TX32mXyERLpnttjTbgI, (float)f, (long)707194958872168L);
        Color[] colorArray = new Color[]{new Color(0.8f, 0.0f, 0.0f, (float)m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.b("i", (Object)callSite[0], (long)641294883251160L) / 255.0f), new Color(0.8f, 0.0f, 0.0f, (float)m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.b("i", (Object)callSite[1], (long)641294883251160L) / 255.0f)};
        try {
            if (f <= 0.8f) {
                return colorArray;
            }
        }
        catch (class_151 class_1512) {
            throw m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.a(class_1512);
        }
        f = (0.2f - (1.0f - f)) / 0.2f;
        CallSite callSite2 = m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.b("\u00ce", (float)(0.8f - f), (float)0.0f, (long)575711580019840L);
        return new Color[]{new Color((float)callSite2, f * 0.8f, 0.0f, (float)m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.b("i", (Object)callSite[0], (long)641294883251160L) / 255.0f), new Color((float)callSite2, f * 0.8f, 0.0f, (float)m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.b("i", (Object)callSite[1], (long)641294883251160L) / 255.0f)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$pGSSn3gomzKHvb0elP8bVeJQy6cj8Jjxc9lr4B8A4o4xCkOXmZE41YCNx18bqlz8yrrnh7mrlJ5MgM6FeLIUejNrBL04UA22Z$1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

