package com.norfried.eldritch_takeover.creativetab;
/**
import com.norfried.eldritch_takeover.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabBlock extends CreativeTabs
{
    public CreativeTabBlock(String label) {super ("eldritch_takeover_blocks");
        this.setBackgroundImageName("creative_block_tab.png");
    }

    public ItemStack createIcon() {
        return new ItemStack(Item.getItemFromBlock(BlockInit.STRAULKITE_STONE));
    }
}
**/