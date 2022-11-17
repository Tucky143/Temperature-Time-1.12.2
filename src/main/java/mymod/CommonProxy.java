package mymod;

import mymod.CodakidFiles.Codakid;
import mymod.CodakidFiles.RenderMonsterBiped;
import mymod.CodakidFiles.RenderMonsterBiped2;
import mymod.CodakidFiles.RenderMonsterPig;
import mymod._01_ForgeYourSword.CustomMonster;
import mymod._01_ForgeYourSword.CustomMonster2;
import mymod._02_PowerOre.CustomWorldGen;
import mymod._04_CreateACreature.CustomMob;
import mymod._04_CreateACreature.CustomMob2;
import mymod._04_CreateACreature.CustomMob3;
import mymod._04_CreateACreature.RenderCustomMob;
import mymod._04_CreateACreature.RenderCustomMob2;
import mymod._04_CreateACreature.RenderCustomMob3;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.awt.Color;

@Mod.EventBusSubscriber(modid="foundations")
public class CommonProxy {
    
    public void preInit(FMLPreInitializationEvent e) {
    	
    	//************* REGISTER BLOCKS AND ITEMS ***************
    	Codakid.registerBlock(Main.evoStone, "my_stone");
    	Codakid.registerBlock(Main.unbreakableB, "unbreakable");
    	Codakid.registerBlock(Main.myBrokenB, "my_broken");
    	Codakid.registerItem(Main.myThermo, "my_thermo");
    	Codakid.registerItem(Main.myIngot3, "my_ingot3");
    	Codakid.registerBlock(Main.myOre3, "my_ore3");
    	Codakid.registerItem(Main.myBow, "my_bow");	
    	Codakid.registerItem(Main.myPickaxe4, "my_pickaxe4");
    	Codakid.registerBlock(Main.luckyBlock, "lucky_block");
    	Codakid.registerItem(Main.myBoots4, "my_boots4");
    	Codakid.registerItem(Main.mySword4, "my_sword4");
    	Codakid.registerItem(Main.myHelmet2, "my_helmet2");
    	Codakid.registerItem(Main.myChestplate2,"my_chestplate2");
    	Codakid.registerItem(Main.myLeggings2, "my_leggings2");
    	Codakid.registerItem(Main.myBoots3, "my_boots3");
    	Codakid.registerBlock(Main.myFrozenBlock, "my_frozenblock");
    	Codakid.registerBlock(Main.mySunBlock, "my_sunblock");
    	Codakid.registerItem(Main.myAxe3, "my_axe3");
    	Codakid.registerItem(Main.myShovel3, "my_shovel3");
    	Codakid.registerItem(Main.mySword3, "my_sword3");
    	Codakid.registerItem(Main.myPickaxe3, "my_pickaxe3");
    	Codakid.registerItem(Main.myIngot2, "my_ingot2");
    	Codakid.registerBlock(Main.myStructure2, "my_structure2");
    	Codakid.registerBlock(Main.myOre2,"my_ore2");
    	Codakid.registerItem(Main.myHoe, "my_hoe");
    	Codakid.registerItem(Main.myHead2, "my_head2");
    	Codakid.registerItem(Main.myChest2,"my_chest2");
    	Codakid.registerItem(Main.myLegs2, "my_legs2");
    	Codakid.registerItem(Main.myBoots2, "my_boots2");
    	Codakid.registerItem(Main.myRod, "my_rod");
    	Codakid.registerItem(Main.mySword2, "my_sword2");
    	Codakid.registerItem(Main.myAxe2, "my_axe2");
    	Codakid.registerItem(Main.myShovel2, "my_shovel2");
    	Codakid.registerItem(Main.myPickaxe2, "my_pickaxe2");
    	Codakid.registerBlock(Main.myStructure, "my_structure");
    	Codakid.registerItem(Main.myAxe, "my_axe");
    	Codakid.registerItem(Main.myShovel, "my_shovel");
    	Codakid.registerItem(Main.cowGun, "cow_gun");
    	Codakid.registerItem(Main.lavaLauncher, "lava_launcher");
    	Codakid.registerItem(Main.mySword, "my_sword");
    	Codakid.registerItem(Main.myPickaxe, "my_pickaxe");
    	Codakid.registerItem(Main.myingot, "my_ingot");
    	Codakid.registerBlock(Main.myOre,"my_ore");
    	Codakid.registerItem(Main.myHelmet, "my_helmet");
    	Codakid.registerItem(Main.myChestplate,"my_chestplate");
    	Codakid.registerItem(Main.myLeggings, "my_leggings");
    	Codakid.registerItem(Main.myBoots, "my_boots");
    	Codakid.registerItem(Main.myHammer, "my_hammer");
	    
    	
    	
    	//************* REGISTER MOBS ***************
    	EntityRegistry.addSpawn(CustomMob.class, 200, 1, 1, EnumCreatureType.MONSTER, Main.myBiome3);
    	Codakid.registerMobEntity(CustomMob2.class, "my_mob2", RenderCustomMob2.FACTORY, 0x0065BC, 0xFB4028);
    	EntityRegistry.addSpawn(CustomMob.class, 200, 1, 1, EnumCreatureType.MONSTER, Main.myBiome3);
    	Codakid.registerMobEntity(CustomMob3.class, "my_mob3", RenderCustomMob3.FACTORY, Color.YELLOW.getRGB(), Color.cyan.getRGB());
    	Codakid.registerMobEntity(CustomMob.class, "my_mob", RenderCustomMob.FACTORY, 0xFFB316, 0xE23900);
    	EntityRegistry.addSpawn(CustomMob.class, 28, 3, 5, EnumCreatureType.MONSTER, Main.myBiome);
    	Codakid.registerMobEntity(CustomMonster.class, "my_monster", RenderMonsterBiped.FACTORY, Color.orange.getRGB(), Color.yellow.getRGB());
    	EntityRegistry.addSpawn(CustomMonster.class, 100, 3, 5, EnumCreatureType.MONSTER, Main.myBiome, Main.myBiome3);
    	Codakid.registerMobEntity(CustomMonster2.class, "my_monster2", RenderMonsterBiped2.FACTORY, Color.cyan.getRGB(), Color.blue.getRGB());
    	EntityRegistry.addSpawn(CustomMonster2.class, 100, 3, 5, EnumCreatureType.MONSTER, Main.myBiome2, Main.myBiome3);
    	
    	
    	// ************* MAKE RENDERERS ***************
    	
    	
        
        //************* REGISTER ENTITIES ***************
    	
    	
        
        //************* REGISTER BIOMES ***************
    	Codakid.registerBiome(Main.myBiome3);
    	Codakid.registerBiome(Main.myBiome2);
    	Codakid.registerBiome(Main.myBiome);
    	
    }

