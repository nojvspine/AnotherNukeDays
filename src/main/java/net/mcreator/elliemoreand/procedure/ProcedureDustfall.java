package net.mcreator.elliemoreand.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.Entity;

import net.mcreator.elliemoreand.ElliemoreANDVariables;
import net.mcreator.elliemoreand.ElementsElliemoreAND;

@ElementsElliemoreAND.ModElement.Tag
public class ProcedureDustfall extends ElementsElliemoreAND.ModElement {
	public ProcedureDustfall(ElementsElliemoreAND instance) {
		super(instance, 32);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Dustfall!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Dustfall!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Dustfall!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Dustfall!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Dustfall!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double limitary = 0;
		double dust_height = 0;
		double Dusts = 0;
		if ((((ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall) == (true)) && ((entity.dimension) == (0)))) {
			limitary = (double) 2;
			if (((limitary) > 1)) {
				limitary = (double) ((limitary) + 0.33);
				if ((((!(y < 43)) && (y > 55)) && (world.canSeeSky(new BlockPos((int) x, (int) y, (int) z))))) {
					if (((ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall_start) == 0)) {
						for (int index0 = 0; index0 < (int) (10); index0++) {
							if (world instanceof WorldServer)
								((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, x, (y + (dust_height)), z,
										(int) (7 / (limitary)), 5, 1, 5, (Math.random() * 0.8), new int[0]);
							dust_height = (double) ((dust_height) + 1);
						}
					} else if (((ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall_start) == 100)) {
						for (int index1 = 0; index1 < (int) (10); index1++) {
							if (world instanceof WorldServer)
								((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, x, (y + (dust_height)), z,
										(int) (5 / (limitary)), 5, 1, 5, (Math.random() * 0.8), new int[0]);
							dust_height = (double) ((dust_height) + 1);
						}
					} else {
						for (int index2 = 0; index2 < (int) (10); index2++) {
							if (world instanceof WorldServer)
								((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, x, (y + (dust_height)), z,
										(int) (3 / (limitary)), 5, 1, 5, (Math.random() * 0.8), new int[0]);
							dust_height = (double) ((dust_height) + 1);
						}
					}
				}
			} else {
				if ((((!(y < 43)) && (y > 55)) && (world.canSeeSky(new BlockPos((int) x, (int) y, (int) z))))) {
					if (((ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall_start) == 0)) {
						for (int index3 = 0; index3 < (int) (10); index3++) {
							if (world instanceof WorldServer)
								((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, x, (y + (dust_height)), z, (int) 7, 5, 1, 5,
										(Math.random() * 0.8), new int[0]);
							dust_height = (double) ((dust_height) + 1);
						}
					} else if (((ElliemoreANDVariables.MapVariables.get(world).Radioactive_downfall_start) == 100)) {
						for (int index4 = 0; index4 < (int) (10); index4++) {
							if (world instanceof WorldServer)
								((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, x, (y + (dust_height)), z, (int) 5, 5, 1, 5,
										(Math.random() * 0.8), new int[0]);
							dust_height = (double) ((dust_height) + 1);
						}
					} else {
						for (int index5 = 0; index5 < (int) (10); index5++) {
							if (world instanceof WorldServer)
								((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, x, (y + (dust_height)), z, (int) 3, 5, 1, 5,
										(Math.random() * 0.8), new int[0]);
							dust_height = (double) ((dust_height) + 1);
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
