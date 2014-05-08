package com.chaosmodders.chaosbeasts.worldgen;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.chaosmodders.chaosbeasts.ChaosBeasts;
import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;

public class StructureDarknessSpire extends WorldGenerator
{
	private int field_82665_g;
    private int field_82666_h;
    protected World worldObj;
	public StructureDarknessSpire() { }

	public static List spireSpawnBiomes = Arrays.asList(new BiomeGenBase[] {ChaosBeasts.darkbiome});
	
	protected boolean canSpawnStructureAtCoords(int par1, int par2)
    {
        int k = par1;
        int l = par2;

        if (par1 < 0)
        {
            par1 -= this.field_82665_g - 1;
        }

        if (par2 < 0)
        {
            par2 -= this.field_82665_g - 1;
        }

        int i1 = par1 / this.field_82665_g;
        int j1 = par2 / this.field_82665_g;
        Random random = this.worldObj.setRandomSeed(i1, j1, 10387312);
        i1 *= this.field_82665_g;
        j1 *= this.field_82665_g;
        i1 += random.nextInt(this.field_82665_g - this.field_82666_h);
        j1 += random.nextInt(this.field_82665_g - this.field_82666_h);

        if (k == i1 && l == j1)
        {
            boolean flag = this.worldObj.getWorldChunkManager().areBiomesViable(k * 16 + 8, l * 16 + 8, 0, spireSpawnBiomes);

            if (flag)
            {
                return true;
            }
        }

        return false;
    }
	
