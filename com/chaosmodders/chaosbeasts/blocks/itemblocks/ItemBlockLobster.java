package com.chaosmodders.chaosbeasts.blocks.itemblocks;
 
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
 
public class ItemBlockLobster extends ItemBlock
{
	public static ItemBlock instance;
    public ItemBlockLobster(Block block)
    {
        super(block);
        setHasSubtypes(true);
    }
 
    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        String name = "";
        switch (itemstack.getItemDamage())
        {
        case 0:
        {
            name = "world";
            break;
        }
        case 1:
        {
            name = "nether";
            break;
        }
        default:
            name = "broken";
        }
        return getUnlocalizedName() + "." + name;
    }
 
    @Override
    public int getMetadata(int par1)
    {
        return par1;
    }
}