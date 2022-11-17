package mymod._06_BrandNewBiomes;

import java.awt.Color;
import java.util.Random;

import javax.swing.text.html.parser.Entity;

import mymod.Main;
import mymod.CodakidFiles.CKWorldGenerater;
import mymod._01_ForgeYourSword.CustomMonster2;
import net.minecraft.block.BlockColored;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenerator;

public class CustomBiome2 extends Biome {
	
	private static BiomeProperties properties = new Biome.BiomeProperties("Frozen land");
	static {
		
	    //Set properties here
		properties.setRainDisabled();
		properties.setTemperature(-10);
		properties.setSnowEnabled();
		properties.setBaseHeight(0.3f);
		properties.setHeightVariation(0.2f);
		properties.setWaterColor(Color.LIGHT_GRAY.getRGB());
		
	}
	
	
	public CustomBiome2() {
		super(properties);
		this.setRegistryName(new ResourceLocation(Main.MODID, "my_biome2"));
		
		this.decorator.treesPerChunk = 100;
		this.decorator.flowersPerChunk = 100;
		
		this.spawnableMonsterList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPolarBear.class, 150, 5, 10));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityStray.class, 150, 12, 20));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityRabbit.class, 150, 15, 20));
		
		this.getSkyColorByTemp(getDefaultTemperature());
	}
	
	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos) {
		super.decorate(worldIn, rand, pos);
		
		WorldGenerator wG;
		wG = new CKWorldGenerater(Blocks.PACKED_ICE.getDefaultState(), 3000);
		wG.generate(worldIn, rand, pos);
		
	}
	
	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunk, int num1, int num2, double num3) {
		
		//Set top and filler blocks here
		int number = rand.nextInt(10) + 1;
		
		if(number < 3) {
			this.topBlock = Blocks.SNOW.getDefaultState();
			this.fillerBlock = Blocks.STONE.getDefaultState();
		}
	
	else {
		this.topBlock = Blocks.SNOW.getDefaultState();
		this.fillerBlock = Blocks.ICE.getDefaultState();
	}
		
		
		this.generateBiomeTerrain(worldIn, rand, chunk, num1, num2, num3);
	}

}
