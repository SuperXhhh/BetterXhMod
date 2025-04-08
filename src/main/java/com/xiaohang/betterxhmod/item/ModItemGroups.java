package com.xiaohang.betterxhmod.item;

import com.xiaohang.betterxhmod.BetterXHMod;
import com.xiaohang.betterxhmod.blocks.ModBlocks;
import net.minecraft.advancement.criterion.EnterBlockCriterion;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import oshi.hardware.Display;

public class ModItemGroups {
    /*
    public static final RegistryKey<ItemGroup> BETTERXH_GROUP = register("betterxh_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(BetterXHMod.MOD_ID,id));
    }
    public static void registerModItemGroups(){
        Registry.register(Registries.ITEM_GROUP,BETTERXH_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP,7)
                        .displayName(Text.translatable("itemGroup.betterxh_group"))
                        .icon(() -> new ItemStack(ModItems.XIAOHANG))
                        .entries((displayContext, XIAOHANG)->{
                            entries.add(ModItems.CUSTOM_ITEM);
                                }).build());
    }
    */

    public static final ItemGroup TUTORIAL_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(BetterXHMod.MOD_ID, "tutorial_group"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.betterxh_group"))
                    .icon(() -> new ItemStack(ModItems.XIAOHANG))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.XIAOHANG);
                        entries.add(ModBlocks.XIAOHANG_BLOCK);
                    }).build());
    // 初始化方法
    public static void registerModItemGroups() {
        BetterXHMod.LOGGER.info("Registering Item Groups");
    }
}
