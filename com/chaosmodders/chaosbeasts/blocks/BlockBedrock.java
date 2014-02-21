package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBedrock extends Block
{

	protected BlockBedrock()
	{
		super(Material.rock);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
	}
}
