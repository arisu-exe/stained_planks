package io.github.fallOut015.stained_planks.world.item;

import io.github.fallOut015.stained_planks.MainStainedPlanks;
import io.github.fallOut015.stained_planks.world.level.block.BlocksStainedPlanks;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsStainedPlanks {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MainStainedPlanks.MODID);



    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_PLANKS = ITEMS.register("white_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ORANGE_STAINED_WOODEN_PLANKS = ITEMS.register("orange_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.ORANGE_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_STAINED_WOODEN_PLANKS = ITEMS.register("magenta_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.MAGENTA_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_WOODEN_PLANKS = ITEMS.register("light_blue_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.LIGHT_BLUE_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> YELLOW_STAINED_WOODEN_PLANKS = ITEMS.register("yellow_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.YELLOW_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIME_STAINED_WOODEN_PLANKS = ITEMS.register("lime_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.LIME_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> PINK_STAINED_WOODEN_PLANKS = ITEMS.register("pink_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.PINK_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GRAY_STAINED_WOODEN_PLANKS = ITEMS.register("gray_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.GRAY_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_WOODEN_PLANKS = ITEMS.register("light_gray_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.LIGHT_GRAY_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CYAN_STAINED_WOODEN_PLANKS = ITEMS.register("cyan_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.CYAN_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> PURPLE_STAINED_WOODEN_PLANKS = ITEMS.register("purple_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.PURPLE_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BLUE_STAINED_WOODEN_PLANKS = ITEMS.register("blue_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.BLUE_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BROWN_STAINED_WOODEN_PLANKS = ITEMS.register("brown_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.BROWN_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GREEN_STAINED_WOODEN_PLANKS = ITEMS.register("green_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.GREEN_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> RED_STAINED_WOODEN_PLANKS = ITEMS.register("red_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.RED_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BLACK_STAINED_WOODEN_PLANKS = ITEMS.register("black_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.BLACK_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_LOG = ITEMS.register("white_stained_wooden_log", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_LOG.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> STRIPPED_WHITE_STAINED_WOODEN_LOG = ITEMS.register("stripped_white_stained_wooden_log", () -> new BlockItem(BlocksStainedPlanks.STRIPPED_WHITE_STAINED_WOODEN_LOG.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> STRIPPED_WHITE_STAINED_WOODEN_WOOD = ITEMS.register("stripped_white_stained_wooden_wood", () -> new BlockItem(BlocksStainedPlanks.STRIPPED_WHITE_STAINED_WOODEN_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_WOOD = ITEMS.register("white_stained_wooden_wood", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_LEAVES = ITEMS.register("white_stained_wooden_leaves", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_LEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_SLAB = ITEMS.register("white_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ORANGE_STAINED_WOODEN_SLAB = ITEMS.register("orange_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.ORANGE_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_STAINED_WOODEN_SLAB = ITEMS.register("magenta_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.MAGENTA_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_WOODEN_SLAB = ITEMS.register("light_blue_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.LIGHT_BLUE_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> YELLOW_STAINED_WOODEN_SLAB = ITEMS.register("yellow_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.YELLOW_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIME_STAINED_WOODEN_SLAB = ITEMS.register("lime_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.LIME_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> PINK_STAINED_WOODEN_SLAB = ITEMS.register("pink_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.PINK_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GRAY_STAINED_WOODEN_SLAB = ITEMS.register("gray_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.GRAY_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_WOODEN_SLAB = ITEMS.register("light_gray_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.LIGHT_GRAY_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CYAN_STAINED_WOODEN_SLAB = ITEMS.register("cyan_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.CYAN_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> PURPLE_STAINED_WOODEN_SLAB = ITEMS.register("purple_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.PURPLE_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BLUE_STAINED_WOODEN_SLAB = ITEMS.register("blue_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.BLUE_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BROWN_STAINED_WOODEN_SLAB = ITEMS.register("brown_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.BROWN_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GREEN_STAINED_WOODEN_SLAB = ITEMS.register("green_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.GREEN_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> RED_STAINED_WOODEN_SLAB = ITEMS.register("red_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.RED_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BLACK_STAINED_WOODEN_SLAB = ITEMS.register("black_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.BLACK_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_FENCE = ITEMS.register("white_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ORANGE_STAINED_WOODEN_FENCE = ITEMS.register("orange_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.ORANGE_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> MAGENTA_STAINED_WOODEN_FENCE = ITEMS.register("magenta_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.MAGENTA_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_WOODEN_FENCE = ITEMS.register("light_blue_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.LIGHT_BLUE_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> YELLOW_STAINED_WOODEN_FENCE = ITEMS.register("yellow_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.YELLOW_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LIME_STAINED_WOODEN_FENCE = ITEMS.register("lime_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.LIME_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> PINK_STAINED_WOODEN_FENCE = ITEMS.register("pink_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.PINK_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> GRAY_STAINED_WOODEN_FENCE = ITEMS.register("gray_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.GRAY_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_WOODEN_FENCE = ITEMS.register("light_gray_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.LIGHT_GRAY_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CYAN_STAINED_WOODEN_FENCE = ITEMS.register("cyan_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.CYAN_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> PURPLE_STAINED_WOODEN_FENCE = ITEMS.register("purple_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.PURPLE_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BLUE_STAINED_WOODEN_FENCE = ITEMS.register("blue_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.BLUE_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BROWN_STAINED_WOODEN_FENCE = ITEMS.register("brown_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.BROWN_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> GREEN_STAINED_WOODEN_FENCE = ITEMS.register("green_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.GREEN_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> RED_STAINED_WOODEN_FENCE = ITEMS.register("red_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.RED_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BLACK_STAINED_WOODEN_FENCE = ITEMS.register("black_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.BLACK_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_STAIRS = ITEMS.register("white_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ORANGE_STAINED_WOODEN_STAIRS = ITEMS.register("orange_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.ORANGE_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_STAINED_WOODEN_STAIRS = ITEMS.register("magenta_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.MAGENTA_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_WOODEN_STAIRS = ITEMS.register("light_blue_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.LIGHT_BLUE_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> YELLOW_STAINED_WOODEN_STAIRS = ITEMS.register("yellow_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.YELLOW_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIME_STAINED_WOODEN_STAIRS = ITEMS.register("lime_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.LIME_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> PINK_STAINED_WOODEN_STAIRS = ITEMS.register("pink_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.PINK_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GRAY_STAINED_WOODEN_STAIRS = ITEMS.register("gray_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.GRAY_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_WOODEN_STAIRS = ITEMS.register("light_gray_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.LIGHT_GRAY_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CYAN_STAINED_WOODEN_STAIRS = ITEMS.register("cyan_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.CYAN_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> PURPLE_STAINED_WOODEN_STAIRS = ITEMS.register("purple_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.PURPLE_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BLUE_STAINED_WOODEN_STAIRS = ITEMS.register("blue_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.BLUE_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BROWN_STAINED_WOODEN_STAIRS = ITEMS.register("brown_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.BROWN_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GREEN_STAINED_WOODEN_STAIRS = ITEMS.register("green_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.GREEN_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> RED_STAINED_WOODEN_STAIRS = ITEMS.register("red_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.RED_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BLACK_STAINED_WOODEN_STAIRS = ITEMS.register("black_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.BLACK_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_BUTTON = ITEMS.register("white_stained_wooden_button", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_BUTTON.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_PRESSURE_PLATE = ITEMS.register("white_stained_wooden_pressure_plate", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_PRESSURE_PLATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_DOOR = ITEMS.register("white_stained_wooden_door", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_DOOR.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_TRAPDOOR = ITEMS.register("white_stained_wooden_trapdoor", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_TRAPDOOR.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_FENCE_GATE = ITEMS.register("white_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> ORANGE_STAINED_WOODEN_FENCE_GATE = ITEMS.register("orange_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.ORANGE_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> MAGENTA_STAINED_WOODEN_FENCE_GATE = ITEMS.register("magenta_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.MAGENTA_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_WOODEN_FENCE_GATE = ITEMS.register("light_blue_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.LIGHT_BLUE_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> YELLOW_STAINED_WOODEN_FENCE_GATE = ITEMS.register("yellow_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.YELLOW_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> LIME_STAINED_WOODEN_FENCE_GATE = ITEMS.register("lime_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.LIME_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> PINK_STAINED_WOODEN_FENCE_GATE = ITEMS.register("pink_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.PINK_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> GRAY_STAINED_WOODEN_FENCE_GATE = ITEMS.register("gray_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.GRAY_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_WOODEN_FENCE_GATE = ITEMS.register("light_gray_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.LIGHT_GRAY_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> CYAN_STAINED_WOODEN_FENCE_GATE = ITEMS.register("cyan_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.CYAN_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> PURPLE_STAINED_WOODEN_FENCE_GATE = ITEMS.register("purple_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.PURPLE_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> BLUE_STAINED_WOODEN_FENCE_GATE = ITEMS.register("blue_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.BLUE_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> BROWN_STAINED_WOODEN_FENCE_GATE = ITEMS.register("brown_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.BROWN_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> GREEN_STAINED_WOODEN_FENCE_GATE = ITEMS.register("green_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.GREEN_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> RED_STAINED_WOODEN_FENCE_GATE = ITEMS.register("red_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.RED_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final RegistryObject<Item> BLACK_STAINED_WOODEN_FENCE_GATE = ITEMS.register("black_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.BLACK_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_BOAT = ITEMS.register("white_stained_wooden_boat", () -> new BoatItem(Boat.Type.BIRCH, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_TRANSPORTATION)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_SIGN = ITEMS.register("white_stained_wooden_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS), BlocksStainedPlanks.WHITE_STAINED_WOODEN_SIGN.get(), BlocksStainedPlanks.WHITE_STAINED_WOODEN_WALL_SIGN.get()));



    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}