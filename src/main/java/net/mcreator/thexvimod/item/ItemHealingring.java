
package net.mcreator.thexvimod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.thexvimod.procedure.ProcedureHealingringItemInHandTick;
import net.mcreator.thexvimod.ElementsTheXVImod;

@ElementsTheXVImod.ModElement.Tag
public class ItemHealingring extends ElementsTheXVImod.ModElement {
	@GameRegistry.ObjectHolder("thexvimod:healingring")
	public static final Item block = null;
	public ItemHealingring(ElementsTheXVImod instance) {
		super(instance, 116);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("thexvimod:healingring", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setUnlocalizedName("healingring");
			setRegistryName("healingring");
			setCreativeTab(CreativeTabs.MISC);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@Override
		public void onUpdate(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
			super.onUpdate(itemstack, world, entity, slot, par5);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			if (entity instanceof EntityLivingBase && ((EntityLivingBase) entity).getHeldItemMainhand().equals(itemstack)) {
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureHealingringItemInHandTick.executeProcedure($_dependencies);
			}
		}
	}
}
