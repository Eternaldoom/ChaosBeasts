package com.doomturd.doomsmod.entity;

import com.doomturd.doomsmod.blocks.TileEntityBlockLobsterEntity;
import com.doomturd.doomsmod.entity.monster.EntityDemon;
import com.doomturd.doomsmod.entity.monster.EntityGiantPigZombie;
import com.doomturd.doomsmod.entity.monster.EntityHellLobster;
import com.doomturd.doomsmod.entity.monster.EntityLobster;
import com.doomturd.doomsmod.entity.other.EntityDoomTNT;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class AddEntities
{
	public static void addEntities()
	{
		GameRegistry.registerTileEntity(TileEntityBlockLobsterEntity.class, "tileEntityBlockLobster");
		
        EntityRegistry.registerGlobalEntityID(EntityGiantPigZombie.class, "GiantPigZombie", EntityRegistry.findGlobalUniqueEntityId(), 0xefb060, 0x593c1a);
        EntityRegistry.registerGlobalEntityID(EntityLobster.class, "Lobster", EntityRegistry.findGlobalUniqueEntityId(), 0xefb060, 0x593c1a);
        EntityRegistry.registerGlobalEntityID(EntityHellLobster.class, "HellLobster", EntityRegistry.findGlobalUniqueEntityId(), 0xefb060, 0x593c1a);
        EntityRegistry.registerGlobalEntityID(EntityDemon.class, "Demon", EntityRegistry.findGlobalUniqueEntityId(), 0xefb060, 0x593c1a);

    	EntityRegistry.addSpawn(EntityGiantPigZombie.class, 6, 2, 2, EnumCreatureType.monster, BiomeGenBase.hell);
    	EntityRegistry.addSpawn(EntityLobster.class, 13, 4, 4, EnumCreatureType.monster, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.forest, BiomeGenBase.forestHills);
    	EntityRegistry.addSpawn(EntityHellLobster.class, 13, 4, 4, EnumCreatureType.monster, BiomeGenBase.hell);
	}
}