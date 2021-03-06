package net.tslat.aoa3.library.resourcemanager;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.IResource;
import net.minecraft.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.resource.IResourceType;
import net.minecraftforge.resource.ISelectiveResourceReloadListener;
import net.minecraftforge.resource.VanillaResourceType;
import net.tslat.aoa3.advent.Logging;
import net.tslat.aoa3.util.FileUtil;
import org.apache.logging.log4j.Level;

import javax.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.function.Predicate;

public class BestiaryManager implements ISelectiveResourceReloadListener {
	public static final HashMap<ResourceLocation, String> BESTIARY = new HashMap<ResourceLocation, String>();

	public BestiaryManager() {}

	@Override
	public void onResourceManagerReload(IResourceManager resourceManager, Predicate<IResourceType> resourcePredicate) {
		if (resourcePredicate.test(VanillaResourceType.LANGUAGES)) {
			try {
				BESTIARY.clear();
				Minecraft mc = Minecraft.getInstance();
				String langCode = mc.gameSettings.language;

				if (mc.getLanguageManager().getCurrentLanguage() != null)
					langCode = mc.getLanguageManager().getCurrentLanguage().getCode();

				for (ResourceLocation resourceLocation : resourceManager.getAllResourceLocations("bestiary/" + langCode, (path) -> path.endsWith(".txt"))) {
					for (IResource resource : resourceManager.getAllResources(resourceLocation)) {
						String relativePath = resource.getLocation().getPath().substring(15);
						String[] pathParts = relativePath.split("/");
						ResourceLocation entryId = new ResourceLocation(pathParts[0], pathParts[1].substring(0, pathParts[1].length() - 4));

						BESTIARY.put(entryId, FileUtil.bufferedReaderToString(new BufferedReader(new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8))));
					}
				}
			}
			catch (IOException ex) {
				Logging.logMessage(Level.ERROR, "Failed to retrieve AoA3 Bestiary resources, skipping.", ex);
			}
		}
	}

	@Nullable
	@Override
	public IResourceType getResourceType() {
		return VanillaResourceType.LANGUAGES;
	}
}
