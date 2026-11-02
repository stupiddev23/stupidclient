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
import me.mioclient.m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm;
import me.mioclient.m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6;
import me.mioclient.m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q;
import net.minecraft.class_151;

final class m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1
extends m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6 {
    public static final long a;
    public static final Object[] d;
    public static final String[] e;

    public m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new Object[14];
        e = new String[14];
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.b();
        long l = 3667469276483502158L;
        a = 0x7F6FC54C775E0700L ^ l;
    }

    public static int e(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (e[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 13;
            case 1 -> 60;
            case 2 -> 8;
            case 3 -> 24;
            case 4 -> 0;
            case 5 -> 35;
            case 6 -> 36;
            case 7 -> 49;
            case 8 -> 15;
            case 9 -> 4;
            case 10 -> 20;
            case 11 -> 37;
            case 12 -> 22;
            case 13 -> 14;
            case 14 -> 27;
            case 15 -> 7;
            case 16 -> 9;
            case 17 -> 11;
            case 18 -> 42;
            case 19 -> 28;
            case 20 -> 3;
            case 21 -> 33;
            case 22 -> 50;
            case 23 -> 16;
            case 24 -> 40;
            case 25 -> 62;
            case 26 -> 47;
            case 27 -> 31;
            case 28 -> 51;
            case 29 -> 19;
            case 30 -> 41;
            case 31 -> 38;
            case 32 -> 21;
            case 33 -> 39;
            case 34 -> 45;
            case 35 -> 55;
            case 36 -> 44;
            case 37 -> 26;
            case 38 -> 56;
            case 39 -> 59;
            case 40 -> 6;
            case 41 -> 1;
            case 42 -> 18;
            case 43 -> 61;
            case 44 -> 23;
            case 45 -> 63;
            case 46 -> 25;
            case 47 -> 32;
            case 48 -> 58;
            case 49 -> 43;
            case 50 -> 12;
            case 51 -> 5;
            case 52 -> 10;
            case 53 -> 30;
            case 54 -> 48;
            case 55 -> 46;
            case 56 -> 2;
            case 57 -> 29;
            case 58 -> 54;
            case 59 -> 34;
            case 60 -> 17;
            case 61 -> 52;
            case 62 -> 57;
            default -> 53;
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
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.e[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e3' || c == 'G' || c == 'd' || c == '\u00cd') {
                field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'G' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'V' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = d;
        d[0] = "]k\u001ccb3Vd\r,\u00051Co\rg>";
        objectArray[1] = Integer.TYPE;
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.e[1] = "java/lang/Integer";
        objectArray[2] = "Wk-OL\u0017YbjGK\f\u0014c'\u0006r\u0001`H7Fh;\tYW\u0015R\u0002@:jhI\u001e{KJZ]1C;OzW=\u007fgdgO,B;YJT@\r~@\u0016o\u0012QkJ\u0010@(QY2\u0010N/P?g@|-V~0em0o9e[b\u0001xA6qJ)\u000eFWUi\bM<aC\u0013";
        objectArray[3] = Float.TYPE;
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.e[3] = "java/lang/Float";
        objectArray[4] = "?\u0010\u0012\n8y1\u0019U\u0002?b|\u0018\u0018C<q8BP(\u0016|0\u001bl\f6S\u001f\u0014^&4z\u001a\u0001m/9z\u001c&w\ned\u0010BY\u0017\u0001y5\u001fz\u0001<~11o\u0016dR=\u001d\n1\u0002/j1R4i|%!IP7'kDx\b\u0018\"'CN\u00039e!\rM\u001f\u0005p'7r\u0016\to\u001b\u0016U!d";
        objectArray[5] = "{NT\u000eO2pAEA.<{JA\u001b";
        objectArray[6] = "<\u0001GX<\u007f2\b\u0000P;d\u007f\tM\u0011\u0016Z\u001c&\u001d^/u%0(y\u001bV=+\u001d\u0001gue.,t9#\u001e\u0000\rT<v%\r\u001cV=Z4\n\\e>q\u001e\u000e?\u0005d^$2_d2X\u001b\u0005Pfe^\u001b\b\fs1q3W&G\u0014_4\u0005\u0007T$f\t\u000e\u0019Da\\c\u0016\u001b\u0004fq\u001b :c8";
        objectArray[7] = Boolean.TYPE;
        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.e[7] = "java/lang/Boolean";
        objectArray[8] = "/\u0007;-S\u00152\u0012c\u000f\u0012\u0018*\u0014";
        objectArray[9] = "B\u0006:\u001e1%C\u0017q'=xS\"jC!s/\u0002l\u001dc\u007fT\u0001yJ\\";
        objectArray[10] = "Y\bJWP%P\u0019N\u0014j>L^-/R\u0004Q+\u0011V\t=*\u001f\u001e\u0011\u0003=\u0011\u000f'\f\u000b\u0011:\u001fG\u001f\u00167\u00195\u00073$5\t\u0014/]Sf\u0010-G<\u000e\u001a\u0005\u0003\u0012&&\u0017#-*2.>^=\u001a\u0016Q\u001f+\u0003FU\u0013%8-*5\r\u0010\n\u0017\u0017\u0012\u0003&\\H:S&:_\u001b\u0005\u0011\u0000$\u0012;=mP1\fN\u0016\u000b\u001bb\u0007\u0000w";
        objectArray[11] = ".o&\u0013z\u001b+=0\t\u0007\u0015x+\n\u0004c\u0007xWo\u0014x\u0013g)j\u000bx\u0005\u0015";
        objectArray[12] = "9Y,\u0004^\u00079S$Lg\u0004)\u001a-Q[\u000fUUka\u0000Q:\\\u0016PY^{\\,\u0000+,~\u007f.`\u0000\u0018g\\.L),i_dB_\u001e?_\u0004b\u001d\u00109H\u0011s\b+KX5_+/Z\u007f\b\u0001\u0002\u0000xS\u0007P(\u0013lm1L!\u001eT[7@]Pun\to\u0015\u0019{d\rz\f\rE|/>\u0019\u000e?\t4E\u001a\u001bh6h\u0001V\r\u007fG-\u000e\u0018\u0005\u0005";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "\u000b\u0018;C>\u000f\u000b\u00123\u000b\u0007\f\u001b[0\u0004v\u0006z'y#v&KL\u001c\u001d~6\fG$\u0019b\u0016\u0007+\t\u0006n\u0010\u000e=/\u0018@\u0018s>y\u001b99~\u001d<)F\u000eZ<y?=9\u0007\b\u001fIc\u0005Y&9AeWU\b-C[\u000bM\u001ey=W\u0004\b\b\u001f+C$z\u001e0\u0000|WQ<z)76\u00069ry9VI\u001d(\u0013x\u0015\u000b\rB\u0007hS\b\u00169\u0004}\u00047I}\u0007m\u0003]\b>E}i";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.e(l);
        Object object = d[n];
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
                clazz3 = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.f(380560317368720L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.f(380560317368720L);
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
            int n = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.e(l);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.d(classArray[i], string, clazz2);
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
        int n = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.e(l);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.c(clazz3, string2, clazz2)) != null) {
                    m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.f(380560317368720L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public Color m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q, float f) {
        try {
            if (m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.b("V", (Object)((m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$r3oVCsNsPQXXq17UCjth1xlb7awWG6PjBGdjMxBgjb9Ej5QngYaLOs3LAppUPk3TXYh0ckSfbZ32pi5AszrdC42W9k0oC7UHl), (int)((int)a), (long)880592272064376L) != false) {
                return m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.b("V", (Object)((m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$r3oVCsNsPQXXq17UCjth1xlb7awWG6PjBGdjMxBgjb9Ej5QngYaLOs3LAppUPk3TXYh0ckSfbZ32pi5AszrdC42W9k0oC7UHl), (Object)((Color)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.b("V", (Object)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$r3oVCsNsPQXXq17UCjth1xlb7awWG6PjBGdjMxBgjb9Ej5QngYaLOs3LAppUPk3TXYh0ckSfbZ32pi5AszrdC42W9k0oC7UHl, (long)798107453413008L))), (int)((int)(f * (float)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.b("V", (Object)((Integer)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.b("V", (Object)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$6gpx1Wavx1AeLF0aHVRJFlpo82e48UwF3mLOUlFy1NsAno5Dm5XpkrFmCxRR9Adqn1WtD7vfBVZcdPjVIBkhINYPaEyd6w7bB, (long)798107453413008L))), (long)648819317602354L) * m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.b("\u00d9", (long)762217507655826L))), (long)934654303340900L);
            }
        }
        catch (class_151 class_1512) {
            throw m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.a(class_1512);
        }
        return (Color)((Object)m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.b("V", (Object)m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.m$$r3oVCsNsPQXXq17UCjth1xlb7awWG6PjBGdjMxBgjb9Ej5QngYaLOs3LAppUPk3TXYh0ckSfbZ32pi5AszrdC42W9k0oC7UHl, (long)798107453413008L));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$WyZF4dMC3WT7wzz4iJlfAEIxxIy5LXrEEigEjTx5Zhq87pC4JjkeI2ePkW12kWj1dbYUlp3GHHU7fyGyBO5SoQ4HTwLpw2ba6$1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

