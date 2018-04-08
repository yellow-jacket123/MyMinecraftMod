package com.example.examplemod;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {
	
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 4, 2591, 12.0F, 4.0F, 38);
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", ExampleMod.MODID + ":copper", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

}
