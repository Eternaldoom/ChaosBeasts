package com.chaosmodders.chaosbeasts.client.renderer.mob;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import com.chaosmodders.chaosbeasts.client.model.ModelDinosaur;
import com.chaosmodders.chaosbeasts.entity.monster.EntityDinosaur;
import com.chaosmodders.chaosbeasts.entity.monster.EntityGiantPigZombie;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderDinosaur extends RenderLiving
{
    private static final ResourceLocation dinoTextures = new ResourceLocation("chaosbeasts:textures/entity/dinosaur.png");
    private float scale;
    
    public RenderDinosaur(ModelBase par1ModelBase, float par2, float par3)
    {
        super(new ModelDinosaur(), par2 * par3);
        this.scale = par3;
    }

    protected void preRenderCallback(EntityDinosaur par1EntityDinosaur, float par2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.preRenderCallback((EntityDinosaur)par1EntityLivingBase, par2);
    }
    
    protected float getDeathMaxRotation(EntityDinosaur par1EntityDinosaur)
    {
        return 180.0F;
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(EntityDinosaur par1EntityDinosaur, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender((EntityLiving)par1EntityDinosaur, par2, par4, par6, par8, par9);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityDinosaur par1EntityDinosaur)
    {
        return dinoTextures;
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
        this.doRender((EntityDinosaur)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    protected float getDeathMaxRotation(EntityLivingBase par1EntityLivingBase)
    {
        return this.getDeathMaxRotation((EntityDinosaur)par1EntityLivingBase);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLivingBase par1EntityLivingBase, int par2, float par3)
    {
        return this.shouldRenderPass((EntityDinosaur)par1EntityLivingBase, par2, par3);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(EntityLivingBase par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.doRender((EntityDinosaur)par1Entity, par2, par4, par6, par8, par9);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityDinosaur)par1Entity);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.doRender((EntityDinosaur)par1Entity, par2, par4, par6, par8, par9);
    }
}