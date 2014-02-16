package com.eternaldoom.chaosbeasts.blocks;

import java.util.Random;

import com.eternaldoom.chaosbeasts.generic.ChaosTabs;
import com.eternaldoom.chaosbeasts.items.ChaosItems;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlockSapphireOre extends Block
{	
    public BlockSapphireOre()
    {
        super(Material.rock);
        this.setCreativeTab(ChaosTabs.tabDoomBlocks);
    }
    public int func_149745_a(Random p_149745_1_)
    {
        return 1;
    }

    public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ChaosItems.ItemSapphire;
    }
}
