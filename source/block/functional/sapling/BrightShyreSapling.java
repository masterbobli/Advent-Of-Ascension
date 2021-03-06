package net.tslat.aoa3.block.functional.sapling;

import net.minecraft.block.BlockState;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.tslat.aoa3.block.decoration.sapling.SaplingBlock;
import net.tslat.aoa3.block.generation.leaves.LeavesBlock;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.util.RandomUtil;
import net.tslat.aoa3.worldgen.trees.ShyreTreeGenerator;
import net.tslat.aoa3.worldgen.trees.TreeGenerator;

import java.util.Random;

public class BrightShyreSapling extends SaplingBlock {
	public BrightShyreSapling() {
		super(MaterialColor.FOLIAGE, false);
	}

	@Override
	protected TreeGenerator getTree(ServerWorld world, BlockPos pos, BlockState groundBlock, Random rand) {
		return new ShyreTreeGenerator(this, (LeavesBlock)AoABlocks.BRIGHT_SHYRE_LEAVES.get(), RandomUtil.RANDOM.source());
	}
}
