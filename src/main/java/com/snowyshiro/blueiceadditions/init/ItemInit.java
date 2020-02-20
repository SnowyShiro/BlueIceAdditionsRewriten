package com.snowyshiro.blueiceadditions.init;

import java.util.ArrayList;
import java.util.List;

import com.snowyshiro.blueiceadditions.objects.armour.ArmorBase;
import com.snowyshiro.blueiceadditions.objects.items.ItemBase;
import com.snowyshiro.blueiceadditions.objects.tools.*;
import com.snowyshiro.blueiceadditions.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    public static final Item.ToolMaterial MATERIAL_ICE = EnumHelper.addToolMaterial("material_ice", 1, 262, 5.0F, 1.0F, 10);
    public static final Item.ToolMaterial MATERIAL_PACKED_ICE = EnumHelper.addToolMaterial("material_packed_ice", 2, 500, 7.0F, 2.0F, 10);
    public static final Item.ToolMaterial MATERIAL_BLUE_ICE = EnumHelper.addToolMaterial("material_blue_ice", 3, 1561, 9.0F, 3.0F, 10);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_ICE = EnumHelper.addArmorMaterial("armor_material_ice", Reference.MODID + ":ice", 14,
            new int[] {1, 5, 4, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_PACKED_ICE = EnumHelper.addArmorMaterial("armor_material_packed_ice", Reference.MODID + ":packed_ice", 14,
            new int[] {2, 6, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_BLUE_ICE = EnumHelper.addArmorMaterial("armor_material_blue_ice", Reference.MODID + ":blue_ice", 14,
            new int[] {3, 8, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
    //Items
    public static final Item ICE_SHARD = new ItemBase("ice_shard");
    public static final Item PACKED_ICE_SHARD = new ItemBase("packed_ice_shard");
    public static final Item BLUE_ICE_SHARD = new ItemBase("blue_ice_shard");
    //Swords
    public static final ItemSword ICE_SWORD = new ToolSword("ice_sword", MATERIAL_ICE);
    public static final ItemSword PACKED_ICE_SWORD = new ToolSword("packed_ice_sword", MATERIAL_PACKED_ICE);
    public static final ItemSword BLUE_ICE_SWORD = new ToolSword("blue_ice_sword", MATERIAL_BLUE_ICE);
    //Pickaxes
    public static final ItemPickaxe ICE_PICKAXE = new ToolPickaxe("ice_pickaxe", MATERIAL_ICE);
    public static final ItemPickaxe PACKED_ICE_PICKAXE = new ToolPickaxe("packed_ice_pickaxe", MATERIAL_PACKED_ICE);
    public static final ItemPickaxe BLUE_ICE_PICKAXE = new ToolPickaxe("blue_ice_pickaxe", MATERIAL_BLUE_ICE);
    //Axes
    public static final ItemAxe ICE_AXE = new ToolAxe("ice_axe", MATERIAL_ICE);
    public static final ItemAxe PACKED_ICE_AXE = new ToolAxe("packed_ice_axe", MATERIAL_ICE);
    public static final ItemAxe BLUE_ICE_AXE = new ToolAxe("blue_ice_axe", MATERIAL_ICE);
    //Shovels (Spades)
    public static final ItemSpade ICE_SHOVEL = new ToolSpade("ice_shovel", MATERIAL_ICE);
    public static final ItemSpade PACKED_ICE_SHOVEL = new ToolSpade("packed_ice_shovel", MATERIAL_PACKED_ICE);
    public static final ItemSpade BLUE_ICE_SHOVEL = new ToolSpade("blue_ice_shovel", MATERIAL_BLUE_ICE);
    //Hoes
    public static final ItemHoe ICE_HOE = new ToolHoe("ice_hoe", MATERIAL_ICE);
    public static final ItemHoe PACKED_ICE_HOE = new ToolHoe("packed_ice_hoe", MATERIAL_PACKED_ICE);
    public static final ItemHoe BLUE_ICE_HOE = new ToolHoe("blue_ice_hoe", MATERIAL_BLUE_ICE);
    //Helmet
    public static final Item ICE_HELMET = new ArmorBase("ice_helmet", ARMOR_MATERIAL_ICE, 1, EntityEquipmentSlot.HEAD);
    public static final Item PACKED_ICE_HELMET = new ArmorBase("packed_ice_helmet", ARMOR_MATERIAL_PACKED_ICE, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLUE_ICE_HELMET = new ArmorBase("blue_ice_helmet", ARMOR_MATERIAL_BLUE_ICE, 1, EntityEquipmentSlot.HEAD);
    //Chestplate
    public static final Item ICE_CHESTPLATE = new ArmorBase("ice_chestplate", ARMOR_MATERIAL_ICE, 1, EntityEquipmentSlot.CHEST);
    public static final Item PACKED_ICE_CHESTPLATE = new ArmorBase("packed_ice_chestplate", ARMOR_MATERIAL_PACKED_ICE, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLUE_ICE_CHESTPLATE = new ArmorBase("blue_ice_chestplate", ARMOR_MATERIAL_BLUE_ICE, 1, EntityEquipmentSlot.CHEST);
    //Leggings
    public static final Item ICE_LEGGINGS = new ArmorBase("ice_leggings", ARMOR_MATERIAL_ICE, 2, EntityEquipmentSlot.LEGS);
    public static final Item PACKED_ICE_LEGGINGS = new ArmorBase("packed_ice_leggings", ARMOR_MATERIAL_PACKED_ICE, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLUE_ICE_LEGGINGS = new ArmorBase("blue_ice_leggings", ARMOR_MATERIAL_BLUE_ICE, 2, EntityEquipmentSlot.LEGS);
    //Boots
    public static final Item ICE_BOOTS = new ArmorBase("ice_boots", ARMOR_MATERIAL_ICE, 1, EntityEquipmentSlot.FEET);
    public static final Item PACKED_ICE_BOOTS = new ArmorBase("packed_ice_boots", ARMOR_MATERIAL_PACKED_ICE, 1, EntityEquipmentSlot.FEET);
    public static final Item BLUE_ICE_BOOTS = new ArmorBase("blue_ice_boots", ARMOR_MATERIAL_BLUE_ICE, 1, EntityEquipmentSlot.FEET);
}
