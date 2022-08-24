package com.ninjabuilderpro.arcwizard.init;

import com.google.common.base.Supplier;
import com.ninjabuilderpro.arcwizard.arcwizard;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class blockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, arcwizard.MODID);

    public static final RegistryObject<Block> BOB_ORE = register("bob_ore", 
        () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3, 3).requiresCorrectToolForDrops()), 
            new Item.Properties().tab(arcwizard.TAB));
            public static final RegistryObject<Block> JADE_ORE = register("jade_ore", 
        () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3, 3).requiresCorrectToolForDrops()), 
            new Item.Properties().tab(arcwizard.TAB));
            public static final RegistryObject<Block> RUBY_ORE = register("ruby_ore", 
        () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3, 3).requiresCorrectToolForDrops()), 
            new Item.Properties().tab(arcwizard.TAB));
            public static final RegistryObject<Block> SAPPHIRE_ORE = register("sapphire_ore", 
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3, 3).requiresCorrectToolForDrops()), 
                new Item.Properties().tab(arcwizard.TAB));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        itemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
