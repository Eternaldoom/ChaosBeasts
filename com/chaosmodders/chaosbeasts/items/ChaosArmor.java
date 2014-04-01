package com.chaosmodders.chaosbeasts.items;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ChaosArmor extends ItemArmor implements ISpecialArmor
{
	private double damageReduction;
	private String name;
	private int durability;
	private int damRe;
	public String armorTexture;

	/**
	 * Normal constructor
	 */
	public ChaosArmor(ArmorMaterial armor, int par1, int par2, double damReduct, String type)
	{
		super(armor, par1, par2);
		if (par1 == 0) {
			damageReduction = (((damReduct*4)/24)*5)/100;
		}
		else if (par1 == 1) {
			damageReduction = (((damReduct*4)/24)*8)/100;
		}
		else if (par1 == 2) {
			damageReduction = (((damReduct*4)/24)*7)/100;
		}
		else if (par1 == 3) {
			damageReduction = (((damReduct*4)/24)*4)/100;
		}

		setCreativeTab(ChaosTabs.tabChaosCombat);
		this.armorTexture = type;
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		    if (slot == 2)
		    {
		      return "chaosbeasts:textures/armor/" + this.armorTexture + "_2.png";
		    }

		    return "chaosbeasts:textures/armor/" + this.armorTexture + "_1.png";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack item, EntityPlayer par2EntityPlayer, List list, boolean par4) {
		double roundPH = Math.round(damageReduction*1000);
		double roundedDamage = roundPH/10;
		list.add("Damage Reduction: " + roundedDamage + "%");
		if (item.getMaxDamage() != -1)
		{
			list.add(item.getMaxDamage() - item.getItemDamage() + " Uses Remaining");
		}
		else
		{
			list.add("Infinite Uses");
		
		}
		if (item.getItem() == ChaosItems.leggingsEnder || item.getItem() == ChaosItems.bootsEnder || item.getItem() == ChaosItems.chestplateEnder || item.getItem() == ChaosItems.helmetEnder)
		{
			list.add("Full Set: Disables Fall Damage");
		}
	}

	@Override
	public int getArmorDisplay(EntityPlayer par1, ItemStack par2, int bars) {
		int damRe = (int) Math.round((damageReduction*100)/4); 
		return bars = damRe;
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase arg0, ItemStack arg1, DamageSource arg2, double arg3, int arg4) {
		return new ISpecialArmor.ArmorProperties(0, damageReduction, 50000);
	}


	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack,
			DamageSource source, int damage, int slot)
	{
	stack.damageItem(1, entity);
	}
}