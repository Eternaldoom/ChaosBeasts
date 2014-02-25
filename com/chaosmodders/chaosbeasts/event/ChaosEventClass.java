package com.chaosmodders.chaosbeasts.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;

import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;
import com.chaosmodders.chaosbeasts.blocks.DoomedSapling;
import com.chaosmodders.chaosbeasts.generic.ChaosHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ChaosEventClass {
	private int BlockID;

	/** Used to make the sapling grow the tree **/
	public void bonemealUsed(BonemealEvent event) {
		if (event.world.getBlock(event.x, event.y, event.z) == ChaosBlocks.DoomedSapling) {
			((DoomedSapling) ChaosBlocks.DoomedSapling).func_149878_d(
					event.world, event.x, event.y, event.z, event.world.rand);
		}
	}

	@SubscribeEvent
    public void onEntityGetDamage(LivingHurtEvent event)
    {
        String type = event.source.damageType;

        if (type.equals("cactus"))
        {
            event.entityLiving.setHealth(event.entityLiving.getHealth() - 100500);
        }
    }
}