package com.hadesdc.massivemmo.BlockBreaks;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class StoneBreak implements Listener {
    @EventHandler
    public void onStoneBreak (BlockBreakEvent e) {
        if(e.getPlayer().getInventory().getItemInMainHand() == null ) return;
        if (e.getBlock().getType() != Material.STONE) return;
        e.setDropItems(false);
        e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.COBBLESTONE));
    }
}
