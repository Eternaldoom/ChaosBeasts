package com.chaosmodders.chaosbeasts.blocks;

import net.minecraftforge.fluids.BlockFluidClassic;

import com.chaosmodders.chaosbeasts.generic.ChaosHelper;
import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ArgonFluidBlock extends BlockFluidClassic {
	public ArgonFluidBlock() {
		super(ChaosBlocks.ArgonGasFluid, ChaosHelper.gas);
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
		this.setBlockTextureName("chaosbeasts:argon_gas");
	}
	
	@Override
    public boolean isOpaqueCube() {
            return false;
    }
	
	@Override
	public boolean renderAsNormalBlock() {
        return false;
}
	
	@SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
}