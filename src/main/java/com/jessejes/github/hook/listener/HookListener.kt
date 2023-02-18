package com.jessejes.github.hook.listener

import com.jessejes.github.hook.utils.VelocityCalculator.calculateHookVelocity
import org.bukkit.Effect
import org.bukkit.Sound
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerFishEvent

class HookListener : Listener {

    @EventHandler
    fun onFish(event: PlayerFishEvent) {

        val hook = event.hook
        val player = event.player

        if (event.state != PlayerFishEvent.State.IN_GROUND) return

        hook.world.playEffect(hook.location.add(0.0, 0.0, 0.0), Effect.ENDER_SIGNAL, 10)

        player.playSound(player.location, Sound.ENTITY_ENDER_DRAGON_FLAP, 10F, 10F)
        player.velocity = calculateHookVelocity(hook.location, player.location, 10.0)
    }
}