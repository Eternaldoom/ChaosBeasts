package com.chaosmodders.chaosbeasts.blocks;

import java.util.Random;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlazeFlower extends ChaosBushBase
{
	public BlazeFlower()
	{
		this.setLightLevel(0.2F);
	}
	
	public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Items.blaze_powder;
    }
}
