package mymod._09_EpicWeapons;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class CowGun extends Item{
	
	public CowGun() {
		this.setCreativeTab(CreativeTabs.COMBAT);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldin, EntityPlayer player, EnumHand handin){
		
		Random rand= new Random();
		if(!worldin.isRemote){
			for(int number = 0; number < 10; number++) {
				EntityTNTPrimed newTNTPrimed = new EntityTNTPrimed(worldin);
			    newTNTPrimed.setPosition(player.posX, player.posY, player.posZ);
			    newTNTPrimed.motionX = player.getLookVec().x * 8 + rand.nextInt(3) - 1;
			    newTNTPrimed.motionY = player.getLookVec().y * 3 + rand.nextInt(3) - 1;
			    newTNTPrimed.motionZ = player.getLookVec().z * 8 + rand.nextInt(3) - 1;
				worldin.spawnEntity(newTNTPrimed);
			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.PASS, player.getHeldItem(handin));
		
	}

}
