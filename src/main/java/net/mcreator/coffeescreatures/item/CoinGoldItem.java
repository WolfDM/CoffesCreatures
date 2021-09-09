
package net.mcreator.coffeescreatures.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.coffeescreatures.itemgroup.CoffeesCreaturesTabItemGroup;
import net.mcreator.coffeescreatures.CoffeesCreaturesModElements;

@CoffeesCreaturesModElements.ModElement.Tag
public class CoinGoldItem extends CoffeesCreaturesModElements.ModElement {
	@ObjectHolder("coffees_creatures:coin_gold")
	public static final Item block = null;
	public CoinGoldItem(CoffeesCreaturesModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CoffeesCreaturesTabItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("coin_gold");
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
