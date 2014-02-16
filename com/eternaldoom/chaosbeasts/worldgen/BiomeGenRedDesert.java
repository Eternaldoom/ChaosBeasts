package com.eternaldoom.chaosbeasts.worldgen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraftforge.common.BiomeDictionary;

public class BiomeGenRedDesert extends BiomeGenBase
{
	public static BiomeGenRedDesert makeBiome(int par1)
	{
		BiomeGenRedDesert biome = new BiomeGenRedDesert(par1);
		BiomeDictionary.registerBiomeType(biome, BiomeDictionary.Type.DESERT);
		return biome;
	}
	
    public BiomeGenRedDesert(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.topBlock = Blocks.sand;
        this.field_150604_aj = 1;
        this.fillerBlock = Blocks.sand;
        this.field_76754_C = 1;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = 2;
        this.theBiomeDecorator.reedsPerChunk = 50;
        this.theBiomeDecorator.cactiPerChunk = 10;
        this.spawnableCreatureList.clear();
        this.setBiomeName("Red Sand Desert");
    }

    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);

        if (par2Random.nextInt(1000) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            WorldGenDesertWells worldgendesertwells = new WorldGenDesertWells();
            worldgendesertwells.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
        }
    }
}