package com.doomturd.doomsmod.generic;

import com.doomturd.doomsmod.blocks.DoomBlocks;
import com.doomturd.doomsmod.items.DoomItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class DoomOreDict
{
	public static void addOreDictNames()
	{
		OreDictionary.registerOre("ingotCopper", new ItemStack(DoomItems.ingotCopper));
		OreDictionary.registerOre("ingotLead", new ItemStack(DoomItems.ingotLead));
		OreDictionary.registerOre("gemSapphire", new ItemStack(DoomItems.ItemSapphire));
		OreDictionary.registerOre("gemRuby", new ItemStack(DoomItems.ItemRuby));
		OreDictionary.registerOre("oreSapphire", new ItemStack(DoomBlocks.blockSapphireOre));
		OreDictionary.registerOre("oreRuby", new ItemStack(DoomBlocks.blockRubyOre));
		OreDictionary.registerOre("oreLead", new ItemStack(DoomBlocks.blockLeadOre));
		OreDictionary.registerOre("oreCopper", new ItemStack(DoomBlocks.blockCopperOre));
		OreDictionary.registerOre("materialBullet", new ItemStack(DoomItems.ItemBullet));

	}
}
