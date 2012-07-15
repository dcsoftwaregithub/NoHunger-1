package me.dcsoft.nohunger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class NoHunger extends JavaPlugin {
	
	

	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	private String getFormattedMessage(String msg) {
		
		PluginDescriptionFile pdf = this.getDescription();
			
		return "[" + pdf.getName() + " v" + pdf.getVersion() + "] " + msg;
		
	}
}
