package com.legionmodding.levelupreforged;

import com.legionmodding.levelupreforged.handler.registry.ItemRegistry;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(LevelUpReforged.ID)
public class LevelUpReforged
{
    public static final String ID = "levelupreforged";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final ItemGroup CREATIVE_TAB = new ItemGroup("creativetab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ItemRegistry.EXPERIENCE_BOOK.get());
        }
    };

    public LevelUpReforged()
    {
        ItemRegistry.registerItems();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void onClientSetup(FMLClientSetupEvent event)
    {

    }

    private void onCommonSetup(FMLCommonSetupEvent event)
    {

    }
}
