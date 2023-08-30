
package net.mcreator.elliemoreand.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBase;

import net.mcreator.elliemoreand.creativetab.TabAnotherNukeDays;
import net.mcreator.elliemoreand.ElementsElliemoreAND;

@ElementsElliemoreAND.ModElement.Tag
public class ItemHazmate extends ElementsElliemoreAND.ModElement {
	@GameRegistry.ObjectHolder("anukedays:hazmatehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("anukedays:hazmatebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("anukedays:hazmatelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("anukedays:hazmateboots")
	public static final Item boots = null;
	public ItemHazmate(ElementsElliemoreAND instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("HAZMATE", "anukedays:hazmat._", 0, new int[]{2, 2, 2, 1}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new Modelgazoprotiv().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "anukedays:textures/hazmat_modeltex.png";
			}
		}.setUnlocalizedName("hazmatehelmet").setRegistryName("hazmatehelmet").setCreativeTab(TabAnotherNukeDays.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new Modelgazoprotiv_head().Body;
				armorModel.bipedRightArm = new Modelgazoprotiv_head().RightArm;
				armorModel.bipedLeftArm = new Modelgazoprotiv_head().LeftArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "anukedays:textures/hazmat_modeltex.png";
			}
		}.setUnlocalizedName("hazmatebody").setRegistryName("hazmatebody").setCreativeTab(TabAnotherNukeDays.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("hazmatelegs").setRegistryName("hazmatelegs")
				.setCreativeTab(TabAnotherNukeDays.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("anukedays:hazmatehelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("anukedays:hazmatebody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("anukedays:hazmatelegs", "inventory"));
	}
	public static class Modelgazoprotiv extends ModelBase {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		public Modelgazoprotiv() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 57, 53, -2.0F, -1.4F, -4.6F, 1, 2, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 57, 53, 1.0F, -1.4F, -4.6F, 1, 2, 2, 0.0F, true));
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-2.0834F, 0.3226F, -4.7354F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.2908F, -0.5749F, -0.1307F);
			cube_r1.cubeList.add(new ModelBox(cube_r1, 57, 49, -0.5F, -1.0F, -0.5F, 1, 2, 2, 0.0F, false));
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(2.0834F, 0.3226F, -4.7354F);
			Head.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.2908F, 0.5749F, 0.1307F);
			cube_r2.cubeList.add(new ModelBox(cube_r2, 57, 49, -0.5F, -1.0F, -0.5F, 1, 2, 2, 0.0F, true));
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -1.5F, -4.0F);
			Head.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
			cube_r3.cubeList.add(new ModelBox(cube_r3, 57, 46, -1.0F, 0.0F, -1.6F, 2, 2, 1, 0.0F, false));
			cube_r3.cubeList.add(new ModelBox(cube_r3, 55, 57, -1.0F, -2.0F, -0.6F, 2, 4, 2, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			Head.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

	public static class Modelgazoprotiv_head extends ModelBase {
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		public Modelgazoprotiv_head() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.cubeList.add(new ModelBox(Body, 17, 54, -3.0F, -0.1F, -2.7F, 6, 3, 6, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 15, 50, -2.0F, 2.0F, -2.8F, 1, 4, 0, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 15, 50, 1.0F, 2.0F, 2.8F, 1, 4, 0, 0.0F, true));
			Body.cubeList.add(new ModelBox(Body, 15, 50, -2.0F, 2.0F, 2.8F, 1, 4, 0, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 15, 50, 1.0F, 2.0F, -2.8F, 1, 4, 0, 0.0F, true));
			Body.cubeList.add(new ModelBox(Body, 17, 45, -1.5F, 3.6F, 1.3F, 3, 7, 2, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 17, 42, -0.5F, 3.2F, 1.1F, 1, 1, 2, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 27, 47, -5.0F, -0.2F, -2.4F, 2, 2, 5, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 27, 47, 3.0F, -0.2F, -2.4F, 2, 2, 5, 0.0F, true));
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.cubeList.add(new ModelBox(RightArm, 42, 58, -3.2F, 6.9F, -2.2F, 4, 3, 2, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 42, 55, -3.2F, 4.9F, -2.2F, 4, 1, 2, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 42, 58, -3.2F, 6.9F, 0.2F, 4, 3, 2, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 42, 55, -3.2F, 4.9F, 0.2F, 4, 1, 2, 0.0F, false));
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.cubeList.add(new ModelBox(LeftArm, 42, 58, -0.8F, 6.9F, -2.2F, 4, 3, 2, 0.0F, true));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 42, 55, -0.8F, 4.9F, -2.2F, 4, 1, 2, 0.0F, true));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 42, 58, -0.8F, 6.9F, 0.2F, 4, 3, 2, 0.0F, true));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 42, 55, -0.8F, 4.9F, 0.2F, 4, 1, 2, 0.0F, true));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			Body.render(f5);
			RightArm.render(f5);
			LeftArm.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
