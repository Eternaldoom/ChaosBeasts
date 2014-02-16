package com.doomturd.doomsmod.items;

import java.util.List;

import com.doomturd.doomsmod.entity.projectile.EntityThrowingStar;
import com.doomturd.doomsmod.generic.ChaosTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemThrowingStar extends Item
{
    public ItemThrowingStar()
    {
        this.maxStackSize = 64;
        this.setCreativeTab(ChaosTabs.tabDoomCombat);
        this.setTextureName("doomsmod:throwing_star");
        this.setUnlocalizedName("throwingStar");
        //GameRegistry.registerItem(this, "throwing_star");
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityThrowingStar(par2World, par3EntityPlayer));
        }

        return par1ItemStack;
    }
    
    @Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4)
	{
    	list.add("7 Damage");
	}
}