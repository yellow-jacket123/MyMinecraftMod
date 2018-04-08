package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) 
    {
    	
    }

    public void init(FMLInitializationEvent e) 
    {
    
    }

    public void postInit(FMLPostInitializationEvent e) 
    {
    	
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) 
    {
    	event.getRegistry().register(new SorensBlock().setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
    	event.getRegistry().register(new SorensBlueBlock().setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
    	event.getRegistry().register(new PurpleBlock().setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
    	event.getRegistry().register(new SorenOre().setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) 
    {
    	event.getRegistry().register(new ItemBlock(ModBlocks.sorensBlock).setRegistryName(ModBlocks.sorensBlock.getRegistryName()).setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
    	event.getRegistry().register(new ItemBlock(ModBlocks.sorensBlueBlock).setRegistryName(ModBlocks.sorensBlueBlock.getRegistryName()).setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
    	event.getRegistry().register(new ItemBlock(ModBlocks.purpleBlock).setRegistryName(ModBlocks.purpleBlock.getRegistryName()).setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
    	event.getRegistry().register(new ItemBlock(ModBlocks.sorenOre).setRegistryName(ModBlocks.sorenOre.getRegistryName()).setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
    	event.getRegistry().register(new SorensItem().setCreativeTab(CreativeTabs.COMBAT));
    	event.getRegistry().register(new SorensSecondItem().setCreativeTab(CreativeTabs.TOOLS));
    	event.getRegistry().register(new ThirdSorensItem().setCreativeTab(CreativeTabs.TOOLS));
    	event.getRegistry().register(new AnotherItem().setCreativeTab(CreativeTabs.TOOLS));
    	event.getRegistry().register(new SorensFood(10, 2, true).setCreativeTab(CreativeTabs.FOOD));
    	event.getRegistry().register(new ItemChips(10, 2, true).setCreativeTab(CreativeTabs.FOOD));
    	event.getRegistry().register(new SorensHelmet(ArmorMaterial.DIAMOND, 0, EntityEquipmentSlot.HEAD).setCreativeTab(CreativeTabs.COMBAT));
    	event.getRegistry().register(new SorenIngot().setCreativeTab(CreativeTabs.MATERIALS));
    	event.getRegistry().register(new SorensChestplate(ArmorMaterial.DIAMOND, 0, EntityEquipmentSlot.CHEST).setCreativeTab(CreativeTabs.COMBAT));
    	event.getRegistry().register(new SorensLeggings(ArmorMaterial.DIAMOND, 0, EntityEquipmentSlot.LEGS).setCreativeTab(CreativeTabs.COMBAT));
    	event.getRegistry().register(new SorensBoots(ArmorMaterial.DIAMOND, 0, EntityEquipmentSlot.FEET).setCreativeTab(CreativeTabs.COMBAT));
    }
}




