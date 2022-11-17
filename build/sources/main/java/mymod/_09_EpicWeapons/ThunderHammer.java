package mymod._09_EpicWeapons;

import mymod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ThunderHammer extends ItemSword {

	public ThunderHammer() {
		super(Main.myToolMaterial3);
		this.setCreativeTab(CreativeTabs.COMBAT);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldin, EntityPlayer player, EnumHand handin){
		
		
		Vec3d blockHit = player.rayTrace(15, 1.0f).hitVec;
		worldin.spawnEntity(new EntityLightningBolt(worldin, blockHit.x, blockHit.y, blockHit.z, false));
		worldin.spawnEntity(new EntityLightningBolt(worldin, blockHit.x, blockHit.y, blockHit.z, false));
		worldin.spawnEntity(new EntityLightningBolt(worldin, blockHit.x, blockHit.y, blockHit.z, false));
		worldin.spawnEntity(new EntityLightningBolt(worldin, blockHit.x, blockHit.y, blockHit.z, false));
		worldin.spawnEntity(new EntityLightningBolt(worldin, blockHit.x, blockHit.y, blockHit.z, false));
		worldin.createExplosion(player, blockHit.x, blockHit.y, blockHit.z, 3f, false);
		return new ActionResult<ItemStack>(EnumActionResult.PASS, player.getHeldItem(handin));
		
	}
	
}
