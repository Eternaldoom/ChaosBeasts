package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

public class BlockLaser extends Block {
	private final boolean field_150171_a;
	public BlockLaser(boolean isOn)
	{
		super(Material.iron);
		this.setBlockTextureName("chaosbeasts:darkness_stone");
		this.setHardness(15.0F);
		this.setResistance(0.1F);
		this.setBlockName("laserSource");
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
		this.field_150171_a = isOn;
	}
	
	public void onBlockAdded(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_)
    {
        if (!p_149726_1_.isRemote)
        {
            if (this.field_150171_a && !p_149726_1_.isBlockIndirectlyGettingPowered(p_149726_2_, p_149726_3_, p_149726_4_))
            {
                p_149726_1_.scheduleBlockUpdate(p_149726_2_, p_149726_3_, p_149726_4_, this, 4);
            }
            else if (!this.field_150171_a && p_149726_1_.isBlockIndirectlyGettingPowered(p_149726_2_, p_149726_3_, p_149726_4_))
            {
                p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, Blocks.lit_redstone_lamp, 0, 2);
            }
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor Block
     */
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        if (!p_149695_1_.isRemote)
        {
            if (this.field_150171_a && !p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_))
            {
                p_149695_1_.scheduleBlockUpdate(p_149695_2_, p_149695_3_, p_149695_4_, this, 4);
            }
            else if (!this.field_150171_a && p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_))
            {
                p_149695_1_.setBlock(p_149695_2_, p_149695_3_, p_149695_4_, Blocks.lit_redstone_lamp, 0, 2);
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (!p_149674_1_.isRemote && this.field_150171_a && !p_149674_1_.isBlockIndirectlyGettingPowered(p_149674_2_, p_149674_3_, p_149674_4_))
        {
            p_149674_1_.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, Blocks.redstone_lamp, 0, 2);
        }
    }
}
