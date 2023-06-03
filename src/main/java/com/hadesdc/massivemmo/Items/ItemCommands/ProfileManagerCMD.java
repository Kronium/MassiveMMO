package com.hadesdc.massivemmo.Items.ItemCommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ProfileManagerCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String str, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            player.getInventory().addItem(com.hadesdc.massivemmo.Items.ProfileManager.PM);
        }
        return false;
    }
}
