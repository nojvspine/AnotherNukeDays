package net.mcreator.elliemoreand.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.elliemoreand.potion.PotionRadi3;
import net.mcreator.elliemoreand.potion.PotionRadi2;
import net.mcreator.elliemoreand.potion.PotionRadi;
import net.mcreator.elliemoreand.ElementsElliemoreAND;

import java.util.Collection;

@ElementsElliemoreAND.ModElement.Tag
public class ProcedureIFRADIlow extends ElementsElliemoreAND.ModElement {
	public ProcedureIFRADIlow(ElementsElliemoreAND instance) {
		super(instance, 6);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure IFRADIlow!");
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
						if (effect.getPotion() == PotionRadi3.potion)
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
						if (effect.getPotion() == PotionRadi2.potion)
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
						if (effect.getPotion() == PotionRadi.potion)
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
						if (effect.getPotion() == PotionRadi.potion)
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
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionRadi3.potion, (int) 300, (int) 0));
		} else if (((who_that_stack) == 2)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionRadi2.potion, (int) 300, (int) 0));
		} else if (((who_that_stack) == 1)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionRadi.potion, (int) 300, (int) 0));
		}
	}
}
