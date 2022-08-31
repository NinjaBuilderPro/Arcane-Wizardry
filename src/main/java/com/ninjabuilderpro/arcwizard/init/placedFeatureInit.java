package com.ninjabuilderpro.arcwizard.init;

import java.util.List;

import com.ninjabuilderpro.arcwizard.arcwizard;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;



public class placedFeatureInit {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = 
        DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, arcwizard.MODID);

        public static final RegistryObject<PlacedFeature> JADE_ORE = PLACED_FEATURES.register("jade_ore", 
            () -> new PlacedFeature(configuredFeatureInit.JADE_ORE.getHolder().get(), 
                commonOrePlacement(10, HeightRangePlacement.triangle(
                    VerticalAnchor.aboveBottom(30),
                    VerticalAnchor.absolute(40)
                    ))));

        public static final RegistryObject<PlacedFeature> RUBY_ORE = PLACED_FEATURES.register("ruby_ore", 
            () -> new PlacedFeature(configuredFeatureInit.RUBY_ORE.getHolder().get(), 
                commonOrePlacement(8, HeightRangePlacement.uniform(
                    VerticalAnchor.bottom(),
                    VerticalAnchor.top()
                    ))));

        public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE = PLACED_FEATURES.register("sapphire_ore", 
            () -> new PlacedFeature(configuredFeatureInit.SAPPHIRE_ORE.getHolder().get(), 
                commonOrePlacement(3, HeightRangePlacement.uniform(
                VerticalAnchor.bottom(),
                VerticalAnchor.top()
                ))));

    private static List<PlacementModifier> commonOrePlacement(int countPerChunk, PlacementModifier height) {
        return orePlacement(CountPlacement.of(countPerChunk), height);
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier count, PlacementModifier height) {
        return List.of(count, InSquarePlacement.spread(), height, BiomeFilter.biome());
    }
}
