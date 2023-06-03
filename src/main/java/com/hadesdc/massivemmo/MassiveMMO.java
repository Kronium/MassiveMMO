package com.hadesdc.massivemmo;

import com.hadesdc.massivemmo.BlockBreaks.*;
import com.hadesdc.massivemmo.Blocks.Dirt;
import com.hadesdc.massivemmo.Events.WelcomeMenu;
import com.hadesdc.massivemmo.Events.NeverRain;
import com.hadesdc.massivemmo.Items.*;
import com.hadesdc.massivemmo.Items.ItemCommands.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;


public final class MassiveMMO extends JavaPlugin implements Listener {

    private BossBar bossBar;
    private BukkitTask task;

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("============================");
        System.out.println(" Loading MassiveMMO ONLINE! ");
        System.out.println("============================");

        // Event Loading

        Bukkit.getPluginManager().registerEvents(new NeverRain(), this);
        Bukkit.getPluginManager().registerEvents(this, this);
        Bukkit.getPluginManager().registerEvents(new WelcomeMenu(), this);


        //events for block breaking (custom drops)
        Bukkit.getPluginManager().registerEvents(new IronBreak(), this);
        Bukkit.getPluginManager().registerEvents(new DiamondBreak(), this);
        Bukkit.getPluginManager().registerEvents(new GrassBreak(),this);
        Bukkit.getPluginManager().registerEvents(new SnowBreak(),this);
        Bukkit.getPluginManager().registerEvents(new StoneBreak(),this);
        Bukkit.getPluginManager().registerEvents(new DirtBreak(),this);



        //Command Loading
        getCommand("BogIronOre").setExecutor(new BogIronOreCMD());
        getCommand("BogIron").setExecutor(new BogIronCMD());
        getCommand("Uru").setExecutor(new UruCMD());
        getCommand("Close").setExecutor(new CloseCMD());
        getCommand("ProfileManager").setExecutor(new ProfileManagerCMD());


        //registering items
        BogIronOre.init();
        BogIron.init();
        Uru.init();
        ProfileManager.init();
        CloseGUI.init();
        Dirt.init();

        //Item recipes
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this, "Admin_Sword"), new ItemStack(Material.DIAMOND_SWORD));

        //loading the boss bar and shiz
        bossBar = Bukkit.createBossBar(
                ChatColor.LIGHT_PURPLE + "Welcome to massiveMMO",
                BarColor.BLUE,
                BarStyle.SOLID);
        bossBar.setProgress(0.1);


        System.out.println("===========================");
        System.out.println("MassiveMMO FINISHED LOADING");
        System.out.println("===========================");
    }
    //Registering Enchants



    //boss bar continued
    @EventHandler
    public void pJoin(PlayerJoinEvent e) {
        bossBar.addPlayer(e.getPlayer());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
