package com.candycute8.items;

import com.candycute8.foodplus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ChocolateCream extends Item {
    public ChocolateCream() {
        super(new Item.Properties()
                .group(foodplus.TAB)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(1.2f)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
