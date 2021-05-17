package io.github.fallOut015.stained_planks.item;

import io.github.fallOut015.stained_planks.MainStainedPlanks;
import io.github.fallOut015.stained_planks.block.BlocksStainedPlanks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsStainedPlanks {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MainStainedPlanks.MODID);



    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_PLANKS = ITEMS.register("white_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ORANGE_STAINED_WOODEN_PLANKS = ITEMS.register("orange_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.ORANGE_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_STAINED_WOODEN_PLANKS = ITEMS.register("magenta_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.MAGENTA_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_WOODEN_PLANKS = ITEMS.register("light_blue_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.LIGHT_BLUE_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> YELLOW_STAINED_WOODEN_PLANKS = ITEMS.register("yellow_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.YELLOW_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIME_STAINED_WOODEN_PLANKS = ITEMS.register("lime_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.LIME_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> PINK_STAINED_WOODEN_PLANKS = ITEMS.register("pink_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.PINK_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GRAY_STAINED_WOODEN_PLANKS = ITEMS.register("gray_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.GRAY_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_WOODEN_PLANKS = ITEMS.register("light_gray_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.LIGHT_GRAY_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CYAN_STAINED_WOODEN_PLANKS = ITEMS.register("cyan_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.CYAN_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> PURPLE_STAINED_WOODEN_PLANKS = ITEMS.register("purple_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.PURPLE_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BLUE_STAINED_WOODEN_PLANKS = ITEMS.register("blue_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.BLUE_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BROWN_STAINED_WOODEN_PLANKS = ITEMS.register("brown_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.BROWN_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GREEN_STAINED_WOODEN_PLANKS = ITEMS.register("green_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.GREEN_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> RED_STAINED_WOODEN_PLANKS = ITEMS.register("red_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.RED_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BLACK_STAINED_WOODEN_PLANKS = ITEMS.register("black_stained_wooden_planks", () -> new BlockItem(BlocksStainedPlanks.BLACK_STAINED_WOODEN_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_SLAB = ITEMS.register("white_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ORANGE_STAINED_WOODEN_SLAB = ITEMS.register("orange_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.ORANGE_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_STAINED_WOODEN_SLAB = ITEMS.register("magenta_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.MAGENTA_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_WOODEN_SLAB = ITEMS.register("light_blue_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.LIGHT_BLUE_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> YELLOW_STAINED_WOODEN_SLAB = ITEMS.register("yellow_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.YELLOW_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIME_STAINED_WOODEN_SLAB = ITEMS.register("lime_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.LIME_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> PINK_STAINED_WOODEN_SLAB = ITEMS.register("pink_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.PINK_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GRAY_STAINED_WOODEN_SLAB = ITEMS.register("gray_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.GRAY_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_WOODEN_SLAB = ITEMS.register("light_gray_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.LIGHT_GRAY_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CYAN_STAINED_WOODEN_SLAB = ITEMS.register("cyan_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.CYAN_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> PURPLE_STAINED_WOODEN_SLAB = ITEMS.register("purple_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.PURPLE_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BLUE_STAINED_WOODEN_SLAB = ITEMS.register("blue_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.BLUE_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BROWN_STAINED_WOODEN_SLAB = ITEMS.register("brown_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.BROWN_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GREEN_STAINED_WOODEN_SLAB = ITEMS.register("green_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.GREEN_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> RED_STAINED_WOODEN_SLAB = ITEMS.register("red_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.RED_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BLACK_STAINED_WOODEN_SLAB = ITEMS.register("black_stained_wooden_slab", () -> new BlockItem(BlocksStainedPlanks.BLACK_STAINED_WOODEN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_STAIRS = ITEMS.register("white_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ORANGE_STAINED_WOODEN_STAIRS = ITEMS.register("orange_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.ORANGE_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_STAINED_WOODEN_STAIRS = ITEMS.register("magenta_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.MAGENTA_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_WOODEN_STAIRS = ITEMS.register("light_blue_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.LIGHT_BLUE_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> YELLOW_STAINED_WOODEN_STAIRS = ITEMS.register("yellow_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.YELLOW_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIME_STAINED_WOODEN_STAIRS = ITEMS.register("lime_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.LIME_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> PINK_STAINED_WOODEN_STAIRS = ITEMS.register("pink_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.PINK_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GRAY_STAINED_WOODEN_STAIRS = ITEMS.register("gray_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.GRAY_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_WOODEN_STAIRS = ITEMS.register("light_gray_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.LIGHT_GRAY_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CYAN_STAINED_WOODEN_STAIRS = ITEMS.register("cyan_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.CYAN_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> PURPLE_STAINED_WOODEN_STAIRS = ITEMS.register("purple_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.PURPLE_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BLUE_STAINED_WOODEN_STAIRS = ITEMS.register("blue_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.BLUE_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BROWN_STAINED_WOODEN_STAIRS = ITEMS.register("brown_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.BROWN_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GREEN_STAINED_WOODEN_STAIRS = ITEMS.register("green_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.GREEN_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> RED_STAINED_WOODEN_STAIRS = ITEMS.register("red_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.RED_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BLACK_STAINED_WOODEN_STAIRS = ITEMS.register("black_stained_wooden_stairs", () -> new BlockItem(BlocksStainedPlanks.BLACK_STAINED_WOODEN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_FENCE = ITEMS.register("white_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ORANGE_STAINED_WOODEN_FENCE = ITEMS.register("orange_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.ORANGE_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> MAGENTA_STAINED_WOODEN_FENCE = ITEMS.register("magenta_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.MAGENTA_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_WOODEN_FENCE = ITEMS.register("light_blue_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.LIGHT_BLUE_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> YELLOW_STAINED_WOODEN_FENCE = ITEMS.register("yellow_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.YELLOW_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LIME_STAINED_WOODEN_FENCE = ITEMS.register("lime_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.LIME_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> PINK_STAINED_WOODEN_FENCE = ITEMS.register("pink_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.PINK_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> GRAY_STAINED_WOODEN_FENCE = ITEMS.register("gray_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.GRAY_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_WOODEN_FENCE = ITEMS.register("light_gray_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.LIGHT_GRAY_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CYAN_STAINED_WOODEN_FENCE = ITEMS.register("cyan_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.CYAN_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> PURPLE_STAINED_WOODEN_FENCE = ITEMS.register("purple_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.PURPLE_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BLUE_STAINED_WOODEN_FENCE = ITEMS.register("blue_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.BLUE_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BROWN_STAINED_WOODEN_FENCE = ITEMS.register("brown_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.BROWN_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> GREEN_STAINED_WOODEN_FENCE = ITEMS.register("green_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.GREEN_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> RED_STAINED_WOODEN_FENCE = ITEMS.register("red_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.RED_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BLACK_STAINED_WOODEN_FENCE = ITEMS.register("black_stained_wooden_fence", () -> new BlockItem(BlocksStainedPlanks.BLACK_STAINED_WOODEN_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    public static final RegistryObject<Item> WHITE_STAINED_WOODEN_FENCE_GATE = ITEMS.register("white_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.WHITE_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> ORANGE_STAINED_WOODEN_FENCE_GATE = ITEMS.register("orange_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.ORANGE_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> MAGENTA_STAINED_WOODEN_FENCE_GATE = ITEMS.register("magenta_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.MAGENTA_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_WOODEN_FENCE_GATE = ITEMS.register("light_blue_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.LIGHT_BLUE_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> YELLOW_STAINED_WOODEN_FENCE_GATE = ITEMS.register("yellow_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.YELLOW_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> LIME_STAINED_WOODEN_FENCE_GATE = ITEMS.register("lime_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.LIME_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> PINK_STAINED_WOODEN_FENCE_GATE = ITEMS.register("pink_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.PINK_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> GRAY_STAINED_WOODEN_FENCE_GATE = ITEMS.register("gray_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.GRAY_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_WOODEN_FENCE_GATE = ITEMS.register("light_gray_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.LIGHT_GRAY_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> CYAN_STAINED_WOODEN_FENCE_GATE = ITEMS.register("cyan_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.CYAN_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> PURPLE_STAINED_WOODEN_FENCE_GATE = ITEMS.register("purple_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.PURPLE_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> BLUE_STAINED_WOODEN_FENCE_GATE = ITEMS.register("blue_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.BLUE_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> BROWN_STAINED_WOODEN_FENCE_GATE = ITEMS.register("brown_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.BROWN_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> GREEN_STAINED_WOODEN_FENCE_GATE = ITEMS.register("green_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.GREEN_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> RED_STAINED_WOODEN_FENCE_GATE = ITEMS.register("red_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.RED_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> BLACK_STAINED_WOODEN_FENCE_GATE = ITEMS.register("black_stained_wooden_fence_gate", () -> new BlockItem(BlocksStainedPlanks.BLACK_STAINED_WOODEN_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));



    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}