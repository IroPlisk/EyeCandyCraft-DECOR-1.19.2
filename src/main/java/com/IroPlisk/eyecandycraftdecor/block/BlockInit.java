package com.IroPlisk.eyecandycraftdecor.block;

import com.IroPlisk.eyecandycraftdecor.ECCDCreativeTab;
import com.IroPlisk.eyecandycraftdecor.EyeCandyCraftDecor;
import com.IroPlisk.eyecandycraftdecor.item.ItemInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EyeCandyCraftDecor.MODID);

    public static final RegistryObject<Block> ANTENNA_4G = registerBlock("antenna4g",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.CLAY)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ANTENNA_900MHZ = registerBlock("antenna900mhz",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.CLAY)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> FLOODLIGHT = registerBlock("floodlight",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.CLAY)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ANTENNA_GP = registerBlock("antennagp",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.CLAY)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ANTENNA_LP = registerBlock("antennalp",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.CLAY)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SATELLITE_DISH = registerBlock("satellitedish",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.CLAY)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ANTENNA_VD = registerBlock("antennavd",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.CLAY)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ANTENNA_VHF = registerBlock("antennavhf",
            () -> new AntennaBlockModel(BlockBehaviour.Properties.of(Material.CLAY)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), ECCDCreativeTab.ECC_DECOR_CREATIVE_MODE_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
