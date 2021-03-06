package net.tslat.aoa3.client.model.entity.mob.mysterium;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class SpiritGuardianModel extends EntityModel<MobEntity> {
	private final ModelRenderer shape50;
	private final ModelRenderer Rotator;
	private final ModelRenderer RightArm1;
	private final ModelRenderer LeftArm1;
	private final ModelRenderer RightArm2;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer shape7;
	private final ModelRenderer shape8;
	private final ModelRenderer shape9;
	private final ModelRenderer shape10;
	private final ModelRenderer shape11;
	private final ModelRenderer shape12;
	private final ModelRenderer shape13;
	private final ModelRenderer shape14;
	private final ModelRenderer shape15;
	private final ModelRenderer shape16;
	private final ModelRenderer shape17;
	private final ModelRenderer shape18;
	private final ModelRenderer head;
	private final ModelRenderer LeftArm3;
	private final ModelRenderer LeftArm4;
	private final ModelRenderer LeftArm5;
	private final ModelRenderer shape1;
	private final ModelRenderer shape51;
	private final ModelRenderer RightArm5;
	private final ModelRenderer RightArm4;

	public SpiritGuardianModel() {
		textureWidth = 128;
		textureHeight = 64;
		(shape50 = new ModelRenderer(this, 50, 30)).addBox(-3.0f, 0.0f, -2.0f, 2, 6, 4);
		shape50.setRotationPoint(6.0f, 12.0f, 3.0f);
		shape50.setTextureSize(128, 64);
		shape50.mirror = true;
		setRotation(shape50, 0.0f, 0.0f, 0.0f);
		(Rotator = new ModelRenderer(this, 51, 55)).addBox(-2.0f, -2.0f, -2.0f, 4, 4, 4);
		Rotator.setRotationPoint(0.0f, 18.0f, 3.0f);
		Rotator.setTextureSize(128, 64);
		Rotator.mirror = true;
		setRotation(Rotator, 0.0f, 0.0f, 0.7853982f);
		(RightArm1 = new ModelRenderer(this, 42, 38)).addBox(0.0f, 0.0f, -0.5f, 1, 10, 1);
		RightArm1.setRotationPoint(-3.0f, -2.0f, 3.0f);
		RightArm1.setTextureSize(128, 64);
		RightArm1.mirror = true;
		setRotation(RightArm1, 0.0f, 0.0f, 0.5235988f);
		(LeftArm1 = new ModelRenderer(this, 74, 38)).addBox(-1.0f, 0.0f, -0.5f, 1, 10, 1);
		LeftArm1.setRotationPoint(3.0f, -2.0f, 3.0f);
		LeftArm1.setTextureSize(128, 64);
		LeftArm1.mirror = true;
		setRotation(LeftArm1, 0.0f, 0.0f, -0.5235988f);
		(RightArm2 = new ModelRenderer(this, 35, 50)).addBox(-1.0f, 10.0f, -1.5f, 3, 5, 3);
		RightArm2.setRotationPoint(-3.0f, -2.0f, 3.0f);
		RightArm2.setTextureSize(128, 64);
		RightArm2.mirror = true;
		setRotation(RightArm2, 0.0f, 0.0f, 0.5235988f);
		(LeftArm2 = new ModelRenderer(this, 73, 50)).addBox(-2.0f, 10.0f, -1.5f, 3, 5, 3);
		LeftArm2.setRotationPoint(3.0f, -2.0f, 3.0f);
		LeftArm2.setTextureSize(128, 64);
		LeftArm2.mirror = true;
		setRotation(LeftArm2, 0.0f, 0.0f, -0.5235988f);
		(shape7 = new ModelRenderer(this, 33, 30)).addBox(-2.0f, 0.0f, -2.0f, 3, 2, 4);
		shape7.setRotationPoint(-4.0f, -2.0f, 3.0f);
		shape7.setTextureSize(128, 64);
		shape7.mirror = true;
		setRotation(shape7, 0.0f, 0.0f, 0.0f);
		(shape8 = new ModelRenderer(this, 73, 30)).addBox(-1.0f, 0.0f, -2.0f, 3, 2, 4);
		shape8.setRotationPoint(4.0f, -2.0f, 3.0f);
		shape8.setTextureSize(128, 64);
		shape8.mirror = true;
		setRotation(shape8, 0.0f, 0.0f, 0.0f);
		(shape9 = new ModelRenderer(this, 30, 0)).addBox(0.0f, 0.0f, -2.0f, 1, 1, 8);
		shape9.setRotationPoint(-3.0f, -2.0f, 5.0f);
		shape9.setTextureSize(128, 64);
		shape9.mirror = true;
		setRotation(shape9, 0.6108652f, -0.5235988f, 0.0f);
		(shape10 = new ModelRenderer(this, 72, 0)).addBox(-1.0f, 0.0f, -2.0f, 1, 1, 8);
		shape10.setRotationPoint(3.0f, -2.0f, 5.0f);
		shape10.setTextureSize(128, 64);
		shape10.mirror = true;
		setRotation(shape10, 0.6108652f, 0.5235988f, 0.0f);
		(shape11 = new ModelRenderer(this, 110, 0)).addBox(-1.0f, 3.0f, 5.0f, 1, 30, 1);
		shape11.setRotationPoint(3.0f, -2.0f, 5.0f);
		shape11.setTextureSize(128, 64);
		shape11.mirror = true;
		setRotation(shape11, 0.7853982f, 0.5235988f, 0.0f);
		(shape12 = new ModelRenderer(this, 104, 0)).addBox(-1.0f, 2.0f, 3.0f, 1, 25, 1);
		shape12.setRotationPoint(3.0f, -2.0f, 5.0f);
		shape12.setTextureSize(128, 64);
		shape12.mirror = true;
		setRotation(shape12, 0.6981317f, 0.5235988f, 0.0f);
		(shape13 = new ModelRenderer(this, 98, 0)).addBox(-1.0f, 2.0f, 1.0f, 1, 20, 1);
		shape13.setRotationPoint(3.0f, -2.0f, 5.0f);
		shape13.setTextureSize(128, 64);
		shape13.mirror = true;
		setRotation(shape13, 0.6108652f, 0.5235988f, 0.0f);
		(shape14 = new ModelRenderer(this, 92, 0)).addBox(-1.0f, 2.0f, -1.0f, 1, 15, 1);
		shape14.setRotationPoint(3.0f, -2.0f, 5.0f);
		shape14.setTextureSize(128, 64);
		shape14.mirror = true;
		setRotation(shape14, 0.5235988f, 0.5235988f, 0.0f);
		(shape15 = new ModelRenderer(this, 6, 0)).addBox(0.0f, 3.0f, 5.0f, 1, 30, 1);
		shape15.setRotationPoint(-3.0f, -2.0f, 5.0f);
		shape15.setTextureSize(128, 64);
		shape15.mirror = true;
		setRotation(shape15, 0.7853982f, -0.5235988f, 0.0f);
		(shape16 = new ModelRenderer(this, 12, 0)).addBox(0.0f, 2.0f, 3.0f, 1, 25, 1);
		shape16.setRotationPoint(-3.0f, -2.0f, 5.0f);
		shape16.setTextureSize(128, 64);
		shape16.mirror = true;
		setRotation(shape16, 0.6981317f, -0.5235988f, 0.0f);
		(shape17 = new ModelRenderer(this, 18, 0)).addBox(0.0f, 2.0f, 1.0f, 1, 20, 1);
		shape17.setRotationPoint(-3.0f, -2.0f, 5.0f);
		shape17.setTextureSize(128, 64);
		shape17.mirror = true;
		setRotation(shape17, 0.6108652f, -0.5235988f, 0.0f);
		(shape18 = new ModelRenderer(this, 24, 0)).addBox(0.0f, 2.0f, -1.0f, 1, 15, 1);
		shape18.setRotationPoint(-3.0f, -2.0f, 5.0f);
		shape18.setTextureSize(128, 64);
		shape18.mirror = true;
		setRotation(shape18, 0.5235988f, -0.5235988f, 0.0f);
		(head = new ModelRenderer(this, 52, 20)).addBox(-2.0f, -4.0f, -2.0f, 4, 4, 4);
		head.setRotationPoint(0.0f, -1.0f, 1.0f);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(LeftArm3 = new ModelRenderer(this, 75, 59)).addBox(-1.5f, 15.0f, -1.0f, 2, 2, 2);
		LeftArm3.setRotationPoint(3.0f, -2.0f, 3.0f);
		LeftArm3.setTextureSize(128, 64);
		LeftArm3.mirror = true;
		setRotation(LeftArm3, 0.0f, 0.0f, -0.5235988f);
		(LeftArm4 = new ModelRenderer(this, 8, 45)).addBox(-1.0f, 17.0f, -3.0f, 1, 1, 6);
		LeftArm4.setRotationPoint(3.0f, -2.0f, 3.0f);
		LeftArm4.setTextureSize(128, 64);
		LeftArm4.mirror = true;
		setRotation(LeftArm4, 0.0f, 0.0f, -0.5235988f);
		(LeftArm5 = new ModelRenderer(this, 8, 53)).addBox(-0.5f, 17.0f, -13.0f, 0, 1, 10);
		LeftArm5.setRotationPoint(3.0f, -2.0f, 3.0f);
		LeftArm5.setTextureSize(128, 64);
		LeftArm5.mirror = true;
		setRotation(LeftArm5, 0.0f, 0.0f, -0.5235988f);
		(shape1 = new ModelRenderer(this, 50, 30)).addBox(-3.0f, 0.0f, -2.0f, 6, 16, 4);
		shape1.setRotationPoint(0.0f, -2.0f, 3.0f);
		shape1.setTextureSize(128, 64);
		shape1.mirror = true;
		setRotation(shape1, 0.0f, 0.0f, 0.0f);
		(shape51 = new ModelRenderer(this, 50, 30)).addBox(-3.0f, 0.0f, -2.0f, 2, 6, 4);
		shape51.setRotationPoint(-2.0f, 12.0f, 3.0f);
		shape51.setTextureSize(128, 64);
		shape51.mirror = true;
		setRotation(shape51, 0.0f, 0.0f, 0.0f);
		(RightArm5 = new ModelRenderer(this, 8, 53)).addBox(0.5f, 15.0f, -13.0f, 0, 1, 10);
		RightArm5.setRotationPoint(-3.0f, -2.0f, 3.0f);
		RightArm5.setTextureSize(128, 64);
		RightArm5.mirror = true;
		setRotation(RightArm5, 0.0f, 0.0f, 0.5235988f);
		(RightArm4 = new ModelRenderer(this, 8, 45)).addBox(0.0f, 15.0f, -3.0f, 1, 1, 6);
		RightArm4.setRotationPoint(-3.0f, -2.0f, 3.0f);
		RightArm4.setTextureSize(128, 64);
		RightArm4.mirror = true;
		setRotation(RightArm4, 0.0f, 0.0f, 0.5235988f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		shape50.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		Rotator.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		RightArm1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		LeftArm1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		RightArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		LeftArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape11.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape12.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape13.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape14.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape15.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape16.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape17.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape18.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		LeftArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		LeftArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		LeftArm5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape51.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		RightArm5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		RightArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		head.rotateAngleY = netHeadYaw / 57.295776f;
		head.rotateAngleX = headPitch / 54.11268f;
		RightArm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		RightArm1.rotateAngleZ = 0.523f;
		RightArm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		RightArm2.rotateAngleZ = 0.523f;
		RightArm5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		RightArm5.rotateAngleZ = 0.523f;
		RightArm4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		RightArm4.rotateAngleZ = 0.523f;
		LeftArm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		LeftArm1.rotateAngleZ = -0.523f;
		LeftArm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		LeftArm2.rotateAngleZ = -0.523f;
		LeftArm3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		LeftArm3.rotateAngleZ = -0.523f;
		LeftArm4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		LeftArm4.rotateAngleZ = -0.523f;
		LeftArm5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		LeftArm5.rotateAngleZ = -0.523f;
		final ModelRenderer rotator = Rotator;
		rotator.rotateAngleZ += MathHelper.sin(limbSwingAmount * 0.067f) * 0.25f;
	}
}
