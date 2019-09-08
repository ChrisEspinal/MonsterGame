public class Room {

	private int roomIndex;
	private String description;
	private Monster monster;

	public Room(int roomIndex, String description, Monster monster) {
		this.roomIndex = roomIndex;
		this.description = description;
		this.monster = monster;
	}
		
	public boolean isComplete() {
		if(!monster.isAlive()) {
			return true;
		} else {
			return false;
		}
	}

	public void enter(Player player) {
		System.out.println(player.getName() + " enters room " + (roomIndex + 1));
		System.out.println("This Room is " + description + ", and has monster " + monster);
		if(monster.isAlive()) {
			Battle b1 = new Battle(player, monster);
			b1.run();
			
		} else {
			System.out.println(monster.getName() + " is dead");
			isComplete();
		}

	}
	
	@Override
	public String toString() {
		String s = String.format("Room index %2d, description %20s, monster name %20s", roomIndex, description, monster);
		return s;
	}
	


}
