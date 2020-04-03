package net.tslat.aoa3.structure.candyland;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class InfestedCandyCane extends AoAStructure { //StructureSize: 12x8x12
	private static final IBlockState redCandy = BlockRegister.candyRed.getDefaultState();
	private static final IBlockState whiteCandy = BlockRegister.candyWhite.getDefaultState();
	private static final IBlockState caneBugSpawner = BlockRegister.spawnerCaneBug.getDefaultState();

	public InfestedCandyCane() {
		super("InfestedCandyCane");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 3, 0, 3, whiteCandy);
		addBlock(world, basePos, 3, 0, 4, whiteCandy);
		addBlock(world, basePos, 3, 0, 7, whiteCandy);
		addBlock(world, basePos, 3, 0, 8, whiteCandy);
		addBlock(world, basePos, 4, 0, 3, whiteCandy);
		addBlock(world, basePos, 4, 0, 4, whiteCandy);
		addBlock(world, basePos, 4, 0, 7, whiteCandy);
		addBlock(world, basePos, 4, 0, 8, whiteCandy);
		addBlock(world, basePos, 5, 0, 5, caneBugSpawner);
		addBlock(world, basePos, 5, 0, 6, caneBugSpawner);
		addBlock(world, basePos, 6, 0, 5, caneBugSpawner);
		addBlock(world, basePos, 6, 0, 6, caneBugSpawner);
		addBlock(world, basePos, 7, 0, 3, whiteCandy);
		addBlock(world, basePos, 7, 0, 4, whiteCandy);
		addBlock(world, basePos, 7, 0, 7, whiteCandy);
		addBlock(world, basePos, 7, 0, 8, whiteCandy);
		addBlock(world, basePos, 8, 0, 3, whiteCandy);
		addBlock(world, basePos, 8, 0, 4, whiteCandy);
		addBlock(world, basePos, 8, 0, 7, whiteCandy);
		addBlock(world, basePos, 8, 0, 8, whiteCandy);
		addBlock(world, basePos, 3, 1, 3, redCandy);
		addBlock(world, basePos, 3, 1, 4, redCandy);
		addBlock(world, basePos, 3, 1, 7, redCandy);
		addBlock(world, basePos, 3, 1, 8, redCandy);
		addBlock(world, basePos, 4, 1, 3, redCandy);
		addBlock(world, basePos, 4, 1, 4, redCandy);
		addBlock(world, basePos, 4, 1, 7, redCandy);
		addBlock(world, basePos, 4, 1, 8, redCandy);
		addBlock(world, basePos, 5, 1, 5, whiteCandy);
		addBlock(world, basePos, 5, 1, 6, whiteCandy);
		addBlock(world, basePos, 6, 1, 5, whiteCandy);
		addBlock(world, basePos, 6, 1, 6, whiteCandy);
		addBlock(world, basePos, 7, 1, 3, redCandy);
		addBlock(world, basePos, 7, 1, 4, redCandy);
		addBlock(world, basePos, 7, 1, 7, redCandy);
		addBlock(world, basePos, 7, 1, 8, redCandy);
		addBlock(world, basePos, 8, 1, 3, redCandy);
		addBlock(world, basePos, 8, 1, 4, redCandy);
		addBlock(world, basePos, 8, 1, 7, redCandy);
		addBlock(world, basePos, 8, 1, 8, redCandy);
		addBlock(world, basePos, 3, 2, 3, whiteCandy);
		addBlock(world, basePos, 3, 2, 4, whiteCandy);
		addBlock(world, basePos, 3, 2, 7, whiteCandy);
		addBlock(world, basePos, 3, 2, 8, whiteCandy);
		addBlock(world, basePos, 4, 2, 3, whiteCandy);
		addBlock(world, basePos, 4, 2, 4, whiteCandy);
		addBlock(world, basePos, 4, 2, 7, whiteCandy);
		addBlock(world, basePos, 4, 2, 8, whiteCandy);
		addBlock(world, basePos, 7, 2, 3, whiteCandy);
		addBlock(world, basePos, 7, 2, 4, whiteCandy);
		addBlock(world, basePos, 7, 2, 7, whiteCandy);
		addBlock(world, basePos, 7, 2, 8, whiteCandy);
		addBlock(world, basePos, 8, 2, 3, whiteCandy);
		addBlock(world, basePos, 8, 2, 4, whiteCandy);
		addBlock(world, basePos, 8, 2, 7, whiteCandy);
		addBlock(world, basePos, 8, 2, 8, whiteCandy);
		addBlock(world, basePos, 3, 3, 3, redCandy);
		addBlock(world, basePos, 3, 3, 4, redCandy);
		addBlock(world, basePos, 3, 3, 7, redCandy);
		addBlock(world, basePos, 3, 3, 8, redCandy);
		addBlock(world, basePos, 4, 3, 3, redCandy);
		addBlock(world, basePos, 4, 3, 4, redCandy);
		addBlock(world, basePos, 4, 3, 7, redCandy);
		addBlock(world, basePos, 4, 3, 8, redCandy);
		addBlock(world, basePos, 7, 3, 3, redCandy);
		addBlock(world, basePos, 7, 3, 4, redCandy);
		addBlock(world, basePos, 7, 3, 7, redCandy);
		addBlock(world, basePos, 7, 3, 8, redCandy);
		addBlock(world, basePos, 8, 3, 3, redCandy);
		addBlock(world, basePos, 8, 3, 4, redCandy);
		addBlock(world, basePos, 8, 3, 7, redCandy);
		addBlock(world, basePos, 8, 3, 8, redCandy);
		addBlock(world, basePos, 0, 4, 7, whiteCandy);
		addBlock(world, basePos, 0, 4, 8, whiteCandy);
		addBlock(world, basePos, 1, 4, 7, whiteCandy);
		addBlock(world, basePos, 1, 4, 8, whiteCandy);
		addBlock(world, basePos, 3, 4, 0, whiteCandy);
		addBlock(world, basePos, 3, 4, 1, whiteCandy);
		addBlock(world, basePos, 3, 4, 3, whiteCandy);
		addBlock(world, basePos, 3, 4, 4, whiteCandy);
		addBlock(world, basePos, 3, 4, 7, whiteCandy);
		addBlock(world, basePos, 3, 4, 8, whiteCandy);
		addBlock(world, basePos, 4, 4, 0, whiteCandy);
		addBlock(world, basePos, 4, 4, 1, whiteCandy);
		addBlock(world, basePos, 4, 4, 3, whiteCandy);
		addBlock(world, basePos, 4, 4, 4, whiteCandy);
		addBlock(world, basePos, 4, 4, 7, whiteCandy);
		addBlock(world, basePos, 4, 4, 8, whiteCandy);
		addBlock(world, basePos, 7, 4, 3, whiteCandy);
		addBlock(world, basePos, 7, 4, 4, whiteCandy);
		addBlock(world, basePos, 7, 4, 7, whiteCandy);
		addBlock(world, basePos, 7, 4, 8, whiteCandy);
		addBlock(world, basePos, 7, 4, 10, whiteCandy);
		addBlock(world, basePos, 7, 4, 11, whiteCandy);
		addBlock(world, basePos, 8, 4, 3, whiteCandy);
		addBlock(world, basePos, 8, 4, 4, whiteCandy);
		addBlock(world, basePos, 8, 4, 7, whiteCandy);
		addBlock(world, basePos, 8, 4, 8, whiteCandy);
		addBlock(world, basePos, 8, 4, 10, whiteCandy);
		addBlock(world, basePos, 8, 4, 11, whiteCandy);
		addBlock(world, basePos, 10, 4, 3, whiteCandy);
		addBlock(world, basePos, 10, 4, 4, whiteCandy);
		addBlock(world, basePos, 11, 4, 3, whiteCandy);
		addBlock(world, basePos, 11, 4, 4, whiteCandy);
		addBlock(world, basePos, 0, 5, 7, redCandy);
		addBlock(world, basePos, 0, 5, 8, redCandy);
		addBlock(world, basePos, 1, 5, 7, redCandy);
		addBlock(world, basePos, 1, 5, 8, redCandy);
		addBlock(world, basePos, 3, 5, 0, redCandy);
		addBlock(world, basePos, 3, 5, 1, redCandy);
		addBlock(world, basePos, 3, 5, 3, redCandy);
		addBlock(world, basePos, 3, 5, 4, redCandy);
		addBlock(world, basePos, 3, 5, 7, redCandy);
		addBlock(world, basePos, 3, 5, 8, redCandy);
		addBlock(world, basePos, 4, 5, 0, redCandy);
		addBlock(world, basePos, 4, 5, 1, redCandy);
		addBlock(world, basePos, 4, 5, 3, redCandy);
		addBlock(world, basePos, 4, 5, 4, redCandy);
		addBlock(world, basePos, 4, 5, 7, redCandy);
		addBlock(world, basePos, 4, 5, 8, redCandy);
		addBlock(world, basePos, 7, 5, 3, redCandy);
		addBlock(world, basePos, 7, 5, 4, redCandy);
		addBlock(world, basePos, 7, 5, 7, redCandy);
		addBlock(world, basePos, 7, 5, 8, redCandy);
		addBlock(world, basePos, 7, 5, 10, redCandy);
		addBlock(world, basePos, 7, 5, 11, redCandy);
		addBlock(world, basePos, 8, 5, 3, redCandy);
		addBlock(world, basePos, 8, 5, 4, redCandy);
		addBlock(world, basePos, 8, 5, 7, redCandy);
		addBlock(world, basePos, 8, 5, 8, redCandy);
		addBlock(world, basePos, 8, 5, 10, redCandy);
		addBlock(world, basePos, 8, 5, 11, redCandy);
		addBlock(world, basePos, 10, 5, 3, redCandy);
		addBlock(world, basePos, 10, 5, 4, redCandy);
		addBlock(world, basePos, 11, 5, 3, redCandy);
		addBlock(world, basePos, 11, 5, 4, redCandy);
		addBlock(world, basePos, 0, 6, 7, whiteCandy);
		addBlock(world, basePos, 0, 6, 8, whiteCandy);
		addBlock(world, basePos, 1, 6, 7, whiteCandy);
		addBlock(world, basePos, 1, 6, 8, whiteCandy);
		addBlock(world, basePos, 2, 6, 7, redCandy);
		addBlock(world, basePos, 2, 6, 8, redCandy);
		addBlock(world, basePos, 3, 6, 0, whiteCandy);
		addBlock(world, basePos, 3, 6, 1, whiteCandy);
		addBlock(world, basePos, 3, 6, 2, redCandy);
		addBlock(world, basePos, 3, 6, 3, whiteCandy);
		addBlock(world, basePos, 3, 6, 4, whiteCandy);
		addBlock(world, basePos, 3, 6, 7, whiteCandy);
		addBlock(world, basePos, 3, 6, 8, whiteCandy);
		addBlock(world, basePos, 4, 6, 0, whiteCandy);
		addBlock(world, basePos, 4, 6, 1, whiteCandy);
		addBlock(world, basePos, 4, 6, 2, redCandy);
		addBlock(world, basePos, 4, 6, 3, whiteCandy);
		addBlock(world, basePos, 4, 6, 4, whiteCandy);
		addBlock(world, basePos, 4, 6, 7, whiteCandy);
		addBlock(world, basePos, 4, 6, 8, whiteCandy);
		addBlock(world, basePos, 7, 6, 3, whiteCandy);
		addBlock(world, basePos, 7, 6, 4, whiteCandy);
		addBlock(world, basePos, 7, 6, 7, whiteCandy);
		addBlock(world, basePos, 7, 6, 8, whiteCandy);
		addBlock(world, basePos, 7, 6, 9, redCandy);
		addBlock(world, basePos, 7, 6, 10, whiteCandy);
		addBlock(world, basePos, 7, 6, 11, whiteCandy);
		addBlock(world, basePos, 8, 6, 3, whiteCandy);
		addBlock(world, basePos, 8, 6, 4, whiteCandy);
		addBlock(world, basePos, 8, 6, 7, whiteCandy);
		addBlock(world, basePos, 8, 6, 8, whiteCandy);
		addBlock(world, basePos, 8, 6, 9, redCandy);
		addBlock(world, basePos, 8, 6, 10, whiteCandy);
		addBlock(world, basePos, 8, 6, 11, whiteCandy);
		addBlock(world, basePos, 9, 6, 3, redCandy);
		addBlock(world, basePos, 9, 6, 4, redCandy);
		addBlock(world, basePos, 10, 6, 3, whiteCandy);
		addBlock(world, basePos, 10, 6, 4, whiteCandy);
		addBlock(world, basePos, 11, 6, 3, whiteCandy);
		addBlock(world, basePos, 11, 6, 4, whiteCandy);
		addBlock(world, basePos, 0, 7, 7, whiteCandy);
		addBlock(world, basePos, 0, 7, 8, whiteCandy);
		addBlock(world, basePos, 1, 7, 7, whiteCandy);
		addBlock(world, basePos, 1, 7, 8, whiteCandy);
		addBlock(world, basePos, 2, 7, 7, redCandy);
		addBlock(world, basePos, 2, 7, 8, redCandy);
		addBlock(world, basePos, 3, 7, 0, whiteCandy);
		addBlock(world, basePos, 3, 7, 1, whiteCandy);
		addBlock(world, basePos, 3, 7, 2, redCandy);
		addBlock(world, basePos, 3, 7, 3, whiteCandy);
		addBlock(world, basePos, 3, 7, 4, whiteCandy);
		addBlock(world, basePos, 3, 7, 7, whiteCandy);
		addBlock(world, basePos, 3, 7, 8, whiteCandy);
		addBlock(world, basePos, 4, 7, 0, whiteCandy);
		addBlock(world, basePos, 4, 7, 1, whiteCandy);
		addBlock(world, basePos, 4, 7, 2, redCandy);
		addBlock(world, basePos, 4, 7, 3, whiteCandy);
		addBlock(world, basePos, 4, 7, 4, whiteCandy);
		addBlock(world, basePos, 4, 7, 7, whiteCandy);
		addBlock(world, basePos, 4, 7, 8, whiteCandy);
		addBlock(world, basePos, 7, 7, 3, whiteCandy);
		addBlock(world, basePos, 7, 7, 4, whiteCandy);
		addBlock(world, basePos, 7, 7, 7, whiteCandy);
		addBlock(world, basePos, 7, 7, 8, whiteCandy);
		addBlock(world, basePos, 7, 7, 9, redCandy);
		addBlock(world, basePos, 7, 7, 10, whiteCandy);
		addBlock(world, basePos, 7, 7, 11, whiteCandy);
		addBlock(world, basePos, 8, 7, 3, whiteCandy);
		addBlock(world, basePos, 8, 7, 4, whiteCandy);
		addBlock(world, basePos, 8, 7, 7, whiteCandy);
		addBlock(world, basePos, 8, 7, 8, whiteCandy);
		addBlock(world, basePos, 8, 7, 9, redCandy);
		addBlock(world, basePos, 8, 7, 10, whiteCandy);
		addBlock(world, basePos, 8, 7, 11, whiteCandy);
		addBlock(world, basePos, 9, 7, 3, redCandy);
		addBlock(world, basePos, 9, 7, 4, redCandy);
		addBlock(world, basePos, 10, 7, 3, whiteCandy);
		addBlock(world, basePos, 10, 7, 4, whiteCandy);
		addBlock(world, basePos, 11, 7, 3, whiteCandy);
		addBlock(world, basePos, 11, 7, 4, whiteCandy);
	}
}
