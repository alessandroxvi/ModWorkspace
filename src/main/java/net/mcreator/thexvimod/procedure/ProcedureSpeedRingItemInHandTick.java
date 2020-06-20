package net.mcreator.thexvimod.procedure;

@ElementsTheXVImod.ModElement.Tag
public class ProcedureSpeedRingItemInHandTick extends ElementsTheXVImod.ModElement {

	public ProcedureSpeedRingItemInHandTick(ElementsTheXVImod instance) {
		super(instance, 109);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SpeedRingItemInHandTick!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 1e+215, (int) 5));

	}

}
