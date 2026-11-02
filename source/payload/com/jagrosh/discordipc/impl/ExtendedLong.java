/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc.impl;

public class ExtendedLong {
    public static int hashCode(long l) {
        return (int)(l ^ l >>> 32);
    }
}

