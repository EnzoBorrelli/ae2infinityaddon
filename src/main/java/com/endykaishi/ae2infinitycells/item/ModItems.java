package com.endykaishi.ae2infinitycells.item;

import com.endykaishi.ae2infinitycells.AE2InfinityCells;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AE2InfinityCells.MODID);

    public static final DeferredItem<Item> ITEMCELL = ITEMS.register("empty_infinity_item_cell",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLUIDCELL = ITEMS.register("empty_infinity_fluid_cell",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
