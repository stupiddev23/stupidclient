/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.jagrosh.discordipc.IPCListener;
import com.jagrosh.discordipc.entities.Callback;
import com.jagrosh.discordipc.entities.DiscordBuild;
import com.jagrosh.discordipc.entities.Packet;
import com.jagrosh.discordipc.entities.RichPresence;
import com.jagrosh.discordipc.entities.User;
import com.jagrosh.discordipc.entities.pipe.Pipe;
import com.jagrosh.discordipc.entities.pipe.PipeStatus;
import com.jagrosh.discordipc.impl.Backoff;
import java.io.Closeable;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class IPCClient
implements Closeable {
    public static final Logger LOGGER = LoggerFactory.getLogger(IPCClient.class);
    public final Backoff RECONNECT_TIME_MS = new Backoff(500L, 60000L);
    public final long clientId;
    public final boolean autoRegister;
    public final HashMap<String, Callback> callbacks = new HashMap();
    public final String applicationId;
    public final String optionalSteamId;
    public volatile Pipe pipe;
    public Logger forcedLogger = null;
    public IPCListener listener = null;
    public Thread readThread = null;
    public String encoding = "UTF-8";
    public long nextDelay = 0L;
    public boolean debugMode;
    public boolean verboseLogging;

    public IPCClient(long l, boolean bl, boolean bl2, boolean bl3, String string, String string2) {
        this.clientId = l;
        this.debugMode = bl;
        this.verboseLogging = bl2;
        this.applicationId = string;
        this.autoRegister = bl3;
        this.optionalSteamId = string2;
    }

    public IPCClient(long l, boolean bl, boolean bl2, boolean bl3, String string) {
        this(l, bl, bl2, bl3, string, null);
    }

    public IPCClient(long l, boolean bl, boolean bl2) {
        this(l, bl, bl2, false, null);
    }

    public IPCClient(long l, boolean bl, boolean bl2, String string, String string2) {
        this(l, bl, false, bl2, string, string2);
    }

    public IPCClient(long l, boolean bl, boolean bl2, String string) {
        this(l, bl, bl2, string, null);
    }

    public IPCClient(long l, boolean bl) {
        this(l, bl, false, null);
    }

    public IPCClient(long l, boolean bl, String string, String string2) {
        this(l, false, bl, string, string2);
    }

    public IPCClient(long l, boolean bl, String string) {
        this(l, bl, string, null);
    }

    public IPCClient(long l) {
        this(l, false, null);
    }

    public static int getPID() {
        String string = ManagementFactory.getRuntimeMXBean().getName();
        return Integer.parseInt(string.substring(0, string.indexOf(64)));
    }

    public Logger getCurrentLogger(Logger logger) {
        return this.forcedLogger != null ? this.forcedLogger : logger;
    }

    public void setForcedLogger(Logger logger) {
        this.forcedLogger = logger;
    }

    public void setListener(IPCListener iPCListener) {
        this.listener = iPCListener;
        if (this.pipe != null) {
            this.pipe.setListener(iPCListener);
        }
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getOptionalSteamId() {
        return this.optionalSteamId;
    }

    public boolean isAutoRegister() {
        return this.autoRegister;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public void setEncoding(String string) {
        this.encoding = string;
    }

    public long getClientID() {
        return this.clientId;
    }

    public boolean isDebugMode() {
        return this.debugMode;
    }

    public void setDebugMode(boolean bl) {
        this.debugMode = bl;
    }

    public boolean isVerboseLogging() {
        return this.verboseLogging;
    }

    public void setVerboseLogging(boolean bl) {
        this.verboseLogging = bl;
    }

    public void connect(DiscordBuild ... discordBuildArray) {
        long l;
        this.checkConnected(false);
        while ((l = this.nextDelay - System.currentTimeMillis()) > 0L) {
            if (this.debugMode) {
                this.getCurrentLogger(LOGGER).info("[DEBUG] Attempting connection in: " + l + "ms");
            }
            Thread.sleep(l);
        }
        this.callbacks.clear();
        this.pipe = null;
        try {
            this.pipe = Pipe.openPipe(this, this.clientId, this.callbacks, discordBuildArray);
        }
        catch (Exception exception) {
            this.updateReconnectTime();
            throw exception;
        }
        if (this.isAutoRegister()) {
            try {
                if (this.optionalSteamId != null && !this.optionalSteamId.isEmpty()) {
                    this.registerSteamGame(this.getApplicationId(), this.optionalSteamId);
                } else {
                    this.registerApp(this.getApplicationId(), null);
                }
            }
            catch (Error | Exception throwable) {
                if (this.debugMode) {
                    throwable.printStackTrace();
                }
                this.getCurrentLogger(LOGGER).error("Unable to register application, enable debug mode for trace...");
            }
        }
        if (this.debugMode) {
            this.getCurrentLogger(LOGGER).info("[DEBUG] Client is now connected and ready!");
        }
        if (this.listener != null) {
            this.listener.onReady(this);
            this.pipe.setListener(this.listener);
        }
        this.startReading();
    }

    public void sendRichPresence(RichPresence richPresence) {
        this.sendRichPresence(richPresence, null);
    }

    public void sendRichPresence(RichPresence richPresence, Callback callback) {
        this.checkConnected(true);
        if (this.debugMode) {
            this.getCurrentLogger(LOGGER).info("[DEBUG] Sending RichPresence to discord: " + (richPresence == null ? null : richPresence.toDecodedJson(this.encoding)));
        }
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject.addProperty("cmd", "SET_ACTIVITY");
        jsonObject2.addProperty("pid", (Number)IPCClient.getPID());
        jsonObject2.add("activity", (JsonElement)(richPresence == null ? new JsonObject() : richPresence.toJson()));
        jsonObject.add("args", (JsonElement)jsonObject2);
        this.pipe.send(Packet.OpCode.FRAME, jsonObject, callback);
    }

    public void registerSteamGame(String string, String string2) {
        if (this.pipe != null) {
            this.pipe.registerSteamGame(string, string2);
        }
    }

    public void registerApp(String string, String string2) {
        if (this.pipe != null) {
            this.pipe.registerApp(string, string2);
        }
    }

    public void subscribe(Event event) {
        this.subscribe(event, null);
    }

    public void subscribe(Event event, Callback callback) {
        this.checkConnected(true);
        if (!event.isSubscribable()) {
            throw new IllegalStateException("Cannot subscribe to " + (Object)((Object)event) + " event!");
        }
        if (this.debugMode) {
            this.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Subscribing to Event: %s", event.name()));
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("cmd", "SUBSCRIBE");
        jsonObject.addProperty("evt", event.name());
        this.pipe.send(Packet.OpCode.FRAME, jsonObject, callback);
    }

    public void respondToJoinRequest(User user, ApprovalMode approvalMode, Callback callback) {
        this.checkConnected(true);
        if (user != null) {
            if (this.debugMode) {
                this.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Sending response to %s as %s", user.getName(), approvalMode.name()));
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("cmd", approvalMode == ApprovalMode.ACCEPT ? "SEND_ACTIVITY_JOIN_INVITE" : "CLOSE_ACTIVITY_JOIN_REQUEST");
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("user_id", user.getId());
            jsonObject.add("args", (JsonElement)jsonObject2);
            this.pipe.send(Packet.OpCode.FRAME, jsonObject, callback);
        }
    }

    public void respondToJoinRequest(User user, ApprovalMode approvalMode) {
        this.respondToJoinRequest(user, approvalMode, null);
    }

    public PipeStatus getStatus() {
        if (this.pipe == null) {
            return PipeStatus.UNINITIALIZED;
        }
        return this.pipe.getStatus();
    }

    @Override
    public void close() {
        block2: {
            this.checkConnected(true);
            try {
                this.pipe.close();
            }
            catch (IOException iOException) {
                if (!this.debugMode) break block2;
                this.getCurrentLogger(LOGGER).info(String.format("[DEBUG] Failed to close pipe: %s", iOException));
            }
        }
    }

    public DiscordBuild getDiscordBuild() {
        if (this.pipe == null) {
            return null;
        }
        return this.pipe.getDiscordBuild();
    }

    public User getCurrentUser() {
        if (this.pipe == null) {
            return null;
        }
        return this.pipe.getCurrentUser();
    }

    public void checkConnected(boolean bl) {
        if (bl && this.getStatus() != PipeStatus.CONNECTED) {
            throw new IllegalStateException(String.format("IPCClient (ID: %d) is not connected!", this.clientId));
        }
        if (!bl && this.getStatus() == PipeStatus.CONNECTED) {
            throw new IllegalStateException(String.format("IPCClient (ID: %d) is already connected!", this.clientId));
        }
    }

    public void startReading() {
        final IPCClient iPCClient = this;
        this.readThread = new Thread(new Runnable(){

            @Override
            public void run() {
                IPCClient.this.readPipe(iPCClient);
            }
        }, "IPCClient-Reader");
        this.readThread.setDaemon(true);
        if (this.debugMode) {
            this.getCurrentLogger(LOGGER).info("[DEBUG] Starting IPCClient reading thread!");
        }
        this.readThread.start();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void readPipe(IPCClient var1_1) {
        try {
            while (true) lbl-1000:
            // 5 sources

            {
                if ((var2_2 = this.pipe.read()).getOp() == Packet.OpCode.CLOSE) {
                    this.pipe.setStatus(PipeStatus.DISCONNECTED);
                    if (this.listener == null) return;
                    this.listener.onClose(var1_1, var2_2.getJson());
                    return;
                }
                var3_4 = var2_2.getJson();
                if (var3_4 == null) continue;
                var4_5 = Event.of(var3_4.has("evt") != false && var3_4.get("evt").isJsonNull() == false ? var3_4.getAsJsonPrimitive("evt").getAsString() : null);
                var5_6 = var3_4.has("nonce") != false && var3_4.get("nonce").isJsonNull() == false ? var3_4.getAsJsonPrimitive("nonce").getAsString() : null;
                switch (2.$SwitchMap$com$jagrosh$discordipc$IPCClient$Event[var4_5.ordinal()]) {
                    case 1: {
                        if (var5_6 == null || !this.callbacks.containsKey(var5_6)) break;
                        this.callbacks.remove(var5_6).succeed(var2_2);
                        break;
                    }
                    case 2: {
                        if (var5_6 == null || !this.callbacks.containsKey(var5_6)) break;
                        this.callbacks.remove(var5_6).fail(var3_4.has("data") != false && var3_4.getAsJsonObject("data").has("message") != false ? var3_4.getAsJsonObject("data").getAsJsonObject("message").getAsString() : null);
                        break;
                    }
                    case 3: {
                        if (!this.debugMode) break;
                        this.getCurrentLogger(IPCClient.LOGGER).info("[DEBUG] Reading thread received a 'join' event.");
                        break;
                    }
                    case 4: {
                        if (!this.debugMode) break;
                        this.getCurrentLogger(IPCClient.LOGGER).info("[DEBUG] Reading thread received a 'spectate' event.");
                        break;
                    }
                    case 5: {
                        if (!this.debugMode) break;
                        this.getCurrentLogger(IPCClient.LOGGER).info("[DEBUG] Reading thread received a 'join request' event.");
                        break;
                    }
                    case 6: {
                        if (!this.debugMode) break;
                        this.getCurrentLogger(IPCClient.LOGGER).info("[DEBUG] Reading thread encountered an event with an unknown type: " + var3_4.getAsJsonPrimitive("evt").getAsString());
                        break;
                    }
                }
                if (this.listener == null || !var3_4.has("cmd") || !var3_4.getAsJsonPrimitive("cmd").getAsString().equals("DISPATCH")) continue;
                try {
                    var6_7 = var3_4.getAsJsonObject("data");
                    switch (2.$SwitchMap$com$jagrosh$discordipc$IPCClient$Event[Event.of(var3_4.getAsJsonPrimitive("evt").getAsString()).ordinal()]) {
                        case 3: {
                            this.listener.onActivityJoin(var1_1, var6_7.getAsJsonPrimitive("secret").getAsString());
                            break;
                        }
                        case 4: {
                            this.listener.onActivitySpectate(var1_1, var6_7.getAsJsonPrimitive("secret").getAsString());
                            break;
                        }
                        case 5: {
                            var7_9 = var6_7.getAsJsonObject("user");
                            var8_10 = new User(var7_9.getAsJsonPrimitive("username").getAsString(), var7_9.has("global_name") != false && var7_9.get("global_name").isJsonPrimitive() != false ? var7_9.getAsJsonPrimitive("global_name").getAsString() : null, var7_9.has("discriminator") != false && var7_9.get("discriminator").isJsonPrimitive() != false ? var7_9.getAsJsonPrimitive("discriminator").getAsString() : "0", Long.parseLong(var7_9.getAsJsonPrimitive("id").getAsString()), var7_9.has("avatar") != false && var7_9.get("avatar").isJsonPrimitive() != false ? var7_9.getAsJsonPrimitive("avatar").getAsString() : null);
                            this.listener.onActivityJoinRequest(var1_1, var6_7.has("secret") != false ? var6_7.getAsJsonObject("secret").getAsString() : null, var8_10);
                            break;
                        }
                    }
                }
                catch (Exception var6_8) {
                    this.getCurrentLogger(IPCClient.LOGGER).error(String.format("Exception when handling event: %s", new Object[]{var6_8}));
                    continue;
                }
                break;
            }
        }
        catch (JsonParseException | IOException var2_3) {
            this.getCurrentLogger(IPCClient.LOGGER).error(String.format("Reading thread encountered an Exception: %s", new Object[]{var2_3}));
            this.pipe.setStatus(PipeStatus.DISCONNECTED);
            if (this.listener == null) return;
            this.RECONNECT_TIME_MS.reset();
            this.updateReconnectTime();
            this.listener.onDisconnect(var1_1, var2_3);
        }
        ** GOTO lbl-1000
    }

    public void updateReconnectTime() {
        this.nextDelay = System.currentTimeMillis() + this.RECONNECT_TIME_MS.nextDelay();
    }

    public static enum Event {
        NULL(false),
        READY(false),
        ERROR(false),
        ACTIVITY_JOIN(true),
        ACTIVITY_SPECTATE(true),
        ACTIVITY_JOIN_REQUEST(true),
        UNKNOWN(false);

        public final boolean subscribable;

        public Event(boolean bl) {
            this.subscribable = bl;
        }

        public static Event of(String string) {
            if (string == null) {
                return NULL;
            }
            for (Event event : Event.values()) {
                if (event == UNKNOWN || !event.name().equalsIgnoreCase(string)) continue;
                return event;
            }
            return UNKNOWN;
        }

        public boolean isSubscribable() {
            return this.subscribable;
        }
    }

    public static enum ApprovalMode {
        ACCEPT,
        DENY;

    }
}

