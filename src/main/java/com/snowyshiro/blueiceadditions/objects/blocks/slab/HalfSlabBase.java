package com.snowyshiro.blueiceadditions.objects.blocks.slab;

import com.snowyshiro.blueiceadditions.Main;
import com.snowyshiro.blueiceadditions.init.ItemInit;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSlab;

public class HalfSlabBase extends SlabBase
{
    public HalfSlabBase(String name, Material material, CreativeTabs tab, BlockSlab half, BlockSlab doubleSlab)
    {
        super(name, material, half);
        setCreativeTab(Main.tabBlueIceAdditions);
        ItemInit.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
    }

    @Override
    public boolean isDouble()
    {
        return false;
    }
}