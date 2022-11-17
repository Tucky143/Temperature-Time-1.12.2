package mymod._02_PowerOre;

import mymod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class CustomAxe extends ItemAxe{
	
	public CustomAxe() {
		super(Main.myToolMaterial5, 5f, 5f);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
