package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;
import com.chaosmodders.chaosbeasts.items.ChaosItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockXenonOre extends Block {
	public BlockXenonOre() {
		super(Material.rock);
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
		this.setBlockTextureName("chaosbeasts:xenonore");
		this.setBlockName("xenonore");
		this.setHardness(25.0F);
		this.setResistance(0.1F);
		this.setHarvestLevel("pickaxe", 10);
	}

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ChaosItems.ItemXenon;
    }
}
