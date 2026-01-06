package com.norfried.eldritch_takeover.block;

import java.util.Random;

import com.norfried.eldritch_takeover.Main;
import com.norfried.eldritch_takeover.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockSlabDoubleBase extends BlockSlabBase implements IHasModel
{
	private Block block;

	public BlockSlabDoubleBase(String name, Block block, Material materialIn, float hardnessIn, float resistanceIn, SoundType soundIn)
    {
        super(name, materialIn, hardnessIn, resistanceIn, soundIn);
        this.block = block;
    }
	
	/** Why, yes, this IS a short useless file, but GOD I suffered too much trying to condense this in the normal slab class.*/
	public boolean isDouble()
	{
        return true;
	}

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(block);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}