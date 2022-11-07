package com.uncletrashtalk.qloverextra.registry;

import com.uncletrashtalk.qloverextra.QloverExtra;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Items
    public static final Item GREEN_QLOVER = new Item(
            new Item.Settings()
                    .group(ItemGroup.MATERIALS)
                    .rarity(Rarity.COMMON)
                    .maxCount(64));
    public static final Item GOLDEN_QLOVER = new Item(
            new Item.Settings()
                    .group(ItemGroup.MATERIALS)
                    .rarity(Rarity.RARE)
                    .maxCount(64));
    public static final Item BLACK_QLOVER = new Item(
            new Item.Settings()
                    .group(ItemGroup.MATERIALS)
                    .rarity(Rarity.EPIC)
                    .maxCount(64));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "green_qlover"), GREEN_QLOVER);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "golden_qlover"), GOLDEN_QLOVER);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "black_qlover"), BLACK_QLOVER);
    }
}
