package mymod._04_CreateACreature;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelBlaze - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class myMob extends ModelBase {
    public ModelRenderer blazeSticks6;
    public ModelRenderer blazeSticks5;
    public ModelRenderer blazeSticks8;
    public ModelRenderer blazeHead;
    public ModelRenderer blazeSticks11;
    public ModelRenderer blazeSticks2;
    public ModelRenderer blazeSticks3;
    public ModelRenderer blazeSticks5_1;
    public ModelRenderer blazeSticks5_2;
    public ModelRenderer blazeSticks1;
    public ModelRenderer blazeSticks1_1;
    public ModelRenderer blazeSticks1_2;

    public myMob() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.blazeSticks1_2 = new ModelRenderer(this, 19, 20);
        this.blazeSticks1_2.setRotationPoint(0.9F, 0.0F, -2.2F);
        this.blazeSticks1_2.addBox(0.0F, -15.0F, 0.0F, 2, 10, 2, 0.0F);
        this.blazeSticks6 = new ModelRenderer(this, 56, 21);
        this.blazeSticks6.setRotationPoint(-1.49F, 1.2F, 6.84F);
        this.blazeSticks6.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.blazeSticks3 = new ModelRenderer(this, 24, 0);
        this.blazeSticks3.setRotationPoint(-3.74F, -1.46F, 8.18F);
        this.blazeSticks3.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
        this.blazeSticks8 = new ModelRenderer(this, 42, 1);
        this.blazeSticks8.setRotationPoint(-5.6F, 1.06F, -4.2F);
        this.blazeSticks8.addBox(0.0F, 0.0F, 0.0F, 2, 11, 3, 0.0F);
        this.blazeSticks5_1 = new ModelRenderer(this, 35, 16);
        this.blazeSticks5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.blazeSticks5_1.addBox(0.0F, -3.0F, -9.0F, 2, 13, 3, 0.0F);
        this.blazeHead = new ModelRenderer(this, 0, 0);
        this.blazeHead.setRotationPoint(0.0F, -6.7F, 0.0F);
        this.blazeHead.addBox(-4.0F, -5.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(blazeHead, 0.0F, 0.0F, 0.03490658503988659F);
        this.blazeSticks1_1 = new ModelRenderer(this, 27, 21);
        this.blazeSticks1_1.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.blazeSticks1_1.addBox(0.0F, -16.0F, -2.0F, 2, 9, 2, 0.0F);
        this.blazeSticks5_2 = new ModelRenderer(this, 35, 16);
        this.blazeSticks5_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.blazeSticks5_2.addBox(0.0F, 0.0F, 14.0F, 2, 13, 3, 0.0F);
        this.blazeSticks11 = new ModelRenderer(this, 56, 6);
        this.blazeSticks11.setRotationPoint(-3.92F, 11.35F, 3.11F);
        this.blazeSticks11.addBox(0.0F, 0.0F, 0.0F, 2, 12, 2, 0.0F);
        this.blazeSticks2 = new ModelRenderer(this, 35, 16);
        this.blazeSticks2.setRotationPoint(4.86F, -1.12F, 7.57F);
        this.blazeSticks2.addBox(0.0F, 0.0F, 0.0F, 2, 13, 3, 0.0F);
        this.blazeSticks5 = new ModelRenderer(this, 0, 16);
        this.blazeSticks5.setRotationPoint(4.95F, 1.58F, 4.95F);
        this.blazeSticks5.addBox(0.0F, 0.0F, 0.0F, 2, 12, 2, 0.0F);
        this.blazeSticks1 = new ModelRenderer(this, 33, 1);
        this.blazeSticks1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.blazeSticks1.addBox(0.0F, -16.0F, 0.0F, 2, 9, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.blazeSticks1_2.render(f5);
        this.blazeSticks6.render(f5);
        this.blazeSticks3.render(f5);
        this.blazeSticks8.render(f5);
        this.blazeSticks5_1.render(f5);
        this.blazeHead.render(f5);
        this.blazeSticks1_1.render(f5);
        this.blazeSticks5_2.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.blazeSticks11.offsetX, this.blazeSticks11.offsetY, this.blazeSticks11.offsetZ);
        GlStateManager.translate(this.blazeSticks11.rotationPointX * f5, this.blazeSticks11.rotationPointY * f5, this.blazeSticks11.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.9D, 1.0D);
        GlStateManager.translate(-this.blazeSticks11.offsetX, -this.blazeSticks11.offsetY, -this.blazeSticks11.offsetZ);
        GlStateManager.translate(-this.blazeSticks11.rotationPointX * f5, -this.blazeSticks11.rotationPointY * f5, -this.blazeSticks11.rotationPointZ * f5);
        this.blazeSticks11.render(f5);
        GlStateManager.popMatrix();
        this.blazeSticks2.render(f5);
        this.blazeSticks5.render(f5);
        this.blazeSticks1.render(f5);
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