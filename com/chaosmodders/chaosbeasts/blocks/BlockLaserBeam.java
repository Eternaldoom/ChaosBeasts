package com.chaosmodders.chaosbeasts.blocks;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLaserBeam extends Block{
	public BlockLaserBeam()
	{
		super(Material.vine);
		this.setBlockTextureName("chaosbeasts:ruby_block");
		this.setHardness(15.0F);
		this.setResistance(0.1F);
		this.setBlockName("laserBeam");
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
	}
}





