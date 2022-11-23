package com.uncletrashtalk.qloverextra.items;

import com.uncletrashtalk.qloverextra.QloverExtra;
import com.uncletrashtalk.qloverextra.registry.ModBlocks;
import com.uncletrashtalk.qloverextra.registry.ModItems;
import com.uncletrashtalk.qloverextra.utility.InventoryUtility;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
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
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class NormalQuestItem extends Item {
    private final ItemStack requiredItem;
    private final ItemStack rewardItem;
    private final Rarity rarity;
    public NormalQuestItem(Rarity rarity, ItemStack requiredItem, ItemStack rewardItem) {
        super(new FabricItemSettings()
                .group(QloverExtra.QUEST_GROUP)
                .rarity(rarity)
                .maxCount(1));
        this.rarity = rarity;
        this.requiredItem = requiredItem;
        this.rewardItem = rewardItem;
    }

    @Override
    public String toString() {
        return " " + requiredItem;
    }

    @Override
    public Text getName() {
        return Text.translatable("item.qloverextra.normal_quest");
    }

    public String getRequiredItemString(){
        return this.requiredItem.toString();
    }

    public int getRequiredItemCount(){
        return this.requiredItem.getCount();
    }

    public ItemStack getRequiredItem() {
        return requiredItem;
    }

    public ItemStack getRewardItem() {
        return rewardItem;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient()) {
            World world = context.getWorld();
            Block block = world.getBlockState(context.getBlockPos()).getBlock();
            PlayerEntity player = context.getPlayer();
            PlayerInventory inv = player.getInventory();

            if (inv == null) {
                return ActionResult.FAIL;
            }

            if (block.equals(ModBlocks.QUEST_BOARD_BLOCK)) {
                if (inv.containsAny(itemStack -> itemStack.isItemEqual(requiredItem) && itemStack.getCount() >= requiredItem.getCount())) {
                    player.playSound(SoundEvents.BLOCK_NOTE_BLOCK_CHIME, SoundCategory.BLOCKS, 1f, 1f);

                    // Find required item to replace with Qlover reward.
                    context.getStack().decrement(1);

                    // Find the quest item to replace with extra reward.
                    ItemStack randomReward = getRandomReward();

                    inv.removeOne(requiredItem);

                    player.sendMessage(Text.translatable("quest.qloverextra.completed")
                                    .append(" " + rewardItem + " ")
                                    .append("and as a bonus you get: " + randomReward)
                            , false);

                    inv.offerOrDrop(rewardItem);
                    inv.offerOrDrop(randomReward);
                } else {
                    player.playSound(SoundEvents.BLOCK_LAVA_POP, SoundCategory.BLOCKS, 1f, 0.5f);
                    player.sendMessage(Text.translatable("quest.qloverextra.not.completed")
                            .append(" " + requiredItem), false);

                }
            }
        }

        return super.useOnBlock(context);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.qloverextra.normal_tooltip"));
    }

    private ItemStack getRandomReward() {
        Random rand = new Random();
        int randomNum = rand.nextInt(10) + 1;
        if (rarity == Rarity.COMMON){
            if (randomNum <= 5) {
                return new ItemStack(Items.COAL, rand.nextInt(7) + 4);
            } else if (randomNum < 9) {
                return new ItemStack(Items.IRON_INGOT, rand.nextInt(7) + 4);
            } else {
                return new ItemStack(Items.DIAMOND, rand.nextInt(3) + 1);
            }
        } else if (rarity == Rarity.UNCOMMON) {
            if (randomNum <= 5) {
                return new ItemStack(Items.COAL, rand.nextInt(14) + 10);
            } else if (randomNum < 9) {
                return new ItemStack(Items.IRON_INGOT, rand.nextInt(14) + 10);
            } else {
                return new ItemStack(Items.DIAMOND, rand.nextInt(9) + 5);
            }
        } else if (rarity == Rarity.RARE) {
            if (randomNum <= 5) {
                return new ItemStack(Items.IRON_INGOT, rand.nextInt(36) + 20);
            } else if (randomNum < 9) {
                return new ItemStack(Items.DIAMOND, rand.nextInt(20) + 10);
            } else {
                return new ItemStack(Items.NETHERITE_INGOT, rand.nextInt(4) + 3);
            }
        } else {
            if (randomNum <= 5) {
                return new ItemStack(Items.DIAMOND, rand.nextInt(20) + 20);
            } else if (randomNum < 9) {
                return new ItemStack(Items.NETHERITE_INGOT, rand.nextInt(5) + 6);
            } else {
                return new ItemStack(Items.NAME_TAG, rand.nextInt(2) + 1);
            }
        }
    }
}
