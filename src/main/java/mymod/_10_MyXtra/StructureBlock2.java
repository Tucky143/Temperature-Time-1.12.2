package mymod._10_MyXtra;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StructureBlock2 extends Block{
		IBlockState G = Blocks.LAPIS_BLOCK.getDefaultState();
		IBlockState S = Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN);;
		IBlockState P = Blocks.BREWING_STAND.getDefaultState();
		IBlockState O = Blocks.OBSIDIAN.getDefaultState();
		IBlockState D = Blocks.DIAMOND_BLOCK.getDefaultState();
		IBlockState L = Blocks.COAL_BLOCK.getDefaultState();
		IBlockState A = null;
		IBlockState M = Blocks.REDSTONE_TORCH.getDefaultState();
		
		ArrayList<IBlockState[][]> blueprint = new ArrayList();
		
		public StructureBlock2() {
			super(Material.GLASS);
			this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
			
			blueprint.add(new IBlockState[][]{
					{A, A, A, A, A, A},
					{A, O, O, O, O, O},
					{A, O, O, O, O, O},
					{A, O, O, O, O, O},
					{A, O, O, O, O, O},
					{A, O, O, O, O, O}
			});
			
			blueprint.add(new IBlockState[][]{
					{A, A, A, A, A, A},
					{A, G, G, G, G, G},
					{A, G, A, M, A, G},
					{A, G, M, P, M, G},
					{A, G, A, M, A, G},
					{A, G, G, A, G, G}
			});
			
			blueprint.add(new IBlockState[][]{
					{A, A, A, A, A, A},
					{A, S, S, S, S, S},
					{A, S, A, A, A, S},
					{A, S, A, A, A, S},
					{A, S, A, A, A, S},
					{A, S, S, A, S, S}
			});
			
			blueprint.add(new IBlockState[][]{
				
					{L, L, L, L, L, L ,L},
					{L, L, L, L, L, L ,L},
					{L, L, L, L, L, L ,L},
					{L, L, L, D, L, L ,L},
					{L, L, L, L, L, L ,L},
					{L, L, L, L, L, L ,L},
					{L, L, L, L, L, L ,L}
			});
			
		}
		@Override
		public void onBlockAdded(World World, BlockPos pos, IBlockState state){
			for(int y = 0; y < blueprint.size(); y ++){
				for(int x = 0; x < blueprint.get(y).length; x++){
					for(int z = 0; z <blueprint.get(y)[x].length; z++) {
						if(blueprint.get(y)[x][z] != null){
					    	World.setBlockState(pos.add(-x,y,z), blueprint.get(y)[x][z]);
						}
					}
				}
		     }
			
		  }
		}


