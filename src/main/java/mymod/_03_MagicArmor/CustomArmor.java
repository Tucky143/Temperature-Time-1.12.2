package mymod._03_MagicArmor;

import mymod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CustomArmor extends ItemArmor {
	public CustomArmor(int renderIndex, EntityEquipmentSlot armorType){
		super(Main.myArmorMaterial, renderIndex, armorType);
		this.setCreativeTab(CreativeTabs.COMBAT);
	}
	
	@Override
	public void onArmorTick(World worldin, EntityPlayer playerin, ItemStack itemIn) {
	playerin.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 10, 1));
	playerin.addPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 2));
	playerin.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 10, 1));
	playerin.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 3));
	playerin.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 10, 2));
	}
	
	
	
}
