package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

public class FluidDarknessBlock extends BlockFluidClassic
{
public FluidDarknessBlock()
{
super(ChaosBlocks.FluidDarknessFluid, Material.water);
this.setCreativeTab(ChaosTabs.tabChaosBlocks);
}

@Override
public void onEntityCollidedWithBlock( World world, int x, int y, int z, Entity entity )
{
	
}
}