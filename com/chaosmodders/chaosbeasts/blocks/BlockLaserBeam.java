package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.generic.ChaosHelper;
import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLaserBeam extends Block {
	private int counter;
	private int shouldCounter;
	private int direction;
	public BlockLaserBeam(int theDirection)
	{
		super(ChaosHelper.gas);
		this.setBlockTextureName("chaosbeasts:laser_beam");
		this.setHardness(15.0F);
		this.setResistance(0.1F);
		this.setLightLevel(0.8F);
		this.setBlockName("laserBeam");
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
		
		if(theDirection == 4 || theDirection == 5){
        this.setBlockBounds(0.0F, 0.3F, 0.3F, 1.0F, 0.6F, 0.6F);
		}
		else if(theDirection == 2 || theDirection == 3){
	        this.setBlockBounds(0.3F, 0.3F, 0.0F, 0.6F, 0.6F, 1.0F);
			}
        
        direction = theDirection;
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
	@SideOnly(Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World p_149633_1_, int p_149633_2_, int p_149633_3_, int p_149633_4_)
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
		//Positive X
		if(direction == 5){
        if (par1world.getBlock(x - 1, y, z) != ChaosBlocks.LaserBeamPlusX && par1world.getBlock(x - 1, y, z) != ChaosBlocks.LaserSource)
        {
        	counter = 0;
        	while (par1world.getBlock(x + counter, y, z) == ChaosBlocks.LaserBeamPlusX) {
                par1world.setBlock(x + counter, y, z, Blocks.air);
                counter++;
        	}
        }
        else if (par1world.getBlock(x + 1, y, z) == Blocks.air) {
        	counter = 1;
        	while (par1world.getBlock(x - counter, y, z) != ChaosBlocks.LaserSource) {
        		counter++;
        	}
        	shouldCounter = counter;
        	counter = 1;
        	while (par1world.getBlock(x + counter, y, z) == Blocks.air && counter < shouldCounter) {
                par1world.setBlock(x + counter, y, z, ChaosBlocks.LaserBeamPlusX);
                counter++;
        	}
        }
		}
		//Negative X
		if(direction == 4){
	        if (par1world.getBlock(x + 1, y, z) != ChaosBlocks.LaserBeamMinusX && par1world.getBlock(x + 1, y, z) != ChaosBlocks.LaserSource)
	        {
	        	counter = 0;
	        	while (par1world.getBlock(x - counter, y, z) == ChaosBlocks.LaserBeamMinusX) {
	                par1world.setBlock(x - counter, y, z, Blocks.air);
	                counter++;
	        	}
	        }
	        else if (par1world.getBlock(x - 1, y, z) == Blocks.air) {
	        	counter = 1;
	        	while (par1world.getBlock(x + counter, y, z) != ChaosBlocks.LaserSource) {
	        		counter++;
	        	}
	        	shouldCounter = counter;
	        	counter = 1;
	        	while (par1world.getBlock(x - counter, y, z) == Blocks.air && counter < shouldCounter) {
	                par1world.setBlock(x - counter, y, z, ChaosBlocks.LaserBeamMinusX);
	                counter++;
	        	}
	        }
			}
		//Positive Z
		if(direction == 3){
	        if (par1world.getBlock(x, y, z - 1) != ChaosBlocks.LaserBeamPlusZ && par1world.getBlock(x, y, z - 1) != ChaosBlocks.LaserSource)
	        {
	        	counter = 0;
	        	while (par1world.getBlock(x, y, z + counter) == ChaosBlocks.LaserBeamPlusZ) {
	                par1world.setBlock(x, y, z + counter, Blocks.air);
	                counter++;
	        	}
	        }
	        else if (par1world.getBlock(x, y, z + 1) == Blocks.air) {
	        	counter = 1;
	        	while (par1world.getBlock(x, y, z - counter) != ChaosBlocks.LaserSource) {
	        		counter++;
	        	}
	        	shouldCounter = counter;
	        	counter = 1;
	        	while (par1world.getBlock(x, y, z + counter) == Blocks.air && counter < shouldCounter) {
	                par1world.setBlock(x, y, z + counter, ChaosBlocks.LaserBeamPlusZ);
	                counter++;
	        	}
	        }
			}
		
		//Negative Z
				if(direction == 2){
			        if (par1world.getBlock(x, y, z + 1) != ChaosBlocks.LaserBeamMinusZ && par1world.getBlock(x, y, z + 1) != ChaosBlocks.LaserSource)
			        {
			        	counter = 0;
			        	while (par1world.getBlock(x, y, z - counter) == ChaosBlocks.LaserBeamMinusZ) {
			                par1world.setBlock(x, y, z - counter, Blocks.air);
			                counter++;
			        	}
			        }
			        else if (par1world.getBlock(x, y, z - 1) == Blocks.air) {
			        	counter = 1;
			        	while (par1world.getBlock(x, y, z + counter) != ChaosBlocks.LaserSource) {
			        		counter++;
			        	}
			        	shouldCounter = counter;
			        	counter = 1;
			        	while (par1world.getBlock(x, y, z - counter) == Blocks.air && counter < shouldCounter) {
			                par1world.setBlock(x, y, z - counter, ChaosBlocks.LaserBeamMinusZ);
			                counter++;
			        	}
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
	
	@Override
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		par5Entity.setVelocity(-1.5D * par5Entity.motionX, -2.0D * (par5Entity.motionY + 1.0D), -1.5D * par5Entity.motionZ);
		par5Entity.setFire(30);
		par5Entity.attackEntityFrom(ChaosHelper.laser, 4.0F);
	}
}