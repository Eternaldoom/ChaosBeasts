package com.doomturd.doomsmod.worldgen;

import java.util.Random;

import com.doomturd.doomsmod.blocks.DoomBlocks;
import com.doomturd.doomsmod.entity.monster.EntityLobster;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.feature.WorldGenForest;

public class BiomeGenDoom extends BiomeGenBase
{
	protected static final WorldGenDoomedTree WorldGenDoomedTree = new WorldGenDoomedTree(true);
	
	public int treesPerChunk;
	
	private int bob = 3;
	
    public BiomeGenDoom(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.topBlock = DoomBlocks.blockDoomedGrass;
        this.fillerBlock = DoomBlocks.blockDoomedDirt;
        this.theBiomeDecorator.treesPerChunk = 5;
        this.theBiomeDecorator.deadBushPerChunk = 2;
        this.theBiomeDecorator.reedsPerChunk = 50;
        this.theBiomeDecorator.cactiPerChunk = 10;
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityLobster.class, 5, 4, 4));
        this.waterColorMultiplier = 0xFFFF00;
        this.setBiomeName("Doomed Land");
    }
    
    public WorldGenModTrees getRandomWorldGenForTrees(Random par1Random)
    {
    return (WorldGenModTrees)(par1Random.nextInt(5) == 0 ? this.WorldGenDoomedTree : (par1Random.nextInt(10) == 0 ? this.WorldGenDoomedTree : WorldGenDoomedTree));
    }
    
    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        int k;
        int l;
        int i1;
        int j1;
        int k1;

        if (bob == 3)
        {
            for (k = 0; k < 1; ++k)
            {
                for (l = 0; l < 1; ++l)
                {
                    i1 = par3 + k * 4 + 1 + 8 + par2Random.nextInt(3);
                    j1 = par4 + l * 4 + 1 + 8 + par2Random.nextInt(3);
                    k1 = par1World.getHeightValue(i1, j1);

                    if (par2Random.nextInt(20) == 0)
                    {
                        WorldGenBigMushroom worldgenbigmushroom = new WorldGenBigMushroom();
                        worldgenbigmushroom.generate(par1World, par2Random, i1, k1, j1);
                    }
                    else
                    {
                        WorldGenModTrees worldgenmodtrees = this.getRandomWorldGenForTrees(par2Random);
                        worldgenmodtrees.setScale(0.1D, 0.1D, 0.1D);

                        if (worldgenmodtrees.generate(par1World, par2Random, i1, k1, j1))
                        {
                        	worldgenmodtrees.func_150524_b(par1World, par2Random, i1, k1, j1);
                        }
                    }
                }
            }
        }
        }
    
    @Override
    public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_)
    {
        this.genDoomTerrain(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
    }
    
    public final void genDoomTerrain(World p_150560_1_, Random p_150560_2_, Block[] p_150560_3_, byte[] p_150560_4_, int p_150560_5_, int p_150560_6_, double p_150560_7_)
    {
        boolean flag = true;
        Block block = this.topBlock;
        byte b0 = (byte)(this.field_150604_aj & 255);
        Block block1 = this.fillerBlock;
        int k = -1;
        int l = (int)(p_150560_7_ / 3.0D + 3.0D + p_150560_2_.nextDouble() * 0.25D);
        int i1 = p_150560_5_ & 15;
        int j1 = p_150560_6_ & 15;
        int k1 = p_150560_3_.length / 256;

        for (int l1 = 255; l1 >= 0; --l1)
        {
            int i2 = (j1 * 16 + i1) * k1 + l1;

            if (l1 <= 0 + p_150560_2_.nextInt(5))
            {
                p_150560_3_[i2] = Blocks.bedrock;
            }
            else
            {
                Block block2 = p_150560_3_[i2];

                if (block2 != null && block2.getMaterial() != Material.air)
                {
                    if (block2 == DoomBlocks.blockDoomedStone)
                    {
                        if (k == -1)
                        {
                            if (l <= 0)
                            {
                                block = null;
                                b0 = 0;
                                block1 = DoomBlocks.blockDoomedStone;
                            }
                            else if (l1 >= 59 && l1 <= 64)
                            {
                                block = this.topBlock;
                                b0 = (byte)(this.field_150604_aj & 255);
                                block1 = this.fillerBlock;
                            }

                            if (l1 < 63 && (block == null || block.getMaterial() == Material.air))
                            {
                                if (this.getFloatTemperature(p_150560_5_, l1, p_150560_6_) < 0.15F)
                                {
                                    block = Blocks.ice;
                                    b0 = 0;
                                }
                                else
                                {
                                    block = Blocks.water;
                                    b0 = 0;
                                }
                            }

                            k = l;

                            if (l1 >= 62)
                            {
                                p_150560_3_[i2] = block;
                                p_150560_4_[i2] = b0;
                            }
                            else if (l1 < 56 - l)
                            {
                                block = null;
                                block1 = DoomBlocks.blockDoomedStone;
                                p_150560_3_[i2] = Blocks.gravel;
                            }
                            else
                            {
                                p_150560_3_[i2] = block1;
                            }
                        }
                        else if (k > 0)
                        {
                            --k;
                            p_150560_3_[i2] = block1;

                            if (k == 0 && block1 == Blocks.sand)
                            {
                                k = p_150560_2_.nextInt(4) + Math.max(0, l1 - 63);
                                block1 = Blocks.sandstone;
                            }
                        }
                    }
                }
                else
                {
                    k = -1;
                }
            }
        }
    }
}
                      