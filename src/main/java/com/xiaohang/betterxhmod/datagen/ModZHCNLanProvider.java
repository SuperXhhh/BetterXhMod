package com.xiaohang.betterxhmod.datagen;

import com.xiaohang.betterxhmod.blocks.ModBlocks;
import com.xiaohang.betterxhmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLanProvider extends FabricLanguageProvider {
    public ModZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput,"zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.XIAOHANG,"小行");

        translationBuilder.add(ModBlocks.XIAOHANG_BLOCK,"小行之块");

        translationBuilder.add("itemGroup.betterxh_group","更好的小行");
    }
}
