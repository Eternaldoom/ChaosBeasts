package com.doomturd.doomsmod.blocks;

import com.doomturd.doomsmod.generic.ChaosTabs;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LiquidDoomBlock extends BlockFluidClassic
{
public LiquidDoomBlock()
{
super(ChaosBlocks.LiquidDoomFluid, Material.water);
this.setCreativeTab(ChaosTabs.tabDoomBlocks);
}

// Use Register Icon as usual to get the block's icon.
// If you want you can reuse the water texture and change the color of it by doing as I have below:

@Override
public void onEntityCollidedWithBlock( World world, int x, int y, int z, Entity entity ) {
	if (entity instanceof EntityLivingBase) {
		((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.wither.id, 40, 0));
		((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.nightVision.id, 40, 0));

	}
}

//@SideOnly(Side.CLIENT)
//public IIcon getIcon(int side, int meta)
//{
//return Blocks.flowing_water.getIcon(side, meta);
//}
}