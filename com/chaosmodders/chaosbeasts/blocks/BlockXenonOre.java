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
	}
	
    public int func_149745_a(Random p_149745_1_)
    {
        return 1;
    }

    public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ChaosItems.ItemXenon;
    }
}
