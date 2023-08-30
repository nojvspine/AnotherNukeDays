
package net.mcreator.elliemoreand.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.Minecraft;

import net.mcreator.elliemoreand.ElementsElliemoreAND;

import java.util.Iterator;
import java.util.ArrayList;

@ElementsElliemoreAND.ModElement.Tag
public class EntityPatriotturret extends ElementsElliemoreAND.ModElement {
	public static final int ENTITYID = 1;
	public static final int ENTITYID_RANGED = 2;
	public EntityPatriotturret(ElementsElliemoreAND instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		elements.entities
				.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("anukedays", "patriotturret"), ENTITYID)
						.name("patriotturret").tracker(64, 3, true).egg(-6711040, -16750951).build());
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityArrowCustom.class)
				.id(new ResourceLocation("anukedays", "entitybulletpatriotturret"), ENTITYID_RANGED).name("entitybulletpatriotturret")
				.tracker(64, 1, true).build());
	}

	private Biome[] allbiomes(net.minecraft.util.registry.RegistryNamespaced<ResourceLocation, Biome> in) {
		Iterator<Biome> itr = in.iterator();
		ArrayList<Biome> ls = new ArrayList<Biome>();
		while (itr.hasNext())
			ls.add(itr.next());
		return ls.toArray(new Biome[ls.size()]);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new ModelPZRK_turret(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("anukedays:textures/patriot_tex.png");
				}
			};
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityArrowCustom.class, renderManager -> {
			return new RenderSnowball<EntityArrowCustom>(renderManager, null, Minecraft.getMinecraft().getRenderItem()) {
				public ItemStack getStackToRender(EntityArrowCustom entity) {
					return new ItemStack(Items.ARROW, (int) (1));
				}
			};
		});
	}
	public static class EntityCustom extends EntityCreature implements IRangedAttackMob {
		public EntityCustom(World world) {
			super(world);
			setSize(0.6f, 1.8f);
			experienceValue = 5;
			this.isImmuneToFire = false;
			setNoAI(!true);
			enablePersistence();
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityMob.class, false, false));
			this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
			this.tasks.addTask(3, new EntityAILookIdle(this));
			this.tasks.addTask(4, new EntityAISwimming(this));
			this.tasks.addTask(1, new EntityAIAttackRanged(this, 1.25D, 20, 10.0F));
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEFINED;
		}

		@Override
		protected boolean canDespawn() {
			return false;
		}

		@Override
		protected Item getDropItem() {
			return null;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source.getImmediateSource() instanceof EntityPotion)
				return false;
			if (source == DamageSource.FALL)
				return false;
			if (source == DamageSource.CACTUS)
				return false;
			if (source == DamageSource.DROWN)
				return false;
			if (source == DamageSource.LIGHTNING_BOLT)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(4D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(25D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6D);
		}

		@Override
		public void setSwingingArms(boolean swingingArms) {
		}

		public void attackEntityWithRangedAttack(EntityLivingBase target, float flval) {
			EntityArrowCustom entityarrow = new EntityArrowCustom(this.world, this);
			double d0 = target.posY + (double) target.getEyeHeight() - 1.1;
			double d1 = target.posX - this.posX;
			double d3 = target.posZ - this.posZ;
			entityarrow.shoot(d1, d0 - entityarrow.posY + (double) MathHelper.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 1.6F, 12.0F);
			this.world.spawnEntity(entityarrow);
		}
	}

	public static class EntityArrowCustom extends EntityTippedArrow {
		public EntityArrowCustom(World a) {
			super(a);
		}

		public EntityArrowCustom(World worldIn, double x, double y, double z) {
			super(worldIn, x, y, z);
		}

		public EntityArrowCustom(World worldIn, EntityLivingBase shooter) {
			super(worldIn, shooter);
		}
	}

	public static class ModelPZRK_turret extends ModelBase {
		private final ModelRenderer head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer body;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		public ModelPZRK_turret() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 24.0F, 0.0F);
			head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -17.0F, -6.0F, 3, 3, 12, 0.0F, false));
			head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -13.5F, -6.0F, 3, 3, 12, 0.0F, false));
			head.cubeList.add(new ModelBox(head, 0, 0, 0.5F, -13.5F, -6.0F, 3, 3, 12, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 0, 0, 0.5F, -17.0F, -6.0F, 3, 3, 12, 0.0F, true));
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(1.0F, -19.5F, 3.5F);
			head.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
			cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 15, 1.6F, -3.5F, 1.5F, 1, 7, 1, 0.0F, true));
			cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 15, -4.6F, -3.5F, 1.5F, 1, 7, 1, 0.0F, false));
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(4.1F, -17.1145F, 5.0197F);
			head.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.2132F, -0.0469F, -0.2132F);
			cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 15, -0.3F, -2.5F, -2.5F, 1, 5, 5, 0.0F, true));
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-4.1F, -17.1145F, 5.0197F);
			head.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.2132F, 0.0469F, 0.2132F);
			cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 15, -0.7F, -2.5F, -2.5F, 1, 5, 5, 0.0F, false));
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, -16.0F, -1.0F, 1, 7, 2, 0.0F, false));
			body.cubeList.add(new ModelBox(body, 47, 10, -1.0F, -9.0F, -1.0F, 2, 8, 2, 0.0F, false));
			body.cubeList.add(new ModelBox(body, 32, 0, -4.0F, -2.0F, -4.0F, 8, 2, 8, 0.0F, false));
			body.cubeList.add(new ModelBox(body, 32, 0, -4.0F, -8.9F, -4.0F, 8, 2, 8, 0.0F, false));
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, -5.0F, -2.0F);
			body.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
			cube_r4.cubeList.add(new ModelBox(cube_r4, 55, 10, -1.0F, -3.0F, -3.0F, 2, 10, 2, 0.0F, true));
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, -5.0F, 2.0F);
			body.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.4363F, 0.0F, 0.0F);
			cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 10, -1.0F, -3.0F, 1.0F, 2, 10, 2, 0.0F, true));
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-2.0F, -5.0F, 0.0F);
			body.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, 0.4363F);
			cube_r6.cubeList.add(new ModelBox(cube_r6, 55, 10, -3.0F, -3.0F, -1.0F, 2, 10, 2, 0.0F, true));
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(2.0F, -5.0F, 0.0F);
			body.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -0.4363F);
			cube_r7.cubeList.add(new ModelBox(cube_r7, 55, 10, 1.0F, -3.0F, -1.0F, 2, 10, 2, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			head.render(f5);
			body.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
