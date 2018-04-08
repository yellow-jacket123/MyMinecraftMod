package com.example.examplemod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SorensSecondItem extends ItemPickaxe {
	
	public SorensSecondItem() {
    	super(ToolMaterial.DIAMOND);
        setRegistryName("sorensseconditem");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(ExampleMod.MODID + ".sorensseconditem");     // Used for localization (en_US.lang)
        
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}