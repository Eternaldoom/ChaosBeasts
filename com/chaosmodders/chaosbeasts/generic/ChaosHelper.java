package com.chaosmodders.chaosbeasts.generic;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

public class ChaosHelper
{	
	public static ArmorMaterial addArmorMaterial(String name, int durability, int[] oldArmor, int enchantability)
	{
		int duraNew = (int) Math.round(durability/13.75);
        return EnumHelper.addEnum(ArmorMaterial.class, name, duraNew, oldArmor, enchantability);
    }
	
	public static DamageSource chaossword = new DamageSource("chaosbeasts.sword");
	
	public static final ResourceLocation energyReactor	= new ResourceLocation("chaosbeasts:textures/gui/energy_reactor.png");
}
