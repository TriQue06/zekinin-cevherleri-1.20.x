package net.trique.zekinincevherleri.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.trique.zekinincevherleri.ZekininCevherleri;

public class ZekininBlocks {
    public static final Block CHRYSOCOLLA_BLOCK = registerBlock("chrysocolla_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.DIAMOND_BLUE).strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block CHRYSOCOLLA_ORE = registerBlock("chrysocolla_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).strength(3.0f, 1200.0f), UniformIntProvider.create(16, 32)));

    public static final Block DEEPSLATE_CHRYSOCOLLA_ORE = registerBlock("chrysocolla_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 1200.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(16, 32)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ZekininCevherleri.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ZekininCevherleri.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerZekininBlocks() {
        ZekininCevherleri.LOGGER.info("Registering Zekinin Cevherleri Blocks for " + ZekininCevherleri.MOD_ID);
    }
}
