package com.xiaohang.betterxhmod.datagen;

import com.xiaohang.betterxhmod.blocks.ModBlocks;
import com.xiaohang.betterxhmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.MinecartItem;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.MISC, ModItems.XIAOHANG,8)
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .input('#', Items.APPLE)
                        .input('X',Items.TNT)
                        .group("xiaohang")
                        .criterion(hasItem(ModItems.XIAOHANG),conditionsFromItem(Items.APPLE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.XIAOHANG_BLOCK)

                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .input('#', ModItems.XIAOHANG)
                        .input('X',Items.IRON_INGOT)
                        .group("xiaohang_block")
                        .criterion(hasItem(ModItems.XIAOHANG),conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
