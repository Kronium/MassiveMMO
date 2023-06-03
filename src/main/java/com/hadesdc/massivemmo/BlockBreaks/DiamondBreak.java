package com.hadesdc.massivemmo.BlockBreaks;

import com.hadesdc.massivemmo.Items.BogIronOre;
import com.hadesdc.massivemmo.Items.Uru;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class DiamondBreak implements Listener {
    @EventHandler
    public void onDiamondBreak(BlockBreakEvent e) {
            //checking if the block will drop items
            //if (!e.isDropItems()) return;
            //checking if the block will drop block with tool
            if(e.getPlayer().getInventory().getItemInMainHand() == null ) return;
            if (e.getBlock().getType() != Material.DIAMOND_ORE) return;

            e.setDropItems(false);
            e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Uru.uru));


        }
}
