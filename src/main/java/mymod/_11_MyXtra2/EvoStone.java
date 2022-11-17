package mymod._11_MyXtra2;

import mymod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockMagma;
import net.minecraft.block.BlockObsidian;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class EvoStone extends Block{
	
public EvoStone(){
		
	super(Material.ROCK);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(4f);
		this.setHarvestLevel("pickaxe", 4);
		this.setLightLevel(1);	

	}

}