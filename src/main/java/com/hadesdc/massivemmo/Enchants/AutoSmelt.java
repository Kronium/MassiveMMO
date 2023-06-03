package com.hadesdc.massivemmo.Enchants;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class AutoSmelt extends Enchantment implements Listener {
    public AutoSmelt() {
        super(NamespacedKey.minecraft("AutoSmelt"));
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {

        //checks if broken black would drop item
        if (!e.isDropItems()) return;
        //checks for tool in hand
        if (e.getPlayer().getInventory().getItemInMainHand() == null) return;
        //checks if it has auto smelt
        if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(this)) return;
        if (e.getBlock().getType() != Material.GOLD_ORE) return;

        //what it drops
        e.setDropItems(false);
        e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GOLD_INGOT));

    }

    @Override
    public String getName() {
        return "Auto Smelt";
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getStartLevel() {
        return 1;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        return EnchantmentTarget.TOOL;
    }

    @Override
    public boolean isTreasure() {
        return false;
    }

    @Override
    public boolean isCursed() {
        return false;
    }

    @Override
    public boolean conflictsWith(Enchantment enchantment) {
        return false;
    }

    @Override
    public boolean canEnchantItem(ItemStack itemStack) {
        return false;
    }
}
