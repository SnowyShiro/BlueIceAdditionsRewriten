package com.snowyshiro.blueiceadditions.objects.tools;

import com.snowyshiro.blueiceadditions.Main;
import com.snowyshiro.blueiceadditions.init.ItemInit;
import com.snowyshiro.blueiceadditions.util.IHasModel;

import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{

    public ToolSword(String name, ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tabBlueIceAdditions);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModel()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
