package com.uncletrashtalk.qloverextra.registry;

import com.uncletrashtalk.qloverextra.QloverExtra;
import com.uncletrashtalk.qloverextra.items.NormalQuestItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class QuestRegistry {
    // region Logging
    public static final NormalQuestItem OAK_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.OAK_LOG,64),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem DARK_OAK_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.DARK_OAK_LOG,64),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem JUNGLE_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.JUNGLE_LOG,64),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem ACACIA_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.ACACIA_LOG,64),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem BIRCH_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.BIRCH_LOG,64),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem CRIMSON_QUEST = new NormalQuestItem(
            Rarity.UNCOMMON,
            new ItemStack(Items.CRIMSON_STEM,32),
            new ItemStack(ModItems.GOLDEN_QLOVER, 1));

    public static final NormalQuestItem WARPED_QUEST = new NormalQuestItem(
            Rarity.UNCOMMON,
            new ItemStack(Items.WARPED_STEM,32),
            new ItemStack(ModItems.GOLDEN_QLOVER, 1));

    public static final NormalQuestItem JUNGLE_SAP_QUEST = new NormalQuestItem(
            Rarity.UNCOMMON,
            new ItemStack(Items.JUNGLE_SAPLING,32),
            new ItemStack(ModItems.GOLDEN_QLOVER, 1));

    public static final NormalQuestItem STRIPPED_MANGROVE_QUEST = new NormalQuestItem(
            Rarity.RARE,
            new ItemStack(Items.STRIPPED_MANGROVE_LOG,64),
            new ItemStack(ModItems.GOLDEN_QLOVER, 3));

    public static final NormalQuestItem STRIPPED_WARPED_QUEST = new NormalQuestItem(
            Rarity.RARE,
            new ItemStack(Items.STRIPPED_WARPED_STEM,32),
            new ItemStack(ModItems.GOLDEN_QLOVER, 3));
    // endregion

    //region Mining Quests
    public static final NormalQuestItem IRON_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.IRON_INGOT, 16),
            new ItemStack(ModItems.GREEN_QLOVER, 1));
    public static final NormalQuestItem GOLD_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.GOLD_INGOT,16),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem COAL_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.COAL, 16),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem COPPER_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.COPPER_INGOT,16),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem LAPIS_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.LAPIS_LAZULI,32),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem AMETHYST_QUEST = new NormalQuestItem(
            Rarity.UNCOMMON,
            new ItemStack(Items.AMETHYST_SHARD,8),
            new ItemStack(ModItems.GOLDEN_QLOVER, 1));

    public static final NormalQuestItem QUARTZ_QUEST = new NormalQuestItem(
            Rarity.UNCOMMON,
            new ItemStack(Items.QUARTZ,16),
            new ItemStack(ModItems.GOLDEN_QLOVER, 1));

    public static final NormalQuestItem EMERALD_QUEST = new NormalQuestItem(
            Rarity.UNCOMMON,
            new ItemStack(Items.EMERALD,8),
            new ItemStack(ModItems.GOLDEN_QLOVER, 1));

    public static final NormalQuestItem DIAMOND_QUEST = new NormalQuestItem(
            Rarity.RARE,
            new ItemStack(Items.DIAMOND,6),
            new ItemStack(ModItems.GOLDEN_QLOVER, 3));

    public static final NormalQuestItem GOLD_BLOCK_QUEST = new NormalQuestItem(
            Rarity.RARE,
            new ItemStack(Items.GOLD_BLOCK,5),
            new ItemStack(ModItems.GOLDEN_QLOVER, 3));
    // endregion

    //region Farmer Quests
    public static final NormalQuestItem BREAD_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.BREAD,32),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem WOOL_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.WHITE_WOOL,6),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem SUGAR_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.SUGAR,32),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem BEEF_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.COOKED_BEEF,16),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem POTATO_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.POTATO,32),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem MELON_QUEST = new NormalQuestItem(
            Rarity.UNCOMMON,
            new ItemStack(Items.MELON_SLICE,32),
            new ItemStack(ModItems.GOLDEN_QLOVER, 1));

    public static final NormalQuestItem CAKE_QUEST = new NormalQuestItem(
            Rarity.UNCOMMON,
            new ItemStack(Items.CAKE,8),
            new ItemStack(ModItems.GOLDEN_QLOVER, 1));

    public static final NormalQuestItem HONEY_QUEST = new NormalQuestItem(
            Rarity.UNCOMMON,
            new ItemStack(Items.HONEYCOMB,6),
            new ItemStack(ModItems.GOLDEN_QLOVER, 1));

    public static final NormalQuestItem GOLDEN_APPLE_QUEST = new NormalQuestItem(
            Rarity.RARE,
            new ItemStack(Items.GOLDEN_APPLE,4),
            new ItemStack(ModItems.GOLDEN_QLOVER, 3));

    public static final NormalQuestItem PUFFER_QUEST = new NormalQuestItem(
            Rarity.RARE,
            new ItemStack(Items.PUFFERFISH_BUCKET,1),
            new ItemStack(ModItems.GOLDEN_QLOVER, 3));
    //endregion

    //region COLLECTOR Quests
    public static final NormalQuestItem GLASS_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.GLASS,32),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem CLAY_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.CLAY,32),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem KELP_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.KELP,64),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem COD_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.COD,16),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem APPLE_QUEST = new NormalQuestItem(
            Rarity.COMMON,
            new ItemStack(Items.APPLE,16),
            new ItemStack(ModItems.GREEN_QLOVER, 1));

    public static final NormalQuestItem GLOWSTONE_QUEST = new NormalQuestItem(
            Rarity.UNCOMMON,
            new ItemStack(Items.GLOWSTONE_DUST,16),
            new ItemStack(ModItems.GOLDEN_QLOVER, 1));

    public static final NormalQuestItem BLAZE_ROD_QUEST = new NormalQuestItem(
            Rarity.UNCOMMON,
            new ItemStack(Items.BLAZE_ROD,16),
            new ItemStack(ModItems.GOLDEN_QLOVER, 1));

    public static final NormalQuestItem GLOW_INK_QUEST = new NormalQuestItem(
            Rarity.UNCOMMON,
            new ItemStack(Items.GLOW_INK_SAC,16),
            new ItemStack(ModItems.GOLDEN_QLOVER, 1));

    public static final NormalQuestItem ENDER_PEARL_QUEST = new NormalQuestItem(
            Rarity.RARE,
            new ItemStack(Items.ENDER_PEARL,16),
            new ItemStack(ModItems.GOLDEN_QLOVER, 3));

    public static final NormalQuestItem SLIME_BLOCK_QUEST = new NormalQuestItem(
            Rarity.RARE,
            new ItemStack(Items.SLIME_BLOCK,1),
            new ItemStack(ModItems.GOLDEN_QLOVER, 3));
    //endregion

    //region Epic Quests
    public static final NormalQuestItem SAZEA_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.COOKED_PORKCHOP,16),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem CIMKEN_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.EGG,16),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem WOLFY_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.FISHING_ROD,1),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem ROSE_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.ROSE_BUSH,8),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem THEMBO_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.STONE,32),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem KATTO_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.RED_MUSHROOM,16),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem KODIAK_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.GUNPOWDER,5),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem INOOOH_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.COBBLED_DEEPSLATE,64),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem MOTTIA_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.OBSIDIAN,8),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem BRADI_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.WHITE_BED,1),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem ASTORIA_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.GLASS_BOTTLE,32),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem TRASH_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.GOLDEN_SHOVEL,1),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem ADOVEA_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.INK_SAC,8),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem QROW_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.REDSTONE_BLOCK,1),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem MARSHY_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.IRON_BLOCK,1),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem MELKY_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.MILK_BUCKET,1),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem QUIMZ_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.EMERALD,6),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem SARAH_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.PURPLE_DYE,4),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem WUPJE_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.GOLDEN_APPLE,2),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem OPIE_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.BLACK_WOOL,4),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem NEKO_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.LAVA_BUCKET,1),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem BARNESLY_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.WATER_BUCKET,1),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem CREEPY_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.CLOCK,1),
            new ItemStack(ModItems.BLACK_QLOVER, 1));

    public static final NormalQuestItem MAE_QUEST = new NormalQuestItem(
            Rarity.EPIC,
            new ItemStack(Items.GLOW_INK_SAC,4),
            new ItemStack(ModItems.BLACK_QLOVER, 1));
    //endregion
    public static void RegisterQuests () {
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_oak"), OAK_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_dark_oak"), DARK_OAK_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_jungle"), JUNGLE_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_acacia"), ACACIA_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_birch"), BIRCH_QUEST);

        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_iron"), IRON_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_gold"), GOLD_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_coal"), COAL_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_copper"), COPPER_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_lapis"), LAPIS_QUEST);

        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_bread"), BREAD_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_wool"), WOOL_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_sugar"), SUGAR_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_beef"), BEEF_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_potato"), POTATO_QUEST);

        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_glass"), GLASS_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_clay"), CLAY_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_kelp"), KELP_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_cod"), COD_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_apple"), APPLE_QUEST);

        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_crimson"), CRIMSON_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_warped"), WARPED_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_jungle_sap"), JUNGLE_SAP_QUEST);

        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_amethyst"), AMETHYST_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_quartz"), QUARTZ_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_emerald"), EMERALD_QUEST);

        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_melon"), MELON_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_cake"), CAKE_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_honey"), HONEY_QUEST);

        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_glowstone"), GLOWSTONE_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_blaze_rod"), BLAZE_ROD_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_glow_ink"), GLOW_INK_QUEST);

        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_stripped_mangrove"), STRIPPED_MANGROVE_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_stripped_warped"), STRIPPED_WARPED_QUEST);

        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_diamond"), DIAMOND_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_gold_block"), GOLD_BLOCK_QUEST);

        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_golden_apple"), GOLDEN_APPLE_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_puffer"), PUFFER_QUEST);

        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_ender_pearl"), ENDER_PEARL_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_slime_block"), SLIME_BLOCK_QUEST);

        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_sazae"), SAZEA_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_cimken"), CIMKEN_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_wolfy"), WOLFY_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_rose"), ROSE_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_thembo"), THEMBO_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_katto"), KATTO_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_kodiak"), KODIAK_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_inoooh"), INOOOH_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_mottia"), MOTTIA_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_bradi"), BRADI_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_astoria"), ASTORIA_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_trash"), TRASH_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_adovea"), ADOVEA_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_qrow"), QROW_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_marshy"), MARSHY_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_melky"), MELKY_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_quimz"), QUIMZ_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_sarah"), SARAH_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_wupje"), WUPJE_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_opie"), OPIE_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_neko"), NEKO_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_barnesly"), BARNESLY_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_creepy"), CREEPY_QUEST);
        Registry.register(Registry.ITEM, new Identifier(QloverExtra.MOD_ID, "quest/normal_quest_mae"), MAE_QUEST);

    }
}
