package com.doomturd.doomsmod.items;

import com.doomturd.doomsmod.blocks.DoomBlocks;
import com.doomturd.doomsmod.generic.DoomTabs;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSimpleFoiled;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class DoomItems
{
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

	public static Item.ToolMaterial toolRuby;
	public static ItemArmor.ArmorMaterial armorRuby;
	public static ItemArmor.ArmorMaterial armorRainbow;
	public static Item.ToolMaterial toolRainbow;
	public static ItemArmor.ArmorMaterial armorEmerald;
	public static Item.ToolMaterial toolEmerald;
	public static ItemArmor.ArmorMaterial armorSapphire;
	public static Item.ToolMaterial toolSapphire;
	public static Item.ToolMaterial toolEnder;
	
	public static void addItems()
	{
	//tool and armor type declarations
	toolRuby = EnumHelper.addToolMaterial("RUBY", 3, 999, 10.0F, 4.0F, 10);
	armorRuby = EnumHelper.addArmorMaterial("RUBY", 25, new int[]{5, 3, 3, 5}, 10);
	toolRainbow = EnumHelper.addToolMaterial("RAINBOW", 3, 5000, 20.0F, 26.0F, 35);
	armorRainbow = EnumHelper.addArmorMaterial("RAINBOW", 5000, new int[]{12, 17, 15, 12}, 35);
	toolEmerald = EnumHelper.addToolMaterial("REALEMERALD", 3, 3000, 7.0F, 2.0F, 99);
	armorEmerald = EnumHelper.addArmorMaterial("REALEMERALD", 66, new int[]{3, 4, 4, 3}, 99);
	toolSapphire = EnumHelper.addToolMaterial("SAPPHIRE", 3, 3500, 10.0F, 5.0F, 50);
	armorSapphire = EnumHelper.addArmorMaterial("SAPPHIRE", 85, new int[]{4, 5, 5, 4}, 50);
	toolEnder = EnumHelper.addToolMaterial("ENDER", 3, -1, 10.0F, 8.0F, 0);
	
	//Fluid and bucket stuff
	DoomBucket = new ItemDoomBucket(DoomBlocks.LiquidDoomBlock).setUnlocalizedName("doomBucket").setCreativeTab(DoomTabs.tabDoomMaterials).setTextureName("doomsmod:liquiddoom_bucket");
	
	//normal items
	ItemRuby = new Item().setUnlocalizedName("ruby").setCreativeTab(DoomTabs.tabDoomMaterials).setTextureName("ruby");
	lumpRainbow = new Item().setUnlocalizedName("lumpRainbow").setCreativeTab(DoomTabs.tabDoomMaterials).setTextureName("doomsmod:rainbow_lump");
	ItemSapphire = new ItemSimpleFoiled().setUnlocalizedName("sapphire").setCreativeTab(DoomTabs.tabDoomMaterials).setTextureName("doomsmod:sapphire");
	rodSapphire = new Item().setUnlocalizedName("rodSapphire").setCreativeTab(DoomTabs.tabDoomMaterials).setTextureName("doomsmod:sapphire_rod");
	rodRuby = new Item().setUnlocalizedName("rodRuby").setCreativeTab(DoomTabs.tabDoomMaterials).setTextureName("doomsmod:ruby_rod");
	rodEmerald = new Item().setUnlocalizedName("rodEmerald").setCreativeTab(DoomTabs.tabDoomMaterials).setTextureName("doomsmod:emerald_rod");
	ItemExoskeleton = new Item().setUnlocalizedName("exoSkeleton").setCreativeTab(DoomTabs.tabDoomMaterials).setTextureName("doomsmod:exoskeleton");
	ItemThrowingStar = new ItemThrowingStar();
	ItemDemonicShard = new Item().setCreativeTab(DoomTabs.tabDoomMaterials).setUnlocalizedName("shardDemonic").setTextureName("doomsmod:demonic_shard");
	ItemAngelicShard = new Item().setCreativeTab(DoomTabs.tabDoomMaterials).setUnlocalizedName("shardAngelic").setTextureName("doomsmod:angelic_shard");
	ItemBullet = new Item().setCreativeTab(DoomTabs.tabDoomCombat).setUnlocalizedName("bullet").setTextureName("doomsmod:bullet");
	ItemHandgun = new ItemHandgun();
	ingotCopper = new Item().setUnlocalizedName("ingotCopper").setCreativeTab(DoomTabs.tabDoomMaterials).setTextureName("doomsmod:copper_ingot");
	ingotLead = new Item().setUnlocalizedName("ingotLead").setCreativeTab(DoomTabs.tabDoomMaterials).setTextureName("doomsmod:lead_ingot");

	//food
	crispyExoskeleton = new DoomFood(4, 0.3F, true).setUnlocalizedName("crispyExoSkeleton").setTextureName("doomsmod:crispy_exoskeleton");
	
	//tools and armor
	helmetRuby = new DoomArmor(armorRuby, 0, "helmet_ruby", "ruby").setUnlocalizedName("helmetRuby").setTextureName("doomsmod:ruby_helmet");
	chestplateRuby = new DoomArmor(armorRuby, 1, "chestplate_ruby", "ruby").setUnlocalizedName("chestplateRuby").setTextureName("doomsmod:ruby_chestplate");
	leggingsRuby = new DoomArmor(armorRuby, 2, "leggings_ruby", "ruby").setUnlocalizedName("leggingsRuby").setTextureName("doomsmod:ruby_leggings");
	bootsRuby = new DoomArmor(armorRuby, 3, "boots_ruby", "ruby").setUnlocalizedName("bootsRuby").setTextureName("doomsmod:ruby_boots");
	swordRuby = new DoomSword(toolRuby).setUnlocalizedName("swordRuby").setTextureName("doomsmod:ruby_sword");
	spadeRuby = new DoomSpade(toolRuby).setUnlocalizedName("spadeRuby").setTextureName("doomsmod:ruby_shovel");
	pickaxeRuby = new DoomPick(toolRuby).setUnlocalizedName("pickaxeRuby").setTextureName("doomsmod:ruby_pickaxe");
	axeRuby = new DoomAxe(toolRuby).setUnlocalizedName("axeRuby").setTextureName("doomsmod:ruby_axe");
	hoeRuby =  new DoomHoe(toolRuby).setUnlocalizedName("hoeRuby").setTextureName("doomsmod:ruby_hoe");
	helmetRainbow = new DoomArmor(armorRainbow, 0, "helmet_rainbow", "rainbow").setUnlocalizedName("helmetRainbow").setTextureName("doomsmod:rainbow_helmet");
	chestplateRainbow = new DoomArmor(armorRainbow, 1, "chestplate_rainbow", "rainbow").setUnlocalizedName("chestplateRainbow").setTextureName("doomsmod:rainbow_chestplate");
	leggingsRainbow = new DoomArmor(armorRainbow, 2, "leggings_rainbow", "rainbow").setUnlocalizedName("leggingsRainbow").setTextureName("doomsmod:rainbow_leggings");
	bootsRainbow = new DoomArmor(armorRainbow, 3, "boots_rainbow", "rainbow").setUnlocalizedName("bootsRainbow").setTextureName("doomsmod:rainbow_boots");
	swordRainbow = new DoomSword(toolRainbow).setUnlocalizedName("swordRainbow").setTextureName("doomsmod:rainbow_sword");
	spadeRainbow = new DoomSpade(toolRainbow).setUnlocalizedName("spadeRainbow").setTextureName("doomsmod:rainbow_shovel");
	pickaxeRainbow = new DoomPick(toolRainbow).setUnlocalizedName("pickaxeRainbow").setTextureName("doomsmod:rainbow_pickaxe");
	axeRainbow = new DoomAxe(toolRainbow).setUnlocalizedName("axeRainbow").setTextureName("doomsmod:rainbow_axe");
	hoeRainbow =  new DoomHoe(toolRainbow).setUnlocalizedName("hoeRainbow").setTextureName("doomsmod:rainbow_hoe");
	helmetEmerald = new DoomArmor(armorEmerald, 0, "helmet_Emerald", "Emerald").setUnlocalizedName("helmetEmerald").setTextureName("doomsmod:emerald_helmet");
	chestplateEmerald = new DoomArmor(armorEmerald, 1, "chestplate_Emerald", "Emerald").setUnlocalizedName("chestplateEmerald").setTextureName("doomsmod:emerald_chestplate");
	leggingsEmerald = new DoomArmor(armorEmerald, 2, "leggings_Emerald", "Emerald").setUnlocalizedName("leggingsEmerald").setTextureName("doomsmod:emerald_leggings");
	bootsEmerald = new DoomArmor(armorEmerald, 3, "boots_Emerald", "Emerald").setUnlocalizedName("bootsEmerald").setTextureName("doomsmod:emerald_boots");
	swordEmerald = new DoomSword(toolEmerald).setUnlocalizedName("swordEmerald").setTextureName("doomsmod:emerald_sword");
	spadeEmerald = new DoomSpade(toolEmerald).setUnlocalizedName("spadeEmerald").setTextureName("doomsmod:emerald_shovel");
	pickaxeEmerald = new DoomPick(toolEmerald).setUnlocalizedName("pickaxeEmerald").setTextureName("doomsmod:emerald_pickaxe");
	axeEmerald = new DoomAxe(toolEmerald).setUnlocalizedName("axeEmerald").setTextureName("doomsmod:emerald_axe");
	hoeEmerald =  new DoomHoe(toolEmerald).setUnlocalizedName("hoeEmerald").setTextureName("doomsmod:emerald_hoe");
	helmetSapphire = new DoomShinyArmor(armorSapphire, 0, "helmet_Sapphire", "sapphire").setUnlocalizedName("helmetSapphire").setTextureName("doomsmod:sapphire_helmet");
	chestplateSapphire = new DoomShinyArmor(armorSapphire, 1, "chestplate_Sapphire", "sapphire").setUnlocalizedName("chestplateSapphire").setTextureName("doomsmod:sapphire_chestplate");
	leggingsSapphire = new DoomShinyArmor(armorSapphire, 2, "leggings_Sapphire", "sapphire").setUnlocalizedName("leggingsSapphire").setTextureName("doomsmod:sapphire_leggings");
	bootsSapphire = new DoomShinyArmor(armorSapphire, 3, "boots_Sapphire", "sapphire").setUnlocalizedName("bootsSapphire").setTextureName("doomsmod:sapphire_boots");
	swordSapphire = new DoomSword(toolSapphire).setUnlocalizedName("swordSapphire").setTextureName("doomsmod:sapphire_sword");
	spadeSapphire = new DoomSpade(toolSapphire).setUnlocalizedName("spadeSapphire").setTextureName("doomsmod:sapphire_shovel");
	pickaxeSapphire = new DoomPick(toolSapphire).setUnlocalizedName("pickaxeSapphire").setTextureName("doomsmod:sapphire_pickaxe");
	axeSapphire = new DoomAxe(toolSapphire).setUnlocalizedName("axeSapphire").setTextureName("doomsmod:sapphire_axe");
	hoeSapphire =  new DoomHoe(toolSapphire).setUnlocalizedName("hoeSapphire").setTextureName("doomsmod:sapphire_hoe");
	swordEnder = new DoomSword(toolEnder).setUnlocalizedName("swordEnder").setTextureName("doomsmod:ender_sword");
	spadeEnder = new DoomSpade(toolEnder).setUnlocalizedName("spadeEnder").setTextureName("doomsmod:ender_shovel");
	pickaxeEnder = new DoomPick(toolEnder).setUnlocalizedName("pickaxeEnder").setTextureName("doomsmod:ender_pickaxe");
	axeEnder = new DoomAxe(toolEnder).setUnlocalizedName("axeEnder").setTextureName("doomsmod:ender_axe");
	hoeEnder =  new DoomHoe(toolEnder).setUnlocalizedName("hoeEnder").setTextureName("doomsmod:ender_hoe");
	
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

	FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("liquid_doom", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(DoomBucket), new ItemStack(Items.bucket));
	}
}
