/*
 * Decompiled with CFR 0.152.
 */
package com.jagrosh.discordipc.entities.pipe;

import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.entities.Callback;
import com.jagrosh.discordipc.entities.pipe.UnixPipe;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

public class MacPipe
extends UnixPipe {
    public MacPipe(IPCClient iPCClient, HashMap<String, Callback> hashMap, File file) {
        super(iPCClient, hashMap, file);
    }

    public void registerCommand(String string, String string2) {
        String string3 = System.getenv("HOME");
        if (string3 == null) {
            throw new RuntimeException("Unable to find user HOME directory");
        }
        String string4 = string3 + "/Library/Application Support/discord";
        if (!this.mkdir(string4)) {
            throw new RuntimeException("Failed to create directory '" + string4 + "'");
        }
        if (!this.mkdir(string4 = string4 + "/games")) {
            throw new RuntimeException("Failed to create directory '" + string4 + "'");
        }
        string4 = string4 + "/" + string + ".json";
        try (FileWriter fileWriter = new FileWriter(string4);){
            fileWriter.write("{\"command\": \"" + string2 + "\"}");
        }
        catch (Exception exception) {
            throw new RuntimeException("Failed to write fame info into '" + string4 + "'");
        }
    }

    public void registerUrl(String string) {
        throw new UnsupportedOperationException("MacOS URL registration is not supported at this time.");
    }

    @Override
    public void registerApp(String string, String string2) {
        try {
            if (string2 != null) {
                this.registerCommand(string, string2);
            } else {
                this.registerUrl(string);
            }
        }
        catch (Exception exception) {
            throw new RuntimeException("Failed to register " + (string2 == null ? "url" : "command"), exception);
        }
    }

    @Override
    public void registerSteamGame(String string, String string2) {
        this.registerApp(string, "steam://rungameid/" + string2);
    }
}

