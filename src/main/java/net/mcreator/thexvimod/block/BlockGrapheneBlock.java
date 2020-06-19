
package net.mcreator.thexvimod.block;

@ElementsTheXVImod.ModElement.Tag
public class BlockGrapheneBlock extends ElementsTheXVImod.ModElement {

	@GameRegistry.ObjectHolder("thexvimod:grapheneblock")
	public static final Block block = null;

	public BlockGrapheneBlock(ElementsTheXVImod instance) {
		super(instance, 60);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("grapheneblock"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("thexvimod:grapheneblock", "inventory"));

	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.IRON);

			setUnlocalizedName("grapheneblock");
			setSoundType(SoundType.METAL);

			setHarvestLevel("pickaxe", 2);

			setHardness(3F);
			setResistance(20F);
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
