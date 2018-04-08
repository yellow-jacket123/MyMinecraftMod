package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PurpleBlock extends Block {

	public PurpleBlock() {
		
		 super(Material.IRON);
	        setUnlocalizedName(ExampleMod.MODID + ".purpleblock");     // Used for localization (en_US.lang)
	        setRegistryName("purpleblock");
	}
	
	@SideOnly(Side.CLIENT)
   public void initModel() {
       ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
   }
	
}
