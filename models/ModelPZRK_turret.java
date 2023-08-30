
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