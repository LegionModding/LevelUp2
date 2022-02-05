package com.legionmodding.levelupreforged.items;

import com.legionmodding.levelupreforged.LevelUpReforged;

import net.minecraft.item.Item;

public class ItemOreChunk extends Item
{
    public ItemOreChunk()
    {
        super(new Item.Properties().stacksTo(1).tab(LevelUpReforged.CREATIVE_TAB));
    }
}
