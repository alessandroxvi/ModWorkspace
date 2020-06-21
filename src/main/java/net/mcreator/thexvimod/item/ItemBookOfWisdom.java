
package net.mcreator.thexvimod.item;

@ElementsTheXVImod.ModElement.Tag
public class ItemBookOfWisdom extends ElementsTheXVImod.ModElement {

	@GameRegistry.ObjectHolder("thexvimod:bookofwisdom")
	public static final Item block = null;

	public ItemBookOfWisdom(ElementsTheXVImod instance) {
		super(instance, 112);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("thexvimod:bookofwisdom", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("bookofwisdom");
			setRegistryName("bookofwisdom");
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
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("Right Click");
		}

	}

}
