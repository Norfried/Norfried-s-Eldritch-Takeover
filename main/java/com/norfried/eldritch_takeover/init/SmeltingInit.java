package com.norfried.eldritch_takeover.init;

import com.norfried.eldritch_takeover.init.BlockInit;
import com.norfried.eldritch_takeover.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingInit
{
    public static void init(){
        GameRegistry.addSmelting(BlockInit.STRAULKITE_BRICK, new ItemStack(BlockInit.STRAULKITE_BRICK_CRACKED, 1), 0.1F);
        GameRegistry.addSmelting(BlockInit.STRAULKITE_TILE, new ItemStack(BlockInit.STRAULKITE_TILE_CRACKED, 1), 0.1F);
        GameRegistry.addSmelting(ItemInit.STRAULOK_PROTOPLASM, new ItemStack(ItemInit.BURNT_STRAULOK_PROTOPLASM, 1), 0.35F);
    }
}
