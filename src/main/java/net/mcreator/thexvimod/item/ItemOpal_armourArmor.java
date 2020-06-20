
package net.mcreator.thexvimod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.thexvimod.ElementsTheXVImod;

@ElementsTheXVImod.ModElement.Tag
public class ItemOpal_armourArmor extends ElementsTheXVImod.ModElement {
	@GameRegistry.ObjectHolder("thexvimod:opal_armourarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("thexvimod:opal_armourarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("thexvimod:opal_armourarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("thexvimod:opal_armourarmorboots")
	public static final Item boots = null;
	public ItemOpal_armourArmor(ElementsTheXVImod instance) {
		super(instance, 69);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("OPAL_ARMOURARMOR", "thexvimod:opal_armoure", 38, new int[]{6, 12, 16, 8}, 23,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("opal_armourarmorhelmet")
				.setRegistryName("opal_armourarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("opal_armourarmorbody")
				.setRegistryName("opal_armourarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("opal_armourarmorlegs")
				.setRegistryName("opal_armourarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("opal_armourarmorboots")
				.setRegistryName("opal_armourarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("thexvimod:opal_armourarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("thexvimod:opal_armourarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("thexvimod:opal_armourarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("thexvimod:opal_armourarmorboots", "inventory"));
	}
}
