
package net.mcreator.coffeescreatures.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.coffeescreatures.itemgroup.CoffeesCreaturesTabItemGroup;
import net.mcreator.coffeescreatures.CoffeesCreaturesModElements;

@CoffeesCreaturesModElements.ModElement.Tag
public class IngotCopperItem extends CoffeesCreaturesModElements.ModElement {
	@ObjectHolder("coffees_creatures:ingot_copper")
	public static final Item block = null;
	public IngotCopperItem(CoffeesCreaturesModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CoffeesCreaturesTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("ingot_copper");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
