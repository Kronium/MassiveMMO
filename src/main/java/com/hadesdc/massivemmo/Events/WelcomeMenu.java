package com.hadesdc.massivemmo.Events;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class WelcomeMenu implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        //welcome message
        e.setJoinMessage(ChatColor.DARK_GRAY + "[+]" + ChatColor.BOLD + "Welcome " + ChatColor.RED + e.getPlayer().getDisplayName() + ChatColor.DARK_GRAY + " to MassiveMMO" );

        //titles
        e.getPlayer().sendTitle(ChatColor.DARK_RED + "Welcome", ChatColor.DARK_GREEN + "To MassiveMMO " + e.getPlayer().getDisplayName(), 20, 100, 20);

        //actionBar
        e.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§bWelcome to MassiveMMO"));

        //Tablist
        e.getPlayer().setPlayerListHeader(ChatColor.RED+ "MassiveMMO \n We bring the GRIND \n");
        e.getPlayer().setPlayerListFooter(ChatColor.RED + "\nCurrent Online Players\n");


    }
}
