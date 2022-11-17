package mymod._02_PowerOre;

import mymod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class CustomAxe2 extends ItemAxe{
	
	public CustomAxe2() {
		super(Main.myToolMaterial6, 5f, 5f);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
