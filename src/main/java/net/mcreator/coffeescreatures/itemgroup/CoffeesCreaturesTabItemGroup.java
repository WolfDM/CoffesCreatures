
package net.mcreator.coffeescreatures.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.coffeescreatures.item.CoffeeItem;
import net.mcreator.coffeescreatures.CoffeesCreaturesModElements;

@CoffeesCreaturesModElements.ModElement.Tag
public class CoffeesCreaturesTabItemGroup extends CoffeesCreaturesModElements.ModElement {
	public CoffeesCreaturesTabItemGroup(CoffeesCreaturesModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcoffees_creatures_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CoffeeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
