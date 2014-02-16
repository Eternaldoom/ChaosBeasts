package com.chaosmodders.chaosbeasts.generic;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;
import com.chaosmodders.chaosbeasts.items.ChaosItems;

public class ChaosTabs
{
	public ChaosTabs()
	{
	}
	    public static final CreativeTabs tabChaosMaterials = new CreativeTabs(CreativeTabs.getNextID(), "tabChaosMaterials")
	    {
			public Item getTabIconItem()
			{
				return ChaosItems.ItemSapphire;
			}
	    };
	    
	    public static final CreativeTabs tabChaosCombat = new CreativeTabs(CreativeTabs.getNextID(), "tabChaosCombat")
	    {
			public Item getTabIconItem()
			{
				return ChaosItems.swordRainbow;
			}
	    };
	    
	    public static final CreativeTabs tabChaosTools = new CreativeTabs(CreativeTabs.getNextID(), "tabChaosTools")
	    {
			public Item getTabIconItem()
			{
				return ChaosItems.pickaxeRuby;
			}
	    };
	    
	    public static final CreativeTabs tabChaosBlocks = new CreativeTabs(CreativeTabs.getNextID(), "tabChaosBlocks")
	    {
			public Item getTabIconItem()
			{
				return Item.getItemFromBlock(ChaosBlocks.blockGlowTNT);
			}
	    };
}
