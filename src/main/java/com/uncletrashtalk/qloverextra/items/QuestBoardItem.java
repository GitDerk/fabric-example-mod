package com.uncletrashtalk.qloverextra.items;

import com.uncletrashtalk.qloverextra.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;


public class QuestBoardItem extends BlockItem {

    public QuestBoardItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public ActionResult place(ItemPlacementContext context) {
        if (!context.getWorld().isClient){
            if (IsThereRoomForBoard(context)){
                placeAll(context);
                context.getWorld().setBlockState(context.getBlockPos(), ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, 1));
                return ActionResult.SUCCESS;
            } else {
                return ActionResult.FAIL;
            }
        }

        return ActionResult.FAIL;
    }

    private void placeAll(ItemPlacementContext context) {
        switch (context.getPlayerLookDirection()){
            case NORTH -> placeAllEast(context,  4);
            case EAST -> placeAllSouth(context, 4);
            case SOUTH -> placeAllWest(context, 4);
            case WEST -> placeAllNorth(context, 4);
        }
    }

    private void placeAllNorth(ItemPlacementContext context, int amount){
        World world = context.getWorld();
        BlockPos placePos = context.getBlockPos();

        world.setBlockState(placePos.up(), ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, 2));
        world.setBlockState(placePos.up().up(), ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, 3));

        int current = 4;

        for (int i = 1; i < amount; i++){
            BlockPos bottomPos = placePos.north(i);
            world.setBlockState(bottomPos,  ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, current++));
            world.setBlockState(bottomPos.up(),  ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, current++));
            world.setBlockState(bottomPos.up().up(),  ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, current++));
        }
    }

    private void placeAllEast(ItemPlacementContext context, int amount){
        World world = context.getWorld();
        BlockPos placePos = context.getBlockPos();

        world.setBlockState(placePos.up(), ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, 2));
        world.setBlockState(placePos.up().up(), ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, 3));

        int current = 4;

        for (int i = 1; i < amount; i++){
            BlockPos bottomPos = placePos.east(i);
            world.setBlockState(bottomPos,  ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, current++));
            world.setBlockState(bottomPos.up(),  ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, current++));
            world.setBlockState(bottomPos.up().up(),  ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, current++));
        }
    }

    private void placeAllSouth(ItemPlacementContext context, int amount){
        World world = context.getWorld();
        BlockPos placePos = context.getBlockPos();

        world.setBlockState(placePos.up(), ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, 2));
        world.setBlockState(placePos.up().up(), ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, 3));

        int current = 4;

        for (int i = 1; i < amount; i++){
            BlockPos bottomPos = placePos.south(i);
            world.setBlockState(bottomPos,  ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, current++));
            world.setBlockState(bottomPos.up(),  ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, current++));
            world.setBlockState(bottomPos.up().up(),  ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, current++));
        }
    }

    private void placeAllWest(ItemPlacementContext context, int amount){
        World world = context.getWorld();
        BlockPos placePos = context.getBlockPos();

        world.setBlockState(placePos.up(), ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, 2));
        world.setBlockState(placePos.up().up(), ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, 3));

        int current = 4;

        for (int i = 1; i < amount; i++){
            BlockPos bottomPos = placePos.west(i);
            world.setBlockState(bottomPos,  ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, current++));
            world.setBlockState(bottomPos.up(),  ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, current++));
            world.setBlockState(bottomPos.up().up(),  ModBlocks.QUEST_BOARD_BLOCK.getPlacementState(context, current++));
        }
    }

    private boolean IsThereRoomForBoard(ItemPlacementContext context){
        if (!isEnoughSpaceTop(context.getWorld(), context.getBlockPos())){
            GivePlayerFeedback(Feedback.NO_ROOM_TOP, context.getPlayer());
            return false;
        }

        if (context.getPlayerLookDirection() == Direction.DOWN ||  context.getPlayerLookDirection() == Direction.UP){
            GivePlayerFeedback(Feedback.WRONG_DIRECTION, context.getPlayer());
            return false;
        }

        if (!isEnoughSpaceRight(context)){
            GivePlayerFeedback(Feedback.NO_ROOM_RIGHT, context.getPlayer());
            return false;
        }
        return true;
    }

    private boolean isEnoughSpaceRight(ItemPlacementContext context){
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();

        // Chest right side of direction looking.
        return switch (context.getPlayerLookDirection()) {
            case NORTH -> isAllEnoughSpaceTopEast(world, blockPos, 4);
            case EAST -> isAllEnoughSpaceTopSouth(world, blockPos, 4);
            case SOUTH -> isAllEnoughSpaceTopWest(world, blockPos, 4);
            default -> isAllEnoughSpaceTopNorth(world, blockPos, 4);
        };
    }

    private boolean isAllEnoughSpaceTopNorth(World world, BlockPos placePos, int amount){
        for (int i = 0; i < amount; i++){
            if (!world.getBlockState(placePos.north(i)).isAir()){
                return false;
            }

            if (!isEnoughSpaceTop(world, placePos.north(i))) {
                return false;
            }
        }

        return true;
    }

    private boolean isAllEnoughSpaceTopEast(World world, BlockPos placePos, int amount){
        for (int i = 0; i < amount; i++){
            if (!world.getBlockState(placePos.east(i)).isAir()){
                return false;
            }

            if (!isEnoughSpaceTop(world, placePos.east(i))) {
                return false;
            }
        }

        return true;
    }

    private boolean isAllEnoughSpaceTopSouth(World world, BlockPos placePos, int amount){
        for (int i = 0; i < amount; i++){
            if (!world.getBlockState(placePos.south(i)).isAir()){
                return false;
            }

            if (!isEnoughSpaceTop(world, placePos.south(i))) {
                return false;
            }
        }

        return true;
    }

    private boolean isAllEnoughSpaceTopWest(World world, BlockPos placePos, int amount){
        for (int i = 0; i < amount; i++){
            if (!world.getBlockState(placePos.west(i)).isAir()){
                return false;
            }

            if (!isEnoughSpaceTop(world, placePos.west(i))) {
                return false;
            }
        }

        return true;
    }

    private boolean isEnoughSpaceTop(World world, BlockPos placePos){
        if (!world.getBlockState(placePos.up()).isAir()){
            return false;
        }

        return world.getBlockState(placePos.up(2)).isAir();
    }

    private void GivePlayerFeedback(Feedback type, PlayerEntity player){
        switch (type) {
            case WRONG_DIRECTION -> player.sendMessage(Text.of("You can only place a board in front of you."));
            case NO_ROOM_TOP -> player.sendMessage(Text.of("You need 2 empty spaces above this block."));
            case NO_ROOM_RIGHT -> player.sendMessage(Text.of("You need 2 empty spaces above and 3 empty spaces to the right of this block."));
        }
    }

    enum Feedback {
        NO_ROOM_RIGHT,
        NO_ROOM_TOP,
        WRONG_DIRECTION
    }
}
