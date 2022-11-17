package mymod._05_LuckyBlock;

import java.util.Random;

import mymod.Main;
import mymod.CodakidFiles.Codakid;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityMinecartChest;
import net.minecraft.entity.item.EntityMinecartMobSpawner;
import net.minecraft.entity.item.EntityMinecartTNT;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityIllusionIllager;
import net.minecraft.entity.monster.EntitySpellcasterIllager;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.event.LootTableLoadEvent;

public class LuckyBlock extends Block {
	
	public LuckyBlock() {
		super(Material.ROCK);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	
	
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state)
	{
		
		Random rand = new Random();
		
		int number = rand.nextInt(75) + 1;
		System.out.println(number);
		
		 if(number <= 60)
		{
			Codakid.spawnItem(world, pos, Items.TIPPED_ARROW, 10);
		}
		
		
		 if(number <= 40)
		{
			for(int i = 0; i <3; i++)
			{
				Codakid.spawnEntity(world, pos, new EntityIllusionIllager(world));
			}
		}
		else if(number <= 23)
		{
			Codakid.spawnBlock(world, pos, Blocks.IRON_BLOCK, 2);
		}
		else if(number <= 74)
		{
			world.setBlockState(pos, Blocks.LAVA.getDefaultState());
		}
		
		else if(number <= 75)
		{
			Codakid.spawnBlock(world, pos, Main.luckyBlock, 5);
		}

		}
		
		
	}


