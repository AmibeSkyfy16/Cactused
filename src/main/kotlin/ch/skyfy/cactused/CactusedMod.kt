package ch.skyfy.cactused

import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

class CactusedMod : ModInitializer {

    companion object {
        private const val MOD_ID: String = "cactused"
        val LOGGER: Logger = LogManager.getLogger(CactusedMod::class.java)
    }

    override fun onInitialize() {}

}