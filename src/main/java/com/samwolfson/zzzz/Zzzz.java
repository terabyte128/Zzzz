package main.java.com.samwolfson.zzzz;

import org.bukkit.plugin.java.JavaPlugin;

public class Zzzz extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
        getServer().getPluginManager().registerEvents(new BedListener(), this);
    }
}
