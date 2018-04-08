package com.example.examplemod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SorensFood extends ItemFood {
	
	public SorensFood(int amount, float saturation, boolean isWolfFood) {
		super(amount = 4, saturation = 2, isWolfFood = true);
		
		setRegistryName("sorensfood");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(ExampleMod.MODID + ".sorensfood");
	}
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
