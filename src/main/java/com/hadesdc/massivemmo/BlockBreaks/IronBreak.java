package com.hadesdc.massivemmo.BlockBreaks;

import com.hadesdc.massivemmo.Items.BogIronOre;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class IronBreak implements Listener {
    @EventHandler
    public void breakIron(BlockBreakEvent e) {
        //checking if the block will drop items
        //if (!e.isDropItems()) return;
        //checking if the block will drop block with tool
        if(e.getPlayer().getInventory().getItemInMainHand() == null ) return;
        if (e.getBlock().getType() != Material.IRON_ORE) return;

        e.setDropItems(false);
        e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(BogIronOre.bogIronOre));


    }
}
