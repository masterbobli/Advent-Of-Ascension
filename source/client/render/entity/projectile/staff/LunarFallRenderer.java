package net.tslat.aoa3.client.render.entity.projectile.staff;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.tslat.aoa3.common.registration.AoAParticleTypes;
import net.tslat.aoa3.entity.projectile.staff.LunarFallEntity;
import net.tslat.aoa3.library.misc.CustomisableParticleType;
import net.tslat.aoa3.util.NumberUtil;

import javax.annotation.Nullable;

public class LunarFallRenderer extends EntityRenderer<LunarFallEntity> {
	private final ResourceLocation texture;

	public LunarFallRenderer(final EntityRendererManager manager, final ResourceLocation textureResource) {
		super(manager);
		texture = textureResource;
	}

	@Override
	public void render(LunarFallEntity entity, float entityYaw, float partialTicks, MatrixStack matrix, IRenderTypeBuffer buffer, int packedLight) {
		super.render(entity, entityYaw, partialTicks, matrix, buffer, packedLight);

		for (int i = 0; i < 3; i++) {
			entity.world.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.FLICKERING_SPARKLER.get(), 1, 3, NumberUtil.RGB(255, 255, 255)), entity.getPosX(), entity.getPosY() + 0.25d, entity.getPosZ(), 0, 0, 0);
		}
	}

	@Nullable
	@Override
	public ResourceLocation getEntityTexture(LunarFallEntity entity) {
		return texture;
	}
}
