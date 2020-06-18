
package net.mcreator.thexvimod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.thexvimod.item.ItemCarbonIngot;
import net.mcreator.thexvimod.block.BlockCarbon;
import net.mcreator.thexvimod.ElementsTheXVImod;

@ElementsTheXVImod.ModElement.Tag
public class RecipeCarbonIngotRecipe extends ElementsTheXVImod.ModElement {
	public RecipeCarbonIngotRecipe(ElementsTheXVImod instance) {
		super(instance, 3);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockCarbon.block, (int) (1)), new ItemStack(ItemCarbonIngot.block, (int) (1)), 2F);
	}
}
