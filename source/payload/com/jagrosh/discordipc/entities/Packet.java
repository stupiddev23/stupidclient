/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc.entities;

import com.google.gson.JsonObject;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class Packet {
    public final OpCode op;
    public final JsonObject data;
    public final String encoding;

    public Packet(OpCode opCode, JsonObject jsonObject, String string) {
        this.op = opCode;
        this.data = jsonObject;
        this.encoding = string;
    }

    @Deprecated
    public Packet(OpCode opCode, JsonObject jsonObject) {
        this(opCode, jsonObject, "UTF-8");
    }

    public byte[] toBytes() {
        byte[] byArray;
        String string = this.data.toString();
        try {
            byArray = string.getBytes(this.encoding);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            byArray = string.getBytes();
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(byArray.length + 8);
        byteBuffer.putInt(Integer.reverseBytes(this.op.ordinal()));
        byteBuffer.putInt(Integer.reverseBytes(byArray.length));
        byteBuffer.put(byArray);
        return byteBuffer.array();
    }

    public OpCode getOp() {
        return this.op;
    }

    public JsonObject getJson() {
        return this.data;
    }

    public String toString() {
        return "Pkt:" + (Object)((Object)this.getOp()) + this.getJson().toString();
    }

    public String toDecodedString() {
        try {
            return "Pkt:" + (Object)((Object)this.getOp()) + new String(this.getJson().toString().getBytes(this.encoding));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return "Pkt:" + (Object)((Object)this.getOp()) + this.getJson().toString();
        }
    }

    public static enum OpCode {
        HANDSHAKE,
        FRAME,
        CLOSE,
        PING,
        PONG;

    }
}

