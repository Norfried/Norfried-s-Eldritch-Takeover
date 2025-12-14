package com.norfried.eldritch_takeover.init;

import com.norfried.eldritch_takeover.block.BlockBase;
import com.norfried.eldritch_takeover.block.BlockPillarBase;
import com.norfried.eldritch_takeover.block.BlockStairBase;
import com.norfried.eldritch_takeover.block.BlockWallBase;
import com.norfried.eldritch_takeover.block.slab.BlockDoubleSlab;
import com.norfried.eldritch_takeover.block.slab.BlockHalfSlab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();


    public static final Block STRAULKITE_STONE = new BlockBase("straulkite_stone", Material.ROCK).setHardness(50.0F).setResistance(2000.0F);
    public static final Block STRAULKITE_SMOOTH = new BlockBase("straulkite_smooth", Material.ROCK).setHardness(50.0F).setResistance(2000.0F);
    //public static final Block STRAULKITE_SMOOTH_STAIRS = new BlockStairBase("straulkite_smooth_stairs");
    public static final Block STRAULKITE_BRICK = new BlockBase("straulkite_brick", Material.ROCK).setHardness(50.0F).setResistance(2000.0F);
    public static final Block STRAULKITE_BRICK_CHISELED = new BlockBase("straulkite_brick_chiseled", Material.ROCK).setHardness(50.0F).setResistance(2000.0F);
    public static final Block STRAULKITE_TILE = new BlockBase("straulkite_tile", Material.ROCK).setHardness(50.0F).setResistance(2000.0F);
    public static final Block STRAULKITE_TILE_CHISELED = new BlockBase("straulkite_tile_chiseled", Material.ROCK).setHardness(50.0F).setResistance(2000.0F);
    public static final Block STRAULOK_BIOMASS = new BlockBase("straulok_biomass", Material.GOURD).setLightLevel(0.5F).setHardness(1.0F);
}
