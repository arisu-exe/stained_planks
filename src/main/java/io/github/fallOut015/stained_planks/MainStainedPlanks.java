package io.github.fallOut015.stained_planks;

import io.github.fallOut015.stained_planks.block.BlocksStainedPlanks;
import io.github.fallOut015.stained_planks.item.ItemsStainedPlanks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Mod(MainStainedPlanks.MODID)
public class MainStainedPlanks {
    public static final String MODID = "stained_planks";

    // TODO make items fuel

    public MainStainedPlanks() {
        BlocksStainedPlanks.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemsStainedPlanks.register(FMLJavaModLoadingContext.get().getModEventBus());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        String[] paths = {
            "../src/main/resources/data/stained_planks/advancements/recipes/decorations",
            "../src/main/resources/data/stained_planks/advancements/recipes/redstone",
        };
        for(String path : paths) {
            try {
                Files.walk(Paths.get(path)).filter(Files::isRegularFile).forEach(file -> {
                    try {
                        List<String> lines = Files.readAllLines(file.toAbsolutePath(), Charset.defaultCharset());
                        for(int i = 0; i < lines.size(); ++ i) {
                            lines.set(i, lines.get(i).replace("two", "stained_planks"));
                        }
                        Files.write(file.toAbsolutePath(), lines);
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                });
            } catch(final IOException exception) {
                exception.printStackTrace();
            }
        }
    }
    private void doClientStuff(final FMLClientSetupEvent event) {
    }
    private void enqueueIMC(final InterModEnqueueEvent event) {
    }
    private void processIMC(final InterModProcessEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }
}