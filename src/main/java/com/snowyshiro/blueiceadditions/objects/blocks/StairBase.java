package com.snowyshiro.blueiceadditions.objects.blocks;

import com.snowyshiro.blueiceadditions.Main;
import com.snowyshiro.blueiceadditions.init.BlockInit;
import com.snowyshiro.blueiceadditions.init.ItemInit;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;

public class StairBase extends BlockStairs
{
    public StairBase(String name, IBlockState modelState, float hardness, float resistance, SoundType sound, String toolClass, int level, float slipperiness)
    {
        super(modelState);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tabBlueIceAdditions);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(sound);
        setHarvestLevel(toolClass, level);
        setDefaultSlipperiness(slipperiness);
        this.useNeighborBrightness = true;

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
}
