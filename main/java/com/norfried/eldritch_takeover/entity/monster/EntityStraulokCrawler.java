package com.norfried.eldritch_takeover.entity.monster;

import com.google.common.base.Predicate;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.world.storage.loot.LootTableList;


import javax.annotation.Nullable;


public class EntityStraulokCrawler extends EntitySpider
{
    public EntityStraulokCrawler(World worldIn)
    {
        super(worldIn);
        this.setSize(1.65F, 1.125F);
    }

    private int blockBreakCounter;

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(64.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.32D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(9.0D);
    }

    protected void initEntityAI()
    {
        super.initEntityAI();
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntitySnowman.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
    }


    public boolean attackEntityAsMob(Entity entityIn)
    {
        if (super.attackEntityAsMob(entityIn))
        {
            if (entityIn instanceof EntityLivingBase)
            {
                int i = 0;
                int a = 0;

                switch(this.world.getDifficulty())
                {
                    default:
                    case EASY:
                        i = 7;
                        break;
                    case NORMAL:
                        i = 11;
                        break;
                    case HARD:
                        i = 11;
                        a = 0;
                        ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE));
                        break;
                }

                if (i > 0)
                {
                    ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.WITHER, i * 20, a));
                    ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, i * 20, a));
                }
            }

            return true;
        }
        else
        {
            return false;
        }
    }

    @Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        return livingdata;
    }

    public float getEyeHeight()
    {
        return 0.8F;
    }

    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }
    }

    public void fall(float distance, float damageMultiplier)
    {
    }


    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_CAVE_SPIDER;
    }
}