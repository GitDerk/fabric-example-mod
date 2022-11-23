package com.uncletrashtalk.qloverextra.registry;

import com.uncletrashtalk.qloverextra.QloverExtra;
import com.uncletrashtalk.qloverextra.items.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final GreenQloverItem GREEN_QLOVER = new GreenQloverItem();
    public static final GoldenQloverItem GOLDEN_QLOVER = new GoldenQloverItem();
    public static final BlackQloverItem BLACK_QLOVER = new BlackQloverItem();

    public static final QloverPaper QLOVER_PAPER = new QloverPaper();

    // Blocks
    public static final QuestBoardItem QUEST_BOARD_ITEM = new QuestBoardItem(
            ModBlocks.QUEST_BOARD_BLOCK,
            new FabricItemSettings()
                    .group(QloverExtra.QUEST_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "green_qlover"), GREEN_QLOVER);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "golden_qlover"), GOLDEN_QLOVER);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "black_qlover"), BLACK_QLOVER);

        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest_board_block"), QUEST_BOARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "green_qlover_paper"), QLOVER_PAPER);
    }
}
