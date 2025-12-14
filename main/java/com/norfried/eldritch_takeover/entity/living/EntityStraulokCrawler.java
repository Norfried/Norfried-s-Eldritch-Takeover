package com.norfried.eldritch_takeover.entity.living;


import com.norfried.eldritch_takeover.entity.ai.EntityAIStraulokCrawlerLeap;
import com.norfried.eldritch_takeover.util.handlers.LootTableHandler;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;


import javax.annotation.Nullable;
import java.util.Random;


public class EntityStraulokCrawler extends EntitySpider
{
    public EntityStraulokCrawler(World worldIn)
    {
        super(worldIn);
        this.setSize(1.7F, 1.13F);
    }

    protected void initEntityAI()
    {
        super.initEntityAI();
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<>(this, EntityPlayer.class, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<>(this, EntityVillager.class, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<>(this, EntityGolem.class, true));
        this.targetTasks.addTask(7, new EntityStraulokCrawler.AIStraulokCrawlerHunt<>(this, EntityAnimal.class));
        this.tasks.addTask(3, new EntityAIAvoidEntity<>(this, EntityEnderCrystal.class, 6.0F, 1.0D, 1.1D));
        this.tasks.addTask(2, new EntityAIStraulokCrawlerLeap(this, 4f));
    }


    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(48.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.32D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(9.0D);
    }

    //Code for slow falling over the void
    public boolean isEmptyColumn(World world, BlockPos blockpos) {
        if (world.getHeight(blockpos.getX(), blockpos.getZ()) == 0) return true;
        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos(blockpos);
        while (world.isValid(pos)) {
            pos.setY(pos.getY() - 1);
            if (!world.isAirBlock(pos)) return false;
        }
        return true;
    }

    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        if (isEmptyColumn(this.world, new BlockPos(this.posX, this.posY, this.posZ)) && !this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }
    }

    //Code for no fall damage.
    public void fall(float distance, float damageMultiplier)
    {

    }


    //Code for sound edits
    protected float getSoundPitch()
    {
        return (this.rand.nextFloat() - this.rand.nextFloat()) * 0.125F + 0.5F;
    }


    public boolean isPotionApplicable(PotionEffect potioneffectIn)
    {
        if(potioneffectIn.getPotion() == MobEffects.WITHER)
        {
            net.minecraftforge.event.entity.living.PotionEvent.PotionApplicableEvent event = new net.minecraftforge.event.entity.living.PotionEvent.PotionApplicableEvent(this, potioneffectIn);
            net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event);
            return event.getResult() == net.minecraftforge.fml.common.eventhandler.Event.Result.ALLOW;
        }
        return super.isPotionApplicable(potioneffectIn);
    }

    //Code for setting eye height
    public float getEyeHeight()
    {
        return 0.815F;
    }

    //Code for adding potion effects to the mob's melee attack
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
                        i = 10;
                        a = 1;
                        break;
                }

                if (i > 0)
                {
                    ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.WITHER, i * 20, a));
                    ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, i * 20, a));
                }
            }

            return true;
        }
        else
        {
            return false;
        }
    }

    static class AIStraulokCrawlerHunt <T extends EntityLivingBase> extends EntityAINearestAttackableTarget<T>
    {
        public AIStraulokCrawlerHunt(EntityStraulokCrawler hunter, Class<T> classTarget)
        {
            super(hunter, classTarget, true);
        }

        public boolean shouldExecute()
        {
            float f = this.taskOwner.getBrightness();
            return !(f >= 0.5F) && (this.target == null || !(this.target.getBrightness() >= 0.5F)) && super.shouldExecute();
        }
    }

    @Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {

        if (livingdata == null)
        {
            livingdata = new EntityStraulokCrawler.GroupData();

            if (this.world.getDifficulty() == EnumDifficulty.HARD && this.world.rand.nextFloat() < 0.1F * difficulty.getClampedAdditionalDifficulty())
            {
                ((EntityStraulokCrawler.GroupData)livingdata).setRandomEffect(this.world.rand);
            }
        }

        if (livingdata instanceof EntityStraulokCrawler.GroupData)
        {
            Potion potion = ((EntityStraulokCrawler.GroupData)livingdata).effect;

            if (potion != null)
            {
                this.addPotionEffect(new PotionEffect(potion, Integer.MAX_VALUE));
            }
        }

        return livingdata;
    }


    public static class GroupData implements IEntityLivingData
    {
        public Potion effect;

        public void setRandomEffect(Random rand)
        {
            int i = rand.nextInt(5);

            if (i <= 1)
            {
                this.effect = MobEffects.SPEED;
            }
            else if (i <= 2)
            {
                this.effect = MobEffects.STRENGTH;
            }
            else if (i <= 3)
            {
                this.effect = MobEffects.RESISTANCE;
            }
            else if (i <= 4)
            {
                this.effect = MobEffects.JUMP_BOOST;
            }
        }
    }

    @Override
    protected ResourceLocation getLootTable()
    {
        return LootTableHandler.STRAULOKCRAWLER;
    }
}