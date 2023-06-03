package com.hadesdc.massivemmo.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ProfileManager {

    public static ItemStack PM;

    public static void init() {
        createUru();
    }

    private static void createUru() {
        ItemStack PMItem = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta PMmeta = PMItem.getItemMeta();
        PMmeta.setDisplayName(ChatColor.GREEN + "ProfileManager");

        //LORE LORE LORE
        List<String> PMLore = new ArrayList<>();
        PMLore.add(ChatColor.DARK_GRAY + "Click me to view your profile information");
        PMLore.add("");
        PMLore.add(ChatColor.WHITE + "COMMON");
        PMmeta.setLore(PMLore);

        //Assigning enchant and hiding it
        PMmeta.addEnchant(Enchantment.LUCK, 1, false);
        PMmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        //Registering Item to make it exist
        PMItem.setItemMeta(PMmeta);
        PM = PMItem;
    }
}
