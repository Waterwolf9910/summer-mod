package com.waterwolfies.summer_mod;

import com.waterwolfies.summer_mod.config.common.MainConfig;
import com.waterwolfies.summer_mod.ìtem.ItemInit;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;

public class Mod implements ModInitializer {

    public static ModContainer MODCONTAINER;
    public static final String MODID = "summer_mod";
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static Logger LOGGER;

    //  public static final MainConfig config = MainConfig.createAndLoad();

    public static final MainConfig config = MainConfig.register();

    @Override
    public void onInitialize(ModContainer mod) {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        MODCONTAINER = mod;
        LOGGER = LoggerFactory.getLogger(MODID);
        LOGGER.info("Hello Fabric world!");

        FieldRegistrationHandler.register(ItemInit.class, MODID, false);
    }

    public static final String _modid() {
        return MODID;
    }
}
