package net.henderson.hendersonhats.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.henderson.hendersonhats.HendersonsHats;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup HATS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HendersonsHats.MOD_ID, "top_hat"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.top_hat")).icon(() -> new ItemStack(ModItems.TOP_HAT)).entries((displayContext, entries) -> {
                entries.add(ModItems.BOWLER_HAT);
                entries.add(ModItems.COWBOY_HAT);
                entries.add(ModItems.TOP_HAT);



            }).build());

    public static void registerItemGroups() {
        HendersonsHats.LOGGER.info("Registering Item Groups for " + HendersonsHats.MOD_ID);
    }
}
