package io.github.fallOut015.stained_planks.world.data;

import io.github.fallOut015.stained_planks.MainStainedPlanks;
import io.github.fallOut015.stained_planks.world.data.client.BlockModelProviderStainedPlanks;
import io.github.fallOut015.stained_planks.world.data.client.BlockStateProviderStainedPlanks;
import io.github.fallOut015.stained_planks.world.data.client.ItemModelProviderStainedPlanks;
import io.github.fallOut015.stained_planks.world.data.client.LanguageProviderStainedPlanks;
import io.github.fallOut015.stained_planks.world.data.server.ItemTagsProviderStainedPlanks;
import io.github.fallOut015.stained_planks.world.data.server.LootTableProviderStainedPlanks;
import io.github.fallOut015.stained_planks.world.data.server.RecipeProviderStainedPlanks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneratorStainedPlanks {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        @SuppressWarnings("unused")
        DataGenerator gen = event.getGenerator();

        if(event.includeClient()) {
            gen.addProvider(new BlockStateProviderStainedPlanks(gen, MainStainedPlanks.MODID, event.getExistingFileHelper()));
            gen.addProvider(new LanguageProviderStainedPlanks(gen, MainStainedPlanks.MODID, "en_au"));
            gen.addProvider(new LanguageProviderStainedPlanks(gen, MainStainedPlanks.MODID, "en_ca"));
            gen.addProvider(new LanguageProviderStainedPlanks(gen, MainStainedPlanks.MODID, "en_gb"));
            gen.addProvider(new LanguageProviderStainedPlanks(gen, MainStainedPlanks.MODID, "en_nz"));
            gen.addProvider(new LanguageProviderStainedPlanks(gen, MainStainedPlanks.MODID, "en_us"));
            gen.addProvider(new BlockModelProviderStainedPlanks(gen, MainStainedPlanks.MODID, event.getExistingFileHelper()));
            gen.addProvider(new ItemModelProviderStainedPlanks(gen, MainStainedPlanks.MODID, event.getExistingFileHelper()));
        }

        if(event.includeServer()) {
            gen.addProvider(new LootTableProviderStainedPlanks(gen));
            gen.addProvider(new RecipeProviderStainedPlanks(gen));
            BlockTagsProvider blockTagsProvider = new BlockTagsProvider(gen, MainStainedPlanks.MODID, event.getExistingFileHelper());
            gen.addProvider(blockTagsProvider);
            gen.addProvider(new ItemTagsProviderStainedPlanks(gen, blockTagsProvider, MainStainedPlanks.MODID, event.getExistingFileHelper()));
        }
    }
}
