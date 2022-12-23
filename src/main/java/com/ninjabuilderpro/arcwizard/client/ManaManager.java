package com.ninjabuilderpro.arcwizard.client;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.client.event.ContainerScreenEvent.Render;

public class ManaManager {
    public static final ManaManager instance = new ManaManager();
    ThreadLocal<Integer> currentMana = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            // TODO Auto-generated method stub
            return 100;
        }
    };
    private ManaManager() {

    }
    public void useMana(int manaUsed) {
        currentMana.set(currentMana.get() - manaUsed);
        Minecraft.getInstance().player.sendSystemMessage(Component.literal("ManaLeft " + currentMana.get()));
    }
}
