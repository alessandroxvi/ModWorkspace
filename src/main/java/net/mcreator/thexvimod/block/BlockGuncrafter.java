
package net.mcreator.thexvimod.block;

@ElementsTheXVImod.ModElement.Tag
public class BlockGuncrafter extends ElementsTheXVImod.ModElement {

	@GameRegistry.ObjectHolder("thexvimod:guncrafter")
	public static final Block block = null;

	public BlockGuncrafter(ElementsTheXVImod instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("guncrafter"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("thexvimod:guncrafter", "inventory"));

	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.IRON);

			setUnlocalizedName("guncrafter");
			setSoundType(SoundType.GROUND);

			setHarvestLevel("pickaxe", 1);

			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

		}

		@Override
		public int tickRate(World world) {
			return 0;
		}

	}

}
