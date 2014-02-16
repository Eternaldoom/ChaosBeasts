package com.doomturd.doomsmod.blocks;

import java.util.Random;

import com.doomturd.doomsmod.generic.DoomTabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockDoomedStone extends BlockStone
{
    public BlockDoomedStone()
    {
        super();
        this.setCreativeTab(DoomTabs.tabDoomBlocks);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(DoomBlocks.blockDoomedCobblestone);
    }
}