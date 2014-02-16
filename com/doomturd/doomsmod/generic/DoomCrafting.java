package com.doomturd.doomsmod.generic;

import com.doomturd.doomsmod.blocks.DoomBlocks;
import com.doomturd.doomsmod.items.DoomItems;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class DoomCrafting
{
	public DoomCrafting()
	{
		//random items/blocks
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(DoomBlocks.blockRuby), "RRR", "RRR", "RRR", 'R', "gemRuby"));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(DoomBlocks.blockSapphire), "RRR", "RRR", "RRR", 'R', "gemSapphire"));
		GameRegistry.addRecipe(new ItemStack(DoomItems.ItemRuby, 9), new Object[]{"R", 'R', DoomBlocks.blockRuby});
		GameRegistry.addRecipe(new ItemStack(DoomItems.ItemSapphire, 9), new Object[]{"R", 'R', DoomBlocks.blockSapphire});
        GameRegistry.addRecipe(new ItemStack(DoomItems.lumpRainbow), new Object[]{"BBB", "BBB", "BBB", 'B', DoomBlocks.blockRainbow});
		GameRegistry.addRecipe(new ItemStack(DoomBlocks.blockRainbow, 9), new Object[]{"L", 'L', DoomItems.lumpRainbow});
		GameRegistry.addRecipe(new ItemStack(DoomBlocks.blockBoneBlock), new Object[]{"BBB", "BBB", "BBB", 'B', Items.bone});
		GameRegistry.addRecipe(new ItemStack(DoomBlocks.blockBlazeRod), new Object[]{"BBB", "BBB", "BBB", 'B', Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(Items.bone, 9), new Object[]{"R", 'R', DoomBlocks.blockBoneBlock});
		GameRegistry.addRecipe(new ItemStack(Items.blaze_rod, 9), new Object[]{"R", 'R', DoomBlocks.blockBlazeRod});
		GameRegistry.addRecipe(new ItemStack(DoomBlocks.blockRainbow), new Object[]{"RRR", "EEE", "SSS", 'R', DoomBlocks.blockRuby, 'E', Blocks.emerald_block, 'S', DoomBlocks.blockSapphire});
		GameRegistry.addRecipe(new ItemStack(DoomItems.rodEmerald, 2), new Object[]{" R ", " R ", 'R', Items.emerald});
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(DoomItems.rodSapphire, 2), " R ", " R ", 'R', "gemSapphire"));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(DoomItems.rodRuby, 2), " R ", " R ", 'R', "gemRuby"));		
		//armor
		GameRegistry.addRecipe(new ItemStack(DoomItems.helmetRuby), new Object[]{"RRR", "R R", "   ", 'R', DoomItems.ItemRuby});
		GameRegistry.addRecipe(new ItemStack(DoomItems.chestplateRuby), new Object[]{"R R", "RRR", "RRR", 'R', DoomItems.ItemRuby});
		GameRegistry.addRecipe(new ItemStack(DoomItems.leggingsRuby), new Object[]{"RRR", "R R", "R R", 'R', DoomItems.ItemRuby});
		GameRegistry.addRecipe(new ItemStack(DoomItems.bootsRuby), new Object[]{"   ", "R R", "R R", 'R', DoomItems.ItemRuby});
		GameRegistry.addRecipe(new ItemStack(DoomItems.helmetRainbow), new Object[]{"RRR", "R R", "   ", 'R', DoomItems.lumpRainbow});
		GameRegistry.addRecipe(new ItemStack(DoomItems.chestplateRainbow), new Object[]{"R R", "RRR", "RRR", 'R', DoomItems.lumpRainbow});
		GameRegistry.addRecipe(new ItemStack(DoomItems.leggingsRainbow), new Object[]{"RRR", "R R", "R R", 'R', DoomItems.lumpRainbow});
		GameRegistry.addRecipe(new ItemStack(DoomItems.bootsRainbow), new Object[]{"   ", "R R", "R R", 'R', DoomItems.lumpRainbow});
		GameRegistry.addRecipe(new ItemStack(DoomItems.helmetEmerald), new Object[]{"RRR", "R R", "   ", 'R', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(DoomItems.chestplateEmerald), new Object[]{"R R", "RRR", "RRR", 'R', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(DoomItems.leggingsEmerald), new Object[]{"RRR", "R R", "R R", 'R', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(DoomItems.bootsEmerald), new Object[]{"   ", "R R", "R R", 'R', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(DoomItems.helmetSapphire), new Object[]{"RRR", "R R", "   ", 'R', DoomItems.ItemSapphire});
		GameRegistry.addRecipe(new ItemStack(DoomItems.chestplateSapphire), new Object[]{"R R", "RRR", "RRR", 'R', DoomItems.ItemSapphire});
		GameRegistry.addRecipe(new ItemStack(DoomItems.leggingsSapphire), new Object[]{"RRR", "R R", "R R", 'R', DoomItems.ItemSapphire});
		GameRegistry.addRecipe(new ItemStack(DoomItems.bootsSapphire), new Object[]{"   ", "R R", "R R", 'R', DoomItems.ItemSapphire});
		
		//tools
		GameRegistry.addRecipe(new ItemStack(DoomItems.swordRuby), new Object[]{" R ", " R ", " S ", 'R', DoomItems.ItemRuby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.spadeRuby), new Object[]{" R ", " S ", " S ", 'R', DoomItems.ItemRuby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.pickaxeRuby), new Object[]{"RRR", " S ", " S ", 'R', DoomItems.ItemRuby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.axeRuby), new Object[]{"RR ", "RS ", " S ", 'R', DoomItems.ItemRuby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.swordRuby), new Object[]{"R", "R", "S", 'R', DoomItems.ItemRuby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.hoeRuby), new Object[]{"RR ", " S ", " S ", 'R', DoomItems.ItemRuby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.swordEmerald), new Object[]{" R ", " R ", " S ", 'R', Items.emerald, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.spadeEmerald), new Object[]{" R ", " S ", " S ", 'R', Items.emerald, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.pickaxeEmerald), new Object[]{"RRR", " S ", " S ", 'R', Items.emerald, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.axeEmerald), new Object[]{"RR ", "RS ", " S ", 'R', Items.emerald, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.swordEmerald), new Object[]{"R", "R", "S", 'R', Items.emerald, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.hoeEmerald), new Object[]{"RR ", " S ", " S ", 'R', Items.emerald, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.swordRainbow), new Object[]{" R ", " R ", " S ", 'R', DoomItems.lumpRainbow, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.spadeRainbow), new Object[]{" R ", " S ", " S ", 'R', DoomItems.lumpRainbow, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.pickaxeRainbow), new Object[]{"RRR", " S ", " S ", 'R', DoomItems.lumpRainbow, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.axeRainbow), new Object[]{"RR ", "RS ", " S ", 'R', DoomItems.lumpRainbow, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.hoeRainbow), new Object[]{"RR ", " S ", " S ", 'R', DoomItems.lumpRainbow, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.swordSapphire), new Object[]{" R ", " R ", " S ", 'R', DoomItems.ItemSapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.spadeSapphire), new Object[]{" R ", " S ", " S ", 'R', DoomItems.ItemSapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.pickaxeSapphire), new Object[]{"RRR", " S ", " S ", 'R', DoomItems.ItemSapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.axeSapphire), new Object[]{"RR ", "RS ", " S ", 'R', DoomItems.ItemSapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.hoeSapphire), new Object[]{"RR ", " S ", " S ", 'R', DoomItems.ItemSapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(DoomItems.swordEnder), new Object[]{" R ", " E ", " S ", 'R', Items.ender_eye, 'E', Items.ender_pearl, 'S', DoomItems.rodEmerald});
		GameRegistry.addRecipe(new ItemStack(DoomItems.spadeEnder), new Object[]{" R ", " S ", " S ", 'R', Items.ender_eye, 'S', DoomItems.rodEmerald});
		GameRegistry.addRecipe(new ItemStack(DoomItems.pickaxeEnder), new Object[]{"RER", " S ", " S ", 'R', Items.ender_pearl, 'E', Items.ender_eye, 'S', DoomItems.rodEmerald});
		GameRegistry.addRecipe(new ItemStack(DoomItems.axeEnder), new Object[]{"ER ", "RS ", " S ", 'R', Items.ender_pearl, 'E', Items.ender_eye, 'S', DoomItems.rodEmerald});
		GameRegistry.addRecipe(new ItemStack(DoomItems.hoeEnder), new Object[]{"RR ", " S ", " S ", 'R', Items.ender_pearl, 'S', DoomItems.rodEmerald});
		
		//Guns
		GameRegistry.addRecipe(new ItemStack(DoomItems.ItemBullet, 5), new Object[]{" G ", "GLG", " C ", 'G', Items.gunpowder, 'L', DoomItems.ingotLead, 'C', DoomItems.ingotCopper});
		GameRegistry.addRecipe(new ItemStack(DoomItems.ItemHandgun), new Object[]{"SS ", "CCC", "  I", 'S', DoomItems.ItemSapphire, 'C', DoomItems.ingotCopper, 'I', Items.iron_ingot});

		//smelting
		GameRegistry.addSmelting(DoomItems.ItemExoskeleton, new ItemStack(DoomItems.crispyExoskeleton), 1.0f);
		GameRegistry.addSmelting(DoomBlocks.blockLeadOre, new ItemStack(DoomItems.ingotLead), 1.0f);
		GameRegistry.addSmelting(DoomBlocks.blockCopperOre, new ItemStack(DoomItems.ingotCopper), 0.7f);
	}
}