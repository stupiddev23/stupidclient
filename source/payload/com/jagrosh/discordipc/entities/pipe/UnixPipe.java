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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import org.newsclub.net.unix.AFInputStream;
import org.newsclub.net.unix.AFUNIXSocket;
import org.newsclub.net.unix.AFUNIXSocketAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnixPipe
extends Pipe {
    public static final Logger LOGGER = LoggerFactory.getLogger(UnixPipe.class);
    public final AFUNIXSocket socket = AFUNIXSocket.newInstance();

    public UnixPipe(IPCClient iPCClient, HashMap<String, Callback> hashMap, File file) {
        super(iPCClient, hashMap);
        this.socket.connect((SocketAddress)AFUNIXSocketAddress.of((File)file));
    }

    @Override
    public Packet read() {
        AFInputStream aFInputStream = this.socket.getInputStream();
        while ((this.status == PipeStatus.CONNECTED || this.status == PipeStatus.CLOSING) && aFInputStream.available() == 0) {
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
        byte[] byArray = new byte[8];
        int n = aFInputStream.read(byArray);
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        if (this.ipcClient.isDebugMode() && this.ipcClient.isVerboseLogging()) {
            this.ipcClient.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Read Byte Data: %s with result %s", new String(byArray), n));
        }
        Packet.OpCode opCode = Packet.OpCode.values()[Integer.reverseBytes(byteBuffer.getInt())];
        byArray = new byte[Integer.reverseBytes(byteBuffer.getInt())];
        int n2 = aFInputStream.read(byArray);
        if (this.ipcClient.isDebugMode() && this.ipcClient.isVerboseLogging()) {
            this.ipcClient.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Read Reversed Byte Data: %s with result %s", new String(byArray), n2));
        }
        return this.receive(opCode, byArray);
    }

    @Override
    public void write(byte[] byArray) {
        this.socket.getOutputStream().write(byArray);
    }

    @Override
    public void close() {
        if (this.ipcClient.isDebugMode()) {
            this.ipcClient.getCurrentLogger(LOGGER).info("[DEBUG] Closing IPC pipe...");
        }
        this.status = PipeStatus.CLOSING;
        this.send(Packet.OpCode.CLOSE, new JsonObject());
        this.status = PipeStatus.CLOSED;
        this.socket.close();
    }

    public boolean mkdir(String string) {
        File file = new File(string);
        return file.exists() && file.isDirectory() || file.mkdir();
    }

    @Override
    public void registerApp(String string, String string2) {
        Object object;
        String string3 = System.getenv("HOME");
        if (string3 == null) {
            throw new RuntimeException("Unable to find user HOME directory");
        }
        if (string2 == null) {
            try {
                string2 = Files.readSymbolicLink(Paths.get("/proc/self/exe", new String[0])).toString();
            }
            catch (Exception exception) {
                throw new RuntimeException("Unable to get current exe path from /proc/self/exe", exception);
            }
        }
        String string4 = "[Desktop Entry]\nName=Game " + string + "\nExec=" + string2 + " %%u\nType=Application\nNoDisplay=true\nCategories=Discord;Games;\nMimeType=x-scheme-handler/discord-" + string + ";\n";
        String string5 = "/discord-" + string + ".desktop";
        String string6 = string3 + "/.local";
        if (this.mkdir(string6)) {
            this.ipcClient.getCurrentLogger(LOGGER).warn("[DEBUG] Failed to create directory '" + string6 + "', may already exist");
        }
        if (this.mkdir(string6 = string6 + "/share")) {
            this.ipcClient.getCurrentLogger(LOGGER).warn("[DEBUG] Failed to create directory '" + string6 + "', may already exist");
        }
        if (this.mkdir(string6 = string6 + "/applications")) {
            this.ipcClient.getCurrentLogger(LOGGER).warn("[DEBUG] Failed to create directory '" + string6 + "', may already exist");
        }
        string6 = string6 + string5;
        try {
            object = new FileWriter(string6);
            try {
                ((Writer)object).write(string4);
            }
            finally {
                ((OutputStreamWriter)object).close();
            }
        }
        catch (Exception exception) {
            throw new RuntimeException("Failed to write desktop info into '" + string6 + "'");
        }
        object = "xdg-mime default discord-" + string + ".desktop x-scheme-handler/discord-" + string;
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(((String)object).split(" "));
            processBuilder.environment();
            int n = processBuilder.start().waitFor();
            if (n < 0) {
                throw new Exception("xdg-mime returned " + n);
            }
        }
        catch (Exception exception) {
            throw new RuntimeException("Failed to register mime handler", exception);
        }
    }

    @Override
    public void registerSteamGame(String string, String string2) {
        this.registerApp(string, "xdg-open steam://rungameid/" + string2);
    }
}

