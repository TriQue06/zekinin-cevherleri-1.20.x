package net.trique.zekinincevherleri;

import net.fabricmc.api.ModInitializer;

import net.trique.zekinincevherleri.block.ZekininBlocks;
import net.trique.zekinincevherleri.item.ZekininItems;
import net.trique.zekinincevherleri.world.gen.ZekininWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZekininCevherleri implements ModInitializer {
	public static final String MOD_ID = "zekinincevherleri";
    public static final Logger LOGGER = LoggerFactory.getLogger("zekinincevherleri");

	@Override
	public void onInitialize() {
		ZekininBlocks.registerZekininBlocks();
		ZekininItems.registerZekininItems();
		ZekininWorldGeneration.generateZekininWorldGen();
		LOGGER.info("Zeki, nabiyon lan gevsek O_o");
	}
}