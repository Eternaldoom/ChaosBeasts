package com.chaosmodders.chaosbeasts;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;
import com.chaosmodders.chaosbeasts.client.renderer.AddRendering;
import com.chaosmodders.chaosbeasts.entity.AddEntities;
import com.chaosmodders.chaosbeasts.entity.other.EntityDoomTNT;
import com.chaosmodders.chaosbeasts.entity.projectile.EntityHandgunBullet;
import com.chaosmodders.chaosbeasts.entity.projectile.EntityThrowingStar;
import com.chaosmodders.chaosbeasts.event.DoomBucketEvent;
import com.chaosmodders.chaosbeasts.event.DoomEventClass;
import com.chaosmodders.chaosbeasts.generic.ChaosCrafting;
import com.chaosmodders.chaosbeasts.generic.ChaosOreDict;
import com.chaosmodders.chaosbeasts.items.ChaosItems;
import com.chaosmodders.chaosbeasts.worldgen.BiomeGenRedDesert;
import com.chaosmodders.chaosbeasts.worldgen.BiomeInitializer;
import com.chaosmodders.chaosbeasts.worldgen.DoomWorldProvider;
import com.chaosmodders.chaosbeasts.worldgen.MoreOreGenerator;

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