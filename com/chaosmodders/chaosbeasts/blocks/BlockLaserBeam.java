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
		super(Material.cactus);
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
            p_149726_1_.scheduleBlockUpdate(i, j, k, this, 4);
        }
    }
	
	public void updateTick(World par1world, int p_149674_2_, int p_149674_3_, int p_149674_4_)
    {
        if (par1world.getBlock(p_149674_2_ + 1, p_149674_3_, p_149674_4_) != this || par1world.getBlock(p_149674_2_ + 1, p_149674_3_, p_149674_4_) != ChaosBlocks.LaserSource)
        {
            par1world.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, Blocks.air);
        }
    }
	
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        if (!p_149695_1_.isRemote)
        {
        	p_149695_1_.scheduleBlockUpdate(p_149695_2_, p_149695_3_, p_149695_4_, this, 4);
        }
    }
}





