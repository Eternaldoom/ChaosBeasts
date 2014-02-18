package com.chaosmodders.chaosbeasts.client.renderer;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderSnowball;

import com.chaosmodders.chaosbeasts.blocks.TileEntityBlockLobsterEntity;
import com.chaosmodders.chaosbeasts.client.renderer.mob.RenderDemon;
import com.chaosmodders.chaosbeasts.client.renderer.mob.RenderDinosaur;
import com.chaosmodders.chaosbeasts.client.renderer.mob.RenderGiantPigZombie;
import com.chaosmodders.chaosbeasts.client.renderer.mob.RenderHellLobster;
import com.chaosmodders.chaosbeasts.client.renderer.mob.RenderLobster;
import com.chaosmodders.chaosbeasts.client.renderer.projectile.RenderThrowingStar;
import com.chaosmodders.chaosbeasts.client.renderer.tileentity.TileEntityBlockLobsterRenderer;
import com.chaosmodders.chaosbeasts.entity.monster.EntityDemon;
import com.chaosmodders.chaosbeasts.entity.monster.EntityDinosaur;
import com.chaosmodders.chaosbeasts.entity.monster.EntityGiantPigZombie;
import com.chaosmodders.chaosbeasts.entity.monster.EntityHellLobster;
import com.chaosmodders.chaosbeasts.entity.monster.EntityLobster;
import com.chaosmodders.chaosbeasts.entity.projectile.EntityHandgunBullet;
import com.chaosmodders.chaosbeasts.entity.projectile.EntityThrowingStar;
import com.chaosmodders.chaosbeasts.items.ChaosItems;

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
		RenderingRegistry.registerEntityRenderingHandler(EntityDinosaur.class, new RenderDinosaur());
		RenderingRegistry.registerEntityRenderingHandler(EntityThrowingStar.class, new RenderThrowingStar(ChaosItems.ItemThrowingStar));
		RenderingRegistry.registerEntityRenderingHandler(EntityHandgunBullet.class, new RenderSnowball(ChaosItems.ItemBullet));

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockLobsterEntity.class, new TileEntityBlockLobsterRenderer());
	}
}