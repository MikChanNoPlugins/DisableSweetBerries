package dev.mikchan.mcnp.disablesweetberries

import dev.mikchan.mcnp.disablesweetberries.listeners.SweetBerriesListener
import org.bukkit.event.HandlerList
import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused")
class DisableSweetBerriesPlugin : JavaPlugin() {
    override fun onEnable() {
        server.pluginManager.registerEvents(SweetBerriesListener(), this)
    }

    override fun onDisable() {
        HandlerList.unregisterAll(this)
    }
}
