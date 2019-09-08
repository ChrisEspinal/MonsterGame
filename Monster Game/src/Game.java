import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Game {
	
	private Player player;
	private Room[] dungeon = null;
	
	public Game() {
		PrintWriter outStream = null;
		try {
			outStream = new PrintWriter("PlayerInfo.txt");
			outStream.println("Link");
			outStream.println("a powerful warrior");
			outStream.println("75");
			outStream.println("15");
			outStream.println("20");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			if(outStream != null){
				outStream.close(); 
			}
		}
		
		Scanner inputStream = null;
		try {
			
			File playerinfo = new File("PlayerInfo.txt");
			inputStream = new Scanner(playerinfo);
			String name = inputStream.nextLine();
			String description = inputStream.nextLine();
			int hitPoints = inputStream.nextInt();
			int damage = inputStream.nextInt();
			int healAmount = inputStream.nextInt();
			player = new Player(name, description, hitPoints, damage, healAmount);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			if(inputStream != null){
				inputStream.close();
			}
		}
	
		
		dungeon = new Room [3];
		Monster monster1 = new Monster("Orc", "covered with green blood", 20, 5, 0);
		Room room1 = new Room(0, "a room with an unbearable smell", monster1);
		Monster monster2 = new Monster("Skeleton", "funny how it moves", 40, 10, 10);
		Room room2 = new Room(1, "dark and cold", monster2);
		Monster monster3 = new Monster("Fire dragon", "spout fire with each breath", 100, 20, 40);
		Room room3 = new Room(2, "a giant hall with something shiny on the other end", monster3);
		dungeon[0] = room1;
		dungeon[1] = room2;
		dungeon[2] = room3;
	}
	
	public void play() {
		for(int i = 0; i < dungeon.length; i++) {
			if(dungeon[i] != null) {
				dungeon[i].enter(player);
			}
		}
		if(player.isAlive()) {
		System.out.println("You explored the room and found the hidden treasure!");
		}else {
			System.out.println(player.getName()+ " is dead");
		}
		}

	
	public static void main(String[] args) {
		Game g1 = new Game();
		g1.play();
	}

}

