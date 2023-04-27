package me.gperm.mazegenerator

import org.bukkit.plugin.java.JavaPlugin

class MazeGenerator : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("Hello, World!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
