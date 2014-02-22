package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLightGrass extends Block
{
	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconBottom;
	
    public BlockLightGrass()
    {
    	super(Material.ground);
    	this.setStepSound(soundTypeGrass);
    	this.setBlockName("lightGrass");
    	this.setBlockTextureName("chaosbeasts:light_grass");
    	this.setHardness(0.01F);
    	this.setResistance(1000000.0F);
    	this.setCreativeTab(ChaosTabs.tabChaosBlocks);
    }

    public int damageDropped(int p_149692_1_)
    {
        return 0;
    }

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	{
	    return p_149691_1_ == 1 ? this.iconTop : (p_149691_1_ == 0 ? this.iconBottom : this.blockIcon);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_)
	{
	    if (p_149673_5_ == 1)
	    {
	        return this.iconTop;
	    }
	    else if (p_149673_5_ == 0)
	    {
	        return this.iconBottom;
	    }
	    else
	    {
		    return this.blockIcon;
	    }
	}
    @SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_)
	{
	    this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "side");
	    this.iconTop = p_149651_1_.registerIcon(this.getTextureName() + "top");
	    this.iconBottom = p_149651_1_.registerIcon(this.getTextureName() + "bottom");
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