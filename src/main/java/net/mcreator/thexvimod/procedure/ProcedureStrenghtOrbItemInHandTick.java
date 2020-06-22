package net.mcreator.thexvimod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.thexvimod.ElementsTheXVImod;

@ElementsTheXVImod.ModElement.Tag
public class ProcedureStrenghtOrbItemInHandTick extends ElementsTheXVImod.ModElement {
	public ProcedureStrenghtOrbItemInHandTick(ElementsTheXVImod instance) {
		super(instance, 117);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure StrenghtOrbItemInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 1, (int) 1));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 1, (int) 1));
	}
}
