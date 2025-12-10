package com.norfried.eldritch_takeover.block.slab;

import com.norfried.eldritch_takeover.init.ItemInit;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSlab;

public class BlockHalfSlab extends BlockSlabBase{
    public BlockHalfSlab(String name, Material maeterialIn, CreativeTabs tabs, BlockSlab half, BlockSlab doubleSlab, float hardness, float resistance, SoundType soundType) {

        super(name, maeterialIn, half);
        this.setCreativeTab(tabs);
        ItemInit.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(soundType);

    }
    @Override
    public boolean isDouble() {
        return false;
    }
}
