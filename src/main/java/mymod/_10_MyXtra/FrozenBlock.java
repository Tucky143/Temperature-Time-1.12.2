package mymod._10_MyXtra;

import mymod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class FrozenBlock extends Block{
	
public FrozenBlock(){
		
		super(Material.ROCK);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(2f);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(5);

	}

}