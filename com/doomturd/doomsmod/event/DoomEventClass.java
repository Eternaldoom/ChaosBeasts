package com.doomturd.doomsmod.event;

import com.doomturd.doomsmod.blocks.ChaosBlocks;
import com.doomturd.doomsmod.blocks.DoomedSapling;

import net.minecraft.client.main.Main;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class DoomEventClass
{
private int BlockID;
/** Used to make the sapling grow the tree **/

public void bonemealUsed(BonemealEvent event)
{
if(event.world.getBlock(event.x, event.y, event.z) == ChaosBlocks.DoomedSapling)
{
((DoomedSapling)ChaosBlocks.DoomedSapling).func_149878_d(event.world, event.x, event.y, event.z, event.world.rand);
}
}
}