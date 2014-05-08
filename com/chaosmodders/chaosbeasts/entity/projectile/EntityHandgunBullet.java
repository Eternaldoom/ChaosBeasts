package com.chaosmodders.chaosbeasts.entity.projectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityHandgunBullet extends EntityThrowable
{
	int i = 0;
	int speed = 5;
    public EntityHandgunBullet(World var1)
    {
        super(var1);
    }

    public EntityHandgunBullet(World var1, EntityLivingBase var2)
    {
        super(var1, var2);
        this.motionX*=speed;
        this.motionY*=speed;
        this.motionZ*=speed;
    }

    public EntityHandgunBullet(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    @Override
    protected float getGravityVelocity()
    {
    	return 0.001F;
    }
    
    @Override
    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 20;

            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2);
        }
        else
        {
        	this.motionX = 0;
            this.motionY = 0;
            this.motionZ = 0;
        
    if (i == 10)
    {
        if (!this.worldObj.isRemote)
        {
            this.setDead();
            i = 0;
        }
    }
    else
    {
    	i++;
    }
    }
    }
}