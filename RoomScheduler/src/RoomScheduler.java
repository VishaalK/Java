import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class RoomScheduler {
	private static TreeMap<String, Integer> Rooms;
	private static TreeMap<String, Room> rooms;
	
	public static void main(String[] args) {
		//args[0] = # of rooms
		
		//if args[0] > 0, put in generated room names, else default to 5 rooms
		int num_rooms = new Integer(5);
		if (args.length == 1) {
			num_rooms = Integer.parseInt(args[0]);
			System.out.println("Num_rooms: " + num_rooms);
		}
		
		Rooms = new TreeMap<String, Integer>(); 
		
		System.out.println("Welcome to Meeting Scheduler!");
		
		//pointers to functions ?
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("Enter command: ");
			String line = cin.next();
			if (line.equals("quit")) {
				break;
			}
			Rooms.put(line, 5);
			System.out.println(line);
			
		}
		for(Entry<String, Integer> entry : Rooms.entrySet()) {
			  String key = entry.getKey();
			  Integer value = entry.getValue();

			  System.out.println(key + " => " + value);
		}
		return;
	}

}
