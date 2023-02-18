package com.jessejes.github.hook

import com.jessejes.github.hook.listener.HookListener
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Hook : JavaPlugin() {

    override fun onEnable() {

        val pluginManager = Bukkit.getPluginManager()
        pluginManager.registerEvents(HookListener(), this)
    }
}