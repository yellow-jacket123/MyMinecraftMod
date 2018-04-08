package com.example.examplemod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks 
{

    @GameRegistry.ObjectHolder("examplemod:sorensblock")
    public static SorensBlock sorensBlock;
    
    @GameRegistry.ObjectHolder("examplemod:sorensblueblock")
    public static SorensBlueBlock sorensBlueBlock;
    
    @GameRegistry.ObjectHolder("examplemod:purpleblock")
    public static PurpleBlock purpleBlock;
    
    @GameRegistry.ObjectHolder("examplemod:sorenOre")
    public static SorenOre sorenOre;
    
    @SideOnly(Side.CLIENT)
    public static void initModels() 
    {
    	sorensBlock.initModel();
    	sorensBlueBlock.initModel();
    	purpleBlock.initModel();
    	sorenOre.initModel();
    }

}