package com.doomturd.doomsmod.blocks;

import java.util.Random;

import com.doomturd.doomsmod.generic.ChaosTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.main.Main;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDoomLog extends Block
{
	@SideOnly(Side.CLIENT)
    private IIcon iconLogTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconLogBottom;
    
public BlockDoomLog()
{
super(Material.wood);
this.setTickRandomly(true);
this.setCreativeTab(ChaosTabs.tabDoomBlocks);
this.setStepSound(soundTypeWood);
}

public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
{
    byte b0 = 4;
    int i1 = b0 + 1;

    if (p_149749_1_.checkChunksExist(p_149749_2_ - i1, p_149749_3_ - i1, p_149749_4_ - i1, p_149749_2_ + i1, p_149749_3_ + i1, p_149749_4_ + i1))
    {
        for (int j1 = -b0; j1 <= b0; ++j1)
        {
            for (int k1 = -b0; k1 <= b0; ++k1)
            {
                for (int l1 = -b0; l1 <= b0; ++l1)
                {
                    Block block = p_149749_1_.getBlock(p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1);
                    if (block.isLeaves(p_149749_1_, p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1))
                    {
                        block.beginLeavesDecay(p_149749_1_, p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1);
                    }
                }
            }
        }
    }
}

@Override
public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z)
{
    return true;
}

@Override
public boolean isWood(IBlockAccess world, int x, int y, int z)
{
    return true;
}

@SideOnly(Side.CLIENT)
public IIcon getIcon(int p_149691_1_, int p_149691_2_)
{
    return p_149691_1_ == 1 ? this.iconLogTop : (p_149691_1_ == 0 ? this.iconLogBottom : this.blockIcon);
}


@SideOnly(Side.CLIENT)
public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_)
{
    if (p_149673_5_ == 1)
    {
        return this.iconLogTop;
    }
    else if (p_149673_5_ == 0)
    {
        return this.iconLogBottom;
    }
    else
    {
        return this.blockIcon;
    }
}

@SideOnly(Side.CLIENT)
public void registerBlockIcons(IIconRegister p_149651_1_)
{
    this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
    this.iconLogTop = p_149651_1_.registerIcon(this.getTextureName() + "_top");
    this.iconLogBottom = p_149651_1_.registerIcon(this.getTextureName() + "_top");
}
}