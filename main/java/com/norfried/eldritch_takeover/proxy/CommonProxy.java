package com.norfried.eldritch_takeover.proxy;

import com.norfried.eldritch_takeover.init.EntityInit;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CommonProxy
{
    @SideOnly(Side.CLIENT)
    public void registerItemRenderer(Item item, int meta, String id) {}

    public void preInitRegisteries(FMLPreInitializationEvent event)
    {
        EntityInit.registerEntities();
        //StraulokLootTables.registerLootTables();
        //StraulokSounds.registerSounds();
        //CFDPacketHandler.registerMessages();

        if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) EntityInit.RegisterRenderers();
    }
}
