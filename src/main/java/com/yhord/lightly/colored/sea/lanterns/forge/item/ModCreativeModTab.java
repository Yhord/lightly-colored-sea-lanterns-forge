package com.yhord.lightly.colored.sea.lanterns.forge.item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModTab {
    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab("lcsl.general") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.SEA_LANTERN);
        }
    };
}
