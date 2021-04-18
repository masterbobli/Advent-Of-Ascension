package net.tslat.aoa3.client.gui.hud;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tslat.aoa3.advent.AdventOfAscension;
import net.tslat.aoa3.util.RenderUtil;

import java.util.HashMap;

@Mod.EventBusSubscriber(modid = AdventOfAscension.MOD_ID, value = Dist.CLIENT)
@OnlyIn(Dist.CLIENT)
public class BossBarRenderer {
	private static final HashMap<String, ResourceLocation> textureCache = new HashMap<String, ResourceLocation>();

	@SubscribeEvent
	public static void renderBossBar(RenderGameOverlayEvent.BossInfo ev) {
		if (!ev.isCanceled()) {
			ITextComponent nameComponent = ev.getBossInfo().getName();
			String name;
			String id;

			if (nameComponent.getSiblings().isEmpty() || !(nameComponent instanceof TranslationTextComponent))
				return;

			name = nameComponent.getSiblings().get(0).getFormattedText();

			id = ((TranslationTextComponent)nameComponent).getKey();

			if (!id.startsWith("entity.aoa3."))
				return;

			Minecraft mc = Minecraft.getInstance();
			MainWindow mainWindow = mc.getMainWindow();
			ResourceLocation texture = getTexture(id.substring(12));
			int textureWidth = 196;
			int xPos = mainWindow.getScaledWidth() / 2 - 100;
			int percentPixels = (int)Math.ceil(ev.getBossInfo().getPercent() * textureWidth);
			int stringWidth = mc.fontRenderer.getStringWidth(name);
			int x = mainWindow.getScaledWidth() / 2 - stringWidth / 2;

			RenderSystem.pushMatrix();
			RenderSystem.enableAlphaTest();
			RenderSystem.disableDepthTest();
			RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
			mc.getTextureManager().bindTexture(texture);

			if (percentPixels < textureWidth)
				RenderUtil.renderCustomSizedTexture(xPos, ev.getY(), 0, 12, 200, 12, 200, 36);

			if (percentPixels > 0)
				RenderUtil.renderCustomSizedTexture(xPos + 2, ev.getY(), 2, 0, percentPixels, 12, 200, 36);

			RenderUtil.renderCustomSizedTexture(xPos, ev.getY(), 0, 24, 200, 12, 200, 36);
			mc.fontRenderer.drawStringWithShadow(name, x, ev.getY() - 9, 16777215);
			RenderSystem.enableDepthTest();
			RenderSystem.disableAlphaTest();
			RenderSystem.popMatrix();

			ev.setIncrement(ev.getIncrement() + 5);
			ev.setCanceled(true);
		}
	}

	private static ResourceLocation getTexture(String id) {
		if (textureCache.containsKey(id))
			return textureCache.get(id);

		ResourceLocation texture = new ResourceLocation(AdventOfAscension.MOD_ID, "textures/gui/bossbars/" + id + ".png");

		textureCache.put(id, texture);

		return texture;
	}
}