    public void init(FMLInitializationEvent e) {
        
        //************* REGISTER WORLD GEN ***************
    	GameRegistry.registerWorldGenerator(new CustomWorldGen(), 0);
    	GameRegistry.registerWorldGenerator(new CustomWorldGen(), 0);
    	GameRegistry.registerWorldGenerator(new CustomWorldGen(), 0);

        
    	//************* SMELTING RECIPES ***************
    	GameRegistry.addSmelting(Main.myOre, new ItemStack(Main.myingot, 1), 1.0f);
       	GameRegistry.addSmelting(Main.myOre2, new ItemStack(Main.myIngot2, 1), 1.0f);
       	GameRegistry.addSmelting(Main.myOre3, new ItemStack(Main.myIngot3, 1), 2.0f);
    	
    	
    	//************* BIOME SETUP ***************
    	BiomeManager.addBiome(BiomeManager.BiomeType.COOL , new BiomeManager.BiomeEntry(Main.myBiome3, 50));
    	BiomeManager.addBiome(BiomeManager.BiomeType.WARM , new BiomeManager.BiomeEntry(Main.myBiome3, 50));
    	BiomeManager.addSpawnBiome(Main.myBiome3);
    	BiomeManager.addBiome(BiomeManager.BiomeType.ICY , new BiomeManager.BiomeEntry(Main.myBiome2, 55));
    	BiomeManager.addBiome(BiomeManager.BiomeType.COOL , new BiomeManager.BiomeEntry(Main.myBiome2, 50));
    	BiomeManager.addSpawnBiome(Main.myBiome2);
    	BiomeManager.addBiome(BiomeManager.BiomeType.WARM , new BiomeManager.BiomeEntry(Main.myBiome, 50));
    	BiomeManager.addBiome(BiomeManager.BiomeType.DESERT , new BiomeManager.BiomeEntry(Main.myBiome, 55));
    	BiomeManager.addSpawnBiome(Main.myBiome);


    	
    }
    

    public void postInit(FMLPostInitializationEvent e) {
    	
    }
    
    
    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
    	Codakid.doBiomeRegistry(event);
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	Codakid.doBlockRegistry(event);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	Codakid.doItemRegistry(event);
    }

}
