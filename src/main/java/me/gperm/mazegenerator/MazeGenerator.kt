package me.gperm.mazegenerator

import me.gperm.mazegenerator.commands.Test
import org.bukkit.plugin.java.JavaPlugin

class MazeGenerator : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("Hello, World!")

        getCommand("test")?.setExecutor(Test())
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
