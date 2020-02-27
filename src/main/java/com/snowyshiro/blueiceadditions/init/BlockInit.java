package com.snowyshiro.blueiceadditions.init;

import com.snowyshiro.blueiceadditions.Main;
import com.snowyshiro.blueiceadditions.objects.blocks.StairBase;
import com.snowyshiro.blueiceadditions.objects.blocks.slab.DoubleSlabBase;
import com.snowyshiro.blueiceadditions.objects.blocks.slab.HalfSlabBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block ICE_STAIRS = new StairBase("ice_stairs", Blocks.ICE.getDefaultState(), 0.5F, 2.5F, SoundType.GLASS, "pickaxe", 0, 0.98F);
    public static final Block PACKED_ICE_STAIRS = new StairBase("packed_ice_stairs", Blocks.ICE.getDefaultState(), 0.5F, 2.5F, SoundType.GLASS, "pickaxe", 0, 0.98F);
    public static final Block BLUE_ICE_STAIRS = new StairBase("blue_ice_stairs", Blocks.ICE.getDefaultState(), 2.8F, 14.0F, SoundType.GLASS, "pickaxe", 0, 1.47F);
    public static final BlockSlab BLUE_ICE_SLAB_DOUBLE = new DoubleSlabBase("blue_ice_slab_double", Material.PACKED_ICE, Main.tabBlueIceAdditions, BlockInit.BLUE_ICE_SLAB_HALF);
    public static final BlockSlab BLUE_ICE_SLAB_HALF = new HalfSlabBase("blue_ice_slab_half", Material.PACKED_ICE, Main.tabBlueIceAdditions, BlockInit.BLUE_ICE_SLAB_DOUBLE, BlockInit.BLUE_ICE_SLAB_HALF);
}
