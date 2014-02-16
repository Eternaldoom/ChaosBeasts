package com.doomturd.doomsmod.items;

import com.doomturd.doomsmod.generic.DoomTabs;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class DoomPick extends ItemPickaxe
{

	public DoomPick(ToolMaterial p_i45347_1_)
	{
		super(p_i45347_1_);
		this.setCreativeTab(DoomTabs.tabDoomTools);
	}
}