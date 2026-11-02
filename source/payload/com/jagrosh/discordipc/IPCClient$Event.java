/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc;

public static enum IPCClient.Event {
    NULL(false),
    READY(false),
    ERROR(false),
    ACTIVITY_JOIN(true),
    ACTIVITY_SPECTATE(true),
    ACTIVITY_JOIN_REQUEST(true),
    UNKNOWN(false);

    public final boolean subscribable;

    public IPCClient.Event(boolean bl) {
        this.subscribable = bl;
    }

    public static IPCClient.Event of(String string) {
        if (string == null) {
            return NULL;
        }
        for (IPCClient.Event event : IPCClient.Event.values()) {
            if (event == UNKNOWN || !event.name().equalsIgnoreCase(string)) continue;
            return event;
        }
        return UNKNOWN;
    }

    public boolean isSubscribable() {
        return this.subscribable;
    }
}
