package com.chaosmodders.chaosbeasts.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;

import com.chaosmodders.chaosbeasts.generic.ChaosTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class ChaosBlocks
{
    public static Block blockRainbow;
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
    
    public static Block LiquidDoomBlock;
    public static Fluid LiquidDoomFluid;
    
    public static Fluid FluidDarknessFluid;
    public static Block FluidDarknessBlock;
    
	public static void addBlocks()
	{
		LiquidDoomFluid = new LiquidDoomFluid();
		FluidDarknessFluid = new FluidDarknessFluid();
		
		blockRainbow = new BlockCustom().setBlockName("blockRainbow").setHardness(0.2F).setResistance(1000000.0F).setBlockTextureName("chaosbeasts:rainbow_block");
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
    	blockDarknessStone = new BlockCustom().setBlockName("darknessStone").setBlockTextureName("chaosbeasts:darkness_stone").setHardness(15.0F).setResistance(0.1F);

    	LiquidDoomBlock = new LiquidDoomBlock().setBlockName("blockLiquidDoom").setBlockTextureName("chaosbeasts:liquiddoom_still");
    	FluidDarknessBlock = new FluidDarknessBlock().setBlockName("fluidDarkness").setBlockTextureName("chaosbeasts:fluid_darkness");

    	GameRegistry.registerBlock(blockRainbow, "rainbow_block");
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
	}
}
