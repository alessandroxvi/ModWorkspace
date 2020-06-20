
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
public class ItemOpal_toolsPickaxe extends ElementsTheXVImod.ModElement {
	@GameRegistry.ObjectHolder("thexvimod:opal_toolspickaxe")
	public static final Item block = null;
	public ItemOpal_toolsPickaxe(ElementsTheXVImod instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("OPAL_TOOLSPICKAXE", 4, 1250, 12f, 0f, 28)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("opal_toolspickaxe").setRegistryName("opal_toolspickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("thexvimod:opal_toolspickaxe", "inventory"));
	}
}
