package net.tslat.aoa3.worldgen.structures.crystevia;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class WhiteCrystalChunk6 extends AoAStructure { //StructureSize: 2x4x2
	private static final BlockState whiteCrystal = AoABlocks.WHITE_CRYSTAL_BLOCK.get().getDefaultState();

	public WhiteCrystalChunk6() {
		super("WhiteCrystalChunk6");
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 0, whiteCrystal);
		addBlock(world, basePos, 0, 0, 1, whiteCrystal);
		addBlock(world, basePos, 0, 1, 0, whiteCrystal);
		addBlock(world, basePos, 0, 1, 1, whiteCrystal);
		addBlock(world, basePos, 0, 2, 0, whiteCrystal);
		addBlock(world, basePos, 0, 2, 1, whiteCrystal);
		addBlock(world, basePos, 0, 3, 0, whiteCrystal);
		addBlock(world, basePos, 0, 3, 1, whiteCrystal);
		addBlock(world, basePos, 1, 0, 0, whiteCrystal);
		addBlock(world, basePos, 1, 0, 1, whiteCrystal);
		addBlock(world, basePos, 1, 1, 0, whiteCrystal);
		addBlock(world, basePos, 1, 1, 1, whiteCrystal);
		addBlock(world, basePos, 1, 2, 0, whiteCrystal);
		addBlock(world, basePos, 1, 2, 1, whiteCrystal);
		addBlock(world, basePos, 1, 3, 0, whiteCrystal);
		addBlock(world, basePos, 1, 3, 1, whiteCrystal);
	}
}
