package com.eternaldoom.chaosbeasts.items;

import com.eternaldoom.chaosbeasts.generic.ChaosTabs;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ChaosAxe extends ItemAxe
{
	public ChaosAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		this.setCreativeTab(ChaosTabs.tabDoomTools);
	}
}