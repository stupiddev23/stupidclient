package me.mioclient.mixin;

import org.spongepowered.asm.mixin.Mixin;

/**
 * 1.21.11 removed RenderLayer's static layer getters (they moved to
 * RenderLayers), but mio was compiled against the 1.21.5 names and calls them
 * with invokestatic. Re-declaring the old names on RenderLayer keeps those call
 * sites resolvable; each forwards to the RenderLayers equivalent.
 *
 * Descriptors must match mio's call sites exactly, because resolution is by
 * name + descriptor.
 */
@Mixin(net.minecraft.class_1921.class)
public abstract class MioRenderShims {

    /** 1.21.5 RenderLayer.getGui() -> 1.21.11 RenderLayers.debugQuads(). */
    public static net.minecraft.class_1921 method_51784() {
        return net.minecraft.class_12249.method_76023();
    }

    /** 1.21.5 RenderLayer.getEntitySolid(Identifier) -> RenderLayers.entitySolid. */
    public static net.minecraft.class_1921 method_23572(net.minecraft.class_2960 id) {
        return net.minecraft.class_12249.method_75982(id);
    }

    /** 1.21.5 RenderLayer.getEntityTranslucent(Identifier) -> one-arg form is gone. */
    public static net.minecraft.class_1921 method_23580(net.minecraft.class_2960 id) {
        return net.minecraft.class_12249.method_75980(id, true);
    }
}
