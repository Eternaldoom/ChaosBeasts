package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

public class BlockTrampoline extends Block
{

	public BlockTrampoline() {
		super(Material.glass);
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
		this.setBlockName("trampoline");
		this.setBlockTextureName("chaosbeasts:trampoline");
		this.setHardness(0.1F);
		this.setResistance(0.1F);
		this.setHarvestLevel("sword", 10);
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        float f = 0.0625F;
        return AxisAlignedBB.getAABBPool().getAABB((double)((float)p_149668_2_ + f), (double)p_149668_3_, (double)((float)p_149668_4_ + f), (double)((float)(p_149668_2_ + 1) - f), (double)((float)(p_149668_3_ + 1) - f), (double)((float)(p_149668_4_ + 1) - f));
    }
	
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		par5Entity.motionX *= -5.0D;
		par5Entity.motionY *= -5.0D;
		par5Entity.motionZ *= -5.0D;

	}
}
