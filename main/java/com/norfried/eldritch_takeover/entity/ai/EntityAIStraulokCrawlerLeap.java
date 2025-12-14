package com.norfried.eldritch_takeover.entity.ai;

import com.norfried.eldritch_takeover.entity.living.EntityStraulokCrawler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.util.math.Vec3d;

public class EntityAIStraulokCrawlerLeap extends EntityAILeapAtTarget
{
    private final EntityStraulokCrawler crawler;
    private EntityLivingBase leapTarget;

    public EntityAIStraulokCrawlerLeap(EntityStraulokCrawler leapingEntity, float leapMotionYIn) {
        super(leapingEntity, leapMotionYIn);
        this.crawler = leapingEntity;
    }

    public static Vec3d yVec(double heightAboveGround) {
        return new Vec3d(0, heightAboveGround, 0);
    }

    @Override
    public boolean shouldExecute()
    {
        this.leapTarget = this.crawler.getAttackTarget();

        if (this.leapTarget == null)
        {
            return false;
        }
        else
        {
            double d0 = this.crawler.getDistanceSq(this.leapTarget);

            if (d0 >= 32.0D && d0 <= 256.0D)
            {
                if (!this.crawler.onGround)
                {
                    return false;
                }
                else
                {
                    return this.crawler.getRNG().nextInt(5) == 0;
                }
            }
            else
            {
                return false;
            }
        }
    }

    @Override
    public void startExecuting()
    {
        Vec3d create = this.leapTarget.getPositionVector();
        double distance = this.crawler.getPositionVector().distanceTo(create);
        leapTowards(this.crawler,create,(float)distance * 0.13f, (float)distance * 0.1f);
    }


    public static void leapTowards(EntityStraulokCrawler EntityStraulokCrawler, Vec3d target, float horzVel, float yVel)
    {
        Vec3d dir = target.subtract(EntityStraulokCrawler.getPositionVector()).normalize();
        Vec3d leap = new Vec3d(dir.x, 0, dir.z).normalize().scale(horzVel).add(yVec(yVel));
        EntityStraulokCrawler.motionX += leap.x;
        if (EntityStraulokCrawler.motionY < 0.1)
        {
            EntityStraulokCrawler.motionY += leap.y;
        }
        EntityStraulokCrawler.motionZ += leap.z;

        // Normalize to make sure the velocity doesn't go beyond what we expect
        double horzMag = Math.sqrt(Math.pow(EntityStraulokCrawler.motionX, 2) + Math.pow(EntityStraulokCrawler.motionZ, 2));
        double scale = horzVel / horzMag;
        if (scale < 1)
        {
            EntityStraulokCrawler.motionX *= scale;
            EntityStraulokCrawler.motionZ *= scale;
        }
    }

    public static void setEntityVelocity(Entity entity, Vec3d vec) {
        entity.motionX = vec.x;
        entity.motionY = vec.y;
        entity.motionZ = vec.z;
    }
}
