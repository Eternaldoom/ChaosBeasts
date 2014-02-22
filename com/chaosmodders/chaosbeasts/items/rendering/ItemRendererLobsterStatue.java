package com.chaosmodders.chaosbeasts.items.rendering;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.chaosmodders.chaosbeasts.blocks.TileEntityBlockLobsterEntity;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ItemRendererLobsterStatue extends TileEntitySpecialRenderer implements ISimpleBlockRenderingHandler {
	private final ResourceLocation texture = new ResourceLocation("chaosbeasts:textures/tileentity/energy_reactor.png");;
	private ModelChest model = new ModelChest();
	TileEntityBlockLobsterEntity idk = new TileEntityBlockLobsterEntity();

	public void renderTileEntityAt(TileEntityBlockLobsterEntity tileentity, double x, double y, double z, float something) {
		int i = 1;
		if(tileentity != null) {
			if(tileentity.hasWorldObj()) {
				i = tileentity.getBlockMetadata();
			}
		}
		this.bindTexture(texture);
		GL11.glPushMatrix();
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glTranslatef((float) x, (float) y + 1.0F, (float) z + 1.0F);
		GL11.glScalef(1.0F, -1.0F, -1.0F);
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);
		short short1 = 0;
		if(i == 2) {
			short1 = 180;
		}
		if(i == 3) {
			short1 = 0;
		}
		if(i == 4) {
			short1 = 90;
		}
		if(i == 5) {
			short1 = -90;
		}
		if(tileentity != null) {
			GL11.glRotatef((float) short1, 0.0F, 1.0F, 0.0F);
			GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
		}
		this.model.renderAll();
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	}

	public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_) {
		renderTileEntityAt((TileEntityBlockLobsterEntity) p_147500_1_, p_147500_2_, p_147500_4_, p_147500_6_, p_147500_8_);
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {
		GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
		TileEntityRendererDispatcher.instance.renderTileEntityAt(this.idk, 0.0D, 0.0D, 0.0D, 0.0F);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		this.renderTileEntityAt(world.getTileEntity(x, y, z), x, y, z, 0);
		return true;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return true;
	}

	@Override
	public int getRenderId() {
		return -24;
	}
}