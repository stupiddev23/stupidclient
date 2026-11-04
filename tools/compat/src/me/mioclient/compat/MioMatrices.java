package me.mioclient.compat;

import java.util.Map;
import java.util.WeakHashMap;
import net.minecraft.class_332;
import net.minecraft.class_4587;

/**
 * DrawContext.getMatrices() used to return the MatrixStack a GUI drew through.
 * 1.21.11 moved GUI drawing to a Matrix3x2fStack and the accessor now returns
 * that instead, so code compiled against the old signature throws
 * NoSuchMethodError on the first frame that draws a widget.
 *
 * <p>Every such call site is retargeted here. The returned MatrixStack is a
 * {@link MioMatrixStack} that mirrors its transformations into the context's
 * real Matrix3x2fStack, so the draws that follow actually move.
 */
public final class MioMatrices {
    private static final Map<class_332, MioMatrixStack> STACKS =
            new WeakHashMap<class_332, MioMatrixStack>();

    private MioMatrices() {
    }

    public static class_4587 get(class_332 context) {
        if (context == null) {
            throw new NullPointerException("context");
        }
        synchronized (STACKS) {
            MioMatrixStack stack = STACKS.get(context);
            if (stack == null) {
                stack = new MioMatrixStack(context);
                STACKS.put(context, stack);
            }
            stack.sync();
            return stack;
        }
    }
}
