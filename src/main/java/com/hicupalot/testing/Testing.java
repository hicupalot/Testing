package com.hicupalot.testing;

import Commands.Reload;
import Commands.calculator;
import org.bukkit.plugin.java.JavaPlugin;

public final class Testing extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("reload").setExecutor(new Reload());
        getCommand("calculator").setExecutor(new calculator());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
