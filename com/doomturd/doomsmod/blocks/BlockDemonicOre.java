package com.doomturd.doomsmod.blocks;

import java.util.Random;

import com.doomturd.doomsmod.generic.DoomTabs;
import com.doomturd.doomsmod.items.DoomItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockDemonicOre extends Block
{
	public BlockDemonicOre()
	{
		super(Material.rock);
		this.setCreativeTab(DoomTabs.tabDoomMaterials);
	}
	
	public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return DoomItems.ItemDemonicShard;
    }
}
