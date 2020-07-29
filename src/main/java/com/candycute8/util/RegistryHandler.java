package com.candycute8.util;

import com.candycute8.foodplus;
import com.candycute8.items.ChocolateCream;
import com.candycute8.items.FoodBase;
import com.candycute8.items.VanillaCream;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, foodplus.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Ice Cream Pack
    public static final RegistryObject<Item> CONE = ITEMS.register("cone", FoodBase::new);
    public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate", FoodBase::new);
    public static final RegistryObject<Item> VANILLA = ITEMS.register("vanilla", FoodBase::new);
    public static final RegistryObject<VanillaCream> VANILLA_CREAM = ITEMS.register("vanilla_cream", VanillaCream::new);
    public static final RegistryObject<ChocolateCream> CHOCOLATE_CREAM = ITEMS.register("chocolate_cream", ChocolateCream::new);

    //Juice Pack
    public static final RegistryObject<Item> GLASS = ITEMS.register("glass", FoodBase::new);
}
