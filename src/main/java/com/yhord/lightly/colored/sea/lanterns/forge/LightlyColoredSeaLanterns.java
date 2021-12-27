package com.yhord.lightly.colored.sea.lanterns.forge;

import com.yhord.lightly.colored.sea.lanterns.forge.block.ModBlocks;
import com.yhord.lightly.colored.sea.lanterns.forge.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LightlyColoredSeaLanterns.MOD_ID)
public class LightlyColoredSeaLanterns {
    public static final String MOD_ID = "lcsl";

    public LightlyColoredSeaLanterns() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
