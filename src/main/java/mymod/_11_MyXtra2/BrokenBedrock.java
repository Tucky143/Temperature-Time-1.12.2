package mymod._11_MyXtra2;

import mymod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockMagma;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BrokenBedrock extends Block{
	
public BrokenBedrock(){
		
	super(Material.ROCK);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(2f);
		this.setHarvestLevel("pickaxe", 4);
		this.setLightLevel(1);	

	}

}