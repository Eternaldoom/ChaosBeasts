package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;
import com.chaosmodders.chaosbeasts.generic.ChaosHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockLaserBeam extends Block {
	private int counter;
	public BlockLaserBeam()
	{
		super(ChaosHelper.gas);
		this.setBlockTextureName("chaosbeasts:ruby_block");
		this.setHardness(15.0F);
		this.setResistance(0.1F);
		this.setLightLevel(0.8F);
		this.setBlockName("laserBeam");
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
		
        this.setBlockBounds(0.0F, 0.3F, 0.3F, 1.0F, 0.6F, 0.6F);
	}
	
    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
	@Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	@Override
	public boolean isOpaqueCube()
    {
        return false;
    }
    
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }
	
	@Override
	public void onBlockAdded(World p_149726_1_, int i, int j, int k)
    {
        if (!p_149726_1_.isRemote)
        {
            p_149726_1_.scheduleBlockUpdate(i, j, k, this, 4);
        }
    }
	
	@Override
	public void updateTick(World par1world, int x, int y, int z, Random par5random)
    {
        if (par1world.getBlock(x - 1, y, z) != ChaosBlocks.LaserBeam && par1world.getBlock(x - 1, y, z) != ChaosBlocks.LaserSource)
        {
        	counter = 0;
        	while (par1world.getBlock(x + counter, y, z) == ChaosBlocks.LaserBeam) {
                par1world.setBlock(x + counter, y, z, Blocks.air);
                counter++;
        	}
        }
        else if (par1world.getBlock(x + 1, y, z) == Blocks.air) {
        	counter = 0;
        	while (par1world.getBlock(x + counter, y, z) == Blocks.air) {
                par1world.setBlock(x + counter, y, z, ChaosBlocks.LaserBeam);
                counter++;
        	}
        }
    }
	
	@Override
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        if (!p_149695_1_.isRemote)
        {
        	p_149695_1_.scheduleBlockUpdate(p_149695_2_, p_149695_3_, p_149695_4_, this, 4);
        }
    }
	
	
}