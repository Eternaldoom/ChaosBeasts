package com.chaosmodders.chaosbeasts.worldgen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;

import cpw.mods.fml.common.IWorldGenerator;

public class MoreOreGenerator implements IWorldGenerator
{
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
{
switch (world.provider.dimensionId)
{
case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
case 3: generateDoom(world, random, chunkX*16, chunkZ*16);
}
}

public void generateDoom(World world, Random random, int chunkX, int chunkZ)
{
	for(int i = 0; i < 1; i++) 
	{
		
	}
	}

public void generateSurface(World world, Random random, int chunkX, int chunkZ)
{
	for(int i = 0; i < 1; i++) 
	{
		int randPosX=chunkX + random.nextInt(16);
		int randPosY=random.nextInt(64);
		int randPosZ=chunkZ + random.nextInt(16);
		(new WorldGenMinable(ChaosBlocks.blockRubyOre, 7)).generate(world, random, randPosX, randPosY, randPosZ);
		(new WorldGenMinable(Blocks.emerald_ore, 7)).generate(world, random, randPosX, randPosY, randPosZ);
	}
	
	for(int o = 0; o < 1; o++) 
	{
		int randPosX=chunkX + random.nextInt(16);
		int randPosY=random.nextInt(16);
		int randPosZ=chunkZ + random.nextInt(16);
		(new WorldGenMinable(ChaosBlocks.blockSapphireOre, 11)).generate(world, random, randPosX, randPosY, randPosZ);
	}
	
	for(int food = 0; food < 6; food++) 
	{
		int randPosX=chunkX + random.nextInt(16);
		int randPosY=random.nextInt(8);
		int randPosZ=chunkZ + random.nextInt(16);
		(new WorldGenMinable(ChaosBlocks.blockLeadOre, 5)).generate(world, random, randPosX, randPosY, randPosZ);
	}
	
	for(int lasagna = 0; lasagna < 2; lasagna++) 
	{
		int randPosX=chunkX + random.nextInt(16);
		int randPosY=random.nextInt(32);
		int randPosZ=chunkZ + random.nextInt(16);
		(new WorldGenMinable(ChaosBlocks.blockCopperOre, 3)).generate(world, random, randPosX, randPosY, randPosZ);
	}
}
}
