package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

public class BlockCustom extends Block
{	
    public BlockCustom()
    {
        super(Material.rock);
        this.setCreativeTab(ChaosTabs.tabChaosBlocks);
    }
}
