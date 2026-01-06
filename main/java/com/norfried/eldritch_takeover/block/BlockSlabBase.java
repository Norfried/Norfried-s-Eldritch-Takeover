package com.norfried.eldritch_takeover.block;

import com.norfried.eldritch_takeover.Main;
import com.norfried.eldritch_takeover.init.BlockInit;
import com.norfried.eldritch_takeover.init.ItemInit;
import com.norfried.eldritch_takeover.util.IHasModel;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockSlabBase extends BlockSlab implements IHasModel
{
	public BlockSlabBase(String name, Material materialIn, float hardnessIn, float resistanceIn, SoundType soundIn)
    {
        super(materialIn);
        setTranslationKey(name);
        setRegistryName(name);
        this.useNeighborBrightness = true;
        this.setHardness(hardnessIn);
        this.setResistance(resistanceIn);
        this.setSoundType(soundIn);
		this.setLightOpacity(255);

        // Add both an item as a block and the block itself
        setCreativeTab(Main.etcreativetab);
        BlockInit.BLOCKS.add(this);
    }

	@Override
    public IBlockState getStateFromMeta(int meta)
    {
        if (!this.isDouble())
        {
            return this.getDefaultState().withProperty(HALF, EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
        }

        return this.getDefaultState();
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
    	if(this.isDouble())
    		return 0;
    	
    	return ((EnumBlockHalf)state.getValue(HALF)).ordinal() + 1;
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
    	//this.isDouble() ? new BlockStateContainer(this, new IProperty[] {}) : 
        return new BlockStateContainer(this, new IProperty[] {HALF});
    }

	@Override
	public String getTranslationKey(int meta)
	{
		return getTranslationKey();
	}

	@Override
	public boolean isDouble()
	{
		return false;
	}
	 
	@Override
	public IProperty<?> getVariantProperty()
	{
		return HALF;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) 
	{
		return null;
	}

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}