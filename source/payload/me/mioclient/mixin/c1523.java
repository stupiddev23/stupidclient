/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import java.io.FileInputStream;
import java.util.Optional;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V;
import me.mioclient.m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud;
import me.mioclient.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_2960;
import net.minecraft.class_3262;
import net.minecraft.class_3298;
import net.minecraft.class_6861;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Mixin(value={class_6861.class})
public class m$$a5eODVMQD2muwvTO43lZ1ucjZl4FhxrEJeevDjQD6VL7UhHsF8VVTUEVZ3pLqZMzxmOFfv70rlTc8265XS3zJfP9VIKWCCSbZ {
    private static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 365828559;

    @ModifyReturnValue(method={"getResource"}, at={@At(value="RETURN")})
    private Optional m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(Optional optional, @Local(argsOnly=true) class_2960 class_29602) {
        if (class_29602.method_12836().equals("mio-mount")) {
            return Optional.of(new class_3298((class_3262)new m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V(), () -> new FileInputStream(m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud.m$$dJRHlW2HKSnwTj3TMuuIfuHE1Fjk45tSF2PZfCUi5KhtXbEEYHvJf3JsC56nRF5QlgkEak3Gr2Ll3WzaExURuC4S3CWlC5SCS.resolve(class_29602.method_12832()).toFile())));
        }
        if (optional.isEmpty() && (class_29602.method_12836().equals("mio") || m$$a5eODVMQD2muwvTO43lZ1ucjZl4FhxrEJeevDjQD6VL7UhHsF8VVTUEVZ3pLqZMzxmOFfv70rlTc8265XS3zJfP9VIKWCCSbZ.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_29602)) && m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$N7Fuy59jlFJoEyUR5zFCDWMJx9PRCjnqpN1gaG8rYDZDTw1x7RtxzjXMa8GGy4p8yLZ2qzDtg0NWKT6zxXY2Dmx65cghVSHV8()) {
            String string = m$$a5eODVMQD2muwvTO43lZ1ucjZl4FhxrEJeevDjQD6VL7UhHsF8VVTUEVZ3pLqZMzxmOFfv70rlTc8265XS3zJfP9VIKWCCSbZ.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_29602) ? "minecraft" : "mio";
            return Optional.of(new class_3298((class_3262)new m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V(), () -> {
                Object[] objectArray = new Object[(0xC1F ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >> 16 & 0xFFFF)];
                objectArray[0] = string;
                objectArray[1] = class_29602.method_12832();
                return m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.class.getClassLoader().getResourceAsStream("assets/%s/%s".formatted(objectArray));
            }));
        }
        return optional;
    }

    private static boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2960 class_29602) {
        String string = class_29602.method_12832();
        return string.contains("/blur_mask.") || string.contains("/bloom.");
    }
}

