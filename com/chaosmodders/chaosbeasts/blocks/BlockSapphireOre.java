package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;
import com.chaosmodders.chaosbeasts.items.ChaosItems;

public class BlockSapphireOre extends Block
{	
    public BlockSapphireOre()
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
        return ChaosItems.ItemSapphire;
    }
}
