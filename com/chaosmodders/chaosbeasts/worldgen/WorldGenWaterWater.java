package com.chaosmodders.chaosbeasts.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;

public class WorldGenWaterWater extends WorldGenerator
{
    private Block field_150553_a;
    private boolean field_94524_b;

    public WorldGenWaterWater(Block p_i45453_1_, boolean p_i45453_2_)
    {
        this.field_150553_a = p_i45453_1_;
        this.field_94524_b = p_i45453_2_;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        if (par1World.getBlock(par3, par4 + 1, par5) != ChaosBlocks.blockDarknessStone)
        {
            return false;
        }
        else if (par1World.getBlock(par3, par4, par5) != ChaosBlocks.blockDarknessStone)
        {
            return false;
        }
        else
        {
            int l = 0;

            if (par1World.getBlock(par3 - 1, par4, par5) == ChaosBlocks.blockDarknessStone)
            {
                ++l;
            }

            if (par1World.getBlock(par3 + 1, par4, par5) == ChaosBlocks.blockDarknessStone)
            {
                ++l;
            }

            if (par1World.getBlock(par3, par4, par5 - 1) == ChaosBlocks.blockDarknessStone)
            {
                ++l;
            }

            if (par1World.getBlock(par3, par4, par5 + 1) == ChaosBlocks.blockDarknessStone)
            {
                ++l;
            }

            if (par1World.getBlock(par3, par4 - 1, par5) == ChaosBlocks.blockDarknessStone)
            {
                ++l;
            }

            int i1 = 0;

            if (!this.field_94524_b && l == 4 && i1 == 1 || l == 5)
            {
                par1World.setBlock(par3, par4, par5, this.field_150553_a, 0, 2);
                par1World.scheduledUpdatesAreImmediate = true;
                this.field_150553_a.updateTick(par1World, par3, par4, par5, par2Random);
                par1World.scheduledUpdatesAreImmediate = false;
            }

            return true;
        }
    }
}