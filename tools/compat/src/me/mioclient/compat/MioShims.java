package me.mioclient.compat;

import org.spongepowered.asm.mixin.Mixin;

/**
 * Re-declares member names that mio looks up by string and 1.21.11 removed.
 *
 * mio resolves members with {@code Class.getDeclaredMethods()} on the exact
 * class it names, and the names live in an encrypted table, so a stale one
 * cannot be repaired by editing the jar's strings.  Mixin merges the method
 * below into the target class, which makes the lookup succeed again.
 *
 * The 1.21.11 replacement for Entity.getPos() is getSyncedPos() (method_43390);
 * the cast reaches it through the superclass because ClientPlayerEntity no
 * longer declares it, and a @Shadow for an inherited method would not validate.
 */
@Mixin(net.minecraft.class_746.class)
public abstract class MioShims {

    public net.minecraft.class_243 method_19538() {
        return ((net.minecraft.class_1297) (Object) this).method_43390();
    }
}
