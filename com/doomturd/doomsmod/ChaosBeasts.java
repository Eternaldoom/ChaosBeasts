package com.doomturd.doomsmod;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import com.doomturd.doomsmod.blocks.ChaosBlocks;
import com.doomturd.doomsmod.client.renderer.AddRendering;
import com.doomturd.doomsmod.entity.AddEntities;
import com.doomturd.doomsmod.entity.other.EntityDoomTNT;
import com.doomturd.doomsmod.entity.projectile.EntityHandgunBullet;
import com.doomturd.doomsmod.entity.projectile.EntityThrowingStar;
import com.doomturd.doomsmod.event.DoomBucketEvent;
import com.doomturd.doomsmod.event.DoomEventClass;
import com.doomturd.doomsmod.generic.ChaosCrafting;
import com.doomturd.doomsmod.generic.ChaosOreDict;
import com.doomturd.doomsmod.items.ChaosItems;
import com.doomturd.doomsmod.worldgen.BiomeGenDoom;
import com.doomturd.doomsmod.worldgen.BiomeGenRedDesert;
import com.doomturd.doomsmod.worldgen.BiomeInitializer;
import com.doomturd.doomsmod.worldgen.DoomWorldProvider;
import com.doomturd.doomsmod.worldgen.MoreOreGenerator;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ChaosBeasts.MODID, version = ChaosBeasts.VERSION)
public class ChaosBeasts
{
    public static final String MODID = "chaosbeasts";
    public static final String VERSION = "Alpha 1.0";
  
    public static int DoomDimensionId = 3;
    
    public static BiomeGenBase reddesert;
    
    protected static final BiomeGenBase.Height height_PartiallySubmerged = new BiomeGenBase.Height(-0.2F, 0.1F);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ChaosBlocks.addBlocks();
    	
    	reddesert = BiomeGenRedDesert.makeBiome(100);
    	
    	DimensionManager.registerProviderType(ChaosBeasts.DoomDimensionId, DoomWorldProvider.class, true);
    	DimensionManager.registerDimension(ChaosBeasts.DoomDimensionId, ChaosBeasts.DoomDimensionId);

    	//Projectiles
        EntityRegistry.registerModEntity(EntityHandgunBullet.class, "HandgunBullet", 550, this, 64, 1, true);
    	EntityRegistry.registerModEntity(EntityThrowingStar.class, "ThrowingStar", 551, this, 64, 1, true);

        AddEntities.addEntities();
        
         reddesert = new BiomeGenRedDesert(51).setHeight(height_PartiallySubmerged);
         
         

         MinecraftForge.EVENT_BUS.register(new DoomEventClass());
         MinecraftForge.EVENT_BUS.register(new DoomBucketEvent());
        
    	GameRegistry.registerWorldGenerator(new MoreOreGenerator(), 1);
    	
    	ChaosItems.addItems();
    	ChaosOreDict.addOreDictNames();
    	new ChaosCrafting();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	EntityRegistry.registerModEntity(EntityDoomTNT.class, "DoomTNTPrimed", 552, this, 64, 1, true);
        if(FMLCommonHandler.instance().getSide().isClient())
            AddRendering.addRendering();
    }
    
    @EventHandler
    public void postInt(FMLPostInitializationEvent event)
    {
    	MinecraftForge.TERRAIN_GEN_BUS.register(new BiomeInitializer());
    }
}
