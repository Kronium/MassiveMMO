package com.hadesdc.massivemmo.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Uru {
    public static ItemStack uru;

    public static void init() {
        createUru();
    }

    private static void createUru() {
        ItemStack uruItem = new ItemStack(Material.DIAMOND, 1);
        ItemMeta urumeta = uruItem.getItemMeta();
        urumeta.setDisplayName(ChatColor.DARK_PURPLE + "Uru");

        //LORE LORE LORE
        List<String> uruLore = new ArrayList<>();
        uruLore.add(ChatColor.DARK_GRAY + "Material worthy of");
        uruLore.add(ChatColor.DARK_GRAY + "Thors hammer itself!");
        uruLore.add(ChatColor.DARK_GRAY + "You can feel and see");
        uruLore.add(ChatColor.DARK_GRAY + "The magic flowing through");
        uruLore.add("");
        uruLore.add(ChatColor.LIGHT_PURPLE + "MYTHIC");
        urumeta.setLore(uruLore);

        //Assigning enchant and hiding it
        urumeta.addEnchant(Enchantment.LUCK, 1, false);
        urumeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        //Registering Item to make it exist
        uruItem.setItemMeta(urumeta);
        uru = uruItem;
    }
}
