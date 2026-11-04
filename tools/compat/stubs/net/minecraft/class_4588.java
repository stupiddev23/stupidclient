package net.minecraft;

/**
 * VertexConsumer, named by its intermediary id so the compat layer can mention
 * the type.  No members are declared: the real interface's vertex method has a
 * different intermediary id in 1.21.11, so MioGl looks it up reflectively by
 * signature instead of guessing a name that would fail to link.
 */
public interface class_4588 {
}
