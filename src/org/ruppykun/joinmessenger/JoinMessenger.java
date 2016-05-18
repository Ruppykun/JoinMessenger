package org.ruppykun.joinmessenger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class JoinMessenger extends JavaPlugin implements Listener
{
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
		getLogger().info("Enable");
	}
	@Override
	public void onDisable() {
		getLogger().info("Disable");

	}
	@EventHandler
	public void JoinMessages(PlayerJoinEvent event)
	{
			event.setJoinMessage("こんにちは!" + event.getPlayer().getName());
	}

}
