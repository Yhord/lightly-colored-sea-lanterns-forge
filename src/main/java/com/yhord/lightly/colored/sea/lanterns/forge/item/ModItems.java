package com.yhord.lightly.colored.sea.lanterns.forge.item;

import com.yhord.lightly.colored.sea.lanterns.forge.LightlyColoredSeaLanterns;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LightlyColoredSeaLanterns.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
