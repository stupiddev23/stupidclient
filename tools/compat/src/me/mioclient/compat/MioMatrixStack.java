package me.mioclient.compat;

import java.lang.ref.WeakReference;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix4f;

/**
 * A MatrixStack that also applies its transformations to the DrawContext's
 * Matrix3x2fStack -- the stack 1.21.11 actually draws through.
 *
 * <p>push/pop/translate/scale are mirrored into the 2D stack and kept in the
 * inherited matrix as well, so the ~80 call sites that read
 * peek().getPositionMatrix() still see the same transform. Rotation cannot be
 * represented in 2D; it only reaches the inherited matrix.
 */
public final class MioMatrixStack extends class_4587 {
    private final WeakReference<class_332> context;
    private int depth;

    MioMatrixStack(class_332 context) {
        this.context = new WeakReference<class_332>(context);
    }

    private Matrix3x2fStack gui() {
        class_332 context = this.context.get();
        if (context == null) {
            throw new IllegalStateException("DrawContext was collected");
        }
        return context.method_51448();
    }

    /** Copy the live 2D transform into the inherited matrix, at the base of the stack. */
    void sync() {
        if (depth != 0) {
            return;
        }
        Matrix3x2fStack gui = gui();
        Matrix4f position = method_23760().method_23761();
        position.identity();
        position.m00 = gui.m00;
        position.m01 = gui.m01;
        position.m10 = gui.m10;
        position.m11 = gui.m11;
        position.m30 = gui.m20;
        position.m31 = gui.m21;
    }

    @Override
    public void method_22903() {
        gui().pushMatrix();
        super.method_22903();
        depth++;
    }

    @Override
    public void method_22909() {
        gui().popMatrix();
        super.method_22909();
        if (depth > 0) {
            depth--;
        }
    }

    @Override
    public void method_46416(float x, float y, float z) {
        gui().translate(x, y);
        super.method_46416(x, y, z);
    }

    @Override
    public void method_22904(double x, double y, double z) {
        gui().translate((float) x, (float) y);
        super.method_22904(x, y, z);
    }

    @Override
    public void method_22905(float x, float y, float z) {
        gui().scale(x, y);
        super.method_22905(x, y, z);
    }
}
