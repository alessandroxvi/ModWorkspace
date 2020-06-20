
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
public class ItemZirconToolsShovel extends ElementsTheXVImod.ModElement {
	@GameRegistry.ObjectHolder("thexvimod:zircontoolsshovel")
	public static final Item block = null;
	public ItemZirconToolsShovel(ElementsTheXVImod instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("ZIRCONTOOLSSHOVEL", 4, 6900, 10f, 2f, 28)) {
			{
				this.attackSpeed = -2f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("zircontoolsshovel").setRegistryName("zircontoolsshovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("thexvimod:zircontoolsshovel", "inventory"));
	}
}
