package com.uncletrashtalk.qloverextra.items;

import com.uncletrashtalk.qloverextra.QloverExtra;
import com.uncletrashtalk.qloverextra.registry.ModBlocks;
import com.uncletrashtalk.qloverextra.registry.ModItems;
import com.uncletrashtalk.qloverextra.registry.QuestRegistry;
import com.uncletrashtalk.qloverextra.utility.QuestUtility;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.Random;

public class QloverPaper extends Item {
    public QloverPaper() {
        super(new FabricItemSettings()
                .group(QloverExtra.QUEST_GROUP)
                .rarity(Rarity.COMMON)
                .maxCount(16));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if (!world.isClient()) {
            Block block = world.getBlockState(context.getBlockPos()).getBlock();
            PlayerEntity player = context.getPlayer();
            PlayerInventory inv = player.getInventory();

            if (inv == null) {
                return ActionResult.FAIL;
            }

            if (block.equals(ModBlocks.QUEST_BOARD_BLOCK)) {
                player.playSound(SoundEvents.BLOCK_NOTE_BLOCK_CHIME, SoundCategory.BLOCKS, 1f, 1f);

                context.getStack().decrement(1);

                ItemStack itemStack = new ItemStack(QuestUtility.GetRandomQuestItem(), 1);

                player.sendMessage(
                        Text.translatable("quest.qloverextra.new")
                                .append(itemStack.getItem().toString())
                        , false);

                inv.offerOrDrop(itemStack);
                inv.markDirty();
            }
        }

        return super.useOnBlock(context);
    }
}
