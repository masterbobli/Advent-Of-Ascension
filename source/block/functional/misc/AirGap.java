package net.tslat.aoa3.block.functional.misc;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.tslat.aoa3.util.BlockUtil;

import javax.annotation.Nullable;

public class AirGap extends Block {
	public AirGap() {
		super(BlockUtil.generateBlockProperties(Material.BARRIER, MaterialColor.AIR, BlockUtil.UNBREAKABLE_HARDNESS, 0));
	}
	@Override
	public VoxelShape getRenderShape(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return VoxelShapes.empty();
	}

	@Override
	public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack) {}

	@Override
	public boolean isReplaceable(BlockState state, BlockItemUseContext useContext) {
		return true;
	}

	@Override
	public boolean isReplaceable(BlockState state, Fluid fluidIn) {
		return true;
	}

	@Override
	public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return false;
	}

	@Override
	public ItemStack getPickBlock(BlockState state, RayTraceResult target, IBlockReader world, BlockPos pos, PlayerEntity player) {
		return ItemStack.EMPTY;
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return VoxelShapes.empty();
	}
}
