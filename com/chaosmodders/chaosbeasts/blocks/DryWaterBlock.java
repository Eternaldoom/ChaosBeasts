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

public class DryWaterBlock extends BlockFluidClassic
{
public DryWaterBlock()
{
super(ChaosBlocks.DryWaterFluid, Material.water);
this.setCreativeTab(ChaosTabs.tabChaosBlocks);
this.setBlockTextureName("water_still");
}
}