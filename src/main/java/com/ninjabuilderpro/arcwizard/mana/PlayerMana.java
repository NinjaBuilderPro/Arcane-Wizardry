package com.ninjabuilderpro.arcwizard.mana;

import com.ninjabuilderpro.arcwizard.client.ClientManaData;

import net.minecraft.nbt.CompoundTag;

public class PlayerMana {
    private int mana = 100;
    private final int MIN_MANA = 0;
    private final int MAX_MANA = 100;

    public int getMana() {
        return mana;
    }

    public void addMana(int add) {
        this.mana = Math.min(mana + add, MAX_MANA);
        ClientManaData.set(mana);
    }

    public void subMana(int sub) {
        this.mana = Math.max(mana - sub, MIN_MANA);
        ClientManaData.set(mana);
    }

    public void copyFrom(PlayerMana source) {
        this.mana = source.mana;
    }

    public void saveNBTData(CompoundTag nbt) {
        nbt.putInt("mana", mana);
    }

    public void loadNBTData(CompoundTag nbt) {
        mana = nbt.getInt("mana");
    }
}