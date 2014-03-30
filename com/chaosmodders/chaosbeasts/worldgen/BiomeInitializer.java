package com.chaosmodders.chaosbeasts.worldgen;

import net.minecraftforge.event.terraingen.WorldTypeEvent;

import com.chaosmodders.chaosbeasts.ChaosBeasts;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BiomeInitializer
{

	public BiomeInitializer()
	{
	}

	@SubscribeEvent
	public void initBiomes(WorldTypeEvent.InitBiomeGens event) {
		if (ChaosBeasts.reddesert != null) {
			event.newBiomeGens[0] = new LayerAddRedDesert(event.seed, 1500L, event.newBiomeGens[0]);
			event.newBiomeGens[1] = new LayerAddRedDesert(event.seed, 1500L, event.newBiomeGens[1]);
			event.newBiomeGens[2] = new LayerAddRedDesert(event.seed, 1500L, event.newBiomeGens[2]);
		}
	}
}