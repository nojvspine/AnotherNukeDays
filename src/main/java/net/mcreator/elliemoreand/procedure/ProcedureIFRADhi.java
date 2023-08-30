package net.mcreator.elliemoreand.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.elliemoreand.potion.PotionRadihi3;
import net.mcreator.elliemoreand.potion.PotionRadihi2;
import net.mcreator.elliemoreand.potion.PotionRadiHi;
import net.mcreator.elliemoreand.ElementsElliemoreAND;

import java.util.Collection;

@ElementsElliemoreAND.ModElement.Tag
public class ProcedureIFRADhi extends ElementsElliemoreAND.ModElement {
	public ProcedureIFRADhi(ElementsElliemoreAND instance) {
		super(instance, 26);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure IFRADhi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double who_that_stack = 0;
		who_that_stack = (double) 0;
		if ((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == PotionRadihi3.potion)
							return true;
					}
				}
				return false;
			}
		}.check())) {
			who_that_stack = (double) 0;
		} else if ((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == PotionRadihi2.potion)
							return true;
					}
				}
				return false;
			}
		}.check())) {
			who_that_stack = (double) 3;
		} else if ((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == PotionRadiHi.potion)
							return true;
					}
				}
				return false;
			}
		}.check())) {
			who_that_stack = (double) 2;
		} else if ((!(new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == PotionRadiHi.potion)
							return true;
					}
				}
				return false;
			}
		}.check()))) {
			who_that_stack = (double) 1;
		}
		if (((who_that_stack) == 3)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionRadihi3.potion, (int) 300, (int) 0));
		} else if (((who_that_stack) == 2)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionRadihi2.potion, (int) 300, (int) 0));
		} else if (((who_that_stack) == 1)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionRadiHi.potion, (int) 300, (int) 0));
		}
	}
}
