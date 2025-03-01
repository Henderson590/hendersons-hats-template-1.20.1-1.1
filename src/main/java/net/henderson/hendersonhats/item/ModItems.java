package net.henderson.hendersonhats.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.henderson.hendersonhats.HendersonsHats;
import net.henderson.hendersonhats.item.custom.TopHatArmorItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item TOP_HAT = registerItem("top_hat",
            new TopHatArmorItem(ModArmorMaterials.TOP_HAT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BOWLER_HAT = registerItem("bowler_hat",
            new TopHatArmorItem(ModArmorMaterials.BOWLER_HAT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COWBOY_HAT = registerItem("cowboy_hat",
            new TopHatArmorItem(ModArmorMaterials.COWBOY_HAT, ArmorItem.Type.HELMET, new FabricItemSettings()));

    private static void addItemsToSearchItemGroup(FabricItemGroupEntries entries) {
        entries.add(COWBOY_HAT);
        entries.add(BOWLER_HAT);
        entries.add(TOP_HAT);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HendersonsHats.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HendersonsHats.LOGGER.info("Registering Mod Items for " + HendersonsHats.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(ModItems::addItemsToSearchItemGroup);
    }
}
