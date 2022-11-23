package com.uncletrashtalk.qloverextra.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;

import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;

import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.BlockRotation;

import static net.minecraft.util.math.Direction.NORTH;

public class QuestBoardBlock extends Block {
    public static final DirectionProperty FACING = DirectionProperty.of("facing");
    public static final IntProperty ID = IntProperty.of("id", 1, 12);

    public QuestBoardBlock() {
        super(FabricBlockSettings.of(Material.METAL, MapColor.PALE_GREEN)
                .strength(-1, 3600000)
                .sounds(BlockSoundGroup.WOOL));
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, NORTH).with(ID, 1));
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    public BlockState getPlacementState(ItemPlacementContext ctx, int id) {
        return this.getDefaultState()
                .with(FACING, ctx.getPlayerFacing().getOpposite())
                .with(ID, id);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, ID});
    }
}
