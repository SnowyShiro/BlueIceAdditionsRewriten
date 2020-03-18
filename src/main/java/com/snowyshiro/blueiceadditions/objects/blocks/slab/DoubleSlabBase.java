package com.snowyshiro.blueiceadditions.objects.blocks.slab;

import com.snowyshiro.blueiceadditions.Main;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DoubleSlabBase extends SlabBase
{
    public DoubleSlabBase(String name, Material material, CreativeTabs tab, BlockSlab half, float hardness, float resistance, SoundType sound, String toolClass, int level, float slipperiness)
    {
        super(name, material, half, tab, hardness, resistance, sound, toolClass, level, slipperiness);
        setCreativeTab(Main.tabBlueIceAdditions);
    }

    @Override
    public boolean isDouble()
    {
        return true;
    }
}