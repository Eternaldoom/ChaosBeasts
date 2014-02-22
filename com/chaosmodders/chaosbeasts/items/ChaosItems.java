package com.chaosmodders.chaosbeasts.items;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemSimpleFoiled;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;
import com.chaosmodders.chaosbeasts.generic.ChaosHelper;
import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class ChaosItems
{
	public static final int HEAD = 0, BODY = 1, LEGS = 2, BOOTS = 3;
	public static Item ItemRuby;
	public static Item helmetRuby;
	public static Item chestplateRuby;
	public static Item leggingsRuby;
	public static Item bootsRuby;
	public static Item swordRuby;
	public static Item spadeRuby;
	public static Item pickaxeRuby;
	public static Item hoeRuby;
	public static Item axeRuby;
	public static Item helmetRainbow;
	public static Item chestplateRainbow;
	public static Item leggingsRainbow;
	public static Item bootsRainbow;
	public static Item lumpRainbow;
	public static Item swordRainbow;
	public static Item spadeRainbow;
	public static Item pickaxeRainbow;
	public static Item hoeRainbow;
	public static Item axeRainbow;
	public static Item helmetEmerald;
	public static Item chestplateEmerald;
	public static Item leggingsEmerald;
	public static Item bootsEmerald;
	public static Item swordEmerald;
	public static Item spadeEmerald;
	public static Item pickaxeEmerald;
	public static Item hoeEmerald;
	public static Item axeEmerald;
	public static Item ItemSapphire;
	public static Item helmetSapphire;
	public static Item chestplateSapphire;
	public static Item leggingsSapphire;
	public static Item bootsSapphire;
	public static Item swordSapphire;
	public static Item spadeSapphire;
	public static Item pickaxeSapphire;
	public static Item hoeSapphire;
	public static Item axeSapphire;
	public static Item swordEnder;
	public static Item rodSapphire;
	public static Item rodRuby;
	public static Item rodEmerald;
	public static Item ItemExoskeleton;
	public static Item crispyExoskeleton;
	public static Item DoomBucket;
	public static Item ItemThrowingStar;
	public static Item ItemDemonicShard;
	public static Item spadeEnder;
	public static Item axeEnder;
	public static Item pickaxeEnder;
	public static Item hoeEnder;
	public static Item ItemAngelicShard;
	public static Item ItemBullet;
	public static Item ItemHandgun;
	public static Item ingotCopper;
	public static Item ingotLead;
	public static Item ItemEnergyShard;
	public static Item ItemBouncyBall;
	public static Item BasicGrenadeLauncher;
	public static Item ItemRawXenon;
	public static Item ItemStableXenon;
	public static Item ItemRefinedXenon;
	
	public static Item ItemLobsterBlock;
	public static Item ItemEnergyReactor;

	public static Item.ToolMaterial toolRuby;
	public static ArmorMaterial armorRuby;
	public static ArmorMaterial armorRainbow;
	public static Item.ToolMaterial toolRainbow;
	public static ArmorMaterial armorEmerald;
	public static Item.ToolMaterial toolEmerald;
	public static ArmorMaterial armorSapphire;
	public static Item.ToolMaterial toolSapphire;
	public static Item.ToolMaterial toolEnder;
	
	public static void addItems()
	{
	//tool and armor type declarations
	toolRuby = EnumHelper.addToolMaterial("RUBY", 7, 999, 10.0F, 4.0F, 10);
	armorRuby = ChaosHelper.addArmorMaterial("RUBY", 25, new int[]{5, 3, 3, 5}, 10);
	toolRainbow = EnumHelper.addToolMaterial("RAINBOW", 30, 5000, 30.0F, 26.0F, 35);
	armorRainbow = ChaosHelper.addArmorMaterial("RAINBOW", -1, new int[]{12, 17, 15, 12}, 35);
	toolEmerald = EnumHelper.addToolMaterial("REALEMERALD", 5, 3000, 7.0F, 2.0F, 99);
	armorEmerald = ChaosHelper.addArmorMaterial("REALEMERALD", 66, new int[]{3, 4, 4, 3}, 99);
	toolSapphire = EnumHelper.addToolMaterial("SAPPHIRE", 10, 3500, 10.0F, 5.0F, 50);
	armorSapphire = ChaosHelper.addArmorMaterial("SAPPHIRE", 85, new int[]{4, 5, 5, 4}, 50);
	toolEnder = EnumHelper.addToolMaterial("ENDER", 12, -1, 10.0F, 8.0F, 0);
	
	//Fluid and bucket stuff
	DoomBucket = new ItemDoomBucket(ChaosBlocks.LiquidDoomBlock).setUnlocalizedName("doomBucket").setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("chaosbeasts:liquiddoom_bucket");
	
	//normal items
	ItemRuby = new Item().setUnlocalizedName("ruby").setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("ruby");
	lumpRainbow = new Item().setUnlocalizedName("lumpRainbow").setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("chaosbeasts:rainbow_lump");
	ItemSapphire = new ItemSimpleFoiled().setUnlocalizedName("sapphire").setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("chaosbeasts:sapphire");
	rodSapphire = new Item().setUnlocalizedName("rodSapphire").setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("chaosbeasts:sapphire_rod");
	rodRuby = new Item().setUnlocalizedName("rodRuby").setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("chaosbeasts:ruby_rod");
	rodEmerald = new Item().setUnlocalizedName("rodEmerald").setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("chaosbeasts:emerald_rod");
	ItemExoskeleton = new Item().setUnlocalizedName("exoSkeleton").setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("chaosbeasts:exoskeleton");
	ItemThrowingStar = new ItemThrowingStar();
	ItemDemonicShard = new Item().setCreativeTab(ChaosTabs.tabChaosMaterials).setUnlocalizedName("shardDemonic").setTextureName("chaosbeasts:demonic_shard");
	ItemAngelicShard = new Item().setCreativeTab(ChaosTabs.tabChaosMaterials).setUnlocalizedName("shardAngelic").setTextureName("chaosbeasts:angelic_shard");
	ItemBullet = new Item().setCreativeTab(ChaosTabs.tabChaosCombat).setUnlocalizedName("bullet").setTextureName("chaosbeasts:bullet");
	ItemHandgun = new ItemHandgun();
	ingotCopper = new Item().setUnlocalizedName("ingotCopper").setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("chaosbeasts:copper_ingot");
	ingotLead = new Item().setUnlocalizedName("ingotLead").setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("chaosbeasts:lead_ingot");
	ItemBouncyBall = new ItemBouncyBall().setUnlocalizedName("bouncyBall");
	BasicGrenadeLauncher = new ItemGrenadeLauncher();
	ItemRawXenon = new Item().setUnlocalizedName("xenonRaw").setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("chaosbeasts:raw_xenon");
	ItemStableXenon = new Item().setUnlocalizedName("xenonStable").setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("chaosbeasts:stabilized_xenon");
	ItemRefinedXenon = new Item().setUnlocalizedName("xenonRefined").setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("chaosbeasts:refined_xenon");
	
	ItemLobsterBlock = new ItemReed(ChaosBlocks.blockLobster).setCreativeTab(ChaosTabs.tabChaosBlocks).setUnlocalizedName("lobsterStatue");
	ItemEnergyReactor = new ItemReed(ChaosBlocks.EnergyReactor).setCreativeTab(ChaosTabs.tabChaosBlocks).setUnlocalizedName("energyReactor");

	//food
	crispyExoskeleton = new ChaosFood(4, 0.3F, true).setUnlocalizedName("crispyExoSkeleton").setTextureName("chaosbeasts:crispy_exoskeleton");
	
	//tools and armor
	helmetRuby = new ChaosArmor(armorRuby, HEAD, 0, 12.5D, "ruby").setUnlocalizedName("helmetRuby").setTextureName("chaosbeasts:ruby_helmet");
	chestplateRuby = new ChaosArmor(armorRuby, BODY, 1, 12.5D, "ruby").setUnlocalizedName("chestplateRuby").setTextureName("chaosbeasts:ruby_chestplate");
	leggingsRuby = new ChaosArmor(armorRuby, LEGS, 2, 12.5D, "ruby").setUnlocalizedName("leggingsRuby").setTextureName("chaosbeasts:ruby_leggings");
	bootsRuby = new ChaosArmor(armorRuby, BOOTS, 3, 12.5D, "ruby").setUnlocalizedName("bootsRuby").setTextureName("chaosbeasts:ruby_boots");
	swordRuby = new ChaosSword(toolRuby).setUnlocalizedName("swordRuby").setTextureName("chaosbeasts:ruby_sword");
	spadeRuby = new ChaosSpade(toolRuby).setUnlocalizedName("spadeRuby").setTextureName("chaosbeasts:ruby_shovel");
	pickaxeRuby = new ChaosPick(toolRuby).setUnlocalizedName("pickaxeRuby").setTextureName("chaosbeasts:ruby_pickaxe");
	axeRuby = new ChaosAxe(toolRuby).setUnlocalizedName("axeRuby").setTextureName("chaosbeasts:ruby_axe");
	hoeRuby =  new ChaosHoe(toolRuby).setUnlocalizedName("hoeRuby").setTextureName("chaosbeasts:ruby_hoe");
	helmetRainbow = new ChaosInfiniteArmor(armorRainbow, HEAD, 0, 20D, "rainbow").setUnlocalizedName("helmetRainbow").setTextureName("chaosbeasts:rainbow_helmet");
	chestplateRainbow = new ChaosInfiniteArmor(armorRainbow, BODY, 1, 20D, "rainbow").setUnlocalizedName("chestplateRainbow").setTextureName("chaosbeasts:rainbow_chestplate");
	leggingsRainbow = new ChaosInfiniteArmor(armorRainbow, LEGS, 2, 20D, "rainbow").setUnlocalizedName("leggingsRainbow").setTextureName("chaosbeasts:rainbow_leggings");
	bootsRainbow = new ChaosInfiniteArmor(armorRainbow, BOOTS, 3, 20D, "rainbow").setUnlocalizedName("bootsRainbow").setTextureName("chaosbeasts:rainbow_boots");
	swordRainbow = new ChaosSword(toolRainbow).setUnlocalizedName("swordRainbow").setTextureName("chaosbeasts:rainbow_sword");
	spadeRainbow = new ChaosSpade(toolRainbow).setUnlocalizedName("spadeRainbow").setTextureName("chaosbeasts:rainbow_shovel");
	pickaxeRainbow = new ChaosPick(toolRainbow).setUnlocalizedName("pickaxeRainbow").setTextureName("chaosbeasts:rainbow_pickaxe");
	axeRainbow = new ChaosAxe(toolRainbow).setUnlocalizedName("axeRainbow").setTextureName("chaosbeasts:rainbow_axe");
	hoeRainbow =  new ChaosHoe(toolRainbow).setUnlocalizedName("hoeRainbow").setTextureName("chaosbeasts:rainbow_hoe");
	helmetEmerald = new ChaosArmor(armorEmerald, HEAD, 0, 12.5D, "Emerald").setUnlocalizedName("helmetEmerald").setTextureName("chaosbeasts:emerald_helmet");
	chestplateEmerald = new ChaosArmor(armorEmerald, BODY, 1, 12.5D, "Emerald").setUnlocalizedName("chestplateEmerald").setTextureName("chaosbeasts:emerald_chestplate");
	leggingsEmerald = new ChaosArmor(armorEmerald, LEGS, 2, 12.5D, "Emerald").setUnlocalizedName("leggingsEmerald").setTextureName("chaosbeasts:emerald_leggings");
	bootsEmerald = new ChaosArmor(armorEmerald, BOOTS, 3, 12.5D, "Emerald").setUnlocalizedName("bootsEmerald").setTextureName("chaosbeasts:emerald_boots");
	swordEmerald = new ChaosSword(toolEmerald).setUnlocalizedName("swordEmerald").setTextureName("chaosbeasts:emerald_sword");
	spadeEmerald = new ChaosSpade(toolEmerald).setUnlocalizedName("spadeEmerald").setTextureName("chaosbeasts:emerald_shovel");
	pickaxeEmerald = new ChaosPick(toolEmerald).setUnlocalizedName("pickaxeEmerald").setTextureName("chaosbeasts:emerald_pickaxe");
	axeEmerald = new ChaosAxe(toolEmerald).setUnlocalizedName("axeEmerald").setTextureName("chaosbeasts:emerald_axe");
	hoeEmerald =  new ChaosHoe(toolEmerald).setUnlocalizedName("hoeEmerald").setTextureName("chaosbeasts:emerald_hoe");
	helmetSapphire = new ChaosShinyArmor(armorSapphire, 0, "helmet_Sapphire", "sapphire").setUnlocalizedName("helmetSapphire").setTextureName("chaosbeasts:sapphire_helmet");
	chestplateSapphire = new ChaosShinyArmor(armorSapphire, 1, "chestplate_Sapphire", "sapphire").setUnlocalizedName("chestplateSapphire").setTextureName("chaosbeasts:sapphire_chestplate");
	leggingsSapphire = new ChaosShinyArmor(armorSapphire, 2, "leggings_Sapphire", "sapphire").setUnlocalizedName("leggingsSapphire").setTextureName("chaosbeasts:sapphire_leggings");
	bootsSapphire = new ChaosShinyArmor(armorSapphire, 3, "boots_Sapphire", "sapphire").setUnlocalizedName("bootsSapphire").setTextureName("chaosbeasts:sapphire_boots");
	swordSapphire = new ChaosSword(toolSapphire).setUnlocalizedName("swordSapphire").setTextureName("chaosbeasts:sapphire_sword");
	spadeSapphire = new ChaosSpade(toolSapphire).setUnlocalizedName("spadeSapphire").setTextureName("chaosbeasts:sapphire_shovel");
	pickaxeSapphire = new ChaosPick(toolSapphire).setUnlocalizedName("pickaxeSapphire").setTextureName("chaosbeasts:sapphire_pickaxe");
	axeSapphire = new ChaosAxe(toolSapphire).setUnlocalizedName("axeSapphire").setTextureName("chaosbeasts:sapphire_axe");
	hoeSapphire =  new ChaosHoe(toolSapphire).setUnlocalizedName("hoeSapphire").setTextureName("chaosbeasts:sapphire_hoe");
	swordEnder = new ChaosSword(toolEnder).setUnlocalizedName("swordEnder").setTextureName("chaosbeasts:ender_sword");
	spadeEnder = new ChaosSpade(toolEnder).setUnlocalizedName("spadeEnder").setTextureName("chaosbeasts:ender_shovel");
	pickaxeEnder = new ChaosPick(toolEnder).setUnlocalizedName("pickaxeEnder").setTextureName("chaosbeasts:ender_pickaxe");
	axeEnder = new ChaosAxe(toolEnder).setUnlocalizedName("axeEnder").setTextureName("chaosbeasts:ender_axe");
	hoeEnder =  new ChaosHoe(toolEnder).setUnlocalizedName("hoeEnder").setTextureName("chaosbeasts:ender_hoe");
	ItemEnergyShard = new ItemSimpleFoiled().setCreativeTab(ChaosTabs.tabChaosMaterials).setTextureName("chaosbeasts:energy_shard").setUnlocalizedName("shardEnergy");
	
	armorRuby.customCraftingMaterial = ItemRuby;
	
	GameRegistry.registerItem(ItemRuby, "ruby");
	GameRegistry.registerItem(ItemSapphire, "sapphire");
	GameRegistry.registerItem(lumpRainbow, "rainbow_lump");
	GameRegistry.registerItem(helmetRuby, "ruby_helmet");
	GameRegistry.registerItem(chestplateRuby, "ruby_chestplate");
	GameRegistry.registerItem(leggingsRuby, "ruby_leggings");
	GameRegistry.registerItem(bootsRuby, "ruby_boots");
	GameRegistry.registerItem(swordRuby, "ruby_sword");
	GameRegistry.registerItem(spadeRuby, "ruby_shovel");
	GameRegistry.registerItem(pickaxeRuby, "ruby_pickaxe");
	GameRegistry.registerItem(axeRuby, "ruby_axe");
	GameRegistry.registerItem(hoeRuby, "ruby_hoe");
	GameRegistry.registerItem(helmetRainbow, "rainbow_helmet");
	GameRegistry.registerItem(chestplateRainbow, "rainbow_chestplate");
	GameRegistry.registerItem(leggingsRainbow, "rainbow_leggings");
	GameRegistry.registerItem(bootsRainbow, "rainbow_boots");
	GameRegistry.registerItem(swordRainbow, "rainbow_sword");
	GameRegistry.registerItem(spadeRainbow, "rainbow_shovel");
	GameRegistry.registerItem(pickaxeRainbow, "rainbow_pickaxe");
	GameRegistry.registerItem(axeRainbow, "rainbow_axe");
	GameRegistry.registerItem(hoeRainbow, "rainbow_hoe");
	GameRegistry.registerItem(helmetEmerald, "emerald_helmet");
	GameRegistry.registerItem(chestplateEmerald, "emerald_chestplate");
	GameRegistry.registerItem(leggingsEmerald, "emerald_leggings");
	GameRegistry.registerItem(bootsEmerald, "emerald_boots");
	GameRegistry.registerItem(swordEmerald, "emerald_sword");
	GameRegistry.registerItem(spadeEmerald, "emerald_shovel");
	GameRegistry.registerItem(pickaxeEmerald, "emerald_pickaxe");
	GameRegistry.registerItem(axeEmerald, "emerald_axe");
	GameRegistry.registerItem(hoeEmerald, "emerald_hoe");
	GameRegistry.registerItem(helmetSapphire, "sapphire_helmet");
	GameRegistry.registerItem(chestplateSapphire, "sapphire_chestplate");
	GameRegistry.registerItem(leggingsSapphire, "sapphire_leggings");
	GameRegistry.registerItem(bootsSapphire, "sapphire_boots");
	GameRegistry.registerItem(swordSapphire, "sapphire_sword");
	GameRegistry.registerItem(spadeSapphire, "sapphire_shovel");
	GameRegistry.registerItem(pickaxeSapphire, "sapphire_pickaxe");
	GameRegistry.registerItem(axeSapphire, "sapphire_axe");
	GameRegistry.registerItem(hoeSapphire, "sapphire_hoe");
	GameRegistry.registerItem(swordEnder, "ender_sword");
	GameRegistry.registerItem(spadeEnder, "ender_shovel");
	GameRegistry.registerItem(pickaxeEnder, "ender_pickaxe");
	GameRegistry.registerItem(axeEnder, "ender_axe");
	GameRegistry.registerItem(hoeEnder, "ender_hoe");
	GameRegistry.registerItem(rodSapphire, "sapphire_rod");
	GameRegistry.registerItem(rodRuby, "ruby_rod");
	GameRegistry.registerItem(rodEmerald, "emerald_rod");
	GameRegistry.registerItem(ItemExoskeleton, "exoskeleton");
	GameRegistry.registerItem(crispyExoskeleton, "crispy_exoskeleton");
	GameRegistry.registerItem(DoomBucket, "doom_bucket");
	GameRegistry.registerItem(ItemThrowingStar, "throwing_star");
	GameRegistry.registerItem(ItemDemonicShard, "demonic_shard");
	GameRegistry.registerItem(ItemAngelicShard, "angelic_shard");
	GameRegistry.registerItem(ItemBullet, "bullet");
	GameRegistry.registerItem(ItemHandgun, "handgun");
	GameRegistry.registerItem(ingotCopper, "copper_ingot");
	GameRegistry.registerItem(ingotLead, "lead_ingot");
	GameRegistry.registerItem(ItemEnergyShard, "energy_shard");
	GameRegistry.registerItem(ItemBouncyBall, "bouncy_ball");
	GameRegistry.registerItem(BasicGrenadeLauncher, "basic_grenade_launcher");
	GameRegistry.registerItem(ItemRawXenon, "raw_xenon");
	GameRegistry.registerItem(ItemStableXenon, "stable_xenon");
	GameRegistry.registerItem(ItemRefinedXenon, "refined_xenon");
	GameRegistry.registerItem(ItemLobsterBlock, "lobster_statue");
	GameRegistry.registerItem(ItemEnergyReactor, "energy_reactor");

	FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("liquid_doom", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(DoomBucket), new ItemStack(Items.bucket));
	}
}
