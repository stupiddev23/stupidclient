/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc;

import com.jagrosh.discordipc.IPCClient;

class IPCClient.1
implements Runnable {
    public final /* synthetic */ IPCClient val$localInstance;

    public IPCClient.1(IPCClient iPCClient2) {
        this.val$localInstance = iPCClient2;
    }

    @Override
    public void run() {
        IPCClient.this.readPipe(this.val$localInstance);
    }
}