	public boolean generate(World world, Random rand, int i, int j, int k)
	{
		world.setBlock(i + 0, j + 0, k + 4, Blocks.stone);
		world.setBlock(i + 0, j + 0, k + 5, Blocks.stone);
		world.setBlock(i + 1, j + 0, k + 3, Blocks.stone);
		world.setBlock(i + 1, j + 0, k + 4, Blocks.stone);
		world.setBlock(i + 1, j + 0, k + 5, Blocks.stone);
		world.setBlock(i + 1, j + 0, k + 6, Blocks.stone);
		world.setBlock(i + 1, j + 1, k + 4, Blocks.stone);
		world.setBlock(i + 1, j + 1, k + 5, Blocks.stone);
		world.setBlock(i + 2, j + 0, k + 2, Blocks.stone);
		world.setBlock(i + 2, j + 0, k + 3, Blocks.stone);
		world.setBlock(i + 2, j + 0, k + 4, Blocks.stone);
		world.setBlock(i + 2, j + 0, k + 5, Blocks.stone);
		world.setBlock(i + 2, j + 0, k + 6, Blocks.stone);
		world.setBlock(i + 2, j + 0, k + 7, Blocks.stone);
		world.setBlock(i + 2, j + 1, k + 3, Blocks.stone);
		world.setBlock(i + 2, j + 1, k + 4, Blocks.stone);
		world.setBlock(i + 2, j + 1, k + 5, Blocks.stone);
		world.setBlock(i + 2, j + 1, k + 6, Blocks.stone);
		world.setBlock(i + 2, j + 2, k + 4, Blocks.stone);
		world.setBlock(i + 2, j + 2, k + 5, Blocks.stone);
		world.setBlock(i + 2, j + 3, k + 3, Blocks.stone);
		world.setBlock(i + 2, j + 3, k + 4, Blocks.stone);
		world.setBlock(i + 3, j + 0, k + 1, Blocks.stone);
		world.setBlock(i + 3, j + 0, k + 2, Blocks.stone);
		world.setBlock(i + 3, j + 0, k + 3, Blocks.stone);
		world.setBlock(i + 3, j + 0, k + 6, Blocks.stone);
		world.setBlock(i + 3, j + 0, k + 7, Blocks.stone);
		world.setBlock(i + 3, j + 0, k + 8, Blocks.stone);
		world.setBlock(i + 3, j + 1, k + 2, Blocks.stone);
		world.setBlock(i + 3, j + 1, k + 3, Blocks.stone);
		world.setBlock(i + 3, j + 1, k + 6, Blocks.stone);
		world.setBlock(i + 3, j + 1, k + 7, Blocks.stone);
		world.setBlock(i + 3, j + 2, k + 3, Blocks.stone);
		world.setBlock(i + 3, j + 2, k + 6, Blocks.stone);
		world.setBlock(i + 3, j + 3, k + 2, Blocks.stone);
		world.setBlock(i + 3, j + 3, k + 5, Blocks.stone);
		world.setBlock(i + 3, j + 4, k + 3, Blocks.stone);
		world.setBlock(i + 3, j + 4, k + 4, Blocks.stone);
		world.setBlock(i + 4, j + 0, k + 1, Blocks.stone);
		world.setBlock(i + 4, j + 0, k + 2, Blocks.stone);
		world.setBlock(i + 4, j + 0, k + 3, Blocks.stone);
		world.setBlock(i + 4, j + 1, k + 2, Blocks.stone);
		world.setBlock(i + 4, j + 1, k + 3, Blocks.stone);
		world.setBlock(i + 4, j + 2, k + 3, Blocks.stone);
		world.setBlock(i + 4, j + 2, k + 6, Blocks.stone);
		world.setBlock(i + 4, j + 3, k + 3, Blocks.stone);
		world.setBlock(i + 4, j + 3, k + 6, Blocks.stone);
		world.setBlock(i + 4, j + 4, k + 4, Blocks.stone);
		world.setBlock(i + 4, j + 4, k + 5, Blocks.stone);
		world.setBlock(i + 4, j + 5, k + 4, Blocks.stone);
		world.setBlock(i + 4, j + 5, k + 5, Blocks.stone);
		world.setBlock(i + 4, j + 6, k + 5, Blocks.stone);
		world.setBlock(i + 4, j + 7, k + 5, Blocks.stone);
		world.setBlock(i + 5, j + 0, k + 0, Blocks.stone);
		world.setBlock(i + 5, j + 0, k + 1, Blocks.stone);
		world.setBlock(i + 5, j + 0, k + 2, Blocks.stone);
		world.setBlock(i + 5, j + 0, k + 6, Blocks.stone);
		world.setBlock(i + 5, j + 0, k + 7, Blocks.stone);
		world.setBlock(i + 5, j + 0, k + 8, Blocks.stone);
		world.setBlock(i + 5, j + 1, k + 1, Blocks.stone);
		world.setBlock(i + 5, j + 1, k + 2, Blocks.stone);
		world.setBlock(i + 5, j + 1, k + 6, Blocks.stone);
		world.setBlock(i + 5, j + 1, k + 7, Blocks.stone);
		world.setBlock(i + 5, j + 2, k + 2, Blocks.stone);
		world.setBlock(i + 5, j + 2, k + 4, Blocks.stone);
		world.setBlock(i + 5, j + 2, k + 6, Blocks.stone);
		world.setBlock(i + 5, j + 3, k + 2, Blocks.stone);
		world.setBlock(i + 5, j + 3, k + 6, Blocks.stone);
		world.setBlock(i + 5, j + 4, k + 3, Blocks.stone);
		world.setBlock(i + 5, j + 4, k + 4, Blocks.stone);
		world.setBlock(i + 5, j + 4, k + 6, Blocks.stone);
		world.setBlock(i + 5, j + 5, k + 4, Blocks.stone);
		world.setBlock(i + 5, j + 5, k + 5, Blocks.stone);
		world.setBlock(i + 5, j + 6, k + 4, Blocks.stone);
		world.setBlock(i + 5, j + 6, k + 5, Blocks.stone);
		world.setBlock(i + 5, j + 7, k + 5, Blocks.stone);
		world.setBlock(i + 5, j + 8, k + 5, Blocks.stone);
		world.setBlock(i + 5, j + 9, k + 5, Blocks.stone);
		world.setBlock(i + 5, j + 10, k + 5, Blocks.stone);
		world.setBlock(i + 5, j + 11, k + 5, ChaosBlocks.blockDenseGlowstone);
		world.setBlock(i + 6, j + 0, k + 1, Blocks.stone);
		world.setBlock(i + 6, j + 0, k + 2, Blocks.stone);
		world.setBlock(i + 6, j + 0, k + 3, Blocks.stone);
		world.setBlock(i + 6, j + 0, k + 5, Blocks.stone);
		world.setBlock(i + 6, j + 0, k + 6, Blocks.stone);
		world.setBlock(i + 6, j + 0, k + 7, Blocks.stone);
		world.setBlock(i + 6, j + 1, k + 2, Blocks.stone);
		world.setBlock(i + 6, j + 1, k + 3, Blocks.stone);
		world.setBlock(i + 6, j + 1, k + 5, Blocks.stone);
		world.setBlock(i + 6, j + 1, k + 6, Blocks.stone);
		world.setBlock(i + 6, j + 2, k + 3, Blocks.stone);
		world.setBlock(i + 6, j + 2, k + 5, Blocks.stone);
		world.setBlock(i + 6, j + 3, k + 3, Blocks.stone);
		world.setBlock(i + 6, j + 3, k + 5, Blocks.stone);
		world.setBlock(i + 6, j + 4, k + 4, Blocks.stone);
		world.setBlock(i + 6, j + 4, k + 5, Blocks.stone);
		world.setBlock(i + 6, j + 5, k + 4, Blocks.stone);
		world.setBlock(i + 6, j + 6, k + 4, Blocks.stone);
		world.setBlock(i + 6, j + 7, k + 4, Blocks.stone);
		world.setBlock(i + 6, j + 8, k + 4, Blocks.stone);
		world.setBlock(i + 6, j + 9, k + 4, Blocks.stone);
		world.setBlock(i + 7, j + 0, k + 2, Blocks.stone);
		world.setBlock(i + 7, j + 0, k + 3, Blocks.stone);
		world.setBlock(i + 7, j + 0, k + 4, Blocks.stone);
		world.setBlock(i + 7, j + 0, k + 5, Blocks.stone);
		world.setBlock(i + 7, j + 0, k + 6, Blocks.stone);
		world.setBlock(i + 7, j + 1, k + 3, Blocks.stone);
		world.setBlock(i + 7, j + 1, k + 4, Blocks.stone);
		world.setBlock(i + 7, j + 1, k + 5, Blocks.stone);
		world.setBlock(i + 7, j + 2, k + 4, Blocks.stone);
		world.setBlock(i + 7, j + 3, k + 4, Blocks.stone);
		world.setBlock(i + 8, j + 0, k + 3, Blocks.stone);
		world.setBlock(i + 8, j + 0, k + 4, Blocks.stone);
		world.setBlock(i + 8, j + 0, k + 5, Blocks.stone);
		world.setBlock(i + 8, j + 1, k + 4, Blocks.stone);
		world.setBlock(i + 9, j + 0, k + 4, Blocks.stone);
		world.setBlock(i + 3, j + 3, k + 4, Blocks.water);
		world.setBlock(i + 5, j + 3, k + 4, Blocks.water);
		world.setBlock(i + 5, j + 4, k + 5, Blocks.water);
		
		return true;
	}
}