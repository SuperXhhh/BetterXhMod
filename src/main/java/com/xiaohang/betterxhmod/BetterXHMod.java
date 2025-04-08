package com.xiaohang.betterxhmod;

import com.xiaohang.betterxhmod.blocks.ModBlocks;
import com.xiaohang.betterxhmod.item.ModItemGroups;
import com.xiaohang.betterxhmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.ItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterXHMod implements ModInitializer {
	public static final String MOD_ID = "betterxhmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.initialize();
		ModItemGroups.registerModItemGroups();

		ModBlocks.initialize();

		LOGGER.info("Hello Fabric world!");
	}
}