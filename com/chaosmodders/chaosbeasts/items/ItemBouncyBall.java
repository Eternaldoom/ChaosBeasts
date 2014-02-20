package com.chaosmodders.chaosbeasts.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.entity.projectile.EntityBouncyBall;
import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBouncyBall extends Item
{
    public ItemBouncyBall()
    {
        this.maxStackSize = 64;
        this.setCreativeTab(ChaosTabs.tabChaosMaterials);
        this.setTextureName("chaosbeasts:bouncy_ball");
        this.setUnlocalizedName("bouncyBall");
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
            par2World.spawnEntityInWorld(new EntityBouncyBall(par2World, par3EntityPlayer, 1));
        }

        return par1ItemStack;
    }
    
    @Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4)
	{
    	list.add("1 Damage");
	}
}