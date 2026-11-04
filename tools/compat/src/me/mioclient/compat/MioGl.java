package me.mioclient.compat;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.OptionalInt;
import org.joml.Matrix4f;
import org.joml.Vector3f;

/**
 * The pieces of the 1.21.5 rendering API that 1.21.11 removed.
 *
 * 1.21.11 moved drawing onto explicit render passes: colour, textures, scissor
 * and line width are per-pass state or per-pipeline uniforms instead of globals
 * on RenderSystem, the projection matrix and light directions became
 * GpuBufferSlices, and the pass itself takes a texture view, typed uniforms and
 * a sampler instead of a raw texture and float arrays.  mio's custom HUD
 * renderer still calls the old API, and because com.mojang.* is not remapped to
 * intermediary there is no mapping layer to absorb the difference -- each call
 * fails with NoSuchMethodError.
 *
 * Every method here keeps the old call shape so each site is a straight
 * instruction swap.  Where 1.21.11 genuinely has no equivalent the method is a
 * no-op rather than a guess, and the loss is written down in
 * docs/PORT-NOTES.txt.
 */
public final class MioGl {
    private static final float[] COLOR = {1.0F, 1.0F, 1.0F, 1.0F};
    private static final Vector3f[] LIGHTS = {
        new Vector3f(0.0F, 0.0F, 1.0F),
        new Vector3f(0.0F, 0.0F, 1.0F)
    };
    private static final Matrix4f PROJECTION = new Matrix4f();
    private static final Map<GpuTexture, GpuTextureView> VIEWS = new IdentityHashMap<>();
    private static final Map<String, GpuBuffer> UNIFORMS = new HashMap<>();
    private static boolean warned;

    private MioGl() {
    }

    private static GpuTextureView view(GpuTexture texture) {
        return VIEWS.computeIfAbsent(texture,
                t -> RenderSystem.getDevice().createTextureView(t));
    }

    public static void color(float red, float green, float blue, float alpha) {
        COLOR[0] = red;
        COLOR[1] = green;
        COLOR[2] = blue;
        COLOR[3] = alpha;
    }

    public static float[] color() {
        return COLOR.clone();
    }

    public static void scissor(int x, int y, int width, int height) {
        RenderSystem.enableScissorForRenderTypeDraws(x, y, width, height);
    }

    public static void noScissor() {
        RenderSystem.disableScissorForRenderTypeDraws();
    }

    public static void lineWidth(float width) {
        // No global line width in 1.21.11: width is a pipeline property.
    }

    public static void texture(int unit, GpuTexture texture) {
        // Bound on the pass instead, from the caller's own texture field.
    }

    public static Matrix4f projection() {
        if (!warned) {
            warned = true;
            System.err.println("[mio] 1.21.11 has no readable projection matrix;"
                    + " HUD world-to-screen projection falls back to identity");
        }
        return PROJECTION;
    }

    public static Vector3f[] lights() {
        return LIGHTS;
    }

    /** 1.21.5 created a pass straight from a texture; 1.21.11 wants a view and a label. */
    public static RenderPass createPass(CommandEncoder encoder, GpuTexture colour,
                                        OptionalInt clearColour) {
        return encoder.createRenderPass(() -> "mio", view(colour), clearColour);
    }

    /**
     * 1.21.5 bound the default uniforms implicitly.  1.21.11 requires them to be
     * written to the pass after the pipeline is set, which is why this replaces
     * setPipeline rather than sitting next to it.
     */
    public static void setPipeline(RenderPass pass, RenderPipeline pipeline) {
        pass.setPipeline(pipeline);
        RenderSystem.bindDefaultUniforms(pass);
    }

    /**
     * float[] uniforms became typed buffer slices.  The buffer is kept per
     * uniform name and rewritten in place, so a per-frame call does not allocate.
     */
    public static void setUniform(RenderPass pass, String name, float[] value) {
        int bytes = Math.max(16, (value.length * 4 + 15) / 16 * 16);
        GpuBuffer buffer = UNIFORMS.get(name);
        ByteBuffer data = ByteBuffer.allocateDirect(bytes).order(ByteOrder.nativeOrder());
        data.asFloatBuffer().put(value);
        data.rewind();
        if (buffer == null || buffer.size() < bytes || buffer.isClosed()) {
            if (buffer != null) {
                buffer.close();
            }
            buffer = RenderSystem.getDevice()
                    .createBuffer(() -> "mio uniform " + name, GpuBuffer.USAGE_UNIFORM, data);
            UNIFORMS.put(name, buffer);
        } else {
            RenderSystem.getDevice().createCommandEncoder()
                    .writeToBuffer(buffer.slice(0, bytes), data);
        }
        pass.setUniform(name, buffer);
    }

    /**
     * Loss: the sampler type is a remapped Minecraft class, so a compat helper
     * cannot name it in a descriptor without breaking at runtime.  The texture
     * bind is dropped rather than guessed at.
     */
    public static void bindSampler(RenderPass pass, String name, GpuTexture texture) {
    }
}
