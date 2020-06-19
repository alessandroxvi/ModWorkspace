
package net.mcreator.thexvimod.block;

@ElementsTheXVImod.ModElement.Tag
public class BlockTripleCompressedCarbon extends ElementsTheXVImod.ModElement {

	@GameRegistry.ObjectHolder("thexvimod:triplecompressedcarbon")
	public static final Block block = null;

	public BlockTripleCompressedCarbon(ElementsTheXVImod instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("triplecompressedcarbon"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("thexvimod:triplecompressedcarbon", "inventory"));

	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.ROCK);

			setUnlocalizedName("triplecompressedcarbon");
			setSoundType(SoundType.STONE);

			setHarvestLevel("pickaxe", 2);

			setHardness(5F);
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
