package com.doomturd.doomsmod.event;

import com.doomturd.doomsmod.blocks.DoomBlocks;
import com.doomturd.doomsmod.items.DoomItems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.FillBucketEvent;
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

		if ((blockID == DoomBlocks.LiquidDoomBlock)
				&& world.getBlockMetadata(pos.blockX, pos.blockY, pos.blockZ) == 0)
		{
			world.setBlockToAir(pos.blockX, pos.blockY, pos.blockZ);
			return new ItemStack(DoomItems.DoomBucket);
		} else
			return null;
	}

}
