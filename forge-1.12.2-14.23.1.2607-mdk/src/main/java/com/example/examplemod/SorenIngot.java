package com.example.examplemod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SorenIngot extends Item {
	
	public SorenIngot() {
        setRegistryName("soreningot");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(ExampleMod.MODID + ".soreningot");     // Used for localization (en_US.lang)
        
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }


}
