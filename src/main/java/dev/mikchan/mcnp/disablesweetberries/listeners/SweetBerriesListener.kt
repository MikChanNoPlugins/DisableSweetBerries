package dev.mikchan.mcnp.disablesweetberries.listeners

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageByBlockEvent
import org.bukkit.event.entity.FoodLevelChangeEvent

internal class SweetBerriesListener : Listener {
    @EventHandler
    fun onFoodLevelChange(event: FoodLevelChangeEvent) {
        if (event.item?.data?.itemType != Material.SWEET_BERRIES) return
        event.foodLevel = event.entity.foodLevel
    }

    @EventHandler
    fun onEntityDamageByBlock(event: EntityDamageByBlockEvent) {
        if (event.damager?.blockData?.material != Material.SWEET_BERRY_BUSH) return
        event.isCancelled = true
    }
}
