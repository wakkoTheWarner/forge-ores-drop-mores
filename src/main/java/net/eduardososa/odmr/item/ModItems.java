package net.eduardososa.odmr.item;

import net.eduardososa.odmr.OdmrMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OdmrMod.MOD_ID);

    public static final RegistryObject<Item> ANCIENT_DEBRIS_SHARD = ITEMS.register("ancient_debris_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
