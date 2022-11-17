package mymod._01_ForgeYourSword;

import mymod.Main;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CustomSword2 extends ItemSword {

	public CustomSword2() {
		super(Main.mySwordMaterial);
	

		
		this.setCreativeTab(CreativeTabs.COMBAT);
		
	}
	}
	