package net.tslat.aoa3.worldgen.structure.structures;

import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.registry.DynamicRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.jigsaw.JigsawManager;
import net.minecraft.world.gen.feature.structure.AbstractVillagePiece;
import net.minecraft.world.gen.feature.structure.VillageConfig;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.tslat.aoa3.worldgen.feature.features.config.BlockPosConfig;

public class OneTimeStructure extends AoAStructureBase<BlockPosConfig> {
	public OneTimeStructure(GenerationStage.Decoration decorationStage, String templatePoolPath) {
		super(BlockPosConfig.CODEC, decorationStage, templatePoolPath);
	}

	@Override
	protected AoAStartFactory<BlockPosConfig> getStructureStart() {
		return Start::new;
	}

	public static class Start extends AoAStructureStart<BlockPosConfig> {
		private final SharedSeedRandom riggedRandom;

		public Start(AoAStructureBase<BlockPosConfig> structure, int chunkX, int chunkZ, MutableBoundingBox boundingBox, int references, long seed) {
			super(structure, chunkX, chunkZ, boundingBox, references, seed);

			this.riggedRandom = new SharedSeedRandom() {
				boolean riggedResult = false;

				@Override
				public int nextInt(int bound) {
					if (riggedResult)
						return super.nextInt(bound);

					riggedResult = true;

					return 0;
				}
			};
			this.riggedRandom.setLargeFeatureSeed(seed, chunkX, chunkZ);
		}

		@Override
		public void generatePieces(DynamicRegistries dynamicRegistry, ChunkGenerator chunkGenerator, TemplateManager templateManager, int chunkX, int chunkZ, Biome biome, BlockPosConfig config) {
			if (config.isInChunk(new ChunkPos(chunkX, chunkZ))) {
				JigsawManager.addPieces(
						dynamicRegistry,
						new VillageConfig(() -> dynamicRegistry.registryOrThrow(Registry.TEMPLATE_POOL_REGISTRY).get(getFeature().getTemplatePoolPath()), 15),
						AbstractVillagePiece::new,
						chunkGenerator,
						templateManager,
						config.pos,
						pieces,
						riggedRandom,
						false,
						false);

				calculateBoundingBox();
			}
		}
	}
}