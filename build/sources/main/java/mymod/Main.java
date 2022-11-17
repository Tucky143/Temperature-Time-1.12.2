/*************************************************************
 ****************CODAKID MINECRAFT MODDING********************
 *************************************************************/

package mymod;

import org.apache.logging.log4j.Logger;

import mymod.CodakidFiles.Codakid;
import mymod._02_PowerOre.CustomAxe2;
import mymod._02_PowerOre.CustomHoe;
import mymod._01_ForgeYourSword.CustomBow;
import mymod._01_ForgeYourSword.CustomRod;
import mymod._01_ForgeYourSword.CustomShovel2;
import mymod._01_ForgeYourSword.CustomSword;
import mymod._01_ForgeYourSword.CustomSword2;
import mymod._02_PowerOre.CustomAxe;
import mymod._02_PowerOre.CustomIngot;
import mymod._02_PowerOre.CustomOre;
import mymod._02_PowerOre.CustomPickaxe;
import mymod._02_PowerOre.CustomPickaxe2;
import mymod._02_PowerOre.CustomShovel;
import mymod._02_PowerOre.CustomThermo;
import mymod._03_MagicArmor.CustomArmor;
import mymod._03_MagicArmor.CustomArmor2;
import mymod._03_MagicArmor.CustomArmor3;
import mymod._03_MagicArmor.CustomBoots;
import mymod._05_LuckyBlock.LuckyBlock;
import mymod._06_BrandNewBiomes.CustomBiome;
import mymod._06_BrandNewBiomes.CustomBiome2;
import mymod._06_BrandNewBiomes.CustomBiome3;
import mymod._08_HouseInABox.StructureBlock;
import mymod._09_EpicWeapons.CowGun;
import mymod._09_EpicWeapons.LavaLauncher;
import mymod._09_EpicWeapons.ThunderHammer;
import mymod._10_MyXtra.CustomAxe3;
import mymod._10_MyXtra.CustomIngot2;
import mymod._10_MyXtra.CustomOre2;
import mymod._10_MyXtra.CustomPickaxe3;
import mymod._10_MyXtra.CustomShovel3;
import mymod._10_MyXtra.CustomSword3;
import mymod._10_MyXtra.CustomSword4;
import mymod._10_MyXtra.FrozenBlock;
import mymod._10_MyXtra.StructureBlock2;
import mymod._10_MyXtra.SunBlock;
import mymod._11_MyXtra2.CustomIngot3;
import mymod._11_MyXtra2.CustomOre3;
import mymod._11_MyXtra2.CustomPickaxe4;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, useMetadata = true)
public class Main {
    public static final String MODID = "foundations";
    public static final String MODNAME = "Temperature Time";
    public static final String VERSION = "1.0";
    @SidedProxy(clientSide = "mymod.CodakidFiles.ClientProxy", serverSide = "mymod.CodakidFiles.ServerProxy")
    public static CommonProxy proxy;
    @Mod.Instance
    public static Main instance;
    public static Logger logger;
    
