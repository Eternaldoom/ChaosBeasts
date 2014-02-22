package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockLightStone extends Block
{
	protected BlockLightStone()
	{
		super(Material.rock);
		this.setBlockName("lightStone");
		this.setBlockTextureName("chaosbeasts:light_stone");
		this.setHardness(0.01F);
		this.setResistance(1000000.0F);
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(ChaosBlocks.blockLightCobblestone);
    }
}
