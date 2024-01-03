package com.ninjabuilderpro.arcwizard.client;

import com.ninjabuilderpro.arcwizard.arcwizard;
import com.ninjabuilderpro.arcwizard.client.renderer.JadeBoltRenderer;
import com.ninjabuilderpro.arcwizard.client.renderer.RubyBoltRenderer;
import com.ninjabuilderpro.arcwizard.client.renderer.SapphireBoltRenderer;
import com.ninjabuilderpro.arcwizard.init.entityInit;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = arcwizard.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    @SubscribeEvent
    public static void doSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(entityInit.JADE_BOLT.get(), JadeBoltRenderer::new);
        EntityRenderers.register(entityInit.RUBY_BOLT.get(), RubyBoltRenderer::new);
        EntityRenderers.register(entityInit.SAPPHIRE_BOLT.get(), SapphireBoltRenderer::new);
    }
}
