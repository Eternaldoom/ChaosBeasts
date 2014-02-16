package com.doomturd.doomsmod.items;

import com.doomturd.doomsmod.generic.DoomTabs;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class DoomAxe extends ItemAxe
{
	public DoomAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		this.setCreativeTab(DoomTabs.tabDoomTools);
	}
}