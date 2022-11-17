package mymod._11_MyXtra2;

import mymod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockMagma;
import net.minecraft.block.BlockObsidian;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class Unbreakable extends Block{
	
public Unbreakable(){
		
	super(Material.ROCK);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(8f);
		this.setHarvestLevel("pickaxe", 4);
		this.setLightLevel(10);	
	}

}