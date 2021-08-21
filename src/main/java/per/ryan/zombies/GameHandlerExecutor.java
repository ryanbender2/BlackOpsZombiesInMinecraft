package per.ryan.zombies;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import net.minecraft.world.level.World;
import per.ryan.zombies.entities.CodZombie;

/**
 * 
 * @author Ryan Bender
 */
public class GameHandlerExecutor implements CommandExecutor {

	private String helpTextCommandsList = "List of commands - start, stop, pause, utils";
	
    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] args) {
    	if (args.length == 0) {
    		String message = ChatColor.YELLOW + "Oh no! You didn't give me any argument!\n" + helpTextCommandsList;
    		cs.sendMessage(message);
    		return true;
    	}
    	
    	switch (args[0].toLowerCase()) {
		case "start":
			handleStart(args);
			return true;
		case "stop":
			handleStop(args);
			return true;
		case "pause":
			handlePause(args);
			return true;
		case "utils":
			Player p = (Player) cs;
			
			CodZombie zombie = new CodZombie(p.getLocation(), null);
			handleUtils(args);
			return true;
		default:
			cs.sendMessage(ChatColor.RED + String.format("Unknown command: %s\n%s", args[0], helpTextCommandsList));
			return true;
		}
    }
    
    private void handleStart(String[] args) {

	}
    
    private void handleStop(String[] args) {

	}
    
    private void handlePause(String[] args) {

	}
    
    private void handleUtils(String[] args) {
    	
	}
    
    /**
     * Disable or shutdown the game.
     * <p>This is run on disable of the plugin.
     */
    public void disable() {
    	
    }
    
}
