package net.mcreator.elliemoreand.procedure;

import net.minecraft.world.World;

import net.mcreator.elliemoreand.ElliemoreANDVariables;
import net.mcreator.elliemoreand.ElementsElliemoreAND;

@ElementsElliemoreAND.ModElement.Tag
public class ProcedureDustcalltest extends ElementsElliemoreAND.ModElement {
	public ProcedureDustcalltest(ElementsElliemoreAND instance) {
		super(instance, 31);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Dustcalltest!");
			return;
		}
		World world = (World) dependencies.get("world");
		ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall_Time = (double) 3590;
		ElliemoreANDVariables.MapVariables.get(world).syncData(world);
	}
}
