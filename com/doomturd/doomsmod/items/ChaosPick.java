package com.doomturd.doomsmod.items;

import com.doomturd.doomsmod.generic.ChaosTabs;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ChaosPick extends ItemPickaxe
{

	public ChaosPick(ToolMaterial p_i45347_1_)
	{
		super(p_i45347_1_);
		this.setCreativeTab(ChaosTabs.tabDoomTools);
	}
}