package com.snowyshiro.blueiceadditions.objects.tools;

import com.snowyshiro.blueiceadditions.Main;
import com.snowyshiro.blueiceadditions.init.ItemInit;

import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword
{

    public ToolSword(String name, ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tabBlueIceAdditions);

        ItemInit.ITEMS.add(this);
    }
}
