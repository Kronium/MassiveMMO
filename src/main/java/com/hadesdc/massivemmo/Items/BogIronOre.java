package com.hadesdc.massivemmo.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class BogIronOre {
    public static ItemStack bogIronOre;

    public static void init() {
        createBogIronOre();

    }
    private static void createBogIronOre() {
        //setting of iron and name
        ItemStack bogironore = new ItemStack(Material.IRON_NUGGET, 1);
        ItemMeta bogoremeta = bogironore.getItemMeta();
        bogoremeta.setDisplayName(ChatColor.YELLOW + "Bog Iron Ore");

        //LORE LORE LORE
        List<String> bogLore = new ArrayList<>();
        bogLore.add(ChatColor.DARK_GRAY + "Base iron to create");
        bogLore.add(ChatColor.DARK_GRAY + "many tools and weapons");
        bogLore.add("");
        bogLore.add(ChatColor.BOLD + "" + ChatColor.WHITE + "COMMON");
        bogoremeta.setLore(bogLore);

        //Assigning enchant and hiding it
        bogoremeta.addEnchant(Enchantment.LUCK, 1, false);
        bogoremeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        //Registering Item to make it exist
        bogironore.setItemMeta(bogoremeta);
        bogIronOre = bogironore;
    }
}
