package com.chaosmodders.chaosbeasts.blocks;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import net.minecraft.block.BlockChest;

public class BlockGoldChest extends BlockChest{

	protected BlockGoldChest(int p_i45397_1_) {
		super(p_i45397_1_);
		this.setCreativeTab(ChaosTabs.tabChaosBlocks);
		this.setBlockName("goldChest");
		this.setBlockTextureName("chaosbeasts:gold_chest");
	}

}
