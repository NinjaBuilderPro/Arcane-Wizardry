package com.ninjabuilderpro.arcwizard.items;

import com.ninjabuilderpro.arcwizard.entities.RubyBoltEntity;
import com.ninjabuilderpro.arcwizard.init.entityInit;
import com.ninjabuilderpro.arcwizard.mana.PlayerManaProvider;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class ruby_staff extends Item{

    private final int MANA_COST = 10;
    public ruby_staff(Properties properties) {
        super(properties);
        
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        player.getCapability(PlayerManaProvider.PLAYER_MANA).ifPresent(mana -> {
            if(mana.getMana() >= MANA_COST){
                mana.subMana(MANA_COST);
                Vec3 look = player.getLookAngle();
                RubyBoltEntity arrow = new RubyBoltEntity(entityInit.RUBY_BOLT.get(), 1.5D, 1.0D, 1.5D, level);
                arrow.setPos(player.position().x + look.x * 1.5D, player.position().y + look.y + 1.5D, player.position().z + look.z * 1.5D);
                arrow.shoot(look.x , look.y, look.z, 2.0F, 0.0F);
                level.addFreshEntity(arrow);
                player.getCooldowns().addCooldown(this, 15);
            }
        });
        return super.use(level, player, hand);
    }
}