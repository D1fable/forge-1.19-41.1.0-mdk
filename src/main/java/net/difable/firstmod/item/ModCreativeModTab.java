package net.difable.firstmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("SecretTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FLUTE.get());
        }
    };
}