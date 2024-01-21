package net.trique.zekinincevherleri.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.trique.zekinincevherleri.world.ZekininPlacedFeatures;

public class ZekininOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ZekininPlacedFeatures.CHRYSOCOLLA_ORE_PLACED_KEY);
    }
}