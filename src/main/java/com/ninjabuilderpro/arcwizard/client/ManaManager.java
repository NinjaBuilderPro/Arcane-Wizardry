package com.ninjabuilderpro.arcwizard.client;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.client.event.ContainerScreenEvent.Render;

public class ManaManager {
    private static final ThreadLocal<ManaManager> instance = new ThreadLocal<ManaManager>(){
        @Override
        protected ManaManager initialValue() {
            // TODO Auto-generated method stub
            return new ManaManager();
        }
    };
    public static ManaManager getInstance() {
        return instance.get();
    }
    int currentMana = 100;

    private ManaManager() {

    }
    public void useMana(int manaUsed) {
        if(true){
            currentMana -= manaUsed;
            Minecraft.getInstance().player.sendSystemMessage(Component.literal("ManaLeft " + currentMana));
        }

    }
    public int getCurrentMana(){
        return currentMana;
    }
}
