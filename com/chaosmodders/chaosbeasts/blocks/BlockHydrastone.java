package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHydrastone extends Block {
	
	public String particle;
	public double upVel;

	public BlockHydrastone()
	{
		super(Material.rock);
		this.setBlockTextureName("chaosbeasts:hydrated_stone");
		this.setHardness(1.5F);
		this.setResistance(1.0F);
		this.setBlockName("hydratedStone");
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
		this.setLightLevel(1.0F);
		
		this.particle = "water_drip";
		this.upVel = 0.5D;
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(Blocks.cobblestone);
    }
	
	@SideOnly(Side.CLIENT)
	  public void func_149734_b(World world, int x, int y, int z, Random rand)
	  {
	    if (!world.isBlockIndirectlyGettingPowered(x, y, z))
	    {
	      for (int i = 0; i < 20; i++)
	      {
	        world.spawnParticle(this.particle, x - 0.2D, y + (this.upVel + i / 10) / 5.0D, z + 0.5D, 0.0D, this.upVel + Math.random() * 10.0D, 0.0D);
	        i = 0;
	      }
	    }
	  }
}
