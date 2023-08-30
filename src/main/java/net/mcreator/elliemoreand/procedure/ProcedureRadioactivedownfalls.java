package net.mcreator.elliemoreand.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.elliemoreand.ElliemoreANDVariables;
import net.mcreator.elliemoreand.ElementsElliemoreAND;

@ElementsElliemoreAND.ModElement.Tag
public class ProcedureRadioactivedownfalls extends ElementsElliemoreAND.ModElement {
	public ProcedureRadioactivedownfalls(ElementsElliemoreAND instance) {
		super(instance, 29);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Radioactivedownfalls!");
			return;
		}
		World world = (World) dependencies.get("world");
		if (((ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall) == (true))) {
			ElliemoreANDVariables.MapVariables
					.get(world).Radioactive_downfall_Time = (double) ((ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall_Time) + 1);
			ElliemoreANDVariables.MapVariables.get(world).syncData(world);
			if (((ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall_start) > 0)) {
				ElliemoreANDVariables.MapVariables.get(
						world).Radioactive_downfall_start = (double) ((ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall_start) - 1);
				ElliemoreANDVariables.MapVariables.get(world).syncData(world);
			}
			if (((ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall_start) <= 0)) {
				ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall = (boolean) (false);
				ElliemoreANDVariables.MapVariables.get(world).syncData(world);
			}
		} else if (((ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall_Time) > 3600)) {
			ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall = (boolean) (true);
			ElliemoreANDVariables.MapVariables.get(world).syncData(world);
			ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall_start = (double) 100;
			ElliemoreANDVariables.MapVariables.get(world).syncData(world);
			{
				MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
				if (mcserv != null)
					mcserv.getPlayerList().sendMessage(new TextComponentString("radioactive fallout is coming"));
			}
		}
	}

	@SubscribeEvent
	public void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			World world = event.world;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("world", world);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
