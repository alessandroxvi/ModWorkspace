
package net.mcreator.thexvimod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.thexvimod.ElementsTheXVImod;

import java.util.Set;
import java.util.HashMap;

@ElementsTheXVImod.ModElement.Tag
public class ItemRedShovel extends ElementsTheXVImod.ModElement {
	@GameRegistry.ObjectHolder("thexvimod:redshovel")
	public static final Item block = null;
	public ItemRedShovel(ElementsTheXVImod instance) {
		super(instance, 90);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("REDSHOVEL", 8, 1741, 14f, 4f, 56)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 8);
				return ret.keySet();
			}
		}.setUnlocalizedName("redshovel").setRegistryName("redshovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("thexvimod:redshovel", "inventory"));
	}
}
