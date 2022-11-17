package mymod._04_CreateACreature;

import java.util.Random;

import mymod.Main;
import mymod.CodakidFiles.Codakid;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class CustomMob3 extends EntityMob {
	
	public float moveSpeed;
	public float attackDamage;
	public float health;
	
	public static final ResourceLocation LOOT = new ResourceLocation(Main.MODID, "entities/my_mob3");

	public CustomMob3(World worldIn) {
		super(worldIn);
	}
	
	@Override
	public void applyEntityAttributes() {
		
		super.applyEntityAttributes();
		
		this.moveSpeed = 1F;
		this.attackDamage = 0F;
		this.health = 24F;
		
		Codakid.setMovementSpeed(this, this.moveSpeed);
		Codakid.setAttackDamage(this, this.attackDamage);
		Codakid.setMaxHealth(this, this.health);
		
	}
	
	@Override
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAIWander(this, this.moveSpeed));
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 15));
		
		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true, new Class[0]));
	}

	@Override
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
		
	}









