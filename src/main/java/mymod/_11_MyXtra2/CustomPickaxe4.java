package mymod._11_MyXtra2;

import mymod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent.HarvestCheck;

public class CustomPickaxe4 extends ItemPickaxe{
	
	public CustomPickaxe4() {
		super(Main.myMaterialBreaker);
		this.setCreativeTab(CreativeTabs.TOOLS);
		canItemEditBlocks();

}
	}

