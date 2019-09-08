public class Player extends Creature {

	private int healAmount;
	
	public Player(String name, String description, int hitPoints, int damage, int healAmount) {
		super(name, description, hitPoints, damage);
		this.healAmount = healAmount;
	}
	
	public void heal() {
		setHitPoints(getHitPoints() + healAmount);
		System.out.println(getName() + " is healed by " + healAmount);
	}
	
}