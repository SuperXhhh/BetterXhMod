package com.xiaohang.betterxhmod.datagen;

import com.xiaohang.betterxhmod.blocks.ModBlocks;
import com.xiaohang.betterxhmod.item.ModItemGroups;
import com.xiaohang.betterxhmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput,"en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.XIAOHANG,"XiaoHang");

        translationBuilder.add(ModBlocks.XIAOHANG_BLOCK,"XiaoHang_Block");

        translationBuilder.add("itemGroup.betterxh_group","BetterXh_Group");
    }
}
