package com.eternaldoom.chaosbeasts.blocks;

import java.util.Random;

import com.eternaldoom.chaosbeasts.generic.ChaosTabs;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlockCustom extends Block
{	
    public BlockCustom()
    {
        super(Material.rock);
        this.setCreativeTab(ChaosTabs.tabDoomBlocks);
    }
}
