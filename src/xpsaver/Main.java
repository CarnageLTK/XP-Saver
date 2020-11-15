package xpsaver;

import org.bukkit.ChatColor;
import xpsaver.commands.Commands;
import xpsaver.events.giveXP;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new giveXP(), this);
		System.out.println(ChatColor.GREEN + "[XP]: PLUGIN IS ENABLED");
		getCommand("givexp").setExecutor(new Commands());
	}

	@Override
	public void onDisable() {
		System.out.println(ChatColor.RED + "[XP]: PLUGIN IS DISABLED");
	}
}
