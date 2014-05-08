package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHydrastone extends Block {

	public BlockHydrastone()
	{
		super(Material.rock);
		this.setBlockTextureName("chaosbeasts:hydrated_stone");
		this.setHardness(1.5F);
		this.setResistance(1.0F);
		this.setBlockName("hydratedStone");
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
		this.setLightLevel(1.0F);
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(Blocks.cobblestone);
    }
}
