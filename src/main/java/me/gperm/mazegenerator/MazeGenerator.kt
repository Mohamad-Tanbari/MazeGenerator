package me.gperm.mazegenerator

import me.gperm.mazegenerator.commands.Test
import org.bukkit.plugin.java.JavaPlugin

class MazeGenerator : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        getCommand("test")?.setExecutor(Test())
        logger.info("Hello, World!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
