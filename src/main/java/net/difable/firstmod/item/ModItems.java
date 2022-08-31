package net.difable.firstmod.item;

import net.difable.firstmod.FirstMod;
import net.difable.firstmod.item.custom.SealItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> FLUTE = ITEMS.register("flute",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> PENIS = ITEMS.register("penis",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> SEAL = ITEMS.register("seal",
            () -> new SealItem(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
