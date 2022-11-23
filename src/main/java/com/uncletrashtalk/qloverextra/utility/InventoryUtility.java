package com.uncletrashtalk.qloverextra.utility;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.function.Predicate;

public class InventoryUtility {
    public static boolean ContainsAllOfItems(Inventory inv, List<ItemStack> items){
        boolean isAllContained = true;

        for (ItemStack item : items) {
            inv.containsAny(Predicate.isEqual(item));
        }

        return isAllContained;
    }

    public static int FindIndexOfItem(Inventory inv, Item item){
        if (inv.isEmpty()){
            return -1;
        }

        for (int i = 0; i < inv.size(); i++){
            if (inv.getStack(i).getItem().equals(item)){
                return i;
            }
        }

        return -1;
    }

    public static int FindIndexOfItem(Inventory inv, Item item, int amount){
        if (inv.isEmpty()){
            return -1;
        }

        for (int i = 0; i < inv.size(); i++){
            if (inv.getStack(i).getItem().equals(item) && inv.getStack(i).getCount() == amount){
                return i;
            }
        }

        return -1;
    }

    public static int findEmptyInventoryIndex(Inventory inv){
        for (int i = 0; i < inv.size(); i++){
            if (inv.getStack(i).isEmpty()){
                return i;
            }
        }

        return -1;
    }
}
