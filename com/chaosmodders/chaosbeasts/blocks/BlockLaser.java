package com.chaosmodders.chaosbeasts.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLaser extends Block {
	private int counter;
	
    public static final String[] orientations = new String[] {"up", "down", "north", "south", "east", "west"};
	
	@SideOnly(Side.CLIENT)
	private IIcon[] fancyHashtag;
	
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
	//private char facing;
	
	public BlockLaser()
	{
		super(Material.iron);
		this.setBlockTextureName("chaosbeasts:laser_top");
		this.setHardness(15.0F);
		this.setResistance(0.1F);
	    this.setBlockName("laserSource");


		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
	}
	
	@Override
	public void onBlockAdded(World p_149726_1_, int i, int j, int k)
    {
		super.onBlockAdded(p_149726_1_, i, j, k);
        this.func_149930_e(p_149726_1_, i, j, k);
		
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
	
	@Override
	public void onBlockPlacedBy(World par1world, int i, int j, int k, EntityLivingBase par5entity, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        int posX = (int) Math.round(par5entity.posX);
        int posZ = (int) Math.round(par5entity.posZ);

        if (l == 0)
        {
        	par1world.setBlockMetadataWithNotify(i, j, k, 2, 2);
        }

        if (l == 1)
        {
        	par1world.setBlockMetadataWithNotify(i, j, k, 5, 2);
        }

        if (l == 2)
        {
        	par1world.setBlockMetadataWithNotify(i, j, k, 3, 2);
        }

        if (l == 3)
        {
        	par1world.setBlockMetadataWithNotify(i, j, k, 4, 2);
        }
        
        if (posX == i && posZ == k && par5entity.posY > j)
        {
        	par1world.setBlockMetadataWithNotify(i, j, k, 6, 2);
        }
        
        if (posX == i && posZ == k && par5entity.posY < j)
        {
        	par1world.setBlockMetadataWithNotify(i, j, k, 7, 2);
        }

    }
	
    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor Block
     */
	@Override
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

    private void func_149930_e(World p_149930_1_, int p_149930_2_, int p_149930_3_, int p_149930_4_)
    {
        if (!p_149930_1_.isRemote)
        {
            Block block = p_149930_1_.getBlock(p_149930_2_, p_149930_3_, p_149930_4_ - 1);
            Block block1 = p_149930_1_.getBlock(p_149930_2_, p_149930_3_, p_149930_4_ + 1);
            Block block2 = p_149930_1_.getBlock(p_149930_2_ - 1, p_149930_3_, p_149930_4_);
            Block block3 = p_149930_1_.getBlock(p_149930_2_ + 1, p_149930_3_, p_149930_4_);
            byte b0 = 3;

            if (block.func_149730_j() && !block1.func_149730_j())
            {
                b0 = 3;
            }

            if (block1.func_149730_j() && !block.func_149730_j())
            {
                b0 = 2;
            }

            if (block2.func_149730_j() && !block3.func_149730_j())
            {
                b0 = 5;
            }

            if (block3.func_149730_j() && !block2.func_149730_j())
            {
                b0 = 4;
            }

            p_149930_1_.setBlockMetadataWithNotify(p_149930_2_, p_149930_3_, p_149930_4_, b0, 2);
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
    	    while (counter < 150) {
    		    counter++;
    		    //Positive X
    		    if(world.getBlockMetadata(x, y, z) == 5){
    		       if (world.getBlock(x + counter, y, z) == Blocks.air) {
    		    	world.setBlock(x + counter, y, z, ChaosBlocks.LaserBeamPlusX);
    		       }
    		    }
    		    //Negative X
    		    if(world.getBlockMetadata(x, y, z) == 4){
     		       if (world.getBlock(x - counter, y, z) == Blocks.air) {
     		    	world.setBlock(x - counter, y, z, ChaosBlocks.LaserBeamMinusX);
     		       }
     		    }
    		    //Positive Z
    		    if(world.getBlockMetadata(x, y, z) == 3){
     		       if (world.getBlock(x, y, z + counter) == Blocks.air) {
     		    	world.setBlock(x, y, z + counter, ChaosBlocks.LaserBeamPlusZ);
     		       }
     		    }
    		    //Negative Z
    		    if(world.getBlockMetadata(x, y, z) == 2){
     		       if (world.getBlock(x, y, z - counter) == Blocks.air) {
     		    	world.setBlock(x, y, z - counter, ChaosBlocks.LaserBeamMinusZ);
     		       }
     		    }
    		    //Up
    		    if(world.getBlockMetadata(x, y, z) == 6){
      		       if (world.getBlock(x, y + counter, z) == Blocks.air) {
      		    	world.setBlock(x, y + counter, z, ChaosBlocks.LaserBeamUp);
      		       }
      		    }
    		    //Down
    		    if(world.getBlockMetadata(x, y, z) == 7){
      		       if (world.getBlock(x, y - counter, z) == Blocks.air) {
      		    	world.setBlock(x, y - counter, z, ChaosBlocks.LaserBeamDown);
      		       }
      		    }
    	    }
        }
    	else {
    		while (counter < 150) {
		    counter++;
		    //Positive X
		    if(world.getBlockMetadata(x, y, z) == 5){
		       if (world.getBlock(x + counter, y, z) == ChaosBlocks.LaserBeamPlusX) {
		    	world.setBlock(x + counter, y, z, Blocks.air);
		       }
		    }
		    //Negative X
		    if(world.getBlockMetadata(x, y, z) == 4){
 		       if (world.getBlock(x - counter, y, z) == ChaosBlocks.LaserBeamMinusX) {
 		    	world.setBlock(x - counter, y, z, Blocks.air);
 		       }
 		    }
		    //Positive Z
		    if(world.getBlockMetadata(x, y, z) == 3){
 		       if (world.getBlock(x, y, z + counter) == ChaosBlocks.LaserBeamPlusZ) {
 		    	world.setBlock(x, y, z + counter, Blocks.air);
 		       }
 		    }
		    //Negative Z
		    if(world.getBlockMetadata(x, y, z) == 2){
 		       if (world.getBlock(x, y, z - counter) == ChaosBlocks.LaserBeamMinusZ) {
 		    	world.setBlock(x, y, z - counter, Blocks.air);
 		       }
 		    }
		    //Up
		    if(world.getBlockMetadata(x, y, z) == 6){
 		       if (world.getBlock(x, y + counter, z) == ChaosBlocks.LaserBeamUp) {
 		    	world.setBlock(x, y + counter, z, Blocks.air);
 		       }
 		    }
		    //Up
		    if(world.getBlockMetadata(x, y, z) == 7){
 		       if (world.getBlock(x, y - counter, z) == ChaosBlocks.LaserBeamDown) {
 		    	world.setBlock(x, y - counter, z, Blocks.air);
 		       }
 		    }
		       else {
		     	break;
		       }
	    }
    }
    	}
}
