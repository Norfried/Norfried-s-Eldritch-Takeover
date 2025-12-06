package com.norfried.eldritch_takeover.block;

import com.norfried.eldritch_takeover.Main;
import com.norfried.eldritch_takeover.init.BlockInit;
import com.norfried.eldritch_takeover.init.ItemInit;
import com.norfried.eldritch_takeover.util.IHasModel;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockStairBase extends BlockStairs implements IHasModel {
    public BlockStairBase(IBlockState modelState) {
        super(modelState);
    }

    public BlockStairBase(String name, IBlockState modelState) {
        super(modelState);
        setTranslationKey(name);
        setRegistryName(name);
        this.setLightOpacity(255);
        this.useNeighborBrightness = true;
        // Add both an item as a block and the block itself
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public BlockStairBase(String name, IBlockState modelState, float hardness, float resistance, SoundType soundType) {
        this(name, modelState);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(soundType);
        this.setLightOpacity(255);
        this.useNeighborBrightness = true;
    }




    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
