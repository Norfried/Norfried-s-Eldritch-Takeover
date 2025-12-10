package com.norfried.eldritch_takeover.creativetab;

import com.norfried.eldritch_takeover.init.BlockInit;
import com.norfried.eldritch_takeover.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class ETCreativeTab extends CreativeTabs
{
    public ETCreativeTab(String label) {super ("etcreativetab");
    this.setBackgroundImageName("etcreativetab.png");}
    public ItemStack createIcon() {return new ItemStack(ItemInit.STRAULOK_INVOCATOR);}
}
