package io.github.fallOut015.stained_planks.world.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class BlockStateProviderStainedPlanks extends BlockStateProvider {
    public BlockStateProviderStainedPlanks(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ForgeRegistries.BLOCKS.getValues().stream().filter(block -> Objects.requireNonNull(block.getRegistryName()).getNamespace().equals(MainGlazedBricks.MODID)).forEach(block -> {
            String p = Objects.requireNonNull(block.getRegistryName()).getPath();
            if(p.endsWith("glazed_bricks")) {
                this.simpleBlock(block);
            } else if(block instanceof StairBlock) {
                this.stairsBlock((StairBlock) block, new ResourceLocation(MainGlazedBricks.MODID, "block/" + BlockStateProviderGlazedBricks.getColor(p) + "_glazed_bricks"));
            } else if(block instanceof SlabBlock) {
                this.slabBlock((SlabBlock) block, new ResourceLocation(MainGlazedBricks.MODID, BlockStateProviderGlazedBricks.getColor(p) + "_glazed_bricks"), new ResourceLocation(MainGlazedBricks.MODID, "block/" + BlockStateProviderGlazedBricks.getColor(p) + "_glazed_bricks"));
            } else if(block instanceof WallBlock) {
                this.wallBlock((WallBlock) block, new ResourceLocation(MainGlazedBricks.MODID, "block/" + BlockStateProviderGlazedBricks.getColor(p) + "_glazed_bricks"));
            } else if(block instanceof FlowerPotBlock) {
                if(((FlowerPotBlock) block).getContent() == Blocks.AIR) {
                    this.emptyFlowerPotBlock((FlowerPotBlock) block, new ResourceLocation(MainGlazedBricks.MODID, "block/" + p));
                } else {
                    this.flowerPotBlock((FlowerPotBlock) block, new ResourceLocation("minecraft", BlockStateProviderGlazedBricks.getGlazedSuffix(p)), new ResourceLocation(MainGlazedBricks.MODID, "block/" + BlockStateProviderGlazedBricks.getColor(p) + "_glazed_flower_pot"));
                }
            }
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
    private static String getGlazedSuffix(String p) {
        StringBuilder s = new StringBuilder();
        boolean append = false;
        for(String t : p.split("_")) {
            if(t.equals("glazed")) {
                append = true;
                continue;
            }
            if(append) {
                s.append(t).append("_");
            }
        }
        return s.substring(0, s.toString().length() - 1);
    }
}