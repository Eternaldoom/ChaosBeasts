package com.doomturd.doomsmod.generic;

import com.doomturd.doomsmod.blocks.DoomBlocks;
import com.doomturd.doomsmod.items.DoomItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DoomTabs
{
	public DoomTabs()
	{
	}
	    public static final CreativeTabs tabDoomMaterials = new CreativeTabs(CreativeTabs.getNextID(), "tabDoomMaterials")
	    {
			public Item getTabIconItem()
			{
				return DoomItems.ItemSapphire;
			}
	    };
	    
	    public static final CreativeTabs tabDoomCombat = new CreativeTabs(CreativeTabs.getNextID(), "tabDoomCombat")
	    {
			public Item getTabIconItem()
			{
				return DoomItems.swordRainbow;
			}
	    };
	    
	    public static final CreativeTabs tabDoomTools = new CreativeTabs(CreativeTabs.getNextID(), "tabDoomTools")
	    {
			public Item getTabIconItem()
			{
				return DoomItems.pickaxeRuby;
			}
	    };
	    
	    public static final CreativeTabs tabDoomBlocks = new CreativeTabs(CreativeTabs.getNextID(), "tabDoomBlocks")
	    {
			public Item getTabIconItem()
			{
				return Item.getItemFromBlock(DoomBlocks.blockSapphire);
			}
	    };
}
