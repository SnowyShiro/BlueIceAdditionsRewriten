package com.snowyshiro.blueiceadditions.init;

import com.snowyshiro.blueiceadditions.objects.blocks.StairBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.init.Blocks;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLUE_ICE_STAIRS = new StairBase("blue_ice_stairs", Blocks.ICE.getDefaultState(), 2.8F, 14.0F, SoundType.GLASS, "pickaxe", 0, 0.98F);
}
