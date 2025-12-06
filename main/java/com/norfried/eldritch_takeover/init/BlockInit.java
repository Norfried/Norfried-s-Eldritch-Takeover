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


    /**
     * Block References
     *
     public static final Block PETROGLOOM = new BlockBase("gloom_stone", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block COLD_PETROGLOOM = new BlockBase("cold_stone", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block PETROGLOOM_BRICKS = new BlockBase("gloom_brick", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);



     public static final Block PETROGLOOM_ROUGH = new BlockPetroGloom("gloom_rough", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block COLD_PETROGLOOM_ROUGH = new BlockPetroGloom("cold_rough", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block PETROGLOOM_TRIANGLE = new BlockBase("gloom_triangle", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block COLD_PETROGLOOM_TRIANGLE = new BlockBase("cold_triangle", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block PETROGLOOM_STAIRS = new BlockStairBase("gloom_stone_stairs", PETROGLOOM.getDefaultState(), GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block COLD_PETROGLOOM_STAIRS = new BlockStairBase("cold_stone_stairs", PETROGLOOM.getDefaultState(), GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block PETROGLOOM_BRICK_STAIRS = new BlockStairBase("gloom_brick_stairs", PETROGLOOM_BRICKS.getDefaultState(), GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block COLD_PETROGLOOM_BRICK_STAIRS = new BlockStairBase("cold_brick_stairs", PETROGLOOM_BRICKS.getDefaultState(), GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block PETROGLOOM_SMOOTH_STAIRS = new BlockStairBase("gloom_smooth_stairs", PETROGLOOM_SMOOTH.getDefaultState(), GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block COLD_PETROGLOOM_SMOOTH_STAIRS = new BlockStairBase("cold_smooth_stairs", PETROGLOOM_SMOOTH.getDefaultState(), GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block CITY_BRICK_STAIRS = new BlockStairBase("city_brick_stairs", CITY_BRICK.getDefaultState(), GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block CITY_BRICK_STAIRS_ALT = new BlockStairBase("city_brick_stairs_alt", CITY_BRICK_ALT.getDefaultState(), GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block CITY_TILE_STAIRS = new BlockStairBase("city_tile_stairs", CITY_BRICK_TILE.getDefaultState(), GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block GOLD_CITY_BRICK_STAIRS = new BlockStairBase("gold_city_brick_stairs", GOLD_CITY_BRICK.getDefaultState(), GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block GRUM_BRICK_STAIRS = new BlockStairBase("grum_brick_stairs", GRUM_BRICKS.getDefaultState(), GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.GRUM_STONE).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block DUNGEON_BRICK_STAIRS = new BlockStairBase("dungeon_brick_stairs", DUNGEON_BRICK.getDefaultState(), STONE_HARDNESS, STONE_RESISTANCE, SoundType.STONE).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block DARKGLOW_STONEBRICK_STAIRS = new BlockStairBase("darkglow_stonebrick_stairs", DARK_GLOW_STONEBRICKS.getDefaultState(), GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block DARKGLOW_BRICK_STAIRS = new BlockStairBase("darkglow_brick_stairs", DARK_GLOW_BRICKS.getDefaultState(), GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);



     public static final BlockSlab CITY_BRICK_SLAB_DOUBLE = new BlockDoubleSlab("city_brick_double", Material.ROCK, CreativeTabs.SEARCH, ModBlocks.CITY_BRICK_SLAB_HALF, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab CITY_BRICK_SLAB_HALF = new BlockHalfSlab("city_brick_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.CITY_BRICK_SLAB_HALF, ModBlocks.CITY_BRICK_SLAB_DOUBLE, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab CITY_BRICK_SLAB_DOUBLE_ALT = new BlockDoubleSlab("city_brick_alt_double", Material.ROCK, CreativeTabs.SEARCH, ModBlocks.CITY_BRICK_SLAB_HALF_ALT, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab CITY_BRICK_SLAB_HALF_ALT = new BlockHalfSlab("city_brick_alt_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.CITY_BRICK_SLAB_HALF_ALT, ModBlocks.CITY_BRICK_SLAB_DOUBLE_ALT, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab CITY_TILE_SLAB_DOUBLE = new BlockDoubleSlab("city_tile_double", Material.ROCK, CreativeTabs.SEARCH, ModBlocks.CITY_TILE_SLAB_HALF, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab CITY_TILE_SLAB_HALF = new BlockHalfSlab("city_tile_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.CITY_TILE_SLAB_HALF, ModBlocks.CITY_TILE_SLAB_DOUBLE, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);

     public static final BlockSlab GOLD_CITY_BRICK_SLAB_DOUBLE = new BlockDoubleSlab("gold_city_brick_double", Material.ROCK, CreativeTabs.SEARCH, ModBlocks.GOLD_CITY_BRICK_SlAB_HALF, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab GOLD_CITY_BRICK_SlAB_HALF = new BlockHalfSlab("gold_city_brick_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.GOLD_CITY_BRICK_SlAB_HALF, ModBlocks.GOLD_CITY_BRICK_SLAB_DOUBLE, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);

     public static final BlockSlab PETROGLOOM_STONE_SLAB_DOUBLE = new BlockDoubleSlab("gloom_stone_double", Material.ROCK, CreativeTabs.SEARCH, ModBlocks.PETROGLOOM_STONE_SlAB_HALF, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab PETROGLOOM_STONE_SlAB_HALF = new BlockHalfSlab("gloom_stone_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.PETROGLOOM_STONE_SlAB_HALF, ModBlocks.PETROGLOOM_STONE_SLAB_DOUBLE, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab COLD_PETROGLOOM_STONE_SLAB_DOUBLE = new BlockDoubleSlab("cold_stone_double", Material.ROCK, CreativeTabs.SEARCH, ModBlocks.COLD_PETROGLOOM_STONE_SlAB_HALF, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab COLD_PETROGLOOM_STONE_SlAB_HALF = new BlockHalfSlab("cold_stone_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.COLD_PETROGLOOM_STONE_SlAB_HALF, ModBlocks.COLD_PETROGLOOM_STONE_SLAB_DOUBLE, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab PETROGLOOM_SMOOTH_SLAB_DOUBLE = new BlockDoubleSlab("gloom_smooth_double", Material.ROCK, CreativeTabs.SEARCH, ModBlocks.PETROGLOOM_SMOOTH_SLAB_HALF, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab PETROGLOOM_SMOOTH_SLAB_HALF = new BlockHalfSlab("gloom_smooth_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.PETROGLOOM_SMOOTH_SLAB_HALF, ModBlocks.PETROGLOOM_SMOOTH_SLAB_DOUBLE, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab COLD_PETROGLOOM_SMOOTH_SLAB_DOUBLE = new BlockDoubleSlab("cold_smooth_double", Material.ROCK, CreativeTabs.SEARCH, ModBlocks.COLD_PETROGLOOM_SMOOTH_SLAB_HALF, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab COLD_PETROGLOOM_SMOOTH_SLAB_HALF = new BlockHalfSlab("cold_smooth_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.COLD_PETROGLOOM_SMOOTH_SLAB_HALF, ModBlocks.COLD_PETROGLOOM_SMOOTH_SLAB_DOUBLE, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab PETROGLOOM_BRICK_SLAB_DOUBLE = new BlockDoubleSlab("gloom_brick_double", Material.ROCK, CreativeTabs.SEARCH, ModBlocks.PETROGLOOM_BRICK_SLAB_HALF, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab PETROGLOOM_BRICK_SLAB_HALF = new BlockHalfSlab("gloom_brick_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.PETROGLOOM_BRICK_SLAB_HALF, ModBlocks.PETROGLOOM_BRICK_SLAB_DOUBLE, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab FIRE_STONE_SLAB_DOUBLE = new BlockDoubleSlab("fire_stone_double", Material.ROCK, CreativeTabs.SEARCH, ModBlocks.FIRE_STONE_SLAB_HALF, STONE_HARDNESS, OBSIDIAN_RESISTANCE, SoundType.STONE);
     public static final BlockSlab FIRE_STONE_SLAB_HALF = new BlockHalfSlab("fire_stone_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.FIRE_STONE_SLAB_HALF, ModBlocks.FIRE_STONE_SLAB_DOUBLE, STONE_HARDNESS, OBSIDIAN_RESISTANCE, SoundType.STONE);
     public static final BlockSlab COLD_PETROGLOOM_BRICK_SLAB_DOUBLE = new BlockDoubleSlab("cold_brick_double", Material.ROCK, CreativeTabs.SEARCH, ModBlocks.COLD_PETROGLOOM_BRICK_SLAB_HALF, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab COLD_PETROGLOOM_BRICK_SLAB_HALF = new BlockHalfSlab("cold_brick_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.COLD_PETROGLOOM_BRICK_SLAB_HALF, ModBlocks.COLD_PETROGLOOM_BRICK_SLAB_DOUBLE, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab GRUM_BRICK_DOUBLE = new BlockDoubleSlab("grum_brick_double", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.GRUM_BRICK_HALF, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.GRUM_STONE);
     public static final BlockSlab GRUM_BRICK_HALF = new BlockHalfSlab("grum_brick_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.GRUM_BRICK_HALF, ModBlocks.GRUM_BRICK_DOUBLE, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.GRUM_STONE);
     public static final BlockSlab DUNGEON_BRICK_DOUBLE = new BlockDoubleSlab("dungeon_brick_double", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.DUNGEON_BRICK_HALF, STONE_HARDNESS, STONE_RESISTANCE, SoundType.STONE);
     public static final BlockSlab DUNGEON_BRICK_HALF = new BlockHalfSlab("dungeon_brick_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.DUNGEON_BRICK_HALF, ModBlocks.DUNGEON_BRICK_DOUBLE, STONE_HARDNESS, STONE_RESISTANCE, SoundType.STONE);
     public static final BlockSlab DARKGLOW_STONEBRICK_DOUBLE = new BlockDoubleSlab("darkglow_stonebrick_double", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.DARKGLOW_STONEBRICK_HALF, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab DARKGLOW_STONEBRICK_HALF = new BlockHalfSlab("darkglow_stonebrick_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.DARKGLOW_STONEBRICK_HALF, ModBlocks.DARKGLOW_STONEBRICK_DOUBLE, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab DARKGLOW_BRICK_DOUBLE = new BlockDoubleSlab("darkglow_brick_double", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.DARKGLOW_BRICK_HALF, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);
     public static final BlockSlab DARKGLOW_BRICK_HALF = new BlockHalfSlab("darkglow_brick_half", Material.ROCK, DungeonAdditionsTab.BLOCKS, ModBlocks.DARKGLOW_BRICK_HALF, ModBlocks.DARKGLOW_BRICK_DOUBLE, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM);

     public static final Block PETROGLOOM_STONE_WALL = new BlockWallBase("gloom_stone_wall", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block COLD_PETROGLOOM_STONE_WALL = new BlockWallBase("cold_stone_wall", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block PETROGLOOM_SMOOTH_WALL = new BlockWallBase("gloom_smooth_wall", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block COLD_PETROGLOOM_SMOOTH_WALL = new BlockWallBase("cold_smooth_wall", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block PETROGLOOM_BRICK_WALL = new BlockWallBase("gloom_brick_wall", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block COLD_PETROGLOOM_BRICK_WALL = new BlockWallBase("cold_brick_wall", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block CITY_BRICK_WALL = new BlockWallBase("city_brick_wall", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block CITY_BRICK_WALL_ALT = new BlockWallBase("city_brick_wall_alt", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block CITY_TILE_WALL = new BlockWallBase("city_tile_wall", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block CITY_SMOOTH_WALL = new BlockWallBase("city_smooth_wall", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block GOLD_CITY_WALL = new BlockWallBase("gold_city_brick_wall", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block GRUM_BRICK_WALL = new BlockWallBase("grum_brick_wall", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.GRUM_STONE).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block DUNGEON_BRICK_WALL = new BlockWallBase("dungeon_brick_wall", Material.ROCK, STONE_HARDNESS, STONE_RESISTANCE, SoundType.STONE).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block DARKGLOW_BRICK_WALL = new BlockWallBase("darkglow_brick_wall", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     public static final Block DARKGLOW_STONEBRICK_WALL = new BlockWallBase("darkglow_stonebrick_wall", Material.ROCK, GLOOM_STONE_HARDNESS, GLOOM_STONE_RESITANCE, BOMDSoundTypes.PETRO_GLOOM).setCreativeTab(DungeonAdditionsTab.BLOCKS);
     */



    public static final Block STRAULKITE_STONE = new BlockBase("straulkite_stone", Material.ROCK).setHardness(50.0F).setResistance(2000.0F);
    public static final Block STRAULKITE_SMOOTH = new BlockBase("straulkite_smooth", Material.ROCK).setHardness(50.0F).setResistance(2000.0F);
    //public static final Block STRAULKITE_SMOOTH_STAIRS = new BlockStairBase("straulkite_smooth_stairs");
    public static final Block STRAULKITE_BRICK = new BlockBase("straulkite_brick", Material.ROCK).setHardness(50.0F).setResistance(2000.0F);
    public static final Block STRAULKITE_BRICK_CHISELED = new BlockBase("straulkite_brick_chiseled", Material.ROCK).setHardness(50.0F).setResistance(2000.0F);
    public static final Block STRAULKITE_TILE = new BlockBase("straulkite_tile", Material.ROCK).setHardness(50.0F).setResistance(2000.0F);
    public static final Block STRAULOK_BIOMASS = new BlockBase("straulok_biomass", Material.GOURD).setLightLevel(0.5F).setHardness(1.0F);
}
