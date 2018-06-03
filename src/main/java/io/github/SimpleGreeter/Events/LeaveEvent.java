package io.github.SimpleGreeter.Events;

import io.github.SimpleGreeter.SimpleGreeter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

public class LeaveEvent implements Listener {
    private Plugin plugin = SimpleGreeter.getPlugin(SimpleGreeter.class);
    @EventHandler
    public void onLeave (PlayerQuitEvent event) {
        event.setQuitMessage(null);
        Player player = event.getPlayer();
        String leaveMessage = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeaveMessage").replace("{player}", player.getDisplayName()));
        Bukkit.broadcastMessage(leaveMessage);
    }
}
