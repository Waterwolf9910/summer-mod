package com.waterwolfies.summer_mod.config.client;

import com.waterwolfies.summer_mod.config.common.MainConfig;

import java.util.Map;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

import me.shedaniel.autoconfig.AutoConfig;

public class ModMenuIntegration implements ModMenuApi {
    
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        
        return screen -> AutoConfig.getConfigScreen(MainConfig.class, screen).get();
    }
}
