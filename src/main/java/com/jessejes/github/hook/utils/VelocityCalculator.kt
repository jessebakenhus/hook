package com.jessejes.github.hook.utils

import org.bukkit.Location
import org.bukkit.util.Vector

object VelocityCalculator {

    fun calculateHookVelocity(to: Location, from: Location, distance: Double): Vector {

        val x = (to.x - from.x) / distance * 4
        val y = 0.6
        val z = (to.z - from.z) / distance * 4

        return Vector(x, y, z)
    }
}