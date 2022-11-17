package mymod._02_PowerOre;

import java.awt.Color;
import java.util.Random;

import mymod.Main;
import mymod.CodakidFiles.Codakid;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class CustomWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		
		Codakid.fullGeneration(world, random, chunkX, chunkZ, 0, 255, 500, Main.myOre, Blocks.RED_SANDSTONE);
		Codakid.fullGeneration(world, random, chunkX, chunkZ, 60, 255, 2, Main.myStructure, Blocks.CONCRETE_POWDER);
		Codakid.fullGeneration(world, random, chunkX, chunkZ, 0, 255, 500, Main.myOre2, Blocks.ICE);
		Codakid.fullGeneration(world, random, chunkX, chunkZ, 60, 255, 2, Main.myStructure2, Blocks.SNOW);
		Codakid.fullGeneration(world, random, chunkX, chunkZ, 3, 4, 100, Main.myBrokenB, Blocks.STONE);
		Codakid.fullGeneration(world, random, chunkX, chunkZ, 0, 255, 3, Main.myOre3, Blocks.ICE, Blocks.RED_SANDSTONE);
	}

}
