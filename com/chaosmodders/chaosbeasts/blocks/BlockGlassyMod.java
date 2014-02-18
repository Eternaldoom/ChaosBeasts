package com.chaosmodders.chaosbeasts.blocks;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGlassyMod extends Block
{

	protected BlockGlassyMod()
	{
		super(Material.glass);
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
	}

}
