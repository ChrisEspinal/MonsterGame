public class TreasureRoom extends Room {
	
	int roomIndex;
	String description;
	Monster monster;
	String treasure;
	
	public TreasureRoom(int roomIndex, String description, Monster monster, String treasure) {
		super(roomIndex, description, monster);
		this.treasure = treasure; 
	}

	@Override
	public void enter(Player player) {
		System.out.println(player.getName() + " enters room " + roomIndex);
		System.out.println("This Room is " + description + ", and has monster " + monster);
		if(monster.isAlive()) {
			Battle b1 = new Battle(player, monster);
			b1.run();
			if(player.isAlive()) {
				System.out.println("You explored the room and found the hidden treasure!");
			}
		} else {
			isComplete();
		}

	}
		}
	
	

