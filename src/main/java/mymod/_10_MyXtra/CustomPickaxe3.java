package mymod._10_MyXtra;

import mymod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe3 extends ItemPickaxe{
	
	public CustomPickaxe3() {
		super(Main.myMaterial2);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
