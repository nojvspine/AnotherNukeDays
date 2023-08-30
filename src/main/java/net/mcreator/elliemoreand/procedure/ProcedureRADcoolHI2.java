package net.mcreator.elliemoreand.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.elliemoreand.potion.PotionRadihi3;
import net.mcreator.elliemoreand.potion.PotionRadiHi;
import net.mcreator.elliemoreand.potion.PotionRadi2;
import net.mcreator.elliemoreand.ElementsElliemoreAND;

import java.util.Collection;

@ElementsElliemoreAND.ModElement.Tag
public class ProcedureRADcoolHI2 extends ElementsElliemoreAND.ModElement {
	public ProcedureRADcoolHI2(ElementsElliemoreAND instance) {
		super(instance, 24);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RADcoolHI2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double RAD_debuff = 0;
		if ((!(new Object() {
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
		}.check()))) {
			RAD_debuff = (double) Math.random();
			if (((RAD_debuff) >= 0.9)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) 320, (int) 0));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WITHER, (int) 320, (int) 0));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 1200, (int) 0));
			} else if (((RAD_debuff) >= 0.8)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) 320, (int) 0));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 320, (int) 0));
			} else if (((RAD_debuff) >= 0.7)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 600, (int) 0));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HUNGER, (int) 600, (int) 0));
			} else if (((RAD_debuff) >= 0.6)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, (int) 600, (int) 0));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 160, (int) 0));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionRadi2.potion, (int) 1200, (int) 0));
			} else if (((RAD_debuff) >= 0.5)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) 320, (int) 0));
			} else if (((RAD_debuff) >= 0.4)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.GLOWING, (int) 1200, (int) 0));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 600, (int) 0));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 600, (int) 0));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 160, (int) 0));
			} else if (((RAD_debuff) >= 0.3)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WITHER, (int) 320, (int) 0));
			} else if (((RAD_debuff) >= 0.2)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 320, (int) 0));
			} else if (((RAD_debuff) >= 0.1)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HUNGER, (int) 320, (int) 0));
			} else if (((RAD_debuff) >= 0)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 160, (int) 0));
			}
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionRadiHi.potion, (int) 300, (int) 0));
		}
	}
}
