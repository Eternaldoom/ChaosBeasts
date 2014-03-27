package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BlockLaserBeam extends Block{
	public BlockLaserBeam()
	{
		super(Material.vine);
		this.setBlockTextureName("chaosbeasts:ruby_block");
		this.setHardness(15.0F);
		this.setResistance(0.1F);
		this.setBlockName("laserBeam");
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
        }
    }
	
	public void updateTick(World par1world, int p_149674_2_, int p_149674_3_, int p_149674_4_)
    {
        if (par1world.getBlock(p_149674_2_, p_149674_3_, p_149674_4_) != this || par1world.getBlock(p_149674_2_, p_149674_3_, p_149674_4_) != ChaosBlocks.LaserSource)
        {
            par1world.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, Blocks.air);
        }
    }
}





