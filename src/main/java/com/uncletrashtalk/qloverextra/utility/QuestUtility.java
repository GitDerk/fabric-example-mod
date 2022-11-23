package com.uncletrashtalk.qloverextra.utility;

import com.uncletrashtalk.qloverextra.items.NormalQuestItem;
import com.uncletrashtalk.qloverextra.registry.QuestRegistry;

import java.util.Random;

public class QuestUtility {
    public static NormalQuestItem GetRandomQuestItem() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        if (randomNumber <= 55) {
            return GetRandomNormalQuest();
        } else if (randomNumber <= 80) {
            return GetRandomUncommonQuest();
        } else if (randomNumber <= 99) {
            return GetRandomRareQuest();
        } else {
            return GetRandomEpicQuest();
        }
    }

    private static NormalQuestItem GetRandomNormalQuest() {
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;

        return switch (randomNumber) {
            case 2 -> QuestRegistry.DARK_OAK_QUEST;
            case 3 -> QuestRegistry.JUNGLE_QUEST;
            case 4 -> QuestRegistry.ACACIA_QUEST;
            case 5 -> QuestRegistry.BIRCH_QUEST;
            case 6 -> QuestRegistry.IRON_QUEST;
            case 7 -> QuestRegistry.GOLD_QUEST;
            case 8 -> QuestRegistry.COAL_QUEST;
            case 9 -> QuestRegistry.COPPER_QUEST;
            case 10 -> QuestRegistry.LAPIS_QUEST;
            case 11 -> QuestRegistry.BREAD_QUEST;
            case 12 -> QuestRegistry.WOOL_QUEST;
            case 13 -> QuestRegistry.SUGAR_QUEST;
            case 14 -> QuestRegistry.BEEF_QUEST;
            case 15 -> QuestRegistry.POTATO_QUEST;
            case 16 -> QuestRegistry.GLASS_QUEST;
            case 17 -> QuestRegistry.CLAY_QUEST;
            case 18 -> QuestRegistry.KELP_QUEST;
            case 19 -> QuestRegistry.COD_QUEST;
            case 20 -> QuestRegistry.APPLE_QUEST;
            default -> QuestRegistry.OAK_QUEST;
        };
    }


    private static NormalQuestItem GetRandomUncommonQuest() {
        Random random = new Random();
        int randomNumber = random.nextInt(12) + 1;
        return switch (randomNumber) {
            case 2 -> QuestRegistry.CRIMSON_QUEST;
            case 3 -> QuestRegistry.WARPED_QUEST;
            case 4 -> QuestRegistry.JUNGLE_SAP_QUEST;
            case 5 -> QuestRegistry.AMETHYST_QUEST;
            case 6 -> QuestRegistry.QUARTZ_QUEST;
            case 7 -> QuestRegistry.EMERALD_QUEST;
            case 8 -> QuestRegistry.MELON_QUEST;
            case 9 -> QuestRegistry.CAKE_QUEST;
            case 10 -> QuestRegistry.HONEY_QUEST;
            case 11 -> QuestRegistry.GLOWSTONE_QUEST;
            case 12 -> QuestRegistry.BLAZE_ROD_QUEST;
            default -> QuestRegistry.GLOW_INK_QUEST;
        };
    }

    private static NormalQuestItem GetRandomRareQuest() {
        Random random = new Random();
        int randomNumber = random.nextInt(8) + 1;

        return switch (randomNumber) {
            case 2 -> QuestRegistry.STRIPPED_WARPED_QUEST;
            case 3 -> QuestRegistry.DIAMOND_QUEST;
            case 4 -> QuestRegistry.GOLD_BLOCK_QUEST;
            case 5 -> QuestRegistry.GOLDEN_APPLE_QUEST;
            case 6 -> QuestRegistry.PUFFER_QUEST;
            case 7 -> QuestRegistry.ENDER_PEARL_QUEST;
            case 8 -> QuestRegistry.SLIME_BLOCK_QUEST;
            default -> QuestRegistry.STRIPPED_MANGROVE_QUEST;
        };
    }

    private static NormalQuestItem GetRandomEpicQuest() {
        Random random = new Random();
        int randomNumber = random.nextInt(24) + 1;
        return switch (randomNumber) {
            case 2 -> QuestRegistry.CIMKEN_QUEST;
            case 3 -> QuestRegistry.WOLFY_QUEST;
            case 4 -> QuestRegistry.ROSE_QUEST;
            case 5 -> QuestRegistry.THEMBO_QUEST;
            case 6 -> QuestRegistry.KATTO_QUEST;
            case 7 -> QuestRegistry.KODIAK_QUEST;
            case 8 -> QuestRegistry.INOOOH_QUEST;
            case 9 -> QuestRegistry.MOTTIA_QUEST;
            case 10 -> QuestRegistry.BRADI_QUEST;
            case 11 -> QuestRegistry.ASTORIA_QUEST;
            case 12 -> QuestRegistry.TRASH_QUEST;
            case 13 -> QuestRegistry.ADOVEA_QUEST;
            case 14 -> QuestRegistry.QROW_QUEST;
            case 15 -> QuestRegistry.MARSHY_QUEST;
            case 16 -> QuestRegistry.MELKY_QUEST;
            case 17 -> QuestRegistry.QUIMZ_QUEST;
            case 18 -> QuestRegistry.SARAH_QUEST;
            case 19 -> QuestRegistry.WUPJE_QUEST;
            case 20 -> QuestRegistry.OPIE_QUEST;
            case 21 -> QuestRegistry.NEKO_QUEST;
            case 22 -> QuestRegistry.BARNESLY_QUEST;
            case 23 -> QuestRegistry.CREEPY_QUEST;
            case 24 -> QuestRegistry.MAE_QUEST;
            default -> QuestRegistry.SAZEA_QUEST;
        };
    }

}
