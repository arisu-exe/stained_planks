package io.github.fallOut015.stained_planks.world.level.block.grower;

import net.minecraft.data.worldgen.Features;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;

import javax.annotation.Nullable;
import java.util.Random;

public class CyanStainedWoodTreeGrower extends AbstractTreeGrower {
    @Nullable
    protected ConfiguredFeature<TreeConfiguration, ?> getConfiguredFeature(Random random, boolean beeHive) {
        return Features.BIRCH;
    }
}