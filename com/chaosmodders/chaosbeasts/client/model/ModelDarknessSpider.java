package com.chaosmodders.chaosbeasts.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDarknessSpider extends ModelBase
{
  //fields
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Leg1;
    ModelRenderer lowerBody;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer top;
    ModelRenderer Leg1top;
    ModelRenderer Leg2top;
    ModelRenderer Leg3top;
    ModelRenderer Leg4top;
    
    ModelRenderer[] orbit = new ModelRenderer[6];
  
  public ModelDarknessSpider()
  {
    textureWidth = 128;
    textureHeight = 64;
    
    for (int i = 0; i < this.orbit.length; ++i)
    {
        this.orbit[i] = new ModelRenderer(this, 0, 16);
        this.orbit[i].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.orbit[i].setTextureSize(128, 64);
        this.orbit[i].mirror = true;
    }
    
      Leg2 = new ModelRenderer(this, 0, 0);
      Leg2.addBox(0F, 0F, 0F, 1, 16, 1);
      Leg2.setRotationPoint(-5F, 9F, 4F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0.2792527F, 0F, 0.2792527F);
      Leg3 = new ModelRenderer(this, 0, 0);
      Leg3.addBox(0F, 0F, 0F, 1, 16, 1);
      Leg3.setRotationPoint(4F, 9F, 4F);
      Leg3.setTextureSize(64, 32);
      Leg3.mirror = true;
      setRotation(Leg3, 0.2792527F, 0F, 6.003932F);
      Leg4 = new ModelRenderer(this, 0, 0);
      Leg4.addBox(0F, 0F, 0F, 1, 16, 1);
      Leg4.setRotationPoint(4F, 9F, -5F);
      Leg4.setTextureSize(64, 32);
      Leg4.mirror = true;
      setRotation(Leg4, 6.003932F, 0F, 6.003932F);
      Leg1 = new ModelRenderer(this, 0, 0);
      Leg1.addBox(0F, 0F, 0F, 1, 16, 1);
      Leg1.setRotationPoint(-5F, 9F, -5F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 6.003932F, 0F, 0.2792527F);
      lowerBody = new ModelRenderer(this, 4, 0);
      lowerBody.addBox(0F, 0F, 0F, 12, 2, 12);
      lowerBody.setRotationPoint(-6F, 7F, -6F);
      lowerBody.setTextureSize(64, 32);
      lowerBody.mirror = true;
      setRotation(lowerBody, 0F, 0F, 0F);
      body1 = new ModelRenderer(this, 0, 14);
      body1.addBox(0F, 0F, 0F, 10, 6, 10);
      body1.setRotationPoint(-5F, 1F, -5F);
      body1.setTextureSize(64, 32);
      body1.mirror = true;
      setRotation(body1, 0F, 0F, 0F);
      body2 = new ModelRenderer(this, 0, 30);
      body2.addBox(0F, 0F, 0F, 8, 8, 8);
      body2.setRotationPoint(-4F, -7F, -4F);
      body2.setTextureSize(64, 32);
      body2.mirror = true;
      setRotation(body2, 0F, 0F, 0F);
      top = new ModelRenderer(this, 0, 46);
      top.addBox(0F, 0F, 0F, 4, 8, 4);
      top.setRotationPoint(-2F, -15F, -2F);
      top.setTextureSize(128, 64);
      top.mirror = true;
      setRotation(top, 0F, 0F, 0F);
      Leg1top = new ModelRenderer(this, 52, 0);
      Leg1top.addBox(0F, 0F, 0F, 4, 3, 4);
      Leg1top.setRotationPoint(-7F, 9F, -7F);
      Leg1top.setTextureSize(128, 64);
      Leg1top.mirror = true;
      setRotation(Leg1top, 0F, 0F, 0F);
      Leg2top = new ModelRenderer(this, 52, 0);
      Leg2top.addBox(0F, 0F, 0F, 4, 3, 4);
      Leg2top.setRotationPoint(-7F, 9F, 3F);
      Leg2top.setTextureSize(128, 64);
      Leg2top.mirror = true;
      setRotation(Leg2top, 0F, 0F, 0F);
      Leg3top = new ModelRenderer(this, 52, 0);
      Leg3top.addBox(0F, 0F, 0F, 4, 3, 4);
      Leg3top.setRotationPoint(3F, 9F, 3F);
      Leg3top.setTextureSize(128, 64);
      Leg3top.mirror = true;
      setRotation(Leg3top, 0F, 0F, 0F);
      Leg4top = new ModelRenderer(this, 52, 0);
      Leg4top.addBox(0F, 0F, 0F, 4, 3, 4);
      Leg4top.setRotationPoint(3F, 9F, -7F);
      Leg4top.setTextureSize(128, 64);
      Leg4top.mirror = true;
      setRotation(Leg4top, 0F, 0F, 0F);
  }
  
  public int func_78104_a()
  {
      return 8;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
    Leg1.render(f5);
    lowerBody.render(f5);
    body1.render(f5);
    body2.render(f5);
    top.render(f5);
    Leg1top.render(f5);
    Leg2top.render(f5);
    Leg3top.render(f5);
    Leg4top.render(f5);
    
    for (int i = 0; i < this.orbit.length; ++i)
    {
        this.orbit[i].render(f5);
    }
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
    
    float f6 = f2 * (float)Math.PI * -0.1F;
    int i;

    for (i = 0; i < 2; ++i)
    {
        this.orbit[i].rotationPointY = -2.0F + MathHelper.cos(((float)(i * 2) + f2) * 0.25F);
        this.orbit[i].rotationPointX = MathHelper.cos(f6) * 9.0F;
        this.orbit[i].rotationPointZ = MathHelper.sin(f6) * 9.0F;
        ++f6;
    }

    
    
  }

}
