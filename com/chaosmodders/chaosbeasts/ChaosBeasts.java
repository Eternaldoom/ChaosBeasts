package com.chaosmodders.chaosbeasts;

import net.minecraft.command.CommandHandler;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;
import com.chaosmodders.chaosbeasts.client.renderer.AddRendering;
import com.chaosmodders.chaosbeasts.entity.AddEntities;
import com.chaosmodders.chaosbeasts.entity.other.EntityDoomTNT;
import com.chaosmodders.chaosbeasts.entity.projectile.EntityBasicGrenade;
import com.chaosmodders.chaosbeasts.entity.projectile.EntityBouncyBall;
import com.chaosmodders.chaosbeasts.entity.projectile.EntityHandgunBullet;
import com.chaosmodders.chaosbeasts.entity.projectile.EntityThrowingStar;
import com.chaosmodders.chaosbeasts.event.ChaosArmorEvent;
import com.chaosmodders.chaosbeasts.event.ChaosBucketEvent;
import com.chaosmodders.chaosbeasts.event.ChaosEventClass;
import com.chaosmodders.chaosbeasts.generic.ChaosCrafting;
import com.chaosmodders.chaosbeasts.generic.ChaosGUIHandler;
import com.chaosmodders.chaosbeasts.generic.ChaosHelper;
import com.chaosmodders.chaosbeasts.generic.ChaosOreDict;
import com.chaosmodders.chaosbeasts.generic.DimensionCommand;
import com.chaosmodders.chaosbeasts.items.ChaosItems;
import com.chaosmodders.chaosbeasts.worldgen.BiomeGenDark;
import com.chaosmodders.chaosbeasts.worldgen.BiomeGenDoom;
import com.chaosmodders.chaosbeasts.worldgen.BiomeGenLight;
import com.chaosmodders.chaosbeasts.worldgen.BiomeGenRedDesert;
import com.chaosmodders.chaosbeasts.worldgen.DarkWorldProvider;
import com.chaosmodders.chaosbeasts.worldgen.DoomWorldProvider;
import com.chaosmodders.chaosbeasts.worldgen.LightWorldProvider;
import com.chaosmodders.chaosbeasts.worldgen.MoreOreGenerator;
import com.chaosmodders.chaosbeasts.worldgen.WaterWorldProvider;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ChaosBeasts.MODID, version = ChaosBeasts.VERSION)
public class ChaosBeasts
{
    public static final String MODID = "chaosbeasts";
    public static final String VERSION = "Alpha 1.0";
    
    @Instance(MODID)
	public static ChaosBeasts instance;
  
    public static int DoomDimensionId = 51;
    public static int DarkDimensionId = 52;
    public static int LightDimensionId = 53;
    public static int WaterDimensionId = 54;
    
    public static BiomeGenBase redDesert;
    public static BiomeGenBase doomedland;
    public static BiomeGenBase darkbiome;
    public static BiomeGenBase lightbiome;
    public static BiomeGenBase waterbiome;
    
    protected static final BiomeGenBase.Height height_PartiallySubmerged = new BiomeGenBase.Height(-0.2F, 0.1F);
    protected static final BiomeGenBase.Height height_HighPlateaus = new BiomeGenBase.Height(2.0F, 15.0F);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	System.out.println("[ChaosBeasts] Loading...");
    	ChaosBlocks.addBlocks();
    	
    	DimensionManager.registerProviderType(ChaosBeasts.DoomDimensionId, DoomWorldProvider.class, true);
    	DimensionManager.registerDimension(ChaosBeasts.DoomDimensionId, ChaosBeasts.DoomDimensionId);
    	DimensionManager.registerProviderType(ChaosBeasts.DarkDimensionId, DarkWorldProvider.class, true);
    	DimensionManager.registerDimension(ChaosBeasts.DarkDimensionId, ChaosBeasts.DarkDimensionId);
    	DimensionManager.registerProviderType(ChaosBeasts.LightDimensionId, LightWorldProvider.class, true);
    	DimensionManager.registerDimension(ChaosBeasts.LightDimensionId, ChaosBeasts.LightDimensionId);
    	DimensionManager.registerProviderType(ChaosBeasts.WaterDimensionId, WaterWorldProvider.class, true);
    	DimensionManager.registerDimension(ChaosBeasts.WaterDimensionId, ChaosBeasts.WaterDimensionId);

    	//Projectiles
        EntityRegistry.registerModEntity(EntityHandgunBullet.class, "HandgunBullet", 550, this, 64, 1, true);
    	EntityRegistry.registerModEntity(EntityThrowingStar.class, "ThrowingStar", 551, this, 64, 1, true);
    	EntityRegistry.registerModEntity(EntityBouncyBall.class, "BouncyBall", 552, this, 64, 1, true);
    	EntityRegistry.registerModEntity(EntityBasicGrenade.class, "BasicGrenade", 553, this, 64, 1, true);

        AddEntities.addEntities();
        
         doomedland = (new BiomeGenDoom(50).setHeight(height_PartiallySubmerged));
         redDesert = new BiomeGenRedDesert(51).setHeight(height_PartiallySubmerged);
         darkbiome = new BiomeGenDark(52).setHeight(height_HighPlateaus);
         lightbiome = new BiomeGenLight(53).setHeight(height_PartiallySubmerged);
         waterbiome = new BiomeGenLight(54).setHeight(height_PartiallySubmerged);
         
         BiomeManager.addSpawnBiome(redDesert);
         BiomeDictionary.registerBiomeType(redDesert, Type.DESERT);
         BiomeManager.addSpawnBiome(redDesert);
         
         MinecraftForge.EVENT_BUS.register(new ChaosEventClass());
         MinecraftForge.EVENT_BUS.register(new ChaosBucketEvent());
        
    	GameRegistry.registerWorldGenerator(new MoreOreGenerator(), 1);
    	
    	ChaosItems.addItems();
    	ChaosOreDict.addOreDictNames();
    	new ChaosCrafting();
    	NetworkRegistry.INSTANCE.registerGuiHandler(ChaosBeasts.instance, new ChaosGUIHandler());
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	EntityRegistry.registerModEntity(EntityDoomTNT.class, "DoomTNTPrimed", 554, this, 64, 1, true);
        if(FMLCommonHandler.instance().getSide().isClient()){
            AddRendering.addRendering();
        }
        ChaosHelper.addArmorEvents(new ChaosArmorEvent());
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	System.out.println("[ChaosBeasts] Successfully Completed Loading! Don't forget to check out the wiki at http://chaosbeasts.wikia.com");
    }
    
    @EventHandler
    public void serverStarting(FMLServerStartingEvent event){ 
		if (MinecraftServer.getServer().getCommandManager() instanceof ServerCommandManager) {
			((CommandHandler) MinecraftServer.getServer().getCommandManager()).registerCommand(new DimensionCommand());
		}
	}
}
