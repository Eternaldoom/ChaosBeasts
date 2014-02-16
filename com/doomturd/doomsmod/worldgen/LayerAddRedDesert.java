package com.doomturd.doomsmod.worldgen;

import com.doomturd.doomsmod.ChaosBeasts;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;

public class LayerAddRedDesert extends LayerGenReplacer {

	protected static final double NOISE_FIELD_SCALE = 0.001;
	protected static final double NOISE_FIELD_THRESHOLD = 0.7;

	public LayerAddRedDesert(final long worldSeed, final long seed, final GenLayer parent) {
		super(worldSeed, seed, parent, NOISE_FIELD_SCALE, NOISE_FIELD_THRESHOLD, ChaosBeasts.reddesert.biomeID);
	}

	@Override
	protected boolean canReplaceBiome(int biomeId) {
		return biomeId == BiomeGenBase.desert.biomeID;
	}
}