package mymod._02_PowerOre;

import mymod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;

public class CustomThermo extends ItemPickaxe{
	
	public CustomThermo() {
		super(Main.myThermoMaterial);
		this.setCreativeTab(CreativeTabs.TOOLS);
		
	}

}