    //************* DECLARE VARIABLES ***************
    public static ToolMaterial myThermoMaterial;
    public static CustomThermo myThermo;
    public static CustomIngot3 myIngot3;
    public static CustomOre3 myOre3;
    public static CustomBow myBow;
    public static ToolMaterial myMaterialBreaker;
    public static CustomPickaxe4 myPickaxe4;
    public static LuckyBlock luckyBlock;
    public static ArmorMaterial myBoots4Material;
    public static CustomBoots myBoots4;
    public static ToolMaterial mySwordMaterial3;
    public static CustomSword4 mySword4;
    public static CustomBiome3 myBiome3;
    public static ArmorMaterial myArmorMaterial3;
    public static CustomArmor3 myChestplate2;
    public static CustomArmor3 myLeggings2;
    public static CustomArmor3 myBoots3;
    public static CustomArmor3 myHelmet2;
    public static SunBlock mySunBlock;
    public static FrozenBlock myFrozenBlock;
    public static ToolMaterial myAxeMaterial;
    public static ToolMaterial myShovelMaterial2;
    public static CustomAxe3 myAxe3;
    public static CustomShovel3 myShovel3;
    public static ToolMaterial myMaterial2;
    public static ToolMaterial mySwordMaterial2;
    public static CustomPickaxe3 myPickaxe3;
    public static CustomSword3 mySword3;
    public static CustomIngot2 myIngot2;
    public static StructureBlock2 myStructure2;
    public static CustomOre2 myOre2;
    public static CustomBiome2 myBiome2;
    public static ToolMaterial myHoeMaterial;
    public static CustomHoe myHoe;
    public static ArmorMaterial myArmorMaterial2;
    public static CustomArmor2 myHead2;
    public static CustomArmor2 myChest2;
    public static CustomArmor2 myLegs2;
    public static CustomArmor2 myBoots2;
    public static CustomRod myRod;
    public static ToolMaterial myToolMaterial6;
    public static ToolMaterial myShovelMaterial;
    public static ToolMaterial mySwordMaterial;
    public static CustomSword2 mySword2;
    public static CustomShovel2 myShovel2;
    public static CustomAxe2 myAxe2;
    public static ToolMaterial myMaterial;
    public static CustomPickaxe2 myPickaxe2;
    public static StructureBlock myStructure;
    public static ToolMaterial myToolMaterial5;
    public static CustomAxe myAxe;
    public static ToolMaterial myToolMaterial4;
    public static CustomShovel myShovel;
    public static CowGun cowGun;
    public static LavaLauncher lavaLauncher;
    public static ToolMaterial myToolMaterial3;
    public static ThunderHammer myHammer;
    public static ArmorMaterial myArmorMaterial;
    public static CustomArmor myChestplate;
    public static CustomArmor myLeggings;
    public static CustomArmor myBoots;
    public static CustomArmor myHelmet;
    public static ToolMaterial myToolMaterial2;
    public static ToolMaterial myToolMaterial;
    public static CustomPickaxe myPickaxe;
    public static CustomOre myOre;
    public static CustomIngot myingot;
    public static CustomBiome myBiome;
    public static CustomSword mySword;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    	
    	//************* INITIALIZE MATERIALS ***************
    	myThermoMaterial = EnumHelper.addToolMaterial("", 60, 90000, 900f, 25f, 30);
    	myShovelMaterial2 = EnumHelper.addToolMaterial("12", 55, 999999, 999f, 13f, 999);
    	myAxeMaterial = EnumHelper.addToolMaterial("21", 55, 999999, 999f, 20f, 999);
    	mySwordMaterial2 = EnumHelper.addToolMaterial("Ice Sword Material", 0, 10000, 0f, 17f, 30);
    	mySwordMaterial3 = EnumHelper.addToolMaterial("Ice Sword Material", 5, 10000, 250f, 22f, 30);
    	myMaterial2 = EnumHelper.addToolMaterial("Ice Pickaxe Material", 5, 500000, 25f, 13f, 30);
    	myHoeMaterial = EnumHelper.addToolMaterial("myHoeMaterial", 0, 99999, 20f, 0f, 999);
    	myArmorMaterial2 = EnumHelper.addArmorMaterial("myArmor", MODID + ":obsidian_armor", 10000, new int[] {5, 11 ,7 ,5}, 999, SoundEvents.BLOCK_STONE_BREAK, 6);
    	myToolMaterial6 = EnumHelper.addToolMaterial("myAxeMaterial", 75, 999999, 12f, 20f, 30);
    	myShovelMaterial = EnumHelper.addToolMaterial("Shovel Material", 5, 10000, 35f, 13f, 30);
    	mySwordMaterial = EnumHelper.addToolMaterial("Sword Material", 0, 10000, 0f, 17f, 30);
    	myMaterial = EnumHelper.addToolMaterial("Obsidian Pickaxe Material", 5, 500000, 25f, 13f, 30);
    	myMaterialBreaker = EnumHelper.addToolMaterial("Obsidian Pickaxe Material", 1999999999, 90000, 25f, 13f, 30);
    	myToolMaterial5 = EnumHelper.addToolMaterial("Sun ingot", 75, 999999, 40f, 14f, 30);
    	myToolMaterial4 = EnumHelper.addToolMaterial("Sun ingot", 100, 999999, 35f, 5f, 30);
    	myArmorMaterial = EnumHelper.addArmorMaterial("Sun ingot", MODID + ":my_armor", 9999999, new int[] {6, 13 ,9 ,5}, 99, SoundEvents.BLOCK_LAVA_POP, 4);
    	myArmorMaterial3 = EnumHelper.addArmorMaterial("Sun ingot", MODID + ":my_armor2", 9999999, new int[] {6, 13 ,9 ,5}, 99, SoundEvents.BLOCK_GLASS_BREAK, 4);
    	myToolMaterial = EnumHelper.addToolMaterial("Sun ingot", 300, 99999999, 44.5f, 13f, 30);
    	myToolMaterial2 = EnumHelper.addToolMaterial("Sun ingot", 0, 9999999, 0F, 14F, 30);
    	myToolMaterial3 = EnumHelper.addToolMaterial("Sun ingot", 0, 99999, 0f, 10f, 30);
    	myBoots4Material = EnumHelper.addArmorMaterial("Sonic", MODID + ":my_boots4", 3000, new int[] {9}, 50, SoundEvents.BLOCK_ANVIL_FALL, 2);
    	
    	
    	//************* INITIALIZE VARIABLES ***************
    	myThermo = new CustomThermo();
    	myIngot3 = new CustomIngot3();
    	myOre3 = new CustomOre3();
    	myBow = new CustomBow();
       	myPickaxe4 = new CustomPickaxe4();
    	luckyBlock = new LuckyBlock();
    	myBoots4 = new CustomBoots(1, EntityEquipmentSlot.FEET);
    	mySword4 = new CustomSword4();
    	myBiome3 = new CustomBiome3();
    	mySunBlock = new SunBlock();
    	myFrozenBlock = new FrozenBlock();
    	myAxe3 = new CustomAxe3();
    	myShovel3 = new CustomShovel3();
    	mySword3 = new CustomSword3();
    	myPickaxe3 = new CustomPickaxe3();
    	myIngot2 = new CustomIngot2();
    	myStructure2 = new StructureBlock2();
    	myOre2 = new CustomOre2();
    	myBiome2 = new CustomBiome2();
    	myHoe = new CustomHoe();
    	myRod = new CustomRod();
    	myAxe2 = new CustomAxe2();
    	myShovel2 = new CustomShovel2();
    	mySword2 = new CustomSword2();
    	myStructure = new StructureBlock();
    	myAxe = new CustomAxe();
    	myShovel = new CustomShovel();
    	cowGun = new CowGun();
    	lavaLauncher = new LavaLauncher();
    	myHammer = new ThunderHammer();
    	myChestplate = new CustomArmor(1, EntityEquipmentSlot.CHEST);
    	myLeggings = new CustomArmor(2, EntityEquipmentSlot.LEGS);
    	myBoots = new CustomArmor(1, EntityEquipmentSlot.FEET);
    	myHelmet = new CustomArmor(1, EntityEquipmentSlot.HEAD);
    	myChestplate2 = new CustomArmor3(1, EntityEquipmentSlot.CHEST);
    	myLeggings2 = new CustomArmor3(2, EntityEquipmentSlot.LEGS);
    	myBoots3 = new CustomArmor3(1, EntityEquipmentSlot.FEET);
    	myHelmet2 = new CustomArmor3(1, EntityEquipmentSlot.HEAD);
    	myPickaxe = new CustomPickaxe();
        myOre = new CustomOre();
    	myingot = new CustomIngot();
    	myBiome = new CustomBiome();
    	mySword = new CustomSword();
    	myPickaxe2 = new CustomPickaxe2();
    	myChest2 = new CustomArmor2(1, EntityEquipmentSlot.CHEST);
    	myLegs2 = new CustomArmor2(2, EntityEquipmentSlot.LEGS);
    	myBoots2 = new CustomArmor2(1, EntityEquipmentSlot.FEET);
    	myHead2 = new CustomArmor2(1, EntityEquipmentSlot.HEAD);
    	
    	
        proxy.preInit(event);
    }
    

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	Codakid.initModels();
    }

}