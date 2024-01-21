package net.trique.zekinincevherleri.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.trique.zekinincevherleri.block.ZekininBlocks;
import net.trique.zekinincevherleri.item.ZekininItems;

public class ZekininLootTableGenerator extends FabricBlockLootTableProvider {
    public ZekininLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ZekininBlocks.CHRYSOCOLLA_BLOCK);

        addDrop(ZekininBlocks.CHRYSOCOLLA_ORE, oreDrops(ZekininBlocks.CHRYSOCOLLA_ORE, ZekininItems.CHRYSOCOLLA));
    }
}