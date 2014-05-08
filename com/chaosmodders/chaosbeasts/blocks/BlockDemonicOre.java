package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;
import com.chaosmodders.chaosbeasts.items.ChaosItems;

public class BlockDemonicOre extends Block
{
	public BlockDemonicOre()
	{
		super(Material.rock);
		this.setCreativeTab(ChaosTabs.tabChaosMaterials);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ChaosItems.ItemDemonicShard;
    }
}
