/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc.impl;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.prefs.Preferences;
import net.lenni0451.reflect.Methods;

public class WinRegistry {
    public static final int HKEY_CURRENT_USER = -2147483647;
    public static final int HKEY_LOCAL_MACHINE = -2147483646;
    public static final int REG_SUCCESS = 0;
    public static final int KEY_ALL_ACCESS = 983103;
    public static final int KEY_READ = 131097;
    public static final Preferences userRoot = Preferences.userRoot();
    public static final Preferences systemRoot = Preferences.systemRoot();
    public static final Class<? extends Preferences> userClass = userRoot.getClass();
    public static final Method regOpenKey;
    public static final Method regCloseKey;
    public static final Method regQueryValueEx;
    public static final Method regEnumValue;
    public static final Method regQueryInfoKey;
    public static final Method regEnumKeyEx;
    public static final Method regCreateKeyEx;
    public static final Method regSetValueEx;
    public static final Method regDeleteKey;
    public static final Method regDeleteValue;
    public static final float javaSpec;

    public static String readString(int n, String string, String string2) {
        if (n == -2147483646) {
            return WinRegistry.readString(systemRoot, n, string, string2);
        }
        if (n == -2147483647) {
            return WinRegistry.readString(userRoot, n, string, string2);
        }
        throw new IllegalArgumentException("hkey=" + n);
    }

    public static String readString(long l, String string, String string2) {
        if (l == -2147483646L) {
            return WinRegistry.readString(systemRoot, l, string, string2);
        }
        if (l == -2147483647L) {
            return WinRegistry.readString(userRoot, l, string, string2);
        }
        throw new IllegalArgumentException("hkey=" + l);
    }

    public static Map<String, String> readStringValues(int n, String string) {
        if (n == -2147483646) {
            return WinRegistry.readStringValues(systemRoot, n, string);
        }
        if (n == -2147483647) {
            return WinRegistry.readStringValues(userRoot, n, string);
        }
        throw new IllegalArgumentException("hkey=" + n);
    }

    public static List<String> readStringSubKeys(int n, String string) {
        if (n == -2147483646) {
            return WinRegistry.readStringSubKeys(systemRoot, n, string);
        }
        if (n == -2147483647) {
            return WinRegistry.readStringSubKeys(userRoot, n, string);
        }
        throw new IllegalArgumentException("hkey=" + n);
    }

    public static void createKey(int n, String string) {
        int[] nArray;
        if (n == -2147483646) {
            nArray = WinRegistry.createKey(systemRoot, n, string);
            Methods.invoke((Object)systemRoot, (Method)regCloseKey, (Object[])new Object[]{nArray[0]});
        } else if (n == -2147483647) {
            nArray = WinRegistry.createKey(userRoot, n, string);
            Methods.invoke((Object)userRoot, (Method)regCloseKey, (Object[])new Object[]{nArray[0]});
        } else {
            throw new IllegalArgumentException("hkey=" + n);
        }
        if (nArray[1] != 0) {
            throw new IllegalArgumentException("rc=" + nArray[1] + "  key=" + string);
        }
    }

    public static void createKey(long l, String string) {
        long[] lArray;
        if (l == -2147483646L) {
            lArray = WinRegistry.createKey(systemRoot, l, string);
            Methods.invoke((Object)systemRoot, (Method)regCloseKey, (Object[])new Object[]{lArray[0]});
        } else if (l == -2147483647L) {
            lArray = WinRegistry.createKey(userRoot, l, string);
            Methods.invoke((Object)userRoot, (Method)regCloseKey, (Object[])new Object[]{lArray[0]});
        } else {
            throw new IllegalArgumentException("hkey=" + l);
        }
        if (lArray[1] != 0L) {
            throw new IllegalArgumentException("rc=" + lArray[1] + "  key=" + string);
        }
    }

    public static void writeStringValue(int n, String string, String string2, String string3) {
        if (n == -2147483646) {
            WinRegistry.writeStringValue(systemRoot, n, string, string2, string3);
        } else if (n == -2147483647) {
            WinRegistry.writeStringValue(userRoot, n, string, string2, string3);
        } else {
            throw new IllegalArgumentException("hkey=" + n);
        }
    }

    public static void writeStringValue(long l, String string, String string2, String string3) {
        if (l == -2147483646L) {
            WinRegistry.writeStringValue(systemRoot, l, string, string2, string3);
        } else if (l == -2147483647L) {
            WinRegistry.writeStringValue(userRoot, l, string, string2, string3);
        } else {
            throw new IllegalArgumentException("hkey=" + l);
        }
    }

