public class Creature {
	
	private String name;
	private String description;
	private int hitPoints;
	private int damage;
	private Room room;
	
	
	public Creature(String name, String description, int hitPoints, int damage) {
		this.name = name;
		this.description = description;
		setHitPoints(hitPoints);
		setDamage(damage);
		this.room = null;	
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getHitPoints() {
		return hitPoints;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public Room getRoom() {
		return room;
	}
	
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void setRoom(Room room) {
		this.room = room;
	}

	public void attack(Creature creature) {
		System.out.println(getName() + " attacks "  + creature.name + ", dealing " + damage + " damage");
	}
			
	public void takeDamage(int damage) {
		if(hitPoints - damage >= 0) {
			hitPoints -= damage; 
		} else {
			 hitPoints = 0;
		}
	}
	

	public boolean isAlive() {
		if(hitPoints > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		String s = String.format("name %15s, description %20s, hitPoints %03d, damage %02d", name, description, hitPoints, damage);
		return s;
	}
	
}
