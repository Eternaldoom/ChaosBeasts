package com.chaosmodders.chaosbeasts.event;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.FillBucketEvent;

import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;
import com.chaosmodders.chaosbeasts.items.ChaosItems;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DoomBucketEvent {

	@SubscribeEvent
	public void onBucketFill(FillBucketEvent event) {

		ItemStack result = fillCustomBucket(event.world, event.target);

		if (result == null)
			return;

		event.result = result;
		event.setResult(Result.ALLOW);
	}

	public ItemStack fillCustomBucket(World world, MovingObjectPosition pos) {
		Block blockID = world.getBlock(pos.blockX, pos.blockY, pos.blockZ);

		if ((blockID == ChaosBlocks.LiquidDoomBlock)
				&& world.getBlockMetadata(pos.blockX, pos.blockY, pos.blockZ) == 0)
		{
			world.setBlockToAir(pos.blockX, pos.blockY, pos.blockZ);
			return new ItemStack(ChaosItems.DoomBucket);
		} else
			return null;
	}

}
