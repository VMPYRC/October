/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.october.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.october.item.WandItem;
import net.mcreator.october.item.AceItem;
import net.mcreator.october.OctoberMod;

public class OctoberModItems {
	public static Item ACE_HELMET;
	public static Item ACE_CHESTPLATE;
	public static Item ACE_LEGGINGS;
	public static Item ACE_BOOTS;
	public static Item WAND;

	public static void load() {
		ACE_HELMET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(OctoberMod.MODID, "ace_helmet"), new AceItem.Helmet());
		ACE_CHESTPLATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(OctoberMod.MODID, "ace_chestplate"), new AceItem.Chestplate());
		ACE_LEGGINGS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(OctoberMod.MODID, "ace_leggings"), new AceItem.Leggings());
		ACE_BOOTS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(OctoberMod.MODID, "ace_boots"), new AceItem.Boots());
		WAND = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(OctoberMod.MODID, "wand"), new WandItem());
	}

	public static void clientLoad() {
	}
}
