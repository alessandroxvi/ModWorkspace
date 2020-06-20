
package net.mcreator.thexvimod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.thexvimod.ElementsTheXVImod;

import java.util.Set;
import java.util.HashMap;

@ElementsTheXVImod.ModElement.Tag
public class ItemRedPickaxe extends ElementsTheXVImod.ModElement {
	@GameRegistry.ObjectHolder("thexvimod:redpickaxe")
	public static final Item block = null;
	public ItemRedPickaxe(ElementsTheXVImod instance) {
		super(instance, 87);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("REDPICKAXE", 8, 1741, 14f, 4f, 56)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 8);
				return ret.keySet();
			}
		}.setUnlocalizedName("redpickaxe").setRegistryName("redpickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("thexvimod:redpickaxe", "inventory"));
	}
}
