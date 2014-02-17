package com.chaosmodders.chaosbeasts.worldgen;

import java.util.Random;

import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraftforge.common.BiomeDictionary;

public class BiomeGenDark extends BiomeGenBase
{
    public BiomeGenDark(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.topBlock = ChaosBlocks.blockDarknessStone;
        this.fillerBlock = ChaosBlocks.blockDarknessStone;
        this.field_76754_C = 1;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = 2;
        this.theBiomeDecorator.reedsPerChunk = 50;
        this.theBiomeDecorator.cactiPerChunk = 10;
        this.spawnableCreatureList.clear();
        this.setBiomeName("Land Of Darkness");
    }
}