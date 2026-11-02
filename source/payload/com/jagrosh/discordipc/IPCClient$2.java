/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc;

import com.jagrosh.discordipc.IPCClient;

static class IPCClient.2 {
    public static final /* synthetic */ int[] $SwitchMap$com$jagrosh$discordipc$IPCClient$Event;

    static {
        $SwitchMap$com$jagrosh$discordipc$IPCClient$Event = new int[IPCClient.Event.values().length];
        try {
            IPCClient.2.$SwitchMap$com$jagrosh$discordipc$IPCClient$Event[IPCClient.Event.NULL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IPCClient.2.$SwitchMap$com$jagrosh$discordipc$IPCClient$Event[IPCClient.Event.ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IPCClient.2.$SwitchMap$com$jagrosh$discordipc$IPCClient$Event[IPCClient.Event.ACTIVITY_JOIN.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IPCClient.2.$SwitchMap$com$jagrosh$discordipc$IPCClient$Event[IPCClient.Event.ACTIVITY_SPECTATE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IPCClient.2.$SwitchMap$com$jagrosh$discordipc$IPCClient$Event[IPCClient.Event.ACTIVITY_JOIN_REQUEST.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IPCClient.2.$SwitchMap$com$jagrosh$discordipc$IPCClient$Event[IPCClient.Event.UNKNOWN.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
