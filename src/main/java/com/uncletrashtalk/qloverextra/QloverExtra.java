package com.uncletrashtalk.qloverextra;

import com.uncletrashtalk.qloverextra.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class QloverExtra implements ModInitializer{
    public static final String MOD_ID = "qloverextra";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
