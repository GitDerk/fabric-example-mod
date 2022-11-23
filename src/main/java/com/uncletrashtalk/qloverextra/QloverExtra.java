package com.uncletrashtalk.qloverextra;

import com.uncletrashtalk.qloverextra.registry.ModBlocks;
import com.uncletrashtalk.qloverextra.registry.ModItems;
import com.uncletrashtalk.qloverextra.registry.QuestRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class QloverExtra implements ModInitializer{
    public static final String MOD_ID = "qloverextra";

    public static final ItemGroup QUEST_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "quest_group_name"))
            .icon(() -> new ItemStack(QuestRegistry.OAK_QUEST))
            .build();

    public static final ItemGroup MATERIAL_GROUP = FabricItemGroupBuilder.create(
                    new Identifier(MOD_ID, "material_group_name"))
            .icon(() -> new ItemStack(ModItems.GREEN_QLOVER))
            .build();

    public static final ItemGroup SPECIAL_GROUP = FabricItemGroupBuilder.create(
                    new Identifier(MOD_ID, "special_group_name"))
            .icon(() -> new ItemStack(Items.COOKIE))
            .build();

    public static final ItemGroup POST_GROUP = FabricItemGroupBuilder.create(
                    new Identifier(MOD_ID, "post_group_name"))
            .icon(() -> new ItemStack(Items.COOKIE))
            .build();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();

        QuestRegistry.RegisterQuests();
    }
}
