package com.hadesdc.massivemmo.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class BogIron {
    public static ItemStack bogIron;

    public static void init() {
        createBogIron();

    }
    private static void createBogIron() {
        //setting of iron and name
        ItemStack bogiron = new ItemStack(Material.IRON_INGOT, 1);
        ItemMeta bogmeta = bogiron.getItemMeta();
        bogmeta.setDisplayName(ChatColor.YELLOW + "Bog Iron");

        //LORE LORE LORE
        List<String> bogLore = new ArrayList<>();
        bogLore.add(ChatColor.DARK_GRAY + "Base iron to create");
        bogLore.add(ChatColor.DARK_GRAY + "many tools and weapons");
        bogLore.add("");
        bogLore.add(ChatColor.BOLD + "" + ChatColor.WHITE + "COMMON");
        bogmeta.setLore(bogLore);

        //Assigning enchant and hiding it
        //bogmeta.addEnchant(Enchantment.LUCK, 1, false);
        //bogmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        //Registering Item to make it exist
        bogiron.setItemMeta(bogmeta);
        bogIron = bogiron;
    }
}
