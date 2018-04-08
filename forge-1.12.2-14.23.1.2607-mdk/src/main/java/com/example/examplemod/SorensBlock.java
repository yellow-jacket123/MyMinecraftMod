package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SorensBlock extends Block {
    public SorensBlock() 
    {
        super(Material.LAVA);
        setUnlocalizedName(ExampleMod.MODID + ".sorensblock");     // Used for localization (en_US.lang)
        setRegistryName("sorensblock");                            // The unique name (within your mod) that identifies this block 
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }


}
