import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import org.joda.time.*;

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
		
		//generate the rooms 
		Rooms = new TreeMap<String, Integer>(); 
		for (int i = 0; i < num_rooms; ++i) {
			Rooms.put("Room #" + i, i);
		}
		DateTime now = new DateTime();
		
		System.out.println("Welcome to Meeting Scheduler!");
		
		//pointers to functions ? NOT POSSIBLE
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("Enter command: ");
			String line = cin.next();
			//show, reserve any room, reserve specific room, removed reservation
			if (line.equals("quit")) {
				break;
			} else if (line.equals("show")) {
				for(Entry<String, Integer> entry : Rooms.entrySet()) {
					  String key = entry.getKey();
					  Integer value = entry.getValue();

					  System.out.println(key + " => " + value);
				}
			} else if (line.equals("add")) {
				//add <key> <value>
				String key = cin.next(); String value = cin.next();
				try { 
					Rooms.put(key, Integer.parseInt(value));
				} catch(NumberFormatException nfe) {
					System.out.println("Value must be an integer!");
				}
			} else {
				System.out.println("Unrecognized command!");
			}
			//Rooms.put(line, 5);
			//System.out.println(line);
		}
		
		return;
	}

}