    public static void deleteKey(int n, String string) {
        int n2 = -1;
        if (n == -2147483646) {
            n2 = WinRegistry.deleteKey(systemRoot, n, string);
        } else if (n == -2147483647) {
            n2 = WinRegistry.deleteKey(userRoot, n, string);
        }
        if (n2 != 0) {
            throw new IllegalArgumentException("rc=" + n2 + "  key=" + string);
        }
    }

    public static void deleteValue(int n, String string, String string2) {
        int n2 = -1;
        if (n == -2147483646) {
            n2 = WinRegistry.deleteValue(systemRoot, n, string, string2);
        } else if (n == -2147483647) {
            n2 = WinRegistry.deleteValue(userRoot, n, string, string2);
        }
        if (n2 != 0) {
            throw new IllegalArgumentException("rc=" + n2 + "  key=" + string + "  value=" + string2);
        }
    }

    public static int deleteValue(Preferences preferences, int n, String string, String string2) {
        int[] nArray = (int[])Methods.invoke((Object)preferences, (Method)regOpenKey, (Object[])new Object[]{n, WinRegistry.toCstr(string), 983103});
        if (nArray[1] != 0) {
            return nArray[1];
        }
        int n2 = (Integer)Methods.invoke((Object)preferences, (Method)regDeleteValue, (Object[])new Object[]{nArray[0], WinRegistry.toCstr(string2)});
        Methods.invoke((Object)preferences, (Method)regCloseKey, (Object[])new Object[]{nArray[0]});
        return n2;
    }

    public static int deleteKey(Preferences preferences, int n, String string) {
        return (Integer)Methods.invoke((Object)preferences, (Method)regDeleteKey, (Object[])new Object[]{n, WinRegistry.toCstr(string)});
    }

    public static String readString(Preferences preferences, int n, String string, String string2) {
        int[] nArray = (int[])Methods.invoke((Object)preferences, (Method)regOpenKey, (Object[])new Object[]{n, WinRegistry.toCstr(string), 131097});
        if (nArray[1] != 0) {
            return null;
        }
        byte[] byArray = (byte[])Methods.invoke((Object)preferences, (Method)regQueryValueEx, (Object[])new Object[]{nArray[0], WinRegistry.toCstr(string2)});
        Methods.invoke((Object)preferences, (Method)regCloseKey, (Object[])new Object[]{nArray[0]});
        return byArray != null ? new String(byArray).trim() : null;
    }

    public static String readString(Preferences preferences, long l, String string, String string2) {
        long[] lArray = (long[])Methods.invoke((Object)preferences, (Method)regOpenKey, (Object[])new Object[]{l, WinRegistry.toCstr(string), 131097});
        if (lArray[1] != 0L) {
            return null;
        }
        byte[] byArray = (byte[])Methods.invoke((Object)preferences, (Method)regQueryValueEx, (Object[])new Object[]{lArray[0], WinRegistry.toCstr(string2)});
        Methods.invoke((Object)preferences, (Method)regCloseKey, (Object[])new Object[]{lArray[0]});
        return byArray != null ? new String(byArray).trim() : null;
    }

    public static Map<String, String> readStringValues(Preferences preferences, int n, String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        int[] nArray = (int[])Methods.invoke((Object)preferences, (Method)regOpenKey, (Object[])new Object[]{n, WinRegistry.toCstr(string), 131097});
        if (nArray[1] != 0) {
            return null;
        }
        int[] nArray2 = (int[])Methods.invoke((Object)preferences, (Method)regQueryInfoKey, (Object[])new Object[]{nArray[0]});
        int n2 = nArray2[0];
        int n3 = nArray2[3];
        for (int i = 0; i < n2; ++i) {
            byte[] byArray = (byte[])Methods.invoke((Object)preferences, (Method)regEnumValue, (Object[])new Object[]{nArray[0], i, n3 + 1});
            String string2 = WinRegistry.readString(n, string, new String(byArray));
            hashMap.put(new String(byArray).trim(), string2);
        }
        Methods.invoke((Object)preferences, (Method)regCloseKey, (Object[])new Object[]{nArray[0]});
        return hashMap;
    }

    public static List<String> readStringSubKeys(Preferences preferences, int n, String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        int[] nArray = (int[])Methods.invoke((Object)preferences, (Method)regOpenKey, (Object[])new Object[]{n, WinRegistry.toCstr(string), 131097});
        if (nArray[1] != 0) {
            return null;
        }
        int[] nArray2 = (int[])Methods.invoke((Object)preferences, (Method)regQueryInfoKey, (Object[])new Object[]{nArray[0]});
        int n2 = nArray2[0];
        int n3 = nArray2[3];
        for (int i = 0; i < n2; ++i) {
            byte[] byArray = (byte[])Methods.invoke((Object)preferences, (Method)regEnumKeyEx, (Object[])new Object[]{nArray[0], i, n3 + 1});
            arrayList.add(new String(byArray).trim());
        }
        Methods.invoke((Object)preferences, (Method)regCloseKey, (Object[])new Object[]{nArray[0]});
        return arrayList;
    }

