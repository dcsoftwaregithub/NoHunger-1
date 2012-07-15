package me.dcsoft.nohunger;

import java.util.logging.Logger;

import me.dcsoft.nohunger.commands.NoHungerReloadExecutor;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class NoHunger extends JavaPlugin {
	
	Logger log = Logger.getLogger("Minecraft");

	public void onEnable() {
		log.info(getFormattedMessage("is enabled"));
		this.getCommand("nhreload").setExecutor(new NoHungerReloadExecutor(this));
	}
	
	public void onDisable() {
		
	}
	
	public void reload() {
		setEnabled(false);
		setEnabled(true);	
	}
	
	private String getFormattedMessage(String msg) {
		
		PluginDescriptionFile pdf = this.getDescription();
			
		return "[" + pdf.getName() + " v" + pdf.getVersion() + "] " + msg;
		
	}

}
