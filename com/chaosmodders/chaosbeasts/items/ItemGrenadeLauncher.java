package com.chaosmodders.chaosbeasts.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.entity.projectile.EntityBasicGrenade;
import com.chaosmodders.chaosbeasts.entity.projectile.EntityHandgunBullet;
import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGrenadeLauncher extends Item
{
	private int timer;
	
    public ItemGrenadeLauncher()
    {
        this.maxStackSize = 1;
        this.setMaxDamage(1000);
        this.setCreativeTab(ChaosTabs.tabChaosCombat);
        this.setTextureName("chaosbeasts:basic_grenade_launcher");
        this.setUnlocalizedName("basicGrenadeLauncher");
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer)
    {
    	if (timer<5)
    	{
    		timer++;
    	}
    	else
    	{
      if(par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.consumeInventoryItem(ChaosItems.ItemBullet))
      {
        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        if (!par2World.isRemote)
        {
          par2World.spawnEntityInWorld(new EntityBasicGrenade(par2World, par3EntityPlayer));
        }
        par1ItemStack.damageItem(1, par3EntityPlayer);
        timer = 0;
      }
    	}
      return par1ItemStack;
      }
    public boolean isFull3D()
    {
        return true;
    }
    
    @Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4)
	{
    	list.add("Explosive Projectiles");
		list.add(item.getMaxDamage() - item.getItemDamage() + " Uses Remaining");
		list.add("Ammo: Basic Grenade");
	}
}