package com.chaosmodders.chaosbeasts.event;

import net.minecraftforge.event.entity.player.BonemealEvent;

import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;
import com.chaosmodders.chaosbeasts.blocks.DoomedSapling;

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