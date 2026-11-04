package org.spongepowered.asm.mixin;
import java.lang.annotation.*;
/** Compile-time stand-in; the real annotation comes from Mixin at runtime. */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface Mixin { Class<?>[] value(); }
