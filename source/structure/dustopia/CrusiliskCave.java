package net.tslat.aoa3.structure.dustopia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class CrusiliskCave extends AoAStructure { //StructureSize: 10x10x20
	private static final IBlockState darkwashBricks = BlockRegister.bricksDarkwash.getDefaultState();
	private static final IBlockState ironBars = Blocks.IRON_BARS.getDefaultState();
	private static final IBlockState crusiliskSpawner = BlockRegister.spawnerCrusilisk.getDefaultState();

	public CrusiliskCave() {
		super("CrusiliskCave");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 4, 0, 4, darkwashBricks);
		addBlock(world, basePos, 4, 0, 5, darkwashBricks);
		addBlock(world, basePos, 4, 0, 13, darkwashBricks);
		addBlock(world, basePos, 4, 0, 14, darkwashBricks);
		addBlock(world, basePos, 5, 0, 4, darkwashBricks);
		addBlock(world, basePos, 5, 0, 5, darkwashBricks);
		addBlock(world, basePos, 5, 0, 13, darkwashBricks);
		addBlock(world, basePos, 5, 0, 14, darkwashBricks);
		addBlock(world, basePos, 4, 1, 4, ironBars);
		addBlock(world, basePos, 4, 1, 5, ironBars);
		addBlock(world, basePos, 4, 1, 13, ironBars);
		addBlock(world, basePos, 4, 1, 14, ironBars);
		addBlock(world, basePos, 5, 1, 4, ironBars);
		addBlock(world, basePos, 5, 1, 5, ironBars);
		addBlock(world, basePos, 5, 1, 13, ironBars);
		addBlock(world, basePos, 5, 1, 14, ironBars);
		addBlock(world, basePos, 4, 2, 4, darkwashBricks);
		addBlock(world, basePos, 4, 2, 5, darkwashBricks);
		addBlock(world, basePos, 4, 2, 13, darkwashBricks);
		addBlock(world, basePos, 4, 2, 14, darkwashBricks);
		addBlock(world, basePos, 5, 2, 4, darkwashBricks);
		addBlock(world, basePos, 5, 2, 5, darkwashBricks);
		addBlock(world, basePos, 5, 2, 13, darkwashBricks);
		addBlock(world, basePos, 5, 2, 14, darkwashBricks);
		addBlock(world, basePos, 3, 3, 3, darkwashBricks);
		addBlock(world, basePos, 3, 3, 4, darkwashBricks);
		addBlock(world, basePos, 3, 3, 5, darkwashBricks);
		addBlock(world, basePos, 3, 3, 6, darkwashBricks);
		addBlock(world, basePos, 3, 3, 12, darkwashBricks);
		addBlock(world, basePos, 3, 3, 13, darkwashBricks);
		addBlock(world, basePos, 3, 3, 14, darkwashBricks);
		addBlock(world, basePos, 3, 3, 15, darkwashBricks);
		addBlock(world, basePos, 4, 3, 3, darkwashBricks);
		addBlock(world, basePos, 4, 3, 4, darkwashBricks);
		addBlock(world, basePos, 4, 3, 5, darkwashBricks);
		addBlock(world, basePos, 4, 3, 6, darkwashBricks);
		addBlock(world, basePos, 4, 3, 12, darkwashBricks);
		addBlock(world, basePos, 4, 3, 13, darkwashBricks);
		addBlock(world, basePos, 4, 3, 14, darkwashBricks);
		addBlock(world, basePos, 4, 3, 15, darkwashBricks);
		addBlock(world, basePos, 5, 3, 3, darkwashBricks);
		addBlock(world, basePos, 5, 3, 4, darkwashBricks);
		addBlock(world, basePos, 5, 3, 5, darkwashBricks);
		addBlock(world, basePos, 5, 3, 6, darkwashBricks);
		addBlock(world, basePos, 5, 3, 12, darkwashBricks);
		addBlock(world, basePos, 5, 3, 13, darkwashBricks);
		addBlock(world, basePos, 5, 3, 14, darkwashBricks);
		addBlock(world, basePos, 5, 3, 15, darkwashBricks);
		addBlock(world, basePos, 6, 3, 3, darkwashBricks);
		addBlock(world, basePos, 6, 3, 4, darkwashBricks);
		addBlock(world, basePos, 6, 3, 5, darkwashBricks);
		addBlock(world, basePos, 6, 3, 6, darkwashBricks);
		addBlock(world, basePos, 6, 3, 12, darkwashBricks);
		addBlock(world, basePos, 6, 3, 13, darkwashBricks);
		addBlock(world, basePos, 6, 3, 14, darkwashBricks);
		addBlock(world, basePos, 6, 3, 15, darkwashBricks);
		addBlock(world, basePos, 0, 4, 0, darkwashBricks);
		addBlock(world, basePos, 0, 4, 1, darkwashBricks);
		addBlock(world, basePos, 0, 4, 2, darkwashBricks);
		addBlock(world, basePos, 0, 4, 3, darkwashBricks);
		addBlock(world, basePos, 0, 4, 4, darkwashBricks);
		addBlock(world, basePos, 0, 4, 5, darkwashBricks);
		addBlock(world, basePos, 0, 4, 6, darkwashBricks);
		addBlock(world, basePos, 0, 4, 7, darkwashBricks);
		addBlock(world, basePos, 0, 4, 8, darkwashBricks);
		addBlock(world, basePos, 0, 4, 9, darkwashBricks);
		addBlock(world, basePos, 0, 4, 10, darkwashBricks);
		addBlock(world, basePos, 0, 4, 11, darkwashBricks);
		addBlock(world, basePos, 0, 4, 12, darkwashBricks);
		addBlock(world, basePos, 0, 4, 13, darkwashBricks);
		addBlock(world, basePos, 0, 4, 14, darkwashBricks);
		addBlock(world, basePos, 0, 4, 15, darkwashBricks);
		addBlock(world, basePos, 0, 4, 16, darkwashBricks);
		addBlock(world, basePos, 0, 4, 17, darkwashBricks);
		addBlock(world, basePos, 0, 4, 18, darkwashBricks);
		addBlock(world, basePos, 0, 4, 19, darkwashBricks);
		addBlock(world, basePos, 1, 4, 0, darkwashBricks);
		addBlock(world, basePos, 1, 4, 1, darkwashBricks);
		addBlock(world, basePos, 1, 4, 2, darkwashBricks);
		addBlock(world, basePos, 1, 4, 3, darkwashBricks);
		addBlock(world, basePos, 1, 4, 4, darkwashBricks);
		addBlock(world, basePos, 1, 4, 5, darkwashBricks);
		addBlock(world, basePos, 1, 4, 6, darkwashBricks);
		addBlock(world, basePos, 1, 4, 7, darkwashBricks);
		addBlock(world, basePos, 1, 4, 8, darkwashBricks);
		addBlock(world, basePos, 1, 4, 9, darkwashBricks);
		addBlock(world, basePos, 1, 4, 10, darkwashBricks);
		addBlock(world, basePos, 1, 4, 11, darkwashBricks);
		addBlock(world, basePos, 1, 4, 12, darkwashBricks);
		addBlock(world, basePos, 1, 4, 13, darkwashBricks);
		addBlock(world, basePos, 1, 4, 14, darkwashBricks);
		addBlock(world, basePos, 1, 4, 15, darkwashBricks);
		addBlock(world, basePos, 1, 4, 16, darkwashBricks);
		addBlock(world, basePos, 1, 4, 17, darkwashBricks);
		addBlock(world, basePos, 1, 4, 18, darkwashBricks);
		addBlock(world, basePos, 1, 4, 19, darkwashBricks);
		addBlock(world, basePos, 2, 4, 0, darkwashBricks);
		addBlock(world, basePos, 2, 4, 1, darkwashBricks);
		addBlock(world, basePos, 2, 4, 2, darkwashBricks);
		addBlock(world, basePos, 2, 4, 3, darkwashBricks);
		addBlock(world, basePos, 2, 4, 4, darkwashBricks);
		addBlock(world, basePos, 2, 4, 5, darkwashBricks);
		addBlock(world, basePos, 2, 4, 6, darkwashBricks);
		addBlock(world, basePos, 2, 4, 7, darkwashBricks);
		addBlock(world, basePos, 2, 4, 8, darkwashBricks);
		addBlock(world, basePos, 2, 4, 9, darkwashBricks);
		addBlock(world, basePos, 2, 4, 10, darkwashBricks);
		addBlock(world, basePos, 2, 4, 11, darkwashBricks);
		addBlock(world, basePos, 2, 4, 12, darkwashBricks);
		addBlock(world, basePos, 2, 4, 13, darkwashBricks);
		addBlock(world, basePos, 2, 4, 14, darkwashBricks);
		addBlock(world, basePos, 2, 4, 15, darkwashBricks);
		addBlock(world, basePos, 2, 4, 16, darkwashBricks);
		addBlock(world, basePos, 2, 4, 17, darkwashBricks);
		addBlock(world, basePos, 2, 4, 18, darkwashBricks);
		addBlock(world, basePos, 2, 4, 19, darkwashBricks);
		addBlock(world, basePos, 3, 4, 0, darkwashBricks);
		addBlock(world, basePos, 3, 4, 1, darkwashBricks);
		addBlock(world, basePos, 3, 4, 2, darkwashBricks);
		addBlock(world, basePos, 3, 4, 3, darkwashBricks);
		addBlock(world, basePos, 3, 4, 4, darkwashBricks);
		addBlock(world, basePos, 3, 4, 5, darkwashBricks);
		addBlock(world, basePos, 3, 4, 6, darkwashBricks);
		addBlock(world, basePos, 3, 4, 7, darkwashBricks);
		addBlock(world, basePos, 3, 4, 8, darkwashBricks);
		addBlock(world, basePos, 3, 4, 9, darkwashBricks);
		addBlock(world, basePos, 3, 4, 10, darkwashBricks);
		addBlock(world, basePos, 3, 4, 11, darkwashBricks);
		addBlock(world, basePos, 3, 4, 12, darkwashBricks);
		addBlock(world, basePos, 3, 4, 13, darkwashBricks);
		addBlock(world, basePos, 3, 4, 14, darkwashBricks);
		addBlock(world, basePos, 3, 4, 15, darkwashBricks);
		addBlock(world, basePos, 3, 4, 16, darkwashBricks);
		addBlock(world, basePos, 3, 4, 17, darkwashBricks);
		addBlock(world, basePos, 3, 4, 18, darkwashBricks);
		addBlock(world, basePos, 3, 4, 19, darkwashBricks);
		addBlock(world, basePos, 4, 4, 0, darkwashBricks);
		addBlock(world, basePos, 4, 4, 1, darkwashBricks);
		addBlock(world, basePos, 4, 4, 2, darkwashBricks);
		addBlock(world, basePos, 4, 4, 3, darkwashBricks);
		addBlock(world, basePos, 4, 4, 4, darkwashBricks);
		addBlock(world, basePos, 4, 4, 5, darkwashBricks);
		addBlock(world, basePos, 4, 4, 6, darkwashBricks);
		addBlock(world, basePos, 4, 4, 7, darkwashBricks);
		addBlock(world, basePos, 4, 4, 8, darkwashBricks);
		addBlock(world, basePos, 4, 4, 9, darkwashBricks);
		addBlock(world, basePos, 4, 4, 10, darkwashBricks);
		addBlock(world, basePos, 4, 4, 11, darkwashBricks);
		addBlock(world, basePos, 4, 4, 12, darkwashBricks);
		addBlock(world, basePos, 4, 4, 13, darkwashBricks);
		addBlock(world, basePos, 4, 4, 14, darkwashBricks);
		addBlock(world, basePos, 4, 4, 15, darkwashBricks);
		addBlock(world, basePos, 4, 4, 16, darkwashBricks);
		addBlock(world, basePos, 4, 4, 17, darkwashBricks);
		addBlock(world, basePos, 4, 4, 18, darkwashBricks);
		addBlock(world, basePos, 4, 4, 19, darkwashBricks);
		addBlock(world, basePos, 5, 4, 0, darkwashBricks);
		addBlock(world, basePos, 5, 4, 1, darkwashBricks);
		addBlock(world, basePos, 5, 4, 2, darkwashBricks);
		addBlock(world, basePos, 5, 4, 3, darkwashBricks);
		addBlock(world, basePos, 5, 4, 4, darkwashBricks);
		addBlock(world, basePos, 5, 4, 5, darkwashBricks);
		addBlock(world, basePos, 5, 4, 6, darkwashBricks);
		addBlock(world, basePos, 5, 4, 7, darkwashBricks);
		addBlock(world, basePos, 5, 4, 8, darkwashBricks);
		addBlock(world, basePos, 5, 4, 9, darkwashBricks);
		addBlock(world, basePos, 5, 4, 10, darkwashBricks);
		addBlock(world, basePos, 5, 4, 11, darkwashBricks);
		addBlock(world, basePos, 5, 4, 12, darkwashBricks);
		addBlock(world, basePos, 5, 4, 13, darkwashBricks);
		addBlock(world, basePos, 5, 4, 14, darkwashBricks);
		addBlock(world, basePos, 5, 4, 15, darkwashBricks);
		addBlock(world, basePos, 5, 4, 16, darkwashBricks);
		addBlock(world, basePos, 5, 4, 17, darkwashBricks);
		addBlock(world, basePos, 5, 4, 18, darkwashBricks);
		addBlock(world, basePos, 5, 4, 19, darkwashBricks);
		addBlock(world, basePos, 6, 4, 0, darkwashBricks);
		addBlock(world, basePos, 6, 4, 1, darkwashBricks);
		addBlock(world, basePos, 6, 4, 2, darkwashBricks);
		addBlock(world, basePos, 6, 4, 3, darkwashBricks);
		addBlock(world, basePos, 6, 4, 4, darkwashBricks);
		addBlock(world, basePos, 6, 4, 5, darkwashBricks);
		addBlock(world, basePos, 6, 4, 6, darkwashBricks);
		addBlock(world, basePos, 6, 4, 7, darkwashBricks);
		addBlock(world, basePos, 6, 4, 8, darkwashBricks);
		addBlock(world, basePos, 6, 4, 9, darkwashBricks);
		addBlock(world, basePos, 6, 4, 10, darkwashBricks);
		addBlock(world, basePos, 6, 4, 11, darkwashBricks);
		addBlock(world, basePos, 6, 4, 12, darkwashBricks);
		addBlock(world, basePos, 6, 4, 13, darkwashBricks);
		addBlock(world, basePos, 6, 4, 14, darkwashBricks);
		addBlock(world, basePos, 6, 4, 15, darkwashBricks);
		addBlock(world, basePos, 6, 4, 16, darkwashBricks);
		addBlock(world, basePos, 6, 4, 17, darkwashBricks);
		addBlock(world, basePos, 6, 4, 18, darkwashBricks);
		addBlock(world, basePos, 6, 4, 19, darkwashBricks);
		addBlock(world, basePos, 7, 4, 0, darkwashBricks);
		addBlock(world, basePos, 7, 4, 1, darkwashBricks);
		addBlock(world, basePos, 7, 4, 2, darkwashBricks);
		addBlock(world, basePos, 7, 4, 3, darkwashBricks);
		addBlock(world, basePos, 7, 4, 4, darkwashBricks);
		addBlock(world, basePos, 7, 4, 5, darkwashBricks);
		addBlock(world, basePos, 7, 4, 6, darkwashBricks);
		addBlock(world, basePos, 7, 4, 7, darkwashBricks);
		addBlock(world, basePos, 7, 4, 8, darkwashBricks);
		addBlock(world, basePos, 7, 4, 9, darkwashBricks);
		addBlock(world, basePos, 7, 4, 10, darkwashBricks);
		addBlock(world, basePos, 7, 4, 11, darkwashBricks);
		addBlock(world, basePos, 7, 4, 12, darkwashBricks);
		addBlock(world, basePos, 7, 4, 13, darkwashBricks);
		addBlock(world, basePos, 7, 4, 14, darkwashBricks);
		addBlock(world, basePos, 7, 4, 15, darkwashBricks);
		addBlock(world, basePos, 7, 4, 16, darkwashBricks);
		addBlock(world, basePos, 7, 4, 17, darkwashBricks);
		addBlock(world, basePos, 7, 4, 18, darkwashBricks);
		addBlock(world, basePos, 7, 4, 19, darkwashBricks);
		addBlock(world, basePos, 8, 4, 0, darkwashBricks);
		addBlock(world, basePos, 8, 4, 1, darkwashBricks);
		addBlock(world, basePos, 8, 4, 2, darkwashBricks);
		addBlock(world, basePos, 8, 4, 3, darkwashBricks);
		addBlock(world, basePos, 8, 4, 4, darkwashBricks);
		addBlock(world, basePos, 8, 4, 5, darkwashBricks);
		addBlock(world, basePos, 8, 4, 6, darkwashBricks);
		addBlock(world, basePos, 8, 4, 7, darkwashBricks);
		addBlock(world, basePos, 8, 4, 8, darkwashBricks);
		addBlock(world, basePos, 8, 4, 9, darkwashBricks);
		addBlock(world, basePos, 8, 4, 10, darkwashBricks);
		addBlock(world, basePos, 8, 4, 11, darkwashBricks);
		addBlock(world, basePos, 8, 4, 12, darkwashBricks);
		addBlock(world, basePos, 8, 4, 13, darkwashBricks);
		addBlock(world, basePos, 8, 4, 14, darkwashBricks);
		addBlock(world, basePos, 8, 4, 15, darkwashBricks);
		addBlock(world, basePos, 8, 4, 16, darkwashBricks);
		addBlock(world, basePos, 8, 4, 17, darkwashBricks);
		addBlock(world, basePos, 8, 4, 18, darkwashBricks);
		addBlock(world, basePos, 8, 4, 19, darkwashBricks);
		addBlock(world, basePos, 9, 4, 0, darkwashBricks);
		addBlock(world, basePos, 9, 4, 1, darkwashBricks);
		addBlock(world, basePos, 9, 4, 2, darkwashBricks);
		addBlock(world, basePos, 9, 4, 3, darkwashBricks);
		addBlock(world, basePos, 9, 4, 4, darkwashBricks);
		addBlock(world, basePos, 9, 4, 5, darkwashBricks);
		addBlock(world, basePos, 9, 4, 6, darkwashBricks);
		addBlock(world, basePos, 9, 4, 7, darkwashBricks);
		addBlock(world, basePos, 9, 4, 8, darkwashBricks);
		addBlock(world, basePos, 9, 4, 9, darkwashBricks);
		addBlock(world, basePos, 9, 4, 10, darkwashBricks);
		addBlock(world, basePos, 9, 4, 11, darkwashBricks);
		addBlock(world, basePos, 9, 4, 12, darkwashBricks);
		addBlock(world, basePos, 9, 4, 13, darkwashBricks);
		addBlock(world, basePos, 9, 4, 14, darkwashBricks);
		addBlock(world, basePos, 9, 4, 15, darkwashBricks);
		addBlock(world, basePos, 9, 4, 16, darkwashBricks);
		addBlock(world, basePos, 9, 4, 17, darkwashBricks);
		addBlock(world, basePos, 9, 4, 18, darkwashBricks);
		addBlock(world, basePos, 9, 4, 19, darkwashBricks);
		addBlock(world, basePos, 0, 5, 0, darkwashBricks);
		addBlock(world, basePos, 0, 5, 1, darkwashBricks);
		addBlock(world, basePos, 0, 5, 2, darkwashBricks);
		addBlock(world, basePos, 0, 5, 3, darkwashBricks);
		addBlock(world, basePos, 0, 5, 4, darkwashBricks);
		addBlock(world, basePos, 0, 5, 5, darkwashBricks);
		addBlock(world, basePos, 0, 5, 6, darkwashBricks);
		addBlock(world, basePos, 0, 5, 7, darkwashBricks);
		addBlock(world, basePos, 0, 5, 8, darkwashBricks);
		addBlock(world, basePos, 0, 5, 9, darkwashBricks);
		addBlock(world, basePos, 0, 5, 10, darkwashBricks);
		addBlock(world, basePos, 0, 5, 11, darkwashBricks);
		addBlock(world, basePos, 0, 5, 12, darkwashBricks);
		addBlock(world, basePos, 0, 5, 13, darkwashBricks);
		addBlock(world, basePos, 0, 5, 14, darkwashBricks);
		addBlock(world, basePos, 0, 5, 15, darkwashBricks);
		addBlock(world, basePos, 0, 5, 16, darkwashBricks);
		addBlock(world, basePos, 0, 5, 17, darkwashBricks);
		addBlock(world, basePos, 0, 5, 18, darkwashBricks);
		addBlock(world, basePos, 0, 5, 19, darkwashBricks);
		addBlock(world, basePos, 1, 5, 0, darkwashBricks);
		addBlock(world, basePos, 1, 5, 19, darkwashBricks);
		addBlock(world, basePos, 2, 5, 0, darkwashBricks);
		addBlock(world, basePos, 2, 5, 19, darkwashBricks);
		addBlock(world, basePos, 3, 5, 0, darkwashBricks);
		addBlock(world, basePos, 3, 5, 19, darkwashBricks);
		addBlock(world, basePos, 4, 5, 0, darkwashBricks);
		addBlock(world, basePos, 4, 5, 16, crusiliskSpawner);
		addBlock(world, basePos, 4, 5, 19, darkwashBricks);
		addBlock(world, basePos, 5, 5, 0, darkwashBricks);
		addBlock(world, basePos, 5, 5, 16, crusiliskSpawner);
		addBlock(world, basePos, 5, 5, 19, darkwashBricks);
		addBlock(world, basePos, 6, 5, 0, darkwashBricks);
		addBlock(world, basePos, 6, 5, 19, darkwashBricks);
		addBlock(world, basePos, 7, 5, 0, darkwashBricks);
		addBlock(world, basePos, 7, 5, 19, darkwashBricks);
		addBlock(world, basePos, 8, 5, 0, darkwashBricks);
		addBlock(world, basePos, 8, 5, 19, darkwashBricks);
		addBlock(world, basePos, 9, 5, 0, darkwashBricks);
		addBlock(world, basePos, 9, 5, 1, darkwashBricks);
		addBlock(world, basePos, 9, 5, 2, darkwashBricks);
		addBlock(world, basePos, 9, 5, 3, darkwashBricks);
		addBlock(world, basePos, 9, 5, 4, darkwashBricks);
		addBlock(world, basePos, 9, 5, 5, darkwashBricks);
		addBlock(world, basePos, 9, 5, 6, darkwashBricks);
		addBlock(world, basePos, 9, 5, 7, darkwashBricks);
		addBlock(world, basePos, 9, 5, 8, darkwashBricks);
		addBlock(world, basePos, 9, 5, 9, darkwashBricks);
		addBlock(world, basePos, 9, 5, 10, darkwashBricks);
		addBlock(world, basePos, 9, 5, 11, darkwashBricks);
		addBlock(world, basePos, 9, 5, 12, darkwashBricks);
		addBlock(world, basePos, 9, 5, 13, darkwashBricks);
		addBlock(world, basePos, 9, 5, 14, darkwashBricks);
		addBlock(world, basePos, 9, 5, 15, darkwashBricks);
		addBlock(world, basePos, 9, 5, 16, darkwashBricks);
		addBlock(world, basePos, 9, 5, 17, darkwashBricks);
		addBlock(world, basePos, 9, 5, 18, darkwashBricks);
		addBlock(world, basePos, 9, 5, 19, darkwashBricks);
		addBlock(world, basePos, 0, 6, 0, darkwashBricks);
		addBlock(world, basePos, 0, 6, 1, ironBars);
		addBlock(world, basePos, 0, 6, 2, ironBars);
		addBlock(world, basePos, 0, 6, 3, ironBars);
		addBlock(world, basePos, 0, 6, 4, ironBars);
		addBlock(world, basePos, 0, 6, 5, ironBars);
		addBlock(world, basePos, 0, 6, 6, ironBars);
		addBlock(world, basePos, 0, 6, 7, ironBars);
		addBlock(world, basePos, 0, 6, 8, ironBars);
		addBlock(world, basePos, 0, 6, 9, ironBars);
		addBlock(world, basePos, 0, 6, 10, ironBars);
		addBlock(world, basePos, 0, 6, 11, ironBars);
		addBlock(world, basePos, 0, 6, 12, ironBars);
		addBlock(world, basePos, 0, 6, 13, ironBars);
		addBlock(world, basePos, 0, 6, 14, ironBars);
		addBlock(world, basePos, 0, 6, 15, ironBars);
		addBlock(world, basePos, 0, 6, 16, ironBars);
		addBlock(world, basePos, 0, 6, 17, ironBars);
		addBlock(world, basePos, 0, 6, 18, ironBars);
		addBlock(world, basePos, 0, 6, 19, darkwashBricks);
		addBlock(world, basePos, 1, 6, 0, ironBars);
		addBlock(world, basePos, 1, 6, 19, ironBars);
		addBlock(world, basePos, 2, 6, 0, ironBars);
		addBlock(world, basePos, 2, 6, 19, ironBars);
		addBlock(world, basePos, 3, 6, 0, ironBars);
		addBlock(world, basePos, 3, 6, 19, ironBars);
		addBlock(world, basePos, 4, 6, 0, ironBars);
		addBlock(world, basePos, 4, 6, 19, ironBars);
		addBlock(world, basePos, 5, 6, 0, ironBars);
		addBlock(world, basePos, 5, 6, 19, ironBars);
		addBlock(world, basePos, 6, 6, 0, ironBars);
		addBlock(world, basePos, 6, 6, 19, ironBars);
		addBlock(world, basePos, 7, 6, 0, ironBars);
		addBlock(world, basePos, 7, 6, 19, ironBars);
		addBlock(world, basePos, 8, 6, 0, ironBars);
		addBlock(world, basePos, 8, 6, 19, ironBars);
		addBlock(world, basePos, 9, 6, 0, darkwashBricks);
		addBlock(world, basePos, 9, 6, 1, ironBars);
		addBlock(world, basePos, 9, 6, 2, ironBars);
		addBlock(world, basePos, 9, 6, 3, ironBars);
		addBlock(world, basePos, 9, 6, 4, ironBars);
		addBlock(world, basePos, 9, 6, 5, ironBars);
		addBlock(world, basePos, 9, 6, 6, ironBars);
		addBlock(world, basePos, 9, 6, 7, ironBars);
		addBlock(world, basePos, 9, 6, 8, ironBars);
		addBlock(world, basePos, 9, 6, 9, ironBars);
		addBlock(world, basePos, 9, 6, 10, ironBars);
		addBlock(world, basePos, 9, 6, 11, ironBars);
		addBlock(world, basePos, 9, 6, 12, ironBars);
		addBlock(world, basePos, 9, 6, 13, ironBars);
		addBlock(world, basePos, 9, 6, 14, ironBars);
		addBlock(world, basePos, 9, 6, 15, ironBars);
		addBlock(world, basePos, 9, 6, 16, ironBars);
		addBlock(world, basePos, 9, 6, 17, ironBars);
		addBlock(world, basePos, 9, 6, 18, ironBars);
		addBlock(world, basePos, 9, 6, 19, darkwashBricks);
		addBlock(world, basePos, 0, 7, 0, darkwashBricks);
		addBlock(world, basePos, 0, 7, 1, ironBars);
		addBlock(world, basePos, 0, 7, 2, ironBars);
		addBlock(world, basePos, 0, 7, 3, ironBars);
		addBlock(world, basePos, 0, 7, 4, ironBars);
		addBlock(world, basePos, 0, 7, 5, ironBars);
		addBlock(world, basePos, 0, 7, 6, ironBars);
		addBlock(world, basePos, 0, 7, 7, ironBars);
		addBlock(world, basePos, 0, 7, 8, ironBars);
		addBlock(world, basePos, 0, 7, 9, ironBars);
		addBlock(world, basePos, 0, 7, 10, ironBars);
		addBlock(world, basePos, 0, 7, 11, ironBars);
		addBlock(world, basePos, 0, 7, 12, ironBars);
		addBlock(world, basePos, 0, 7, 13, ironBars);
		addBlock(world, basePos, 0, 7, 14, ironBars);
		addBlock(world, basePos, 0, 7, 15, ironBars);
		addBlock(world, basePos, 0, 7, 16, ironBars);
		addBlock(world, basePos, 0, 7, 17, ironBars);
		addBlock(world, basePos, 0, 7, 18, ironBars);
		addBlock(world, basePos, 0, 7, 19, darkwashBricks);
		addBlock(world, basePos, 1, 7, 0, ironBars);
		addBlock(world, basePos, 1, 7, 19, ironBars);
		addBlock(world, basePos, 2, 7, 0, ironBars);
		addBlock(world, basePos, 2, 7, 19, ironBars);
		addBlock(world, basePos, 3, 7, 0, ironBars);
		addBlock(world, basePos, 3, 7, 19, ironBars);
		addBlock(world, basePos, 4, 7, 0, ironBars);
		addBlock(world, basePos, 4, 7, 19, ironBars);
		addBlock(world, basePos, 5, 7, 0, ironBars);
		addBlock(world, basePos, 5, 7, 19, ironBars);
		addBlock(world, basePos, 6, 7, 0, ironBars);
		addBlock(world, basePos, 6, 7, 19, ironBars);
		addBlock(world, basePos, 7, 7, 0, ironBars);
		addBlock(world, basePos, 7, 7, 19, ironBars);
		addBlock(world, basePos, 8, 7, 0, ironBars);
		addBlock(world, basePos, 8, 7, 19, ironBars);
		addBlock(world, basePos, 9, 7, 0, darkwashBricks);
		addBlock(world, basePos, 9, 7, 1, ironBars);
		addBlock(world, basePos, 9, 7, 2, ironBars);
		addBlock(world, basePos, 9, 7, 3, ironBars);
		addBlock(world, basePos, 9, 7, 4, ironBars);
		addBlock(world, basePos, 9, 7, 5, ironBars);
		addBlock(world, basePos, 9, 7, 6, ironBars);
		addBlock(world, basePos, 9, 7, 7, ironBars);
		addBlock(world, basePos, 9, 7, 8, ironBars);
		addBlock(world, basePos, 9, 7, 9, ironBars);
		addBlock(world, basePos, 9, 7, 10, ironBars);
		addBlock(world, basePos, 9, 7, 11, ironBars);
		addBlock(world, basePos, 9, 7, 12, ironBars);
		addBlock(world, basePos, 9, 7, 13, ironBars);
		addBlock(world, basePos, 9, 7, 14, ironBars);
		addBlock(world, basePos, 9, 7, 15, ironBars);
		addBlock(world, basePos, 9, 7, 16, ironBars);
		addBlock(world, basePos, 9, 7, 17, ironBars);
		addBlock(world, basePos, 9, 7, 18, ironBars);
		addBlock(world, basePos, 9, 7, 19, darkwashBricks);
		addBlock(world, basePos, 0, 8, 0, darkwashBricks);
		addBlock(world, basePos, 0, 8, 1, darkwashBricks);
		addBlock(world, basePos, 0, 8, 2, darkwashBricks);
		addBlock(world, basePos, 0, 8, 3, darkwashBricks);
		addBlock(world, basePos, 0, 8, 4, darkwashBricks);
		addBlock(world, basePos, 0, 8, 5, darkwashBricks);
		addBlock(world, basePos, 0, 8, 6, darkwashBricks);
		addBlock(world, basePos, 0, 8, 7, darkwashBricks);
		addBlock(world, basePos, 0, 8, 8, darkwashBricks);
		addBlock(world, basePos, 0, 8, 9, darkwashBricks);
		addBlock(world, basePos, 0, 8, 10, darkwashBricks);
		addBlock(world, basePos, 0, 8, 11, darkwashBricks);
		addBlock(world, basePos, 0, 8, 12, darkwashBricks);
		addBlock(world, basePos, 0, 8, 13, darkwashBricks);
		addBlock(world, basePos, 0, 8, 14, darkwashBricks);
		addBlock(world, basePos, 0, 8, 15, darkwashBricks);
		addBlock(world, basePos, 0, 8, 16, darkwashBricks);
		addBlock(world, basePos, 0, 8, 17, darkwashBricks);
		addBlock(world, basePos, 0, 8, 18, darkwashBricks);
		addBlock(world, basePos, 0, 8, 19, darkwashBricks);
		addBlock(world, basePos, 1, 8, 0, darkwashBricks);
		addBlock(world, basePos, 1, 8, 19, darkwashBricks);
		addBlock(world, basePos, 2, 8, 0, darkwashBricks);
		addBlock(world, basePos, 2, 8, 19, darkwashBricks);
		addBlock(world, basePos, 3, 8, 0, darkwashBricks);
		addBlock(world, basePos, 3, 8, 19, darkwashBricks);
		addBlock(world, basePos, 4, 8, 0, darkwashBricks);
		addBlock(world, basePos, 4, 8, 19, darkwashBricks);
		addBlock(world, basePos, 5, 8, 0, darkwashBricks);
		addBlock(world, basePos, 5, 8, 19, darkwashBricks);
		addBlock(world, basePos, 6, 8, 0, darkwashBricks);
		addBlock(world, basePos, 6, 8, 19, darkwashBricks);
		addBlock(world, basePos, 7, 8, 0, darkwashBricks);
		addBlock(world, basePos, 7, 8, 19, darkwashBricks);
		addBlock(world, basePos, 8, 8, 0, darkwashBricks);
		addBlock(world, basePos, 8, 8, 19, darkwashBricks);
		addBlock(world, basePos, 9, 8, 0, darkwashBricks);
		addBlock(world, basePos, 9, 8, 1, darkwashBricks);
		addBlock(world, basePos, 9, 8, 2, darkwashBricks);
		addBlock(world, basePos, 9, 8, 3, darkwashBricks);
		addBlock(world, basePos, 9, 8, 4, darkwashBricks);
		addBlock(world, basePos, 9, 8, 5, darkwashBricks);
		addBlock(world, basePos, 9, 8, 6, darkwashBricks);
		addBlock(world, basePos, 9, 8, 7, darkwashBricks);
		addBlock(world, basePos, 9, 8, 8, darkwashBricks);
		addBlock(world, basePos, 9, 8, 9, darkwashBricks);
		addBlock(world, basePos, 9, 8, 10, darkwashBricks);
		addBlock(world, basePos, 9, 8, 11, darkwashBricks);
		addBlock(world, basePos, 9, 8, 12, darkwashBricks);
		addBlock(world, basePos, 9, 8, 13, darkwashBricks);
		addBlock(world, basePos, 9, 8, 14, darkwashBricks);
		addBlock(world, basePos, 9, 8, 15, darkwashBricks);
		addBlock(world, basePos, 9, 8, 16, darkwashBricks);
		addBlock(world, basePos, 9, 8, 17, darkwashBricks);
		addBlock(world, basePos, 9, 8, 18, darkwashBricks);
		addBlock(world, basePos, 9, 8, 19, darkwashBricks);
		addBlock(world, basePos, 1, 9, 1, darkwashBricks);
		addBlock(world, basePos, 1, 9, 2, darkwashBricks);
		addBlock(world, basePos, 1, 9, 3, darkwashBricks);
		addBlock(world, basePos, 1, 9, 4, darkwashBricks);
		addBlock(world, basePos, 1, 9, 5, darkwashBricks);
		addBlock(world, basePos, 1, 9, 6, darkwashBricks);
		addBlock(world, basePos, 1, 9, 7, darkwashBricks);
		addBlock(world, basePos, 1, 9, 8, darkwashBricks);
		addBlock(world, basePos, 1, 9, 9, darkwashBricks);
		addBlock(world, basePos, 1, 9, 10, darkwashBricks);
		addBlock(world, basePos, 1, 9, 11, darkwashBricks);
		addBlock(world, basePos, 1, 9, 12, darkwashBricks);
		addBlock(world, basePos, 1, 9, 13, darkwashBricks);
		addBlock(world, basePos, 1, 9, 14, darkwashBricks);
		addBlock(world, basePos, 1, 9, 15, darkwashBricks);
		addBlock(world, basePos, 1, 9, 16, darkwashBricks);
		addBlock(world, basePos, 1, 9, 17, darkwashBricks);
		addBlock(world, basePos, 1, 9, 18, darkwashBricks);
		addBlock(world, basePos, 2, 9, 1, darkwashBricks);
		addBlock(world, basePos, 2, 9, 2, darkwashBricks);
		addBlock(world, basePos, 2, 9, 3, darkwashBricks);
		addBlock(world, basePos, 2, 9, 4, darkwashBricks);
		addBlock(world, basePos, 2, 9, 5, darkwashBricks);
		addBlock(world, basePos, 2, 9, 6, darkwashBricks);
		addBlock(world, basePos, 2, 9, 7, darkwashBricks);
		addBlock(world, basePos, 2, 9, 8, darkwashBricks);
		addBlock(world, basePos, 2, 9, 9, darkwashBricks);
		addBlock(world, basePos, 2, 9, 10, darkwashBricks);
		addBlock(world, basePos, 2, 9, 11, darkwashBricks);
		addBlock(world, basePos, 2, 9, 12, darkwashBricks);
		addBlock(world, basePos, 2, 9, 13, darkwashBricks);
		addBlock(world, basePos, 2, 9, 14, darkwashBricks);
		addBlock(world, basePos, 2, 9, 15, darkwashBricks);
		addBlock(world, basePos, 2, 9, 16, darkwashBricks);
		addBlock(world, basePos, 2, 9, 17, darkwashBricks);
		addBlock(world, basePos, 2, 9, 18, darkwashBricks);
		addBlock(world, basePos, 3, 9, 1, darkwashBricks);
		addBlock(world, basePos, 3, 9, 2, darkwashBricks);
		addBlock(world, basePos, 3, 9, 3, darkwashBricks);
		addBlock(world, basePos, 3, 9, 4, darkwashBricks);
		addBlock(world, basePos, 3, 9, 5, darkwashBricks);
		addBlock(world, basePos, 3, 9, 6, darkwashBricks);
		addBlock(world, basePos, 3, 9, 7, darkwashBricks);
		addBlock(world, basePos, 3, 9, 8, darkwashBricks);
		addBlock(world, basePos, 3, 9, 9, darkwashBricks);
		addBlock(world, basePos, 3, 9, 10, darkwashBricks);
		addBlock(world, basePos, 3, 9, 11, darkwashBricks);
		addBlock(world, basePos, 3, 9, 12, darkwashBricks);
		addBlock(world, basePos, 3, 9, 13, darkwashBricks);
		addBlock(world, basePos, 3, 9, 14, darkwashBricks);
		addBlock(world, basePos, 3, 9, 15, darkwashBricks);
		addBlock(world, basePos, 3, 9, 16, darkwashBricks);
		addBlock(world, basePos, 3, 9, 17, darkwashBricks);
		addBlock(world, basePos, 3, 9, 18, darkwashBricks);
		addBlock(world, basePos, 4, 9, 1, darkwashBricks);
		addBlock(world, basePos, 4, 9, 2, darkwashBricks);
		addBlock(world, basePos, 4, 9, 3, darkwashBricks);
		addBlock(world, basePos, 4, 9, 4, darkwashBricks);
		addBlock(world, basePos, 4, 9, 5, darkwashBricks);
		addBlock(world, basePos, 4, 9, 6, darkwashBricks);
		addBlock(world, basePos, 4, 9, 7, darkwashBricks);
		addBlock(world, basePos, 4, 9, 8, darkwashBricks);
		addBlock(world, basePos, 4, 9, 9, darkwashBricks);
		addBlock(world, basePos, 4, 9, 10, darkwashBricks);
		addBlock(world, basePos, 4, 9, 11, darkwashBricks);
		addBlock(world, basePos, 4, 9, 12, darkwashBricks);
		addBlock(world, basePos, 4, 9, 13, darkwashBricks);
		addBlock(world, basePos, 4, 9, 14, darkwashBricks);
		addBlock(world, basePos, 4, 9, 15, darkwashBricks);
		addBlock(world, basePos, 4, 9, 16, darkwashBricks);
		addBlock(world, basePos, 4, 9, 17, darkwashBricks);
		addBlock(world, basePos, 4, 9, 18, darkwashBricks);
		addBlock(world, basePos, 5, 9, 1, darkwashBricks);
		addBlock(world, basePos, 5, 9, 2, darkwashBricks);
		addBlock(world, basePos, 5, 9, 3, darkwashBricks);
		addBlock(world, basePos, 5, 9, 4, darkwashBricks);
		addBlock(world, basePos, 5, 9, 5, darkwashBricks);
		addBlock(world, basePos, 5, 9, 6, darkwashBricks);
		addBlock(world, basePos, 5, 9, 7, darkwashBricks);
		addBlock(world, basePos, 5, 9, 8, darkwashBricks);
		addBlock(world, basePos, 5, 9, 9, darkwashBricks);
		addBlock(world, basePos, 5, 9, 10, darkwashBricks);
		addBlock(world, basePos, 5, 9, 11, darkwashBricks);
		addBlock(world, basePos, 5, 9, 12, darkwashBricks);
		addBlock(world, basePos, 5, 9, 13, darkwashBricks);
		addBlock(world, basePos, 5, 9, 14, darkwashBricks);
		addBlock(world, basePos, 5, 9, 15, darkwashBricks);
		addBlock(world, basePos, 5, 9, 16, darkwashBricks);
		addBlock(world, basePos, 5, 9, 17, darkwashBricks);
		addBlock(world, basePos, 5, 9, 18, darkwashBricks);
		addBlock(world, basePos, 6, 9, 1, darkwashBricks);
		addBlock(world, basePos, 6, 9, 2, darkwashBricks);
		addBlock(world, basePos, 6, 9, 3, darkwashBricks);
		addBlock(world, basePos, 6, 9, 4, darkwashBricks);
		addBlock(world, basePos, 6, 9, 5, darkwashBricks);
		addBlock(world, basePos, 6, 9, 6, darkwashBricks);
		addBlock(world, basePos, 6, 9, 7, darkwashBricks);
		addBlock(world, basePos, 6, 9, 8, darkwashBricks);
		addBlock(world, basePos, 6, 9, 9, darkwashBricks);
		addBlock(world, basePos, 6, 9, 10, darkwashBricks);
		addBlock(world, basePos, 6, 9, 11, darkwashBricks);
		addBlock(world, basePos, 6, 9, 12, darkwashBricks);
		addBlock(world, basePos, 6, 9, 13, darkwashBricks);
		addBlock(world, basePos, 6, 9, 14, darkwashBricks);
		addBlock(world, basePos, 6, 9, 15, darkwashBricks);
		addBlock(world, basePos, 6, 9, 16, darkwashBricks);
		addBlock(world, basePos, 6, 9, 17, darkwashBricks);
		addBlock(world, basePos, 6, 9, 18, darkwashBricks);
		addBlock(world, basePos, 7, 9, 1, darkwashBricks);
		addBlock(world, basePos, 7, 9, 2, darkwashBricks);
		addBlock(world, basePos, 7, 9, 3, darkwashBricks);
		addBlock(world, basePos, 7, 9, 4, darkwashBricks);
		addBlock(world, basePos, 7, 9, 5, darkwashBricks);
		addBlock(world, basePos, 7, 9, 6, darkwashBricks);
		addBlock(world, basePos, 7, 9, 7, darkwashBricks);
		addBlock(world, basePos, 7, 9, 8, darkwashBricks);
		addBlock(world, basePos, 7, 9, 9, darkwashBricks);
		addBlock(world, basePos, 7, 9, 10, darkwashBricks);
		addBlock(world, basePos, 7, 9, 11, darkwashBricks);
		addBlock(world, basePos, 7, 9, 12, darkwashBricks);
		addBlock(world, basePos, 7, 9, 13, darkwashBricks);
		addBlock(world, basePos, 7, 9, 14, darkwashBricks);
		addBlock(world, basePos, 7, 9, 15, darkwashBricks);
		addBlock(world, basePos, 7, 9, 16, darkwashBricks);
		addBlock(world, basePos, 7, 9, 17, darkwashBricks);
		addBlock(world, basePos, 7, 9, 18, darkwashBricks);
		addBlock(world, basePos, 8, 9, 1, darkwashBricks);
		addBlock(world, basePos, 8, 9, 2, darkwashBricks);
		addBlock(world, basePos, 8, 9, 3, darkwashBricks);
		addBlock(world, basePos, 8, 9, 4, darkwashBricks);
		addBlock(world, basePos, 8, 9, 5, darkwashBricks);
		addBlock(world, basePos, 8, 9, 6, darkwashBricks);
		addBlock(world, basePos, 8, 9, 7, darkwashBricks);
		addBlock(world, basePos, 8, 9, 8, darkwashBricks);
		addBlock(world, basePos, 8, 9, 9, darkwashBricks);
		addBlock(world, basePos, 8, 9, 10, darkwashBricks);
		addBlock(world, basePos, 8, 9, 11, darkwashBricks);
		addBlock(world, basePos, 8, 9, 12, darkwashBricks);
		addBlock(world, basePos, 8, 9, 13, darkwashBricks);
		addBlock(world, basePos, 8, 9, 14, darkwashBricks);
		addBlock(world, basePos, 8, 9, 15, darkwashBricks);
		addBlock(world, basePos, 8, 9, 16, darkwashBricks);
		addBlock(world, basePos, 8, 9, 17, darkwashBricks);
		addBlock(world, basePos, 8, 9, 18, darkwashBricks);
	}
}
