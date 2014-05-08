package com.chaosmodders.chaosbeasts.items;

import java.util.List;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ChaosSword extends ItemSword{

	private String name;

    public ChaosSword(ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
		setCreativeTab(ChaosTabs.tabChaosCombat);
	}

	@Override
	public boolean isItemTool(ItemStack par1ItemStack) {
		return true;
	}

	@Override
	public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
		if(item.getMaxDamage() == -1) {
			infoList.add("Infinite Uses");
		}
		else {
			infoList.add(item.getMaxDamage() - item.getItemDamage() + " Uses Remaining");
		}
	}
}