package com.norfried.eldritch_takeover.util.handlers;

import com.norfried.eldritch_takeover.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.sound.SoundSetupEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {

    //STRAULKITE
    public static SoundEvent STRAULKITE_STEP;
    public static SoundEvent STRAULKITE_BREAK;
    public static SoundEvent STRAULKITE_PLACE;

    public static void registerSounds() {
        STRAULKITE_BREAK = registerSound("straulkite.break", "block");
        STRAULKITE_PLACE = registerSound("straulkite.place", "block");
        STRAULKITE_STEP = registerSound("straulkite.step", "block");
    }


    private static SoundEvent registerSound(String name, String category) {
        String fullName = category + "." + name;
        ResourceLocation location = new ResourceLocation(Reference.MODID, fullName);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(fullName);
        ForgeRegistries.SOUND_EVENTS.register(event);

        return event;
    }
}
