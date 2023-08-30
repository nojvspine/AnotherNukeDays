
package net.mcreator.elliemoreand.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.elliemoreand.item.ItemRustyclay;
import net.mcreator.elliemoreand.ElementsElliemoreAND;

@ElementsElliemoreAND.ModElement.Tag
public class OreDictClay extends ElementsElliemoreAND.ModElement {
	public OreDictClay(ElementsElliemoreAND instance) {
		super(instance, 39);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("clay", new ItemStack(ItemRustyclay.block, (int) (1)));
	}
}
