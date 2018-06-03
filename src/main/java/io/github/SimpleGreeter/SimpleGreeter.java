package io.github.SimpleGreeter;

import io.github.SimpleGreeter.Events.JoinEvent;
import io.github.SimpleGreeter.Events.LeaveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleGreeter extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("SimpleGreeter enabled!");
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        getServer().getPluginManager().registerEvents(new LeaveEvent(), this);
        loadConfig();
    }
    @Override
    public void onDisable() {
        getLogger().info("SimpleGreeter disabled!");
    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }
}
