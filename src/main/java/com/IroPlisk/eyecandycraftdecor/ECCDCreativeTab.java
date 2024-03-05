package com.IroPlisk.eyecandycraftdecor;

import com.IroPlisk.eyecandycraftdecor.block.BlockInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ECCDCreativeTab  extends CreativeModeTab{
    public static final ECCDCreativeTab ECC_DECOR_CREATIVE_MODE_TAB = new ECCDCreativeTab(CreativeModeTab.TABS.length, "eyecandycraftdecorcreativetab");
    private ECCDCreativeTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(BlockInit.ANTENNA_4G.get());
    }
}
