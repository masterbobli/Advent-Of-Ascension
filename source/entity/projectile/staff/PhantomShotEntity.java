package net.tslat.aoa3.entity.projectile.staff;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.item.EnergyProjectileWeapon;

import java.util.UUID;

public class PhantomShotEntity extends BaseEnergyShot {
	private UUID lastHit = null;

	public PhantomShotEntity(EntityType<? extends ThrowableEntity> entityType, World world) {
		super(entityType, world);
	}
	
	public PhantomShotEntity(World world) {
		super(AoAEntities.Projectiles.PHANTOM_SHOT.get(), world);
	}

	public PhantomShotEntity(LivingEntity shooter, EnergyProjectileWeapon weapon, int maxAge) {
		super(AoAEntities.Projectiles.PHANTOM_SHOT.get(), shooter, weapon, maxAge);
	}

	public PhantomShotEntity(World world, double x, double y, double z) {
		super(AoAEntities.Projectiles.PHANTOM_SHOT.get(), world, x, y, z);
	}

	@Override
	protected void onImpact(RayTraceResult result) {
		if (!world.isRemote) {
			if (weapon != null) {
				if (result.getType() == RayTraceResult.Type.BLOCK) {
					weapon.doBlockImpact(this, result.getHitVec(), owner);
					remove();
				}
				else if (result.getType() == RayTraceResult.Type.ENTITY && !((EntityRayTraceResult)result).getEntity().getUniqueID().equals(lastHit)) {
					weapon.doEntityImpact(this, ((EntityRayTraceResult)result).getEntity(), owner);
				}
			}
		}
	}
}
