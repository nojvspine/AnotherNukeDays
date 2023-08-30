package net.mcreator.elliemoreand.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.elliemoreand.potion.PotionRadime3;
import net.mcreator.elliemoreand.potion.PotionRadime2;
import net.mcreator.elliemoreand.ElementsElliemoreAND;

import java.util.Collection;

@ElementsElliemoreAND.ModElement.Tag
public class ProcedureRADcoolMEe extends ElementsElliemoreAND.ModElement {
	public ProcedureRADcoolMEe(ElementsElliemoreAND instance) {
		super(instance, 17);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RADcoolMEe!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double RAD_debuff = 0;
		boolean have_radime = false;
		RAD_debuff = (double) Math.random();
		if (((!(new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == PotionRadime2.potion)
							return true;
					}
				}
				return false;
			}
		}.check())) == (!(new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == PotionRadime3.potion)
							return true;
					}
				}
				return false;
			}
		}.check())))) {
			if (((RAD_debuff) >= 0.8)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HUNGER, (int) 200, (int) 0));
			} else if (((RAD_debuff) >= 0.6)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 200, (int) 0));
			} else if (((RAD_debuff) >= 0.4)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 200, (int) 0));
			} else if (((RAD_debuff) >= 0.2)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 200, (int) 0));
			}
		}
	}
}
