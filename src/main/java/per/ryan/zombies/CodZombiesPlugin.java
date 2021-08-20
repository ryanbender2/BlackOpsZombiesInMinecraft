package per.ryan.zombies;

import org.bukkit.plugin.java.JavaPlugin;

public class CodZombiesPlugin extends JavaPlugin {
	
	/** Main Plugin */
    private static CodZombiesPlugin plugin;
    
    /** Game Handler Executor */
    private GameHandlerExecutor gameHandlerExecutor;
    
    @Override
    public void onEnable() {
        plugin = this;
        gameHandlerExecutor = new GameHandlerExecutor();
        getCommand("zombies").setExecutor(gameHandlerExecutor);
    }
    
    @Override
    public void onDisable() {
        gameHandlerExecutor.disable();
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
