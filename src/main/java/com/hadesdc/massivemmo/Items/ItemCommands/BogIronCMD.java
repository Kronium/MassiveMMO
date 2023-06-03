package com.hadesdc.massivemmo.Items.ItemCommands;

import com.hadesdc.massivemmo.Items.BogIron;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BogIronCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            player.getInventory().addItem(BogIron.bogIron);
        }
        return false;
    }
}
