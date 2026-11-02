/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc.entities;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class RichPresence {
    public final String state;
    public final String details;
    public final long startTimestamp;
    public final long endTimestamp;
    public final String largeImageKey;
    public final String largeImageText;
    public final String smallImageKey;
    public final String smallImageText;
    public final String partyId;
    public final int partySize;
    public final int partyMax;
    public final int partyPrivacy;
    public final String matchSecret;
    public final String joinSecret;
    public final String spectateSecret;
    public final JsonArray buttons;
    public final boolean instance;

    public RichPresence(String string, String string2, long l, long l2, String string3, String string4, String string5, String string6, String string7, int n, int n2, int n3, String string8, String string9, String string10, JsonArray jsonArray, boolean bl) {
        this.state = string;
        this.details = string2;
        this.startTimestamp = l;
        this.endTimestamp = l2;
        this.largeImageKey = string3;
        this.largeImageText = string4;
        this.smallImageKey = string5;
        this.smallImageText = string6;
        this.partyId = string7;
        this.partySize = n;
        this.partyMax = n2;
        this.partyPrivacy = n3;
        this.matchSecret = string8;
        this.joinSecret = string9;
        this.spectateSecret = string10;
        this.buttons = jsonArray;
        this.instance = bl;
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        JsonObject jsonObject3 = new JsonObject();
        JsonObject jsonObject4 = new JsonObject();
        JsonObject jsonObject5 = new JsonObject();
        if (this.startTimestamp > 0L) {
            jsonObject.addProperty("start", (Number)this.startTimestamp);
            if (this.endTimestamp > this.startTimestamp) {
                jsonObject.addProperty("end", (Number)this.endTimestamp);
            }
        }
        if (this.largeImageKey != null && !this.largeImageKey.isEmpty()) {
            jsonObject2.addProperty("large_image", this.largeImageKey);
            if (this.largeImageText != null && !this.largeImageText.isEmpty()) {
                jsonObject2.addProperty("large_text", this.largeImageText);
            }
        }
        if (this.smallImageKey != null && !this.smallImageKey.isEmpty()) {
            jsonObject2.addProperty("small_image", this.smallImageKey);
            if (this.smallImageText != null && !this.smallImageText.isEmpty()) {
                jsonObject2.addProperty("small_text", this.smallImageText);
            }
        }
        if (this.partyId != null && !this.partyId.isEmpty() || this.partySize > 0 && this.partyMax > 0 || this.partyPrivacy >= 0) {
            if (this.partyId != null && !this.partyId.isEmpty()) {
                jsonObject3.addProperty("id", this.partyId);
            }
            JsonArray jsonArray = new JsonArray();
            if (this.partySize > 0) {
                jsonArray.add((JsonElement)new JsonPrimitive((Number)this.partySize));
                if (this.partyMax >= this.partySize) {
                    jsonArray.add((JsonElement)new JsonPrimitive((Number)this.partyMax));
                }
            }
            jsonObject3.add("size", (JsonElement)jsonArray);
            if (this.partyPrivacy >= 0) {
                jsonObject3.add("privacy", (JsonElement)new JsonPrimitive((Number)this.partyPrivacy));
            }
        }
        if (this.joinSecret != null && !this.joinSecret.isEmpty()) {
            jsonObject4.addProperty("join", this.joinSecret);
        }
        if (this.spectateSecret != null && !this.spectateSecret.isEmpty()) {
            jsonObject4.addProperty("spectate", this.spectateSecret);
        }
        if (this.matchSecret != null && !this.matchSecret.isEmpty()) {
            jsonObject4.addProperty("match", this.matchSecret);
        }
        if (this.state != null && !this.state.isEmpty()) {
            jsonObject5.addProperty("state", this.state);
        }
        if (this.details != null && !this.details.isEmpty()) {
            jsonObject5.addProperty("details", this.details);
        }
        if (jsonObject.has("start")) {
            jsonObject5.add("timestamps", (JsonElement)jsonObject);
        }
        if (jsonObject2.has("large_image")) {
            jsonObject5.add("assets", (JsonElement)jsonObject2);
        }
        if (jsonObject3.has("id")) {
            jsonObject5.add("party", (JsonElement)jsonObject3);
        }
        if (jsonObject4.has("join") || jsonObject4.has("spectate") || jsonObject4.has("match")) {
            jsonObject5.add("secrets", (JsonElement)jsonObject4);
        }
        if (this.buttons != null && !this.buttons.isJsonNull() && this.buttons.size() > 0 && this.buttons.size() < 3) {
            jsonObject5.add("buttons", (JsonElement)this.buttons);
        }
        jsonObject5.addProperty("instance", Boolean.valueOf(this.instance));
        return jsonObject5;
    }

    public String toDecodedJson(String string) {
        try {
            return new String(this.toJson().toString().getBytes(string));
        }
        catch (Exception exception) {
            return this.toJson().toString();
        }
    }

    public static class Builder {
        public String state;
        public String details;
        public long startTimestamp;
        public long endTimestamp;
        public String largeImageKey;
        public String largeImageText;
        public String smallImageKey;
        public String smallImageText;
        public String partyId;
        public int partySize;
        public int partyMax;
        public int partyPrivacy;
        public String matchSecret;
        public String joinSecret;
        public String spectateSecret;
        public JsonArray buttons;
        public boolean instance;

        public RichPresence build() {
            return new RichPresence(this.state, this.details, this.startTimestamp, this.endTimestamp, this.largeImageKey, this.largeImageText, this.smallImageKey, this.smallImageText, this.partyId, this.partySize, this.partyMax, this.partyPrivacy, this.matchSecret, this.joinSecret, this.spectateSecret, this.buttons, this.instance);
        }

        public Builder setState(String string) {
            this.state = string;
            return this;
        }

        public Builder setDetails(String string) {
            this.details = string;
            return this;
        }

        public Builder setStartTimestamp(long l) {
            this.startTimestamp = l;
            return this;
        }

        public Builder setEndTimestamp(long l) {
            this.endTimestamp = l;
            return this;
        }

        public Builder setLargeImage(String string, String string2) {
            this.largeImageKey = string;
            this.largeImageText = string2;
            return this;
        }

        public Builder setLargeImage(String string) {
            return this.setLargeImage(string, null);
        }

        public Builder setSmallImage(String string, String string2) {
            this.smallImageKey = string;
            this.smallImageText = string2;
            return this;
        }

        public Builder setSmallImage(String string) {
            return this.setSmallImage(string, null);
        }

        public Builder setParty(String string, int n, int n2, int n3) {
            this.partyId = string;
            this.partySize = n;
            this.partyMax = n2;
            this.partyPrivacy = n3;
            return this;
        }

        public Builder setMatchSecret(String string) {
            this.matchSecret = string;
            return this;
        }

        public Builder setJoinSecret(String string) {
            this.joinSecret = string;
            return this;
        }

        public Builder setSpectateSecret(String string) {
            this.spectateSecret = string;
            return this;
        }

        public Builder setButtons(JsonArray jsonArray) {
            this.buttons = jsonArray;
            return this;
        }

        public Builder setInstance(boolean bl) {
            this.instance = bl;
            return this;
        }
    }
}

