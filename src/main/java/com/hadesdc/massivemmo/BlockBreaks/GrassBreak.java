package com.hadesdc.massivemmo.BlockBreaks;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class GrassBreak implements Listener {
    @EventHandler
    public void onGrassBreak (BlockBreakEvent e) {
        if(e.getPlayer().getInventory().getItemInMainHand() == null ) return;
        if (e.getBlock().getType() != Material.GRASS_BLOCK) return;
        e.setDropItems(false);
        e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GRASS_BLOCK));
    }
}
