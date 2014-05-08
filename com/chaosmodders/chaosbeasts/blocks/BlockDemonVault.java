package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockDemonVault extends Block {

	public BlockDemonVault() {
		super(Material.rock);
		this.setBlockUnbreakable();
		this.setBlockTextureName("chaosbeasts:demon_vault");
		this.setLightLevel(3.0F);
		this.setResistance(1000000.0F);
		this.setBlockName("demonVault");
		}
	
	@Override
	public boolean onBlockActivated(World par1world, int par2, int par3, int par4, EntityPlayer par5entity, int par6, float par7, float par8, float par9)
    {
		par1world.setBlockToAir(par2, par3, par4);
		EntityTNTPrimed EntityTNTPrimed = new EntityTNTPrimed(par1world, (double)((float)par2 + 0.5F), (double)((float)par3 + 0.5F), (double)((float)par4 + 0.5F), par5entity);
		par1world.spawnEntityInWorld(EntityTNTPrimed);
		
        return super.onBlockActivated(par1world, par2, par3, par4, par5entity, par6, par7, par8, par9);
    }
}
