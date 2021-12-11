package io.github.fallOut015.stained_planks.world.level.block;

import io.github.fallOut015.stained_planks.MainStainedPlanks;
import io.github.fallOut015.stained_planks.world.level.block.grower.*;
import io.github.fallOut015.stained_planks.world.level.block.state.properties.WoodTypeStainedPlanks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.WoodButtonBlock;
import net.minecraft.world.level.block.grower.BirchTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlocksStainedPlanks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MainStainedPlanks.MODID);

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_PLANKS = BLOCKS.register("white_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.WHITE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_PLANKS = BLOCKS.register("orange_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.ORANGE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_PLANKS = BLOCKS.register("magenta_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.MAGENTA).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_PLANKS = BLOCKS.register("light_blue_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.LIGHT_BLUE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_PLANKS = BLOCKS.register("yellow_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_PLANKS = BLOCKS.register("lime_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.LIME).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_PLANKS = BLOCKS.register("pink_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.PINK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_PLANKS = BLOCKS.register("gray_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_PLANKS = BLOCKS.register("light_gray_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.LIGHT_GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_PLANKS = BLOCKS.register("cyan_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.CYAN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_PLANKS = BLOCKS.register("purple_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.PURPLE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_PLANKS = BLOCKS.register("blue_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.BLUE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_PLANKS = BLOCKS.register("brown_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_PLANKS = BLOCKS.register("green_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_PLANKS = BLOCKS.register("red_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_PLANKS = BLOCKS.register("black_stained_wooden_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.BLACK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_SAPLING = BLOCKS.register("white_stained_wooden_sapling", () -> new SaplingBlock(new WhiteStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_SAPLING = BLOCKS.register("orange_stained_wooden_sapling", () -> new SaplingBlock(new OrangeStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_SAPLING = BLOCKS.register("magenta_stained_wooden_sapling", () -> new SaplingBlock(new MagentaStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_SAPLING = BLOCKS.register("light_blue_stained_wooden_sapling", () -> new SaplingBlock(new LightBlueStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_SAPLING = BLOCKS.register("yellow_stained_wooden_sapling", () -> new SaplingBlock(new YellowStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_SAPLING = BLOCKS.register("lime_stained_wooden_sapling", () -> new SaplingBlock(new LimeStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_SAPLING = BLOCKS.register("pink_stained_wooden_sapling", () -> new SaplingBlock(new PinkStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_SAPLING = BLOCKS.register("gray_stained_wooden_sapling", () -> new SaplingBlock(new GrayStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_SAPLING = BLOCKS.register("light_gray_stained_wooden_sapling", () -> new SaplingBlock(new LightGrayStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_SAPLING = BLOCKS.register("cyan_stained_wooden_sapling", () -> new SaplingBlock(new CyanStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_SAPLING = BLOCKS.register("purple_stained_wooden_sapling", () -> new SaplingBlock(new PurpleStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_SAPLING = BLOCKS.register("blue_stained_wooden_sapling", () -> new SaplingBlock(new BlueStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_SAPLING = BLOCKS.register("brown_stained_wooden_sapling", () -> new SaplingBlock(new BrownStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_SAPLING = BLOCKS.register("green_stained_wooden_sapling", () -> new SaplingBlock(new GreenStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_SAPLING = BLOCKS.register("red_stained_wooden_sapling", () -> new SaplingBlock(new RedStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_SAPLING = BLOCKS.register("black_stained_wooden_sapling", () -> new SaplingBlock(new BlackStainedWoodTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_LOG = BLOCKS.register("white_stained_wooden_log", () -> log(DyeColor.WHITE.getMaterialColor(), DyeColor.WHITE.getMaterialColor()));

    public static final RegistryObject<Block> STRIPPED_WHITE_STAINED_WOODEN_LOG = BLOCKS.register("stripped_white_stained_wooden_log", () -> log(DyeColor.WHITE.getMaterialColor(), DyeColor.WHITE.getMaterialColor()));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_WOOD = BLOCKS.register("white_stained_wooden_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.WHITE).strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_WHITE_STAINED_WOODEN_WOOD = BLOCKS.register("stripped_white_stained_wooden_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.WHITE).strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_LEAVES = BLOCKS.register("white_stained_wooden_leaves", () -> leaves(SoundType.GRASS));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_SIGN = BLOCKS.register("white_stained_wooden_sign", () -> new StandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.WHITE).noCollission().strength(1.0F).sound(SoundType.WOOD), WoodTypeStainedPlanks.WHITE_STAINED_WOOD));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("white_stained_wooden_wall_sign", () -> new WallSignBlock(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.WHITE).noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(BlocksStainedPlanks.WHITE_STAINED_WOODEN_SIGN), WoodTypeStainedPlanks.WHITE_STAINED_WOOD));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_PRESSURE_PLATE = BLOCKS.register("white_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, BlocksStainedPlanks.WHITE_STAINED_WOODEN_SIGN.get().defaultMaterialColor()).noCollission().strength(0.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_TRAPDOOR = BLOCKS.register("white_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.WHITE).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(BlocksStainedPlanks::never)));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_STAIRS = BLOCKS.register("white_stained_wooden_stairs", () -> new StairBlock(BlocksStainedPlanks.WHITE_STAINED_WOODEN_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(BlocksStainedPlanks.WHITE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_STAIRS = BLOCKS.register("orange_stained_wooden_stairs", () -> new StairBlock(ORANGE_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(ORANGE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_STAIRS = BLOCKS.register("magenta_stained_wooden_stairs", () -> new StairBlock(MAGENTA_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(MAGENTA_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_STAIRS = BLOCKS.register("light_blue_stained_wooden_stairs", () -> new StairBlock(LIGHT_BLUE_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(LIGHT_BLUE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_STAIRS = BLOCKS.register("yellow_stained_wooden_stairs", () -> new StairBlock(YELLOW_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(YELLOW_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_STAIRS = BLOCKS.register("lime_stained_wooden_stairs", () -> new StairBlock(LIME_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(LIME_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_STAIRS = BLOCKS.register("pink_stained_wooden_stairs", () -> new StairBlock(PINK_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(PINK_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_STAIRS = BLOCKS.register("gray_stained_wooden_stairs", () -> new StairBlock(GRAY_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(GRAY_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_STAIRS = BLOCKS.register("light_gray_stained_wooden_stairs", () -> new StairBlock(LIGHT_GRAY_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(LIGHT_GRAY_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_STAIRS = BLOCKS.register("cyan_stained_wooden_stairs", () -> new StairBlock(CYAN_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(CYAN_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_STAIRS = BLOCKS.register("purple_stained_wooden_stairs", () -> new StairBlock(PURPLE_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(PURPLE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_STAIRS = BLOCKS.register("blue_stained_wooden_stairs", () -> new StairBlock(BLUE_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(BLUE_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_STAIRS = BLOCKS.register("brown_stained_wooden_stairs", () -> new StairBlock(BROWN_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(BROWN_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_STAIRS = BLOCKS.register("green_stained_wooden_stairs", () -> new StairBlock(GREEN_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(GREEN_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_STAIRS = BLOCKS.register("red_stained_wooden_stairs", () -> new StairBlock(RED_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(RED_STAINED_WOODEN_PLANKS.get())));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_STAIRS = BLOCKS.register("black_stained_wooden_stairs", () -> new StairBlock(BLACK_STAINED_WOODEN_PLANKS.get()::defaultBlockState, Block.Properties.copy(BLACK_STAINED_WOODEN_PLANKS.get())));

    public static final RegistryObject<Block> POTTED_WHITE_STAINED_WOODEN_SAPLING = BLOCKS.register("potted_white_stained_wooden_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BlocksStainedPlanks.WHITE_STAINED_WOODEN_SAPLING, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_BUTTON = BLOCKS.register("white_stained_wooden_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_SLAB = BLOCKS.register("white_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, DyeColor.WHITE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
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

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_FENCE_GATE = BLOCKS.register("white_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, BlocksStainedPlanks.WHITE_STAINED_WOODEN_PLANKS.get().defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
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

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_FENCE = BLOCKS.register("white_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, BlocksStainedPlanks.WHITE_STAINED_WOODEN_PLANKS.get().defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
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

    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_DOOR = BLOCKS.register("white_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, BlocksStainedPlanks.WHITE_STAINED_WOODEN_PLANKS.get().defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));



    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

    private static RotatedPillarBlock log(MaterialColor insideColor, MaterialColor barkColor) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (blockState) -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? insideColor : barkColor).strength(2.0F).sound(SoundType.WOOD));
    }

    private static LeavesBlock leaves(SoundType soundType) {
        return new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(soundType).noOcclusion().isValidSpawn(BlocksStainedPlanks::ocelotOrParrot).isSuffocating(BlocksStainedPlanks::never).isViewBlocking(BlocksStainedPlanks::never));
    }

    private static Boolean ocelotOrParrot(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
        return entityType == EntityType.OCELOT || entityType == EntityType.PARROT;
    }

    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }
    private static Boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
        return (boolean)false;
    }
}