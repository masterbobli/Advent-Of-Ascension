package net.tslat.aoa3.item.weapon.bow;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.tslat.aoa3.util.EntityUtil;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.PotionUtil;

import javax.annotation.Nullable;
import java.util.List;

public class LunarBow extends BaseBow {
	public LunarBow(double damage, float drawSpeedMultiplier, int durability) {
		super(damage, drawSpeedMultiplier, durability);
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
		if (isSelected && !world.isRemote && entity instanceof LivingEntity)
			EntityUtil.applyPotions(entity, new PotionUtil.EffectBuilder(Effects.JUMP_BOOST, -1));

		super.inventoryTick(stack, world, entity, itemSlot, isSelected);
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.BENEFICIAL, 1));
		super.addInformation(stack, world, tooltip, flag);
	}
}
