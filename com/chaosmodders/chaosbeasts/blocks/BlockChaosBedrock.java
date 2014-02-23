package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockChaosBedrock extends Block
{

	public BlockChaosBedrock()
	{
		super(Material.rock);
		this.setHardness(5000.0F);
		this.setResistance(6000000.0F);
		this.setHarvestLevel("pickaxe", 350);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("bedrock");
		this.setBlockTextureName("bedrock");
	}
}