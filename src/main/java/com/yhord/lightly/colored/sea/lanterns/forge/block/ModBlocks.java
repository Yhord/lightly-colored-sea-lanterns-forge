package com.yhord.lightly.colored.sea.lanterns.forge.block;

import com.yhord.lightly.colored.sea.lanterns.forge.LightlyColoredSeaLanterns;
import com.yhord.lightly.colored.sea.lanterns.forge.item.ModCreativeModTab;
import com.yhord.lightly.colored.sea.lanterns.forge.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LightlyColoredSeaLanterns.MOD_ID);

    public static final RegistryObject<Block> WHITE_SEA_LANTERN = registerBlock("white_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> ORANGE_SEA_LANTERN = registerBlock("orange_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> MAGENTA_SEA_LANTERN = registerBlock("magenta_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> LIGHT_BLUE_SEA_LANTERN = registerBlock("light_blue_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> YELLOW_SEA_LANTERN = registerBlock("yellow_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> LIME_SEA_LANTERN = registerBlock("lime_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> PINK_SEA_LANTERN = registerBlock("pink_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> GRAY_SEA_LANTERN = registerBlock("gray_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> LIGHT_GRAY_SEA_LANTERN = registerBlock("light_gray_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> CYAN_SEA_LANTERN = registerBlock("cyan_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> PURPLE_SEA_LANTERN = registerBlock("purple_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> BLUE_SEA_LANTERN = registerBlock("blue_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> BROWN_SEA_LANTERN = registerBlock("brown_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> GREEN_SEA_LANTERN = registerBlock("green_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> RED_SEA_LANTERN = registerBlock("red_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));
    public static final RegistryObject<Block> BLACK_SEA_LANTERN = registerBlock("black_sea_lantern", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f, 1.5f).sound(SoundType.GLASS).lightLevel((lightLevel) -> (15))));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModTab.ITEM_GROUP)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
     }
}
