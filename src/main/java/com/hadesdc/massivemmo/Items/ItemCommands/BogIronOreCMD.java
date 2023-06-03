package com.hadesdc.massivemmo.Items.ItemCommands;

import com.hadesdc.massivemmo.Items.BogIronOre;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BogIronOreCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            player.getInventory().addItem(BogIronOre.bogIronOre);
        }

        return false;
    }
}
