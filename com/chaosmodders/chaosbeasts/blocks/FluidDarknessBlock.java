package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

import com.chaosmodders.chaosbeasts.ChaosBeasts;
import com.chaosmodders.chaosbeasts.generic.ChaosTabs;
import com.chaosmodders.chaosbeasts.worldgen.DoomTeleporter;

public class FluidDarknessBlock extends BlockFluidClassic
{
public FluidDarknessBlock()
{
super(ChaosBlocks.FluidDarknessFluid, Material.water);
this.setCreativeTab(ChaosTabs.tabChaosBlocks);
}

@Override
public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity )
{
	if ((entity.ridingEntity == null) && (entity.riddenByEntity == null) && ((entity instanceof EntityPlayerMP)))
    {
        EntityPlayerMP thePlayer = (EntityPlayerMP)entity;
        if (thePlayer.timeUntilPortal > 0)
        {
            thePlayer.timeUntilPortal = 10;
        }
        else if (thePlayer.dimension != ChaosBeasts.DarkDimensionId)
        {
            thePlayer.timeUntilPortal = 10;
            thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, ChaosBeasts.DarkDimensionId);
        }
    }
}
}