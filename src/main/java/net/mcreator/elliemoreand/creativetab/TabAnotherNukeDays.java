
package net.mcreator.elliemoreand.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.elliemoreand.item.ItemCautionSign;
import net.mcreator.elliemoreand.ElementsElliemoreAND;

@ElementsElliemoreAND.ModElement.Tag
public class TabAnotherNukeDays extends ElementsElliemoreAND.ModElement {
	public TabAnotherNukeDays(ElementsElliemoreAND instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabanothernukedays") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCautionSign.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
