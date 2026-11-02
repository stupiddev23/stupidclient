/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc.entities;

public enum DiscordBuild {
    CANARY("//canary.discord.com/api"),
    PTB("//ptb.discord.com/api"),
    STABLE("//discord.com/api"),
    ANY;

    public final String endpoint;

    public DiscordBuild(String string2) {
        this.endpoint = string2;
    }

    public DiscordBuild() {
        this(null);
    }

    public static DiscordBuild from(int n) {
        for (DiscordBuild discordBuild : DiscordBuild.values()) {
            if (discordBuild.ordinal() != n) continue;
            return discordBuild;
        }
        return ANY;
    }

    public static DiscordBuild from(String string) {
        for (DiscordBuild discordBuild : DiscordBuild.values()) {
            if (discordBuild.endpoint == null || !discordBuild.endpoint.equals(string)) continue;
            return discordBuild;
        }
        return ANY;
    }
}

