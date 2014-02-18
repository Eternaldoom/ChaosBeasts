package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockDarknessStone extends Block {

	public BlockDarknessStone()
	{
		super(Material.rock);
		this.setBlockTextureName("chaosbeasts:darkness_stone");
		this.setHardness(15.0F);
		this.setResistance(0.1F);
		this.setBlockName("darknessStone");
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(ChaosBlocks.blockDarkCobblestone);
    }
}
