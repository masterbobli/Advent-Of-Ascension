package net.tslat.aoa3.client.render.entity.projectile.bullets;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.tslat.aoa3.client.render.entity.projectile.TexturedProjectileRenderer;
import net.tslat.aoa3.common.registration.AoAParticleTypes;
import net.tslat.aoa3.entity.projectile.gun.ChilliShotEntity;
import net.tslat.aoa3.library.misc.CustomisableParticleType;
import net.tslat.aoa3.util.NumberUtil;

public class ChilliShotRenderer extends TexturedProjectileRenderer<ChilliShotEntity> {
	public ChilliShotRenderer(final EntityRendererManager manager, final ResourceLocation textureResource) {
		super(manager, textureResource);
	}

	@Override
	public void render(ChilliShotEntity entity, float entityYaw, float partialTicks, MatrixStack matrix, IRenderTypeBuffer buffer, int packedLight) {
		super.render(entity, entityYaw, partialTicks, matrix, buffer, packedLight);

		for (int i = 0; i < 8; i++) {
			entity.world.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.SPARKLER.get(), 1, 3, NumberUtil.RGB(255, 0, 0)), entity.getPosX(), entity.getPosY(), entity.getPosZ(), 0, 0, 0);
		}
	}
}
