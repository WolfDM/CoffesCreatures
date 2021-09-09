
package net.mcreator.coffeescreatures.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.coffeescreatures.itemgroup.CoffeesCreaturesTabItemGroup;
import net.mcreator.coffeescreatures.CoffeesCreaturesModElements;

import java.util.List;

@CoffeesCreaturesModElements.ModElement.Tag
public class BossKeyItem extends CoffeesCreaturesModElements.ModElement {
	@ObjectHolder("coffees_creatures:boss_key")
	public static final Item block = null;
	public BossKeyItem(CoffeesCreaturesModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CoffeesCreaturesTabItemGroup.tab).maxStackSize(1).rarity(Rarity.EPIC));
			setRegistryName("boss_key");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("This Huge Key Must unlock Something in this world"));
		}
	}
}
