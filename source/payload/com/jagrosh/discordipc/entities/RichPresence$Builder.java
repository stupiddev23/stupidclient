/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc.entities;

import com.google.gson.JsonArray;
import com.jagrosh.discordipc.entities.RichPresence;

public static class RichPresence.Builder {
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

    public RichPresence.Builder setState(String string) {
        this.state = string;
        return this;
    }

    public RichPresence.Builder setDetails(String string) {
        this.details = string;
        return this;
    }

    public RichPresence.Builder setStartTimestamp(long l) {
        this.startTimestamp = l;
        return this;
    }

    public RichPresence.Builder setEndTimestamp(long l) {
        this.endTimestamp = l;
        return this;
    }

    public RichPresence.Builder setLargeImage(String string, String string2) {
        this.largeImageKey = string;
        this.largeImageText = string2;
        return this;
    }

    public RichPresence.Builder setLargeImage(String string) {
        return this.setLargeImage(string, null);
    }

    public RichPresence.Builder setSmallImage(String string, String string2) {
        this.smallImageKey = string;
        this.smallImageText = string2;
        return this;
    }

    public RichPresence.Builder setSmallImage(String string) {
        return this.setSmallImage(string, null);
    }

    public RichPresence.Builder setParty(String string, int n, int n2, int n3) {
        this.partyId = string;
        this.partySize = n;
        this.partyMax = n2;
        this.partyPrivacy = n3;
        return this;
    }

    public RichPresence.Builder setMatchSecret(String string) {
        this.matchSecret = string;
        return this;
    }

    public RichPresence.Builder setJoinSecret(String string) {
        this.joinSecret = string;
        return this;
    }

    public RichPresence.Builder setSpectateSecret(String string) {
        this.spectateSecret = string;
        return this;
    }

    public RichPresence.Builder setButtons(JsonArray jsonArray) {
        this.buttons = jsonArray;
        return this;
    }

    public RichPresence.Builder setInstance(boolean bl) {
        this.instance = bl;
        return this;
    }
}
