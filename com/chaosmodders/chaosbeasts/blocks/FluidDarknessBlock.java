package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

import com.chaosmodders.chaosbeasts.ChaosBeasts;
import com.chaosmodders.chaosbeasts.entity.fx.DoomPortalFX;
import com.chaosmodders.chaosbeasts.generic.ChaosTabs;
import com.chaosmodders.chaosbeasts.worldgen.DarkTeleporter;
import com.chaosmodders.chaosbeasts.worldgen.DoomTeleporter;
import com.chaosmodders.chaosbeasts.worldgen.LightTeleporter;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
            thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, ChaosBeasts.DarkDimensionId, new DarkTeleporter(thePlayer.mcServer.worldServerForDimension(ChaosBeasts.DarkDimensionId)));
        }
    }
}

@SideOnly(Side.CLIENT)
public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
{
	if (p_149734_5_.nextInt(100) == 0)
	{
		p_149734_1_.playSound((double)p_149734_2_ + 0.5D, (double)p_149734_3_ + 0.5D, (double)p_149734_4_ + 0.5D, "portal.portal", 0.5F, p_149734_5_.nextFloat() * 0.4F + 0.8F, false);
	}

	for (int l = 0; l < 4; ++l)
	{
		double d0 = (double)((float)p_149734_2_ + p_149734_5_.nextFloat());
		double d1 = (double)((float)p_149734_3_ + p_149734_5_.nextFloat());
		double d2 = (double)((float)p_149734_4_ + p_149734_5_.nextFloat());
		double d3 = 0.0D;
		double d4 = 0.0D;
		double d5 = 0.0D;
		int i1 = p_149734_5_.nextInt(2) * 2 - 1;
		d3 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;
		d4 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;
		d5 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;

			d0 = (double)p_149734_2_ + 0.5D + 0.25D * (double)i1;
			d3 = (double)(p_149734_5_.nextFloat() * 2.0F * (float)i1);
			d2 = (double)p_149734_4_ + 0.5D + 0.25D * (double)i1;
			d5 = (double)(p_149734_5_.nextFloat() * 2.0F * (float)i1);
		

		DoomPortalFX var20 = new DoomPortalFX(p_149734_1_, d0, d1, d2, d3, d4, d5);
        FMLClientHandler.instance().getClient().effectRenderer.addEffect(var20);
	}
}
}