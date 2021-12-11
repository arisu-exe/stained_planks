package io.github.fallOut015.stained_planks.world.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class BlockModelProviderStainedPlanks extends BlockModelProvider {
    public BlockModelProviderStainedPlanks(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ForgeRegistries.BLOCKS.getValues().stream().filter(block -> Objects.requireNonNull(block.getRegistryName()).getNamespace().equals(MainGlazedBricks.MODID) && block instanceof WallBlock).forEach(block -> {
            String p = Objects.requireNonNull(block.getRegistryName()).getPath();
            this.wallInventory(p + "_inventory", new ResourceLocation(MainGlazedBricks.MODID, "block/" + getColor(p) + "_glazed_bricks"));
        });
    }

    private static String getColor(String p) {
        StringBuilder s = new StringBuilder();
        for(String t : p.split("_")) {
            if(t.equals("glazed")) {
                break;
            }
            s.append(t).append("_");
        }
        return s.substring(0, s.toString().length() - 1);
    }
}
