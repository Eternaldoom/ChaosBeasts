package com.chaosmodders.chaosbeasts.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

public class ChaosArmor extends ItemArmor
{
	public String itemTexture;
	public String armorTexture;
	
	public ChaosArmor(ItemArmor.ArmorMaterial mat, int slot, String icon, String model)
	{
		 super(mat, 1, slot);
		 this.itemTexture = icon;
		 this.armorTexture = model;
		 this.setCreativeTab(ChaosTabs.tabChaosCombat);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
	  {
	    if (slot == 2) {
	      return "doomsmod:textures/armor/" + this.armorTexture + "_2.png";
	    }

	    return "doomsmod:textures/armor/" + this.armorTexture + "_1.png";
	  }
}
