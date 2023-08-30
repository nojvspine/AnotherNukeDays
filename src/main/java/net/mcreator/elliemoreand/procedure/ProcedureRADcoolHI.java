package net.mcreator.elliemoreand.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.elliemoreand.potion.PotionRadihi3;
import net.mcreator.elliemoreand.potion.PotionRadihi2;
import net.mcreator.elliemoreand.ElementsElliemoreAND;

import java.util.Collection;

@ElementsElliemoreAND.ModElement.Tag
public class ProcedureRADcoolHI extends ElementsElliemoreAND.ModElement {
	public ProcedureRADcoolHI(ElementsElliemoreAND instance) {
		super(instance, 23);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RADcoolHI!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double RAD_debuff = 0;
		RAD_debuff = (double) Math.random();
		if (((!(new Object() {
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
		}.check())) && (!(new Object() {
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
		}.check())))) {
			if (((RAD_debuff) >= 0.9)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 160, (int) 0));
			} else if (((RAD_debuff) >= 0.75)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HUNGER, (int) 200, (int) 0));
			} else if (((RAD_debuff) >= 0.5)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 300, (int) 0));
			} else if (((RAD_debuff) >= 0.25)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 300, (int) 0));
			} else if (((RAD_debuff) >= 0)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 160, (int) 0));
			}
		}
	}
}
