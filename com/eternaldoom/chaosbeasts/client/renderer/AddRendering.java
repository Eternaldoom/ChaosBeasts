package com.eternaldoom.chaosbeasts.client.renderer;

import java.util.HashMap;
import java.util.Map;

import com.eternaldoom.chaosbeasts.blocks.TileEntityBlockLobsterEntity;
import com.eternaldoom.chaosbeasts.client.renderer.mob.RenderDemon;
import com.eternaldoom.chaosbeasts.client.renderer.mob.RenderGiantPigZombie;
import com.eternaldoom.chaosbeasts.client.renderer.mob.RenderHellLobster;
import com.eternaldoom.chaosbeasts.client.renderer.mob.RenderLobster;
import com.eternaldoom.chaosbeasts.client.renderer.projectile.RenderThrowingStar;
import com.eternaldoom.chaosbeasts.client.renderer.tileentity.TileEntityBlockLobsterRenderer;
import com.eternaldoom.chaosbeasts.entity.monster.EntityDemon;
import com.eternaldoom.chaosbeasts.entity.monster.EntityGiantPigZombie;
import com.eternaldoom.chaosbeasts.entity.monster.EntityHellLobster;
import com.eternaldoom.chaosbeasts.entity.monster.EntityLobster;
import com.eternaldoom.chaosbeasts.entity.other.EntityDoomTNT;
import com.eternaldoom.chaosbeasts.entity.projectile.EntityHandgunBullet;
import com.eternaldoom.chaosbeasts.entity.projectile.EntityThrowingStar;
import com.eternaldoom.chaosbeasts.items.ChaosItems;

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
		RenderingRegistry.registerEntityRenderingHandler(EntityThrowingStar.class, new RenderThrowingStar(ChaosItems.ItemThrowingStar));
		RenderingRegistry.registerEntityRenderingHandler(EntityHandgunBullet.class, new RenderSnowball(ChaosItems.ItemBullet));

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockLobsterEntity.class, new TileEntityBlockLobsterRenderer());
	}
}