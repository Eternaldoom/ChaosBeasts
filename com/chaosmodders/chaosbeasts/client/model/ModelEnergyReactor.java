package com.chaosmodders.chaosbeasts.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEnergyReactor extends ModelBase
{
  //fields
    ModelRenderer center;
    ModelRenderer thing4;
    ModelRenderer thing1;
    ModelRenderer thing3;
    ModelRenderer thing2;
    ModelRenderer thing5;
    ModelRenderer thing8;
    ModelRenderer thing7;
    ModelRenderer thing6;
    ModelRenderer thing10;
    ModelRenderer thing11;
    ModelRenderer thing12;
    ModelRenderer thing9;
    ModelRenderer center2;
  
  public ModelEnergyReactor()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      center = new ModelRenderer(this, 0, 18);
      center.addBox(-2F, -2F, -2F, 4, 4, 4);
      center.setRotationPoint(0F, 16F, 0F);
      center.setTextureSize(64, 32);
      center.mirror = true;
      setRotation(center, 0F, 0F, 0F);
      thing4 = new ModelRenderer(this, 0, 0);
      thing4.addBox(0F, 0F, 0F, 1, 1, 16);
      thing4.setRotationPoint(7F, 8F, -8F);
      thing4.setTextureSize(64, 32);
      thing4.mirror = true;
      setRotation(thing4, 0F, 0F, 0F);
      thing1 = new ModelRenderer(this, 0, 0);
      thing1.addBox(0F, 0F, 0F, 15, 1, 1);
      thing1.setRotationPoint(-8F, 8F, -8F);
      thing1.setTextureSize(64, 32);
      thing1.mirror = true;
      setRotation(thing1, 0F, 0F, 0F);
      thing3 = new ModelRenderer(this, 0, 0);
      thing3.addBox(0F, 0F, 0F, 1, 1, 14);
      thing3.setRotationPoint(-8F, 8F, -7F);
      thing3.setTextureSize(64, 32);
      thing3.mirror = true;
      setRotation(thing3, 0F, 0F, 0F);
      thing2 = new ModelRenderer(this, 0, 0);
      thing2.addBox(0F, 0F, 0F, 15, 1, 1);
      thing2.setRotationPoint(-8F, 8F, 7F);
      thing2.setTextureSize(64, 32);
      thing2.mirror = true;
      setRotation(thing2, 0F, 0F, 0F);
      thing5 = new ModelRenderer(this, 0, 0);
      thing5.addBox(0F, 0F, 0F, 1, 1, 14);
      thing5.setRotationPoint(7F, 23F, -7F);
      thing5.setTextureSize(64, 32);
      thing5.mirror = true;
      setRotation(thing5, 0F, 0F, 0F);
      thing8 = new ModelRenderer(this, 0, 0);
      thing8.addBox(0F, 0F, 0F, 14, 1, 1);
      thing8.setRotationPoint(-7F, 23F, 7F);
      thing8.setTextureSize(64, 32);
      thing8.mirror = true;
      setRotation(thing8, 0F, 0F, 0F);
      thing7 = new ModelRenderer(this, 0, 0);
      thing7.addBox(0F, 0F, 0F, 1, 1, 14);
      thing7.setRotationPoint(-8F, 23F, -7F);
      thing7.setTextureSize(64, 32);
      thing7.mirror = true;
      setRotation(thing7, 0F, 0F, 0F);
      thing6 = new ModelRenderer(this, 0, 0);
      thing6.addBox(0F, 0F, 0F, 15, 1, 1);
      thing6.setRotationPoint(-8F, 23F, -8F);
      thing6.setTextureSize(64, 32);
      thing6.mirror = true;
      setRotation(thing6, 0F, 0F, 0F);
      thing10 = new ModelRenderer(this, 0, 0);
      thing10.addBox(0F, 0F, 0F, 1, 15, 1);
      thing10.setRotationPoint(-8F, 9F, -8F);
      thing10.setTextureSize(64, 32);
      thing10.mirror = true;
      setRotation(thing10, 0F, 0F, 0F);
      thing11 = new ModelRenderer(this, 0, 0);
      thing11.addBox(0F, 0F, 0F, 1, 15, 1);
      thing11.setRotationPoint(-8F, 9F, 7F);
      thing11.setTextureSize(64, 32);
      thing11.mirror = true;
      setRotation(thing11, 0F, 0F, 0F);
      thing12 = new ModelRenderer(this, 0, 0);
      thing12.addBox(0F, 0F, 0F, 1, 15, 1);
      thing12.setRotationPoint(7F, 9F, 7F);
      thing12.setTextureSize(64, 32);
      thing12.mirror = true;
      setRotation(thing12, 0F, 0F, 0F);
      thing9 = new ModelRenderer(this, 0, 0);
      thing9.addBox(0F, 0F, 0F, 1, 15, 1);
      thing9.setRotationPoint(7F, 9F, -8F);
      thing9.setTextureSize(64, 32);
      thing9.mirror = true;
      setRotation(thing9, 0F, 0F, 0F);
      center2 = new ModelRenderer(this, 32, 16);
      center2.addBox(-4F, -4F, -4F, 8, 8, 8);
      center2.setRotationPoint(0F, 16F, 0F);
      center2.setTextureSize(64, 32);
      center2.mirror = true;
      setRotation(center2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    center.render(f5);
    thing4.render(f5);
    thing1.render(f5);
    thing3.render(f5);
    thing2.render(f5);
    thing5.render(f5);
    thing8.render(f5);
    thing7.render(f5);
    thing6.render(f5);
    thing10.render(f5);
    thing11.render(f5);
    thing12.render(f5);
    thing9.render(f5);
    GL11.glEnable(GL11.GL_BLEND);
	GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
    center2.render(f5);
    GL11.glDisable(GL11.GL_BLEND);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
