package com.chaosmodders.chaosbeasts.client.renderer;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.chaosmodders.chaosbeasts.ChaosBeasts;
import com.chaosmodders.chaosbeasts.blocks.ChaosBlocks;
import com.chaosmodders.chaosbeasts.blocks.TileEntityBlockLobsterEntity;
import com.chaosmodders.chaosbeasts.blocks.TileEntityEnergyReactor;
import com.chaosmodders.chaosbeasts.client.model.ModelCoralFish;
import com.chaosmodders.chaosbeasts.client.model.ModelDinosaur;
import com.chaosmodders.chaosbeasts.client.renderer.mob.RenderCoralFish;
import com.chaosmodders.chaosbeasts.client.renderer.mob.RenderDemon;
import com.chaosmodders.chaosbeasts.client.renderer.mob.RenderDinosaur;
import com.chaosmodders.chaosbeasts.client.renderer.mob.RenderGiantPigZombie;
import com.chaosmodders.chaosbeasts.client.renderer.mob.RenderHellLobster;
import com.chaosmodders.chaosbeasts.client.renderer.mob.RenderLobster;
import com.chaosmodders.chaosbeasts.client.renderer.projectile.RenderThrowingStar;
import com.chaosmodders.chaosbeasts.client.renderer.tileentity.EnergyReactorRenderer;
import com.chaosmodders.chaosbeasts.client.renderer.tileentity.TileEntityBlockLobsterRenderer;
import com.chaosmodders.chaosbeasts.entity.aquatic.EntityCoralFish;
import com.chaosmodders.chaosbeasts.entity.monster.EntityDemon;
import com.chaosmodders.chaosbeasts.entity.monster.EntityDinosaur;
import com.chaosmodders.chaosbeasts.entity.monster.EntityGiantPigZombie;
import com.chaosmodders.chaosbeasts.entity.monster.EntityHellLobster;
import com.chaosmodders.chaosbeasts.entity.monster.EntityLobster;
import com.chaosmodders.chaosbeasts.entity.projectile.EntityBouncyBall;
import com.chaosmodders.chaosbeasts.entity.projectile.EntityHandgunBullet;
import com.chaosmodders.chaosbeasts.entity.projectile.EntityThrowingStar;
import com.chaosmodders.chaosbeasts.generic.ChaosGUIHandler;
import com.chaosmodders.chaosbeasts.items.ChaosItems;
import com.chaosmodders.chaosbeasts.items.rendering.ItemRendererLobsterStatue;
import com.jadarstudios.developercapes.DevCapes;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.NetworkRegistry;

public class AddRendering
{	
	public static void addRendering()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityGiantPigZombie.class, new RenderGiantPigZombie(new ModelZombie(), 0.5F, 6.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityLobster.class, new RenderLobster());
		RenderingRegistry.registerEntityRenderingHandler(EntityHellLobster.class, new RenderHellLobster());
		RenderingRegistry.registerEntityRenderingHandler(EntityDemon.class, new RenderDemon());
		RenderingRegistry.registerEntityRenderingHandler(EntityDinosaur.class, new RenderDinosaur(new ModelDinosaur(), 0.5F, 3.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityThrowingStar.class, new RenderThrowingStar(ChaosItems.ItemThrowingStar));
		RenderingRegistry.registerEntityRenderingHandler(EntityHandgunBullet.class, new RenderSnowball(ChaosItems.ItemBullet));
		RenderingRegistry.registerEntityRenderingHandler(EntityBouncyBall.class, new RenderSnowball(ChaosItems.ItemRuby));
		RenderingRegistry.registerEntityRenderingHandler(EntityCoralFish.class, new RenderCoralFish(new ModelCoralFish(), 0));

		TileEntitySpecialRenderer render = new TileEntityBlockLobsterRenderer();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockLobsterEntity.class, render);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEnergyReactor.class, new EnergyReactorRenderer());
		
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ChaosBlocks.blockLobster), new ItemRendererLobsterStatue(render, new TileEntityBlockLobsterEntity()));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ChaosBlocks.EnergyReactor), new ItemRendererLobsterStatue(new EnergyReactorRenderer(), new TileEntityEnergyReactor()));

		NetworkRegistry.INSTANCE.registerGuiHandler(ChaosBeasts.instance, new ChaosGUIHandler());
		
		DevCapes.getInstance().registerConfig("https://raw.github.com/Eternaldoom/ChaosBeasts/master/capes.json", ChaosBeasts.MODID);
	}
}