package com.snowyshiro.blueiceadditions;

import com.snowyshiro.blueiceadditions.init.ItemInit;
import com.snowyshiro.blueiceadditions.proxy.CommonProxy;
import com.snowyshiro.blueiceadditions.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
    @Mod.Instance
    public static Main Instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {}
    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {}
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}

    public static CreativeTabs tabBlueIceAdditions = new CreativeTabs("Blue_Ice_Additions") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemInit.BLUE_ICE_SHARD);
        }
    };
}
