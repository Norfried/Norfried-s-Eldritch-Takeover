package com.norfried.eldritch_takeover.block;

import com.norfried.eldritch_takeover.Main;
import com.norfried.eldritch_takeover.init.BlockInit;
import com.norfried.eldritch_takeover.init.ItemInit;
import com.norfried.eldritch_takeover.util.IHasModel;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;

public class BlockPillarBase extends BlockRotatedPillar implements IHasModel {

    public BlockPillarBase(String name, Material materialIn, float Hardness, float Resistance, SoundType soundType) {
        super(materialIn);
        setTranslationKey(name);
        setRegistryName(name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(AXIS, EnumFacing.Axis.Y));
        this.setHardness(Hardness);
        this.setResistance(Resistance);
        this.setSoundType(soundType);
        // Add both an item as a block and the block itself
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}
