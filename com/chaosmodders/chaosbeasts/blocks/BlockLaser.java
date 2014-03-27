package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

public class BlockLaser extends Block {
	private int counter;
	
	/*
	 * Note that when setting this, the following is true:
	 * u means up
	 * d means down
	 * n means north
	 * s means south
	 * w means west
	 * e means east
	 * 
	 * Based on this metadata value, we can make the block point in different directions.
	 */
	private char facing;
	
	public BlockLaser()
	{
		super(Material.iron);
		this.setBlockTextureName("chaosbeasts:laser_top");
		this.setHardness(15.0F);
		this.setResistance(0.1F);
	    this.setBlockName("laserSource");


		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
	}
	
	public void onBlockAdded(World p_149726_1_, int i, int j, int k)
    {
		
		
        if (!p_149726_1_.isRemote)
        {
            if (!p_149726_1_.isBlockIndirectlyGettingPowered(i, j, k))
            {
                p_149726_1_.scheduleBlockUpdate(i, j, k, this, 4);
            }
            else if (p_149726_1_.isBlockIndirectlyGettingPowered(i, j, k))
            {
                this.updateLaser(p_149726_1_, i, j, k, true);
            }
        }
    }
	
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
	{
	int l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;

	switch (l)
	{
	case 0:
	world.setBlockMetadataWithNotify(i, j, k, 2);
	break;

	case 1:
	world.setBlockMetadataWithNotify(i, j, k, 5);
	break;

	case 2:
	world.setBlockMetadataWithNotify(i, j, k, 3);
	break;

	case 3:
	world.setBlockMetadataWithNotify(i, j, k, 4);
	break;
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
            if (!p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_))
            {
                p_149695_1_.scheduleBlockUpdate(p_149695_2_, p_149695_3_, p_149695_4_, this, 4);
            }
            else if (p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_))
            {
                this.updateLaser(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, true);
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1world, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (!par1world.isRemote && !par1world.isBlockIndirectlyGettingPowered(p_149674_2_, p_149674_3_, p_149674_4_))
        {
            this.updateLaser(par1world, p_149674_2_, p_149674_3_, p_149674_4_, false);
        }
    }
    public void updateLaser(World world, int x, int y, int z, boolean on) {
    	counter = 0;
    	if (on == true) {
    	    while (counter < 1000) {
    		    counter++;
    		       if (world.getBlock(x + counter, y, z) == Blocks.air) {
    		    	world.setBlock(x + counter, y, z, ChaosBlocks.LaserBeam);
    		       }
    		       else {
    		     	break;
    		       }
    	    }
        }
    	else {
        	while (counter < 1000) {
        		counter++;
        		if (world.getBlock(x + counter, y, z) == ChaosBlocks.LaserBeam) {
        			world.setBlock(x + counter, y, z, Blocks.air);
        		}
        		else {
        			break;
        		}
        	}
    	}
    }
}
