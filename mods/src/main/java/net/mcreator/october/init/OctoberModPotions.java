
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.october.init;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.october.OctoberMod;

public class OctoberModPotions {
	public static Potion GOD;

	public static void load() {
		GOD = Registry.register(BuiltInRegistries.POTION, new ResourceLocation(OctoberMod.MODID, "god"),
				new Potion(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1316134912, 255, false, false), new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 1316134912, 255, false, false),
						new MobEffectInstance(MobEffects.HEAL, 1316134912, 255, false, false), new MobEffectInstance(MobEffects.LUCK, 1316134912, 255, false, false), new MobEffectInstance(MobEffects.REGENERATION, 1316134912, 255, false, false),
						new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1316134912, 255, false, false), new MobEffectInstance(MobEffects.SATURATION, 1316134912, 255, false, false),
						new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1316134912, 255, false, false), new MobEffectInstance(MobEffects.WATER_BREATHING, 1316134912, 255, false, false)));
	}
}
