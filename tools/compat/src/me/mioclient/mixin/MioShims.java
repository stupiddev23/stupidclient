package me.mioclient.mixin;

import org.spongepowered.asm.mixin.Mixin;

/**
 * Re-declares member names that mio looks up by string and 1.21.11 removed.
 *
 * mio resolves members with Class.getDeclaredMethods() on the exact class it
 * names, and those names live in an XOR-encrypted table, so a stale one cannot
 * be repaired by editing the jar's strings.  Mixin merges the method below into
 * the target, which makes the lookup succeed again.
 *
 * The 1.21.11 replacement for Entity.getPos() is getSyncedPos() (method_43390);
 * the cast reaches it through Entity because ClientPlayerEntity no longer
 * declares it and @Shadow does not validate against an inherited method.
 */
@Mixin(net.minecraft.class_746.class)
public abstract class MioShims {

    public net.minecraft.class_243 method_19538() {
        return ((net.minecraft.class_1297) (Object) this).method_43390();
    }
}
