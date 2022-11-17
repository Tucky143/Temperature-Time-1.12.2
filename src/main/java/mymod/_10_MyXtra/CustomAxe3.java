package mymod._10_MyXtra;

import mymod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class CustomAxe3 extends ItemAxe{
	
	public CustomAxe3() {
		super(Main.myAxeMaterial, 5f, 5f);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
