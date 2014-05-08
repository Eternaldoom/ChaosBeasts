package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;
import com.chaosmodders.chaosbeasts.items.ChaosItems;

public class BlockRubyOre extends Block
{
    private static final String __OBFID = "CL_00000317";
	
    public BlockRubyOre()
    {
        super(Material.rock);
        this.setCreativeTab(ChaosTabs.tabChaosBlocks);
    }
    public int func_149745_a(Random p_149745_1_)
    {
        return 1;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ChaosItems.ItemRuby;
    }
}
