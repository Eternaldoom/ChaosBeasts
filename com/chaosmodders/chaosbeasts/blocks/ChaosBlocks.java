package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.fluids.Fluid;

import com.chaosmodders.chaosbeasts.generic.BlockReplaceHelper;
import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class ChaosBlocks
{
    public static Block blockEnergyShard;
    public static Block blockRubyOre;
    public static Block blockRuby;
    public static Block blockDoomPortal;
    public static Block blockSapphire;
    public static Block blockSapphireOre;
    public static Block blockBoneBlock;
    public static Block blockBlazeRod;
    public static Block doomFire;
    public static Block blockLobster;
    public static Block blockDoomedStone;
    public static Block blockDoomedCobblestone;
    public static Block blockDoomedDirt;
    public static Block blockDoomedGrass;
    public static Block DoomedWood;
    public static Block DoomedLeaves;
    public static Block DoomedSapling;
    public static Block blockGlowTNT;
    public static Block blockDemonicOre;
    public static Block blockDemonic;
    public static Block blockLeadOre;
    public static Block blockCopperOre;
    public static Block blockDarknessStone;
    public static Block BlazeFlower;
    public static Block blockDenseGlowstone;
    public static Block blockDarkCobblestone;
    public static Block blockLightCobblestone;
    public static Block blockLightStone;
    public static Block blockLightDirt;
    public static Block blockHolyCactus;
    public static Block blockHydratedStone;
    public static Block blockWaterCrystal;
    public static Block blockXenonOre;
    public static Block blockArgonOre;
    public static Block blockLightGrass;
    public static Block blockRefinedXenon;
    public static Block blockReactorCore;
    public static Block blockUraniumOre;
    public static Block blockUranium;
    public static Block blockTrampoline;
   
    public static Block EnergyReactor;
    public static Block EnergyReactorOn;
        
    public static Block LiquidDoomBlock;
    public static Fluid LiquidDoomFluid;
    
    public static Fluid FluidDarknessFluid;
    public static Block FluidDarknessBlock;
    
    public static Fluid DryWaterFluid;
    public static Block DryWaterBlock;
    
    public static Fluid ArgonGasFluid;
    public static Block ArgonGasBlock;
    
    public static Fluid XenonGasFluid;
    public static Block XenonGasBlock;
    
	public static void addBlocks()
	{
		LiquidDoomFluid = new LiquidDoomFluid();
		FluidDarknessFluid = new FluidDarknessFluid();
		DryWaterFluid = new DryWaterFluid();
		ArgonGasFluid = new ArgonFluid();
		XenonGasFluid = new XenonFluid();
		
		blockEnergyShard = new BlockCustom().setBlockName("blockEnergyShard").setHardness(0.2F).setResistance(1000000.0F).setBlockTextureName("chaosbeasts:energy_shard_block");
    	blockRubyOre = new BlockRubyOre().setBlockName("blockRubyOre").setHardness(3.0F).setResistance(5.0F).setBlockTextureName("chaosbeasts:ruby_ore");
    	blockRuby = new BlockCustom().setBlockName("blockRuby").setHardness(5.0F).setResistance(10.0F).setBlockTextureName("chaosbeasts:ruby_block");
    	blockSapphireOre = new BlockSapphireOre().setBlockName("blockSapphireOre").setHardness(3.0F).setResistance(5.0F).setBlockTextureName("chaosbeasts:sapphire_ore");
    	blockSapphire = new BlockCustom().setBlockName("blockSapphire").setHardness(5.0F).setResistance(10.0F).setBlockTextureName("chaosbeasts:sapphire_block");
    	blockDoomPortal = new DoomPortal().setBlockName("blockDoomPortal").setBlockTextureName("chaosbeasts:doom_portal");
    	blockBoneBlock = new BlockCustom().setBlockName("blockBoneBlock").setHardness(5.0F).setResistance(10.0F).setBlockTextureName("chaosbeasts:bone_block");
    	blockBlazeRod = new BlockCustom().setBlockName("blockBlazeRod").setHardness(5.0F).setResistance(10.0F).setBlockTextureName("chaosbeasts:blaze_rod_block");
    	blockLobster = new TileEntityBlockLobsterBlock().setBlockName("blockLobster").setHardness(0.5F).setResistance(1000000.0F).setBlockTextureName("chaosbeasts:lobster_block_icon");
    	doomFire = new DoomFire().setBlockName("blockDoomFire").setBlockTextureName("chaosbeasts:doom_fire");
    	blockDoomedStone = new BlockDoomedStone().setBlockName("blockDoomedStone").setHardness(5.0F).setResistance(50.0F).setBlockTextureName("chaosbeasts:doomed_stone");
    	blockDoomedCobblestone = new BlockCustom().setBlockName("blockDoomedCobblestone").setHardness(5.0F).setResistance(50.0F).setBlockTextureName("chaosbeasts:doomed_cobblestone");
    	blockDoomedDirt = new BlockDoomedDirt().setBlockName("blockDoomedDirt").setHardness(10.0F).setResistance(0.01F).setBlockTextureName("chaosbeasts:doomed_dirt").setCreativeTab(ChaosTabs.tabChaosBlocks);
    	blockDoomedGrass = new BlockDoomGrass(0).setBlockName("blockDoomedGrass").setHardness(10.0F).setResistance(0.01F).setBlockTextureName("chaosbeasts:doomgrass");
    	DoomedWood = new BlockDoomLog().setBlockName("blockDoomedWood").setBlockTextureName("chaosbeasts:doomed_wood");
    	DoomedLeaves = new DoomedLeaves().setBlockName("blockDoomedLeaves");
    	DoomedSapling = new DoomedSapling().setBlockName("blockDoomedSapling").setBlockTextureName("chaosbeasts:doomed_sapling");
    	blockDemonicOre = new BlockDemonicOre().setBlockName("oreDemonic").setBlockTextureName("chaosbeasts:demonic_ore");
    	blockDemonic = new BlockCustom().setBlockName("blockDemonic").setBlockTextureName("chaosbeasts:demonic_block");
    	blockLeadOre = new BlockCustom().setBlockName("blockLeadOre").setHardness(3.0F).setResistance(5.0F).setBlockTextureName("chaosbeasts:lead_ore");
    	blockCopperOre = new BlockCustom().setBlockName("oreCopper").setHardness(5.0F).setResistance(5.0F).setBlockTextureName("chaosbeasts:copper_ore");
    	blockGlowTNT = new GlowTNT();
    	blockDarknessStone = new BlockDarknessStone();
    	BlazeFlower = new BlazeFlower().setBlockName("blazeFlower").setBlockTextureName("chaosbeasts:blaze_flower");
    	blockDenseGlowstone = new BlockGlassyMod().setBlockName("denseGlowstone").setBlockTextureName("chaosbeasts:dense_glowstone").setHardness(3.0F).setResistance(5.0F).setLightLevel(1);
    	blockDarkCobblestone = new BlockCustom().setHardness(15.0F).setResistance(0.1F).setBlockTextureName("chaosbeasts:dark_cobblestone").setBlockName("darkCobblestone");
    	blockLightCobblestone = new BlockCustom().setHardness(0.01F).setResistance(100000.0F).setBlockTextureName("chaosbeasts:light_cobblestone").setBlockName("lightCobblestone");
    	blockLightStone = new BlockLightStone();
    	blockLightDirt = new BlockLightDirt();
    	blockLightGrass = new BlockLightGrass();
    	blockHolyCactus = new BlockHolyCactus();
    	blockHydratedStone = new BlockHydrastone();
    	blockWaterCrystal = new BlockWaterCrystal();
    	blockXenonOre = new BlockXenonOre();
    	blockArgonOre = new BlockArgonOre();
    	EnergyReactor = new BlockEnergyReactor(false).setBlockName("energyReactor");
    	EnergyReactorOn = new BlockEnergyReactor(true).setBlockName("energyReactorOn");
    	blockRefinedXenon = new BlockCustom().setBlockName("refinedXenonBlock").setBlockTextureName("chaosbeasts:refined_xenon_block");
    	blockReactorCore = new BlockCustom().setBlockName("reactorCore").setBlockTextureName("chaosbeasts:reactor_core").setHardness(13.0F).setResistance(6000000.0F);
    	blockUraniumOre = new BlockCustom().setBlockName("oreUranium").setBlockTextureName("chaosbeasts:uranium_ore").setHardness(7.0F).setResistance(11.0F);
    	blockUranium = new BlockUranium();
    	blockTrampoline = new BlockTrampoline();

    	LiquidDoomBlock = new LiquidDoomBlock().setBlockName("blockLiquidDoom").setBlockTextureName("chaosbeasts:liquiddoom_still");
    	FluidDarknessBlock = new FluidDarknessBlock().setBlockName("fluidDarkness").setBlockTextureName("chaosbeasts:fluid_darkness");
    	DryWaterBlock = new DryWaterBlock().setBlockName("dryWater");
    	ArgonGasBlock = new ArgonFluidBlock().setBlockName("argonGas");
    	XenonGasBlock = new XenonFluidBlock().setBlockName("xenonGas");
    	
    	BlockReplaceHelper.replaceBlock(Blocks.bedrock, BlockChaosBedrock.class);

    	GameRegistry.registerBlock(blockEnergyShard, "energy_shard_block");
    	GameRegistry.registerBlock(blockRubyOre, "ruby_ore");
    	GameRegistry.registerBlock(blockRuby, "ruby_block");
    	GameRegistry.registerBlock(blockDoomPortal, "doom_portal");
    	GameRegistry.registerBlock(blockSapphire, "sapphire_block");
    	GameRegistry.registerBlock(blockSapphireOre, "sapphire_ore");
    	GameRegistry.registerBlock(blockBoneBlock, "bone_block");
    	GameRegistry.registerBlock(blockBlazeRod, "blaze_rod_block");
    	GameRegistry.registerBlock(blockLobster, "lobster_block");
    	GameRegistry.registerBlock(doomFire, "doom_fire");
    	GameRegistry.registerBlock(blockDoomedStone, "doomed_stone");
    	GameRegistry.registerBlock(blockDoomedCobblestone, "doomed_cobblestone");
    	GameRegistry.registerBlock(blockDoomedDirt, "doomed_dirt");
    	GameRegistry.registerBlock(blockDoomedGrass, "doomed_grass");
    	GameRegistry.registerBlock(DoomedWood, "doomed_wood");
    	GameRegistry.registerBlock(DoomedLeaves, "doomed_leaves");
    	GameRegistry.registerBlock(DoomedSapling, "doomed_sapling");
    	GameRegistry.registerBlock(LiquidDoomBlock, "liquid_doom");
    	GameRegistry.registerBlock(blockGlowTNT, "glow_tnt");
    	GameRegistry.registerBlock(blockDemonic, "demonic_block");
    	GameRegistry.registerBlock(blockLeadOre, "lead_ore");
    	GameRegistry.registerBlock(blockCopperOre, "copper_ore");
    	GameRegistry.registerBlock(blockDarknessStone, "darkness_stone");
    	GameRegistry.registerBlock(FluidDarknessBlock, "fluid_darkness");
    	GameRegistry.registerBlock(BlazeFlower, "blaze_flower");
    	GameRegistry.registerBlock(blockDenseGlowstone, "dense_glowstone");
    	GameRegistry.registerBlock(blockDarkCobblestone, "dark_cobblestone");
    	GameRegistry.registerBlock(blockLightCobblestone, "light_cobblestone");
    	GameRegistry.registerBlock(blockLightStone, "light_stone");
    	GameRegistry.registerBlock(blockLightDirt, "light_dirt");
    	GameRegistry.registerBlock(blockLightGrass, "light_grass");
    	GameRegistry.registerBlock(blockHolyCactus, "holy_cactus");
    	GameRegistry.registerBlock(blockHydratedStone, "hydrated_stone");
    	GameRegistry.registerBlock(DryWaterBlock, "dry_water");
    	GameRegistry.registerBlock(blockWaterCrystal, "water_crystal");
    	GameRegistry.registerBlock(blockXenonOre, "xenon_ore");
    	GameRegistry.registerBlock(EnergyReactor, "energy_reactor");
    	GameRegistry.registerBlock(EnergyReactorOn, "energy_reactor_on");
    	GameRegistry.registerBlock(blockRefinedXenon, "refined_xenon_block");
    	GameRegistry.registerBlock(ArgonGasBlock, "argon_gas");
    	GameRegistry.registerBlock(blockArgonOre, "argon_ore");
    	GameRegistry.registerBlock(blockReactorCore, "reactor_core");
    	GameRegistry.registerBlock(blockUraniumOre, "uranium_ore");
    	GameRegistry.registerBlock(blockUranium, "uranium_block");
    	GameRegistry.registerBlock(blockTrampoline, "trampoline");
    	GameRegistry.registerBlock(XenonGasBlock, "xenon_gas");
	}
}
