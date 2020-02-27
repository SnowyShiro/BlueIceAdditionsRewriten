package com.snowyshiro.blueiceadditions.objects.blocks.slab;

import com.snowyshiro.blueiceadditions.Main;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DoubleSlabBase extends SlabBase
{
    public DoubleSlabBase(String name, Material material, CreativeTabs tab, BlockSlab half)
    {
        super(name, material, half);
        setCreativeTab(Main.tabBlueIceAdditions);
    }

    @Override
    public boolean isDouble()
    {
        return true;
    }
}