import java.util.Scanner;
import java.util.TreeMap;

public class RoomScheduler {
	private static TreeMap<String, Integer> Rooms;
	private static TreeMap<String, Room> rooms;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Meeting Scheduler!");
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("Enter command: ");
			String line = cin.next();
			//Rooms.put(line, 5);
			System.out.println(line);
		}
	}

}
