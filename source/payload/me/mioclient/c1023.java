/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_1102;
import net.minecraft.class_1113;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_3419;
import net.minecraft.class_4228;
import net.minecraft.class_4237;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN
extends class_1102 {
    public InputStream m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String[] a;
    public static final String[] b;
    public static final long[] c;
    public static final Long[] d;
    public static final Object[] e;
    public static final String[] f;

    public m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(class_243 class_2432, InputStream inputStream) {
        super(class_2960.method_60655((String)(m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$N7Fuy59jlFJoEyUR5zFCDWMJx9PRCjnqpN1gaG8rYDZDTw1x7RtxzjXMa8GGy4p8yLZ2qzDtg0NWKT6zxXY2Dmx65cghVSHV8() ? m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(-32200, 10918) : m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(-32199, 32719)), (String)m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(-32195, 14444)), class_3419.field_15250, class_1113.method_43221());
        this.field_5439 = class_2432.field_1352;
        this.field_5450 = class_2432.field_1351;
        this.field_5449 = class_2432.field_1350;
        this.m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG = inputStream;
    }

    public m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(InputStream inputStream) {
        super(class_2960.method_60655((String)(m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$N7Fuy59jlFJoEyUR5zFCDWMJx9PRCjnqpN1gaG8rYDZDTw1x7RtxzjXMa8GGy4p8yLZ2qzDtg0NWKT6zxXY2Dmx65cghVSHV8() ? m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(-32196, 28752) : m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(-32194, -24282)), (String)m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(-32193, 16572)), class_3419.field_15250, class_1113.method_43221());
        this.m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG = inputStream;
        this.field_18936 = true;
        this.field_5439 = 0.0;
        this.field_5450 = 0.0;
        this.field_5449 = (double)m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a("K", (long)m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(17353, 2257911201356607458L), (long)588986660808986L);
    }

    /*
     * Exception decompiling
     */
    static {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: CONTINUE without a while class org.benf.cfr.reader.bytecode.analysis.parse.statement.AssignmentSimple
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getTargetStartBlock(GotoStatement.java:102)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getStructuredStatement(GotoStatement.java:116)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.getStructuredStatementPlaceHolder(Op03SimpleStatement.java:550)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:727)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(l);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field c(long l) {
        int n = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(l);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(clazz3, string2, clazz2)) != null) {
                    m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.b(412536617292722L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(l);
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
                clazz3 = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.b(412536617292722L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.b(412536617292722L);
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

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 't' || c == 'Y' || c == '\u00fc' || c == 'O') {
                field = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 't' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'K' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static int a(long l) {
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
            case 0 -> 42;
            case 1 -> 15;
            case 2 -> 48;
            case 3 -> 31;
            case 4 -> 58;
            case 5 -> 19;
            case 6 -> 18;
            case 7 -> 9;
            case 8 -> 40;
            case 9 -> 50;
            case 10 -> 43;
            case 11 -> 13;
            case 12 -> 4;
            case 13 -> 34;
            case 14 -> 25;
            case 15 -> 30;
            case 16 -> 33;
            case 17 -> 57;
            case 18 -> 47;
            case 19 -> 53;
            case 20 -> 29;
            case 21 -> 22;
            case 22 -> 28;
            case 23 -> 23;
            case 24 -> 1;
            case 25 -> 6;
            case 26 -> 12;
            case 27 -> 11;
            case 28 -> 5;
            case 29 -> 52;
            case 30 -> 55;
            case 31 -> 32;
            case 32 -> 8;
            case 33 -> 16;
            case 34 -> 49;
            case 35 -> 46;
            case 36 -> 44;
            case 37 -> 41;
            case 38 -> 36;
            case 39 -> 24;
            case 40 -> 45;
            case 41 -> 63;
            case 42 -> 3;
            case 43 -> 38;
            case 44 -> 14;
            case 45 -> 37;
            case 46 -> 60;
            case 47 -> 26;
            case 48 -> 2;
            case 49 -> 21;
            case 50 -> 39;
            case 51 -> 10;
            case 52 -> 56;
            case 53 -> 0;
            case 54 -> 61;
            case 55 -> 51;
            case 56 -> 17;
            case 57 -> 59;
            case 58 -> 20;
            case 59 -> 35;
            case 60 -> 27;
            case 61 -> 62;
            case 62 -> 7;
            default -> 54;
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
        m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.f[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "=Bp\u0003)\u000e6MaLC\r\"Aj\u0007";
        objectArray[1] = Long.TYPE;
        m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.f[1] = "java/lang/Long";
        objectArray[2] = Double.TYPE;
        m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.f[2] = "java/lang/Double";
        objectArray[3] = "av\f%\u0016A\u007f~\u0016j[[et\u000f6JQecT\u0007WY{{\u001f0YVgr<1LAyr";
        objectArray[4] = "Jp~4\u001e\u0005A\u007fo{d\u0001R~\u007f4R\u0005E";
        objectArray[5] = "X\u001fV\n]\u0012S\u0010GE<\u001cX\u001bC\u001f";
        objectArray[6] = "Fx:s\u007f\u0011Hq}{x\n\u0005p0:w/~ozVq/\u001fM!sC\u0010CuMya\fnoQD_\bc$PR\u007f)\u001bOfK\u007fM]V\"dp(\u0018WD,T\u001b\u001fN$D^8DJ'[}2~TpyW?yhd(A\u0016BSemD1J/vj{*N%lo\"\u000fC)eV{";
        objectArray[7] = Integer.TYPE;
        m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.f[7] = "java/lang/Integer";
        objectArray[8] = "T(+XH5\u0011(a<Sh\f(P]Kt6 V[Je\u000e*\u001a\u0005\u000eoT.}\fElQG#_Gt[+w\fJuj";
        objectArray[9] = "/<n^{6ca{[\u0014\u0019\"|!H,5QlP\u0004^vTjcErzpf[wR.iCQ\u0003n\u0000jqt}s\u0019S5t\u0000wxyP*\u0003)\u0003hbmyP+,f|[M\u0015smN{% RfV\u0005f>#fZBF\u0004Ua[ZE\fO_(^p\u0000Ap]Kn\u007fq6C9-~s3x^$5p6\u0011\u0004}%r=t\\n~#\r";
        objectArray[10] = "[bc_$\u0002\u001a<!@^\u0012\bdyW22\u001cy`@3|Z>#FoC\u000f`lS^F\u0006{x@ \u0007X9g:";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "AD\f=8m\u0000\u001aN\"Bx\u001cF\n</o\u0016O<%>n\u0001Nrdx#\u0010[\u001f;zc\u0016#H?<v\u0001]\ta~i{";
    }

    public static long a(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x2C2B) & Short.MAX_VALUE;
        if (d[n2] == null) {
            m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.d[n2] = c[n2] ^ l;
        }
        return d[n2];
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFF823C) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 169;
                case 1 -> 45;
                case 2 -> 127;
                case 3 -> 222;
                case 4 -> 16;
                case 5 -> 101;
                case 6 -> 98;
                case 7 -> 130;
                case 8 -> 36;
                case 9 -> 112;
                case 10 -> 119;
                case 11 -> 83;
                case 12 -> 79;
                case 13 -> 164;
                case 14 -> 91;
                case 15 -> 34;
                case 16 -> 142;
                case 17 -> 218;
                case 18 -> 226;
                case 19 -> 11;
                case 20 -> 66;
                case 21 -> 246;
                case 22 -> 198;
                case 23 -> 186;
                case 24 -> 23;
                case 25 -> 129;
                case 26 -> 118;
                case 27 -> 204;
                case 28 -> 170;
                case 29 -> 51;
                case 30 -> 78;
                case 31 -> 250;
                case 32 -> 128;
                case 33 -> 4;
                case 34 -> 234;
                case 35 -> 214;
                case 36 -> 211;
                case 37 -> 168;
                case 38 -> 236;
                case 39 -> 92;
                case 40 -> 96;
                case 41 -> 152;
                case 42 -> 187;
                case 43 -> 124;
                case 44 -> 125;
                case 45 -> 25;
                case 46 -> 248;
                case 47 -> 172;
                case 48 -> 12;
                case 49 -> 217;
                case 50 -> 71;
                case 51 -> 102;
                case 52 -> 121;
                case 53 -> 104;
                case 54 -> 166;
                case 55 -> 31;
                case 56 -> 120;
                case 57 -> 212;
                case 58 -> 63;
                case 59 -> 143;
                case 60 -> 184;
                case 61 -> 110;
                case 62 -> 108;
                case 63 -> 59;
                case 64 -> 48;
                case 65 -> 220;
                case 66 -> 158;
                case 67 -> 80;
                case 68 -> 224;
                case 69 -> 37;
                case 70 -> 177;
                case 71 -> 237;
                case 72 -> 114;
                case 73 -> 160;
                case 74 -> 180;
                case 75 -> 240;
                case 76 -> 46;
                case 77 -> 182;
                case 78 -> 54;
                case 79 -> 188;
                case 80 -> 67;
                case 81 -> 185;
                case 82 -> 239;
                case 83 -> 65;
                case 84 -> 197;
                case 85 -> 155;
                case 86 -> 247;
                case 87 -> 175;
                case 88 -> 122;
                case 89 -> 153;
                case 90 -> 135;
                case 91 -> 86;
                case 92 -> 28;
                case 93 -> 206;
                case 94 -> 29;
                case 95 -> 2;
                case 96 -> 44;
                case 97 -> 208;
                case 98 -> 73;
                case 99 -> 199;
                case 100 -> 47;
                case 101 -> 238;
                case 102 -> 39;
                case 103 -> 100;
                case 104 -> 3;
                case 105 -> 60;
                case 106 -> 49;
                case 107 -> 89;
                case 108 -> 33;
                case 109 -> 21;
                case 110 -> 229;
                case 111 -> 116;
                case 112 -> 150;
                case 113 -> 227;
                case 114 -> 69;
                case 115 -> 62;
                case 116 -> 81;
                case 117 -> 84;
                case 118 -> 178;
                case 119 -> 255;
                case 120 -> 19;
                case 121 -> 251;
                case 122 -> 52;
                case 123 -> 113;
                case 124 -> 109;
                case 125 -> 213;
                case 126 -> 68;
                case 127 -> 1;
                case 128 -> 148;
                case 129 -> 13;
                case 130 -> 146;
                case 131 -> 228;
                case 132 -> 235;
                case 133 -> 221;
                case 134 -> 149;
                case 135 -> 174;
                case 136 -> 161;
                case 137 -> 115;
                case 138 -> 147;
                case 139 -> 154;
                case 140 -> 76;
                case 141 -> 216;
                case 142 -> 97;
                case 143 -> 7;
                case 144 -> 194;
                case 145 -> 159;
                case 146 -> 99;
                case 147 -> 191;
                case 148 -> 38;
                case 149 -> 242;
                case 150 -> 134;
                case 151 -> 103;
                case 152 -> 200;
                case 153 -> 137;
                case 154 -> 173;
                case 155 -> 165;
                case 156 -> 205;
                case 157 -> 105;
                case 158 -> 138;
                case 159 -> 183;
                case 160 -> 123;
                case 161 -> 15;
                case 162 -> 232;
                case 163 -> 82;
                case 164 -> 85;
                case 165 -> 70;
                case 166 -> 6;
                case 167 -> 195;
                case 168 -> 55;
                case 169 -> 179;
                case 170 -> 249;
                case 171 -> 56;
                case 172 -> 14;
                case 173 -> 209;
                case 174 -> 176;
                case 175 -> 243;
                case 176 -> 202;
                case 177 -> 27;
                case 178 -> 201;
                case 179 -> 163;
                case 180 -> 58;
                case 181 -> 5;
                case 182 -> 107;
                case 183 -> 131;
                case 184 -> 156;
                case 185 -> 26;
                case 186 -> 20;
                case 187 -> 22;
                case 188 -> 77;
                case 189 -> 139;
                case 190 -> 10;
                case 191 -> 244;
                case 192 -> 17;
                case 193 -> 171;
                case 194 -> 87;
                case 195 -> 133;
                case 196 -> 196;
                case 197 -> 181;
                case 198 -> 233;
                case 199 -> 241;
                case 200 -> 253;
                case 201 -> 41;
                case 202 -> 192;
                case 203 -> 8;
                case 204 -> 157;
                case 205 -> 50;
                case 206 -> 231;
                case 207 -> 219;
                case 208 -> 9;
                case 209 -> 189;
                case 210 -> 223;
                case 211 -> 43;
                case 212 -> 210;
                case 213 -> 126;
                case 214 -> 94;
                case 215 -> 72;
                case 216 -> 254;
                case 217 -> 24;
                case 218 -> 106;
                case 219 -> 32;
                case 220 -> 225;
                case 221 -> 141;
                case 222 -> 42;
                case 223 -> 167;
                case 224 -> 57;
                case 225 -> 40;
                case 226 -> 75;
                case 227 -> 30;
                case 228 -> 252;
                case 229 -> 18;
                case 230 -> 144;
                case 231 -> 190;
                case 232 -> 88;
                case 233 -> 90;
                case 234 -> 35;
                case 235 -> 74;
                case 236 -> 93;
                case 237 -> 61;
                case 238 -> 207;
                case 239 -> 151;
                case 240 -> 203;
                case 241 -> 193;
                case 242 -> 162;
                case 243 -> 95;
                case 244 -> 230;
                case 245 -> 245;
                case 246 -> 136;
                case 247 -> 140;
                case 248 -> 117;
                case 249 -> 215;
                case 250 -> 111;
                case 251 -> 0;
                case 252 -> 132;
                case 253 -> 64;
                case 254 -> 53;
                default -> 145;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n7 = 0;
            while (n7 < cArray.length) {
                int n8 = n7 % 2;
                int n9 = n7;
                char[] cArray2 = cArray;
                char c = cArray[n9];
                if (n8 == 0) {
                    cArray2[n9] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                } else {
                    cArray2[n9] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                }
                ++n7;
            }
            m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    public static String m$$Nbrbol7dy7Buowo9xru9qy7AXULQLciuBT5EY3os1F9BtT18fNW05E3xdVOCXA1dXaY4rmpLpWguUygF3EVGfAP5eXMYL36yz(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{61, -126, -87, 58, 96, 56, 114, -125};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 8]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    public CompletableFuture getAudioStream(class_4237 class_42372, class_2960 class_29602, boolean bl) {
        try {
            return m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a("K", (Object)new class_4228(this.m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG), (long)793152520847699L);
        }
        catch (Exception exception) {
            return m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.a("K", (Object)exception, (long)760560130994690L);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

