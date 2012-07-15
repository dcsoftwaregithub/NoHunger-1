package me.dcsoft.nohunger.commands;

import me.dcsoft.nohunger.NoHunger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class NoHungerReloadExecutor implements CommandExecutor{

	NoHunger plugin;
	
	public NoHungerReloadExecutor(NoHunger instance) {
		this.plugin = instance;
	}
	
	
	public boolean onCommand(CommandSender sender, Command command, String label,
			String[] args) {
			plugin.reload();
			Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "NoHunger reloaded");
			return true;
	}

}
