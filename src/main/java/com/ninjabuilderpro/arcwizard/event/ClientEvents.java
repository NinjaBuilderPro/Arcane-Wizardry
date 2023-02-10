package com.ninjabuilderpro.arcwizard.event;

import com.ninjabuilderpro.arcwizard.arcwizard;
import com.ninjabuilderpro.arcwizard.client.ManaHudOverlay;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = arcwizard.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
    }

    @Mod.EventBusSubscriber(modid = arcwizard.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void registerGuiOverlays(RegisterGuiOverlaysEvent event) {
            event.registerAboveAll("mana", ManaHudOverlay.HUD_MANA);
        }
    }
}
