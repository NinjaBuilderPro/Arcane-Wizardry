package com.ninjabuilderpro.arcwizard.entities;

import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.network.NetworkHooks;

public class JadeBoltEntity extends AbstractArrow{
    public JadeBoltEntity(EntityType<JadeBoltEntity> entityType, Level level) {
        super(entityType, level);
    }

    public JadeBoltEntity(EntityType<JadeBoltEntity> entityType, double x, double y, double z, Level level) {
        super(entityType, x, y, z, level);
    }

    public JadeBoltEntity(EntityType<JadeBoltEntity> entityType, LivingEntity shooter, Level level) {
        super(entityType, shooter, level);
    } 

    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }

    @Override
    protected void onHitEntity(EntityHitResult ray) {
        this.setBaseDamage(2.5d);
        this.setPierceLevel((byte) 6);
        super.onHitEntity(ray);
    }

    @Override
    protected void tickDespawn() {
        if (this.inGroundTime >= 0){
            this.discard();
        }
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
