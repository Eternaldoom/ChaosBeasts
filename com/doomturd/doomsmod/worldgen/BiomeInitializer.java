package com.doomturd.doomsmod.worldgen;

import com.doomturd.doomsmod.DoomsMod;

import net.minecraftforge.event.terraingen.WorldTypeEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BiomeInitializer
{

	public BiomeInitializer()
	{
	}

	@SubscribeEvent
	public void initBiomes(WorldTypeEvent.InitBiomeGens event) {
		if (DoomsMod.reddesert != null) {
			event.newBiomeGens[0] = new LayerAddRedDesert(event.seed, 1500L, event.newBiomeGens[0]);
			event.newBiomeGens[1] = new LayerAddRedDesert(event.seed, 1500L, event.newBiomeGens[1]);
			event.newBiomeGens[2] = new LayerAddRedDesert(event.seed, 1500L, event.newBiomeGens[2]);
		}

//		int range = GenLayerBiomeReplacer.OFFSET_RANGE;
//		Random rand = new Random(event.seed);
//		double xOffset = rand.nextInt(range) - (range / 2);
//		double zOffset = rand.nextInt(range) - (range / 2);
//		double noiseScale = GenLayerAddOilOcean.NOISE_FIELD_SCALE;
//		double noiseThreshold = GenLayerAddOilOcean.NOISE_FIELD_THRESHOLD;
//		for (int x = -5000; x < 5000; x += 128) {
//			for (int z = -5000; z < 5000; z += 128) {
//				if (SimplexNoise.noise((x + xOffset) * noiseScale, (z + zOffset) * noiseScale) > noiseThreshold) {
//					System.out.printf("Oil Biome: %d, %d\n", x, z);
//				}
//			}
//		}
	}
}