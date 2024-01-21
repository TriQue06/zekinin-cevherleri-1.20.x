package net.trique.zekinincevherleri.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trique.zekinincevherleri.ZekininCevherleri;

public class ZekininItems {

    public static final Item CHRYSOCOLLA = registerItem("chrysocolla",
            new Item(new FabricItemSettings()));

    public static final Item CHRYSOCOLLA_PICKAXE = registerItem("chrysocolla_pickaxe",
            new PickaxeItem(ZekininToolMaterials.CHRYSOCOLLA, 1, -2.8f,(new FabricItemSettings())));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ZekininCevherleri.MOD_ID, name), item);
    }

    public static void registerZekininItems() {
        ZekininCevherleri.LOGGER.info("Registering Zekinin Cevherleri Items for " + ZekininCevherleri.MOD_ID);
    }
}