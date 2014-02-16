package com.chaosmodders.chaosbeasts.generic;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;
import com.chaosmodders.chaosbeasts.items.ChaosItems;

public class ChaosOreDict
{
	public static void addOreDictNames()
	{
		OreDictionary.registerOre("ingotCopper", new ItemStack(ChaosItems.ingotCopper));
		OreDictionary.registerOre("ingotLead", new ItemStack(ChaosItems.ingotLead));
		OreDictionary.registerOre("gemSapphire", new ItemStack(ChaosItems.ItemSapphire));
		OreDictionary.registerOre("gemRuby", new ItemStack(ChaosItems.ItemRuby));
		OreDictionary.registerOre("oreSapphire", new ItemStack(ChaosBlocks.blockSapphireOre));
		OreDictionary.registerOre("oreRuby", new ItemStack(ChaosBlocks.blockRubyOre));
		OreDictionary.registerOre("oreLead", new ItemStack(ChaosBlocks.blockLeadOre));
		OreDictionary.registerOre("oreCopper", new ItemStack(ChaosBlocks.blockCopperOre));
		OreDictionary.registerOre("materialBullet", new ItemStack(ChaosItems.ItemBullet));

	}
}
