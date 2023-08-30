
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