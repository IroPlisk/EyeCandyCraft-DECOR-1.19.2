package com.IroPlisk.eyecandycraftdecor.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import static net.minecraft.world.level.block.state.properties.BlockStateProperties.HORIZONTAL_FACING;

public class BarrierBlockModel extends HorizontalDirectionalBlock {
    public static final DirectionProperty FACING = HORIZONTAL_FACING;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape EAST_SHAPE;
    protected static final VoxelShape WEST_SHAPE;

    static {
        VoxelShape baseShape = Block.box(0, 0, 0, 3, 21, 16);
        NORTH_SHAPE = Block.box(0, 0, 0, 16, 21, 3).move(0, 0, 0.4);
        SOUTH_SHAPE = Block.box(0, 0, 0, 16, 21, 3).move(0, 0, 0.4);
        EAST_SHAPE = Block.box(0, 0, 0, 3, 21, 16).move(0.4, 0, 0);
        WEST_SHAPE = Block.box(0, 0, 0, 3, 21, 16).move(0.4, 0, 0);
    }


    public BarrierBlockModel(Properties properties) {
        super(properties);
    }

    //private static final VoxelShape SHAPE =
    //        Block.box(0, 0, 0, 3, 21, 16).move(0.4, 0, 0);


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext collision) {
        return switch (state.getValue(FACING)) {
            default -> NORTH_SHAPE;
            case NORTH -> NORTH_SHAPE;
            case EAST -> EAST_SHAPE;
            case WEST -> WEST_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
