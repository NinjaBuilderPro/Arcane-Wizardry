package com.ninjabuilderpro.arcwizard.base;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

import com.ninjabuilderpro.arcwizard.arcwizard;

public record ModArmorMaterial(String name, int durabillity, int[] protection, int enchantability, SoundEvent equipSound, float toughness, float knockbackresistance, Supplier<Ingredient> repairMaterial) implements ArmorMaterial {

    private static final int[] DURABILITY_PER_SLOT = new int[] { 13, 15, 16, 11 };
    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        // TODO Auto-generated method stub
        return DURABILITY_PER_SLOT[slot.getIndex()] * this.durabillity;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        // TODO Auto-generated method stub
        return this.protection[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        // TODO Auto-generated method stub
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        // TODO Auto-generated method stub
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return  this.repairMaterial.get();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return arcwizard.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        // TODO Auto-generated method stub
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        // TODO Auto-generated method stub
        return this.knockbackresistance;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

}
