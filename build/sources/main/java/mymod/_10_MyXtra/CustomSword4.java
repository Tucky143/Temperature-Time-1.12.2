package mymod._10_MyXtra;

import java.util.Random;

import mymod.Main;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CustomSword4 extends ItemPickaxe{

	public CustomSword4() {
		super(Main.mySwordMaterial3);
	

		
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.isRepairable();
		this.attackSpeed = 99;
	}
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldin, EntityPlayer player, EnumHand handin){
		Random rand= new Random();
		if(!worldin.isRemote){
			for(int number = 0; number < 1; number++) {
				EntitySnowman newSnowman = new EntitySnowman(worldin);
			    newSnowman.setPosition(player.posX, player.posY, player.posZ);
			    newSnowman.motionX = player.getLookVec().x * 8 + rand.nextInt(3) - 1;
			    newSnowman.motionY = player.getLookVec().y * 3 + rand.nextInt(3) - 1;
			    newSnowman.motionZ = player.getLookVec().z * 8 + rand.nextInt(3) - 1;
				worldin.spawnEntity(newSnowman);
			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.PASS, player.getHeldItem(handin));
		}
}
	