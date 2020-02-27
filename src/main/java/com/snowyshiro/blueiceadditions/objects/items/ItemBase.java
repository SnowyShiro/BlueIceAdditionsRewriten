package com.snowyshiro.blueiceadditions.objects.items;

import com.snowyshiro.blueiceadditions.Main;
import com.snowyshiro.blueiceadditions.init.ItemInit;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tabBlueIceAdditions);

        ItemInit.ITEMS.add(this);
    }
}
