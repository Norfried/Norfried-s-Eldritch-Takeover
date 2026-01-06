package com.norfried.eldritch_takeover.init;

import java.util.List;
import java.util.ArrayList;

import com.norfried.eldritch_takeover.item.ItemBase;
import com.norfried.eldritch_takeover.item.food.ItemFoodBase;
import com.norfried.eldritch_takeover.item.food.ItemFoodCrawlerEye;
import com.norfried.eldritch_takeover.item.food.ItemFoodProtoplasm;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Special
    public static final Item MYSTERIOUS_ARTIFACT = new ItemBase("straulok_artifact_dormant").setMaxStackSize(1);
    public static final Item STRAULOK_INVOCATOR = new ItemBase("straulok_artifact_awakened").setMaxStackSize(1);

    //Material
    public static final Item STRAULOK_PROTOPLASM = new ItemBase("straulok_protoplasm");

    //Food
    public static final Item BURNT_STRAULOK_PROTOPLASM = new ItemFoodProtoplasm("straulok_protoplasm_burnt", 1, 0.1F, false);
    public static final Item CURED_STRAULOK_PROTOPLASM = new ItemFoodBase("straulok_protoplasm_cured", 2, 0.4F, false).setPotionEffect(new PotionEffect(MobEffects.LEVITATION, 20, 0), 0.8F);
    public static final Item STRAULOK_CRAWLER_EYE = new ItemFoodCrawlerEye("straulok_crawler_eye", 3, 0.8F, false);
}
