package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SorenOre extends Block {

	public SorenOre() {
		super(Material.ROCK);
		
		
		setRegistryName("sorenore");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(ExampleMod.MODID + ".sorenore");     // Used for localization (en_US.lang)
		
	}	
	 @SideOnly(Side.CLIENT)
	    public void initModel() {
		 	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	    }
}
