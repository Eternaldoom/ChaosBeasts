package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.generic.ChaosHelper;
import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

public class BlockUranium extends Block
{
	protected BlockUranium() {
		super(Material.iron);
		this.setHarvestLevel("pickaxe", 12);
		this.setHardness(17.0F);
		this.setResistance(6000000.0F);
		this.setBlockName("blockUranium");
		this.setBlockTextureName("chaosbeasts:uranium_block");
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        float f = 0.0625F;
        return AxisAlignedBB.getBoundingBox((double)((float)p_149668_2_ + f), (double)p_149668_3_, (double)((float)p_149668_4_ + f), (double)((float)(p_149668_2_ + 1) - f), (double)((float)(p_149668_3_ + 1) - f), (double)((float)(p_149668_4_ + 1) - f));
    }
	
	public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_)
    {
        p_149670_5_.attackEntityFrom(ChaosHelper.radiation, 4.0F);
    }
}
