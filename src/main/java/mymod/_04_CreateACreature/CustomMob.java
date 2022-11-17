package mymod._04_CreateACreature;

import java.util.Random;

import mymod.Main;
import mymod.CodakidFiles.Codakid;
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

public class CustomMob extends EntityMob {
	
	public float moveSpeed;
	public float attackDamage;
	public float health;
	
	public static final ResourceLocation LOOT = new ResourceLocation(Main.MODID, "entities/my_mob");

	public CustomMob(World worldIn) {
		super(worldIn);
	}
	
	@Override
	public void applyEntityAttributes() {
		
		super.applyEntityAttributes();
		
		this.moveSpeed = 0.4F;
		this.attackDamage = 12F;
		this.health = 120F;
		
		Codakid.setMovementSpeed(this, this.moveSpeed);
		Codakid.setAttackDamage(this, this.attackDamage);
		Codakid.setMaxHealth(this, this.health);
		
	}
	
	@Override
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAIWander(this, this.moveSpeed));
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 15));
		this.tasks.addTask(3, new EntityAIAttackMelee(this, 0.6, false));
		this.tasks.addTask(4, new EntityAIFireballAttack(this));
		
		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true, new Class[0]));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityCreeper.class, true));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityZombie.class, true));
		this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, true));
	}

	@Override
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
	
	static class EntityAIFireballAttack extends EntityAIBase{
		private final CustomMob attacker;
		
		public EntityAIFireballAttack(CustomMob attacker) {
			this.attacker = attacker;
		}

		@Override
		public boolean shouldExecute() {
			EntityLivingBase target = this.attacker.getAttackTarget();
			if(target == null){
				return false;
			}
			else if(!target.isEntityAlive()){
				return false;
			}
			else {
				return true;
			}
		}
		
		@Override
		public void updateTask() {
			EntityLivingBase target = this.attacker.getAttackTarget();
			this.attacker.getLookHelper().setLookPositionWithEntity(target, 40, 10);
			
			Random rand = new Random();
			double randomness = 0.2;
			
			  double xMove = target.posX - this.attacker.posX + rand.nextGaussian()*randomness;
			double yMove = (target.posY + target.getEyeHeight()) - (this.attacker.posY + this.attacker.getEyeHeight()) + rand.nextGaussian()*randomness;
			  double zMove = target.posZ - this.attacker.posZ + rand.nextGaussian()*randomness;
			EntitySmallFireball fireball = new EntitySmallFireball(this.attacker.world, this.attacker, xMove, yMove, zMove);
			fireball.posY = this.attacker.posY + this.attacker.getEyeHeight();
			this.attacker.world.spawnEntity(fireball);
		}
		
	}

}









