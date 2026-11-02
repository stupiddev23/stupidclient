/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc.entities.pipe;

import com.google.gson.JsonObject;
import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.entities.Callback;
import com.jagrosh.discordipc.entities.Packet;
import com.jagrosh.discordipc.entities.pipe.Pipe;
import com.jagrosh.discordipc.entities.pipe.PipeStatus;
import com.jagrosh.discordipc.impl.WinRegistry;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WindowsPipe
extends Pipe {
    public static final Logger LOGGER = LoggerFactory.getLogger(WindowsPipe.class);
    public static final Float javaSpec = Float.valueOf(Float.parseFloat(System.getProperty("java.specification.version")));
    public final int targetKey = -2147483647;
    public final long targetLongKey = -2147483647L;
    public RandomAccessFile file;

    public WindowsPipe(IPCClient iPCClient, HashMap<String, Callback> hashMap, File file) {
        super(iPCClient, hashMap);
        try {
            this.file = new RandomAccessFile(file, "rw");
        }
        catch (FileNotFoundException fileNotFoundException) {
            this.file = null;
        }
    }

    @Override
    public void write(byte[] byArray) {
        this.file.write(byArray);
    }

    @Override
    public Packet read() {
        while ((this.status == PipeStatus.CONNECTED || this.status == PipeStatus.CLOSING) && this.file.length() == 0L) {
            try {
                Thread.sleep(50L);
            }
            catch (InterruptedException interruptedException) {}
        }
        if (this.status == PipeStatus.DISCONNECTED) {
            throw new IOException("Disconnected!");
        }
        if (this.status == PipeStatus.CLOSED) {
            return new Packet(Packet.OpCode.CLOSE, null, this.ipcClient.getEncoding());
        }
        Packet.OpCode opCode = Packet.OpCode.values()[Integer.reverseBytes(this.file.readInt())];
        int n = Integer.reverseBytes(this.file.readInt());
        byte[] byArray = new byte[n];
        this.file.readFully(byArray);
        return this.receive(opCode, byArray);
    }

    @Override
    public void close() {
        if (this.ipcClient.isDebugMode()) {
            this.ipcClient.getCurrentLogger(LOGGER).info("[DEBUG] Closing IPC pipe...");
        }
        this.status = PipeStatus.CLOSING;
        this.send(Packet.OpCode.CLOSE, new JsonObject());
        this.status = PipeStatus.CLOSED;
        this.file.close();
    }

    @Override
    public void registerApp(String string, String string2) {
        String string3;
        String string4 = System.getProperty("java.home");
        File file = new File(string4.split(";")[0] + "/bin/java.exe");
        File file2 = new File(string4.split(";")[0] + "/bin/javaw.exe");
        String string5 = file.exists() ? file.getAbsolutePath() : (string3 = file2.exists() ? file2.getAbsolutePath() : null);
        if (string3 == null) {
            throw new RuntimeException("Unable to find java path");
        }
        String string6 = string2 != null ? string2 : string3;
        String string7 = "discord-" + string;
        String string8 = "URL:Run game " + string + " protocol";
        String string9 = "Software\\Classes\\" + string7;
        String string10 = string9 + "\\DefaultIcon";
        String string11 = string9 + "\\DefaultIcon";
        try {
            if (javaSpec.floatValue() >= 11.0f) {
                WinRegistry.createKey(-2147483647L, string9);
                WinRegistry.writeStringValue(-2147483647L, string9, "", string8);
                WinRegistry.writeStringValue(-2147483647L, string9, "URL Protocol", "\u0000");
                WinRegistry.createKey(-2147483647L, string10);
                WinRegistry.writeStringValue(-2147483647L, string10, "", string3);
                WinRegistry.createKey(-2147483647L, string11);
                WinRegistry.writeStringValue(-2147483647L, string11, "", string6);
            } else {
                WinRegistry.createKey(-2147483647, string9);
                WinRegistry.writeStringValue(-2147483647, string9, "", string8);
                WinRegistry.writeStringValue(-2147483647, string9, "URL Protocol", "\u0000");
                WinRegistry.createKey(-2147483647, string10);
                WinRegistry.writeStringValue(-2147483647, string10, "", string3);
                WinRegistry.createKey(-2147483647, string11);
                WinRegistry.writeStringValue(-2147483647, string11, "", string6);
            }
        }
        catch (Error | Exception throwable) {
            throw new RuntimeException("Unable to modify Discord registry keys", throwable);
        }
    }

    @Override
    public void registerSteamGame(String string, String string2) {
        try {
            String string3 = javaSpec.floatValue() >= 11.0f ? WinRegistry.readString(-2147483647L, "Software\\\\Valve\\\\Steam", "SteamExe") : WinRegistry.readString(-2147483647, "Software\\\\Valve\\\\Steam", "SteamExe");
            if (string3 == null) {
                throw new RuntimeException("Steam exe path not found");
            }
            string3 = string3.replaceAll("/", "\\");
            String string4 = "\"" + string3 + "\" steam://rungameid/" + string2;
            this.registerApp(string, string4);
        }
        catch (Exception exception) {
            throw new RuntimeException("Unable to register Steam game", exception);
        }
    }
}

