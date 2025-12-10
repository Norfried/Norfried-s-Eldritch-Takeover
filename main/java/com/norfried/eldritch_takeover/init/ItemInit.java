package com.norfried.eldritch_takeover.init;

import java.util.List;
import java.util.ArrayList;

import com.norfried.eldritch_takeover.item.ItemBase;
import com.norfried.eldritch_takeover.item.food.ItemFoodBase;
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
    public static final Item STRAULOK_CRAWLER_EYE = new ItemFoodBase("straulok_crawler_eye", 3, 0.8F, false).setPotionEffect(new PotionEffect(MobEffects.WITHER, 200, 1), 1.0F);
}
