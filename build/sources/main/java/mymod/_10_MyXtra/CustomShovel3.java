package mymod._10_MyXtra;

import mymod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class CustomShovel3 extends ItemSpade{
	
	public CustomShovel3() {
		super(Main.myShovelMaterial2);
		this.setCreativeTab(CreativeTabs.TOOLS);
	
	}

}