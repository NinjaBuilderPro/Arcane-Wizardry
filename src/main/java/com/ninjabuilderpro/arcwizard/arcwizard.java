package com.ninjabuilderpro.arcwizard;

import com.ninjabuilderpro.arcwizard.init.blockInit;
import com.ninjabuilderpro.arcwizard.init.configuredFeatureInit;
import com.ninjabuilderpro.arcwizard.init.itemInit;
import com.ninjabuilderpro.arcwizard.init.placedFeatureInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(arcwizard.MODID)
public class arcwizard {
    public static final String MODID = "arcwizard";

    public arcwizard() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        
        itemInit.ITEMS.register(bus);
        blockInit.BLOCKS.register(bus);
        configuredFeatureInit.CONFIGURED_FEATURES.register(bus);
        placedFeatureInit.PLACED_FEATURES.register(bus);
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {
            return itemInit.BOB.get().getDefaultInstance();
        }
    };
}
