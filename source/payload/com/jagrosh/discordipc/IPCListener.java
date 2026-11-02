/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc;

import com.google.gson.JsonObject;
import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.entities.Packet;
import com.jagrosh.discordipc.entities.User;

public interface IPCListener {
    public void onPacketSent(IPCClient var1, Packet var2);

    public void onPacketReceived(IPCClient var1, Packet var2);

    public void onActivityJoin(IPCClient var1, String var2);

    public void onActivitySpectate(IPCClient var1, String var2);

    public void onActivityJoinRequest(IPCClient var1, String var2, User var3);

    public void onReady(IPCClient var1);

    public void onClose(IPCClient var1, JsonObject var2);

    public void onDisconnect(IPCClient var1, Throwable var2);
}

