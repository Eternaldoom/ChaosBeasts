package com.chaosmodders.chaosbeasts.generic;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.FMLCommonHandler;

public class ChaosHelper
{	
	public static ArmorMaterial addArmorMaterial(String name, int durability, int[] oldArmor, int enchantability)
	{
		int duraNew = (int) Math.round(durability/13.75);
        return EnumHelper.addEnum(ArmorMaterial.class, name, duraNew, oldArmor, enchantability);
    }
	
	public static void addArmorEvents(Object evt){
		FMLCommonHandler.instance().bus().register(evt);
	}
	
	public static DamageSource chaossword = new DamageSource("chaosbeasts.sword");
	public static DamageSource radiation = new DamageSource("chaosbeasts.radiation");
	
	public static final ResourceLocation energyReactor	= new ResourceLocation("chaosbeasts:textures/gui/energy_reactor.png");
	
	public static final Material gas = (new MaterialLiquid(MapColor.waterColor));
}
