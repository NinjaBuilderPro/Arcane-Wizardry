package com.ninjabuilderpro.arcwizard.init;

import java.util.List;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.ninjabuilderpro.arcwizard.arcwizard;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class configuredFeatureInit {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = 
    DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, arcwizard.MODID);

    private static final Supplier<List<OreConfiguration.TargetBlockState>> JADE_REPLACEMENT = Suppliers.memoize(() -> 
    List.of(
        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, blockInit.JADE_ORE.get().defaultBlockState()), 
        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, blockInit.JADE_ORE.get().defaultBlockState())
        )
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> RUBY_REPLACEMENT = Suppliers.memoize(() ->
    List.of(
        OreConfiguration.target(OreFeatures.NETHERRACK, blockInit.RUBY_ORE.get().defaultBlockState())
        )   
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> SAPPHIRE_REPLACEMENT = Suppliers.memoize(() ->
    List.of(
        OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), blockInit.SAPPHIRE_ORE.get().defaultBlockState())
        )   
    );

    public static final RegistryObject<ConfiguredFeature<?, ?>> JADE_ORE = CONFIGURED_FEATURES.register("jade_ore", () ->
    new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(JADE_REPLACEMENT.get(), 9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORE = CONFIGURED_FEATURES.register("ruby_ore", () ->
    new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(RUBY_REPLACEMENT.get(), 7)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SAPPHIRE_ORE = CONFIGURED_FEATURES.register("sapphire_ore", () ->
    new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(SAPPHIRE_REPLACEMENT.get(), 5)));
}
