package mymod.CodakidFiles;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraftforge.fml.relauncher.SideOnly;
import mymod.Main;
import mymod._01_ForgeYourSword.CustomMonster2;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMonsterBiped2 extends RenderLiving {

	private static final ResourceLocation bipedTexture = new ResourceLocation(
			Main.MODID, "mobs/biped_texture2.png");
	
	public static final Factory FACTORY = new Factory();
	
	public RenderMonsterBiped2(RenderManager renderManager) {
		super(renderManager, new BossModelBiped(), 0.5f);
	}
	

	public void func_177_a(CustomMonster2 entity, double d, double d1, double d2,
			float f, float f1) {
		super.doRender(entity, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityLiving entityliving, double d, double d1,
			double d2, float f, float f1) {
		func_177_a((CustomMonster2) entityliving, d, d1, d2, f, f1);
	}

	public void doRender(Entity entity, double d, double d1, double d2,
			float f, float f1) {
		func_177_a((CustomMonster2) entity, d, d1, d2, f, f1);
	}

	protected ResourceLocation func_110872_a(CustomMonster2 par1Entity) {
		return bipedTexture;
	}

	protected ResourceLocation getEntityTexture(Entity var1) {
		return func_110872_a((CustomMonster2) var1);
	}
	
	public static class Factory implements IRenderFactory<CustomMonster2> {

        @Override
        public Render<? super CustomMonster2> createRenderFor(RenderManager manager) {
            return new RenderMonsterBiped2(manager);
        }

    }
	
}