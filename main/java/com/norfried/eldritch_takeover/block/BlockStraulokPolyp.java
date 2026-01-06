package com.norfried.eldritch_takeover.block;

import com.norfried.eldritch_takeover.Main;
import com.norfried.eldritch_takeover.entity.tile.TileEntityStraulokPolyp;
import com.norfried.eldritch_takeover.init.BlockInit;
import com.norfried.eldritch_takeover.init.ItemInit;
import com.norfried.eldritch_takeover.util.IHasModel;
import net.minecraft.block.BlockMobSpawner;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockStraulokPolyp extends BlockMobSpawner implements IHasModel
{
    /**
    protected BlockStraulokPolyp()
    {
        super(Material.CLAY);
    }
    **/

    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        return new TileEntityMobSpawner();
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ItemInit.STRAULOK_PROTOPLASM;
    }

    public int quantityDropped(Random random)
    {
        return 3;
    }

    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }

    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        return 15 + RANDOM.nextInt(15) + RANDOM.nextInt(15);
    }


    public BlockStraulokPolyp(String name, Material material)
    {
        super();
        setLightLevel(0.5F);
        setHardness(1.0F);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(Main.etcreativetab);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
