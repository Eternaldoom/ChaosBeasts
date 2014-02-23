package com.chaosmodders.chaosbeasts.blocks;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


/*
 * Do not delete
 * Once we add in the actual argon item it needs a special method
 * Do not get rid of this file
 */
public class BlockArgonOre extends Block {
	public BlockArgonOre() {
		super(Material.rock);
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
		this.setBlockTextureName("chaosbeasts:argon_ore");
		this.setBlockName("argonOre");
		this.setHardness(10.0F);
		this.setResistance(0.1F);
		this.setHarvestLevel("pickaxe", 10);
	}
	
}
