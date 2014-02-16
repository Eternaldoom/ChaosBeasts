package com.doomturd.doomsmod.client.renderer;

import java.util.HashMap;
import java.util.Map;

import com.doomturd.doomsmod.blocks.TileEntityBlockLobsterEntity;
import com.doomturd.doomsmod.client.renderer.mob.RenderDemon;
import com.doomturd.doomsmod.client.renderer.mob.RenderGiantPigZombie;
import com.doomturd.doomsmod.client.renderer.mob.RenderHellLobster;
import com.doomturd.doomsmod.client.renderer.mob.RenderLobster;
import com.doomturd.doomsmod.client.renderer.projectile.RenderThrowingStar;
import com.doomturd.doomsmod.client.renderer.tileentity.TileEntityBlockLobsterRenderer;
import com.doomturd.doomsmod.entity.monster.EntityDemon;
import com.doomturd.doomsmod.entity.monster.EntityGiantPigZombie;
import com.doomturd.doomsmod.entity.monster.EntityHellLobster;
import com.doomturd.doomsmod.entity.monster.EntityLobster;
import com.doomturd.doomsmod.entity.other.EntityDoomTNT;
import com.doomturd.doomsmod.entity.projectile.EntityHandgunBullet;
import com.doomturd.doomsmod.entity.projectile.EntityThrowingStar;
import com.doomturd.doomsmod.items.DoomItems;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.init.Items;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class AddRendering
{
	private static Map entityRenderMap = new HashMap();
	public static void addRendering()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityGiantPigZombie.class, new RenderGiantPigZombie(new ModelZombie(), 0.5F, 6.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityLobster.class, new RenderLobster());
		RenderingRegistry.registerEntityRenderingHandler(EntityHellLobster.class, new RenderHellLobster());
		RenderingRegistry.registerEntityRenderingHandler(EntityDemon.class, new RenderDemon());
		RenderingRegistry.registerEntityRenderingHandler(EntityThrowingStar.class, new RenderThrowingStar(DoomItems.ItemThrowingStar));
		RenderingRegistry.registerEntityRenderingHandler(EntityHandgunBullet.class, new RenderSnowball(DoomItems.ItemBullet));

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockLobsterEntity.class, new TileEntityBlockLobsterRenderer());
	}
}