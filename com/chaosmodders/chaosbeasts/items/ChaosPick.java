package com.chaosmodders.chaosbeasts.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ChaosPick extends ItemPickaxe{

	ToolMaterial t;

	public ChaosPick(ToolMaterial tool) {
		super(tool);
		t = tool;
		setCreativeTab(ChaosTabs.tabChaosTools);
	}

    @Override
    public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
        infoList.add(item.getMaxDamage() - item.getItemDamage() + " Uses Remaining");
        infoList.add(this.t.getEfficiencyOnProperMaterial() + " Efficiency");
    }
}