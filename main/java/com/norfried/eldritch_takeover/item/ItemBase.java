package com.norfried.eldritch_takeover.item;

import com.norfried.eldritch_takeover.Main;
import com.norfried.eldritch_takeover.creativetab.ETCreativeTab;
import com.norfried.eldritch_takeover.util.IHasModel;
import com.norfried.eldritch_takeover.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(Main.etcreativetab);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
