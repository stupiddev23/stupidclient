/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc.impl;

import java.util.Random;

public class Backoff {
    public final long minAmount;
    public final long maxAmount;
    public long current;
    public int fails;
    public final Random randGenerator;

    public Backoff(long l, long l2) {
        this.minAmount = l;
        this.maxAmount = l2;
        this.current = l;
        this.fails = 0;
        this.randGenerator = new Random();
    }

    public void reset() {
        this.fails = 0;
        this.current = this.minAmount;
    }

    public long nextDelay() {
        ++this.fails;
        double d = (double)this.current * 2.0 * this.rand01();
        this.current = Math.min(this.current + (long)d, this.maxAmount);
        return this.current;
    }

    public double rand01() {
        return this.randGenerator.nextDouble();
    }
}

