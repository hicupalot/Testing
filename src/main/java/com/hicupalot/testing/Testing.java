package com.hicupalot.testing;

import Commands.Reload;
import org.bukkit.plugin.java.JavaPlugin;

public final class Testing extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveConfig();
        getCommand("reload").setExecutor(new Reload());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        this.saveDefaultConfig();
        // Plugin shutdown logic
    }
}
