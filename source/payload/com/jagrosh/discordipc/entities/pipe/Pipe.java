/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc.entities.pipe;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.IPCListener;
import com.jagrosh.discordipc.entities.Callback;
import com.jagrosh.discordipc.entities.DiscordBuild;
import com.jagrosh.discordipc.entities.Packet;
import com.jagrosh.discordipc.entities.User;
import com.jagrosh.discordipc.entities.pipe.MacPipe;
import com.jagrosh.discordipc.entities.pipe.PipeStatus;
import com.jagrosh.discordipc.entities.pipe.UnixPipe;
import com.jagrosh.discordipc.entities.pipe.WindowsPipe;
import com.jagrosh.discordipc.exceptions.NoDiscordClientException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Pipe {
    public static final Logger LOGGER = LoggerFactory.getLogger(Pipe.class);
    public static final int VERSION = 1;
    public static final String[] unixPaths = new String[]{"XDG_RUNTIME_DIR", "TMPDIR", "TMP", "TEMP"};
    public static final String[] unixFolderPaths = new String[]{"/snap.discord", "/app/com.discordapp.Discord"};
    public final IPCClient ipcClient;
    public final HashMap<String, Callback> callbacks;
    public PipeStatus status = PipeStatus.CONNECTING;
    public IPCListener listener;
    public DiscordBuild build;
    public User currentUser;

    public Pipe(IPCClient iPCClient, HashMap<String, Callback> hashMap) {
        this.ipcClient = iPCClient;
        this.callbacks = hashMap;
    }

    public static Pipe openPipe(IPCClient iPCClient, long l, HashMap<String, Callback> hashMap, DiscordBuild ... discordBuildArray) {
        Object object;
        int n;
        if (discordBuildArray == null || discordBuildArray.length == 0) {
            discordBuildArray = new DiscordBuild[]{DiscordBuild.ANY};
        }
        Pipe pipe = null;
        Pipe[] pipeArray = new Pipe[DiscordBuild.values().length];
        for (n = 0; n < 10; ++n) {
            object = Pipe.getPipeLocation(n);
            if (iPCClient.isDebugMode()) {
                iPCClient.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Searching for IPC Pipe: \"%s\"", object));
            }
            try {
                File file = new File((String)object);
                if (file.exists()) {
                    if (iPCClient.isDebugMode()) {
                        iPCClient.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Found valid file, attempting connection to IPC: \"%s\"", object));
                    }
                    if ((pipe = Pipe.createPipe(iPCClient, hashMap, file)) == null) continue;
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("v", (Number)1);
                    jsonObject.addProperty("client_id", Long.toString(l));
                    pipe.send(Packet.OpCode.HANDSHAKE, jsonObject);
                    Packet packet = pipe.read();
                    JsonObject jsonObject2 = packet.getJson();
                    JsonObject jsonObject3 = jsonObject2.getAsJsonObject("data");
                    JsonObject jsonObject4 = jsonObject3.getAsJsonObject("user");
                    pipe.build = DiscordBuild.from(jsonObject3.getAsJsonObject("config").get("api_endpoint").getAsString());
                    pipe.currentUser = new User(jsonObject4.getAsJsonPrimitive("username").getAsString(), jsonObject4.has("global_name") && jsonObject4.get("global_name").isJsonPrimitive() ? jsonObject4.getAsJsonPrimitive("global_name").getAsString() : null, jsonObject4.has("discriminator") && jsonObject4.get("discriminator").isJsonPrimitive() ? jsonObject4.getAsJsonPrimitive("discriminator").getAsString() : "0", Long.parseLong(jsonObject4.getAsJsonPrimitive("id").getAsString()), jsonObject4.has("avatar") && jsonObject4.get("avatar").isJsonPrimitive() ? jsonObject4.getAsJsonPrimitive("avatar").getAsString() : null);
                    if (iPCClient.isDebugMode()) {
                        iPCClient.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Found a valid client (%s) with packet: %s", pipe.build.name(), packet));
                        iPCClient.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Found a valid user (%s) with id: %s", pipe.currentUser.getName(), pipe.currentUser.getId()));
                    }
                    if (pipe.build == discordBuildArray[0] || DiscordBuild.ANY == discordBuildArray[0]) {
                        if (!iPCClient.isDebugMode()) break;
                        iPCClient.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Found preferred client: %s", pipe.build.name()));
                        break;
                    }
                    pipeArray[pipe.build.ordinal()] = pipe;
                    pipeArray[DiscordBuild.ANY.ordinal()] = pipe;
                    pipe.build = null;
                    pipe = null;
                    continue;
                }
                if (!iPCClient.isDebugMode()) continue;
                iPCClient.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Unable to locate IPC Pipe: \"%s\"", object));
                continue;
            }
            catch (JsonParseException | IOException throwable) {
                pipe = null;
            }
        }
        if (pipe == null) {
            for (n = 1; n < discordBuildArray.length; ++n) {
                object = discordBuildArray[n];
                if (iPCClient.isDebugMode()) {
                    iPCClient.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Looking for client build: %s", ((Enum)object).name()));
                }
                if (pipeArray[((Enum)object).ordinal()] == null) continue;
                pipe = pipeArray[((Enum)object).ordinal()];
                pipeArray[((Enum)object).ordinal()] = null;
                if (object == DiscordBuild.ANY) {
                    for (int i = 0; i < pipeArray.length; ++i) {
                        if (pipeArray[i] != pipe) continue;
                        pipe.build = DiscordBuild.values()[i];
                        pipeArray[i] = null;
                    }
                } else {
                    pipe.build = object;
                }
                if (!iPCClient.isDebugMode()) break;
                iPCClient.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Found preferred client: %s", pipe.build.name()));
                break;
            }
            if (pipe == null) {
                throw new NoDiscordClientException();
            }
        }
        for (n = 0; n < pipeArray.length; ++n) {
            if (n == DiscordBuild.ANY.ordinal() || pipeArray[n] == null) continue;
            try {
                pipeArray[n].close();
                continue;
            }
            catch (IOException iOException) {
                if (!iPCClient.isDebugMode()) continue;
                iPCClient.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Failed to close an open IPC pipe: %s", iOException));
            }
        }
        pipe.status = PipeStatus.CONNECTED;
        return pipe;
    }

    public static Pipe createPipe(IPCClient iPCClient, HashMap<String, Callback> hashMap, File file) {
        String string = System.getProperty("os.name").toLowerCase();
        if (string.contains("win")) {
            return new WindowsPipe(iPCClient, hashMap, file);
        }
        if (string.contains("linux") || string.contains("mac")) {
            try {
                return string.contains("mac") ? new MacPipe(iPCClient, hashMap, file) : new UnixPipe(iPCClient, hashMap, file);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        throw new RuntimeException("Unsupported OS: " + string);
    }

    public static String generateNonce() {
        return UUID.randomUUID().toString();
    }

    public static String getPipeLocation(int n) {
        String string4;
        String string2 = null;
        String string3 = "discord-ipc-" + n;
        if (System.getProperty("os.name").contains("Win")) {
            return "\\\\?\\pipe\\" + string3;
        }
        String[] stringArray = unixPaths;
        int n2 = stringArray.length;
        for (int i = 0; i < n2 && (string2 = System.getenv(string4 = stringArray[i])) == null; ++i) {
        }
        if (string2 == null) {
            string2 = "/tmp";
        }
        for (String string4 : unixFolderPaths) {
            String string5 = string2 + string4;
            File file = new File(string5);
            if (!file.exists() || !file.isDirectory() || file.list().length <= 0) continue;
            string2 = string5;
            break;
        }
        return string2 + "/" + string3;
    }

    public void send(Packet.OpCode opCode, JsonObject jsonObject, Callback callback) {
        try {
            String string = Pipe.generateNonce();
            jsonObject.addProperty("nonce", string);
            Packet packet = new Packet(opCode, jsonObject, this.ipcClient.getEncoding());
            if (callback != null && !callback.isEmpty()) {
                this.callbacks.put(string, callback);
            }
            this.write(packet.toBytes());
            if (this.ipcClient.isDebugMode()) {
                this.ipcClient.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Sent packet: %s", packet.toDecodedString()));
            }
            if (this.listener != null) {
                this.listener.onPacketSent(this.ipcClient, packet);
            }
        }
        catch (IOException iOException) {
            this.ipcClient.getCurrentLogger(LOGGER).error("Encountered an IOException while sending a packet and disconnected!");
            this.status = PipeStatus.DISCONNECTED;
        }
    }

    public void send(Packet.OpCode opCode, JsonObject jsonObject) {
        this.send(opCode, jsonObject, null);
    }

    public Packet receive(Packet.OpCode opCode, byte[] byArray) {
        JsonObject jsonObject = new JsonParser().parse(new String(byArray)).getAsJsonObject();
        Packet packet = new Packet(opCode, jsonObject, this.ipcClient.getEncoding());
        if (this.ipcClient.isDebugMode()) {
            this.ipcClient.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Received packet: %s", packet));
        }
        if (this.listener != null) {
            this.listener.onPacketReceived(this.ipcClient, packet);
        }
        return packet;
    }

    public abstract Packet read();

    public abstract void write(byte[] var1);

    public abstract void registerApp(String var1, String var2);

    public abstract void registerSteamGame(String var1, String var2);

    public PipeStatus getStatus() {
        return this.status;
    }

    public void setStatus(PipeStatus pipeStatus) {
        this.status = pipeStatus;
    }

    public void setListener(IPCListener iPCListener) {
        this.listener = iPCListener;
    }

    public abstract void close();

    public DiscordBuild getDiscordBuild() {
        return this.build;
    }

    public User getCurrentUser() {
        return this.currentUser;
    }
}

