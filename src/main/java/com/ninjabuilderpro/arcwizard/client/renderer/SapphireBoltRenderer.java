package com.ninjabuilderpro.arcwizard.client.renderer;

import com.ninjabuilderpro.arcwizard.arcwizard;
import com.ninjabuilderpro.arcwizard.entities.SapphireBoltEntity;

import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class SapphireBoltRenderer extends ArrowRenderer<SapphireBoltEntity>{
    public static final ResourceLocation TEXTURE = new ResourceLocation(arcwizard.MODID, "textures/sapphire_bolt.png");

    public SapphireBoltRenderer(EntityRendererProvider.Context manager) {
        super(manager);
    }

    @Override
    public ResourceLocation getTextureLocation(SapphireBoltEntity p_114482_) {
        // TODO Auto-generated method stub
        return TEXTURE;
    }
}
