package com.chaosmodders.chaosbeasts.event;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.items.ChaosItems;

import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ChaosArmorEvent
{
	private Item boots = null;
	private Item body = null;
	private Item leggings = null;
	private Item helmet = null;

	private ChaosItems C;
	private World world;
	
	public static final String[] inWater = new String[] {"qn","field_70171_ac", "inWater"};
	
	@SubscribeEvent
	public void onTickEvent(PlayerTickEvent ev) {
		world = ev.player.worldObj;
		ItemStack stackBoots = ev.player.inventory.armorItemInSlot(0);
		ItemStack stackLeggings = ev.player.inventory.armorItemInSlot(1);
		ItemStack stackBody = ev.player.inventory.armorItemInSlot(2);
		ItemStack stackHelmet = ev.player.inventory.armorItemInSlot(3);
		
		if(stackBoots != null)
			boots = stackBoots.getItem();
		else
			boots = null;

		if(stackBody != null)
			body = stackBody.getItem();
		else
			body = null;

		if(stackLeggings != null) 
			leggings = stackLeggings.getItem();
		else
			leggings = null;

		if(stackHelmet != null) 
			helmet = stackHelmet.getItem();
		else
			helmet = null;

		if (boots == C.bootsEnder && body == C.chestplateEnder && leggings == C.leggingsEnder && helmet == C.helmetEnder){
			ev.player.fallDistance = 0.0F;
		}
		
		if (boots == C.bootsDimensional && body == C.chestplateDimensional && leggings == C.leggingsDimensional && helmet == C.helmetDimensional){
			ev.player.noClip = true;
			ev.player.capabilities.isFlying = true;
			}else{ev.player.noClip = false;
				if(!ev.player.capabilities.isCreativeMode){
					ev.player.capabilities.isFlying = false;
			}
			}
		}
}