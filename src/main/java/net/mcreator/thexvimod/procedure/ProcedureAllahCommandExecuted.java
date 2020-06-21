package net.mcreator.thexvimod.procedure;

@ElementsTheXVImod.ModElement.Tag
public class ProcedureAllahCommandExecuted extends ElementsTheXVImod.ModElement {

	public ProcedureAllahCommandExecuted(ElementsTheXVImod instance) {
		super(instance, 111);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AllahCommandExecuted!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AllahCommandExecuted!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AllahCommandExecuted!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AllahCommandExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AllahCommandExecuted!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		for (int index0 = 0; index0 < (int) (5); index0++) {
			world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
		}
		world.setWorldTime((int) 1000);
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).inventory.armorInventory.set(0, new ItemStack(Blocks.WOOL, (int) (1), 0));
			if (entity instanceof EntityPlayerMP)
				((EntityPlayerMP) entity).inventory.markDirty();
		}

		/*@ItemStack*/

	}

}
