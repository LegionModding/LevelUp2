package com.legionmodding.levelupreforged.handler.registry;

import com.legionmodding.levelupreforged.LevelUpReforged;
import com.legionmodding.levelupreforged.items.*;

import net.minecraft.item.Item;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LevelUpReforged.ID);
    private static final DeferredRegister<Item> TINKERS_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LevelUpReforged.ID);

    private static final RegistryObject<Item> ALUMINUM_ORE_CHUNK= ITEMS.register("aluminum_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> COAL_ORE_CHUNK = ITEMS.register("coal_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> COPPER_ORE_CHUNK = ITEMS.register("copper_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> DIAMOND_ORE_CHUNK = ITEMS.register("diamond_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> EMERALD_ORE_CHUNK = ITEMS.register("emerald_ore_chunk", ItemOreChunk::new);
    public static final RegistryObject<Item> EXPERIENCE_BOOK = ITEMS.register("experience_book", ItemExperienceBook::new);
    private static final RegistryObject<Item> GOLD_ORE_CHUNK = ITEMS.register("gold_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> IRIDIUM_ORE_CHUNK= ITEMS.register("iridium_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> IRON_ORE_CHUNK = ITEMS.register("iron_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> LAPIS_ORE_CHUNK = ITEMS.register("lapis_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> LEAD_ORE_CHUNK = ITEMS.register("lead_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> MANA_INFUSED__ORE_CHUNK = ITEMS.register("mana_infused_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> NETHER_QUARTZ_ORE_CHUNK = ITEMS.register("nether_quartz_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> NICKEL_ORE_CHUNK = ITEMS.register("nickel_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> PLATINUM_ORE_CHUNK = ITEMS.register("platinum_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> REDSTONE_ORE_CHUNK = ITEMS.register("redstone_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> RESPEC_BOOK = ITEMS.register("respec_book", ItemRespecBook::new);
    private static final RegistryObject<Item> SILVER_ORE_CHUNK = ITEMS.register("silver_ore_chunk", ItemOreChunk::new);
    private static final RegistryObject<Item> TIN_ORE_CHUNK = ITEMS.register("tin_ore_chunk", ItemOreChunk::new);


    public static void registerItems()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static void registerTinkers()
    {
        if(ModList.get().isLoaded("tconstruct"))
        {
            TINKERS_ITEMS.register("ardite_ore_chunk", ItemOreChunk::new);
            TINKERS_ITEMS.register("cobalt_ore_chunk", ItemOreChunk::new);
            TINKERS_ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        }
    }
}
