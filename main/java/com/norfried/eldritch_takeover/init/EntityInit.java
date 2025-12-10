package com.norfried.eldritch_takeover.init;

import com.norfried.eldritch_takeover.Main;
import com.norfried.eldritch_takeover.client.*;
import com.norfried.eldritch_takeover.entity.monster.*;
import com.norfried.eldritch_takeover.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static net.minecraftforge.registries.GameData.registerEntity;

public class EntityInit
{
    public static int id;

    public static void registerEntities()
    {
        registerEntity("straulok_crawler", EntityStraulokCrawler.class, ++id, 100, 3222845, 8133113);
    }

    @SideOnly(Side.CLIENT)
    public static void RegisterRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityStraulokCrawler.class, RenderStraulokCrawler::new);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
    }
}
