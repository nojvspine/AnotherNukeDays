package net.mcreator.elliemoreand.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.elliemoreand.potion.PotionRadi3;
import net.mcreator.elliemoreand.potion.PotionRadi2;
import net.mcreator.elliemoreand.potion.PotionRadi;
import net.mcreator.elliemoreand.item.ItemHazmate;
import net.mcreator.elliemoreand.ElementsElliemoreAND;

import java.util.Collection;

@ElementsElliemoreAND.ModElement.Tag
public class ProcedureRADlow_Itemhandle extends ElementsElliemoreAND.ModElement {
	public ProcedureRADlow_Itemhandle(ElementsElliemoreAND instance) {
		super(instance, 40);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RADlow_Itemhandle!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double who_that_stack = 0;
		double Lucky = 0;
		if ((!(((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemHazmate.body, (int) (1)).getItem()))) {
			Lucky = (double) Math.random();
			if (((Lucky) >= 0.99)) {
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
	}
}
