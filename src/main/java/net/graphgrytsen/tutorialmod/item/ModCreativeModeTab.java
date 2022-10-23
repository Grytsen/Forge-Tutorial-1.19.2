package net.graphgrytsen.tutorialmod.item;

import net.graphgrytsen.tutorialmod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
    public static final CreativeModeTab ARANARIUM_TAB = new CreativeModeTab("aranariumtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.ARANARIUM_ORE.get());
        }
    };
}
