package com.eternaldoom.chaosbeasts.generic;

import com.eternaldoom.chaosbeasts.blocks.ChaosBlocks;
import com.eternaldoom.chaosbeasts.items.ChaosItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ChaosTabs
{
	public ChaosTabs()
	{
	}
	    public static final CreativeTabs tabDoomMaterials = new CreativeTabs(CreativeTabs.getNextID(), "tabDoomMaterials")
	    {
			public Item getTabIconItem()
			{
				return ChaosItems.ItemSapphire;
			}
	    };
	    
	    public static final CreativeTabs tabDoomCombat = new CreativeTabs(CreativeTabs.getNextID(), "tabDoomCombat")
	    {
			public Item getTabIconItem()
			{
				return ChaosItems.swordRainbow;
			}
	    };
	    
	    public static final CreativeTabs tabDoomTools = new CreativeTabs(CreativeTabs.getNextID(), "tabDoomTools")
	    {
			public Item getTabIconItem()
			{
				return ChaosItems.pickaxeRuby;
			}
	    };
	    
	    public static final CreativeTabs tabDoomBlocks = new CreativeTabs(CreativeTabs.getNextID(), "tabDoomBlocks")
	    {
			public Item getTabIconItem()
			{
				return Item.getItemFromBlock(ChaosBlocks.blockSapphire);
			}
	    };
}
