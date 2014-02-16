package com.chaosmodders.chaosbeasts.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ChaosShinyArmor extends ItemArmor
{
	public String itemTexture;
	public String armorTexture;
	
	public ChaosShinyArmor(ItemArmor.ArmorMaterial mat, int slot, String icon, String model)
	{
		 super(mat, 1, slot);
		 this.itemTexture = icon;
		 this.armorTexture = model;
		 this.setCreativeTab(ChaosTabs.tabChaosCombat);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
	  {
	    if (slot == 2) {
	      return "chaosbeasts:textures/armor/" + this.armorTexture + "_2.png";
	    }

	    return "chaosbeasts:textures/armor/" + this.armorTexture + "_1.png";
	  }
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
}
