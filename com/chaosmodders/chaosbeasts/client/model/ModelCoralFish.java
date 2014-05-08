package com.chaosmodders.chaosbeasts.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCoralFish extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer Tail;
    ModelRenderer Right_Fin;
    ModelRenderer Left_Fin;
    ModelRenderer Headpiece;
  
  public ModelCoralFish()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Head = new ModelRenderer(this, 0, 58);
      Head.addBox(0F, 0F, 0F, 3, 3, 3);
      Head.setRotationPoint(0F, 0F, 0F);
      Head.setTextureSize(128, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 53);
      Body.addBox(0F, 0F, 0F, 2, 2, 3);
      Body.setRotationPoint(0.5F, 0.5F, 3F);
      Body.setTextureSize(128, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 0, 49);
      Tail.addBox(0F, 0F, 0F, 1, 1, 3);
      Tail.setRotationPoint(1F, 1F, 6F);
      Tail.setTextureSize(128, 64);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      Right_Fin = new ModelRenderer(this, 23, 0);
      Right_Fin.addBox(0F, 0F, 0F, 1, 1, 2);
      Right_Fin.setRotationPoint(0F, 1F, 1F);
      Right_Fin.setTextureSize(128, 64);
      Right_Fin.mirror = true;
      setRotation(Right_Fin, 0F, -0.7853982F, 0F);
      Left_Fin = new ModelRenderer(this, 30, 0);
      Left_Fin.addBox(0F, 0F, 0F, 1, 1, 2);
      Left_Fin.setRotationPoint(2.3F, 1F, 1.5F);
      Left_Fin.setTextureSize(128, 64);
      Left_Fin.mirror = true;
      setRotation(Left_Fin, 0F, 0.7853982F, 0F);
      Headpiece = new ModelRenderer(this, 36, 0);
      Headpiece.addBox(0F, 0F, 0F, 1, 1, 4);
      Headpiece.setRotationPoint(1F, 0F, 0F);
      Headpiece.setTextureSize(128, 64);
      Headpiece.mirror = true;
      setRotation(Headpiece, 0.4833219F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    Body.render(f5);
    Tail.render(f5);
    Right_Fin.render(f5);
    Left_Fin.render(f5);
    Headpiece.render(f5);
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
