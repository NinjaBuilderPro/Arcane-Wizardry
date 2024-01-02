package com.ninjabuilderpro.arcwizard.client.renderer;

import com.ninjabuilderpro.arcwizard.arcwizard;
import com.ninjabuilderpro.arcwizard.entities.RubyBoltEntity;

import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class RubyBoltRenderer extends ArrowRenderer<RubyBoltEntity>{
    public static final ResourceLocation TEXTURE = new ResourceLocation(arcwizard.MODID, "textures/ruby_bolt.png");

    public RubyBoltRenderer(EntityRendererProvider.Context manager) {
        super(manager);
    }

    @Override
    public ResourceLocation getTextureLocation(RubyBoltEntity p_114482_) {
        // TODO Auto-generated method stub
        return TEXTURE;
    }
}
