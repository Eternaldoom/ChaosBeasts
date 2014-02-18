package com.chaosmodders.chaosbeasts.generic;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.util.EnumHelper;

public class ChaosHelper
{	
	public static ArmorMaterial addArmorMaterial(String name, int durability, int[] oldArmor, int enchantability)
	{
		int duraNew = (int) Math.round(durability/13.75);
        return EnumHelper.addEnum(ArmorMaterial.class, name, duraNew, oldArmor, enchantability);
    }
	
	public static DamageSource chaossword = new DamageSource("chaosbeasts.sword");
}
