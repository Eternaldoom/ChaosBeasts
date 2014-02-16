package com.doomturd.doomsmod.items;

import com.doomturd.doomsmod.generic.ChaosTabs;

import net.minecraft.item.ItemFood;

public class ChaosFood extends ItemFood
{

	public ChaosFood(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setCreativeTab(ChaosTabs.tabDoomMaterials);
	}

}
