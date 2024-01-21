package net.trique.zekinincevherleri.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;
import net.trique.zekinincevherleri.ZekininCevherleri;

import java.util.List;

import static net.minecraft.world.gen.feature.PlacedFeatures.register;
import static net.trique.zekinincevherleri.world.ZekininConfiguredFeatures.registerKey;

public class ZekininPlacedFeatures {
    public static final RegistryKey<PlacedFeature> CHRYSOCOLLA_ORE_PLACED_KEY = registerKey("chrysocolla_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, CHRYSOCOLLA_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ZekininConfiguredFeatures.CHRYSOCOLLA_ORE_KEY),
                ZekininOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(32))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(ZekininCevherleri.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}