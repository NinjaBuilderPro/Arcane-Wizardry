package com.ninjabuilderpro.arcwizard.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class jade_staff extends Item{

    public jade_staff(Properties properties) {
        super(properties);
        
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        Vec3 look = player.getLookAngle();
        Arrow arrow = new Arrow(level, 1.5D, 1.0D, 1.5D);
        arrow.setPos(player.position().x + look.x * 1.5D, player.position().y + look.y + 1.5D, player.position().z + look.z * 1.5D);
        arrow.shoot(look.x , look.y, look.z, 2.0F, 0.0F);
        level.addFreshEntity(arrow);
        player.getCooldowns().addCooldown(this, 40);
        return super.use(level, player, hand);
    }
}
