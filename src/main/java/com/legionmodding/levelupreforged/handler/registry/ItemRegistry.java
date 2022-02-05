package com.legionmodding.levelupreforged.handler.registry;

import com.legionmodding.levelupreforged.LevelUpReforged;
import com.legionmodding.levelupreforged.items.*;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LevelUpReforged.ID);

    public static final RegistryObject<Item> EXPERIENCE_BOOK = ITEMS.register("experience_book", ItemExperienceBook::new);
    private static final RegistryObject<Item> RESPEC_BOOK = ITEMS.register("respec_book", ItemRespecBook::new);

    public static void registerItems()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
