package mymod._04_CreateACreature;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelEnderman - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class myMob2 extends ModelBase {
    public ModelRenderer shape8;
    public ModelRenderer shape8_1;
    public ModelRenderer shape8_2;
    public ModelRenderer shape8_3;
    public ModelRenderer shape8_4;
    public ModelRenderer shape8_5;
    public ModelRenderer shape8_6;
    public ModelRenderer shape8_7;
    public ModelRenderer shape13;

    public myMob2() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape8 = new ModelRenderer(this, 0, 9);
        this.shape8.setRotationPoint(6.8F, -4.0F, -7.5F);
        this.shape8.addBox(2.0F, -15.1F, 0.0F, 12, 21, 2, 0.0F);
        this.setRotateAngle(shape8, 0.0F, -1.5707963267948966F, -0.006283185307179587F);
        this.shape13 = new ModelRenderer(this, 30, 0);
        this.shape13.setRotationPoint(0.8F, 19.1F, -0.7F);
        this.shape13.addBox(-7.0F, -1.0F, -3.0F, 10, 5, 8, 0.0F);
        this.shape8_2 = new ModelRenderer(this, 28, 13);
        this.shape8_2.setRotationPoint(-7.9F, 12.7F, 5.6F);
        this.shape8_2.addBox(0.0F, -11.0F, 0.0F, 11, 17, 2, 0.0F);
        this.setRotateAngle(shape8_2, 0.0F, 1.5707963267948966F, 0.0F);
        this.shape8_7 = new ModelRenderer(this, 0, 9);
        this.shape8_7.setRotationPoint(-7.0F, -3.8F, -7.6F);
        this.shape8_7.addBox(2.0F, -15.0F, 0.0F, 12, 21, 2, 0.0F);
        this.setRotateAngle(shape8_7, 0.0F, -1.5707963267948966F, 0.0F);
        this.shape8_5 = new ModelRenderer(this, 0, 9);
        this.shape8_5.setRotationPoint(-9.0F, -3.8F, -7.5F);
        this.shape8_5.addBox(2.0F, -15.0F, 0.0F, 12, 21, 2, 0.0F);
        this.shape8_3 = new ModelRenderer(this, 28, 13);
        this.shape8_3.setRotationPoint(5.1F, 12.9F, -5.6F);
        this.shape8_3.addBox(0.0F, -11.0F, 0.0F, 11, 17, 2, 0.0F);
        this.setRotateAngle(shape8_3, 0.0F, -1.5707963267948966F, -0.006283185307179587F);
        this.shape8_4 = new ModelRenderer(this, 28, 13);
        this.shape8_4.setRotationPoint(-4.6F, 12.9F, -5.7F);
        this.shape8_4.addBox(-2.0F, -11.0F, 0.0F, 11, 17, 2, 0.0F);
        this.shape8_1 = new ModelRenderer(this, 28, 13);
        this.shape8_1.setRotationPoint(-6.1F, 12.9F, 4.1F);
        this.shape8_1.addBox(0.0F, -11.0F, 0.0F, 11, 17, 2, 0.0F);
        this.shape8_6 = new ModelRenderer(this, 0, 9);
        this.shape8_6.setRotationPoint(-7.4F, -3.9F, 5.8F);
        this.shape8_6.addBox(0.0F, -15.0F, 0.0F, 12, 21, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape8.render(f5);
        this.shape13.render(f5);
        this.shape8_2.render(f5);
        this.shape8_7.render(f5);
        this.shape8_5.render(f5);
        this.shape8_3.render(f5);
        this.shape8_4.render(f5);
        this.shape8_1.render(f5);
        this.shape8_6.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
