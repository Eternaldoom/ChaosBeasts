package com.chaosmodders.chaosbeasts.client.renderer.mob;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import com.chaosmodders.chaosbeasts.client.model.ModelCoralFish;
import com.chaosmodders.chaosbeasts.client.model.ModelDinosaur;
import com.chaosmodders.chaosbeasts.entity.monster.EntityDinosaur;
import com.chaosmodders.chaosbeasts.entity.monster.EntityGiantPigZombie;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCoralFish extends RenderLiving
{
    private static final ResourceLocation fishyTextures = new ResourceLocation("chaosbeasts:textures/entity/coralfish.png");
    private float scale;
    
    public RenderCoralFish(ModelBase par1ModelBase, float par2, float par3)
    {
        super(new ModelCoralFish(), par2 * par3);
        this.scale = par3;
    }

    protected void preRenderCallback(EntityCoralFish par1EntityCoralFish, float par2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.preRenderCallback((EntityCoralFish)par1EntityLivingBase, par2);
    }
    
    protected float getDeathMaxRotation(EntityCoralFish par1EntityCoralFish)
    {
        return 180.0F;
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(EntityCoralFish par1EntityCoralFish, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender((EntityLiving)par1EntityCoralFish, par2, par4, par6, par8, par9);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityDinosaur par1EntityDinosaur)
    {
        return fishyTextures;
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityDinosaur par1EntityDinosaur, int par2, float par3)
    {
        return -1;
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.doRender((EntityCoralFish)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    protected float getDeathMaxRotation(EntityLivingBase par1EntityLivingBase)
    {
        return this.getDeathMaxRotation((EntityCoralFish)par1EntityLivingBase);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLivingBase par1EntityLivingBase, int par2, float par3)
    {
        return this.shouldRenderPass((EntityCoralFish)par1EntityLivingBase, par2, par3);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(EntityLivingBase par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.doRender((EntityCoralFish)par1Entity, par2, par4, par6, par8, par9);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityCoralFish)par1Entity);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.doRender((EntityCoralFish)par1Entity, par2, par4, par6, par8, par9);
    }
}