package per.ryan.zombies;

import org.bukkit.plugin.java.JavaPlugin;

public class CodZombiesPlugin extends JavaPlugin {
	
    private static CodZombiesPlugin plugin;
//    private GameHandler game;
    
    @Override
    public void onEnable() {
        plugin = this;
        getCommand("zombies").setExecutor(new GameHandler());
    }
    
    @Override
    public void onDisable() {
//        game.teardown();
    }
    
    /**
     * Get Cod Zombies plugin.
     * 
     * @return plugin
     */
    public static CodZombiesPlugin getPlugin() {
        return plugin;
    }
    
}
