package com.IroPlisk.eyecandycraftdecor.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BWBlockModel extends HorizontalDirectionalBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;


    public BWBlockModel(Properties properties) {
        super(properties);
    }

    private static final VoxelShape SHAPE =
            Block.box(0, 0, 0, 8, 10, 8).move(0.25, 0, 0.25);

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return SHAPE;
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

    @Override
    public void entityInside(BlockState p_57270_, Level p_57271_, BlockPos p_57272_, Entity p_57273_) {
        if (p_57273_ instanceof LivingEntity && p_57273_.getType() != EntityType.FOX && p_57273_.getType() != EntityType.BEE) {
            p_57273_.makeStuckInBlock(p_57270_, new Vec3(0.800000011920929, 0.75, 0.800000011920929));
            if (!p_57271_.isClientSide && (p_57273_.xOld != p_57273_.getX() || p_57273_.zOld != p_57273_.getZ())) {
                double d0 = Math.abs(p_57273_.getX() - p_57273_.xOld);
                double d1 = Math.abs(p_57273_.getZ() - p_57273_.zOld);
                if (d0 >= 0.003000000026077032 || d1 >= 0.003000000026077032) {
                    p_57273_.hurt(DamageSource.SWEET_BERRY_BUSH, 5.0F);
                }
            }
        }

    }
}
