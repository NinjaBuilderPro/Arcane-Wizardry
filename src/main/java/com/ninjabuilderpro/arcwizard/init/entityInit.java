package com.ninjabuilderpro.arcwizard.init;

import com.ninjabuilderpro.arcwizard.arcwizard;
import com.ninjabuilderpro.arcwizard.entities.JadeBoltEntity;
import com.ninjabuilderpro.arcwizard.entities.RubyBoltEntity;
import com.ninjabuilderpro.arcwizard.entities.SapphireBoltEntity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class entityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, arcwizard.MODID);

    public static final RegistryObject<EntityType<JadeBoltEntity>> JADE_BOLT = ENTITIES.register("jade_bolt", 
    () -> EntityType.Builder.of((EntityType.EntityFactory<JadeBoltEntity>) JadeBoltEntity::new, MobCategory.MISC).sized(1.0F, 1.0F).build("jade_bolt"));

    public static final RegistryObject<EntityType<RubyBoltEntity>> RUBY_BOLT = ENTITIES.register("ruby_bolt", 
    () -> EntityType.Builder.of((EntityType.EntityFactory<RubyBoltEntity>) RubyBoltEntity::new, MobCategory.MISC).sized(1.0F, 1.0F).build("ruby_bolt"));

    public static final RegistryObject<EntityType<SapphireBoltEntity>> SAPPHIRE_BOLT = ENTITIES.register("sapphire_bolt", 
    () -> EntityType.Builder.of((EntityType.EntityFactory<SapphireBoltEntity>) SapphireBoltEntity::new, MobCategory.MISC).sized(1.0F, 1.0F).build("sapphire_bolt"));
}
