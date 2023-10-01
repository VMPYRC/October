
package net.mcreator.october.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.lang.reflect.Type;

public abstract class AceItem extends ArmorItem {
	public AceItem(Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 100;
			}

			@Override
			public int getDefenseForType(Type type) {
				return new int[]{100, 100, 100, 100}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 50;
			}

			@Override
			public SoundEvent getEquipSound() {
				return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.armor.equip_iron"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "ace_";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 5f;
			}
		}, type, properties);
	}

	public static class Helmet extends AceItem {
		public Helmet() {
			super(Type.HELMET, new Item.Properties().fireResistant());
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		}

	}

	public static class Chestplate extends AceItem {

		public Chestplate() {
			super(Type.CHESTPLATE, new Item.Properties().fireResistant());
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		}

	}

	public static class Leggings extends AceItem {

		public Leggings() {
			super(Type.LEGGINGS, new Item.Properties().fireResistant());
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		}

	}

	public static class Boots extends AceItem {

		public Boots() {
			super(Type.BOOTS, new Item.Properties().fireResistant());
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		}

	}
}
