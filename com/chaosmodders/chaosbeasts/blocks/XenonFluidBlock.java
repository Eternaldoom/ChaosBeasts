package com.chaosmodders.chaosbeasts.blocks;

import net.minecraftforge.fluids.BlockFluidClassic;

import com.chaosmodders.chaosbeasts.generic.ChaosHelper;
import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class XenonFluidBlock extends BlockFluidClassic {
	public XenonFluidBlock() {
		super(ChaosBlocks.XenonGasFluid, ChaosHelper.gas);
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
		this.setBlockTextureName("chaosbeasts:xenon_gas");
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