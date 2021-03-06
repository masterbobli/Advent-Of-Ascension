package net.tslat.aoa3.worldgen.structures.crystevia;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.entity.npc.trader.CrystalTraderEntity;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class CrystalTradingPost extends AoAStructure { //StructureSize: 9x3x9
	private static final BlockState crystevianBricks = AoABlocks.CRYSTEVIA_BRICKS.get().getDefaultState();
	private static final BlockState redCrystal = AoABlocks.RED_CRYSTAL_BLOCK.get().getDefaultState();

	public CrystalTradingPost() {
		super("CrystalTradingPost");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		int y = -1;

		while (world.getBlockState(basePos.add(4, y, 4)).getBlock() == Blocks.AIR) {
			addBlock(world, basePos, 4, y, 4, redCrystal);
			y--;
		}

		addBlock(world, basePos, 0, 0, 0, crystevianBricks);
		addBlock(world, basePos, 0, 0, 1, crystevianBricks);
		addBlock(world, basePos, 0, 0, 2, crystevianBricks);
		addBlock(world, basePos, 0, 0, 3, crystevianBricks);
		addBlock(world, basePos, 0, 0, 4, crystevianBricks);
		addBlock(world, basePos, 0, 0, 5, crystevianBricks);
		addBlock(world, basePos, 0, 0, 6, crystevianBricks);
		addBlock(world, basePos, 0, 0, 7, crystevianBricks);
		addBlock(world, basePos, 0, 0, 8, crystevianBricks);
		addBlock(world, basePos, 1, 0, 0, crystevianBricks);
		addBlock(world, basePos, 1, 0, 1, crystevianBricks);
		addBlock(world, basePos, 1, 0, 2, crystevianBricks);
		addBlock(world, basePos, 1, 0, 3, redCrystal);
		addBlock(world, basePos, 1, 0, 4, redCrystal);
		addBlock(world, basePos, 1, 0, 5, redCrystal);
		addBlock(world, basePos, 1, 0, 6, crystevianBricks);
		addBlock(world, basePos, 1, 0, 7, crystevianBricks);
		addBlock(world, basePos, 1, 0, 8, crystevianBricks);
		addBlock(world, basePos, 2, 0, 0, crystevianBricks);
		addBlock(world, basePos, 2, 0, 1, crystevianBricks);
		addBlock(world, basePos, 2, 0, 2, crystevianBricks);
		addBlock(world, basePos, 2, 0, 3, crystevianBricks);
		addBlock(world, basePos, 2, 0, 4, redCrystal);
		addBlock(world, basePos, 2, 0, 5, crystevianBricks);
		addBlock(world, basePos, 2, 0, 6, crystevianBricks);
		addBlock(world, basePos, 2, 0, 7, crystevianBricks);
		addBlock(world, basePos, 2, 0, 8, crystevianBricks);
		addBlock(world, basePos, 3, 0, 0, crystevianBricks);
		addBlock(world, basePos, 3, 0, 1, redCrystal);
		addBlock(world, basePos, 3, 0, 2, crystevianBricks);
		addBlock(world, basePos, 3, 0, 3, crystevianBricks);
		addBlock(world, basePos, 3, 0, 4, crystevianBricks);
		addBlock(world, basePos, 3, 0, 5, crystevianBricks);
		addBlock(world, basePos, 3, 0, 6, crystevianBricks);
		addBlock(world, basePos, 3, 0, 7, redCrystal);
		addBlock(world, basePos, 3, 0, 8, crystevianBricks);
		addBlock(world, basePos, 4, 0, 0, crystevianBricks);
		addBlock(world, basePos, 4, 0, 1, redCrystal);
		addBlock(world, basePos, 4, 0, 2, redCrystal);
		addBlock(world, basePos, 4, 0, 3, crystevianBricks);
		addBlock(world, basePos, 4, 0, 4, crystevianBricks);
		addBlock(world, basePos, 4, 0, 5, crystevianBricks);
		addBlock(world, basePos, 4, 0, 6, redCrystal);
		addBlock(world, basePos, 4, 0, 7, redCrystal);
		addBlock(world, basePos, 4, 0, 8, crystevianBricks);
		addBlock(world, basePos, 5, 0, 0, crystevianBricks);
		addBlock(world, basePos, 5, 0, 1, redCrystal);
		addBlock(world, basePos, 5, 0, 2, crystevianBricks);
		addBlock(world, basePos, 5, 0, 3, crystevianBricks);
		addBlock(world, basePos, 5, 0, 4, crystevianBricks);
		addBlock(world, basePos, 5, 0, 5, crystevianBricks);
		addBlock(world, basePos, 5, 0, 6, crystevianBricks);
		addBlock(world, basePos, 5, 0, 7, redCrystal);
		addBlock(world, basePos, 5, 0, 8, crystevianBricks);
		addBlock(world, basePos, 6, 0, 0, crystevianBricks);
		addBlock(world, basePos, 6, 0, 1, crystevianBricks);
		addBlock(world, basePos, 6, 0, 2, crystevianBricks);
		addBlock(world, basePos, 6, 0, 3, crystevianBricks);
		addBlock(world, basePos, 6, 0, 4, redCrystal);
		addBlock(world, basePos, 6, 0, 5, crystevianBricks);
		addBlock(world, basePos, 6, 0, 6, crystevianBricks);
		addBlock(world, basePos, 6, 0, 7, crystevianBricks);
		addBlock(world, basePos, 6, 0, 8, crystevianBricks);
		addBlock(world, basePos, 7, 0, 0, crystevianBricks);
		addBlock(world, basePos, 7, 0, 1, crystevianBricks);
		addBlock(world, basePos, 7, 0, 2, crystevianBricks);
		addBlock(world, basePos, 7, 0, 3, redCrystal);
		addBlock(world, basePos, 7, 0, 4, redCrystal);
		addBlock(world, basePos, 7, 0, 5, redCrystal);
		addBlock(world, basePos, 7, 0, 6, crystevianBricks);
		addBlock(world, basePos, 7, 0, 7, crystevianBricks);
		addBlock(world, basePos, 7, 0, 8, crystevianBricks);
		addBlock(world, basePos, 8, 0, 0, crystevianBricks);
		addBlock(world, basePos, 8, 0, 1, crystevianBricks);
		addBlock(world, basePos, 8, 0, 2, crystevianBricks);
		addBlock(world, basePos, 8, 0, 3, crystevianBricks);
		addBlock(world, basePos, 8, 0, 4, crystevianBricks);
		addBlock(world, basePos, 8, 0, 5, crystevianBricks);
		addBlock(world, basePos, 8, 0, 6, crystevianBricks);
		addBlock(world, basePos, 8, 0, 7, crystevianBricks);
		addBlock(world, basePos, 8, 0, 8, crystevianBricks);
		addBlock(world, basePos, 0, 1, 0, crystevianBricks);
		addBlock(world, basePos, 0, 1, 1, redCrystal);
		addBlock(world, basePos, 0, 1, 2, crystevianBricks);
		addBlock(world, basePos, 0, 1, 6, crystevianBricks);
		addBlock(world, basePos, 0, 1, 7, redCrystal);
		addBlock(world, basePos, 0, 1, 8, crystevianBricks);
		addBlock(world, basePos, 1, 1, 0, redCrystal);
		addBlock(world, basePos, 1, 1, 8, redCrystal);
		addBlock(world, basePos, 2, 1, 0, crystevianBricks);
		addBlock(world, basePos, 2, 1, 8, crystevianBricks);
		addBlock(world, basePos, 6, 1, 0, crystevianBricks);
		addBlock(world, basePos, 6, 1, 8, crystevianBricks);
		addBlock(world, basePos, 7, 1, 0, redCrystal);
		addBlock(world, basePos, 7, 1, 8, redCrystal);
		addBlock(world, basePos, 8, 1, 0, crystevianBricks);
		addBlock(world, basePos, 8, 1, 1, redCrystal);
		addBlock(world, basePos, 8, 1, 2, crystevianBricks);
		addBlock(world, basePos, 8, 1, 6, crystevianBricks);
		addBlock(world, basePos, 8, 1, 7, redCrystal);
		addBlock(world, basePos, 8, 1, 8, crystevianBricks);
		addBlock(world, basePos, 0, 2, 0, crystevianBricks);
		addBlock(world, basePos, 0, 2, 1, crystevianBricks);
		addBlock(world, basePos, 0, 2, 2, crystevianBricks);
		addBlock(world, basePos, 0, 2, 6, crystevianBricks);
		addBlock(world, basePos, 0, 2, 7, crystevianBricks);
		addBlock(world, basePos, 0, 2, 8, crystevianBricks);
		addBlock(world, basePos, 1, 2, 0, crystevianBricks);
		addBlock(world, basePos, 1, 2, 8, crystevianBricks);
		addBlock(world, basePos, 2, 2, 0, crystevianBricks);
		addBlock(world, basePos, 2, 2, 8, crystevianBricks);
		addBlock(world, basePos, 6, 2, 0, crystevianBricks);
		addBlock(world, basePos, 6, 2, 8, crystevianBricks);
		addBlock(world, basePos, 7, 2, 0, crystevianBricks);
		addBlock(world, basePos, 7, 2, 8, crystevianBricks);
		addBlock(world, basePos, 8, 2, 0, crystevianBricks);
		addBlock(world, basePos, 8, 2, 1, crystevianBricks);
		addBlock(world, basePos, 8, 2, 2, crystevianBricks);
		addBlock(world, basePos, 8, 2, 6, crystevianBricks);
		addBlock(world, basePos, 8, 2, 7, crystevianBricks);
		addBlock(world, basePos, 8, 2, 8, crystevianBricks);
	}

	@Override
	protected void spawnEntities(IWorld world, Random rand, BlockPos basePos) {
		CrystalTraderEntity trader = new CrystalTraderEntity(AoAEntities.NPCs.CRYSTAL_TRADER.get(), world.getWorld());

		trader.setLocationAndAngles(basePos.getX() + 4, basePos.getY() + 1, basePos.getZ() + 4, rand.nextFloat() * 360, 0);
		world.addEntity(trader);
	}
}
