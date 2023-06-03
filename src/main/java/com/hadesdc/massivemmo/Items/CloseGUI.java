package com.hadesdc.massivemmo.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class CloseGUI {
    public static ItemStack CL;

    public static void init() {
        createUru();
    }

    private static void createUru() {
        ItemStack CloseItem = new ItemStack(Material.BARRIER, 1);
        ItemMeta CLmeta = CloseItem.getItemMeta();
        CLmeta.setDisplayName(ChatColor.RED + "Close");
        CloseItem.setItemMeta(CLmeta);
        CL = CloseItem;
    }
}
