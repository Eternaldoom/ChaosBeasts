package com.chaosmodders.chaosbeasts.items;

import net.minecraft.item.Item;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

public class ItemXenon extends Item {
    public ItemXenon()
    {
        this.maxStackSize = 64;
        this.setMaxDamage(30000);
        this.setCreativeTab(ChaosTabs.tabChaosMaterials);
        this.setTextureName("chaosbeasts:xenon");
        this.setUnlocalizedName("xenon");
    }
}