    public static int[] createKey(Preferences preferences, int n, String string) {
        return (int[])Methods.invoke((Object)preferences, (Method)regCreateKeyEx, (Object[])new Object[]{n, WinRegistry.toCstr(string)});
    }

    public static long[] createKey(Preferences preferences, long l, String string) {
        return (long[])Methods.invoke((Object)preferences, (Method)regCreateKeyEx, (Object[])new Object[]{l, WinRegistry.toCstr(string)});
    }

    public static void writeStringValue(Preferences preferences, int n, String string, String string2, String string3) {
        int[] nArray = (int[])Methods.invoke((Object)preferences, (Method)regOpenKey, (Object[])new Object[]{n, WinRegistry.toCstr(string), 983103});
        Methods.invoke((Object)preferences, (Method)regSetValueEx, (Object[])new Object[]{nArray[0], WinRegistry.toCstr(string2), WinRegistry.toCstr(string3)});
        Methods.invoke((Object)preferences, (Method)regCloseKey, (Object[])new Object[]{nArray[0]});
    }

    public static void writeStringValue(Preferences preferences, long l, String string, String string2, String string3) {
        long[] lArray = (long[])Methods.invoke((Object)preferences, (Method)regOpenKey, (Object[])new Object[]{l, WinRegistry.toCstr(string), 983103});
        Methods.invoke((Object)preferences, (Method)regSetValueEx, (Object[])new Object[]{lArray[0], WinRegistry.toCstr(string2), WinRegistry.toCstr(string3)});
        Methods.invoke((Object)preferences, (Method)regCloseKey, (Object[])new Object[]{lArray[0]});
    }

    public static byte[] toCstr(String string) {
        byte[] byArray = new byte[string.length() + 1];
        for (int i = 0; i < string.length(); ++i) {
            byArray[i] = (byte)string.charAt(i);
        }
        byArray[string.length()] = 0;
        return byArray;
    }

    static {
        try {
            javaSpec = Float.parseFloat(System.getProperty("java.specification.version"));
            regOpenKey = Methods.getDeclaredMethod(userClass, (String)"WindowsRegOpenKey", (Class[])new Class[]{javaSpec >= 11.0f ? Long.TYPE : Integer.TYPE, byte[].class, Integer.TYPE});
            regCloseKey = Methods.getDeclaredMethod(userClass, (String)"WindowsRegCloseKey", (Class[])new Class[]{javaSpec >= 11.0f ? Long.TYPE : Integer.TYPE});
            regQueryValueEx = Methods.getDeclaredMethod(userClass, (String)"WindowsRegQueryValueEx", (Class[])new Class[]{javaSpec >= 11.0f ? Long.TYPE : Integer.TYPE, byte[].class});
            regEnumValue = Methods.getDeclaredMethod(userClass, (String)"WindowsRegEnumValue", (Class[])new Class[]{javaSpec >= 11.0f ? Long.TYPE : Integer.TYPE, Integer.TYPE, Integer.TYPE});
            regQueryInfoKey = Methods.getDeclaredMethod(userClass, (String)"WindowsRegQueryInfoKey1", (Class[])new Class[]{javaSpec >= 11.0f ? Long.TYPE : Integer.TYPE});
            regEnumKeyEx = Methods.getDeclaredMethod(userClass, (String)"WindowsRegEnumKeyEx", (Class[])new Class[]{javaSpec >= 11.0f ? Long.TYPE : Integer.TYPE, Integer.TYPE, Integer.TYPE});
            regCreateKeyEx = Methods.getDeclaredMethod(userClass, (String)"WindowsRegCreateKeyEx", (Class[])new Class[]{javaSpec >= 11.0f ? Long.TYPE : Integer.TYPE, byte[].class});
            regSetValueEx = Methods.getDeclaredMethod(userClass, (String)"WindowsRegSetValueEx", (Class[])new Class[]{javaSpec >= 11.0f ? Long.TYPE : Integer.TYPE, byte[].class, byte[].class});
            regDeleteValue = Methods.getDeclaredMethod(userClass, (String)"WindowsRegDeleteValue", (Class[])new Class[]{javaSpec >= 11.0f ? Long.TYPE : Integer.TYPE, byte[].class});
            regDeleteKey = Methods.getDeclaredMethod(userClass, (String)"WindowsRegDeleteKey", (Class[])new Class[]{javaSpec >= 11.0f ? Long.TYPE : Integer.TYPE, byte[].class});
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}

