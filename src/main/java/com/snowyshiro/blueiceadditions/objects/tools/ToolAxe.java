package com.snowyshiro.blueiceadditions.objects.tools;

import com.snowyshiro.blueiceadditions.Main;
import com.snowyshiro.blueiceadditions.init.ItemInit;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe
{
    public ToolAxe(String name, ToolMaterial material)
    {
        super(material, 6.0F, 3.2F);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tabBlueIceAdditions);

        ItemInit.ITEMS.add(this);
    }
}