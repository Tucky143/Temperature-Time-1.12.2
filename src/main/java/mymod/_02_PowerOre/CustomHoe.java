package mymod._02_PowerOre;

import mymod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
public class CustomHoe extends ItemHoe{
	
	public CustomHoe() {
		super(Main.myHoeMaterial);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
