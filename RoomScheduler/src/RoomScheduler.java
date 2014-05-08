import java.awt.Point;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import org.joda.time.*;

public class RoomScheduler {
	private TreeMap<String, Integer> Rooms;
	private static TreeMap<String, Room> rooms;
	
	//should be a default constructor that makes the rooms, like a controller
	public RoomScheduler() {
		// TODO Auto-generated constructor stub
	}
	
	public RoomScheduler(int numRooms) {
		Rooms = new TreeMap<String, Integer>();
		System.out.println("RoomScheduler with " + numRooms + " rooms created");
		for (int i = 0; i < numRooms; ++i) {
			Rooms.put("Room #" + i, i);
		}
	}
	

	public static void main(String[] args) {
		//args[0] = # of rooms
		int num_rooms = 5;
		if (args.length == 1) {
			num_rooms = Integer.parseInt(args[0]);
		}
		RoomScheduler rs = new RoomScheduler(5);
		
		if (args.length == 1) {
			num_rooms = Integer.parseInt(args[0]);
			System.out.println("Num_rooms: " + num_rooms);
		}
		
		String[] names = {"April's", "Bahamas", "Charley's", "David's", "Eugene's"};
		rooms = new TreeMap<String, Room>();
		for (int i = 0; i < num_rooms; ++i) {
			rooms.put(names[i], new Room(names[i]));
			//rooms.put("room " + i, new Room("room " + i));
			//Rooms.put("Room #" + i, i);
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
				for (Entry<String, Room> entry: rooms.entrySet()) {
					String key = entry.getKey();
					Room r = entry.getValue();
					System.out.println(key + " => " + r.toString());
				}
			} else if (line.equals("add_room")) {
				//add <room_name> <loc_x> <loc_y>
				String room_name = cin.next(); 
				String loc_x = cin.next();
				String loc_y = cin.next();
				try { 
					rooms.put(room_name, new Room(room_name, new Point(Integer.parseInt(loc_x), Integer.parseInt(loc_y))));
				} catch(NumberFormatException nfe) {
					System.out.println("Value must be an integer!");
				}
			} else if (line.equals("add_reservation")) {
				//<room_name> <integer>
				//find room by Name, throw exception if doesnt exist
				String name = cin.next();
				if (!rooms.containsKey(name)) {
					continue;
				}
				String val = cin.next(); 
				try {
					int n = Integer.parseInt(val);
					rooms.get(name).add_reservation(n);
				} catch(NumberFormatException nfe) {
					System.out.println("Value must be an integer!");
				}
				//add an integer
				//throw exception if not possible
			} else {
				System.out.println("Unrecognized command!");
			}
			//Rooms.put(line, 5);
			//System.out.println(line);
		}
		
		return;
	}

}
