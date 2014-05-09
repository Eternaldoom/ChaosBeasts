package com.chaosmodders.chaosbeasts.entity;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.chaosmodders.chaosbeasts.blocks.TileEntityBlockLobsterEntity;
import com.chaosmodders.chaosbeasts.blocks.TileEntityEnergyReactor;
import com.chaosmodders.chaosbeasts.blocks.WaterCrystalTE;
import com.chaosmodders.chaosbeasts.entity.aquatic.EntityCoralFish;
import com.chaosmodders.chaosbeasts.entity.monster.EntityDarknessSpider;
import com.chaosmodders.chaosbeasts.entity.monster.EntityDemon;
import com.chaosmodders.chaosbeasts.entity.monster.EntityDinosaur;
import com.chaosmodders.chaosbeasts.entity.monster.EntityGiantPigZombie;
import com.chaosmodders.chaosbeasts.entity.monster.EntityHellLobster;
import com.chaosmodders.chaosbeasts.entity.monster.EntityLobster;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class AddEntities
{
	public static void addEntities()
	{
		GameRegistry.registerTileEntity(TileEntityBlockLobsterEntity.class, "tileEntityBlockLobster");
		GameRegistry.registerTileEntity(TileEntityEnergyReactor.class, "tileEntityEnergyReactor");
		GameRegistry.registerTileEntity(WaterCrystalTE.class, "tileEntityWaterCrystal");
		
        EntityRegistry.registerGlobalEntityID(EntityGiantPigZombie.class, "GiantPigZombie", EntityRegistry.findGlobalUniqueEntityId(), 0xefb060, 0x593c1a);
        EntityRegistry.registerGlobalEntityID(EntityLobster.class, "Lobster", EntityRegistry.findGlobalUniqueEntityId(), 0xefb060, 0x593c1a);
        EntityRegistry.registerGlobalEntityID(EntityHellLobster.class, "HellLobster", EntityRegistry.findGlobalUniqueEntityId(), 0xefb060, 0x593c1a);
        EntityRegistry.registerGlobalEntityID(EntityDemon.class, "Demon", EntityRegistry.findGlobalUniqueEntityId(), 0xefb060, 0x593c1a);
        EntityRegistry.registerGlobalEntityID(EntityDinosaur.class, "Dinosaur", EntityRegistry.findGlobalUniqueEntityId(), 0xefb060, 0x593c1a);
        EntityRegistry.registerGlobalEntityID(EntityCoralFish.class, "CoralFish", EntityRegistry.findGlobalUniqueEntityId(), 0xefb060, 0x593c1a);
        EntityRegistry.registerGlobalEntityID(EntityDarknessSpider.class, "DarknessSpider", EntityRegistry.findGlobalUniqueEntityId(), 0xefb060, 0x593c1a);

    	EntityRegistry.addSpawn(EntityGiantPigZombie.class, 6, 2, 2, EnumCreatureType.monster, BiomeGenBase.hell);
    	EntityRegistry.addSpawn(EntityLobster.class, 13, 4, 4, EnumCreatureType.monster, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.forest, BiomeGenBase.forestHills);
    	EntityRegistry.addSpawn(EntityHellLobster.class, 13, 4, 4, EnumCreatureType.monster, BiomeGenBase.hell);
	}
}