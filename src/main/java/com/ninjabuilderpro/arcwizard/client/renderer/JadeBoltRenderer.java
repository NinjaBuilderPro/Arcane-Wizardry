package com.ninjabuilderpro.arcwizard.client.renderer;

import com.ninjabuilderpro.arcwizard.arcwizard;
import com.ninjabuilderpro.arcwizard.entities.JadeBoltEntity;

import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class JadeBoltRenderer extends ArrowRenderer<JadeBoltEntity>{
    public static final ResourceLocation TEXTURE = new ResourceLocation(arcwizard.MODID, "textures/entity/jade_bolt.png");

    public JadeBoltRenderer(EntityRendererProvider.Context manager) {
        super(manager);
    }

    @Override
    public ResourceLocation getTextureLocation(JadeBoltEntity p_114482_) {
        // TODO Auto-generated method stub
        return TEXTURE;
    }
}
