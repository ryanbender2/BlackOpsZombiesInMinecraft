package per.ryan.zombies.entities;


import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.Level;

public class CodZombie extends Zombie {

	public CodZombie(Location location, World world) {
		super(level)
		
		this.setPos(location.getX(), location.getY(), location.getZ());
	}

}
