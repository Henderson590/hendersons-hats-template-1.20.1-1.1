package net.henderson.hendersonhats;

import net.fabricmc.api.ModInitializer;

import net.henderson.hendersonhats.item.ModItemGroups;
import net.henderson.hendersonhats.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HendersonsHats implements ModInitializer {
	public static final String MOD_ID = "hendersonhats";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}