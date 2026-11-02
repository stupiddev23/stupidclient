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
import me.mioclient.m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_1268;
import net.minecraft.class_1321;
import net.minecraft.class_151;
import net.minecraft.class_243;

final class m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2
extends m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 {
    public static final Object[] a = new Object[20];
    public static final String[] b = new String[20];

    public m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2(String string2) {
    }

    static {
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b();
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
            case 0 -> 16;
            case 1 -> 42;
            case 2 -> 27;
            case 3 -> 11;
            case 4 -> 13;
            case 5 -> 33;
            case 6 -> 54;
            case 7 -> 55;
            case 8 -> 22;
            case 9 -> 0;
            case 10 -> 34;
            case 11 -> 38;
            case 12 -> 45;
            case 13 -> 41;
            case 14 -> 59;
            case 15 -> 40;
            case 16 -> 26;
            case 17 -> 21;
            case 18 -> 52;
            case 19 -> 62;
            case 20 -> 25;
            case 21 -> 5;
            case 22 -> 1;
            case 23 -> 12;
            case 24 -> 35;
            case 25 -> 15;
            case 26 -> 24;
            case 27 -> 17;
            case 28 -> 58;
            case 29 -> 37;
            case 30 -> 3;
            case 31 -> 31;
            case 32 -> 9;
            case 33 -> 44;
            case 34 -> 47;
            case 35 -> 43;
            case 36 -> 4;
            case 37 -> 19;
            case 38 -> 39;
            case 39 -> 46;
            case 40 -> 63;
            case 41 -> 32;
            case 42 -> 51;
            case 43 -> 20;
            case 44 -> 60;
            case 45 -> 2;
            case 46 -> 57;
            case 47 -> 50;
            case 48 -> 56;
            case 49 -> 53;
            case 50 -> 29;
            case 51 -> 28;
            case 52 -> 8;
            case 53 -> 61;
            case 54 -> 48;
            case 55 -> 18;
            case 56 -> 23;
            case 57 -> 14;
            case 58 -> 30;
            case 59 -> 10;
            case 60 -> 36;
            case 61 -> 49;
            case 62 -> 7;
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
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b[n3] = new String(cArray);
        return n3;
    }

    public static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'h' || c == '\u00fe' || c == '\u00f3' || c == 'x') {
                field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.g(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'h' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.h(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'j' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 't' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        a[0] = "{q{7$${qlk(+a:lu(>fK8-\u007f";
        objectArray[1] = "{D&\ru.{D1Qy!a\u000f1Oy4f~c\u0014!~";
        objectArray[2] = "Sy.8\u007fRSy9ds]I29zsHNCk% \n";
        objectArray[3] = Boolean.TYPE;
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b[3] = "java/lang/Boolean";
        objectArray[4] = "}C\u001fo\u000f\u0002}C\b3\u0003\rg\b\b-\u0003\u0018`yYrZ";
        objectArray[5] = "BD\u000e\u0005EkBD\u0019YIdX\u000f\u0019GIq_~H\u001f\u001b";
        objectArray[6] = "|F;|\fQ|F, \u0000^f\r,>\u0000Ka|~aQ\u0001";
        objectArray[7] = "\u0011=\u0002\tk\u0007\u001f4E\u0001l\u001cR5\b@W#\u0005>C'R\t\u0018)~7O'\u0014\u0017F\u00147=\u0005=h\u0005X\u0003/\b{\u0006a_?l\\\u001cd=\u001b6f6a\u001992kQR\f3<{\u0007d 1-\u001d g\u001a\u000f\u001b^\u0010X#E\u000f\u007f/h\u001f\f/t'k .\u0014N\fV\rLn{\u0016@-;lO\u0017f";
        objectArray[8] = "\u0011%ry\rw\u0011%e%\u0001x\u000bne;\u0001m\f\u001f7eY)";
        objectArray[9] = "-J\u0010[\u001cD-J\u0007\u0007\u0010K7\u0001\u0007\u0019\u0010^0pUGG\u0015";
        objectArray[10] = Void.TYPE;
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b[10] = "java/lang/Void";
        objectArray[11] = "CM\u001b\u0001J\u0003HB\nN+\rCI\u000e\u0014";
        objectArray[12] = "\u0000]\n\foF\u0004\u0001\u001f\t\u000fYTL\u0013\u0011ck\u0004\u0000IG\u000f\u0007\u0007\t\u001c\u0018`\u0003C\u000e\u0001v";
        objectArray[13] = "=P*{h\u001dgC\"\u0017d\u001dzH\"{VN>\u0014z\u0017z\u0001gL,ig\u001fl(";
        objectArray[14] = "\u0003J$Zd<\u0007\u00161_\u0004#W[=Gh\u0011\u0004\u001bm\u0019\u0004=KF9Iz UM]\u001a~xU_1Eh=S'";
        objectArray[15] = "\u001b}4r_\u007fMzv.\"v\nl>2S|k\u0010w\u0015S\\Z{\u0012+[L\u001dp*/Gl\u0016\u001c\u00070Kj\u001f\n!.ebb\tw-\u001cCo*2\u001fctK\u000bw\t\u0018C\u0016?\u0011\u007fF\u007fH\u00117w@-D?#u~q\\)w\u000br~\u0019?\u0011\u001df^k)>6Y-@\u000bt\u001f\u0012L\u0017\u000e|O\u001c)]?2%\u0019._\"Lq\\-L>&%FoM@s.H\u007f\u0017xq.Ax&";
        objectArray[16] = "\f\u001e6R\u000e<\bZ1O`6Z\\oZ\f\u0004\u000e\u00187\u0000`o\f\u001ceT\u0019l\b]s=";
        objectArray[17] = "ms\u0001D.Xi/\u0014ANG9b\u0018Y\"uo#@\u0003q\"hr\u0007C)Yi$\tLN";
        objectArray[18] = "_|\u00001\u0013x[ \u00154sg\u000bm\u0019,\u001fU\\-BwN\u0002\\kG$\u000bn\u0003}\u0002\"s";
        Object[] objectArray2 = objectArray;
        objectArray[19] = "\u0016\u0005zP:\u0007\u0012YoUZ\u0018B\u0014cM6*\u0011Q<\u0010ZGUVlR6\u0018C\u0013j*";
    }

    public static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
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
                clazz3 = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(777416002113063L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(777416002113063L);
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
            int n = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field d(Class clazz, String string, Class clazz2) {
        Field field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string, clazz2);
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
        int n = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.e(l);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.c(clazz3, string2, clazz2)) != null) {
                    m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.f(777416002113063L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public class_243 m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(class_1321 class_13212) {
        block9: {
            try {
                block8: {
                    try {
                        try {
                            try {
                                if (m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("j", (Object)class_13212, (long)1352535750194961L) != false || m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("j", (Object)class_13212, (long)1271947379594166L) != false) break block8;
                            }
                            catch (class_151 class_1512) {
                                throw m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.a(class_1512);
                            }
                            if (m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724 != m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("j", (Object)class_13212, (long)1217893563101123L)) break block8;
                        }
                        catch (class_151 class_1513) {
                            throw m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.a(class_1513);
                        }
                        if (m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("j", (Object)class_13212, (Object)m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("j", (Object)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)964250689080585L), (long)1004623907981394L) == false) break block9;
                    }
                    catch (class_151 class_1514) {
                        throw m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.a(class_1514);
                    }
                }
                return null;
            }
            catch (class_151 class_1515) {
                throw m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.a(class_1515);
            }
        }
        m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("t", (Object)class_13212, (Object)class_1268.field_5808, (long)1075000410102051L);
        return m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("j", (Object)m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.b("j", (Object)class_13212, (long)874381893770986L), (long)1151208355366140L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$mcLaPPN1sSjTsTSi96gpGOrXMZYMPn8PwYSDkQ6llyqjJ2Y2Q505bzfff3UL9kT7mxIv9G0tGySltd9ZTpYVarJQProNgjM2k$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8$2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

