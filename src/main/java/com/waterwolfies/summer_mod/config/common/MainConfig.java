package com.waterwolfies.summer_mod.config.common;

import com.waterwolfies.summer_mod.Mod;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

@Config(name = Mod.MODID)
public class MainConfig implements ConfigData {

    public static MainConfig register() {
        return AutoConfig.register(MainConfig.class, GsonConfigSerializer::new).getConfig();
    }

    private MainConfig() {}
}
