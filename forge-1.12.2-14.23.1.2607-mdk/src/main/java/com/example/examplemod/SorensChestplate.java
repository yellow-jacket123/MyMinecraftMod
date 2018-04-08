package com.example.examplemod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SorensChestplate extends ItemArmor {
	
	public SorensChestplate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(ArmorMaterial.DIAMOND, 0, EntityEquipmentSlot.CHEST);
		
		setRegistryName("sorenschestplate");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(ExampleMod.MODID + ".sorenschestplate");     // Used for localization (en_US.lang)
	}
	 @SideOnly(Side.CLIENT)
	    public void initModel() {
	        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

}
