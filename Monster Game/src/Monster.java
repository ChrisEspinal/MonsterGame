public class Monster extends Creature {
	
	private boolean isEnraged;
	private int enrageThreshold;
	
	public Monster(String name, String description, int hitPoints, int damage, int enrageThreshold) {
		super(name, description, hitPoints, damage);
		this.enrageThreshold = enrageThreshold;
	}

	public void enrage() {
		if(isEnraged != true) {
			setDamage(2 * getDamage());
			isEnraged = true;
		} else {
			isEnraged = false;
		}
		System.out.println(getName() + " has been enraged");
	}
	
	public boolean canEnrage() {
		if(getHitPoints() < enrageThreshold) {
			return true;
		} else {
			return false;
		}
	}
	
}