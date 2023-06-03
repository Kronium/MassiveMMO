package com.hadesdc.massivemmo.Events;

import org.bukkit.WeatherType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class NeverRain implements Listener {
    @EventHandler
    public void onRain(WeatherChangeEvent e) {
        e.setCancelled(true);
    }
}
