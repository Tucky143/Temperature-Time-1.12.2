package mymod._06_BrandNewBiomes;

import java.awt.Color;
import java.util.Random;

import mymod.Main;
import mymod.CodakidFiles.CKWorldGenerater;
import net.minecraft.block.BlockColored;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenerator;

public class CustomBiome extends Biome {
	
	private static BiomeProperties properties = new Biome.BiomeProperties("Sunny land");
	static {
		
	    //Set properties here
		properties.setBaseHeight(0.3f);
		properties.setHeightVariation(0.2f);
		properties.setWaterColor(Color.CYAN.getRGB());
		
	}
	
	
	public CustomBiome() {
		super(properties);
		this.setRegistryName(new ResourceLocation(Main.MODID, "my_biome"));
		
		this.decorator.treesPerChunk = 10000;
		this.decorator.bigMushroomsPerChunk = 10000;
		
		this.spawnableMonsterList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 150, 5, 10));
		
	}
	
	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos) {
		super.decorate(worldIn, rand, pos);
		
		WorldGenerator wG;
		wG = new CKWorldGenerater(Blocks.MAGMA.getDefaultState(), 3000);
		wG.generate(worldIn, rand, pos);
		
	}
	
	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunk, int num1, int num2, double num3) {
		
		//Set top and filler blocks here
		int number = rand.nextInt(10) + 1;
		
		if(number < 5) {
			this.topBlock = Blocks.CONCRETE_POWDER.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE);
			this.fillerBlock = Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED);
		}
		else {
			this.topBlock = Blocks.CONCRETE_POWDER.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW);
			this.fillerBlock = Blocks.RED_SANDSTONE.getDefaultState();
		}
		
		
		this.generateBiomeTerrain(worldIn, rand, chunk, num1, num2, num3);
	}

}
