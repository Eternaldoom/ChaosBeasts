package com.eternaldoom.chaosbeasts.items;

import com.eternaldoom.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

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
	      return "doomsmod:textures/armor/" + this.armorTexture + "_2.png";
	    }

	    return "doomsmod:textures/armor/" + this.armorTexture + "_1.png";
	  }
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
}
