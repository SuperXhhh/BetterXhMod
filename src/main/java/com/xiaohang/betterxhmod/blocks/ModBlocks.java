package com.xiaohang.betterxhmod.blocks;

import com.xiaohang.betterxhmod.BetterXHMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block XIAOHANG_BLOCK = register("xiaohang_block",Block::new,Block.Settings.create().requiresTool().strength(2.5f));

    private static Block register(String path, Function<AbstractBlock.Settings,Block> factory,AbstractBlock.Settings settings){
        final Identifier identifier = Identifier.of(BetterXHMod.MOD_ID,path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK,identifier);

        final Block block = Blocks.register(registryKey,factory,settings);
        Items.register(block);
        return block;
    }
    public static void initialize() {
        BetterXHMod.LOGGER.info("Yes!Hello!Blocks!");
    }
}
