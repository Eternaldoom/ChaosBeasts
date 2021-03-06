package com.chaosmodders.chaosbeasts.generic;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;
import com.chaosmodders.chaosbeasts.items.ChaosItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ChaosCrafting
{
	public ChaosCrafting()
	{
		//random items/blocks
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ChaosBlocks.blockRuby), "RRR", "RRR", "RRR", 'R', "gemRuby"));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ChaosBlocks.blockSapphire), "RRR", "RRR", "RRR", 'R', "gemSapphire"));
		GameRegistry.addRecipe(new ItemStack(ChaosItems.ItemRuby, 9), new Object[]{"R", 'R', ChaosBlocks.blockRuby});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.ItemSapphire, 9), new Object[]{"R", 'R', ChaosBlocks.blockSapphire});
        GameRegistry.addRecipe(new ItemStack(ChaosItems.ItemAngelicShard), new Object[]{"BBB", "BBB", "BBB", 'B', ChaosBlocks.blockEnergyShard});
		GameRegistry.addRecipe(new ItemStack(ChaosBlocks.blockEnergyShard, 9), new Object[]{"L", 'L', ChaosItems.ItemAngelicShard});
		GameRegistry.addRecipe(new ItemStack(ChaosBlocks.blockBoneBlock), new Object[]{"BBB", "BBB", "BBB", 'B', Items.bone});
		GameRegistry.addRecipe(new ItemStack(ChaosBlocks.blockBlazeRod), new Object[]{"BBB", "BBB", "BBB", 'B', Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(ChaosBlocks.blockDenseGlowstone), new Object[]{"GGG", "GGG", "GGG", 'G', Blocks.glowstone});
		GameRegistry.addRecipe(new ItemStack(Blocks.glowstone, 9), new Object[]{"R", 'R', ChaosBlocks.blockDenseGlowstone});
		GameRegistry.addShapedRecipe(new ItemStack(ChaosBlocks.blockGlowTNT), "GTG", "TGT", "GTG", 'G', ChaosBlocks.blockDenseGlowstone, 'T', Blocks.tnt);
		GameRegistry.addRecipe(new ItemStack(Items.bone, 9), new Object[]{"R", 'R', ChaosBlocks.blockBoneBlock});
		GameRegistry.addRecipe(new ItemStack(Items.blaze_rod, 9), new Object[]{"R", 'R', ChaosBlocks.blockBlazeRod});
		GameRegistry.addRecipe(new ItemStack(ChaosBlocks.blockEnergyShard), new Object[]{"RRR", "EEE", "SSS", 'R', ChaosBlocks.blockRuby, 'E', Blocks.emerald_block, 'S', ChaosBlocks.blockSapphire});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.rodEmerald, 2), new Object[]{" R ", " R ", 'R', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(Items.blaze_rod), new Object[]{" R ", " R ", 'R', Items.blaze_powder});
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ChaosItems.rodSapphire, 2), " R ", " R ", 'R', "gemSapphire"));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ChaosItems.rodRuby, 2), " R ", " R ", 'R', "gemRuby"));	
		GameRegistry.addRecipe(new ItemStack(ChaosBlocks.EnergyReactor), new Object[]{"DGD", "GCG", "DGD", 'D', ChaosBlocks.blockDarknessStone, 'G', Blocks.stained_glass, 'C', ChaosBlocks.blockReactorCore});
		GameRegistry.addShapelessRecipe(new ItemStack(ChaosItems.ItemNetherShard, 3), new ItemStack(Items.nether_star));
		GameRegistry.addRecipe(new ItemStack(ChaosItems.ItemEnergyShard, 16), new Object[]{"CRC", "RRR", "CRC", 'R', ChaosItems.ItemNetherShard, 'C', Blocks.coal_block});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.orbAquatic), new Object[]{"SSS", "SSS", 'S', ChaosItems.ItemAquaticShard});

		//armor
		GameRegistry.addRecipe(new ItemStack(ChaosItems.helmetRuby), new Object[]{"RRR", "R R", "   ", 'R', ChaosItems.ItemRuby});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.chestplateRuby), new Object[]{"R R", "RRR", "RRR", 'R', ChaosItems.ItemRuby});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.leggingsRuby), new Object[]{"RRR", "R R", "R R", 'R', ChaosItems.ItemRuby});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.bootsRuby), new Object[]{"   ", "R R", "R R", 'R', ChaosItems.ItemRuby});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.helmetangelic), new Object[]{"RRR", "R R", "   ", 'R', ChaosItems.ItemAngelicShard});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.chestplateangelic), new Object[]{"R R", "RRR", "RRR", 'R', ChaosItems.ItemAngelicShard});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.leggingsangelic), new Object[]{"RRR", "R R", "R R", 'R', ChaosItems.ItemAngelicShard});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.bootsangelic), new Object[]{"   ", "R R", "R R", 'R', ChaosItems.ItemAngelicShard});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.helmetEmerald), new Object[]{"RRR", "R R", "   ", 'R', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.chestplateEmerald), new Object[]{"R R", "RRR", "RRR", 'R', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.leggingsEmerald), new Object[]{"RRR", "R R", "R R", 'R', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.bootsEmerald), new Object[]{"   ", "R R", "R R", 'R', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.helmetSapphire), new Object[]{"RRR", "R R", "   ", 'R', ChaosItems.ItemSapphire});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.chestplateSapphire), new Object[]{"R R", "RRR", "RRR", 'R', ChaosItems.ItemSapphire});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.leggingsSapphire), new Object[]{"RRR", "R R", "R R", 'R', ChaosItems.ItemSapphire});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.bootsSapphire), new Object[]{"   ", "R R", "R R", 'R', ChaosItems.ItemSapphire});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.helmetAquatic), new Object[]{"RRR", "R R", "   ", 'R', ChaosItems.orbAquatic});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.chestplateAquatic), new Object[]{"R R", "RRR", "RRR", 'R', ChaosItems.orbAquatic});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.leggingsAquatic), new Object[]{"RRR", "R R", "R R", 'R', ChaosItems.orbAquatic});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.bootsAquatic), new Object[]{"   ", "R R", "R R", 'R', ChaosItems.orbAquatic});
		
		//tools
		GameRegistry.addRecipe(new ItemStack(ChaosItems.swordRuby), new Object[]{" R ", " R ", " S ", 'R', ChaosItems.ItemRuby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.spadeRuby), new Object[]{" R ", " S ", " S ", 'R', ChaosItems.ItemRuby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.pickaxeRuby), new Object[]{"RRR", " S ", " S ", 'R', ChaosItems.ItemRuby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.axeRuby), new Object[]{"RR ", "RS ", " S ", 'R', ChaosItems.ItemRuby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.swordRuby), new Object[]{"R", "R", "S", 'R', ChaosItems.ItemRuby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.hoeRuby), new Object[]{"RR ", " S ", " S ", 'R', ChaosItems.ItemRuby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.swordEmerald), new Object[]{" R ", " R ", " S ", 'R', Items.emerald, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.spadeEmerald), new Object[]{" R ", " S ", " S ", 'R', Items.emerald, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.pickaxeEmerald), new Object[]{"RRR", " S ", " S ", 'R', Items.emerald, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.axeEmerald), new Object[]{"RR ", "RS ", " S ", 'R', Items.emerald, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.swordEmerald), new Object[]{"R", "R", "S", 'R', Items.emerald, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.hoeEmerald), new Object[]{"RR ", " S ", " S ", 'R', Items.emerald, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.swordangelic), new Object[]{" R ", " R ", " S ", 'R', ChaosItems.ItemAngelicShard, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.spadeangelic), new Object[]{" R ", " S ", " S ", 'R', ChaosItems.ItemAngelicShard, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.pickaxeangelic), new Object[]{"RRR", " S ", " S ", 'R', ChaosItems.ItemAngelicShard, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.axeangelic), new Object[]{"RR ", "RS ", " S ", 'R', ChaosItems.ItemAngelicShard, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.hoeangelic), new Object[]{"RR ", " S ", " S ", 'R', ChaosItems.ItemAngelicShard, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.swordSapphire), new Object[]{" R ", " R ", " S ", 'R', ChaosItems.ItemSapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.spadeSapphire), new Object[]{" R ", " S ", " S ", 'R', ChaosItems.ItemSapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.pickaxeSapphire), new Object[]{"RRR", " S ", " S ", 'R', ChaosItems.ItemSapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.axeSapphire), new Object[]{"RR ", "RS ", " S ", 'R', ChaosItems.ItemSapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.hoeSapphire), new Object[]{"RR ", " S ", " S ", 'R', ChaosItems.ItemSapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.swordEnder), new Object[]{" R ", " E ", " S ", 'R', Items.ender_eye, 'E', Items.ender_pearl, 'S', ChaosItems.rodEmerald});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.spadeEnder), new Object[]{" R ", " S ", " S ", 'R', Items.ender_eye, 'S', ChaosItems.rodEmerald});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.pickaxeEnder), new Object[]{"RER", " S ", " S ", 'R', Items.ender_pearl, 'E', Items.ender_eye, 'S', ChaosItems.rodEmerald});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.axeEnder), new Object[]{"ER ", "RS ", " S ", 'R', Items.ender_pearl, 'E', Items.ender_eye, 'S', ChaosItems.rodEmerald});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.hoeEnder), new Object[]{"RR ", " S ", " S ", 'R', Items.ender_pearl, 'S', ChaosItems.rodEmerald});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.swordAquatic), new Object[]{" R ", " R ", " S ", 'R', ChaosItems.orbAquatic, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.spadeAquatic), new Object[]{" R ", " S ", " S ", 'R', ChaosItems.orbAquatic, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.pickaxeAquatic), new Object[]{"RRR", " S ", " S ", 'R', ChaosItems.orbAquatic, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.axeAquatic), new Object[]{"RR ", "RS ", " S ", 'R', ChaosItems.orbAquatic, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.hoeAquatic), new Object[]{"RR ", " S ", " S ", 'R', ChaosItems.orbAquatic, 'S', Items.stick});
		
		//Guns
		GameRegistry.addRecipe(new ItemStack(ChaosItems.ItemBullet, 5), new Object[]{" G ", "GLG", " C ", 'G', Items.gunpowder, 'L', ChaosItems.ingotLead, 'C', ChaosItems.ingotCopper});
		GameRegistry.addRecipe(new ItemStack(ChaosItems.ItemHandgun), new Object[]{"SS ", "CCC", "  I", 'S', ChaosItems.ItemSapphire, 'C', ChaosItems.ingotCopper, 'I', Items.iron_ingot});

		//smelting
		GameRegistry.addSmelting(ChaosItems.ItemExoskeleton, new ItemStack(ChaosItems.crispyExoskeleton), 1.0f);
		GameRegistry.addSmelting(ChaosBlocks.blockLeadOre, new ItemStack(ChaosItems.ingotLead), 1.0f);
		GameRegistry.addSmelting(ChaosBlocks.blockCopperOre, new ItemStack(ChaosItems.ingotCopper), 0.7f);
		GameRegistry.addSmelting(ChaosBlocks.blockDoomedCobblestone, new ItemStack(ChaosBlocks.blockDoomedStone), 2.0f);
		GameRegistry.addSmelting(ChaosBlocks.blockDarkCobblestone, new ItemStack(ChaosBlocks.blockDarknessStone), 5.0f);
		GameRegistry.addSmelting(ChaosBlocks.blockUraniumOre, new ItemStack(ChaosItems.ingotUranium), 5.0f);
	}
}