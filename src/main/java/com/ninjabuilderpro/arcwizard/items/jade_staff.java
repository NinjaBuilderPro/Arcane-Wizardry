package com.ninjabuilderpro.arcwizard.items;

import com.ninjabuilderpro.arcwizard.client.ManaManager;
import com.ninjabuilderpro.arcwizard.entities.JadeBoltEntity;
import com.ninjabuilderpro.arcwizard.init.entityInit;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class jade_staff extends Item{
    public int MAX_MANA = 0;

    public jade_staff(Properties properties) {
        super(properties);
        
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ManaManager.instance.useMana(5);
        Vec3 look = player.getLookAngle();
        JadeBoltEntity arrow = new JadeBoltEntity(entityInit.JABE_BOLT.get(), 1.5D, 1.0D, 1.5D, level);
        arrow.setPos(player.position().x + look.x * 1.5D, player.position().y + look.y + 1.5D, player.position().z + look.z * 1.5D);
        arrow.shoot(look.x , look.y, look.z, 2.0F, 0.0F);
        level.addFreshEntity(arrow);
        player.getCooldowns().addCooldown(this, 40);
        return super.use(level, player, hand);
    }
}
