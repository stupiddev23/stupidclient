/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc.entities;

import com.jagrosh.discordipc.entities.Packet;
import com.jagrosh.discordipc.impl.DataConsumer;

public class Callback {
    public final DataConsumer<Packet> success;
    public final DataConsumer<String> failure;

    public Callback() {
        this(null, null);
    }

    public Callback(DataConsumer<Packet> dataConsumer) {
        this(dataConsumer, null);
    }

    public Callback(DataConsumer<Packet> dataConsumer, DataConsumer<String> dataConsumer2) {
        this.success = dataConsumer;
        this.failure = dataConsumer2;
    }

    public boolean isEmpty() {
        return this.success == null && this.failure == null;
    }

    public void succeed(Packet packet) {
        if (this.success != null) {
            this.success.accept(packet);
        }
    }

    public void fail(String string) {
        if (this.failure != null) {
            this.failure.accept(string);
        }
    }
}

