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

public class CustomBoots extends ItemArmor {
	public CustomBoots(int renderIndex, EntityEquipmentSlot armorType){
		super(Main.myBoots4Material, renderIndex, armorType.FEET);
		this.setCreativeTab(CreativeTabs.COMBAT);
	}
	
	@Override
	public void onArmorTick(World worldin, EntityPlayer playerin, ItemStack itemIn) {
	playerin.addPotionEffect(new PotionEffect(MobEffects.SPEED, 4, 2));
	playerin.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 10, 1));
	playerin.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 10, 2));
	playerin.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 10, 2));
	playerin.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 10, 2));
	}
	
	
	
}
