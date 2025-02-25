package net.zabadooj.neofmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.zabadooj.neofmod.NeofMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NeofMod.MOD_ID);

    public static final DeferredItem<Item> CATC = ITEMS.register("catc",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    };
}
