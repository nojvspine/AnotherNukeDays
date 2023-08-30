
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