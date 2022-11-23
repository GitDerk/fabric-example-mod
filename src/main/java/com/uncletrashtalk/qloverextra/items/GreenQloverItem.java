package com.uncletrashtalk.qloverextra.items;

import com.uncletrashtalk.qloverextra.QloverExtra;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GreenQloverItem extends Item {
    public GreenQloverItem() {
        super(new Item.Settings()
                .group(QloverExtra.MATERIAL_GROUP)
                .rarity(Rarity.COMMON)
                .maxCount(64));
    }

    @Override
    public String toString() {
        return "Green Qlover";
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("item.qloverextra.green_qlover.tooltip"));
    }
}
