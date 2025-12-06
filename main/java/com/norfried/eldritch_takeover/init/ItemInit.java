package com.norfried.eldritch_takeover.init;

import java.util.List;
import java.util.ArrayList;

import net.minecraft.item.Item;
import com.norfried.eldritch_takeover.item.ItemBase;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item MYSTERIOUS_ARTIFACT = new ItemBase("straulok_artifact_dormant");
    public static final Item STRAULOK_INVOCATOR = new ItemBase("straulok_artifact_awakened");
    public static final Item STRAULOK_PROTOPLASM = new ItemBase("straulok_protoplasm");
    public static final Item STRAULOK_CRAWLER_EYE = new ItemBase("straulok_crawler_eye");
}
