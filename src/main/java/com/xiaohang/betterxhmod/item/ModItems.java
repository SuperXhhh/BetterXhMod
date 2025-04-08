package com.xiaohang.betterxhmod.item;

import com.xiaohang.betterxhmod.BetterXHMod;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public final class ModItems {

    public static final Item XIAOHANG = register("xiaohang", Item::new, new Item.Settings());

    public static Item register(String path, Function<Item.Settings,Item> factory,Item.Settings settings){
            final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterXHMod.MOD_ID,path));
            return Items.register(registryKey,factory,settings);
    }

    public static void initialize() {
        BetterXHMod.LOGGER.info("Yes!Hello!Items!");
    }
}
