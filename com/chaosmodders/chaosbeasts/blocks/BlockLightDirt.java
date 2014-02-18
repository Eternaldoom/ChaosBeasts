package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLightDirt extends Block
{
    public BlockLightDirt()
    {
    	super(Material.ground);
    	this.setStepSound(soundTypeGrass);
    	this.setBlockName("lightDirt");
    	this.setBlockTextureName("chaosbeasts:light_dirt");
    	this.setHardness(0.01F);
    	this.setResistance(1000000.0F);
    	this.setCreativeTab(ChaosTabs.tabChaosBlocks);
    }

    public int damageDropped(int p_149692_1_)
    {
        return 0;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_)
    {
        int i1 = p_149673_1_.getBlockMetadata(p_149673_2_, p_149673_3_, p_149673_4_);

        if (i1 == 2)
        {
            if (p_149673_5_ != 0)
            {
                Material material = p_149673_1_.getBlock(p_149673_2_, p_149673_3_ + 1, p_149673_4_).getMaterial();

                if (material == Material.snow || material == Material.craftedSnow)
                {
                    return Blocks.grass.getIcon(p_149673_1_, p_149673_2_, p_149673_3_, p_149673_4_, p_149673_5_);
                }

                Block block = p_149673_1_.getBlock(p_149673_2_, p_149673_3_ + 1, p_149673_4_);
            }
        }

        return this.blockIcon;
    }

    /**
     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     */
    protected ItemStack createStackedBlock(int p_149644_1_)
    {
        if (p_149644_1_ == 1)
        {
            p_149644_1_ = 0;
        }

        return super.createStackedBlock(p_149644_1_);
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    public int getDamageValue(World p_149643_1_, int p_149643_2_, int p_149643_3_, int p_149643_4_)
    {
        int l = p_149643_1_.getBlockMetadata(p_149643_2_, p_149643_3_, p_149643_4_);

        if (l == 1)
        {
            l = 0;
        }

        return l;
    }
}