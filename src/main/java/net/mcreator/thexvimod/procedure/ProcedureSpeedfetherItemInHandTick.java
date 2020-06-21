package net.mcreator.thexvimod.procedure;

@ElementsTheXVImod.ModElement.Tag
public class ProcedureSpeedfetherItemInHandTick extends ElementsTheXVImod.ModElement {

	public ProcedureSpeedfetherItemInHandTick(ElementsTheXVImod instance) {
		super(instance, 113);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SpeedfetherItemInHandTick!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 1, (int) 1));

	}

}
