package mymod._01_ForgeYourSword;

import mymod.Main;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.reflect.internal.Trees.Super;

public class CustomBow extends ItemBow {
	
	public CustomBow() {
		
		super();
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setMaxDamage(0);
		this.getArrowVelocity(5);
		
		
		
	}
	
}