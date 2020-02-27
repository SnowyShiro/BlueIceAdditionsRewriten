package com.snowyshiro.blueiceadditions.objects.armour;

import com.snowyshiro.blueiceadditions.Main;
import com.snowyshiro.blueiceadditions.init.ItemInit;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor
{

    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tabBlueIceAdditions);

        ItemInit.ITEMS.add(this);
    }
}
