package com.endykaishi.ae2infinitycells.item;

import com.endykaishi.ae2infinitycells.AE2InfinityCells;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AE2InfinityCells.MODID);

    public static final Supplier<CreativeModeTab> AE2INFINITY_CELLS_TAB =
            CREATIVE_MODE_TAB.register("ae2infinity_cells_tab", () -> CreativeModeTab.builder().icon(() ->
                            new ItemStack(ModItems.ITEMCELL.get())).
                    title(Component.translatable("creativetab.ae2_infinity_cells.cells")).
                    displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ITEMCELL);
                        output.accept(ModItems.FLUIDCELL);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
