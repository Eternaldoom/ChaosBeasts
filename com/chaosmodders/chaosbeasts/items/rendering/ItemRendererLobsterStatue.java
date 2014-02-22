package com.chaosmodders.chaosbeasts.items.rendering;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.chaosmodders.chaosbeasts.blocks.TileEntityBlockLobsterEntity;
import com.chaosmodders.chaosbeasts.client.renderer.tileentity.TileEntityBlockLobsterRenderer;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ItemRendererLobsterStatue implements ISimpleBlockRenderingHandler
{
	public static final int renderId = RenderingRegistry.getNextAvailableRenderId();
	TileEntitySpecialRenderer render = new TileEntityBlockLobsterRenderer();

	private final TileEntityBlockLobsterEntity lobster = new TileEntityBlockLobsterEntity();

	public ItemRendererLobsterStatue() {}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
		GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
		GL11.glTranslatef(-1.2F, -0.3F, -0.5F);
		GL11.glScalef(1.75F, 1.75F, 1.75F);
		this.render.renderTileEntityAt(lobster, 0.0D, 0.0D, 0.0D, 0.0F);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		return false;
	}

	@Override
	public int getRenderId() { return renderId; }

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return true;
	}

}