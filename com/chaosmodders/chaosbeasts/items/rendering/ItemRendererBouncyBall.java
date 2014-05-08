package com.chaosmodders.chaosbeasts.items.rendering;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

public class ItemRendererBouncyBall implements IItemRenderer {
	ResourceLocation sphereLocation = (new ResourceLocation("chaosbeasts:models/sphere.obj"));
	ResourceLocation sphereTexture = new ResourceLocation("chaosbeasts:models/sphereTexture.png");
	IModelCustom model = AdvancedModelLoader.loadModel(sphereLocation);
	

	public ItemRendererBouncyBall() {
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		if (type == IItemRenderer.ItemRenderType.ENTITY)
			GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
		GL11.glPushMatrix();
        //GL11.glTranslated(x, y, z);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(sphereTexture);;
        model.renderAll();
        GL11.glPopMatrix();
	}
}