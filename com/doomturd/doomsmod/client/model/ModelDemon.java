package com.doomturd.doomsmod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDemon extends ModelBase
{
  //fields
    ModelRenderer Foot2;
    ModelRenderer Leg1;
    ModelRenderer Shape2;
    ModelRenderer Leg2;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer Nose;
    ModelRenderer Arm2;
    ModelRenderer Arm1;
    ModelRenderer Hand2;
    ModelRenderer Hand1;
    ModelRenderer Horn2;
    ModelRenderer Horn1;
    ModelRenderer Ear2;
    ModelRenderer Ear1;
  
  public ModelDemon()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      Foot2 = new ModelRenderer(this, 39, 0);
      Foot2.addBox(0F, 0F, 0F, 5, 0, 1);
      Foot2.setRotationPoint(1F, 21F, 0F);
      Foot2.setTextureSize(64, 32);
      Foot2.mirror = true;
      setRotation(Foot2, 0F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 67, 0);
      Leg1.addBox(-5F, 0F, 0F, 5, 0, 1);
      Leg1.setRotationPoint(-1F, 21F, 0F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, -5F, 0F, 1, 4, 1);
      Shape2.setRotationPoint(-2F, 22F, 0F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 9, 0);
      Leg2.addBox(1F, 0F, 0F, 1, 4, 1);
      Leg2.setRotationPoint(-1F, 17F, 0F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 12);
      Body.addBox(0F, 0F, 0F, 4, 4, 1);
      Body.setRotationPoint(-2.5F, 13F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 53, 0);
      Head.addBox(0F, 0F, 0F, 3, 3, 3);
      Head.setRotationPoint(-2F, 10F, -1F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 14, 0);
      Nose.addBox(0F, 0F, 0F, 1, 1, 2);
      Nose.setRotationPoint(-1F, 11F, -3F);
      Nose.setTextureSize(64, 32);
      Nose.mirror = true;
      setRotation(Nose, 0.0872665F, 0F, 0F);
      Arm2 = new ModelRenderer(this, 0, 8);
      Arm2.addBox(0F, 0F, 0F, 2, 1, 1);
      Arm2.setRotationPoint(1.5F, 14F, 0F);
      Arm2.setTextureSize(64, 32);
      Arm2.mirror = true;
      setRotation(Arm2, 0F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 0, 19);
      Arm1.addBox(0F, 0F, 0F, 2, 1, 1);
      Arm1.setRotationPoint(-4.5F, 14F, 0F);
      Arm1.setTextureSize(64, 32);
      Arm1.mirror = true;
      setRotation(Arm1, 0F, 0F, 0F);
      Hand2 = new ModelRenderer(this, 0, 24);
      Hand2.addBox(0F, 0F, 0F, 2, 1, 0);
      Hand2.setRotationPoint(2F, 14F, 1F);
      Hand2.setTextureSize(64, 32);
      Hand2.mirror = true;
      setRotation(Hand2, 0F, 0.8726646F, 0F);
      Hand1 = new ModelRenderer(this, 0, 26);
      Hand1.addBox(0F, 0F, 0F, 2, 1, 0);
      Hand1.setRotationPoint(-5F, 14F, -1F);
      Hand1.setTextureSize(64, 32);
      Hand1.mirror = true;
      setRotation(Hand1, 0F, -0.8726646F, 0F);
      Horn2 = new ModelRenderer(this, 22, 0);
      Horn2.addBox(0F, 0F, 0F, 1, 3, 1);
      Horn2.setRotationPoint(1F, 8F, 0F);
      Horn2.setTextureSize(64, 32);
      Horn2.mirror = true;
      setRotation(Horn2, 0F, 0F, 0.4363323F);
      Horn1 = new ModelRenderer(this, 29, 0);
      Horn1.addBox(-1F, 0F, 0F, 1, 3, 1);
      Horn1.setRotationPoint(-2F, 8F, 0F);
      Horn1.setTextureSize(64, 32);
      Horn1.mirror = true;
      setRotation(Horn1, 0F, 0F, -0.4363323F);
      Ear2 = new ModelRenderer(this, 0, 29);
      Ear2.addBox(0F, 0F, 0F, 2, 2, 1);
      Ear2.setRotationPoint(1F, 10.5F, 0F);
      Ear2.setTextureSize(64, 32);
      Ear2.mirror = true;
      setRotation(Ear2, 0F, 0.4363323F, 0F);
      Ear1 = new ModelRenderer(this, 0, 34);
      Ear1.addBox(-2F, 0F, 0F, 2, 2, 1);
      Ear1.setRotationPoint(-2F, 10.5F, 0F);
      Ear1.setTextureSize(64, 32);
      Ear1.mirror = true;
      setRotation(Ear1, 0F, -0.4363323F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Foot2.render(f5);
    Leg1.render(f5);
    Shape2.render(f5);
    Leg2.render(f5);
    Body.render(f5);
    Head.render(f5);
    Nose.render(f5);
    Arm2.render(f5);
    Arm1.render(f5);
    Hand2.render(f5);
    Hand1.render(f5);
    Horn2.render(f5);
    Horn1.render(f5);
    Ear2.render(f5);
    Ear1.render(f5);
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
    
    this.Leg1.rotateAngleZ = f4 / (180F / (float)Math.PI);
    this.Foot2.rotateAngleZ = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  }

}
