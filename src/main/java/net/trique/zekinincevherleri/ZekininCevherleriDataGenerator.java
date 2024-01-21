package net.trique.zekinincevherleri;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.trique.zekinincevherleri.data.ZekininLootTableGenerator;
import net.trique.zekinincevherleri.data.ZekininModelProvider;
import net.trique.zekinincevherleri.data.ZekininWorldGenerator;
import net.trique.zekinincevherleri.world.ZekininConfiguredFeatures;
import net.trique.zekinincevherleri.world.ZekininPlacedFeatures;

public class ZekininCevherleriDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ZekininLootTableGenerator::new);
		pack.addProvider(ZekininModelProvider::new);
		pack.addProvider(ZekininWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ZekininConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ZekininPlacedFeatures::bootstrap);
	}
}