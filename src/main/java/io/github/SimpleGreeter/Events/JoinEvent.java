package io.github.SimpleGreeter.Events;

import io.github.SimpleGreeter.SimpleGreeter;
import org.bukkit.Bukkit;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;


public class JoinEvent implements Listener {
    private Plugin plugin = SimpleGreeter.getPlugin(SimpleGreeter.class);



    @EventHandler
    public void onJoin (PlayerJoinEvent event) {
        event.setJoinMessage(null);
        Player player = event.getPlayer();
        String joinmessage = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("JoinMessage").replace("{player}", player.getDisplayName()));
        Bukkit.broadcastMessage(joinmessage);

    }
}
