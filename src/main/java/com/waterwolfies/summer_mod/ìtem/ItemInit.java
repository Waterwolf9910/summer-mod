package com.waterwolfies.summer_mod.ìtem;

import com.waterwolfies.summer_mod.ìtem.materials.CopperToolMat;

import io.wispforest.owo.itemgroup.OwoItemSettings;
import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

public class ItemInit implements ItemRegistryContainer {
    
    public static final ToolItem COPPER_SWORD = new SwordItem(new CopperToolMat(), 3, -2.4f, new OwoItemSettings());
}
