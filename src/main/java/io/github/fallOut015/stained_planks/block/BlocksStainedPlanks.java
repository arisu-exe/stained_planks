package io.github.fallOut015.stained_planks.block;

import io.github.fallOut015.stained_planks.MainStainedPlanks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlocksStainedPlanks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MainStainedPlanks.MODID);



    // stained boat
    // stained sign
    // stained door (not sure how it's gonna work)
    // stained button
    // stained pressure plate
    // stained trapdoor (also not sure)

    // stained barrel
    // stained chest

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_PLANKS = BLOCKS.register("white_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.WHITE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_PLANKS = BLOCKS.register("orange_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.ORANGE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_PLANKS = BLOCKS.register("magenta_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.MAGENTA).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_PLANKS = BLOCKS.register("light_blue_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.LIGHT_BLUE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_PLANKS = BLOCKS.register("yellow_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_PLANKS = BLOCKS.register("lime_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.LIME).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_PLANKS = BLOCKS.register("pink_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.PINK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_PLANKS = BLOCKS.register("gray_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_PLANKS = BLOCKS.register("light_gray_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.LIGHT_GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_PLANKS = BLOCKS.register("cyan_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.CYAN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_PLANKS = BLOCKS.register("purple_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.PURPLE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_PLANKS = BLOCKS.register("blue_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.BLUE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_PLANKS = BLOCKS.register("brown_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_PLANKS = BLOCKS.register("green_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_PLANKS = BLOCKS.register("red_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_PLANKS = BLOCKS.register("black_stained_wooden_planks", () -> new Block(Block.Properties.of(Material.WOOD, DyeColor.BLACK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_SLAB = BLOCKS.register("white_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.WHITE).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_SLAB = BLOCKS.register("orange_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.ORANGE).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_SLAB = BLOCKS.register("magenta_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.MAGENTA).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_SLAB = BLOCKS.register("light_blue_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.LIGHT_BLUE).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_SLAB = BLOCKS.register("yellow_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.YELLOW).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_SLAB = BLOCKS.register("lime_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.LIME).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_SLAB = BLOCKS.register("pink_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.PINK).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_SLAB = BLOCKS.register("gray_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.GRAY).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_SLAB = BLOCKS.register("light_gray_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.LIGHT_GRAY).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_SLAB = BLOCKS.register("cyan_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.CYAN).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_SLAB = BLOCKS.register("purple_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.PURPLE).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_SLAB = BLOCKS.register("blue_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.BLUE).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_SLAB = BLOCKS.register("brown_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.BROWN).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_SLAB = BLOCKS.register("green_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.GREEN).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_SLAB = BLOCKS.register("red_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.RED).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_SLAB = BLOCKS.register("black_stained_wooden_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, DyeColor.BLACK).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_STAIRS = BLOCKS.register("white_stained_wooden_stairs", () -> new StairsBlock(WHITE_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(WHITE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_STAIRS = BLOCKS.register("orange_stained_wooden_stairs", () -> new StairsBlock(ORANGE_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(ORANGE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_STAIRS = BLOCKS.register("magenta_stained_wooden_stairs", () -> new StairsBlock(MAGENTA_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(MAGENTA_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_STAIRS = BLOCKS.register("light_blue_stained_wooden_stairs", () -> new StairsBlock(LIGHT_BLUE_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(LIGHT_BLUE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_STAIRS = BLOCKS.register("yellow_stained_wooden_stairs", () -> new StairsBlock(YELLOW_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(YELLOW_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_STAIRS = BLOCKS.register("lime_stained_wooden_stairs", () -> new StairsBlock(LIME_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(LIME_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_STAIRS = BLOCKS.register("pink_stained_wooden_stairs", () -> new StairsBlock(PINK_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(PINK_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_STAIRS = BLOCKS.register("gray_stained_wooden_stairs", () -> new StairsBlock(GRAY_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(GRAY_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_STAIRS = BLOCKS.register("light_gray_stained_wooden_stairs", () -> new StairsBlock(LIGHT_GRAY_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(LIGHT_GRAY_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_STAIRS = BLOCKS.register("cyan_stained_wooden_stairs", () -> new StairsBlock(CYAN_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(CYAN_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_STAIRS = BLOCKS.register("purple_stained_wooden_stairs", () -> new StairsBlock(PURPLE_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(PURPLE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_STAIRS = BLOCKS.register("blue_stained_wooden_stairs", () -> new StairsBlock(BLUE_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(BLUE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_STAIRS = BLOCKS.register("brown_stained_wooden_stairs", () -> new StairsBlock(BROWN_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(BROWN_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_STAIRS = BLOCKS.register("green_stained_wooden_stairs", () -> new StairsBlock(GREEN_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(GREEN_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_STAIRS = BLOCKS.register("red_stained_wooden_stairs", () -> new StairsBlock(RED_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(RED_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_STAIRS = BLOCKS.register("black_stained_wooden_stairs", () -> new StairsBlock(BLACK_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(BLACK_STAINED_WOODEN_PLANKS.get())));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_FENCE = BLOCKS.register("white_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(WHITE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_FENCE = BLOCKS.register("orange_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(ORANGE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_FENCE = BLOCKS.register("magenta_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(MAGENTA_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_FENCE = BLOCKS.register("light_blue_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(LIGHT_BLUE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_FENCE = BLOCKS.register("yellow_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(YELLOW_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_FENCE = BLOCKS.register("lime_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(LIME_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_FENCE = BLOCKS.register("pink_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(PINK_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_FENCE = BLOCKS.register("gray_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(GRAY_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_FENCE = BLOCKS.register("light_gray_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(LIGHT_GRAY_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_FENCE = BLOCKS.register("cyan_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(CYAN_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_FENCE = BLOCKS.register("purple_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(PURPLE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_FENCE = BLOCKS.register("blue_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(BLUE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_FENCE = BLOCKS.register("brown_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(BROWN_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_FENCE = BLOCKS.register("green_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(GREEN_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_FENCE = BLOCKS.register("red_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(RED_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_FENCE = BLOCKS.register("black_stained_wooden_fence", () -> new FenceBlock(Block.Properties.copy(BLACK_STAINED_WOODEN_PLANKS.get())));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("white_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(WHITE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("orange_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(ORANGE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("magenta_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(MAGENTA_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("light_blue_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(LIGHT_BLUE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("yellow_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(YELLOW_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("lime_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(LIME_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("pink_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(PINK_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("gray_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(GRAY_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("light_gray_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(LIGHT_GRAY_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("cyan_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(CYAN_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("purple_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(PURPLE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("blue_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(BLUE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("brown_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(BROWN_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("green_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(GREEN_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("red_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(RED_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("black_stained_wooden_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(BLACK_STAINED_WOODEN_PLANKS.get())));



    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}