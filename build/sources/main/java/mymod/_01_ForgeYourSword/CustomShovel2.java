package mymod._01_ForgeYourSword;

import mymod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class CustomShovel2 extends ItemSpade{
	
	public CustomShovel2() {
		super(Main.myShovelMaterial);
		this.setCreativeTab(CreativeTabs.TOOLS);
	
	}

}