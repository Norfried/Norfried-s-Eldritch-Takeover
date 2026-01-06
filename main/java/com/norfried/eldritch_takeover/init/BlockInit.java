package com.norfried.eldritch_takeover.init;

import com.norfried.eldritch_takeover.Main;
import com.norfried.eldritch_takeover.block.*;
import com.norfried.eldritch_takeover.item.ItemBlockSlab;
import com.norfried.eldritch_takeover.util.handlers.ConfigHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    private static final List<Block> itemBlockBlacklist = new ArrayList<Block>();

    public static final Block STRAULKITE_STONE = new BlockBase("straulkite_stone", Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final Block STRAULKITE_SMOOTH = new BlockBase("straulkite_smooth", Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final BlockStairBase STRAULKITE_SMOOTH_STAIRS = new BlockStairBase("straulkite_smooth_stairs", STRAULKITE_SMOOTH.getDefaultState(), 50.0F, 1200.0F, SoundType.STONE);
    public static final BlockSlab STRAULKITE_SMOOTH_SLAB = new BlockSlabBase("straulkite_smooth_slab", Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final BlockSlab STRAULKITE_SMOOTH_SLAB_DOUBLE = new BlockSlabDoubleBase("straulkite_smooth_slab_double", STRAULKITE_SMOOTH_SLAB, Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final Block STRAULKITE_SMOOTH_WALL = new BlockWallBase("straulkite_smooth_wall", Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final Block STRAULKITE_PILLAR = new BlockPillarBase("straulkite_pillar", Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final Block STRAULKITE_BRICK = new BlockBase("straulkite_brick", Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final BlockStairBase STRAULKITE_BRICK_STAIRS = new BlockStairBase("straulkite_brick_stairs", STRAULKITE_BRICK.getDefaultState(), 50.0F, 1200.0F, SoundType.STONE);
    public static final BlockSlab STRAULKITE_BRICK_SLAB = new BlockSlabBase("straulkite_brick_slab", Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final BlockSlab STRAULKITE_BRICK_SLAB_DOUBLE = new BlockSlabDoubleBase("straulkite_brick_slab_double", STRAULKITE_BRICK_SLAB, Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final Block STRAULKITE_BRICK_WALL = new BlockWallBase("straulkite_brick_wall", Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final Block STRAULKITE_BRICK_CHISELED = new BlockBase("straulkite_brick_chiseled", Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final Block STRAULKITE_BRICK_CRACKED = new BlockBase("straulkite_brick_cracked", Material.ROCK, 49.0F, 1199.0F, SoundType.STONE);
    public static final Block STRAULKITE_TILE = new BlockBase("straulkite_tile", Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final BlockStairBase STRAULKITE_TILE_STAIRS = new BlockStairBase("straulkite_tile_stairs", STRAULKITE_TILE.getDefaultState(), 50.0F, 1200.0F, SoundType.STONE);
    public static final BlockSlab STRAULKITE_TILE_SLAB = new BlockSlabBase("straulkite_tile_slab", Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final BlockSlab STRAULKITE_TILE_SLAB_DOUBLE = new BlockSlabDoubleBase("straulkite_tile_slab_double", STRAULKITE_TILE_SLAB, Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final Block STRAULKITE_TILE_WALL = new BlockWallBase("straulkite_tile_wall", Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final Block STRAULKITE_TILE_CHISELED = new BlockBase("straulkite_tile_chiseled", Material.ROCK, 50.0F, 1200.0F, SoundType.STONE);
    public static final Block STRAULKITE_TILE_CRACKED = new BlockBase("straulkite_tile_cracked", Material.ROCK, 49.0F, 1199.0F, SoundType.STONE);
    public static final Block FAR_REALM_MATTER = new BlockBase("far_realm_matter", Material.CORAL, 3.0F, 6.0F, SoundType.STONE);
    public static final Block STRAULOK_BIOMASS = new BlockBase("straulok_biomass", Material.GOURD, 1.0F, 1.0F, SoundType.SLIME).setLightLevel(0.5F);
    public static final Block STRAULOK_POLYP = new BlockStraulokPolyp("straulok_polyp", Material.GOURD).setHardness(1.0F).setResistance(1.0F).setLightLevel(0.5F);

}
