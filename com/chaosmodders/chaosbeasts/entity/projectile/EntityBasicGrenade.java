package com.chaosmodders.chaosbeasts.entity.projectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBasicGrenade extends EntityThrowable
{
	int i = 0;
	float explosionRadius = 2.0F;
    public EntityBasicGrenade(World var1)
    {
        super(var1);
    }

    public EntityBasicGrenade(World var1, EntityLivingBase var2)
    {
        super(var1, var2);
    }

    public EntityBasicGrenade(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }
    
    @Override
    protected void onImpact(MovingObjectPosition var1)
    {
    	byte var2 = 5;
        for (int george = 0; george<3; george++)
        {
    	if (var1.entityHit != null)
        {
            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2);
        }
            this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);
        //}
        
        //if (!this.worldObj.isRemote)
        //{
        	//this.posX = 0;
        	//this.posY = 0;
        	//this.posZ = 0;
        	//this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);
       // }
    }
    }
    }