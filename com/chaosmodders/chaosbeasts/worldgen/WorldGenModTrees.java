package com.chaosmodders.chaosbeasts.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;

public abstract class WorldGenModTrees extends WorldGenerator
{
    public WorldGenModTrees(boolean p_i45448_1_)
    {
        super(p_i45448_1_);
    }

    protected boolean func_150523_a(Block p_150523_1_)
    {
        return p_150523_1_.getMaterial() == Material.air || p_150523_1_.getMaterial() == Material.leaves || p_150523_1_ == ChaosBlocks.blockDoomedGrass || p_150523_1_ == ChaosBlocks.blockDoomedDirt || p_150523_1_ == ChaosBlocks.DoomedWood || p_150523_1_ == ChaosBlocks.DoomedSapling || p_150523_1_ == Blocks.vine;
    }

    public void func_150524_b(World p_150524_1_, Random p_150524_2_, int p_150524_3_, int p_150524_4_, int p_150524_5_) {}

    protected boolean isReplaceable(World world, int x, int y, int z)
    {
        Block block = world.getBlock(x, y, z);
        return block.isAir(world, x, y, z) || block.isLeaves(world, x, y, z) || block.isWood(world, x, y, z) || func_150523_a(block);
    }
}