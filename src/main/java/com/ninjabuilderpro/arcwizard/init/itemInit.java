package com.ninjabuilderpro.arcwizard.init;

import com.ninjabuilderpro.arcwizard.arcwizard;
import com.ninjabuilderpro.arcwizard.base.ModArmorMaterial;
import com.ninjabuilderpro.arcwizard.items.jade_staff;
import com.ninjabuilderpro.arcwizard.items.ruby_staff;
import com.ninjabuilderpro.arcwizard.items.sapphire_staff;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class itemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, arcwizard.MODID);

    public static final RegistryObject<Item> BOB = ITEMS.register("bob", 
    () -> new Item(props().food(Foods.BOB)));

    public static final RegistryObject<Item> JADE = ITEMS.register("jade", 
    () -> new Item(props()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", 
    () -> new Item(props()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", 
    () -> new Item(props()));

    public static final RegistryObject<Item> JADE_CLOTH = ITEMS.register("jade_cloth", 
    () -> new Item(props()));
    public static final RegistryObject<Item> RUBY_CLOTH = ITEMS.register("ruby_cloth", 
    () -> new Item(props()));
    public static final RegistryObject<Item> SAPPHIRE_CLOTH = ITEMS.register("sapphire_cloth", 
    () -> new Item(props()));

    public static final RegistryObject<SwordItem> BOB_SWORD = ITEMS.register("bob_sword", 
    () -> new SwordItem(ToolTiers.BOB, 6, -2.4f, props()));

    public static final RegistryObject<jade_staff> JADE_STAFF = ITEMS.register("jade_staff", 
    () -> new jade_staff(props()));
    public static final RegistryObject<ruby_staff> RUBY_STAFF = ITEMS.register("ruby_staff", 
    () -> new ruby_staff(props()));
    public static final RegistryObject<sapphire_staff> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff", 
    () -> new sapphire_staff(props()));

    public static final RegistryObject<ArmorItem> BOB_HELMET =  ITEMS.register("bob_helmet", 
    () -> new ArmorItem(ArmorTiers.BOB, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> BOB_CHESTPLATE =  ITEMS.register("bob_chestplate", 
    () -> new ArmorItem(ArmorTiers.BOB, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> BOB_LEGGINGS =  ITEMS.register("bob_leggings", 
    () -> new ArmorItem(ArmorTiers.BOB, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> BOB_BOOTS =  ITEMS.register("bob_boots", 
    () -> new ArmorItem(ArmorTiers.BOB, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> JADE_HELMET =  ITEMS.register("jade_helmet", 
    () -> new ArmorItem(ArmorTiers.JADE, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> JADE_CHESTPLATE =  ITEMS.register("jade_chestplate", 
    () -> new ArmorItem(ArmorTiers.JADE, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> JADE_LEGGINGS =  ITEMS.register("jade_leggings", 
    () -> new ArmorItem(ArmorTiers.JADE, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> JADE_BOOTS =  ITEMS.register("jade_boots", 
    () -> new ArmorItem(ArmorTiers.JADE, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> RUBY_HELMET =  ITEMS.register("ruby_helmet", 
    () -> new ArmorItem(ArmorTiers.RUBY, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE =  ITEMS.register("ruby_chestplate", 
    () -> new ArmorItem(ArmorTiers.RUBY, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS =  ITEMS.register("ruby_leggings", 
    () -> new ArmorItem(ArmorTiers.RUBY, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS =  ITEMS.register("ruby_boots", 
    () -> new ArmorItem(ArmorTiers.RUBY, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> SAPPHIRE_HELMET =  ITEMS.register("sapphire_helmet", 
    () -> new ArmorItem(ArmorTiers.SAPPHIRE, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> SAPPHIRE_CHESTPLATE =  ITEMS.register("sapphire_chestplate", 
    () -> new ArmorItem(ArmorTiers.SAPPHIRE, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> SAPPHIRE_LEGGINGS =  ITEMS.register("sapphire_leggings", 
    () -> new ArmorItem(ArmorTiers.SAPPHIRE, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> SAPPHIRE_BOOTS =  ITEMS.register("sapphire_boots", 
    () -> new ArmorItem(ArmorTiers.SAPPHIRE, EquipmentSlot.FEET, props()));
    public static class Foods {
        public static final FoodProperties BOB = new FoodProperties.Builder()
        .nutrition(2)
        .saturationMod(1)
        .effect(() -> new MobEffectInstance(MobEffects.POISON, 100, 1), 1)
        .build();
    }

    private static Properties props() {
        return new Item.Properties().tab(arcwizard.TAB);
    }

    public static class ToolTiers{
        public static final Tier BOB = new ForgeTier(4, 
        1200, 
        1, 
        1, 
        15, 
        null, 
        () -> Ingredient.of(itemInit.BOB.get()));
    }

    public static class ArmorTiers {
            public static final ArmorMaterial BOB = new ModArmorMaterial(
                "bob",
                500,
                new int[] {20, 40, 50, 10},
                100,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                1.2f,
                0.0f,
                () -> Ingredient.of(itemInit.BOB.get()));
            public static final ArmorMaterial JADE = new ModArmorMaterial(
                "jade", 
                500, 
                new int[] {2, 5, 4, 1}, 
                20, 
                SoundEvents.ARMOR_EQUIP_LEATHER, 
                0.0f, 
                0.0f, 
                () -> Ingredient.of(itemInit.JADE_CLOTH.get()));
            public static final ArmorMaterial RUBY = new ModArmorMaterial(
                "ruby", 
                750, 
                new int[] {2, 6, 5, 2}, 
                25, 
                
                SoundEvents.ARMOR_EQUIP_LEATHER, 
                0.0f, 
                0.0f, 
                () -> Ingredient.of(itemInit.RUBY_CLOTH.get()));
            public static final ArmorMaterial SAPPHIRE = new ModArmorMaterial(
                "jade", 
                1000, 
                new int[] {3, 7, 5, 3}, 
                30, 
                SoundEvents.ARMOR_EQUIP_LEATHER, 
                0.0f, 
                0.0f, 
                () -> Ingredient.of(itemInit.SAPPHIRE_CLOTH.get()));
    }
}
