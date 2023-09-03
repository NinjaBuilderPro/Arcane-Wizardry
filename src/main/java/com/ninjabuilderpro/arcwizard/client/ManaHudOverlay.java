package com.ninjabuilderpro.arcwizard.client;

import com.mojang.blaze3d.systems.RenderSystem;
import com.ninjabuilderpro.arcwizard.arcwizard;

import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;

public class ManaHudOverlay {
    private static final ResourceLocation FILLED_MANA = new ResourceLocation(arcwizard.MODID, "textures/mana/mana_full.png");
    private static final ResourceLocation EMPTY_MANA = new ResourceLocation(arcwizard.MODID, "textures/mana/mana_empty.png");

    public static final IGuiOverlay HUD_MANA = (((gui, poseStack, partialTick, width, height) -> {
        int x = width/2;
        int y = height;

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, EMPTY_MANA);
        
        for(int i = 0; i < 20; i++){
            if(i < 10){
                GuiComponent.blit(poseStack, x + 10 + (i * 8), y - 50, 0, 0, 9, 9, 9, 9);
            } else{
                GuiComponent.blit(poseStack, x + 10 + ((i - 10) * 8), y - 59, 0, 0, 9, 9, 9, 9);
            }
        }

        RenderSystem.setShaderTexture(0, FILLED_MANA);
        for(int i = 0; i < 20; i++){
            if(ClientManaData.getPlayerMana()/5 >= i){
                if(i < 10){
                    GuiComponent.blit(poseStack, x + 82 - (i * 8), y - 50, 0, 0, 9, 9, 9, 9);
                } else{
                    GuiComponent.blit(poseStack, x + 82 - ((i - 10) * 8), y - 59, 0, 0, 9, 9, 9, 9);
                }
            } else{
                break;
            }
        }

    }));
}
