package dev.mikchan.mcnp.disablesweetberries

import dev.mikchan.mcnp.disablesweetberries.listeners.SweetBerriesListener
import org.bstats.bukkit.Metrics
import org.bukkit.event.HandlerList
import org.bukkit.plugin.java.JavaPlugin

/**
 * The main plugin class.
 *
 * Basically, the entry point to the plugin.
 */
@Suppress("unused")
class DisableSweetBerriesPlugin : JavaPlugin() {
    companion object {
        private const val bStatsId = 15814
    }

    override fun onEnable() {
        server.pluginManager.registerEvents(SweetBerriesListener(), this)
        Metrics(this, bStatsId)
    }

    override fun onDisable() {
        HandlerList.unregisterAll(this)
    }
}
