package com.chaosmodders.chaosbeasts.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.StatCollector;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

public class ChaosSword extends ItemSword
{

	public ChaosSword(ToolMaterial p_i45356_1_)
	{
		super(p_i45356_1_);
		this.setCreativeTab(ChaosTabs.tabChaosCombat);
	}
}