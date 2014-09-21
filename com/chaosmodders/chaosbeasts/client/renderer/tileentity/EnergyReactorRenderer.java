package com.chaosmodders.chaosbeasts.client.renderer.tileentity;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import com.chaosmodders.chaosbeasts.client.model.ModelEnergyReactor;
import com.chaosmodders.chaosbeasts.client.model.ModelLobster;

public class EnergyReactorRenderer extends TileEntitySpecialRenderer {
        
        //The model of your block
        private final ModelEnergyReactor model;
        
        public EnergyReactorRenderer() {
                this.model = new ModelEnergyReactor();
        }
        
        private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
                int meta = world.getBlockMetadata(x, y, z);
                GL11.glPushMatrix();
                GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
                GL11.glPopMatrix();
        }
        
        @Override
        public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
                ResourceLocation textures = (new ResourceLocation("chaosbeasts:textures/tileentity/energy_reactor.png"));
                Minecraft.getMinecraft().renderEngine.bindTexture(textures);
                GL11.glPushMatrix();
                GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
                this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
                GL11.glPopMatrix();
                GL11.glPopMatrix();
        }

        //Set the lighting stuff, so it changes it's brightness properly.       
        private void adjustLightFixture(World world, int i, int j, int k, Block block) {
                Tessellator tess = Tessellator.instance;
                int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
                int modulousModifier = skyLight % 65536;
                int divModifier = skyLight / 65536;
                OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
        }
}