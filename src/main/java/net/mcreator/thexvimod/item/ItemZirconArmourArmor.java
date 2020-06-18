
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
public class ItemZirconArmourArmor extends ElementsTheXVImod.ModElement {
	@GameRegistry.ObjectHolder("thexvimod:zirconarmourarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("thexvimod:zirconarmourarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("thexvimod:zirconarmourarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("thexvimod:zirconarmourarmorboots")
	public static final Item boots = null;
	public ItemZirconArmourArmor(ElementsTheXVImod instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ZIRCONARMOURARMOR", "thexvimod:zirconarmour", 60, new int[]{8, 24, 20, 8}, 36,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("zirconarmourarmorhelmet")
				.setRegistryName("zirconarmourarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("zirconarmourarmorbody")
				.setRegistryName("zirconarmourarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("zirconarmourarmorlegs")
				.setRegistryName("zirconarmourarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("zirconarmourarmorboots")
				.setRegistryName("zirconarmourarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("thexvimod:zirconarmourarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("thexvimod:zirconarmourarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("thexvimod:zirconarmourarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("thexvimod:zirconarmourarmorboots", "inventory"));
	}
}
