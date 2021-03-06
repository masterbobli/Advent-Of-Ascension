package net.tslat.aoa3.entity.projectile.cannon;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.entity.projectile.HardProjectile;
import net.tslat.aoa3.entity.projectile.gun.BaseBullet;
import net.tslat.aoa3.item.weapon.gun.BaseGun;
import net.tslat.aoa3.util.WorldUtil;


public class BalloonBombEntity extends BaseBullet implements HardProjectile {
	LivingEntity shooter;

	public BalloonBombEntity(EntityType<? extends ThrowableEntity> entityType, World world) {
		super(entityType, world);
	}

	public BalloonBombEntity(World world) {
		super(AoAEntities.Projectiles.BALLOON_BOMB.get(), world);
	}

	public BalloonBombEntity(LivingEntity shooter, BaseGun gun, Hand hand, int maxAge, int piercingValue) {
		super(AoAEntities.Projectiles.BALLOON_BOMB.get(), shooter, gun, hand, maxAge, 1.0f, piercingValue);
		this.shooter = shooter;
	}

	public BalloonBombEntity(World world, double x, double y, double z) {
		super(AoAEntities.Projectiles.BALLOON_BOMB.get(), world, x, y, z);
	}

	@Override
	protected float getGravityVelocity() {
		return 0.1f;
	}

	@Override
	public void doImpactEffect() {
		WorldUtil.createExplosion(owner, world, this, 1.5f);
	}
}
