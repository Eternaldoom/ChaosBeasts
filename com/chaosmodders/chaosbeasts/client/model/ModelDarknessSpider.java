package com.chaosmodders.chaosbeasts.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDarknessSpider extends ModelBase
{
	public ModelRenderer leg1;
	public ModelRenderer leg1lower;
	public ModelRenderer leg2;
	public ModelRenderer leg2lower;
	public ModelRenderer leg3;
	public ModelRenderer leg3lower;
	public ModelRenderer leg4;
	public ModelRenderer leg4lower;
	public ModelRenderer lowerBody;
	public ModelRenderer mainBody;
	public ModelRenderer orbit1;
	public ModelRenderer orbit2;
	public ModelRenderer upperBody1;
	public ModelRenderer upperBody2;
	
	public ModelDarknessSpider()
	  {
	    textureWidth = 256;
	    textureHeight = 128;
	    
	    leg1 = new ModelRenderer(this, 0, 0);
	    leg1.addBox(0F, -8F, 0F, 1, 8, 1);
	    leg1.setRotationPoint(2F, 15F, -3F);
	    leg1.rotateAngleX = 6.003932626860494F;
	    leg1.rotateAngleZ = 6.003932626860494F;

	    leg1lower = new ModelRenderer(this, 0, 0);
	    leg1lower.addBox(0F, -8F, 0F, 1, 8, 1);
	    leg1lower.setRotationPoint(4F, 8F, -5F);

	    leg2 = new ModelRenderer(this, 0, 0);
	    leg2.addBox(0F, -8F, 0F, 1, 8, 1);
	    leg2.setRotationPoint(-3F, 15F, -3F);
	    leg2.rotateAngleX = 6.003932626860494F;
	    leg2.rotateAngleZ = 0.2792526803190927F;

	    leg2lower = new ModelRenderer(this, 0, 0);
	    leg2lower.addBox(0F, -8F, 0F, 1, 8, 1);
	    leg2lower.setRotationPoint(-5F, 8F, -5F);

	    leg3 = new ModelRenderer(this, 0, 0);
	    leg3.addBox(0F, -8F, 0F, 1, 8, 1);
	    leg3.setRotationPoint(-3F, 15F, 2F);
	    leg3.rotateAngleX = 0.2792526803190927F;
	    leg3.rotateAngleZ = 0.2792526803190927F;

	    leg3lower = new ModelRenderer(this, 0, 0);
	    leg3lower.addBox(0F, -8F, 0F, 1, 8, 1);
	    leg3lower.setRotationPoint(-5F, 8F, 4F);

	    leg4 = new ModelRenderer(this, 0, 0);
	    leg4.addBox(0F, -8F, 0F, 1, 8, 1);
	    leg4.setRotationPoint(2F, 15F, 2F);
	    leg4.rotateAngleX = 0.2792526803190927F;
	    leg4.rotateAngleZ = 6.003932626860494F;

	    leg4lower = new ModelRenderer(this, 0, 0);
	    leg4lower.addBox(0F, -8F, 0F, 1, 8, 1);
	    leg4lower.setRotationPoint(4F, 8F, 4F);

	    lowerBody = new ModelRenderer(this, 24, 6);
	    lowerBody.addBox(0F, 0F, 0F, 10, 2, 10);
	    lowerBody.setRotationPoint(-5F, 15F, -5F);

	    mainBody = new ModelRenderer(this, 0, 18);
	    mainBody.addBox(0F, 0F, 0F, 8, 6, 8);
	    mainBody.setRotationPoint(-4F, 17F, -4F);

	    orbit1 = new ModelRenderer(this, 0, 0);
	    orbit1.addBox(0F, 0F, -12F, 1, 1, 1);
	    orbit1.setRotationPoint(0F, 26F, 0F);

	    orbit2 = new ModelRenderer(this, 0, 0);
	    orbit2.addBox(0F, 0F, 12F, 1, 1, 1);
	    orbit2.setRotationPoint(0F, 26F, 0F);

	    upperBody1 = new ModelRenderer(this, 40, 20);
	    upperBody1.addBox(0F, 0F, 0F, 6, 6, 6);
	    upperBody1.setRotationPoint(-3F, 23F, -3F);

	    upperBody2 = new ModelRenderer(this, 8, 8);
	    upperBody2.addBox(0F, 0F, 0F, 4, 6, 4);
	    upperBody2.setRotationPoint(-2F, 29F, -2F);

	    
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    
	    leg1.render(f5);
	    leg1lower.render(f5);
	    leg2.render(f5);
	    leg2lower.render(f5);
	    leg3.render(f5);
	    leg3lower.render(f5);
	    leg4.render(f5);
	    leg4lower.render(f5);
	    lowerBody.render(f5);
	    mainBody.render(f5);
	    orbit1.render(f5);
	    orbit2.render(f5);
	    upperBody1.render(f5);
	    upperBody2.render(f5);
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