package net.tslat.aoa3.worldgen.structures.precasia;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class StranglewoodTree2 extends AoAStructure { //StructureSize: 12x15x11
	private static final BlockState stranglewoodLeaves = AoABlocks.STRANGLEWOOD_LEAVES.get().getDefaultState();
	private static final BlockState stranglewoodLog = AoABlocks.STRANGLEWOOD_LOG.get().getDefaultState();

	public StranglewoodTree2() {
		super("StranglewoodTree2");
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 2, 0, 4, stranglewoodLog);
		addBlock(world, basePos, 2, 0, 5, stranglewoodLog);
		addBlock(world, basePos, 2, 0, 6, stranglewoodLog);
		addBlock(world, basePos, 2, 0, 7, stranglewoodLog);
		addBlock(world, basePos, 3, 0, 3, stranglewoodLog);
		addBlock(world, basePos, 3, 0, 4, stranglewoodLog);
		addBlock(world, basePos, 3, 0, 5, stranglewoodLog);
		addBlock(world, basePos, 3, 0, 6, stranglewoodLog);
		addBlock(world, basePos, 3, 0, 7, stranglewoodLog);
		addBlock(world, basePos, 3, 0, 8, stranglewoodLog);
		addBlock(world, basePos, 4, 0, 2, stranglewoodLog);
		addBlock(world, basePos, 4, 0, 3, stranglewoodLog);
		addBlock(world, basePos, 4, 0, 4, stranglewoodLog);
		addBlock(world, basePos, 4, 0, 5, stranglewoodLog);
		addBlock(world, basePos, 4, 0, 6, stranglewoodLog);
		addBlock(world, basePos, 4, 0, 7, stranglewoodLog);
		addBlock(world, basePos, 4, 0, 8, stranglewoodLog);
		addBlock(world, basePos, 4, 0, 9, stranglewoodLog);
		addBlock(world, basePos, 5, 0, 2, stranglewoodLog);
		addBlock(world, basePos, 5, 0, 3, stranglewoodLog);
		addBlock(world, basePos, 5, 0, 4, stranglewoodLog);
		addBlock(world, basePos, 5, 0, 5, stranglewoodLog);
		addBlock(world, basePos, 5, 0, 6, stranglewoodLog);
		addBlock(world, basePos, 5, 0, 7, stranglewoodLog);
		addBlock(world, basePos, 5, 0, 8, stranglewoodLog);
		addBlock(world, basePos, 5, 0, 9, stranglewoodLog);
		addBlock(world, basePos, 6, 0, 2, stranglewoodLog);
		addBlock(world, basePos, 6, 0, 3, stranglewoodLog);
		addBlock(world, basePos, 6, 0, 4, stranglewoodLog);
		addBlock(world, basePos, 6, 0, 5, stranglewoodLog);
		addBlock(world, basePos, 6, 0, 6, stranglewoodLog);
		addBlock(world, basePos, 6, 0, 7, stranglewoodLog);
		addBlock(world, basePos, 6, 0, 8, stranglewoodLog);
		addBlock(world, basePos, 6, 0, 9, stranglewoodLog);
		addBlock(world, basePos, 7, 0, 2, stranglewoodLog);
		addBlock(world, basePos, 7, 0, 3, stranglewoodLog);
		addBlock(world, basePos, 7, 0, 4, stranglewoodLog);
		addBlock(world, basePos, 7, 0, 5, stranglewoodLog);
		addBlock(world, basePos, 7, 0, 6, stranglewoodLog);
		addBlock(world, basePos, 7, 0, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 0, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 0, 9, stranglewoodLog);
		addBlock(world, basePos, 8, 0, 3, stranglewoodLog);
		addBlock(world, basePos, 8, 0, 4, stranglewoodLog);
		addBlock(world, basePos, 8, 0, 5, stranglewoodLog);
		addBlock(world, basePos, 8, 0, 6, stranglewoodLog);
		addBlock(world, basePos, 8, 0, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 0, 8, stranglewoodLog);
		addBlock(world, basePos, 9, 0, 4, stranglewoodLog);
		addBlock(world, basePos, 9, 0, 5, stranglewoodLog);
		addBlock(world, basePos, 9, 0, 6, stranglewoodLog);
		addBlock(world, basePos, 9, 0, 7, stranglewoodLog);
		addBlock(world, basePos, 3, 1, 4, stranglewoodLog);
		addBlock(world, basePos, 3, 1, 5, stranglewoodLog);
		addBlock(world, basePos, 3, 1, 6, stranglewoodLog);
		addBlock(world, basePos, 3, 1, 7, stranglewoodLog);
		addBlock(world, basePos, 4, 1, 3, stranglewoodLog);
		addBlock(world, basePos, 4, 1, 4, stranglewoodLog);
		addBlock(world, basePos, 4, 1, 5, stranglewoodLog);
		addBlock(world, basePos, 4, 1, 6, stranglewoodLog);
		addBlock(world, basePos, 4, 1, 7, stranglewoodLog);
		addBlock(world, basePos, 4, 1, 8, stranglewoodLog);
		addBlock(world, basePos, 5, 1, 3, stranglewoodLog);
		addBlock(world, basePos, 5, 1, 4, stranglewoodLog);
		addBlock(world, basePos, 5, 1, 5, stranglewoodLog);
		addBlock(world, basePos, 5, 1, 6, stranglewoodLog);
		addBlock(world, basePos, 5, 1, 7, stranglewoodLog);
		addBlock(world, basePos, 5, 1, 8, stranglewoodLog);
		addBlock(world, basePos, 6, 1, 3, stranglewoodLog);
		addBlock(world, basePos, 6, 1, 4, stranglewoodLog);
		addBlock(world, basePos, 6, 1, 5, stranglewoodLog);
		addBlock(world, basePos, 6, 1, 6, stranglewoodLog);
		addBlock(world, basePos, 6, 1, 7, stranglewoodLog);
		addBlock(world, basePos, 6, 1, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 1, 3, stranglewoodLog);
		addBlock(world, basePos, 7, 1, 4, stranglewoodLog);
		addBlock(world, basePos, 7, 1, 5, stranglewoodLog);
		addBlock(world, basePos, 7, 1, 6, stranglewoodLog);
		addBlock(world, basePos, 7, 1, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 1, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 1, 4, stranglewoodLog);
		addBlock(world, basePos, 8, 1, 5, stranglewoodLog);
		addBlock(world, basePos, 8, 1, 6, stranglewoodLog);
		addBlock(world, basePos, 8, 1, 7, stranglewoodLog);
		addBlock(world, basePos, 4, 2, 4, stranglewoodLog);
		addBlock(world, basePos, 4, 2, 5, stranglewoodLog);
		addBlock(world, basePos, 4, 2, 6, stranglewoodLog);
		addBlock(world, basePos, 4, 2, 7, stranglewoodLog);
		addBlock(world, basePos, 5, 2, 4, stranglewoodLog);
		addBlock(world, basePos, 5, 2, 5, stranglewoodLog);
		addBlock(world, basePos, 5, 2, 6, stranglewoodLog);
		addBlock(world, basePos, 5, 2, 7, stranglewoodLog);
		addBlock(world, basePos, 6, 2, 4, stranglewoodLog);
		addBlock(world, basePos, 6, 2, 5, stranglewoodLog);
		addBlock(world, basePos, 6, 2, 6, stranglewoodLog);
		addBlock(world, basePos, 6, 2, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 2, 4, stranglewoodLog);
		addBlock(world, basePos, 7, 2, 5, stranglewoodLog);
		addBlock(world, basePos, 7, 2, 6, stranglewoodLog);
		addBlock(world, basePos, 7, 2, 7, stranglewoodLog);
		addBlock(world, basePos, 5, 3, 5, stranglewoodLog);
		addBlock(world, basePos, 5, 3, 6, stranglewoodLog);
		addBlock(world, basePos, 6, 3, 5, stranglewoodLog);
		addBlock(world, basePos, 6, 3, 6, stranglewoodLog);
		addBlock(world, basePos, 5, 4, 5, stranglewoodLog);
		addBlock(world, basePos, 5, 4, 6, stranglewoodLog);
		addBlock(world, basePos, 6, 4, 5, stranglewoodLog);
		addBlock(world, basePos, 6, 4, 6, stranglewoodLog);
		addBlock(world, basePos, 5, 5, 5, stranglewoodLog);
		addBlock(world, basePos, 5, 5, 6, stranglewoodLog);
		addBlock(world, basePos, 6, 5, 5, stranglewoodLog);
		addBlock(world, basePos, 6, 5, 6, stranglewoodLog);
		addBlock(world, basePos, 5, 6, 5, stranglewoodLog);
		addBlock(world, basePos, 5, 6, 6, stranglewoodLog);
		addBlock(world, basePos, 6, 6, 5, stranglewoodLog);
		addBlock(world, basePos, 6, 6, 6, stranglewoodLog);
		addBlock(world, basePos, 5, 7, 5, stranglewoodLog);
		addBlock(world, basePos, 5, 7, 6, stranglewoodLog);
		addBlock(world, basePos, 6, 7, 5, stranglewoodLog);
		addBlock(world, basePos, 6, 7, 6, stranglewoodLog);
		addBlock(world, basePos, 5, 8, 5, stranglewoodLog);
		addBlock(world, basePos, 5, 8, 6, stranglewoodLog);
		addBlock(world, basePos, 6, 8, 5, stranglewoodLog);
		addBlock(world, basePos, 6, 8, 6, stranglewoodLog);
		addBlock(world, basePos, 4, 9, 5, stranglewoodLog);
		addBlock(world, basePos, 4, 9, 6, stranglewoodLog);
		addBlock(world, basePos, 5, 9, 4, stranglewoodLog);
		addBlock(world, basePos, 5, 9, 5, stranglewoodLog);
		addBlock(world, basePos, 5, 9, 6, stranglewoodLog);
		addBlock(world, basePos, 5, 9, 7, stranglewoodLog);
		addBlock(world, basePos, 6, 9, 4, stranglewoodLog);
		addBlock(world, basePos, 6, 9, 5, stranglewoodLog);
		addBlock(world, basePos, 6, 9, 6, stranglewoodLog);
		addBlock(world, basePos, 6, 9, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 9, 5, stranglewoodLog);
		addBlock(world, basePos, 7, 9, 6, stranglewoodLog);
		addBlock(world, basePos, 3, 10, 5, stranglewoodLog);
		addBlock(world, basePos, 3, 10, 6, stranglewoodLog);
		addBlock(world, basePos, 5, 10, 3, stranglewoodLog);
		addBlock(world, basePos, 5, 10, 5, stranglewoodLog);
		addBlock(world, basePos, 5, 10, 6, stranglewoodLog);
		addBlock(world, basePos, 5, 10, 8, stranglewoodLog);
		addBlock(world, basePos, 6, 10, 3, stranglewoodLog);
		addBlock(world, basePos, 6, 10, 5, stranglewoodLog);
		addBlock(world, basePos, 6, 10, 6, stranglewoodLog);
		addBlock(world, basePos, 6, 10, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 10, 5, stranglewoodLog);
		addBlock(world, basePos, 8, 10, 6, stranglewoodLog);
		addBlock(world, basePos, 1, 11, 5, stranglewoodLeaves);
		addBlock(world, basePos, 1, 11, 6, stranglewoodLeaves);
		addBlock(world, basePos, 2, 11, 4, stranglewoodLeaves);
		addBlock(world, basePos, 2, 11, 5, stranglewoodLog);
		addBlock(world, basePos, 2, 11, 6, stranglewoodLog);
		addBlock(world, basePos, 2, 11, 7, stranglewoodLeaves);
		addBlock(world, basePos, 4, 11, 2, stranglewoodLeaves);
		addBlock(world, basePos, 4, 11, 5, stranglewoodLeaves);
		addBlock(world, basePos, 4, 11, 6, stranglewoodLeaves);
		addBlock(world, basePos, 4, 11, 9, stranglewoodLeaves);
		addBlock(world, basePos, 5, 11, 1, stranglewoodLeaves);
		addBlock(world, basePos, 5, 11, 2, stranglewoodLog);
		addBlock(world, basePos, 5, 11, 4, stranglewoodLeaves);
		addBlock(world, basePos, 5, 11, 5, stranglewoodLog);
		addBlock(world, basePos, 5, 11, 6, stranglewoodLog);
		addBlock(world, basePos, 5, 11, 7, stranglewoodLeaves);
		addBlock(world, basePos, 5, 11, 9, stranglewoodLog);
		addBlock(world, basePos, 5, 11, 10, stranglewoodLeaves);
		addBlock(world, basePos, 6, 11, 1, stranglewoodLeaves);
		addBlock(world, basePos, 6, 11, 2, stranglewoodLog);
		addBlock(world, basePos, 6, 11, 4, stranglewoodLeaves);
		addBlock(world, basePos, 6, 11, 5, stranglewoodLog);
		addBlock(world, basePos, 6, 11, 6, stranglewoodLog);
		addBlock(world, basePos, 6, 11, 7, stranglewoodLeaves);
		addBlock(world, basePos, 6, 11, 9, stranglewoodLog);
		addBlock(world, basePos, 6, 11, 10, stranglewoodLeaves);
		addBlock(world, basePos, 7, 11, 2, stranglewoodLeaves);
		addBlock(world, basePos, 7, 11, 5, stranglewoodLeaves);
		addBlock(world, basePos, 7, 11, 6, stranglewoodLeaves);
		addBlock(world, basePos, 7, 11, 9, stranglewoodLeaves);
		addBlock(world, basePos, 9, 11, 4, stranglewoodLeaves);
		addBlock(world, basePos, 9, 11, 5, stranglewoodLog);
		addBlock(world, basePos, 9, 11, 6, stranglewoodLog);
		addBlock(world, basePos, 9, 11, 7, stranglewoodLeaves);
		addBlock(world, basePos, 10, 11, 5, stranglewoodLeaves);
		addBlock(world, basePos, 10, 11, 6, stranglewoodLeaves);
		addBlock(world, basePos, 0, 12, 5, stranglewoodLeaves);
		addBlock(world, basePos, 0, 12, 6, stranglewoodLeaves);
		addBlock(world, basePos, 1, 12, 4, stranglewoodLeaves);
		addBlock(world, basePos, 1, 12, 5, stranglewoodLeaves);
		addBlock(world, basePos, 1, 12, 6, stranglewoodLeaves);
		addBlock(world, basePos, 1, 12, 7, stranglewoodLeaves);
		addBlock(world, basePos, 2, 12, 3, stranglewoodLeaves);
		addBlock(world, basePos, 2, 12, 4, stranglewoodLeaves);
		addBlock(world, basePos, 2, 12, 5, stranglewoodLeaves);
		addBlock(world, basePos, 2, 12, 6, stranglewoodLeaves);
		addBlock(world, basePos, 2, 12, 7, stranglewoodLeaves);
		addBlock(world, basePos, 2, 12, 8, stranglewoodLeaves);
		addBlock(world, basePos, 3, 12, 2, stranglewoodLeaves);
		addBlock(world, basePos, 3, 12, 3, stranglewoodLeaves);
		addBlock(world, basePos, 3, 12, 4, stranglewoodLeaves);
		addBlock(world, basePos, 3, 12, 5, stranglewoodLeaves);
		addBlock(world, basePos, 3, 12, 6, stranglewoodLeaves);
		addBlock(world, basePos, 3, 12, 7, stranglewoodLeaves);
		addBlock(world, basePos, 3, 12, 8, stranglewoodLeaves);
		addBlock(world, basePos, 3, 12, 9, stranglewoodLeaves);
		addBlock(world, basePos, 4, 12, 1, stranglewoodLeaves);
		addBlock(world, basePos, 4, 12, 2, stranglewoodLeaves);
		addBlock(world, basePos, 4, 12, 3, stranglewoodLeaves);
		addBlock(world, basePos, 4, 12, 4, stranglewoodLeaves);
		addBlock(world, basePos, 4, 12, 5, stranglewoodLeaves);
		addBlock(world, basePos, 4, 12, 6, stranglewoodLeaves);
		addBlock(world, basePos, 4, 12, 7, stranglewoodLeaves);
		addBlock(world, basePos, 4, 12, 8, stranglewoodLeaves);
		addBlock(world, basePos, 4, 12, 9, stranglewoodLeaves);
		addBlock(world, basePos, 4, 12, 10, stranglewoodLeaves);
		addBlock(world, basePos, 5, 12, 0, stranglewoodLeaves);
		addBlock(world, basePos, 5, 12, 1, stranglewoodLeaves);
		addBlock(world, basePos, 5, 12, 2, stranglewoodLeaves);
		addBlock(world, basePos, 5, 12, 3, stranglewoodLeaves);
		addBlock(world, basePos, 5, 12, 4, stranglewoodLeaves);
		addBlock(world, basePos, 5, 12, 5, stranglewoodLeaves);
		addBlock(world, basePos, 5, 12, 6, stranglewoodLeaves);
		addBlock(world, basePos, 5, 12, 7, stranglewoodLeaves);
		addBlock(world, basePos, 5, 12, 8, stranglewoodLeaves);
		addBlock(world, basePos, 5, 12, 9, stranglewoodLeaves);
		addBlock(world, basePos, 5, 12, 10, stranglewoodLeaves);
		addBlock(world, basePos, 6, 12, 0, stranglewoodLeaves);
		addBlock(world, basePos, 6, 12, 1, stranglewoodLeaves);
		addBlock(world, basePos, 6, 12, 2, stranglewoodLeaves);
		addBlock(world, basePos, 6, 12, 3, stranglewoodLeaves);
		addBlock(world, basePos, 6, 12, 4, stranglewoodLeaves);
		addBlock(world, basePos, 6, 12, 5, stranglewoodLeaves);
		addBlock(world, basePos, 6, 12, 6, stranglewoodLeaves);
		addBlock(world, basePos, 6, 12, 7, stranglewoodLeaves);
		addBlock(world, basePos, 6, 12, 8, stranglewoodLeaves);
		addBlock(world, basePos, 6, 12, 9, stranglewoodLeaves);
		addBlock(world, basePos, 6, 12, 10, stranglewoodLeaves);
		addBlock(world, basePos, 7, 12, 1, stranglewoodLeaves);
		addBlock(world, basePos, 7, 12, 2, stranglewoodLeaves);
		addBlock(world, basePos, 7, 12, 3, stranglewoodLeaves);
		addBlock(world, basePos, 7, 12, 4, stranglewoodLeaves);
		addBlock(world, basePos, 7, 12, 5, stranglewoodLeaves);
		addBlock(world, basePos, 7, 12, 6, stranglewoodLeaves);
		addBlock(world, basePos, 7, 12, 7, stranglewoodLeaves);
		addBlock(world, basePos, 7, 12, 8, stranglewoodLeaves);
		addBlock(world, basePos, 7, 12, 9, stranglewoodLeaves);
		addBlock(world, basePos, 7, 12, 10, stranglewoodLeaves);
		addBlock(world, basePos, 8, 12, 2, stranglewoodLeaves);
		addBlock(world, basePos, 8, 12, 3, stranglewoodLeaves);
		addBlock(world, basePos, 8, 12, 4, stranglewoodLeaves);
		addBlock(world, basePos, 8, 12, 5, stranglewoodLeaves);
		addBlock(world, basePos, 8, 12, 6, stranglewoodLeaves);
		addBlock(world, basePos, 8, 12, 7, stranglewoodLeaves);
		addBlock(world, basePos, 8, 12, 8, stranglewoodLeaves);
		addBlock(world, basePos, 8, 12, 9, stranglewoodLeaves);
		addBlock(world, basePos, 9, 12, 3, stranglewoodLeaves);
		addBlock(world, basePos, 9, 12, 4, stranglewoodLeaves);
		addBlock(world, basePos, 9, 12, 5, stranglewoodLeaves);
		addBlock(world, basePos, 9, 12, 6, stranglewoodLeaves);
		addBlock(world, basePos, 9, 12, 7, stranglewoodLeaves);
		addBlock(world, basePos, 9, 12, 8, stranglewoodLeaves);
		addBlock(world, basePos, 10, 12, 4, stranglewoodLeaves);
		addBlock(world, basePos, 10, 12, 5, stranglewoodLeaves);
		addBlock(world, basePos, 10, 12, 6, stranglewoodLeaves);
		addBlock(world, basePos, 10, 12, 7, stranglewoodLeaves);
		addBlock(world, basePos, 11, 12, 5, stranglewoodLeaves);
		addBlock(world, basePos, 11, 12, 6, stranglewoodLeaves);
		addBlock(world, basePos, 1, 13, 5, stranglewoodLeaves);
		addBlock(world, basePos, 1, 13, 6, stranglewoodLeaves);
		addBlock(world, basePos, 2, 13, 4, stranglewoodLeaves);
		addBlock(world, basePos, 2, 13, 5, stranglewoodLeaves);
		addBlock(world, basePos, 2, 13, 6, stranglewoodLeaves);
		addBlock(world, basePos, 2, 13, 7, stranglewoodLeaves);
		addBlock(world, basePos, 3, 13, 3, stranglewoodLeaves);
		addBlock(world, basePos, 3, 13, 4, stranglewoodLeaves);
		addBlock(world, basePos, 3, 13, 5, stranglewoodLeaves);
		addBlock(world, basePos, 3, 13, 6, stranglewoodLeaves);
		addBlock(world, basePos, 3, 13, 7, stranglewoodLeaves);
		addBlock(world, basePos, 3, 13, 8, stranglewoodLeaves);
		addBlock(world, basePos, 4, 13, 2, stranglewoodLeaves);
		addBlock(world, basePos, 4, 13, 3, stranglewoodLeaves);
		addBlock(world, basePos, 4, 13, 4, stranglewoodLeaves);
		addBlock(world, basePos, 4, 13, 5, stranglewoodLeaves);
		addBlock(world, basePos, 4, 13, 6, stranglewoodLeaves);
		addBlock(world, basePos, 4, 13, 7, stranglewoodLeaves);
		addBlock(world, basePos, 4, 13, 8, stranglewoodLeaves);
		addBlock(world, basePos, 4, 13, 9, stranglewoodLeaves);
		addBlock(world, basePos, 5, 13, 1, stranglewoodLeaves);
		addBlock(world, basePos, 5, 13, 2, stranglewoodLeaves);
		addBlock(world, basePos, 5, 13, 3, stranglewoodLeaves);
		addBlock(world, basePos, 5, 13, 4, stranglewoodLeaves);
		addBlock(world, basePos, 5, 13, 5, stranglewoodLeaves);
		addBlock(world, basePos, 5, 13, 6, stranglewoodLeaves);
		addBlock(world, basePos, 5, 13, 7, stranglewoodLeaves);
		addBlock(world, basePos, 5, 13, 8, stranglewoodLeaves);
		addBlock(world, basePos, 5, 13, 9, stranglewoodLeaves);
		addBlock(world, basePos, 5, 13, 10, stranglewoodLeaves);
		addBlock(world, basePos, 6, 13, 1, stranglewoodLeaves);
		addBlock(world, basePos, 6, 13, 2, stranglewoodLeaves);
		addBlock(world, basePos, 6, 13, 3, stranglewoodLeaves);
		addBlock(world, basePos, 6, 13, 4, stranglewoodLeaves);
		addBlock(world, basePos, 6, 13, 5, stranglewoodLeaves);
		addBlock(world, basePos, 6, 13, 6, stranglewoodLeaves);
		addBlock(world, basePos, 6, 13, 7, stranglewoodLeaves);
		addBlock(world, basePos, 6, 13, 8, stranglewoodLeaves);
		addBlock(world, basePos, 6, 13, 9, stranglewoodLeaves);
		addBlock(world, basePos, 6, 13, 10, stranglewoodLeaves);
		addBlock(world, basePos, 7, 13, 2, stranglewoodLeaves);
		addBlock(world, basePos, 7, 13, 3, stranglewoodLeaves);
		addBlock(world, basePos, 7, 13, 4, stranglewoodLeaves);
		addBlock(world, basePos, 7, 13, 5, stranglewoodLeaves);
		addBlock(world, basePos, 7, 13, 6, stranglewoodLeaves);
		addBlock(world, basePos, 7, 13, 7, stranglewoodLeaves);
		addBlock(world, basePos, 7, 13, 8, stranglewoodLeaves);
		addBlock(world, basePos, 7, 13, 9, stranglewoodLeaves);
		addBlock(world, basePos, 8, 13, 3, stranglewoodLeaves);
		addBlock(world, basePos, 8, 13, 4, stranglewoodLeaves);
		addBlock(world, basePos, 8, 13, 5, stranglewoodLeaves);
		addBlock(world, basePos, 8, 13, 6, stranglewoodLeaves);
		addBlock(world, basePos, 8, 13, 7, stranglewoodLeaves);
		addBlock(world, basePos, 8, 13, 8, stranglewoodLeaves);
		addBlock(world, basePos, 9, 13, 4, stranglewoodLeaves);
		addBlock(world, basePos, 9, 13, 5, stranglewoodLeaves);
		addBlock(world, basePos, 9, 13, 6, stranglewoodLeaves);
		addBlock(world, basePos, 9, 13, 7, stranglewoodLeaves);
		addBlock(world, basePos, 10, 13, 5, stranglewoodLeaves);
		addBlock(world, basePos, 10, 13, 6, stranglewoodLeaves);
		addBlock(world, basePos, 2, 14, 5, stranglewoodLeaves);
		addBlock(world, basePos, 2, 14, 6, stranglewoodLeaves);
		addBlock(world, basePos, 3, 14, 4, stranglewoodLeaves);
		addBlock(world, basePos, 3, 14, 5, stranglewoodLeaves);
		addBlock(world, basePos, 3, 14, 6, stranglewoodLeaves);
		addBlock(world, basePos, 3, 14, 7, stranglewoodLeaves);
		addBlock(world, basePos, 4, 14, 3, stranglewoodLeaves);
		addBlock(world, basePos, 4, 14, 4, stranglewoodLeaves);
		addBlock(world, basePos, 4, 14, 5, stranglewoodLeaves);
		addBlock(world, basePos, 4, 14, 6, stranglewoodLeaves);
		addBlock(world, basePos, 4, 14, 7, stranglewoodLeaves);
		addBlock(world, basePos, 4, 14, 8, stranglewoodLeaves);
		addBlock(world, basePos, 5, 14, 2, stranglewoodLeaves);
		addBlock(world, basePos, 5, 14, 3, stranglewoodLeaves);
		addBlock(world, basePos, 5, 14, 4, stranglewoodLeaves);
		addBlock(world, basePos, 5, 14, 5, stranglewoodLeaves);
		addBlock(world, basePos, 5, 14, 6, stranglewoodLeaves);
		addBlock(world, basePos, 5, 14, 7, stranglewoodLeaves);
		addBlock(world, basePos, 5, 14, 8, stranglewoodLeaves);
		addBlock(world, basePos, 5, 14, 9, stranglewoodLeaves);
		addBlock(world, basePos, 6, 14, 2, stranglewoodLeaves);
		addBlock(world, basePos, 6, 14, 3, stranglewoodLeaves);
		addBlock(world, basePos, 6, 14, 4, stranglewoodLeaves);
		addBlock(world, basePos, 6, 14, 5, stranglewoodLeaves);
		addBlock(world, basePos, 6, 14, 6, stranglewoodLeaves);
		addBlock(world, basePos, 6, 14, 7, stranglewoodLeaves);
		addBlock(world, basePos, 6, 14, 8, stranglewoodLeaves);
		addBlock(world, basePos, 6, 14, 9, stranglewoodLeaves);
		addBlock(world, basePos, 7, 14, 3, stranglewoodLeaves);
		addBlock(world, basePos, 7, 14, 4, stranglewoodLeaves);
		addBlock(world, basePos, 7, 14, 5, stranglewoodLeaves);
		addBlock(world, basePos, 7, 14, 6, stranglewoodLeaves);
		addBlock(world, basePos, 7, 14, 7, stranglewoodLeaves);
		addBlock(world, basePos, 7, 14, 8, stranglewoodLeaves);
		addBlock(world, basePos, 8, 14, 4, stranglewoodLeaves);
		addBlock(world, basePos, 8, 14, 5, stranglewoodLeaves);
		addBlock(world, basePos, 8, 14, 6, stranglewoodLeaves);
		addBlock(world, basePos, 8, 14, 7, stranglewoodLeaves);
		addBlock(world, basePos, 9, 14, 5, stranglewoodLeaves);
		addBlock(world, basePos, 9, 14, 6, stranglewoodLeaves);
	}
}
