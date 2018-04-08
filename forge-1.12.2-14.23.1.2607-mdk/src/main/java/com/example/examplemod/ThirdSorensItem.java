package com.example.examplemod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ThirdSorensItem extends ItemAxe {

	public ThirdSorensItem() {
    	super(ToolMaterial.GOLD);
        setRegistryName("thirdsorensitem");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(ExampleMod.MODID + ".thirdsorensitem");     // Used for localization (en_US.lang)
        
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	
}
