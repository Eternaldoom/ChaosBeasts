package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

public class ArgonFluidBlock extends BlockFluidClassic {
	public ArgonFluidBlock() {
		super(ChaosBlocks.ArgonGasFluid, Material.water);
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
		this.setBlockTextureName("chaosbeasts:argon_gas");
	}
}