
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
public class ItemRedArmor extends ElementsTheXVImod.ModElement {
	@GameRegistry.ObjectHolder("thexvimod:redarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("thexvimod:redarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("thexvimod:redarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("thexvimod:redarmorboots")
	public static final Item boots = null;
	public ItemRedArmor(ElementsTheXVImod instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("REDARMOR", "thexvimod:red", 75, new int[]{10, 30, 25, 10}, 45,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("redarmorhelmet")
				.setRegistryName("redarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("redarmorbody").setRegistryName("redarmorbody")
				.setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("redarmorlegs").setRegistryName("redarmorlegs")
				.setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("redarmorboots")
				.setRegistryName("redarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("thexvimod:redarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("thexvimod:redarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("thexvimod:redarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("thexvimod:redarmorboots", "inventory"));
	}
}
