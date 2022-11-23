package com.uncletrashtalk.qloverextra.registry;

import com.uncletrashtalk.qloverextra.QloverExtra;
import com.uncletrashtalk.qloverextra.blocks.QuestBoardBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final QuestBoardBlock QUEST_BOARD_BLOCK = new QuestBoardBlock();

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(QloverExtra.MOD_ID, "quest_board_block"), QUEST_BOARD_BLOCK);
    }
}
