package mymod._09_EpicWeapons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class LavaLauncher extends Item{
	
	public LavaLauncher() {
		this.setCreativeTab(CreativeTabs.COMBAT);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldin, EntityPlayer player, EnumHand handin){
		
		if(!worldin.isRemote){
			EntityLavaTrail LavaTrail = new EntityLavaTrail(worldin, player);
			LavaTrail.shoot(player, player.rotationPitch, player.rotationYaw, player.getEyeHeight(), 1.8f, 0);
			worldin.spawnEntity(LavaTrail);
		}
		return new ActionResult<ItemStack>(EnumActionResult.PASS, player.getHeldItem(handin));
		
	}

}
