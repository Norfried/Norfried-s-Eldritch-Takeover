package com.norfried.eldritch_takeover.client;

import com.norfried.eldritch_takeover.entity.monster.EntityStraulokCrawler;
import com.norfried.eldritch_takeover.util.Reference;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderStraulokCrawler extends RenderLiving<EntityStraulokCrawler>
{
    private static final ResourceLocation STRAULOK_CRAWLER_TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entities/straulok/straulok_crawler.png");


    public RenderStraulokCrawler(RenderManager renderManagerIn)
    {
        super(renderManagerIn, new ModelSpider(), 1.0F);
        addLayer(new LayerStraulokCrawlerEyes(this));
    }

    protected void preRenderCallback(EntityStraulokCrawler entitylivingbaseIn, float partialTickTime)
    {
        GlStateManager.scale(1.2F, 1.25F, 1.2F);
    }

    protected ResourceLocation getEntityTexture(EntityStraulokCrawler entity)
    {
        return STRAULOK_CRAWLER_TEXTURES;
    }
}
