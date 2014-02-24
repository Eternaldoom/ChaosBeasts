package com.chaosmodders.chaosbeasts.blocks;

import net.minecraftforge.fluids.BlockFluidClassic;

import com.chaosmodders.chaosbeasts.generic.ChaosHelper;
import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

public class ArgonFluidBlock extends BlockFluidClassic {
	public ArgonFluidBlock() {
		super(ChaosBlocks.ArgonGasFluid, ChaosHelper.gas);
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
		this.setBlockTextureName("chaosbeasts:argon_gas");
	}
}