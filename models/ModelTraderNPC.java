// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelTraderNPC extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer head;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r2;
	private final ModelRenderer leftleg;
	private final ModelRenderer Rightleg;

	public ModelTraderNPC() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, -2.5F);
		bone.setTextureOffset(0, 0).addBox(-9.0F, -46.0F, -3.0F, 18.0F, 34.0F, 12.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -55.0F, 0.125F);
		bone.addChild(head);
		head.setTextureOffset(0, 46).addBox(-7.0F, -4.0F, -2.125F, 14.0F, 13.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(48, 75).addBox(-2.0F, 2.0F, -5.125F, 4.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(72, 57).addBox(-9.0F, -6.0F, -1.125F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(72, 49).addBox(4.0F, -6.0F, -1.125F, 5.0F, 5.0F, 3.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(11.9268F, -37.9459F, 2.5F);
		bone.addChild(LeftArm);
		LeftArm.setTextureOffset(60, 0).addBox(-2.8505F, -1.942F, -2.5F, 6.0F, 20.0F, 6.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.6495F, 1.6381F, 0.5F);
		LeftArm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.0472F);
		cube_r1.setTextureOffset(24, 69).addBox(-1.0F, -7.5F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(-9.9268F, -38.9459F, 2.25F);
		bone.addChild(leftarm);
		leftarm.setTextureOffset(48, 46).addBox(-4.8995F, -1.942F, -2.0F, 6.0F, 21.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.1005F, 1.6381F, -1.0F);
		leftarm.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.0472F);
		cube_r2.setTextureOffset(0, 69).addBox(-5.0F, -7.5F, -1.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(leftleg);
		leftleg.setTextureOffset(66, 26).addBox(0.0F, -16.0F, -1.0F, 6.0F, 16.0F, 7.0F, 0.0F, false);

		Rightleg = new ModelRenderer(this);
		Rightleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg.addChild(Rightleg);
		Rightleg.setTextureOffset(65, 66).addBox(-6.0F, -16.0F, -1.0F, 6.0F, 16.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}