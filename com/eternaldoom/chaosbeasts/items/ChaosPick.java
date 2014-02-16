package com.eternaldoom.chaosbeasts.items;

import com.eternaldoom.chaosbeasts.generic.ChaosTabs;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ChaosPick extends ItemPickaxe
{

	public ChaosPick(ToolMaterial p_i45347_1_)
	{
		super(p_i45347_1_);
		this.setCreativeTab(ChaosTabs.tabChaosTools);
	}
}