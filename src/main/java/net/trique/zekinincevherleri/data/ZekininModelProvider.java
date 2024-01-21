package net.trique.zekinincevherleri.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.trique.zekinincevherleri.block.ZekininBlocks;
import net.trique.zekinincevherleri.item.ZekininItems;

public class ZekininModelProvider extends FabricModelProvider {
    public ZekininModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ZekininBlocks.CHRYSOCOLLA_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ZekininBlocks.CHRYSOCOLLA_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ZekininBlocks.DEEPSLATE_CHRYSOCOLLA_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ZekininItems.CHRYSOCOLLA_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ZekininItems.CHRYSOCOLLA, Models.GENERATED);
    }
}