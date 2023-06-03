package com.hadesdc.massivemmo.Blocks;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Dirt {
    public static ItemStack Dirt;

    public static void init() {
        createDirtBlock();

    }
    private static void createDirtBlock() {
        //setting of iron and name
        ItemStack dirtblock = new ItemStack(Material.DIRT, 1);
        ItemMeta dirtmeta = dirtblock.getItemMeta();
        dirtmeta.setDisplayName(ChatColor.YELLOW + "Dirt");

        //LORE LORE LORE
        List<String> dirtLore = new ArrayList<>();
        dirtLore.add(ChatColor.BOLD + "" + ChatColor.WHITE + "");
        dirtLore.add(ChatColor.BOLD + "" + ChatColor.WHITE + "COMMON");
        dirtmeta.setLore(dirtLore);

        //Assigning enchant and hiding it
        //bogmeta.addEnchant(Enchantment.LUCK, 1, false);
        //bogmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        //Registering Item to make it exist
        dirtblock.setItemMeta(dirtmeta);
        Dirt = dirtblock;
    }
}
