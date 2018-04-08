package com.example.examplemod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AnotherItem extends ItemSpade {

	public AnotherItem() {
    	super(ToolMaterial.GOLD);
        setRegistryName("anotheritem");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(ExampleMod.MODID + ".anotheritem");     // Used for localization (en_US.lang)
        
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	
}
