package com.candycute8.init;

import com.candycute8.foodplus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, foodplus.MOD_ID);

    //Items
    public static final RegistryObject<Item> CONE = ITEMS.register("cone", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> VANILLA = ITEMS.register("vanilla", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> CHOCOLATE_CREAM = ITEMS.register("chocolate_cream", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> VANILLA_CREAM = ITEMS.register("vanilla_cream", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
}
