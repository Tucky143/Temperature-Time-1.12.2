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

public class CustomArmor2 extends ItemArmor {
	public CustomArmor2(int renderIndex, EntityEquipmentSlot armorType){
		super(Main.myArmorMaterial2, renderIndex, armorType);
		this.setCreativeTab(CreativeTabs.COMBAT);
	}
	
	@Override
	public void onArmorTick(World worldin, EntityPlayer playerin, ItemStack itemIn) {
		if(this.armorType == EntityEquipmentSlot.CHEST) {
			playerin.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 10, 1));
			playerin.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 10, 1));
			playerin.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 10, 5));
		}
	}
}
