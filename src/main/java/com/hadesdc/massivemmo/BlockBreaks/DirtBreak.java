package com.hadesdc.massivemmo.BlockBreaks;

import com.hadesdc.massivemmo.Blocks.Dirt;
import com.hadesdc.massivemmo.Items.BogIronOre;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class DirtBreak implements Listener {
    @EventHandler
    public void onDirtBreak (BlockBreakEvent e) {
        if(e.getPlayer().getInventory().getItemInMainHand() == null ) return;
        if (e.getBlock().getType() != Material.DIRT) return;
        e.setDropItems(false);
        e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Dirt.Dirt));
    }
}
