package com.example.examplemod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems 
{
	@GameRegistry.ObjectHolder("examplemod:sorensitem")
    public static SorensItem sorensItem;
	
	@GameRegistry.ObjectHolder("examplemod:sorensseconditem")
    public static SorensSecondItem sorensSecondItem;
	
	@GameRegistry.ObjectHolder("examplemod:thirdsorensitem")
    public static ThirdSorensItem thirdSorensItem;
	
	@GameRegistry.ObjectHolder("examplemod:anotheritem")
    public static AnotherItem anotherItem;
	
	@GameRegistry.ObjectHolder("examplemod:sorensfood")
    public static SorensFood sorensFood;
	
	@GameRegistry.ObjectHolder("examplemod:itemchips")
    public static ItemChips itemChips;
	
	@GameRegistry.ObjectHolder("examplemod:sorenshelmet")
    public static SorensHelmet sorensHelmet;
	
	@GameRegistry.ObjectHolder("examplemod:soreningot")
    public static SorenIngot sorenIngot;
	
	@GameRegistry.ObjectHolder("examplemod:sorenschestplate")
    public static SorensChestplate sorensChestplate;
	
	@GameRegistry.ObjectHolder("examplemod:sorensleggings")
    public static SorensLeggings sorensLeggings;
	
	@GameRegistry.ObjectHolder("examplemod:sorensboots")
    public static SorensBoots sorensBoots;
	
	@SideOnly(Side.CLIENT)
    public static void initModels() 
    {
    	sorensItem.initModel();
    	sorensSecondItem.initModel();
    	thirdSorensItem.initModel();
    	anotherItem.initModel();
    	sorensFood.initModel();
    	itemChips.initModel();
    	sorensHelmet.initModel();
    	sorenIngot.initModel();
    	sorensChestplate.initModel();
    	sorensLeggings.initModel();
    	sorensBoots.initModel();
    }
}
