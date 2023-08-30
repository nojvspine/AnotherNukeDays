package net.mcreator.elliemoreand.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.elliemoreand.ElliemoreANDVariables;
import net.mcreator.elliemoreand.ElementsElliemoreAND;

@ElementsElliemoreAND.ModElement.Tag
public class ProcedureDustcallsaystest extends ElementsElliemoreAND.ModElement {
	public ProcedureDustcallsaystest(ElementsElliemoreAND instance) {
		super(instance, 33);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Dustcallsaystest!");
			return;
		}
		World world = (World) dependencies.get("world");
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString(
						(new java.text.DecimalFormat("##.##").format((ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall_Time)))));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u041A\u043E\u0440\u043E\u0447\u0435"));
		}
	}
}
